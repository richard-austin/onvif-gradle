package de.onvif.soap;

import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPFactory;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.wsaddressing.W3CEndpointReference;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.oasis_open.docs.wsn.b_2.Renew;
import org.oasis_open.docs.wsn.b_2.RenewResponse;
import org.oasis_open.docs.wsn.b_2.Unsubscribe;
import org.oasis_open.docs.wsn.b_2.UnsubscribeResponse;
import org.oasis_open.docs.wsn.bw_2.*;
import org.oasis_open.docs.wsrf.rw_2.ResourceUnknownFault;
import org.onvif.ver10.events.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PullPointSubscriptionHandler {
    private final Logger LOG = LoggerFactory.getLogger(PullPointSubscriptionHandler.class);
    private final EventPortType eventWs;
    private final ExecutorService pullMessagesExecutor;
    private final List<Header> headers;
    private final OnvifDevice device;
    private PullPointSubscription pullPointSubscription;
    private SubscriptionManager subscriptionManager;
    private final CreatePullPointSubscription cpps;
    PullMessages pm = null;
    Renew renew = null;
    PullMessagesCallbacks callback;
    SOAPElement messageIDEl;
    boolean terminate = false;
    private final int MAX_RETRIES = 3;

    public PullPointSubscriptionHandler(final OnvifDevice device, CreatePullPointSubscription cpps, PullMessagesCallbacks callback) {
        eventWs = device.getEvents();
        this.device = device;
        this.cpps = cpps;
        headers = new ArrayList<>();
        pullMessagesExecutor = Executors.newSingleThreadExecutor();
        this.callback = callback;
    }

    boolean initialPullMessagesDone = false;
    int errorCountdown = MAX_RETRIES;

    public void subcribe() {
        init(false);
    }

    public void getSupportedEvents() {
        init(true);
    }

    private void init(boolean getSupportedEvents) {
        final String addressingNS = "http://www.w3.org/2005/08/addressing";
        initialPullMessagesDone = false;
        try {
            CreatePullPointSubscriptionResponse resp =
                    eventWs.createPullPointSubscription(cpps);

            final String serviceAddress = getWSAAddress(resp.getSubscriptionReference());
            pullPointSubscription = device.getServiceProxy((BindingProvider) device.eventService.getEventPort(), serviceAddress).create(PullPointSubscription.class);
            subscriptionManager = device.getServiceProxy((BindingProvider) device.eventService.getEventPort(), serviceAddress).create(SubscriptionManager.class);

            final Client pullPointSubscriptionProxy = ClientProxy.getClient(pullPointSubscription);
            final Client subscriptionManagerProxy = ClientProxy.getClient(subscriptionManager);


            pm = new PullMessages();
            pm.setMessageLimit(1024);
            Duration dur = DatatypeFactory.newInstance().newDuration("PT1M");
            pm.setTimeout(dur);
            renew = new Renew();
            renew.setTerminationTime(dur.toString());
            var action = new QName(addressingNS, "Action");
            SOAPElement actionEl = SOAPFactory.newInstance().createElement(action);
            actionEl.setTextContent("http://www.onvif.org/ver10/events/wsdl/PullPointSubscription/PullMessagesRequest");
            var mustUnderstand = new QName("http://www.w3.org/2003/05/soap-envelope", "mustUnderstand");
            actionEl.addAttribute(mustUnderstand, "1");

            var to = new QName(addressingNS, "To");
            SOAPElement toEl = SOAPFactory.newInstance().createElement(to);
            toEl.addAttribute(mustUnderstand, "1");
            toEl.setTextContent(serviceAddress);

            var replyTo = new QName(addressingNS, "ReplyTo");
            SOAPElement replyToEl = SOAPFactory.newInstance().createElement(replyTo);
            replyToEl.addChildElement(new QName(addressingNS, "Address"));
            replyToEl.getFirstChild().setTextContent("http://www.w3.org/2005/08/addressing/anonymous");

            var messageID = new QName(addressingNS, "MessageID");
            messageIDEl = SOAPFactory.newInstance().createElement(messageID);
            // The remainder of the messageID header setup is set up at the start of the  startPullMessages function so
            //  that a unique messageID is created for each call.

            var actionHdr = new Header(action, actionEl);
            var messageIdHdr = new Header(messageID, messageIDEl);
            var toHdr = new Header(to, toEl);
            var replyToHdr = new Header(replyTo, replyToEl);
            
            headers.clear();
            headers.add(actionHdr);
            headers.add(messageIdHdr);
            headers.add(toHdr);
            headers.add(replyToHdr);

            pullPointSubscriptionProxy.getRequestContext().put(Header.HEADER_LIST, headers);
            subscriptionManagerProxy.getRequestContext().put(Header.HEADER_LIST, headers);

            startPullMessages(getSupportedEvents);

            // Block until finished if getSupportedEvents is set
            if(getSupportedEvents) {
                synchronized (this) {
                    this.wait(100000);
                }
            }
            errorCountdown = MAX_RETRIES;  // Reset on no errors

        } catch (DatatypeConfigurationException | SOAPException | UnsupportedPolicyRequestFault |
                 TopicExpressionDialectUnknownFault | TopicNotSupportedFault | ResourceUnknownFault |
                 UnrecognizedPolicyRequestFault | NotifyMessageNotSupportedFault | SubscribeCreationFailedFault |
                 UnacceptableInitialTerminationTimeFault | InvalidProducerPropertiesExpressionFault |
                 InvalidTopicExpressionFault | InvalidMessageContentExpressionFault |
                 InvalidFilterFault | WebServiceException e) {
            LOG.error("{}: {}", e.getClass().getName(), e.getMessage());
            try {
                // If on get supported events only, then terminate after MAX_RETRIES errors
                // If on continuous event subscription, always restart after error
                // Always terminate if terminate == true
                if(!terminate && (!getSupportedEvents || --errorCountdown > 0)) {
                    Thread.sleep(3000);
                    init(getSupportedEvents); // On failure, tru again after delay
                }
            }
            catch (InterruptedException ignored) {}
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    int numberOfEvents = -1;
    void startPullMessages(final boolean getSupportedEvents) {
        // This picks up the initial states of the topics and stops once all those initial states have been gathered
        this.pullMessagesExecutor.execute(() -> {
            boolean restart = false;
            try {
                if(initialPullMessagesDone) {
                    // Update the message ID for the renew call
                    messageIDEl.setTextContent("urn:uuid:" + UUID.randomUUID());
                    renew(renew);
                }

                // Update the message ID for the pullMessages call
                messageIDEl.setTextContent("urn:uuid:" + UUID.randomUUID());
                PullMessagesResponse response = pullMessages(pm);
                initialPullMessagesDone = true;
                var nm = response.getNotificationMessage();
                if (nm != null && !nm.isEmpty())
                    callback.onPullMessagesReceived(response);

                if(nm != null) {
                    if (getSupportedEvents && nm.size() < numberOfEvents) {
                        // Number of events received is less than previous, which means it's the last lot
                        terminate = true;
                        synchronized (this) {
                            this.notify();
                        }
                    }
                    else
                        numberOfEvents = nm.size();
                }
                else
                    terminate = true;

                if(terminate) {
                    unsubscribe(new Unsubscribe());
                    pullMessagesExecutor.shutdown();
                }
            } catch (Exception e) {
                LOG.error(e.getMessage(), e);
                if(!terminate) {
                    try {
                        // This will most likely fail but try it anyway
                        unsubscribe(new Unsubscribe());
                    } catch (Exception ignore) {}
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ignored) {}
                    // On error restart from the beginning
                    restart=true;
                }
            } finally {
                if(!terminate) {
                    if(restart)
                        init(getSupportedEvents);
                    else
                        startPullMessages(getSupportedEvents);
                }
            }
        });
    }

    // PullPointSubscription functions
    public SeekResponse seek(Seek parameters) {
        return pullPointSubscription.seek(parameters);
    }

    public void setSynchronizationPoint() {
        pullPointSubscription.setSynchronizationPoint();
    }

    public UnsubscribeResponse unsubscribe(Unsubscribe unsubscribeRequest) throws UnableToDestroySubscriptionFault, ResourceUnknownFault {
        return pullPointSubscription.unsubscribe(unsubscribeRequest);
    }

    public PullMessagesResponse pullMessages(PullMessages parameters) throws PullMessagesFaultResponse_Exception {
        return pullPointSubscription.pullMessages(parameters);
    }

    // SubscriptionManager functions
    public RenewResponse renew(Renew renewRequest) throws UnacceptableTerminationTimeFault, ResourceUnknownFault {
        return subscriptionManager.renew(renewRequest);
    }

    public void setTerminate() {
        terminate = true;
    }

    // Get the address in string form from the W3CEndpointReference
    private static String getWSAAddress(W3CEndpointReference ref) {
        Element element = DOMUtils.createDocument().createElement("elem");
        ref.writeTo(new DOMResult(element));
        NodeList nl = element.getElementsByTagNameNS("http://www.w3.org/2005/08/addressing", "Address");
        if (nl.getLength() > 0) {
            Element e = (Element) nl.item(0);
            return DOMUtils.getContent(e).trim();
        }
        return null;
    }
}

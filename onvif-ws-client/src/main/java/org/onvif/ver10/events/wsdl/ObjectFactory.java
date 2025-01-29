
package org.onvif.ver10.events.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.events.wsdl package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/events/wsdl", "Capabilities");
    private static final QName _ChangedOnly_QNAME = new QName("http://www.onvif.org/ver10/events/wsdl", "ChangedOnly");
    private static final QName _CreatePullPointSubscriptionInitialTerminationTime_QNAME = new QName("http://www.onvif.org/ver10/events/wsdl", "InitialTerminationTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.events.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePullPointSubscription }
     * 
     * @return
     *     the new instance of {@link CreatePullPointSubscription }
     */
    public CreatePullPointSubscription createCreatePullPointSubscription() {
        return new CreatePullPointSubscription();
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     * 
     * @return
     *     the new instance of {@link GetServiceCapabilities }
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse }
     * 
     * @return
     *     the new instance of {@link GetServiceCapabilitiesResponse }
     */
    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     * @return
     *     the new instance of {@link Capabilities }
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link CreatePullPointSubscription.SubscriptionPolicy }
     * 
     * @return
     *     the new instance of {@link CreatePullPointSubscription.SubscriptionPolicy }
     */
    public CreatePullPointSubscription.SubscriptionPolicy createCreatePullPointSubscriptionSubscriptionPolicy() {
        return new CreatePullPointSubscription.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link CreatePullPointSubscriptionResponse }
     * 
     * @return
     *     the new instance of {@link CreatePullPointSubscriptionResponse }
     */
    public CreatePullPointSubscriptionResponse createCreatePullPointSubscriptionResponse() {
        return new CreatePullPointSubscriptionResponse();
    }

    /**
     * Create an instance of {@link PullMessages }
     * 
     * @return
     *     the new instance of {@link PullMessages }
     */
    public PullMessages createPullMessages() {
        return new PullMessages();
    }

    /**
     * Create an instance of {@link PullMessagesResponse }
     * 
     * @return
     *     the new instance of {@link PullMessagesResponse }
     */
    public PullMessagesResponse createPullMessagesResponse() {
        return new PullMessagesResponse();
    }

    /**
     * Create an instance of {@link PullMessagesFaultResponse }
     * 
     * @return
     *     the new instance of {@link PullMessagesFaultResponse }
     */
    public PullMessagesFaultResponse createPullMessagesFaultResponse() {
        return new PullMessagesFaultResponse();
    }

    /**
     * Create an instance of {@link Seek }
     * 
     * @return
     *     the new instance of {@link Seek }
     */
    public Seek createSeek() {
        return new Seek();
    }

    /**
     * Create an instance of {@link SeekResponse }
     * 
     * @return
     *     the new instance of {@link SeekResponse }
     */
    public SeekResponse createSeekResponse() {
        return new SeekResponse();
    }

    /**
     * Create an instance of {@link SetSynchronizationPoint }
     * 
     * @return
     *     the new instance of {@link SetSynchronizationPoint }
     */
    public SetSynchronizationPoint createSetSynchronizationPoint() {
        return new SetSynchronizationPoint();
    }

    /**
     * Create an instance of {@link SetSynchronizationPointResponse }
     * 
     * @return
     *     the new instance of {@link SetSynchronizationPointResponse }
     */
    public SetSynchronizationPointResponse createSetSynchronizationPointResponse() {
        return new SetSynchronizationPointResponse();
    }

    /**
     * Create an instance of {@link GetEventProperties }
     * 
     * @return
     *     the new instance of {@link GetEventProperties }
     */
    public GetEventProperties createGetEventProperties() {
        return new GetEventProperties();
    }

    /**
     * Create an instance of {@link GetEventPropertiesResponse }
     * 
     * @return
     *     the new instance of {@link GetEventPropertiesResponse }
     */
    public GetEventPropertiesResponse createGetEventPropertiesResponse() {
        return new GetEventPropertiesResponse();
    }

    /**
     * Create an instance of {@link AddEventBroker }
     * 
     * @return
     *     the new instance of {@link AddEventBroker }
     */
    public AddEventBroker createAddEventBroker() {
        return new AddEventBroker();
    }

    /**
     * Create an instance of {@link EventBrokerConfig }
     * 
     * @return
     *     the new instance of {@link EventBrokerConfig }
     */
    public EventBrokerConfig createEventBrokerConfig() {
        return new EventBrokerConfig();
    }

    /**
     * Create an instance of {@link AddEventBrokerResponse }
     * 
     * @return
     *     the new instance of {@link AddEventBrokerResponse }
     */
    public AddEventBrokerResponse createAddEventBrokerResponse() {
        return new AddEventBrokerResponse();
    }

    /**
     * Create an instance of {@link DeleteEventBroker }
     * 
     * @return
     *     the new instance of {@link DeleteEventBroker }
     */
    public DeleteEventBroker createDeleteEventBroker() {
        return new DeleteEventBroker();
    }

    /**
     * Create an instance of {@link DeleteEventBrokerResponse }
     * 
     * @return
     *     the new instance of {@link DeleteEventBrokerResponse }
     */
    public DeleteEventBrokerResponse createDeleteEventBrokerResponse() {
        return new DeleteEventBrokerResponse();
    }

    /**
     * Create an instance of {@link GetEventBrokers }
     * 
     * @return
     *     the new instance of {@link GetEventBrokers }
     */
    public GetEventBrokers createGetEventBrokers() {
        return new GetEventBrokers();
    }

    /**
     * Create an instance of {@link GetEventBrokersResponse }
     * 
     * @return
     *     the new instance of {@link GetEventBrokersResponse }
     */
    public GetEventBrokersResponse createGetEventBrokersResponse() {
        return new GetEventBrokersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "ChangedOnly")
    public JAXBElement<Object> createChangedOnly(Object value) {
        return new JAXBElement<>(_ChangedOnly_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "InitialTerminationTime", scope = CreatePullPointSubscription.class)
    public JAXBElement<String> createCreatePullPointSubscriptionInitialTerminationTime(String value) {
        return new JAXBElement<>(_CreatePullPointSubscriptionInitialTerminationTime_QNAME, String.class, CreatePullPointSubscription.class, value);
    }

}

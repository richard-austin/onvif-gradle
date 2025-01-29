
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.oasis_open.docs.wsn.b_2.FilterType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EventBrokerConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EventBrokerConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Address" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="TopicPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         <element name="PublishFilter" type="{http://docs.oasis-open.org/wsn/b-2}FilterType" minOccurs="0"/>
 *         <element name="QoS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CertPathValidationPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MetadataFilter" type="{http://docs.oasis-open.org/wsn/b-2}FilterType" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventBrokerConfig", propOrder = {
    "address",
    "topicPrefix",
    "userName",
    "password",
    "certificateID",
    "publishFilter",
    "qoS",
    "status",
    "certPathValidationPolicyID",
    "metadataFilter",
    "any"
})
public class EventBrokerConfig {

    /**
     * Event broker address in the format "scheme://host:port[/resource]". The supported schemes shall be returned by the EventBrokerProtocols capability. The resource part of the URL is only valid when using websocket. The Address must be unique.
     * 
     */
    @XmlElement(name = "Address", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String address;
    /**
     * Prefix that will be prepended to all topics before they are published. This is used to make published topics unique for each device. TopicPrefix is not allowed to be empty.
     * 
     */
    @XmlElement(name = "TopicPrefix", required = true)
    protected String topicPrefix;
    /**
     * User name for the event broker.
     * 
     */
    @XmlElement(name = "UserName")
    protected String userName;
    /**
     * Password for the event broker. Password shall not be included when returned with GetEventBrokers.
     * 
     */
    @XmlElement(name = "Password")
    protected String password;
    /**
     * Optional certificate ID in the key store pointing to a client certificate to be used for authenticating the device at the message broker.
     * 
     */
    @XmlElement(name = "CertificateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;
    /**
     * Concrete Topic Expression to select specific event topics to publish.
     * 
     */
    @XmlElement(name = "PublishFilter")
    protected FilterType publishFilter;
    /**
     * Quality of service level to use when publishing. This defines the guarantee of delivery for a specific message: 0 = At most once, 1 = At least once, 2 = Exactly once.
     * 
     */
    @XmlElement(name = "QoS")
    protected Integer qoS;
    /**
     * Current connection status (see tev:ConnectionStatus for possible values).
     * 
     */
    @XmlElement(name = "Status")
    protected String status;
    /**
     * The ID of the certification path validation policy used to validate the broker certificate. In case encryption is used but no validation policy is specified, the device shall not validate the broker certificate.
     * 
     */
    @XmlElement(name = "CertPathValidationPolicyID")
    protected String certPathValidationPolicyID;
    /**
     * Concrete Topic Expression to select specific metadata topics to publish.
     * 
     */
    @XmlElement(name = "MetadataFilter")
    protected FilterType metadataFilter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Event broker address in the format "scheme://host:port[/resource]". The supported schemes shall be returned by the EventBrokerProtocols capability. The resource part of the URL is only valid when using websocket. The Address must be unique.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddress()
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Prefix that will be prepended to all topics before they are published. This is used to make published topics unique for each device. TopicPrefix is not allowed to be empty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicPrefix() {
        return topicPrefix;
    }

    /**
     * Sets the value of the topicPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTopicPrefix()
     */
    public void setTopicPrefix(String value) {
        this.topicPrefix = value;
    }

    /**
     * User name for the event broker.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUserName()
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Password for the event broker. Password shall not be included when returned with GetEventBrokers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassword()
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Optional certificate ID in the key store pointing to a client certificate to be used for authenticating the device at the message broker.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateID() {
        return certificateID;
    }

    /**
     * Sets the value of the certificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCertificateID()
     */
    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    /**
     * Concrete Topic Expression to select specific event topics to publish.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getPublishFilter() {
        return publishFilter;
    }

    /**
     * Sets the value of the publishFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     * @see #getPublishFilter()
     */
    public void setPublishFilter(FilterType value) {
        this.publishFilter = value;
    }

    /**
     * Quality of service level to use when publishing. This defines the guarantee of delivery for a specific message: 0 = At most once, 1 = At least once, 2 = Exactly once.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQoS() {
        return qoS;
    }

    /**
     * Sets the value of the qoS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getQoS()
     */
    public void setQoS(Integer value) {
        this.qoS = value;
    }

    /**
     * Current connection status (see tev:ConnectionStatus for possible values).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * The ID of the certification path validation policy used to validate the broker certificate. In case encryption is used but no validation policy is specified, the device shall not validate the broker certificate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertPathValidationPolicyID() {
        return certPathValidationPolicyID;
    }

    /**
     * Sets the value of the certPathValidationPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCertPathValidationPolicyID()
     */
    public void setCertPathValidationPolicyID(String value) {
        this.certPathValidationPolicyID = value;
    }

    /**
     * Concrete Topic Expression to select specific metadata topics to publish.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getMetadataFilter() {
        return metadataFilter;
    }

    /**
     * Sets the value of the metadataFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     * @see #getMetadataFilter()
     */
    public void setMetadataFilter(FilterType value) {
        this.metadataFilter = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}

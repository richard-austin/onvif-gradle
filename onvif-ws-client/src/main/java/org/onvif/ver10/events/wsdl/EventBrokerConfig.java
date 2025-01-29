
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.oasis_open.docs.wsn.b_2.FilterType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EventBrokerConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventBrokerConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="TopicPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PublishFilter" type="{http://docs.oasis-open.org/wsn/b-2}FilterType" minOccurs="0"/&gt;
 *         &lt;element name="QoS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertPathValidationPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MetadataFilter" type="{http://docs.oasis-open.org/wsn/b-2}FilterType" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

    @XmlElement(name = "Address", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(name = "TopicPrefix", required = true)
    protected String topicPrefix;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "CertificateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;
    @XmlElement(name = "PublishFilter")
    protected FilterType publishFilter;
    @XmlElement(name = "QoS")
    protected Integer qoS;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "CertPathValidationPolicyID")
    protected String certPathValidationPolicyID;
    @XmlElement(name = "MetadataFilter")
    protected FilterType metadataFilter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the address property.
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
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the topicPrefix property.
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
     */
    public void setTopicPrefix(String value) {
        this.topicPrefix = value;
    }

    /**
     * Gets the value of the userName property.
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
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
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
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the certificateID property.
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
     */
    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    /**
     * Gets the value of the publishFilter property.
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
     */
    public void setPublishFilter(FilterType value) {
        this.publishFilter = value;
    }

    /**
     * Gets the value of the qoS property.
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
     */
    public void setQoS(Integer value) {
        this.qoS = value;
    }

    /**
     * Gets the value of the status property.
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
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the certPathValidationPolicyID property.
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
     */
    public void setCertPathValidationPolicyID(String value) {
        this.certPathValidationPolicyID = value;
    }

    /**
     * Gets the value of the metadataFilter property.
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
     */
    public void setMetadataFilter(FilterType value) {
        this.metadataFilter = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
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

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}


package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPAddressFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IPAddressFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}IPAddressFilterType"/>
 *         <element name="IPv4Address" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IPv6Address" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}IPAddressFilterExtension" minOccurs="0"/>
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
@XmlType(name = "IPAddressFilter", propOrder = {
    "type",
    "iPv4Address",
    "iPv6Address",
    "extension"
})
public class IPAddressFilter {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected IPAddressFilterType type;
    @XmlElement(name = "IPv4Address")
    protected List<PrefixedIPv4Address> iPv4Address;
    @XmlElement(name = "IPv6Address")
    protected List<PrefixedIPv6Address> iPv6Address;
    @XmlElement(name = "Extension")
    protected IPAddressFilterExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddressFilterType }
     *     
     */
    public IPAddressFilterType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddressFilterType }
     *     
     */
    public void setType(IPAddressFilterType value) {
        this.type = value;
    }

    /**
     * Gets the value of the iPv4Address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iPv4Address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIPv4Address().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv4Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the iPv4Address property.
     */
    public List<PrefixedIPv4Address> getIPv4Address() {
        if (iPv4Address == null) {
            iPv4Address = new ArrayList<>();
        }
        return this.iPv4Address;
    }

    /**
     * Gets the value of the iPv6Address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iPv6Address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIPv6Address().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the iPv6Address property.
     */
    public List<PrefixedIPv6Address> getIPv6Address() {
        if (iPv6Address == null) {
            iPv6Address = new ArrayList<>();
        }
        return this.iPv6Address;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddressFilterExtension }
     *     
     */
    public IPAddressFilterExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddressFilterExtension }
     *     
     */
    public void setExtension(IPAddressFilterExtension value) {
        this.extension = value;
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

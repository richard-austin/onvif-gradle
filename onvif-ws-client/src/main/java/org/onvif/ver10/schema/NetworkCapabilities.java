
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetworkCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IPFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ZeroConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IPVersion6" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DynDNS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkCapabilitiesExtension" minOccurs="0"/>
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
@XmlType(name = "NetworkCapabilities", propOrder = {
    "ipFilter",
    "zeroConfiguration",
    "ipVersion6",
    "dynDNS",
    "extension"
})
public class NetworkCapabilities {

    /**
     * Indicates whether or not IP filtering is supported.
     * 
     */
    @XmlElement(name = "IPFilter")
    protected Boolean ipFilter;
    /**
     * Indicates whether or not zeroconf is supported.
     * 
     */
    @XmlElement(name = "ZeroConfiguration")
    protected Boolean zeroConfiguration;
    /**
     * Indicates whether or not IPv6 is supported.
     * 
     */
    @XmlElement(name = "IPVersion6")
    protected Boolean ipVersion6;
    /**
     * Indicates whether or not is supported.
     * 
     */
    @XmlElement(name = "DynDNS")
    protected Boolean dynDNS;
    @XmlElement(name = "Extension")
    protected NetworkCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates whether or not IP filtering is supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPFilter() {
        return ipFilter;
    }

    /**
     * Sets the value of the ipFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIPFilter()
     */
    public void setIPFilter(Boolean value) {
        this.ipFilter = value;
    }

    /**
     * Indicates whether or not zeroconf is supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroConfiguration() {
        return zeroConfiguration;
    }

    /**
     * Sets the value of the zeroConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isZeroConfiguration()
     */
    public void setZeroConfiguration(Boolean value) {
        this.zeroConfiguration = value;
    }

    /**
     * Indicates whether or not IPv6 is supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIPVersion6() {
        return ipVersion6;
    }

    /**
     * Sets the value of the ipVersion6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIPVersion6()
     */
    public void setIPVersion6(Boolean value) {
        this.ipVersion6 = value;
    }

    /**
     * Indicates whether or not is supported.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynDNS() {
        return dynDNS;
    }

    /**
     * Sets the value of the dynDNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDynDNS()
     */
    public void setDynDNS(Boolean value) {
        this.dynDNS = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCapabilitiesExtension }
     *     
     */
    public NetworkCapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCapabilitiesExtension }
     *     
     */
    public void setExtension(NetworkCapabilitiesExtension value) {
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

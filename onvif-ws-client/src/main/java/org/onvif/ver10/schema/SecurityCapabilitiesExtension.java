
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityCapabilitiesExtension complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SecurityCapabilitiesExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TLS1.0" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}SecurityCapabilitiesExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilitiesExtension", propOrder = {
    "tls10",
    "extension"
})
public class SecurityCapabilitiesExtension {

    @XmlElement(name = "TLS1.0")
    protected boolean tls10;
    @XmlElement(name = "Extension")
    protected SecurityCapabilitiesExtension2 extension;

    /**
     * Gets the value of the tls10 property.
     * 
     */
    public boolean isTLS10() {
        return tls10;
    }

    /**
     * Sets the value of the tls10 property.
     * 
     */
    public void setTLS10(boolean value) {
        this.tls10 = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilitiesExtension2 }
     *     
     */
    public SecurityCapabilitiesExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilitiesExtension2 }
     *     
     */
    public void setExtension(SecurityCapabilitiesExtension2 value) {
        this.extension = value;
    }

}


package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DynamicDNSInformation;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DynamicDNSInformation" type="{http://www.onvif.org/ver10/schema}DynamicDNSInformation"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dynamicDNSInformation"
})
@XmlRootElement(name = "GetDynamicDNSResponse")
public class GetDynamicDNSResponse {

    /**
     * Dynamic DNS information.
     * 
     */
    @XmlElement(name = "DynamicDNSInformation", required = true)
    protected DynamicDNSInformation dynamicDNSInformation;

    /**
     * Dynamic DNS information.
     * 
     * @return
     *     possible object is
     *     {@link DynamicDNSInformation }
     *     
     */
    public DynamicDNSInformation getDynamicDNSInformation() {
        return dynamicDNSInformation;
    }

    /**
     * Sets the value of the dynamicDNSInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicDNSInformation }
     *     
     * @see #getDynamicDNSInformation()
     */
    public void setDynamicDNSInformation(DynamicDNSInformation value) {
        this.dynamicDNSInformation = value;
    }

}

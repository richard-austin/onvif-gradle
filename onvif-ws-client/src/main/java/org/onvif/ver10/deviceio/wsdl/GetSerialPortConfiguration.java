
package org.onvif.ver10.deviceio.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="SerialPortToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
    "serialPortToken"
})
@XmlRootElement(name = "GetSerialPortConfiguration")
public class GetSerialPortConfiguration {

    @XmlElement(name = "SerialPortToken", required = true)
    protected String serialPortToken;

    /**
     * Gets the value of the serialPortToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialPortToken() {
        return serialPortToken;
    }

    /**
     * Sets the value of the serialPortToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialPortToken(String value) {
        this.serialPortToken = value;
    }

}

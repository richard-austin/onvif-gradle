
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
 *         <element name="SerialPortConfiguration" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialPortConfiguration"/>
 *         <element name="ForcePersistance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "serialPortConfiguration",
    "forcePersistance"
})
@XmlRootElement(name = "SetSerialPortConfiguration")
public class SetSerialPortConfiguration {

    @XmlElement(name = "SerialPortConfiguration", required = true)
    protected SerialPortConfiguration serialPortConfiguration;
    @XmlElement(name = "ForcePersistance")
    protected boolean forcePersistance;

    /**
     * Gets the value of the serialPortConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link SerialPortConfiguration }
     *     
     */
    public SerialPortConfiguration getSerialPortConfiguration() {
        return serialPortConfiguration;
    }

    /**
     * Sets the value of the serialPortConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialPortConfiguration }
     *     
     */
    public void setSerialPortConfiguration(SerialPortConfiguration value) {
        this.serialPortConfiguration = value;
    }

    /**
     * Gets the value of the forcePersistance property.
     * 
     */
    public boolean isForcePersistance() {
        return forcePersistance;
    }

    /**
     * Sets the value of the forcePersistance property.
     * 
     */
    public void setForcePersistance(boolean value) {
        this.forcePersistance = value;
    }

}

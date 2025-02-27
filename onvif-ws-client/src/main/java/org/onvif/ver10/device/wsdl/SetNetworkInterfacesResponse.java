
package org.onvif.ver10.device.wsdl;

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
 *         <element name="RebootNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rebootNeeded"
})
@XmlRootElement(name = "SetNetworkInterfacesResponse")
public class SetNetworkInterfacesResponse {

    /**
     * Indicates whether or not a reboot is required after configuration updates.
     *                   If a device responds with RebootNeeded set to false, the device can be reached
     *                   via the new IP address without further action. A tests should be aware that a
     *                   device
     *                   may not be responsive for a short period of time until it signals availability at
     *                   the new address via the discovery Hello messages.
     *                   If a device responds with RebootNeeded set to true, it will be further available
     *                   under
     *                   its previous IP address. The settings will only be activated when the device is
     *                   rebooted via the SystemReboot command.
     * 
     */
    @XmlElement(name = "RebootNeeded")
    protected boolean rebootNeeded;

    /**
     * Indicates whether or not a reboot is required after configuration updates.
     *                   If a device responds with RebootNeeded set to false, the device can be reached
     *                   via the new IP address without further action. A tests should be aware that a
     *                   device
     *                   may not be responsive for a short period of time until it signals availability at
     *                   the new address via the discovery Hello messages.
     *                   If a device responds with RebootNeeded set to true, it will be further available
     *                   under
     *                   its previous IP address. The settings will only be activated when the device is
     *                   rebooted via the SystemReboot command.
     * 
     */
    public boolean isRebootNeeded() {
        return rebootNeeded;
    }

    /**
     * Sets the value of the rebootNeeded property.
     * 
     */
    public void setRebootNeeded(boolean value) {
        this.rebootNeeded = value;
    }

}

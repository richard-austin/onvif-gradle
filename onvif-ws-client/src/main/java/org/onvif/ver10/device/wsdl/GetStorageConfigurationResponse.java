
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
 *         <element name="StorageConfiguration" type="{http://www.onvif.org/ver10/device/wsdl}StorageConfiguration"/>
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
    "storageConfiguration"
})
@XmlRootElement(name = "GetStorageConfigurationResponse")
public class GetStorageConfigurationResponse {

    @XmlElement(name = "StorageConfiguration", required = true)
    protected StorageConfiguration storageConfiguration;

    /**
     * Gets the value of the storageConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link StorageConfiguration }
     *     
     */
    public StorageConfiguration getStorageConfiguration() {
        return storageConfiguration;
    }

    /**
     * Sets the value of the storageConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageConfiguration }
     *     
     */
    public void setStorageConfiguration(StorageConfiguration value) {
        this.storageConfiguration = value;
    }

}


package org.onvif.ver10.deviceio.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="RelayOutputOptions" type="{http://www.onvif.org/ver10/deviceIO/wsdl}RelayOutputOptions" maxOccurs="unbounded" minOccurs="0"/>
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
    "relayOutputOptions"
})
@XmlRootElement(name = "GetRelayOutputOptionsResponse")
public class GetRelayOutputOptionsResponse {

    /**
     * Valid values and ranges for the configuration of a relay output.
     * 
     */
    @XmlElement(name = "RelayOutputOptions")
    protected List<RelayOutputOptions> relayOutputOptions;

    /**
     * Valid values and ranges for the configuration of a relay output.
     * 
     * Gets the value of the relayOutputOptions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relayOutputOptions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRelayOutputOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelayOutputOptions }
     * </p>
     * 
     * 
     * @return
     *     The value of the relayOutputOptions property.
     */
    public List<RelayOutputOptions> getRelayOutputOptions() {
        if (relayOutputOptions == null) {
            relayOutputOptions = new ArrayList<>();
        }
        return this.relayOutputOptions;
    }

}


package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfiguration;


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
 *         <element name="OSDs" type="{http://www.onvif.org/ver10/schema}OSDConfiguration" maxOccurs="unbounded" minOccurs="0"/>
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
    "osDs"
})
@XmlRootElement(name = "GetOSDsResponse")
public class GetOSDsResponse {

    /**
     * This element contains a list of requested OSDs.
     * 
     */
    @XmlElement(name = "OSDs")
    protected List<OSDConfiguration> osDs;

    /**
     * This element contains a list of requested OSDs.
     * 
     * Gets the value of the osDs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osDs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOSDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OSDConfiguration }
     * </p>
     * 
     * 
     * @return
     *     The value of the osDs property.
     */
    public List<OSDConfiguration> getOSDs() {
        if (osDs == null) {
            osDs = new ArrayList<>();
        }
        return this.osDs;
    }

}


package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfiguration;
import org.w3c.dom.Element;


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
 *         <element name="OSD" type="{http://www.onvif.org/ver10/schema}OSDConfiguration"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
    "osd",
    "any"
})
@XmlRootElement(name = "GetOSDResponse")
public class GetOSDResponse {

    /**
     * The requested OSD configuration.
     * 
     */
    @XmlElement(name = "OSD", required = true)
    protected OSDConfiguration osd;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * The requested OSD configuration.
     * 
     * @return
     *     possible object is
     *     {@link OSDConfiguration }
     *     
     */
    public OSDConfiguration getOSD() {
        return osd;
    }

    /**
     * Sets the value of the osd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDConfiguration }
     *     
     * @see #getOSD()
     */
    public void setOSD(OSDConfiguration value) {
        this.osd = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

}

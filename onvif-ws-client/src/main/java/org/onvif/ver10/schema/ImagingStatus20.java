
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
 * <p>Java class for ImagingStatus20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImagingStatus20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FocusStatus20" type="{http://www.onvif.org/ver10/schema}FocusStatus20" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingStatus20Extension" minOccurs="0"/>
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
@XmlType(name = "ImagingStatus20", propOrder = {
    "focusStatus20",
    "extension"
})
public class ImagingStatus20 {

    /**
     * Status of focus.
     * 
     */
    @XmlElement(name = "FocusStatus20")
    protected FocusStatus20 focusStatus20;
    @XmlElement(name = "Extension")
    protected ImagingStatus20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Status of focus.
     * 
     * @return
     *     possible object is
     *     {@link FocusStatus20 }
     *     
     */
    public FocusStatus20 getFocusStatus20() {
        return focusStatus20;
    }

    /**
     * Sets the value of the focusStatus20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusStatus20 }
     *     
     * @see #getFocusStatus20()
     */
    public void setFocusStatus20(FocusStatus20 value) {
        this.focusStatus20 = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingStatus20Extension }
     *     
     */
    public ImagingStatus20Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingStatus20Extension }
     *     
     */
    public void setExtension(ImagingStatus20Extension value) {
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


package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FocusStatus20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FocusStatus20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Position" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MoveStatus" type="{http://www.onvif.org/ver10/schema}MoveStatus"/>
 *         <element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusStatus20Extension" minOccurs="0"/>
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
@XmlType(name = "FocusStatus20", propOrder = {
    "position",
    "moveStatus",
    "error",
    "extension"
})
public class FocusStatus20 {

    /**
     * Status of focus position.
     * 
     */
    @XmlElement(name = "Position")
    protected float position;
    /**
     * Status of focus MoveStatus.
     * 
     */
    @XmlElement(name = "MoveStatus", required = true)
    @XmlSchemaType(name = "string")
    protected MoveStatus moveStatus;
    /**
     * Error status of focus.
     * 
     */
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "Extension")
    protected FocusStatus20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Status of focus position.
     * 
     */
    public float getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     */
    public void setPosition(float value) {
        this.position = value;
    }

    /**
     * Status of focus MoveStatus.
     * 
     * @return
     *     possible object is
     *     {@link MoveStatus }
     *     
     */
    public MoveStatus getMoveStatus() {
        return moveStatus;
    }

    /**
     * Sets the value of the moveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveStatus }
     *     
     * @see #getMoveStatus()
     */
    public void setMoveStatus(MoveStatus value) {
        this.moveStatus = value;
    }

    /**
     * Error status of focus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getError()
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FocusStatus20Extension }
     *     
     */
    public FocusStatus20Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusStatus20Extension }
     *     
     */
    public void setExtension(FocusStatus20Extension value) {
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

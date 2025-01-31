
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbsoluteFocus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbsoluteFocus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Position" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="Speed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsoluteFocus", propOrder = {
    "position",
    "speed"
})
public class AbsoluteFocus {

    /**
     * Position parameter for the absolute focus control.
     * 
     */
    @XmlElement(name = "Position")
    protected float position;
    /**
     * Speed parameter for the absolute focus control.
     * 
     */
    @XmlElement(name = "Speed")
    protected Float speed;

    /**
     * Position parameter for the absolute focus control.
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
     * Speed parameter for the absolute focus control.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getSpeed()
     */
    public void setSpeed(Float value) {
        this.speed = value;
    }

}

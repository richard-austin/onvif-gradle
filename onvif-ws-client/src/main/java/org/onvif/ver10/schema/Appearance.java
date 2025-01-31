
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
 * <p>Java class for Appearance complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Appearance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Transformation" type="{http://www.onvif.org/ver10/schema}Transformation" minOccurs="0"/>
 *         <element name="Shape" type="{http://www.onvif.org/ver10/schema}ShapeDescriptor" minOccurs="0"/>
 *         <element name="Color" type="{http://www.onvif.org/ver10/schema}ColorDescriptor" minOccurs="0"/>
 *         <element name="Class" type="{http://www.onvif.org/ver10/schema}ClassDescriptor" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}AppearanceExtension" minOccurs="0"/>
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
@XmlType(name = "Appearance", propOrder = {
    "transformation",
    "shape",
    "color",
    "clazz",
    "extension"
})
public class Appearance {

    @XmlElement(name = "Transformation")
    protected Transformation transformation;
    @XmlElement(name = "Shape")
    protected ShapeDescriptor shape;
    @XmlElement(name = "Color")
    protected ColorDescriptor color;
    @XmlElement(name = "Class")
    protected ClassDescriptor clazz;
    @XmlElement(name = "Extension")
    protected AppearanceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the transformation property.
     * 
     * @return
     *     possible object is
     *     {@link Transformation }
     *     
     */
    public Transformation getTransformation() {
        return transformation;
    }

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transformation }
     *     
     */
    public void setTransformation(Transformation value) {
        this.transformation = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link ShapeDescriptor }
     *     
     */
    public ShapeDescriptor getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeDescriptor }
     *     
     */
    public void setShape(ShapeDescriptor value) {
        this.shape = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link ColorDescriptor }
     *     
     */
    public ColorDescriptor getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorDescriptor }
     *     
     */
    public void setColor(ColorDescriptor value) {
        this.color = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ClassDescriptor }
     *     
     */
    public ClassDescriptor getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDescriptor }
     *     
     */
    public void setClazz(ClassDescriptor value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AppearanceExtension }
     *     
     */
    public AppearanceExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppearanceExtension }
     *     
     */
    public void setExtension(AppearanceExtension value) {
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

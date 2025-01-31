
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frame complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Frame">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZStatus" minOccurs="0"/>
 *         <element name="Transformation" type="{http://www.onvif.org/ver10/schema}Transformation" minOccurs="0"/>
 *         <element name="Object" type="{http://www.onvif.org/ver10/schema}Object" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ObjectTree" type="{http://www.onvif.org/ver10/schema}ObjectTree" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}FrameExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="UtcTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frame", propOrder = {
    "ptzStatus",
    "transformation",
    "object",
    "objectTree",
    "extension"
})
public class Frame {

    @XmlElement(name = "PTZStatus")
    protected PTZStatus ptzStatus;
    @XmlElement(name = "Transformation")
    protected Transformation transformation;
    @XmlElement(name = "Object")
    protected List<Object> object;
    @XmlElement(name = "ObjectTree")
    protected ObjectTree objectTree;
    @XmlElement(name = "Extension")
    protected FrameExtension extension;
    @XmlAttribute(name = "UtcTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcTime;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the ptzStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PTZStatus }
     *     
     */
    public PTZStatus getPTZStatus() {
        return ptzStatus;
    }

    /**
     * Sets the value of the ptzStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZStatus }
     *     
     */
    public void setPTZStatus(PTZStatus value) {
        this.ptzStatus = value;
    }

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
     * Gets the value of the object property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * </p>
     * 
     * 
     * @return
     *     The value of the object property.
     */
    public List<Object> getObject() {
        if (object == null) {
            object = new ArrayList<>();
        }
        return this.object;
    }

    /**
     * Gets the value of the objectTree property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectTree }
     *     
     */
    public ObjectTree getObjectTree() {
        return objectTree;
    }

    /**
     * Sets the value of the objectTree property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectTree }
     *     
     */
    public void setObjectTree(ObjectTree value) {
        this.objectTree = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FrameExtension }
     *     
     */
    public FrameExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameExtension }
     *     
     */
    public void setExtension(FrameExtension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the utcTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcTime() {
        return utcTime;
    }

    /**
     * Sets the value of the utcTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcTime(XMLGregorianCalendar value) {
        this.utcTime = value;
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

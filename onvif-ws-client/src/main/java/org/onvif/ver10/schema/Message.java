
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="Source" type="{http://www.onvif.org/ver10/schema}ItemList" minOccurs="0"/>
 *         <element name="Key" type="{http://www.onvif.org/ver10/schema}ItemList" minOccurs="0"/>
 *         <element name="Data" type="{http://www.onvif.org/ver10/schema}ItemList" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}MessageExtension" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="UtcTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="PropertyOperation" type="{http://www.onvif.org/ver10/schema}PropertyOperation" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "source",
    "key",
    "data",
    "extension"
})
@XmlRootElement(name = "Message")
public class Message {

    /**
     * Token value pairs that triggered this message. Typically only one item
     *               is present.
     * 
     */
    @XmlElement(name = "Source")
    protected ItemList source;
    @XmlElement(name = "Key")
    protected ItemList key;
    @XmlElement(name = "Data")
    protected ItemList data;
    @XmlElement(name = "Extension")
    protected MessageExtension extension;
    @XmlAttribute(name = "UtcTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcTime;
    @XmlAttribute(name = "PropertyOperation")
    protected PropertyOperation propertyOperation;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Token value pairs that triggered this message. Typically only one item
     *               is present.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     * @see #getSource()
     */
    public void setSource(ItemList value) {
        this.source = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setKey(ItemList value) {
        this.key = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setData(ItemList value) {
        this.data = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MessageExtension }
     *     
     */
    public MessageExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageExtension }
     *     
     */
    public void setExtension(MessageExtension value) {
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
     * Gets the value of the propertyOperation property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyOperation }
     *     
     */
    public PropertyOperation getPropertyOperation() {
        return propertyOperation;
    }

    /**
     * Sets the value of the propertyOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyOperation }
     *     
     */
    public void setPropertyOperation(PropertyOperation value) {
        this.propertyOperation = value;
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

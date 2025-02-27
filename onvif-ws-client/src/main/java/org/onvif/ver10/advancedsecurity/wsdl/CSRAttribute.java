
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A CSR attribute as specified in PKCS#10.
 * 
 * <p>Java class for CSRAttribute complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CSRAttribute">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="X509v3Extension" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}X509v3Extension"/>
 *         <element name="BasicRequestAttribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}BasicRequestAttribute"/>
 *         <element name="anyAttribute" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSRAttribute", propOrder = {
    "x509V3Extension",
    "basicRequestAttribute",
    "anyAttribute"
})
public class CSRAttribute {

    /**
     * An X.509v3 extension field.
     * 
     */
    @XmlElement(name = "X509v3Extension")
    protected X509V3Extension x509V3Extension;
    /**
     * A basic CSR attribute.
     * 
     */
    @XmlElement(name = "BasicRequestAttribute")
    protected BasicRequestAttribute basicRequestAttribute;
    protected CSRAttribute.AnyAttribute anyAttribute;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * An X.509v3 extension field.
     * 
     * @return
     *     possible object is
     *     {@link X509V3Extension }
     *     
     */
    public X509V3Extension getX509V3Extension() {
        return x509V3Extension;
    }

    /**
     * Sets the value of the x509V3Extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link X509V3Extension }
     *     
     * @see #getX509V3Extension()
     */
    public void setX509V3Extension(X509V3Extension value) {
        this.x509V3Extension = value;
    }

    /**
     * A basic CSR attribute.
     * 
     * @return
     *     possible object is
     *     {@link BasicRequestAttribute }
     *     
     */
    public BasicRequestAttribute getBasicRequestAttribute() {
        return basicRequestAttribute;
    }

    /**
     * Sets the value of the basicRequestAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicRequestAttribute }
     *     
     * @see #getBasicRequestAttribute()
     */
    public void setBasicRequestAttribute(BasicRequestAttribute value) {
        this.basicRequestAttribute = value;
    }

    /**
     * Gets the value of the anyAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link CSRAttribute.AnyAttribute }
     *     
     */
    public CSRAttribute.AnyAttribute getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Sets the value of the anyAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSRAttribute.AnyAttribute }
     *     
     */
    public void setAnyAttribute(CSRAttribute.AnyAttribute value) {
        this.anyAttribute = value;
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
        "any"
    })
    public static class AnyAttribute {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

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

}


package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="Subject" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DistinguishedName"/>
 *         <element name="KeyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}KeyID"/>
 *         <element name="CSRAttribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CSRAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SignatureAlgorithm" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}AlgorithmIdentifier"/>
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
    "subject",
    "keyID",
    "csrAttribute",
    "signatureAlgorithm"
})
@XmlRootElement(name = "CreatePKCS10CSR")
public class CreatePKCS10CSR {

    /**
     * The subject to be included in the CSR.
     * 
     */
    @XmlElement(name = "Subject", required = true)
    protected DistinguishedName subject;
    /**
     * The ID of the key for which the CSR shall be created.
     * 
     */
    @XmlElement(name = "KeyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String keyID;
    /**
     * An attribute to be included in the CSR.
     * 
     */
    @XmlElement(name = "CSRAttribute")
    protected List<CSRAttribute> csrAttribute;
    /**
     * The signature algorithm to be used to sign the CSR. Defaults to
     *                   SHA1 with RSA Encryption.
     * 
     */
    @XmlElement(name = "SignatureAlgorithm", required = true)
    protected AlgorithmIdentifier signatureAlgorithm;

    /**
     * The subject to be included in the CSR.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedName }
     *     
     */
    public DistinguishedName getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedName }
     *     
     * @see #getSubject()
     */
    public void setSubject(DistinguishedName value) {
        this.subject = value;
    }

    /**
     * The ID of the key for which the CSR shall be created.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyID() {
        return keyID;
    }

    /**
     * Sets the value of the keyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyID()
     */
    public void setKeyID(String value) {
        this.keyID = value;
    }

    /**
     * An attribute to be included in the CSR.
     * 
     * Gets the value of the csrAttribute property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csrAttribute property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCSRAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSRAttribute }
     * </p>
     * 
     * 
     * @return
     *     The value of the csrAttribute property.
     */
    public List<CSRAttribute> getCSRAttribute() {
        if (csrAttribute == null) {
            csrAttribute = new ArrayList<>();
        }
        return this.csrAttribute;
    }

    /**
     * The signature algorithm to be used to sign the CSR. Defaults to
     *                   SHA1 with RSA Encryption.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier }
     *     
     */
    public AlgorithmIdentifier getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Sets the value of the signatureAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier }
     *     
     * @see #getSignatureAlgorithm()
     */
    public void setSignatureAlgorithm(AlgorithmIdentifier value) {
        this.signatureAlgorithm = value;
    }

}

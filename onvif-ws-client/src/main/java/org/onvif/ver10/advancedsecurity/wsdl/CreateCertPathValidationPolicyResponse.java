
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
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
 *         <element name="CertPathValidationPolicyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationPolicyID"/>
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
    "certPathValidationPolicyID"
})
@XmlRootElement(name = "CreateCertPathValidationPolicyResponse")
public class CreateCertPathValidationPolicyResponse {

    /**
     * The ID of the created certification path validation policy.
     * 
     */
    @XmlElement(name = "CertPathValidationPolicyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String certPathValidationPolicyID;

    /**
     * The ID of the created certification path validation policy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertPathValidationPolicyID() {
        return certPathValidationPolicyID;
    }

    /**
     * Sets the value of the certPathValidationPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCertPathValidationPolicyID()
     */
    public void setCertPathValidationPolicyID(String value) {
        this.certPathValidationPolicyID = value;
    }

}

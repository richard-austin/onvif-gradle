
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Certificate;


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
 *         <element name="NvtCertificate" type="{http://www.onvif.org/ver10/schema}Certificate" maxOccurs="unbounded" minOccurs="0"/>
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
    "nvtCertificate"
})
@XmlRootElement(name = "GetCertificatesResponse")
public class GetCertificatesResponse {

    /**
     * Id and base64 encoded DER representation of all available certificates.
     * 
     */
    @XmlElement(name = "NvtCertificate")
    protected List<Certificate> nvtCertificate;

    /**
     * Id and base64 encoded DER representation of all available certificates.
     * 
     * Gets the value of the nvtCertificate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nvtCertificate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNvtCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Certificate }
     * </p>
     * 
     * 
     * @return
     *     The value of the nvtCertificate property.
     */
    public List<Certificate> getNvtCertificate() {
        if (nvtCertificate == null) {
            nvtCertificate = new ArrayList<>();
        }
        return this.nvtCertificate;
    }

}

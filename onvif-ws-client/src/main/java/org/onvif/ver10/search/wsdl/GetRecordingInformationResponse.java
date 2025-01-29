
package org.onvif.ver10.search.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RecordingInformation;


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
 *         <element name="RecordingInformation" type="{http://www.onvif.org/ver10/schema}RecordingInformation"/>
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
    "recordingInformation"
})
@XmlRootElement(name = "GetRecordingInformationResponse")
public class GetRecordingInformationResponse {

    @XmlElement(name = "RecordingInformation", required = true)
    protected RecordingInformation recordingInformation;

    /**
     * Gets the value of the recordingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingInformation }
     *     
     */
    public RecordingInformation getRecordingInformation() {
        return recordingInformation;
    }

    /**
     * Sets the value of the recordingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingInformation }
     *     
     */
    public void setRecordingInformation(RecordingInformation value) {
        this.recordingInformation = value;
    }

}

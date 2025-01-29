
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RecordingJobConfiguration;


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
 *         <element name="JobToken" type="{http://www.onvif.org/ver10/schema}RecordingJobReference"/>
 *         <element name="JobConfiguration" type="{http://www.onvif.org/ver10/schema}RecordingJobConfiguration"/>
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
    "jobToken",
    "jobConfiguration"
})
@XmlRootElement(name = "SetRecordingJobConfiguration")
public class SetRecordingJobConfiguration {

    /**
     * Token of the job to be modified.
     * 
     */
    @XmlElement(name = "JobToken", required = true)
    protected String jobToken;
    /**
     * New configuration of the recording job.
     * 
     */
    @XmlElement(name = "JobConfiguration", required = true)
    protected RecordingJobConfiguration jobConfiguration;

    /**
     * Token of the job to be modified.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobToken() {
        return jobToken;
    }

    /**
     * Sets the value of the jobToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getJobToken()
     */
    public void setJobToken(String value) {
        this.jobToken = value;
    }

    /**
     * New configuration of the recording job.
     * 
     * @return
     *     possible object is
     *     {@link RecordingJobConfiguration }
     *     
     */
    public RecordingJobConfiguration getJobConfiguration() {
        return jobConfiguration;
    }

    /**
     * Sets the value of the jobConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingJobConfiguration }
     *     
     * @see #getJobConfiguration()
     */
    public void setJobConfiguration(RecordingJobConfiguration value) {
        this.jobConfiguration = value;
    }

}


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
    "jobConfiguration"
})
@XmlRootElement(name = "SetRecordingJobConfigurationResponse")
public class SetRecordingJobConfigurationResponse {

    /**
     * The JobConfiguration structure shall be the configuration
     *                   as it is used by the device. This may be different from the JobConfiguration
     *                   passed to SetRecordingJobConfiguration.
     * 
     */
    @XmlElement(name = "JobConfiguration", required = true)
    protected RecordingJobConfiguration jobConfiguration;

    /**
     * The JobConfiguration structure shall be the configuration
     *                   as it is used by the device. This may be different from the JobConfiguration
     *                   passed to SetRecordingJobConfiguration.
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

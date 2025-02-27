
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.TrackConfiguration;


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
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *         <element name="TrackConfiguration" type="{http://www.onvif.org/ver10/schema}TrackConfiguration"/>
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
    "recordingToken",
    "trackConfiguration"
})
@XmlRootElement(name = "CreateTrack")
public class CreateTrack {

    /**
     * Identifies the recording to which a track shall be added.
     * 
     */
    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    /**
     * The configuration of the new track.
     * 
     */
    @XmlElement(name = "TrackConfiguration", required = true)
    protected TrackConfiguration trackConfiguration;

    /**
     * Identifies the recording to which a track shall be added.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingToken() {
        return recordingToken;
    }

    /**
     * Sets the value of the recordingToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecordingToken()
     */
    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

    /**
     * The configuration of the new track.
     * 
     * @return
     *     possible object is
     *     {@link TrackConfiguration }
     *     
     */
    public TrackConfiguration getTrackConfiguration() {
        return trackConfiguration;
    }

    /**
     * Sets the value of the trackConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackConfiguration }
     *     
     * @see #getTrackConfiguration()
     */
    public void setTrackConfiguration(TrackConfiguration value) {
        this.trackConfiguration = value;
    }

}


package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *         <element name="TrackToken" type="{http://www.onvif.org/ver10/schema}TrackReference"/>
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
    "trackToken"
})
@XmlRootElement(name = "DeleteTrack")
public class DeleteTrack {

    /**
     * Token of the recording the track belongs to.
     * 
     */
    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    /**
     * Token of the track to be deleted.
     * 
     */
    @XmlElement(name = "TrackToken", required = true)
    protected String trackToken;

    /**
     * Token of the recording the track belongs to.
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
     * Token of the track to be deleted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackToken() {
        return trackToken;
    }

    /**
     * Sets the value of the trackToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrackToken()
     */
    public void setTrackToken(String value) {
        this.trackToken = value;
    }

}

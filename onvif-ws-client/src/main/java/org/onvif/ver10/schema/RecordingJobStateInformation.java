
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingJobStateInformation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RecordingJobStateInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/>
 *         <element name="State" type="{http://www.onvif.org/ver10/schema}RecordingJobState"/>
 *         <element name="Sources" type="{http://www.onvif.org/ver10/schema}RecordingJobStateSource" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}RecordingJobStateInformationExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordingJobStateInformation", propOrder = {
    "recordingToken",
    "state",
    "sources",
    "extension"
})
public class RecordingJobStateInformation {

    /**
     * Identification of the recording that the recording job records to.
     * 
     */
    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    /**
     * Holds the aggregated state over the whole RecordingJobInformation
     *             structure.
     * 
     */
    @XmlElement(name = "State", required = true)
    protected String state;
    /**
     * Identifies the data source of the recording job.
     * 
     */
    @XmlElement(name = "Sources")
    protected List<RecordingJobStateSource> sources;
    @XmlElement(name = "Extension")
    protected RecordingJobStateInformationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Identification of the recording that the recording job records to.
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
     * Holds the aggregated state over the whole RecordingJobInformation
     *             structure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getState()
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Identifies the data source of the recording job.
     * 
     * Gets the value of the sources property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sources property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordingJobStateSource }
     * </p>
     * 
     * 
     * @return
     *     The value of the sources property.
     */
    public List<RecordingJobStateSource> getSources() {
        if (sources == null) {
            sources = new ArrayList<>();
        }
        return this.sources;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingJobStateInformationExtension }
     *     
     */
    public RecordingJobStateInformationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingJobStateInformationExtension }
     *     
     */
    public void setExtension(RecordingJobStateInformationExtension value) {
        this.extension = value;
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

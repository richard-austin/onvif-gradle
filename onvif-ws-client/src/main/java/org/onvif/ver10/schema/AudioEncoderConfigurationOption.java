
package org.onvif.ver10.schema;

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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AudioEncoderConfigurationOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AudioEncoderConfigurationOption">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Encoding" type="{http://www.onvif.org/ver10/schema}AudioEncoding"/>
 *         <element name="BitrateList" type="{http://www.onvif.org/ver10/schema}IntList"/>
 *         <element name="SampleRateList" type="{http://www.onvif.org/ver10/schema}IntList"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AudioEncoderConfigurationOption", propOrder = {
    "encoding",
    "bitrateList",
    "sampleRateList",
    "any"
})
public class AudioEncoderConfigurationOption {

    /**
     * The enoding used for audio data (either G.711, G.726 or AAC)
     * 
     */
    @XmlElement(name = "Encoding", required = true)
    @XmlSchemaType(name = "string")
    protected AudioEncoding encoding;
    /**
     * List of supported bitrates in kbps for the specified Encoding
     * 
     */
    @XmlElement(name = "BitrateList", required = true)
    protected IntList bitrateList;
    /**
     * List of supported Sample Rates in kHz for the specified Encoding
     * 
     */
    @XmlElement(name = "SampleRateList", required = true)
    protected IntList sampleRateList;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The enoding used for audio data (either G.711, G.726 or AAC)
     * 
     * @return
     *     possible object is
     *     {@link AudioEncoding }
     *     
     */
    public AudioEncoding getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioEncoding }
     *     
     * @see #getEncoding()
     */
    public void setEncoding(AudioEncoding value) {
        this.encoding = value;
    }

    /**
     * List of supported bitrates in kbps for the specified Encoding
     * 
     * @return
     *     possible object is
     *     {@link IntList }
     *     
     */
    public IntList getBitrateList() {
        return bitrateList;
    }

    /**
     * Sets the value of the bitrateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntList }
     *     
     * @see #getBitrateList()
     */
    public void setBitrateList(IntList value) {
        this.bitrateList = value;
    }

    /**
     * List of supported Sample Rates in kHz for the specified Encoding
     * 
     * @return
     *     possible object is
     *     {@link IntList }
     *     
     */
    public IntList getSampleRateList() {
        return sampleRateList;
    }

    /**
     * Sets the value of the sampleRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntList }
     *     
     * @see #getSampleRateList()
     */
    public void setSampleRateList(IntList value) {
        this.sampleRateList = value;
    }

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
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
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


package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for StreamingCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StreamingCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="RTPMulticast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RTP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="RTP_RTSP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NonAggregateControl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="NoRTSPStreaming" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamingCapabilities", propOrder = {
    "any"
})
public class StreamingCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates support for RTP multicast.
     * 
     */
    @XmlAttribute(name = "RTPMulticast")
    protected Boolean rtpMulticast;
    /**
     * Indicates support for RTP over TCP.
     * 
     */
    @XmlAttribute(name = "RTP_TCP")
    protected Boolean rtptcp;
    /**
     * Indicates support for RTP/RTSP/TCP.
     * 
     */
    @XmlAttribute(name = "RTP_RTSP_TCP")
    protected Boolean rtprtsptcp;
    /**
     * Indicates support for non aggregate RTSP control.
     * 
     */
    @XmlAttribute(name = "NonAggregateControl")
    protected Boolean nonAggregateControl;
    /**
     * Indicates the device does not support live media streaming via RTSP.
     * 
     */
    @XmlAttribute(name = "NoRTSPStreaming")
    protected Boolean noRTSPStreaming;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

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
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Indicates support for RTP multicast.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRTPMulticast() {
        return rtpMulticast;
    }

    /**
     * Sets the value of the rtpMulticast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRTPMulticast()
     */
    public void setRTPMulticast(Boolean value) {
        this.rtpMulticast = value;
    }

    /**
     * Indicates support for RTP over TCP.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRTPTCP() {
        return rtptcp;
    }

    /**
     * Sets the value of the rtptcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRTPTCP()
     */
    public void setRTPTCP(Boolean value) {
        this.rtptcp = value;
    }

    /**
     * Indicates support for RTP/RTSP/TCP.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRTPRTSPTCP() {
        return rtprtsptcp;
    }

    /**
     * Sets the value of the rtprtsptcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRTPRTSPTCP()
     */
    public void setRTPRTSPTCP(Boolean value) {
        this.rtprtsptcp = value;
    }

    /**
     * Indicates support for non aggregate RTSP control.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonAggregateControl() {
        return nonAggregateControl;
    }

    /**
     * Sets the value of the nonAggregateControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNonAggregateControl()
     */
    public void setNonAggregateControl(Boolean value) {
        this.nonAggregateControl = value;
    }

    /**
     * Indicates the device does not support live media streaming via RTSP.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRTSPStreaming() {
        return noRTSPStreaming;
    }

    /**
     * Sets the value of the noRTSPStreaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoRTSPStreaming()
     */
    public void setNoRTSPStreaming(Boolean value) {
        this.noRTSPStreaming = value;
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

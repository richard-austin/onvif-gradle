
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.StreamSetup;


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
 *         <element name="StreamSetup" type="{http://www.onvif.org/ver10/schema}StreamSetup"/>
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
    "streamSetup",
    "profileToken"
})
@XmlRootElement(name = "GetStreamUri")
public class GetStreamUri {

    /**
     * Stream Setup that should be used with the uri
     * 
     */
    @XmlElement(name = "StreamSetup", required = true)
    protected StreamSetup streamSetup;
    /**
     * The ProfileToken element indicates the media profile to use and
     *                   will define the configuration of the content of the stream.
     * 
     */
    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

    /**
     * Stream Setup that should be used with the uri
     * 
     * @return
     *     possible object is
     *     {@link StreamSetup }
     *     
     */
    public StreamSetup getStreamSetup() {
        return streamSetup;
    }

    /**
     * Sets the value of the streamSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamSetup }
     *     
     * @see #getStreamSetup()
     */
    public void setStreamSetup(StreamSetup value) {
        this.streamSetup = value;
    }

    /**
     * The ProfileToken element indicates the media profile to use and
     *                   will define the configuration of the content of the stream.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileToken() {
        return profileToken;
    }

    /**
     * Sets the value of the profileToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfileToken()
     */
    public void setProfileToken(String value) {
        this.profileToken = value;
    }

}

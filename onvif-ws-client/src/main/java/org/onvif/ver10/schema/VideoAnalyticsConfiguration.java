
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
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoAnalyticsConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoAnalyticsConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity">
 *       <sequence>
 *         <element name="AnalyticsEngineConfiguration" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineConfiguration"/>
 *         <element name="RuleEngineConfiguration" type="{http://www.onvif.org/ver10/schema}RuleEngineConfiguration"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAnalyticsConfiguration", propOrder = {
    "analyticsEngineConfiguration",
    "ruleEngineConfiguration",
    "any"
})
public class VideoAnalyticsConfiguration
    extends ConfigurationEntity
{

    @XmlElement(name = "AnalyticsEngineConfiguration", required = true)
    protected AnalyticsEngineConfiguration analyticsEngineConfiguration;
    @XmlElement(name = "RuleEngineConfiguration", required = true)
    protected RuleEngineConfiguration ruleEngineConfiguration;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the analyticsEngineConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsEngineConfiguration }
     *     
     */
    public AnalyticsEngineConfiguration getAnalyticsEngineConfiguration() {
        return analyticsEngineConfiguration;
    }

    /**
     * Sets the value of the analyticsEngineConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsEngineConfiguration }
     *     
     */
    public void setAnalyticsEngineConfiguration(AnalyticsEngineConfiguration value) {
        this.analyticsEngineConfiguration = value;
    }

    /**
     * Gets the value of the ruleEngineConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link RuleEngineConfiguration }
     *     
     */
    public RuleEngineConfiguration getRuleEngineConfiguration() {
        return ruleEngineConfiguration;
    }

    /**
     * Sets the value of the ruleEngineConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleEngineConfiguration }
     *     
     */
    public void setRuleEngineConfiguration(RuleEngineConfiguration value) {
        this.ruleEngineConfiguration = value;
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

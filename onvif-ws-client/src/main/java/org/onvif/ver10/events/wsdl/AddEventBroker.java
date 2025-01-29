
package org.onvif.ver10.events.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventBroker" type="{http://www.onvif.org/ver10/events/wsdl}EventBrokerConfig"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventBroker"
})
@XmlRootElement(name = "AddEventBroker")
public class AddEventBroker {

    @XmlElement(name = "EventBroker", required = true)
    protected EventBrokerConfig eventBroker;

    /**
     * Gets the value of the eventBroker property.
     * 
     * @return
     *     possible object is
     *     {@link EventBrokerConfig }
     *     
     */
    public EventBrokerConfig getEventBroker() {
        return eventBroker;
    }

    /**
     * Sets the value of the eventBroker property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventBrokerConfig }
     *     
     */
    public void setEventBroker(EventBrokerConfig value) {
        this.eventBroker = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}

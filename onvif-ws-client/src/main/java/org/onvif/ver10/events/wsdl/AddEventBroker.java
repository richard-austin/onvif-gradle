
package org.onvif.ver10.events.wsdl;

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
 *         <element name="EventBroker" type="{http://www.onvif.org/ver10/events/wsdl}EventBrokerConfig"/>
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

}

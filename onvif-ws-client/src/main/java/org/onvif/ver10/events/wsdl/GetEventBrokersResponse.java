
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="EventBroker" type="{http://www.onvif.org/ver10/events/wsdl}EventBrokerConfig" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "GetEventBrokersResponse")
public class GetEventBrokersResponse {

    @XmlElement(name = "EventBroker")
    protected List<EventBrokerConfig> eventBroker;

    /**
     * Gets the value of the eventBroker property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventBroker property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEventBroker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventBrokerConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the eventBroker property.
     */
    public List<EventBrokerConfig> getEventBroker() {
        if (eventBroker == null) {
            eventBroker = new ArrayList<>();
        }
        return this.eventBroker;
    }

}

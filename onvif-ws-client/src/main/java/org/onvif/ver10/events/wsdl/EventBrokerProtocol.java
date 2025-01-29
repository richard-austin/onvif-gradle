
package org.onvif.ver10.events.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EventBrokerProtocol</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EventBrokerProtocol">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="mqtt"/>
 *     <enumeration value="mqtts"/>
 *     <enumeration value="ws"/>
 *     <enumeration value="wss"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventBrokerProtocol")
@XmlEnum
public enum EventBrokerProtocol {

    @XmlEnumValue("mqtt")
    MQTT("mqtt"),
    @XmlEnumValue("mqtts")
    MQTTS("mqtts"),
    @XmlEnumValue("ws")
    WS("ws"),
    @XmlEnumValue("wss")
    WSS("wss");
    private final String value;

    EventBrokerProtocol(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static EventBrokerProtocol fromValue(String v) {
        for (EventBrokerProtocol c: EventBrokerProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

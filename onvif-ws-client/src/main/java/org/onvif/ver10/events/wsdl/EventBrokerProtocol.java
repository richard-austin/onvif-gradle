
package org.onvif.ver10.events.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventBrokerProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EventBrokerProtocol"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mqtt"/&gt;
 *     &lt;enumeration value="mqtts"/&gt;
 *     &lt;enumeration value="ws"/&gt;
 *     &lt;enumeration value="wss"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

    public String value() {
        return value;
    }

    public static EventBrokerProtocol fromValue(String v) {
        for (EventBrokerProtocol c: EventBrokerProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

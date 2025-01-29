
package org.onvif.ver10.events.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConnectionStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Offline"/&gt;
 *     &lt;enumeration value="Connecting"/&gt;
 *     &lt;enumeration value="Connected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConnectionStatus")
@XmlEnum
public enum ConnectionStatus {

    @XmlEnumValue("Offline")
    OFFLINE("Offline"),
    @XmlEnumValue("Connecting")
    CONNECTING("Connecting"),
    @XmlEnumValue("Connected")
    CONNECTED("Connected");
    private final String value;

    ConnectionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionStatus fromValue(String v) {
        for (ConnectionStatus c: ConnectionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

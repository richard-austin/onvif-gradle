
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SearchState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SearchState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Queued"/>
 *     <enumeration value="Searching"/>
 *     <enumeration value="Completed"/>
 *     <enumeration value="Unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SearchState")
@XmlEnum
public enum SearchState {


    /**
     * The search is queued and not yet started.
     * 
     */
    @XmlEnumValue("Queued")
    QUEUED("Queued"),

    /**
     * The search is underway and not yet completed.
     * 
     */
    @XmlEnumValue("Searching")
    SEARCHING("Searching"),

    /**
     * The search has been completed and no new results will be found.
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * The state of the search is unknown. (This is not a valid response from
     *             GetSearchState.)
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SearchState(String v) {
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
    public static SearchState fromValue(String v) {
        for (SearchState c: SearchState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

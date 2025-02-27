
package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.MetadataConfiguration;


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
 *         <element name="Configurations" type="{http://www.onvif.org/ver10/schema}MetadataConfiguration" maxOccurs="unbounded" minOccurs="0"/>
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
    "configurations"
})
@XmlRootElement(name = "GetMetadataConfigurationsResponse")
public class GetMetadataConfigurationsResponse {

    /**
     * This element contains a list of metadata configurations
     * 
     */
    @XmlElement(name = "Configurations")
    protected List<MetadataConfiguration> configurations;

    /**
     * This element contains a list of metadata configurations
     * 
     * Gets the value of the configurations property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurations property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataConfiguration }
     * </p>
     * 
     * 
     * @return
     *     The value of the configurations property.
     */
    public List<MetadataConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<>();
        }
        return this.configurations;
    }

}

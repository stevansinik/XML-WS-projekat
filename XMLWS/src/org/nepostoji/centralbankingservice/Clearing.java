
package org.nepostoji.centralbankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.mt102.MT102;


/**
 * <p>Java class for Clearing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Clearing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/MT102}mt102"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clearing", propOrder = {
    "mt102"
})
public class Clearing {

    @XmlElement(namespace = "http://www.example.org/MT102", required = true)
    protected MT102 mt102;

    /**
     * Gets the value of the mt102 property.
     * 
     * @return
     *     possible object is
     *     {@link MT102 }
     *     
     */
    public MT102 getMt102() {
        return mt102;
    }

    /**
     * Sets the value of the mt102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MT102 }
     *     
     */
    public void setMt102(MT102 value) {
        this.mt102 = value;
    }

}

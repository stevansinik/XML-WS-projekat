
package org.nepostoji.paymentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.presjek.Presjek;


/**
 * <p>Java class for PorukaPresjeka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PorukaPresjeka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/Presjek}presjek"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PorukaPresjeka", propOrder = {
    "presjek"
})
public class PorukaPresjeka {

    @XmlElement(namespace = "http://www.example.org/Presjek", required = true)
    protected Presjek presjek;

    /**
     * Gets the value of the presjek property.
     * 
     * @return
     *     possible object is
     *     {@link Presjek }
     *     
     */
    public Presjek getPresjek() {
        return presjek;
    }

    /**
     * Sets the value of the presjek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presjek }
     *     
     */
    public void setPresjek(Presjek value) {
        this.presjek = value;
    }

}

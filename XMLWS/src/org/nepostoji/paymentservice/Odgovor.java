
package org.nepostoji.paymentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Odgovor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Odgovor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="odgovor" type="{http://www.example.org/Odgovor}Odgovor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Odgovor", propOrder = {
    "odgovor"
})
public class Odgovor {

    @XmlElement(namespace = "", required = true)
    protected org.example.odgovor.Odgovor odgovor;

    /**
     * Gets the value of the odgovor property.
     * 
     * @return
     *     possible object is
     *     {@link org.example.odgovor.Odgovor }
     *     
     */
    public org.example.odgovor.Odgovor getOdgovor() {
        return odgovor;
    }

    /**
     * Sets the value of the odgovor property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.example.odgovor.Odgovor }
     *     
     */
    public void setOdgovor(org.example.odgovor.Odgovor value) {
        this.odgovor = value;
    }

}

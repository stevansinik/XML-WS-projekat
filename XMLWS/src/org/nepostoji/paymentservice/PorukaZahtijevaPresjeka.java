
package org.nepostoji.paymentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.zahtijevzaizvodom.Zahtijev;


/**
 * <p>Java class for PorukaZahtijevaPresjeka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PorukaZahtijevaPresjeka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/ZahtijevZaIzvodom}zahtijev"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PorukaZahtijevaPresjeka", propOrder = {
    "zahtijev"
})
public class PorukaZahtijevaPresjeka {

    @XmlElement(namespace = "http://www.example.org/ZahtijevZaIzvodom", required = true)
    protected Zahtijev zahtijev;

    /**
     * Gets the value of the zahtijev property.
     * 
     * @return
     *     possible object is
     *     {@link Zahtijev }
     *     
     */
    public Zahtijev getZahtijev() {
        return zahtijev;
    }

    /**
     * Sets the value of the zahtijev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zahtijev }
     *     
     */
    public void setZahtijev(Zahtijev value) {
        this.zahtijev = value;
    }

}

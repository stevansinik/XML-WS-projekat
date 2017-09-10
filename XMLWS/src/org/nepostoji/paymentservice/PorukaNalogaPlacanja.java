
package org.nepostoji.paymentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.nalogzaplacanje.NalogZaPlacanje;


/**
 * <p>Java class for PorukaNalogaPlacanja complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PorukaNalogaPlacanja">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/NalogZaPlacanje}nalog"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PorukaNalogaPlacanja", propOrder = {
    "nalog"
})
public class PorukaNalogaPlacanja {

    @XmlElement(namespace = "http://www.example.org/NalogZaPlacanje", required = true)
    protected NalogZaPlacanje nalog;

    /**
     * Gets the value of the nalog property.
     * 
     * @return
     *     possible object is
     *     {@link NalogZaPlacanje }
     *     
     */
    public NalogZaPlacanje getNalog() {
        return nalog;
    }

    /**
     * Sets the value of the nalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link NalogZaPlacanje }
     *     
     */
    public void setNalog(NalogZaPlacanje value) {
        this.nalog = value;
    }

}

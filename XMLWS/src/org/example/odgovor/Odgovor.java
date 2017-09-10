
package org.example.odgovor;

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
 *         &lt;element name="ishod" type="{http://www.example.org/Odgovor}Ishod"/>
 *         &lt;element name="poruka" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ishod",
    "poruka"
})
public class Odgovor {

    @XmlElement(required = true)
    protected Ishod ishod;
    @XmlElement(required = true)
    protected String poruka;

    /**
     * Gets the value of the ishod property.
     * 
     * @return
     *     possible object is
     *     {@link Ishod }
     *     
     */
    public Ishod getIshod() {
        return ishod;
    }

    /**
     * Sets the value of the ishod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ishod }
     *     
     */
    public void setIshod(Ishod value) {
        this.ishod = value;
    }

    /**
     * Gets the value of the poruka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoruka() {
        return poruka;
    }

    /**
     * Sets the value of the poruka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoruka(String value) {
        this.poruka = value;
    }

}

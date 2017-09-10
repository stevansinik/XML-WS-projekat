//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.08 at 09:29:25 PM CEST 
//


package org.example.faktura;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Faktura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Faktura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zaglavlje" type="{http://www.example.org/Faktura}Zaglavlje"/>
 *         &lt;element name="stavke">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stavka" type="{http://www.example.org/Faktura}Stavka" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="faktura")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Faktura", propOrder = {
    "zaglavlje",
    "stavke"
})
public class Faktura {

    @XmlElement(required = true)
    protected Zaglavlje zaglavlje;
    @XmlElementWrapper(name = "stavke")
    @XmlElement(name = "stavka", required = true)
    protected List<Stavka> stavke;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link Zaglavlje }
     *     
     */
    public Zaglavlje getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zaglavlje }
     *     
     */
    public void setZaglavlje(Zaglavlje value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the stavke property.
     * 
     * @return
     *     possible object is
     *     {@link Faktura.Stavke }
     *     
     */
    public List<Stavka> getStavke() {
    	if (stavke == null) {
            stavke = new ArrayList<Stavka>();
        }
        return this.stavke;
    }

}
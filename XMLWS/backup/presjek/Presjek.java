//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.08 at 09:29:28 PM CEST 
//


package org.example.presjek;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Presjek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Presjek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zaglavlje" type="{http://www.example.org/Presjek}Zaglavlje"/>
 *         &lt;element name="stavke">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stavka" type="{http://www.example.org/Presjek}Stavka" maxOccurs="unbounded"/>
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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Presjek", propOrder = {
    "zaglavlje",
    "stavke"
})
public class Presjek {

    @XmlElement(required = true)
    protected Zaglavlje zaglavlje;
    @XmlElement(required = true)
    protected Presjek.Stavke stavke;

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
     *     {@link Presjek.Stavke }
     *     
     */
    public Presjek.Stavke getStavke() {
        return stavke;
    }

    /**
     * Sets the value of the stavke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presjek.Stavke }
     *     
     */
    public void setStavke(Presjek.Stavke value) {
        this.stavke = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="stavka" type="{http://www.example.org/Presjek}Stavka" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stavka"
    })
    public static class Stavke {

        @XmlElement(required = true)
        protected List<Stavka> stavka;

        /**
         * Gets the value of the stavka property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stavka property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStavka().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Stavka }
         * 
         * 
         */
        public List<Stavka> getStavka() {
            if (stavka == null) {
                stavka = new ArrayList<Stavka>();
            }
            return this.stavka;
        }

    }

}

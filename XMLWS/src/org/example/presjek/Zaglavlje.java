
package org.example.presjek;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Zaglavlje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Zaglavlje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="broj_racuna" type="{http://www.example.org/BankarskiTipovi}brojRacuna"/>
 *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="broj_presjeka" type="{http://www.example.org/BankarskiTipovi}redniBrojPresjeka"/>
 *         &lt;element name="prethodno_stanje" type="{http://www.example.org/BankarskiTipovi}novcaniIznos"/>
 *         &lt;element name="broj_promjena_u_korist" type="{http://www.example.org/Presjek}brojPromjena"/>
 *         &lt;element name="ukupno_u_korist" type="{http://www.example.org/BankarskiTipovi}novcaniIznos"/>
 *         &lt;element name="broj_promjena_na_teret" type="{http://www.example.org/Presjek}brojPromjena"/>
 *         &lt;element name="ukupno_na_teret" type="{http://www.example.org/BankarskiTipovi}novcaniIznos"/>
 *         &lt;element name="novo_stanje" type="{http://www.example.org/BankarskiTipovi}novcaniIznos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zaglavlje", propOrder = {
    "brojRacuna",
    "datumNaloga",
    "brojPresjeka",
    "prethodnoStanje",
    "brojPromjenaUKorist",
    "ukupnoUKorist",
    "brojPromjenaNaTeret",
    "ukupnoNaTeret",
    "novoStanje"
})
public class Zaglavlje {

    @XmlElement(name = "broj_racuna", required = true)
    protected String brojRacuna;
    @XmlElement(name = "datum_naloga", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datumNaloga;
    @XmlElement(name = "broj_presjeka")
    protected int brojPresjeka;
    @XmlElement(name = "prethodno_stanje", required = true)
    protected BigDecimal prethodnoStanje;
    @XmlElement(name = "broj_promjena_u_korist")
    protected int brojPromjenaUKorist;
    @XmlElement(name = "ukupno_u_korist", required = true)
    protected BigDecimal ukupnoUKorist;
    @XmlElement(name = "broj_promjena_na_teret")
    protected int brojPromjenaNaTeret;
    @XmlElement(name = "ukupno_na_teret", required = true)
    protected BigDecimal ukupnoNaTeret;
    @XmlElement(name = "novo_stanje", required = true)
    protected BigDecimal novoStanje;

    /**
     * Gets the value of the brojRacuna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojRacuna() {
        return brojRacuna;
    }

    /**
     * Sets the value of the brojRacuna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojRacuna(String value) {
        this.brojRacuna = value;
    }

    /**
     * Gets the value of the datumNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNaloga() {
        return datumNaloga;
    }

    /**
     * Sets the value of the datumNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNaloga(XMLGregorianCalendar value) {
        this.datumNaloga = value;
    }

    /**
     * Gets the value of the brojPresjeka property.
     * 
     */
    public int getBrojPresjeka() {
        return brojPresjeka;
    }

    /**
     * Sets the value of the brojPresjeka property.
     * 
     */
    public void setBrojPresjeka(int value) {
        this.brojPresjeka = value;
    }

    /**
     * Gets the value of the prethodnoStanje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrethodnoStanje() {
        return prethodnoStanje;
    }

    /**
     * Sets the value of the prethodnoStanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrethodnoStanje(BigDecimal value) {
        this.prethodnoStanje = value;
    }

    /**
     * Gets the value of the brojPromjenaUKorist property.
     * 
     */
    public int getBrojPromjenaUKorist() {
        return brojPromjenaUKorist;
    }

    /**
     * Sets the value of the brojPromjenaUKorist property.
     * 
     */
    public void setBrojPromjenaUKorist(int value) {
        this.brojPromjenaUKorist = value;
    }

    /**
     * Gets the value of the ukupnoUKorist property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUkupnoUKorist() {
        return ukupnoUKorist;
    }

    /**
     * Sets the value of the ukupnoUKorist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUkupnoUKorist(BigDecimal value) {
        this.ukupnoUKorist = value;
    }

    /**
     * Gets the value of the brojPromjenaNaTeret property.
     * 
     */
    public int getBrojPromjenaNaTeret() {
        return brojPromjenaNaTeret;
    }

    /**
     * Sets the value of the brojPromjenaNaTeret property.
     * 
     */
    public void setBrojPromjenaNaTeret(int value) {
        this.brojPromjenaNaTeret = value;
    }

    /**
     * Gets the value of the ukupnoNaTeret property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUkupnoNaTeret() {
        return ukupnoNaTeret;
    }

    /**
     * Sets the value of the ukupnoNaTeret property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUkupnoNaTeret(BigDecimal value) {
        this.ukupnoNaTeret = value;
    }

    /**
     * Gets the value of the novoStanje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNovoStanje() {
        return novoStanje;
    }

    /**
     * Sets the value of the novoStanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNovoStanje(BigDecimal value) {
        this.novoStanje = value;
    }

}


package org.example.presjek;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Stavka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stavka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duznik" type="{http://www.example.org/ZajednickiTipovi}dugackoIme"/>
 *         &lt;element name="svrha_placanja" type="{http://www.example.org/ZajednickiTipovi}dugackoIme"/>
 *         &lt;element name="primalac" type="{http://www.example.org/ZajednickiTipovi}dugackoIme"/>
 *         &lt;element name="datum_naloga" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="datum_valute" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="racun_duznika" type="{http://www.example.org/BankarskiTipovi}brojRacuna"/>
 *         &lt;element name="model_zaduzenja" type="{http://www.example.org/BankarskiTipovi}brojModela"/>
 *         &lt;element name="poziv_na_broj_zaduzenja" type="{http://www.example.org/BankarskiTipovi}pozivNaBroj"/>
 *         &lt;element name="racun_primaoca" type="{http://www.example.org/BankarskiTipovi}brojRacuna"/>
 *         &lt;element name="model_odobrenja" type="{http://www.example.org/BankarskiTipovi}brojModela"/>
 *         &lt;element name="poziv_na_broj_odobrenja" type="{http://www.example.org/BankarskiTipovi}pozivNaBroj"/>
 *         &lt;element name="iznos" type="{http://www.example.org/BankarskiTipovi}novcaniIznos"/>
 *         &lt;element name="smer" type="{http://www.example.org/Presjek}smer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stavka", propOrder = {
    "duznik",
    "svrhaPlacanja",
    "primalac",
    "datumNaloga",
    "datumValute",
    "racunDuznika",
    "modelZaduzenja",
    "pozivNaBrojZaduzenja",
    "racunPrimaoca",
    "modelOdobrenja",
    "pozivNaBrojOdobrenja",
    "iznos",
    "smer"
})
public class Stavka {

    @XmlElement(required = true)
    protected String duznik;
    @XmlElement(name = "svrha_placanja", required = true)
    protected String svrhaPlacanja;
    @XmlElement(required = true)
    protected String primalac;
    @XmlElement(name = "datum_naloga", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datumNaloga;
    @XmlElement(name = "datum_valute", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datumValute;
    @XmlElement(name = "racun_duznika", required = true)
    protected String racunDuznika;
    @XmlElement(name = "model_zaduzenja")
    protected int modelZaduzenja;
    @XmlElement(name = "poziv_na_broj_zaduzenja", required = true)
    protected String pozivNaBrojZaduzenja;
    @XmlElement(name = "racun_primaoca", required = true)
    protected String racunPrimaoca;
    @XmlElement(name = "model_odobrenja")
    protected int modelOdobrenja;
    @XmlElement(name = "poziv_na_broj_odobrenja", required = true)
    protected String pozivNaBrojOdobrenja;
    @XmlElement(required = true)
    protected BigDecimal iznos;
    @XmlElement(required = true)
    protected Smer smer;

    /**
     * Gets the value of the duznik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuznik() {
        return duznik;
    }

    /**
     * Sets the value of the duznik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuznik(String value) {
        this.duznik = value;
    }

    /**
     * Gets the value of the svrhaPlacanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrhaPlacanja() {
        return svrhaPlacanja;
    }

    /**
     * Sets the value of the svrhaPlacanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrhaPlacanja(String value) {
        this.svrhaPlacanja = value;
    }

    /**
     * Gets the value of the primalac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimalac() {
        return primalac;
    }

    /**
     * Sets the value of the primalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimalac(String value) {
        this.primalac = value;
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
     * Gets the value of the datumValute property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumValute() {
        return datumValute;
    }

    /**
     * Sets the value of the datumValute property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumValute(XMLGregorianCalendar value) {
        this.datumValute = value;
    }

    /**
     * Gets the value of the racunDuznika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacunDuznika() {
        return racunDuznika;
    }

    /**
     * Sets the value of the racunDuznika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacunDuznika(String value) {
        this.racunDuznika = value;
    }

    /**
     * Gets the value of the modelZaduzenja property.
     * 
     */
    public int getModelZaduzenja() {
        return modelZaduzenja;
    }

    /**
     * Sets the value of the modelZaduzenja property.
     * 
     */
    public void setModelZaduzenja(int value) {
        this.modelZaduzenja = value;
    }

    /**
     * Gets the value of the pozivNaBrojZaduzenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozivNaBrojZaduzenja() {
        return pozivNaBrojZaduzenja;
    }

    /**
     * Sets the value of the pozivNaBrojZaduzenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozivNaBrojZaduzenja(String value) {
        this.pozivNaBrojZaduzenja = value;
    }

    /**
     * Gets the value of the racunPrimaoca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRacunPrimaoca() {
        return racunPrimaoca;
    }

    /**
     * Sets the value of the racunPrimaoca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRacunPrimaoca(String value) {
        this.racunPrimaoca = value;
    }

    /**
     * Gets the value of the modelOdobrenja property.
     * 
     */
    public int getModelOdobrenja() {
        return modelOdobrenja;
    }

    /**
     * Sets the value of the modelOdobrenja property.
     * 
     */
    public void setModelOdobrenja(int value) {
        this.modelOdobrenja = value;
    }

    /**
     * Gets the value of the pozivNaBrojOdobrenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozivNaBrojOdobrenja() {
        return pozivNaBrojOdobrenja;
    }

    /**
     * Sets the value of the pozivNaBrojOdobrenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozivNaBrojOdobrenja(String value) {
        this.pozivNaBrojOdobrenja = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIznos(BigDecimal value) {
        this.iznos = value;
    }

    /**
     * Gets the value of the smer property.
     * 
     * @return
     *     possible object is
     *     {@link Smer }
     *     
     */
    public Smer getSmer() {
        return smer;
    }

    /**
     * Sets the value of the smer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Smer }
     *     
     */
    public void setSmer(Smer value) {
        this.smer = value;
    }

}
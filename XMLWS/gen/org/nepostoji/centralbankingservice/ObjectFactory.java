
package org.nepostoji.centralbankingservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.nepostoji.centralbankingservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Rtgs_QNAME = new QName("http://www.nepostoji.org/CentralBankingService/", "rtgs");
    private final static QName _Poruka_QNAME = new QName("http://www.nepostoji.org/CentralBankingService/", "poruka");
    private final static QName _Clearing_QNAME = new QName("http://www.nepostoji.org/CentralBankingService/", "clearing");
    private final static QName _PorukaOZaduzenju_QNAME = new QName("http://www.nepostoji.org/CentralBankingService/", "poruka_o_zaduzenju");
    private final static QName _Odgovor_QNAME = new QName("http://www.nepostoji.org/CentralBankingService/", "odgovor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.nepostoji.centralbankingservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PogonskaPoruka }
     * 
     */
    public PogonskaPoruka createPogonskaPoruka() {
        return new PogonskaPoruka();
    }

    /**
     * Create an instance of {@link Rtgs }
     * 
     */
    public Rtgs createRtgs() {
        return new Rtgs();
    }

    /**
     * Create an instance of {@link Clearing }
     * 
     */
    public Clearing createClearing() {
        return new Clearing();
    }

    /**
     * Create an instance of {@link Zaduzenje }
     * 
     */
    public Zaduzenje createZaduzenje() {
        return new Zaduzenje();
    }

    /**
     * Create an instance of {@link org.nepostoji.centralbankingservice.Odgovor }
     * 
     */
    public org.nepostoji.centralbankingservice.Odgovor createOdgovor() {
        return new org.nepostoji.centralbankingservice.Odgovor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rtgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/CentralBankingService/", name = "rtgs")
    public JAXBElement<Rtgs> createRtgs(Rtgs value) {
        return new JAXBElement<Rtgs>(_Rtgs_QNAME, Rtgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PogonskaPoruka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/CentralBankingService/", name = "poruka")
    public JAXBElement<PogonskaPoruka> createPoruka(PogonskaPoruka value) {
        return new JAXBElement<PogonskaPoruka>(_Poruka_QNAME, PogonskaPoruka.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Clearing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/CentralBankingService/", name = "clearing")
    public JAXBElement<Clearing> createClearing(Clearing value) {
        return new JAXBElement<Clearing>(_Clearing_QNAME, Clearing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zaduzenje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/CentralBankingService/", name = "poruka_o_zaduzenju")
    public JAXBElement<Zaduzenje> createPorukaOZaduzenju(Zaduzenje value) {
        return new JAXBElement<Zaduzenje>(_PorukaOZaduzenju_QNAME, Zaduzenje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.example.odgovor.Odgovor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/CentralBankingService/", name = "odgovor")
    public JAXBElement<org.example.odgovor.Odgovor> createOdgovor(org.example.odgovor.Odgovor value) {
        return new JAXBElement<org.example.odgovor.Odgovor>(_Odgovor_QNAME, org.example.odgovor.Odgovor.class, null, value);
    }

}

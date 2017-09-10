
package org.nepostoji.paymentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.nepostoji.paymentservice package. 
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

    private final static QName _PrikaziPresjekResponse_QNAME = new QName("http://www.nepostoji.org/PaymentService/", "prikaziPresjekResponse");
    private final static QName _Odgovor_QNAME = new QName("http://www.nepostoji.org/PaymentService/", "odgovor");
    private final static QName _OdobriSredstvaClearing_QNAME = new QName("http://www.nepostoji.org/PaymentService/", "odobriSredstvaClearing");
    private final static QName _OdobriSredstvaRtgs_QNAME = new QName("http://www.nepostoji.org/PaymentService/", "odobriSredstvaRtgs");
    private final static QName _ObradiNalog_QNAME = new QName("http://www.nepostoji.org/PaymentService/", "obradiNalog");
    private final static QName _PogonskaPoruka_QNAME = new QName("http://www.nepostoji.org/PaymentService/", "pogonskaPoruka");
    private final static QName _PrikaziPresjek_QNAME = new QName("http://www.nepostoji.org/PaymentService/", "prikaziPresjek");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.nepostoji.paymentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PorukaOdobrenjaClearing }
     * 
     */
    public PorukaOdobrenjaClearing createPorukaOdobrenjaClearing() {
        return new PorukaOdobrenjaClearing();
    }

    /**
     * Create an instance of {@link PorukaOdobrenjaRtgs }
     * 
     */
    public PorukaOdobrenjaRtgs createPorukaOdobrenjaRtgs() {
        return new PorukaOdobrenjaRtgs();
    }

    /**
     * Create an instance of {@link PorukaZahtijevaPresjeka }
     * 
     */
    public PorukaZahtijevaPresjeka createPorukaZahtijevaPresjeka() {
        return new PorukaZahtijevaPresjeka();
    }

    /**
     * Create an instance of {@link Odgovor }
     * 
     */
    public Odgovor createOdgovor() {
        return new Odgovor();
    }

    /**
     * Create an instance of {@link PorukaPresjeka }
     * 
     */
    public PorukaPresjeka createPorukaPresjeka() {
        return new PorukaPresjeka();
    }

    /**
     * Create an instance of {@link PorukaNalogaPlacanja }
     * 
     */
    public PorukaNalogaPlacanja createPorukaNalogaPlacanja() {
        return new PorukaNalogaPlacanja();
    }

    /**
     * Create an instance of {@link PogonskaPoruka }
     * 
     */
    public PogonskaPoruka createPogonskaPoruka() {
        return new PogonskaPoruka();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PorukaPresjeka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/PaymentService/", name = "prikaziPresjekResponse")
    public JAXBElement<PorukaPresjeka> createPrikaziPresjekResponse(PorukaPresjeka value) {
        return new JAXBElement<PorukaPresjeka>(_PrikaziPresjekResponse_QNAME, PorukaPresjeka.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Odgovor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/PaymentService/", name = "odgovor")
    public JAXBElement<Odgovor> createOdgovor(Odgovor value) {
        return new JAXBElement<Odgovor>(_Odgovor_QNAME, Odgovor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PorukaOdobrenjaClearing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/PaymentService/", name = "odobriSredstvaClearing")
    public JAXBElement<PorukaOdobrenjaClearing> createOdobriSredstvaClearing(PorukaOdobrenjaClearing value) {
        return new JAXBElement<PorukaOdobrenjaClearing>(_OdobriSredstvaClearing_QNAME, PorukaOdobrenjaClearing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PorukaOdobrenjaRtgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/PaymentService/", name = "odobriSredstvaRtgs")
    public JAXBElement<PorukaOdobrenjaRtgs> createOdobriSredstvaRtgs(PorukaOdobrenjaRtgs value) {
        return new JAXBElement<PorukaOdobrenjaRtgs>(_OdobriSredstvaRtgs_QNAME, PorukaOdobrenjaRtgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PorukaNalogaPlacanja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/PaymentService/", name = "obradiNalog")
    public JAXBElement<PorukaNalogaPlacanja> createObradiNalog(PorukaNalogaPlacanja value) {
        return new JAXBElement<PorukaNalogaPlacanja>(_ObradiNalog_QNAME, PorukaNalogaPlacanja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PogonskaPoruka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/PaymentService/", name = "pogonskaPoruka")
    public JAXBElement<PogonskaPoruka> createPogonskaPoruka(PogonskaPoruka value) {
        return new JAXBElement<PogonskaPoruka>(_PogonskaPoruka_QNAME, PogonskaPoruka.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PorukaZahtijevaPresjeka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nepostoji.org/PaymentService/", name = "prikaziPresjek")
    public JAXBElement<PorukaZahtijevaPresjeka> createPrikaziPresjek(PorukaZahtijevaPresjeka value) {
        return new JAXBElement<PorukaZahtijevaPresjeka>(_PrikaziPresjek_QNAME, PorukaZahtijevaPresjeka.class, null, value);
    }

}

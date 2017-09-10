
package org.example.nalogzaplacanje;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.nalogzaplacanje package. 
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

    private final static QName _Nalog_QNAME = new QName("http://www.example.org/NalogZaPlacanje", "nalog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.nalogzaplacanje
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NalogZaPlacanje }
     * 
     */
    public NalogZaPlacanje createNalogZaPlacanje() {
        return new NalogZaPlacanje();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NalogZaPlacanje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/NalogZaPlacanje", name = "nalog")
    public JAXBElement<NalogZaPlacanje> createNalog(NalogZaPlacanje value) {
        return new JAXBElement<NalogZaPlacanje>(_Nalog_QNAME, NalogZaPlacanje.class, null, value);
    }

}

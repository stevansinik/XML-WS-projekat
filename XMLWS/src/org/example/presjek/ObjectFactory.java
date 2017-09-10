
package org.example.presjek;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.presjek package. 
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

    private final static QName _Presjek_QNAME = new QName("http://www.example.org/Presjek", "presjek");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.presjek
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Presjek }
     * 
     */
    public Presjek createPresjek() {
        return new Presjek();
    }

    /**
     * Create an instance of {@link Zaglavlje }
     * 
     */
    public Zaglavlje createZaglavlje() {
        return new Zaglavlje();
    }

    /**
     * Create an instance of {@link Stavka }
     * 
     */
    public Stavka createStavka() {
        return new Stavka();
    }

    /**
     * Create an instance of {@link Presjek.Stavke }
     * 
     */
    public Presjek.Stavke createPresjekStavke() {
        return new Presjek.Stavke();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Presjek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Presjek", name = "presjek")
    public JAXBElement<Presjek> createPresjek(Presjek value) {
        return new JAXBElement<Presjek>(_Presjek_QNAME, Presjek.class, null, value);
    }

}

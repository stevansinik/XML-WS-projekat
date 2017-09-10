
package org.example.zahtijevzaizvodom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.zahtijevzaizvodom package. 
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

    private final static QName _Zahtijev_QNAME = new QName("http://www.example.org/ZahtijevZaIzvodom", "zahtijev");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.zahtijevzaizvodom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Zahtijev }
     * 
     */
    public Zahtijev createZahtijev() {
        return new Zahtijev();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zahtijev }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/ZahtijevZaIzvodom", name = "zahtijev")
    public JAXBElement<Zahtijev> createZahtijev(Zahtijev value) {
        return new JAXBElement<Zahtijev>(_Zahtijev_QNAME, Zahtijev.class, null, value);
    }

}

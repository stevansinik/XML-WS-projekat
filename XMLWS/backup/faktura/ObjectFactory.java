//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.08 at 09:29:25 PM CEST 
//


package org.example.faktura;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.faktura package. 
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

    private final static QName _Faktura_QNAME = new QName("http://www.example.org/Faktura", "faktura");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.faktura
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Faktura }
     * 
     */
    public Faktura createFaktura() {
        return new Faktura();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Faktura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Faktura", name = "faktura")
    public JAXBElement<Faktura> createFaktura(Faktura value) {
        return new JAXBElement<Faktura>(_Faktura_QNAME, Faktura.class, null, value);
    }

}
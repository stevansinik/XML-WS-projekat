
package org.example.mt103;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.mt103 package. 
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

    private final static QName _Mt103_QNAME = new QName("http://www.example.org/MT103", "mt103");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.mt103
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MT103 }
     * 
     */
    public MT103 createMT103() {
        return new MT103();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MT103 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/MT103", name = "mt103")
    public JAXBElement<MT103> createMt103(MT103 value) {
        return new JAXBElement<MT103>(_Mt103_QNAME, MT103 .class, null, value);
    }

}

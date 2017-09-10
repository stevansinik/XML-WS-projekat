
package org.example.mt910;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.example.mt9xx.MT9XX;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.mt910 package. 
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

    private final static QName _Mt910_QNAME = new QName("http://www.example.org/MT910", "mt910");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.mt910
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MT9XX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/MT910", name = "mt910")
    public JAXBElement<MT9XX> createMt910(MT9XX value) {
        return new JAXBElement<MT9XX>(_Mt910_QNAME, MT9XX.class, null, value);
    }

}

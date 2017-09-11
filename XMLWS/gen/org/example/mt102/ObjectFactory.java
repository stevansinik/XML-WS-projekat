
package org.example.mt102;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.mt102 package. 
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

    private final static QName _Mt102_QNAME = new QName("http://www.example.org/MT102", "mt102");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.mt102
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MT102 }
     * 
     */
    public MT102 createMT102() {
        return new MT102();
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
     * Create an instance of {@link MT102 .Stavke }
     * 
     */
    public MT102 .Stavke createMT102Stavke() {
        return new MT102 .Stavke();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MT102 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/MT102", name = "mt102")
    public JAXBElement<MT102> createMt102(MT102 value) {
        return new JAXBElement<MT102>(_Mt102_QNAME, MT102 .class, null, value);
    }

}

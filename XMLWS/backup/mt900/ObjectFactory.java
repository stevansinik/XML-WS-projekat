//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.08 at 09:29:27 PM CEST 
//


package org.example.mt900;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.example.mt9xx.MT9XX;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.mt900 package. 
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

    private final static QName _MT900_QNAME = new QName("http://www.example.org/MT900", "MT900");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.mt900
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MT9XX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/MT900", name = "MT900")
    public JAXBElement<MT9XX> createMT900(MT9XX value) {
        return new JAXBElement<MT9XX>(_MT900_QNAME, MT9XX.class, null, value);
    }

}

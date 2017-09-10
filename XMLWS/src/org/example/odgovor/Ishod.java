
package org.example.odgovor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ishod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Ishod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USPJESAN"/>
 *     &lt;enumeration value="NEUSPJESAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Ishod")
@XmlEnum
public enum Ishod {

    USPJESAN,
    NEUSPJESAN;

    public String value() {
        return name();
    }

    public static Ishod fromValue(String v) {
        return valueOf(v);
    }

}

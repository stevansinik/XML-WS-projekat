
package org.example.presjek;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for smer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="smer">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="t"/>
 *     &lt;enumeration value="k"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "smer")
@XmlEnum
public enum Smer {

    @XmlEnumValue("t")
    T("t"),
    @XmlEnumValue("k")
    K("k");
    private final String value;

    Smer(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Smer fromValue(String v) {
        for (Smer c: Smer.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

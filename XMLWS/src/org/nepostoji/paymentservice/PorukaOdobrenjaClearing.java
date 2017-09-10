
package org.nepostoji.paymentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.mt102.MT102;
import org.example.mt9xx.MT9XX;


/**
 * <p>Java class for PorukaOdobrenjaClearing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PorukaOdobrenjaClearing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/MT910}mt910"/>
 *         &lt;element ref="{http://www.example.org/MT102}mt102"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PorukaOdobrenjaClearing", propOrder = {
    "mt910",
    "mt102"
})
public class PorukaOdobrenjaClearing {

    @XmlElement(namespace = "http://www.example.org/MT910", required = true)
    protected MT9XX mt910;
    @XmlElement(namespace = "http://www.example.org/MT102", required = true)
    protected MT102 mt102;

    /**
     * Gets the value of the mt910 property.
     * 
     * @return
     *     possible object is
     *     {@link MT9XX }
     *     
     */
    public MT9XX getMt910() {
        return mt910;
    }

    /**
     * Sets the value of the mt910 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MT9XX }
     *     
     */
    public void setMt910(MT9XX value) {
        this.mt910 = value;
    }

    /**
     * Gets the value of the mt102 property.
     * 
     * @return
     *     possible object is
     *     {@link MT102 }
     *     
     */
    public MT102 getMt102() {
        return mt102;
    }

    /**
     * Sets the value of the mt102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MT102 }
     *     
     */
    public void setMt102(MT102 value) {
        this.mt102 = value;
    }

}

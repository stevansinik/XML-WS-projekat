
package org.nepostoji.paymentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.mt103.MT103;
import org.example.mt9xx.MT9XX;


/**
 * <p>Java class for PorukaOdobrenjaRtgs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PorukaOdobrenjaRtgs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/MT910}mt910"/>
 *         &lt;element ref="{http://www.example.org/MT103}mt103"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PorukaOdobrenjaRtgs", propOrder = {
    "mt910",
    "mt103"
})
public class PorukaOdobrenjaRtgs {

    @XmlElement(namespace = "http://www.example.org/MT910", required = true)
    protected MT9XX mt910;
    @XmlElement(namespace = "http://www.example.org/MT103", required = true)
    protected MT103 mt103;

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
     * Gets the value of the mt103 property.
     * 
     * @return
     *     possible object is
     *     {@link MT103 }
     *     
     */
    public MT103 getMt103() {
        return mt103;
    }

    /**
     * Sets the value of the mt103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MT103 }
     *     
     */
    public void setMt103(MT103 value) {
        this.mt103 = value;
    }

}

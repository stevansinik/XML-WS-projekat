
package org.nepostoji.centralbankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.example.mt9xx.MT9XX;


/**
 * <p>Java class for Zaduzenje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Zaduzenje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/MT900}mt900"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zaduzenje", propOrder = {
    "mt900"
})
public class Zaduzenje {

    @XmlElement(namespace = "http://www.example.org/MT900", required = true)
    protected MT9XX mt900;

    /**
     * Gets the value of the mt900 property.
     * 
     * @return
     *     possible object is
     *     {@link MT9XX }
     *     
     */
    public MT9XX getMt900() {
        return mt900;
    }

    /**
     * Sets the value of the mt900 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MT9XX }
     *     
     */
    public void setMt900(MT9XX value) {
        this.mt900 = value;
    }

}

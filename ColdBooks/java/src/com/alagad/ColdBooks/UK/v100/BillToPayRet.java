//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:51:25 PM EDT 
//


package com.alagad.ColdBooks.UK.v100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}BillToPay"/>
 *           &lt;element ref="{}CreditToApply"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "billToPay",
    "creditToApply"
})
@XmlRootElement(name = "BillToPayRet")
public class BillToPayRet {

    @XmlElement(name = "BillToPay")
    protected BillToPay billToPay;
    @XmlElement(name = "CreditToApply")
    protected CreditToApply creditToApply;

    /**
     * Gets the value of the billToPay property.
     * 
     * @return
     *     possible object is
     *     {@link BillToPay }
     *     
     */
    public BillToPay getBillToPay() {
        return billToPay;
    }

    /**
     * Sets the value of the billToPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillToPay }
     *     
     */
    public void setBillToPay(BillToPay value) {
        this.billToPay = value;
    }

    /**
     * Gets the value of the creditToApply property.
     * 
     * @return
     *     possible object is
     *     {@link CreditToApply }
     *     
     */
    public CreditToApply getCreditToApply() {
        return creditToApply;
    }

    /**
     * Sets the value of the creditToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditToApply }
     *     
     */
    public void setCreditToApply(CreditToApply value) {
        this.creditToApply = value;
    }

}

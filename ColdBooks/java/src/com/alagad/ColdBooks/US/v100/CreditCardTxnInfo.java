//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:49:51 PM EDT 
//


package com.alagad.ColdBooks.US.v100;

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
 *         &lt;element ref="{}CreditCardTxnInputInfo"/>
 *         &lt;element ref="{}CreditCardTxnResultInfo"/>
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
    "creditCardTxnInputInfo",
    "creditCardTxnResultInfo"
})
@XmlRootElement(name = "CreditCardTxnInfo")
public class CreditCardTxnInfo {

    @XmlElement(name = "CreditCardTxnInputInfo", required = true)
    protected CreditCardTxnInputInfo creditCardTxnInputInfo;
    @XmlElement(name = "CreditCardTxnResultInfo", required = true)
    protected CreditCardTxnResultInfo creditCardTxnResultInfo;

    /**
     * Gets the value of the creditCardTxnInputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTxnInputInfo }
     *     
     */
    public CreditCardTxnInputInfo getCreditCardTxnInputInfo() {
        return creditCardTxnInputInfo;
    }

    /**
     * Sets the value of the creditCardTxnInputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTxnInputInfo }
     *     
     */
    public void setCreditCardTxnInputInfo(CreditCardTxnInputInfo value) {
        this.creditCardTxnInputInfo = value;
    }

    /**
     * Gets the value of the creditCardTxnResultInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTxnResultInfo }
     *     
     */
    public CreditCardTxnResultInfo getCreditCardTxnResultInfo() {
        return creditCardTxnResultInfo;
    }

    /**
     * Sets the value of the creditCardTxnResultInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTxnResultInfo }
     *     
     */
    public void setCreditCardTxnResultInfo(CreditCardTxnResultInfo value) {
        this.creditCardTxnResultInfo = value;
    }

}

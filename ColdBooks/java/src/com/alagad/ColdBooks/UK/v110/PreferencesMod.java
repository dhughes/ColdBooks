//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

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
 *         &lt;element ref="{}AccountingPreferencesMod"/>
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
    "accountingPreferencesMod"
})
@XmlRootElement(name = "PreferencesMod")
public class PreferencesMod {

    @XmlElement(name = "AccountingPreferencesMod", required = true)
    protected AccountingPreferencesMod accountingPreferencesMod;

    /**
     * Gets the value of the accountingPreferencesMod property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPreferencesMod }
     *     
     */
    public AccountingPreferencesMod getAccountingPreferencesMod() {
        return accountingPreferencesMod;
    }

    /**
     * Sets the value of the accountingPreferencesMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPreferencesMod }
     *     
     */
    public void setAccountingPreferencesMod(AccountingPreferencesMod value) {
        this.accountingPreferencesMod = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:40 PM EDT 
//


package com.alagad.ColdBooks.CA.v110;

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
 *         &lt;element ref="{}ClosingDate" minOccurs="0"/>
 *         &lt;element name="ClosingDatePassword" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "closingDate",
    "closingDatePassword"
})
@XmlRootElement(name = "AccountingPreferencesMod")
public class AccountingPreferencesMod {

    @XmlElement(name = "ClosingDate")
    protected String closingDate;
    @XmlElement(name = "ClosingDatePassword")
    protected String closingDatePassword;

    /**
     * Gets the value of the closingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingDate() {
        return closingDate;
    }

    /**
     * Sets the value of the closingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingDate(String value) {
        this.closingDate = value;
    }

    /**
     * Gets the value of the closingDatePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingDatePassword() {
        return closingDatePassword;
    }

    /**
     * Sets the value of the closingDatePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingDatePassword(String value) {
        this.closingDatePassword = value;
    }

}

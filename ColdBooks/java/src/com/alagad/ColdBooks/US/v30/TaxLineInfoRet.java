//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:02:35 PM EST 
//


package com.alagad.ColdBooks.US.v30;

import java.math.BigInteger;
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
 *         &lt;element ref="{}TaxLineID"/>
 *         &lt;element name="TaxLineName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="256"/>
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
    "taxLineID",
    "taxLineName"
})
@XmlRootElement(name = "TaxLineInfoRet")
public class TaxLineInfoRet {

    @XmlElement(name = "TaxLineID", required = true)
    protected BigInteger taxLineID;
    @XmlElement(name = "TaxLineName")
    protected String taxLineName;

    /**
     * Gets the value of the taxLineID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxLineID() {
        return taxLineID;
    }

    /**
     * Sets the value of the taxLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxLineID(BigInteger value) {
        this.taxLineID = value;
    }

    /**
     * Gets the value of the taxLineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLineName() {
        return taxLineName;
    }

    /**
     * Sets the value of the taxLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLineName(String value) {
        this.taxLineName = value;
    }

}
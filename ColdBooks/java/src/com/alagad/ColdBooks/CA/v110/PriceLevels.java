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
 *         &lt;element ref="{}IsUsingPriceLevels"/>
 *         &lt;element ref="{}IsRoundingSalesPriceUp" minOccurs="0"/>
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
    "isUsingPriceLevels",
    "isRoundingSalesPriceUp"
})
@XmlRootElement(name = "PriceLevels")
public class PriceLevels {

    @XmlElement(name = "IsUsingPriceLevels", required = true)
    protected String isUsingPriceLevels;
    @XmlElement(name = "IsRoundingSalesPriceUp")
    protected String isRoundingSalesPriceUp;

    /**
     * Gets the value of the isUsingPriceLevels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUsingPriceLevels() {
        return isUsingPriceLevels;
    }

    /**
     * Sets the value of the isUsingPriceLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUsingPriceLevels(String value) {
        this.isUsingPriceLevels = value;
    }

    /**
     * Gets the value of the isRoundingSalesPriceUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRoundingSalesPriceUp() {
        return isRoundingSalesPriceUp;
    }

    /**
     * Sets the value of the isRoundingSalesPriceUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRoundingSalesPriceUp(String value) {
        this.isRoundingSalesPriceUp = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:59:09 PM EST 
//


package com.alagad.ColdBooks.CA.v70;

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
 *         &lt;element ref="{}IsUsingInventory"/>
 *         &lt;element ref="{}DaysBillsAreDue"/>
 *         &lt;element ref="{}IsAutomaticallyUsingDiscounts"/>
 *         &lt;element ref="{}DefaultDiscountAccountRef" minOccurs="0"/>
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
    "isUsingInventory",
    "daysBillsAreDue",
    "isAutomaticallyUsingDiscounts",
    "defaultDiscountAccountRef"
})
@XmlRootElement(name = "PurchasesAndVendorsPreferences")
public class PurchasesAndVendorsPreferences {

    @XmlElement(name = "IsUsingInventory", required = true)
    protected String isUsingInventory;
    @XmlElement(name = "DaysBillsAreDue", required = true)
    protected BigInteger daysBillsAreDue;
    @XmlElement(name = "IsAutomaticallyUsingDiscounts", required = true)
    protected String isAutomaticallyUsingDiscounts;
    @XmlElement(name = "DefaultDiscountAccountRef")
    protected DefaultDiscountAccountRef defaultDiscountAccountRef;

    /**
     * Gets the value of the isUsingInventory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUsingInventory() {
        return isUsingInventory;
    }

    /**
     * Sets the value of the isUsingInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUsingInventory(String value) {
        this.isUsingInventory = value;
    }

    /**
     * Gets the value of the daysBillsAreDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysBillsAreDue() {
        return daysBillsAreDue;
    }

    /**
     * Sets the value of the daysBillsAreDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysBillsAreDue(BigInteger value) {
        this.daysBillsAreDue = value;
    }

    /**
     * Gets the value of the isAutomaticallyUsingDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAutomaticallyUsingDiscounts() {
        return isAutomaticallyUsingDiscounts;
    }

    /**
     * Sets the value of the isAutomaticallyUsingDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAutomaticallyUsingDiscounts(String value) {
        this.isAutomaticallyUsingDiscounts = value;
    }

    /**
     * Gets the value of the defaultDiscountAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDiscountAccountRef }
     *     
     */
    public DefaultDiscountAccountRef getDefaultDiscountAccountRef() {
        return defaultDiscountAccountRef;
    }

    /**
     * Sets the value of the defaultDiscountAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDiscountAccountRef }
     *     
     */
    public void setDefaultDiscountAccountRef(DefaultDiscountAccountRef value) {
        this.defaultDiscountAccountRef = value;
    }

}

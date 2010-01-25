//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:02:17 PM EST 
//


package com.alagad.ColdBooks.US.v20;

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
 *         &lt;element name="SalesDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}SalesPrice" minOccurs="0"/>
 *         &lt;element ref="{}IncomeAccountRef"/>
 *         &lt;element name="PurchaseDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}PurchaseCost" minOccurs="0"/>
 *         &lt;element ref="{}ExpenseAccountRef"/>
 *         &lt;element ref="{}PrefVendorRef" minOccurs="0"/>
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
    "salesDesc",
    "salesPrice",
    "incomeAccountRef",
    "purchaseDesc",
    "purchaseCost",
    "expenseAccountRef",
    "prefVendorRef"
})
@XmlRootElement(name = "SalesAndPurchase")
public class SalesAndPurchase {

    @XmlElement(name = "SalesDesc")
    protected String salesDesc;
    @XmlElement(name = "SalesPrice")
    protected String salesPrice;
    @XmlElement(name = "IncomeAccountRef", required = true)
    protected IncomeAccountRef incomeAccountRef;
    @XmlElement(name = "PurchaseDesc")
    protected String purchaseDesc;
    @XmlElement(name = "PurchaseCost")
    protected String purchaseCost;
    @XmlElement(name = "ExpenseAccountRef", required = true)
    protected ExpenseAccountRef expenseAccountRef;
    @XmlElement(name = "PrefVendorRef")
    protected PrefVendorRef prefVendorRef;

    /**
     * Gets the value of the salesDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDesc() {
        return salesDesc;
    }

    /**
     * Sets the value of the salesDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDesc(String value) {
        this.salesDesc = value;
    }

    /**
     * Gets the value of the salesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPrice(String value) {
        this.salesPrice = value;
    }

    /**
     * Gets the value of the incomeAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeAccountRef }
     *     
     */
    public IncomeAccountRef getIncomeAccountRef() {
        return incomeAccountRef;
    }

    /**
     * Sets the value of the incomeAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeAccountRef }
     *     
     */
    public void setIncomeAccountRef(IncomeAccountRef value) {
        this.incomeAccountRef = value;
    }

    /**
     * Gets the value of the purchaseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDesc() {
        return purchaseDesc;
    }

    /**
     * Sets the value of the purchaseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDesc(String value) {
        this.purchaseDesc = value;
    }

    /**
     * Gets the value of the purchaseCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseCost() {
        return purchaseCost;
    }

    /**
     * Sets the value of the purchaseCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseCost(String value) {
        this.purchaseCost = value;
    }

    /**
     * Gets the value of the expenseAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseAccountRef }
     *     
     */
    public ExpenseAccountRef getExpenseAccountRef() {
        return expenseAccountRef;
    }

    /**
     * Sets the value of the expenseAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseAccountRef }
     *     
     */
    public void setExpenseAccountRef(ExpenseAccountRef value) {
        this.expenseAccountRef = value;
    }

    /**
     * Gets the value of the prefVendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link PrefVendorRef }
     *     
     */
    public PrefVendorRef getPrefVendorRef() {
        return prefVendorRef;
    }

    /**
     * Sets the value of the prefVendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefVendorRef }
     *     
     */
    public void setPrefVendorRef(PrefVendorRef value) {
        this.prefVendorRef = value;
    }

}

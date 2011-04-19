//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:50:28 PM EDT 
//


package com.alagad.ColdBooks.US.v110;

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
 *         &lt;element ref="{}TxnLineID"/>
 *         &lt;element ref="{}ItemRef" minOccurs="0"/>
 *         &lt;element ref="{}InventorySiteRef" minOccurs="0"/>
 *         &lt;element name="Desc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}Quantity" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}OverrideUOMSetRef" minOccurs="0"/>
 *         &lt;element ref="{}Cost" minOccurs="0"/>
 *         &lt;element ref="{}Amount" minOccurs="0"/>
 *         &lt;element ref="{}TaxAmount" minOccurs="0"/>
 *         &lt;element ref="{}CustomerRef" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}BillableStatus" minOccurs="0"/>
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
    "txnLineID",
    "itemRef",
    "inventorySiteRef",
    "desc",
    "quantity",
    "unitOfMeasure",
    "overrideUOMSetRef",
    "cost",
    "amount",
    "taxAmount",
    "customerRef",
    "classRef",
    "salesTaxCodeRef",
    "billableStatus"
})
@XmlRootElement(name = "ItemLineRet")
public class ItemLineRet {

    @XmlElement(name = "TxnLineID", required = true)
    protected String txnLineID;
    @XmlElement(name = "ItemRef")
    protected ItemRef itemRef;
    @XmlElement(name = "InventorySiteRef")
    protected InventorySiteRef inventorySiteRef;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "OverrideUOMSetRef")
    protected OverrideUOMSetRef overrideUOMSetRef;
    @XmlElement(name = "Cost")
    protected String cost;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "CustomerRef")
    protected CustomerRef customerRef;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "BillableStatus")
    protected String billableStatus;

    /**
     * Gets the value of the txnLineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnLineID() {
        return txnLineID;
    }

    /**
     * Sets the value of the txnLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnLineID(String value) {
        this.txnLineID = value;
    }

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRef }
     *     
     */
    public ItemRef getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRef }
     *     
     */
    public void setItemRef(ItemRef value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the inventorySiteRef property.
     * 
     * @return
     *     possible object is
     *     {@link InventorySiteRef }
     *     
     */
    public InventorySiteRef getInventorySiteRef() {
        return inventorySiteRef;
    }

    /**
     * Sets the value of the inventorySiteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventorySiteRef }
     *     
     */
    public void setInventorySiteRef(InventorySiteRef value) {
        this.inventorySiteRef = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the overrideUOMSetRef property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideUOMSetRef }
     *     
     */
    public OverrideUOMSetRef getOverrideUOMSetRef() {
        return overrideUOMSetRef;
    }

    /**
     * Sets the value of the overrideUOMSetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideUOMSetRef }
     *     
     */
    public void setOverrideUOMSetRef(OverrideUOMSetRef value) {
        this.overrideUOMSetRef = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRef }
     *     
     */
    public CustomerRef getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRef }
     *     
     */
    public void setCustomerRef(CustomerRef value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRef }
     *     
     */
    public ClassRef getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRef }
     *     
     */
    public void setClassRef(ClassRef value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the salesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxCodeRef }
     *     
     */
    public SalesTaxCodeRef getSalesTaxCodeRef() {
        return salesTaxCodeRef;
    }

    /**
     * Sets the value of the salesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxCodeRef }
     *     
     */
    public void setSalesTaxCodeRef(SalesTaxCodeRef value) {
        this.salesTaxCodeRef = value;
    }

    /**
     * Gets the value of the billableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillableStatus() {
        return billableStatus;
    }

    /**
     * Sets the value of the billableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillableStatus(String value) {
        this.billableStatus = value;
    }

}

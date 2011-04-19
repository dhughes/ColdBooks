//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="TxnLineID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>IDTYPE">
 *                 &lt;attribute name="useMacro" type="{}MACROTYPE" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}ItemRef" minOccurs="0"/>
 *         &lt;element name="ManufacturerPartNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element ref="{}Rate" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}Amount" minOccurs="0"/>
 *         &lt;element ref="{}TaxAmount" minOccurs="0"/>
 *         &lt;element ref="{}CustomerRef" minOccurs="0"/>
 *         &lt;element ref="{}ServiceDate" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}IsManuallyClosed" minOccurs="0"/>
 *         &lt;element ref="{}OverrideItemAccountRef" minOccurs="0"/>
 *         &lt;element name="Other1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="29"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="29"/>
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
    "txnLineID",
    "itemRef",
    "manufacturerPartNumber",
    "desc",
    "quantity",
    "unitOfMeasure",
    "overrideUOMSetRef",
    "rate",
    "classRef",
    "amount",
    "taxAmount",
    "customerRef",
    "serviceDate",
    "salesTaxCodeRef",
    "isManuallyClosed",
    "overrideItemAccountRef",
    "other1",
    "other2"
})
@XmlRootElement(name = "PurchaseOrderLineMod")
public class PurchaseOrderLineMod {

    @XmlElement(name = "TxnLineID", required = true)
    protected PurchaseOrderLineMod.TxnLineID txnLineID;
    @XmlElement(name = "ItemRef")
    protected ItemRef itemRef;
    @XmlElement(name = "ManufacturerPartNumber")
    protected String manufacturerPartNumber;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "OverrideUOMSetRef")
    protected OverrideUOMSetRef overrideUOMSetRef;
    @XmlElement(name = "Rate")
    protected String rate;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "CustomerRef")
    protected CustomerRef customerRef;
    @XmlElement(name = "ServiceDate")
    protected String serviceDate;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "IsManuallyClosed")
    protected String isManuallyClosed;
    @XmlElement(name = "OverrideItemAccountRef")
    protected OverrideItemAccountRef overrideItemAccountRef;
    @XmlElement(name = "Other1")
    protected String other1;
    @XmlElement(name = "Other2")
    protected String other2;

    /**
     * Gets the value of the txnLineID property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderLineMod.TxnLineID }
     *     
     */
    public PurchaseOrderLineMod.TxnLineID getTxnLineID() {
        return txnLineID;
    }

    /**
     * Sets the value of the txnLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderLineMod.TxnLineID }
     *     
     */
    public void setTxnLineID(PurchaseOrderLineMod.TxnLineID value) {
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
     * Gets the value of the manufacturerPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    /**
     * Sets the value of the manufacturerPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerPartNumber(String value) {
        this.manufacturerPartNumber = value;
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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
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
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(String value) {
        this.serviceDate = value;
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
     * Gets the value of the isManuallyClosed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsManuallyClosed() {
        return isManuallyClosed;
    }

    /**
     * Sets the value of the isManuallyClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsManuallyClosed(String value) {
        this.isManuallyClosed = value;
    }

    /**
     * Gets the value of the overrideItemAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideItemAccountRef }
     *     
     */
    public OverrideItemAccountRef getOverrideItemAccountRef() {
        return overrideItemAccountRef;
    }

    /**
     * Sets the value of the overrideItemAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideItemAccountRef }
     *     
     */
    public void setOverrideItemAccountRef(OverrideItemAccountRef value) {
        this.overrideItemAccountRef = value;
    }

    /**
     * Gets the value of the other1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther1() {
        return other1;
    }

    /**
     * Sets the value of the other1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther1(String value) {
        this.other1 = value;
    }

    /**
     * Gets the value of the other2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther2() {
        return other2;
    }

    /**
     * Sets the value of the other2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther2(String value) {
        this.other2 = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>IDTYPE">
     *       &lt;attribute name="useMacro" type="{}MACROTYPE" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TxnLineID {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected String useMacro;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the useMacro property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseMacro() {
            return useMacro;
        }

        /**
         * Sets the value of the useMacro property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseMacro(String value) {
            this.useMacro = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:51:25 PM EDT 
//


package com.alagad.ColdBooks.UK.v100;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="TxnID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>IDTYPE">
 *                 &lt;attribute name="useMacro" type="{}MACROTYPE" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EditSequence">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}CustomerRef" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}TemplateRef" minOccurs="0"/>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element name="RefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}BillAddress" minOccurs="0"/>
 *         &lt;element ref="{}ShipAddress" minOccurs="0"/>
 *         &lt;element ref="{}IsPending" minOccurs="0"/>
 *         &lt;element name="CheckNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}PaymentMethodRef" minOccurs="0"/>
 *         &lt;element ref="{}DueDate" minOccurs="0"/>
 *         &lt;element ref="{}SalesRepRef" minOccurs="0"/>
 *         &lt;element ref="{}ShipDate" minOccurs="0"/>
 *         &lt;element ref="{}ShipMethodRef" minOccurs="0"/>
 *         &lt;element name="FOB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}ItemSalesTaxRef" minOccurs="0"/>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}CustomerMsgRef" minOccurs="0"/>
 *         &lt;element ref="{}IsToBePrinted" minOccurs="0"/>
 *         &lt;element ref="{}IsToBeEmailed" minOccurs="0"/>
 *         &lt;element ref="{}IsTaxIncluded" minOccurs="0"/>
 *         &lt;element ref="{}CustomerSalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}DepositToAccountRef" minOccurs="0"/>
 *         &lt;element name="Other" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="29"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}ExchangeRate" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}SalesReceiptLineMod"/>
 *           &lt;element ref="{}SalesReceiptLineGroupMod"/>
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
    "txnID",
    "editSequence",
    "customerRef",
    "classRef",
    "templateRef",
    "txnDate",
    "refNumber",
    "billAddress",
    "shipAddress",
    "isPending",
    "checkNumber",
    "paymentMethodRef",
    "dueDate",
    "salesRepRef",
    "shipDate",
    "shipMethodRef",
    "fob",
    "itemSalesTaxRef",
    "memo",
    "customerMsgRef",
    "isToBePrinted",
    "isToBeEmailed",
    "isTaxIncluded",
    "customerSalesTaxCodeRef",
    "depositToAccountRef",
    "other",
    "exchangeRate",
    "salesReceiptLineModOrSalesReceiptLineGroupMod"
})
@XmlRootElement(name = "SalesReceiptMod")
public class SalesReceiptMod {

    @XmlElement(name = "TxnID", required = true)
    protected SalesReceiptMod.TxnID txnID;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "CustomerRef")
    protected CustomerRef customerRef;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "TemplateRef")
    protected TemplateRef templateRef;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "BillAddress")
    protected BillAddress billAddress;
    @XmlElement(name = "ShipAddress")
    protected ShipAddress shipAddress;
    @XmlElement(name = "IsPending")
    protected String isPending;
    @XmlElement(name = "CheckNumber")
    protected String checkNumber;
    @XmlElement(name = "PaymentMethodRef")
    protected PaymentMethodRef paymentMethodRef;
    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "SalesRepRef")
    protected SalesRepRef salesRepRef;
    @XmlElement(name = "ShipDate")
    protected String shipDate;
    @XmlElement(name = "ShipMethodRef")
    protected ShipMethodRef shipMethodRef;
    @XmlElement(name = "FOB")
    protected String fob;
    @XmlElement(name = "ItemSalesTaxRef")
    protected ItemSalesTaxRef itemSalesTaxRef;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "CustomerMsgRef")
    protected CustomerMsgRef customerMsgRef;
    @XmlElement(name = "IsToBePrinted")
    protected String isToBePrinted;
    @XmlElement(name = "IsToBeEmailed")
    protected String isToBeEmailed;
    @XmlElement(name = "IsTaxIncluded")
    protected String isTaxIncluded;
    @XmlElement(name = "CustomerSalesTaxCodeRef")
    protected CustomerSalesTaxCodeRef customerSalesTaxCodeRef;
    @XmlElement(name = "DepositToAccountRef")
    protected DepositToAccountRef depositToAccountRef;
    @XmlElement(name = "Other")
    protected String other;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElements({
        @XmlElement(name = "SalesReceiptLineGroupMod", type = SalesReceiptLineGroupMod.class),
        @XmlElement(name = "SalesReceiptLineMod", type = SalesReceiptLineMod.class)
    })
    protected List<Object> salesReceiptLineModOrSalesReceiptLineGroupMod;

    /**
     * Gets the value of the txnID property.
     * 
     * @return
     *     possible object is
     *     {@link SalesReceiptMod.TxnID }
     *     
     */
    public SalesReceiptMod.TxnID getTxnID() {
        return txnID;
    }

    /**
     * Sets the value of the txnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesReceiptMod.TxnID }
     *     
     */
    public void setTxnID(SalesReceiptMod.TxnID value) {
        this.txnID = value;
    }

    /**
     * Gets the value of the editSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditSequence() {
        return editSequence;
    }

    /**
     * Sets the value of the editSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditSequence(String value) {
        this.editSequence = value;
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
     * Gets the value of the templateRef property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateRef }
     *     
     */
    public TemplateRef getTemplateRef() {
        return templateRef;
    }

    /**
     * Sets the value of the templateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateRef }
     *     
     */
    public void setTemplateRef(TemplateRef value) {
        this.templateRef = value;
    }

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(String value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNumber(String value) {
        this.refNumber = value;
    }

    /**
     * Gets the value of the billAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BillAddress }
     *     
     */
    public BillAddress getBillAddress() {
        return billAddress;
    }

    /**
     * Sets the value of the billAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillAddress }
     *     
     */
    public void setBillAddress(BillAddress value) {
        this.billAddress = value;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipAddress }
     *     
     */
    public ShipAddress getShipAddress() {
        return shipAddress;
    }

    /**
     * Sets the value of the shipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipAddress }
     *     
     */
    public void setShipAddress(ShipAddress value) {
        this.shipAddress = value;
    }

    /**
     * Gets the value of the isPending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPending() {
        return isPending;
    }

    /**
     * Sets the value of the isPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPending(String value) {
        this.isPending = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the paymentMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodRef }
     *     
     */
    public PaymentMethodRef getPaymentMethodRef() {
        return paymentMethodRef;
    }

    /**
     * Sets the value of the paymentMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodRef }
     *     
     */
    public void setPaymentMethodRef(PaymentMethodRef value) {
        this.paymentMethodRef = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the salesRepRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRepRef }
     *     
     */
    public SalesRepRef getSalesRepRef() {
        return salesRepRef;
    }

    /**
     * Sets the value of the salesRepRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRepRef }
     *     
     */
    public void setSalesRepRef(SalesRepRef value) {
        this.salesRepRef = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipDate(String value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shipMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link ShipMethodRef }
     *     
     */
    public ShipMethodRef getShipMethodRef() {
        return shipMethodRef;
    }

    /**
     * Sets the value of the shipMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipMethodRef }
     *     
     */
    public void setShipMethodRef(ShipMethodRef value) {
        this.shipMethodRef = value;
    }

    /**
     * Gets the value of the fob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOB() {
        return fob;
    }

    /**
     * Sets the value of the fob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOB(String value) {
        this.fob = value;
    }

    /**
     * Gets the value of the itemSalesTaxRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSalesTaxRef }
     *     
     */
    public ItemSalesTaxRef getItemSalesTaxRef() {
        return itemSalesTaxRef;
    }

    /**
     * Sets the value of the itemSalesTaxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSalesTaxRef }
     *     
     */
    public void setItemSalesTaxRef(ItemSalesTaxRef value) {
        this.itemSalesTaxRef = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the customerMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMsgRef }
     *     
     */
    public CustomerMsgRef getCustomerMsgRef() {
        return customerMsgRef;
    }

    /**
     * Sets the value of the customerMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMsgRef }
     *     
     */
    public void setCustomerMsgRef(CustomerMsgRef value) {
        this.customerMsgRef = value;
    }

    /**
     * Gets the value of the isToBePrinted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsToBePrinted() {
        return isToBePrinted;
    }

    /**
     * Sets the value of the isToBePrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsToBePrinted(String value) {
        this.isToBePrinted = value;
    }

    /**
     * Gets the value of the isToBeEmailed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsToBeEmailed() {
        return isToBeEmailed;
    }

    /**
     * Sets the value of the isToBeEmailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsToBeEmailed(String value) {
        this.isToBeEmailed = value;
    }

    /**
     * Gets the value of the isTaxIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTaxIncluded() {
        return isTaxIncluded;
    }

    /**
     * Sets the value of the isTaxIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTaxIncluded(String value) {
        this.isTaxIncluded = value;
    }

    /**
     * Gets the value of the customerSalesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSalesTaxCodeRef }
     *     
     */
    public CustomerSalesTaxCodeRef getCustomerSalesTaxCodeRef() {
        return customerSalesTaxCodeRef;
    }

    /**
     * Sets the value of the customerSalesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSalesTaxCodeRef }
     *     
     */
    public void setCustomerSalesTaxCodeRef(CustomerSalesTaxCodeRef value) {
        this.customerSalesTaxCodeRef = value;
    }

    /**
     * Gets the value of the depositToAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link DepositToAccountRef }
     *     
     */
    public DepositToAccountRef getDepositToAccountRef() {
        return depositToAccountRef;
    }

    /**
     * Sets the value of the depositToAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositToAccountRef }
     *     
     */
    public void setDepositToAccountRef(DepositToAccountRef value) {
        this.depositToAccountRef = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the salesReceiptLineModOrSalesReceiptLineGroupMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesReceiptLineModOrSalesReceiptLineGroupMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesReceiptLineModOrSalesReceiptLineGroupMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesReceiptLineGroupMod }
     * {@link SalesReceiptLineMod }
     * 
     * 
     */
    public List<Object> getSalesReceiptLineModOrSalesReceiptLineGroupMod() {
        if (salesReceiptLineModOrSalesReceiptLineGroupMod == null) {
            salesReceiptLineModOrSalesReceiptLineGroupMod = new ArrayList<Object>();
        }
        return this.salesReceiptLineModOrSalesReceiptLineGroupMod;
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
    public static class TxnID {

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

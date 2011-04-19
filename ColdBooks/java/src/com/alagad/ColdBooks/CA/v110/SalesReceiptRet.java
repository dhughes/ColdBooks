//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:40 PM EDT 
//


package com.alagad.ColdBooks.CA.v110;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;group ref="{}TxnCore"/>
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
 *         &lt;element ref="{}BillAddressBlock" minOccurs="0"/>
 *         &lt;element ref="{}ShipAddress" minOccurs="0"/>
 *         &lt;element ref="{}ShipAddressBlock" minOccurs="0"/>
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
 *         &lt;element ref="{}Subtotal" minOccurs="0"/>
 *         &lt;group ref="{}SalesTaxData"/>
 *         &lt;element ref="{}TotalAmount" minOccurs="0"/>
 *         &lt;element ref="{}CurrencyRef" minOccurs="0"/>
 *         &lt;element ref="{}ExchangeRate" minOccurs="0"/>
 *         &lt;element ref="{}TotalAmountInHomeCurrency" minOccurs="0"/>
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
 *         &lt;element ref="{}CreditCardTxnInfo" minOccurs="0"/>
 *         &lt;element name="Other" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="29"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}SalesReceiptLineRet"/>
 *           &lt;element ref="{}SalesReceiptLineGroupRet"/>
 *         &lt;/choice>
 *         &lt;element ref="{}DiscountLineRet" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxLineRet" minOccurs="0"/>
 *         &lt;element ref="{}ShippingLineRet" minOccurs="0"/>
 *         &lt;element ref="{}DataExtRet" maxOccurs="unbounded" minOccurs="0"/>
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
    "timeCreated",
    "timeModified",
    "editSequence",
    "txnNumber",
    "customerRef",
    "classRef",
    "templateRef",
    "txnDate",
    "refNumber",
    "billAddress",
    "billAddressBlock",
    "shipAddress",
    "shipAddressBlock",
    "isPending",
    "checkNumber",
    "paymentMethodRef",
    "dueDate",
    "salesRepRef",
    "shipDate",
    "shipMethodRef",
    "fob",
    "subtotal",
    "itemSalesTaxRef",
    "salesTaxPercentage",
    "salesTaxTotal",
    "totalAmount",
    "currencyRef",
    "exchangeRate",
    "totalAmountInHomeCurrency",
    "memo",
    "customerMsgRef",
    "isToBePrinted",
    "isToBeEmailed",
    "isTaxIncluded",
    "customerSalesTaxCodeRef",
    "depositToAccountRef",
    "creditCardTxnInfo",
    "other",
    "externalGUID",
    "salesReceiptLineRetOrSalesReceiptLineGroupRet",
    "discountLineRet",
    "salesTaxLineRet",
    "shippingLineRet",
    "dataExtRet"
})
@XmlRootElement(name = "SalesReceiptRet")
public class SalesReceiptRet {

    @XmlElement(name = "TxnID")
    protected String txnID;
    @XmlElement(name = "TimeCreated")
    protected String timeCreated;
    @XmlElement(name = "TimeModified")
    protected String timeModified;
    @XmlElement(name = "EditSequence")
    protected String editSequence;
    @XmlElement(name = "TxnNumber")
    protected BigInteger txnNumber;
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
    @XmlElement(name = "BillAddressBlock")
    protected BillAddressBlock billAddressBlock;
    @XmlElement(name = "ShipAddress")
    protected ShipAddress shipAddress;
    @XmlElement(name = "ShipAddressBlock")
    protected ShipAddressBlock shipAddressBlock;
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
    @XmlElement(name = "Subtotal")
    protected String subtotal;
    @XmlElement(name = "ItemSalesTaxRef")
    protected ItemSalesTaxRef itemSalesTaxRef;
    @XmlElement(name = "SalesTaxPercentage")
    protected String salesTaxPercentage;
    @XmlElement(name = "SalesTaxTotal")
    protected String salesTaxTotal;
    @XmlElement(name = "TotalAmount")
    protected String totalAmount;
    @XmlElement(name = "CurrencyRef")
    protected CurrencyRef currencyRef;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "TotalAmountInHomeCurrency")
    protected String totalAmountInHomeCurrency;
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
    @XmlElement(name = "CreditCardTxnInfo")
    protected CreditCardTxnInfo creditCardTxnInfo;
    @XmlElement(name = "Other")
    protected String other;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElements({
        @XmlElement(name = "SalesReceiptLineGroupRet", type = SalesReceiptLineGroupRet.class),
        @XmlElement(name = "SalesReceiptLineRet", type = SalesReceiptLineRet.class)
    })
    protected List<Object> salesReceiptLineRetOrSalesReceiptLineGroupRet;
    @XmlElement(name = "DiscountLineRet")
    protected DiscountLineRet discountLineRet;
    @XmlElement(name = "SalesTaxLineRet")
    protected SalesTaxLineRet salesTaxLineRet;
    @XmlElement(name = "ShippingLineRet")
    protected ShippingLineRet shippingLineRet;
    @XmlElement(name = "DataExtRet")
    protected List<DataExtRet> dataExtRet;

    /**
     * Gets the value of the txnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnID() {
        return txnID;
    }

    /**
     * Sets the value of the txnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnID(String value) {
        this.txnID = value;
    }

    /**
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCreated(String value) {
        this.timeCreated = value;
    }

    /**
     * Gets the value of the timeModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeModified() {
        return timeModified;
    }

    /**
     * Sets the value of the timeModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeModified(String value) {
        this.timeModified = value;
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
     * Gets the value of the txnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxnNumber() {
        return txnNumber;
    }

    /**
     * Sets the value of the txnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxnNumber(BigInteger value) {
        this.txnNumber = value;
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
     * Gets the value of the billAddressBlock property.
     * 
     * @return
     *     possible object is
     *     {@link BillAddressBlock }
     *     
     */
    public BillAddressBlock getBillAddressBlock() {
        return billAddressBlock;
    }

    /**
     * Sets the value of the billAddressBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillAddressBlock }
     *     
     */
    public void setBillAddressBlock(BillAddressBlock value) {
        this.billAddressBlock = value;
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
     * Gets the value of the shipAddressBlock property.
     * 
     * @return
     *     possible object is
     *     {@link ShipAddressBlock }
     *     
     */
    public ShipAddressBlock getShipAddressBlock() {
        return shipAddressBlock;
    }

    /**
     * Sets the value of the shipAddressBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipAddressBlock }
     *     
     */
    public void setShipAddressBlock(ShipAddressBlock value) {
        this.shipAddressBlock = value;
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
     * Gets the value of the subtotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     * Sets the value of the subtotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotal(String value) {
        this.subtotal = value;
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
     * Gets the value of the salesTaxPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxPercentage() {
        return salesTaxPercentage;
    }

    /**
     * Sets the value of the salesTaxPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxPercentage(String value) {
        this.salesTaxPercentage = value;
    }

    /**
     * Gets the value of the salesTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxTotal() {
        return salesTaxTotal;
    }

    /**
     * Sets the value of the salesTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxTotal(String value) {
        this.salesTaxTotal = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the currencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRef }
     *     
     */
    public CurrencyRef getCurrencyRef() {
        return currencyRef;
    }

    /**
     * Sets the value of the currencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRef }
     *     
     */
    public void setCurrencyRef(CurrencyRef value) {
        this.currencyRef = value;
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
     * Gets the value of the totalAmountInHomeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmountInHomeCurrency() {
        return totalAmountInHomeCurrency;
    }

    /**
     * Sets the value of the totalAmountInHomeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmountInHomeCurrency(String value) {
        this.totalAmountInHomeCurrency = value;
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
     * Gets the value of the creditCardTxnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTxnInfo }
     *     
     */
    public CreditCardTxnInfo getCreditCardTxnInfo() {
        return creditCardTxnInfo;
    }

    /**
     * Sets the value of the creditCardTxnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTxnInfo }
     *     
     */
    public void setCreditCardTxnInfo(CreditCardTxnInfo value) {
        this.creditCardTxnInfo = value;
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
     * Gets the value of the externalGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalGUID() {
        return externalGUID;
    }

    /**
     * Sets the value of the externalGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalGUID(String value) {
        this.externalGUID = value;
    }

    /**
     * Gets the value of the salesReceiptLineRetOrSalesReceiptLineGroupRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesReceiptLineRetOrSalesReceiptLineGroupRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesReceiptLineRetOrSalesReceiptLineGroupRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesReceiptLineGroupRet }
     * {@link SalesReceiptLineRet }
     * 
     * 
     */
    public List<Object> getSalesReceiptLineRetOrSalesReceiptLineGroupRet() {
        if (salesReceiptLineRetOrSalesReceiptLineGroupRet == null) {
            salesReceiptLineRetOrSalesReceiptLineGroupRet = new ArrayList<Object>();
        }
        return this.salesReceiptLineRetOrSalesReceiptLineGroupRet;
    }

    /**
     * Gets the value of the discountLineRet property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountLineRet }
     *     
     */
    public DiscountLineRet getDiscountLineRet() {
        return discountLineRet;
    }

    /**
     * Sets the value of the discountLineRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountLineRet }
     *     
     */
    public void setDiscountLineRet(DiscountLineRet value) {
        this.discountLineRet = value;
    }

    /**
     * Gets the value of the salesTaxLineRet property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxLineRet }
     *     
     */
    public SalesTaxLineRet getSalesTaxLineRet() {
        return salesTaxLineRet;
    }

    /**
     * Sets the value of the salesTaxLineRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxLineRet }
     *     
     */
    public void setSalesTaxLineRet(SalesTaxLineRet value) {
        this.salesTaxLineRet = value;
    }

    /**
     * Gets the value of the shippingLineRet property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingLineRet }
     *     
     */
    public ShippingLineRet getShippingLineRet() {
        return shippingLineRet;
    }

    /**
     * Sets the value of the shippingLineRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingLineRet }
     *     
     */
    public void setShippingLineRet(ShippingLineRet value) {
        this.shippingLineRet = value;
    }

    /**
     * Gets the value of the dataExtRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataExtRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataExtRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataExtRet }
     * 
     * 
     */
    public List<DataExtRet> getDataExtRet() {
        if (dataExtRet == null) {
            dataExtRet = new ArrayList<DataExtRet>();
        }
        return this.dataExtRet;
    }

}

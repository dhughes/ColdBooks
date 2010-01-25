//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:02:55 PM EST 
//


package com.alagad.ColdBooks.US.v41;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}CustomerSalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}DepositToAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}CreditCardTxnInfo" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}SalesReceiptLineAdd"/>
 *           &lt;element ref="{}SalesReceiptLineGroupAdd"/>
 *         &lt;/choice>
 *         &lt;element ref="{}DiscountLineAdd" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxLineAdd" minOccurs="0"/>
 *         &lt;element ref="{}ShippingLineAdd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="defMacro" type="{}MACROTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
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
    "customerSalesTaxCodeRef",
    "depositToAccountRef",
    "creditCardTxnInfo",
    "salesReceiptLineAddOrSalesReceiptLineGroupAdd",
    "discountLineAdd",
    "salesTaxLineAdd",
    "shippingLineAdd"
})
@XmlRootElement(name = "SalesReceiptAdd")
public class SalesReceiptAdd {

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
    @XmlElement(name = "CustomerSalesTaxCodeRef")
    protected CustomerSalesTaxCodeRef customerSalesTaxCodeRef;
    @XmlElement(name = "DepositToAccountRef")
    protected DepositToAccountRef depositToAccountRef;
    @XmlElement(name = "CreditCardTxnInfo")
    protected CreditCardTxnInfo creditCardTxnInfo;
    @XmlElements({
        @XmlElement(name = "SalesReceiptLineAdd", type = SalesReceiptLineAdd.class),
        @XmlElement(name = "SalesReceiptLineGroupAdd", type = SalesReceiptLineGroupAdd.class)
    })
    protected List<Object> salesReceiptLineAddOrSalesReceiptLineGroupAdd;
    @XmlElement(name = "DiscountLineAdd")
    protected DiscountLineAdd discountLineAdd;
    @XmlElement(name = "SalesTaxLineAdd")
    protected SalesTaxLineAdd salesTaxLineAdd;
    @XmlElement(name = "ShippingLineAdd")
    protected ShippingLineAdd shippingLineAdd;
    @XmlAttribute
    protected String defMacro;

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
     * Gets the value of the salesReceiptLineAddOrSalesReceiptLineGroupAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesReceiptLineAddOrSalesReceiptLineGroupAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesReceiptLineAddOrSalesReceiptLineGroupAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesReceiptLineAdd }
     * {@link SalesReceiptLineGroupAdd }
     * 
     * 
     */
    public List<Object> getSalesReceiptLineAddOrSalesReceiptLineGroupAdd() {
        if (salesReceiptLineAddOrSalesReceiptLineGroupAdd == null) {
            salesReceiptLineAddOrSalesReceiptLineGroupAdd = new ArrayList<Object>();
        }
        return this.salesReceiptLineAddOrSalesReceiptLineGroupAdd;
    }

    /**
     * Gets the value of the discountLineAdd property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountLineAdd }
     *     
     */
    public DiscountLineAdd getDiscountLineAdd() {
        return discountLineAdd;
    }

    /**
     * Sets the value of the discountLineAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountLineAdd }
     *     
     */
    public void setDiscountLineAdd(DiscountLineAdd value) {
        this.discountLineAdd = value;
    }

    /**
     * Gets the value of the salesTaxLineAdd property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxLineAdd }
     *     
     */
    public SalesTaxLineAdd getSalesTaxLineAdd() {
        return salesTaxLineAdd;
    }

    /**
     * Sets the value of the salesTaxLineAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxLineAdd }
     *     
     */
    public void setSalesTaxLineAdd(SalesTaxLineAdd value) {
        this.salesTaxLineAdd = value;
    }

    /**
     * Gets the value of the shippingLineAdd property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingLineAdd }
     *     
     */
    public ShippingLineAdd getShippingLineAdd() {
        return shippingLineAdd;
    }

    /**
     * Sets the value of the shippingLineAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingLineAdd }
     *     
     */
    public void setShippingLineAdd(ShippingLineAdd value) {
        this.shippingLineAdd = value;
    }

    /**
     * Gets the value of the defMacro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefMacro() {
        return defMacro;
    }

    /**
     * Sets the value of the defMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefMacro(String value) {
        this.defMacro = value;
    }

}

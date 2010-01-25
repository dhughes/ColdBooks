//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:59:41 PM EST 
//


package com.alagad.ColdBooks.UK.v30;

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
 *         &lt;element ref="{}VendorRef"/>
 *         &lt;element ref="{}APAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element ref="{}DueDate" minOccurs="0"/>
 *         &lt;element name="RefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}TermsRef" minOccurs="0"/>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}ExpenseLineAdd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}ItemLineAdd"/>
 *           &lt;element ref="{}ItemGroupLineAdd"/>
 *         &lt;/choice>
 *         &lt;element ref="{}Tax1Total" minOccurs="0"/>
 *         &lt;element ref="{}Tax2Total" minOccurs="0"/>
 *         &lt;element ref="{}ExchangeRate" minOccurs="0"/>
 *         &lt;element ref="{}AmountIncludesVAT" minOccurs="0"/>
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
    "vendorRef",
    "apAccountRef",
    "txnDate",
    "dueDate",
    "refNumber",
    "termsRef",
    "memo",
    "expenseLineAdd",
    "itemLineAddOrItemGroupLineAdd",
    "tax1Total",
    "tax2Total",
    "exchangeRate",
    "amountIncludesVAT"
})
@XmlRootElement(name = "BillAdd")
public class BillAdd {

    @XmlElement(name = "VendorRef", required = true)
    protected VendorRef vendorRef;
    @XmlElement(name = "APAccountRef")
    protected APAccountRef apAccountRef;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "TermsRef")
    protected TermsRef termsRef;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "ExpenseLineAdd")
    protected List<ExpenseLineAdd> expenseLineAdd;
    @XmlElements({
        @XmlElement(name = "ItemLineAdd", type = ItemLineAdd.class),
        @XmlElement(name = "ItemGroupLineAdd", type = ItemGroupLineAdd.class)
    })
    protected List<Object> itemLineAddOrItemGroupLineAdd;
    @XmlElement(name = "Tax1Total")
    protected String tax1Total;
    @XmlElement(name = "Tax2Total")
    protected String tax2Total;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "AmountIncludesVAT")
    protected String amountIncludesVAT;
    @XmlAttribute
    protected String defMacro;

    /**
     * Gets the value of the vendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link VendorRef }
     *     
     */
    public VendorRef getVendorRef() {
        return vendorRef;
    }

    /**
     * Sets the value of the vendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorRef }
     *     
     */
    public void setVendorRef(VendorRef value) {
        this.vendorRef = value;
    }

    /**
     * Gets the value of the apAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link APAccountRef }
     *     
     */
    public APAccountRef getAPAccountRef() {
        return apAccountRef;
    }

    /**
     * Sets the value of the apAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link APAccountRef }
     *     
     */
    public void setAPAccountRef(APAccountRef value) {
        this.apAccountRef = value;
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
     * Gets the value of the termsRef property.
     * 
     * @return
     *     possible object is
     *     {@link TermsRef }
     *     
     */
    public TermsRef getTermsRef() {
        return termsRef;
    }

    /**
     * Sets the value of the termsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsRef }
     *     
     */
    public void setTermsRef(TermsRef value) {
        this.termsRef = value;
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
     * Gets the value of the expenseLineAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseLineAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseLineAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseLineAdd }
     * 
     * 
     */
    public List<ExpenseLineAdd> getExpenseLineAdd() {
        if (expenseLineAdd == null) {
            expenseLineAdd = new ArrayList<ExpenseLineAdd>();
        }
        return this.expenseLineAdd;
    }

    /**
     * Gets the value of the itemLineAddOrItemGroupLineAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemLineAddOrItemGroupLineAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemLineAddOrItemGroupLineAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLineAdd }
     * {@link ItemGroupLineAdd }
     * 
     * 
     */
    public List<Object> getItemLineAddOrItemGroupLineAdd() {
        if (itemLineAddOrItemGroupLineAdd == null) {
            itemLineAddOrItemGroupLineAdd = new ArrayList<Object>();
        }
        return this.itemLineAddOrItemGroupLineAdd;
    }

    /**
     * Gets the value of the tax1Total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax1Total() {
        return tax1Total;
    }

    /**
     * Sets the value of the tax1Total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax1Total(String value) {
        this.tax1Total = value;
    }

    /**
     * Gets the value of the tax2Total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax2Total() {
        return tax2Total;
    }

    /**
     * Sets the value of the tax2Total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax2Total(String value) {
        this.tax2Total = value;
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
     * Gets the value of the amountIncludesVAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountIncludesVAT() {
        return amountIncludesVAT;
    }

    /**
     * Sets the value of the amountIncludesVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountIncludesVAT(String value) {
        this.amountIncludesVAT = value;
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

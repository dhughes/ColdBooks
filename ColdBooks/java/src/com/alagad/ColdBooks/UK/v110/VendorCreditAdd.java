//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

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
 *         &lt;element name="RefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsTaxIncluded" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}ExchangeRate" minOccurs="0"/>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;element ref="{}ExpenseLineAdd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}ItemLineAdd"/>
 *           &lt;element ref="{}ItemGroupLineAdd"/>
 *         &lt;/choice>
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
    "refNumber",
    "memo",
    "isTaxIncluded",
    "salesTaxCodeRef",
    "exchangeRate",
    "externalGUID",
    "expenseLineAdd",
    "itemLineAddOrItemGroupLineAdd"
})
@XmlRootElement(name = "VendorCreditAdd")
public class VendorCreditAdd {

    @XmlElement(name = "VendorRef", required = true)
    protected VendorRef vendorRef;
    @XmlElement(name = "APAccountRef")
    protected APAccountRef apAccountRef;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "IsTaxIncluded")
    protected String isTaxIncluded;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElement(name = "ExpenseLineAdd")
    protected List<ExpenseLineAdd> expenseLineAdd;
    @XmlElements({
        @XmlElement(name = "ItemLineAdd", type = ItemLineAdd.class),
        @XmlElement(name = "ItemGroupLineAdd", type = ItemGroupLineAdd.class)
    })
    protected List<Object> itemLineAddOrItemGroupLineAdd;
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

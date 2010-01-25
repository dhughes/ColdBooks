//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:58:36 PM EST 
//


package com.alagad.ColdBooks.CA.v20;

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
 *         &lt;element ref="{}AccountRef"/>
 *         &lt;element ref="{}PayeeEntityRef" minOccurs="0"/>
 *         &lt;element name="RefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}Address" minOccurs="0"/>
 *         &lt;element ref="{}IsToBePrinted" minOccurs="0"/>
 *         &lt;element ref="{}ExpenseLineAdd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}ItemLineAdd"/>
 *           &lt;element ref="{}ItemGroupLineAdd"/>
 *         &lt;/choice>
 *         &lt;element ref="{}Tax1Total" minOccurs="0"/>
 *         &lt;element ref="{}Tax2Total" minOccurs="0"/>
 *         &lt;element ref="{}ExchangeRate" minOccurs="0"/>
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
    "accountRef",
    "payeeEntityRef",
    "refNumber",
    "txnDate",
    "memo",
    "address",
    "isToBePrinted",
    "expenseLineAdd",
    "itemLineAddOrItemGroupLineAdd",
    "tax1Total",
    "tax2Total",
    "exchangeRate"
})
@XmlRootElement(name = "CheckAdd")
public class CheckAdd {

    @XmlElement(name = "AccountRef", required = true)
    protected AccountRef accountRef;
    @XmlElement(name = "PayeeEntityRef")
    protected PayeeEntityRef payeeEntityRef;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "IsToBePrinted")
    protected String isToBePrinted;
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
    @XmlAttribute
    protected String defMacro;

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRef }
     *     
     */
    public AccountRef getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRef }
     *     
     */
    public void setAccountRef(AccountRef value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the payeeEntityRef property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeEntityRef }
     *     
     */
    public PayeeEntityRef getPayeeEntityRef() {
        return payeeEntityRef;
    }

    /**
     * Sets the value of the payeeEntityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeEntityRef }
     *     
     */
    public void setPayeeEntityRef(PayeeEntityRef value) {
        this.payeeEntityRef = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
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

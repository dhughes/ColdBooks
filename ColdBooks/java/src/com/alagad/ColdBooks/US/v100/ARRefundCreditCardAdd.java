//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:49:51 PM EDT 
//


package com.alagad.ColdBooks.US.v100;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}CustomerRef"/>
 *         &lt;element ref="{}RefundFromAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}ARAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element name="RefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}Address" minOccurs="0"/>
 *         &lt;element ref="{}PaymentMethodRef" minOccurs="0"/>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}CreditCardTxnInfo" minOccurs="0"/>
 *         &lt;element ref="{}ExchangeRate" minOccurs="0"/>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;element ref="{}RefundAppliedToTxnAdd" maxOccurs="unbounded"/>
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
    "refundFromAccountRef",
    "arAccountRef",
    "txnDate",
    "refNumber",
    "address",
    "paymentMethodRef",
    "memo",
    "creditCardTxnInfo",
    "exchangeRate",
    "externalGUID",
    "refundAppliedToTxnAdd"
})
@XmlRootElement(name = "ARRefundCreditCardAdd")
public class ARRefundCreditCardAdd {

    @XmlElement(name = "CustomerRef", required = true)
    protected CustomerRef customerRef;
    @XmlElement(name = "RefundFromAccountRef")
    protected RefundFromAccountRef refundFromAccountRef;
    @XmlElement(name = "ARAccountRef")
    protected ARAccountRef arAccountRef;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "PaymentMethodRef")
    protected PaymentMethodRef paymentMethodRef;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "CreditCardTxnInfo")
    protected CreditCardTxnInfo creditCardTxnInfo;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElement(name = "RefundAppliedToTxnAdd", required = true)
    protected List<RefundAppliedToTxnAdd> refundAppliedToTxnAdd;
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
     * Gets the value of the refundFromAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link RefundFromAccountRef }
     *     
     */
    public RefundFromAccountRef getRefundFromAccountRef() {
        return refundFromAccountRef;
    }

    /**
     * Sets the value of the refundFromAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundFromAccountRef }
     *     
     */
    public void setRefundFromAccountRef(RefundFromAccountRef value) {
        this.refundFromAccountRef = value;
    }

    /**
     * Gets the value of the arAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ARAccountRef }
     *     
     */
    public ARAccountRef getARAccountRef() {
        return arAccountRef;
    }

    /**
     * Sets the value of the arAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARAccountRef }
     *     
     */
    public void setARAccountRef(ARAccountRef value) {
        this.arAccountRef = value;
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
     * Gets the value of the refundAppliedToTxnAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundAppliedToTxnAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundAppliedToTxnAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundAppliedToTxnAdd }
     * 
     * 
     */
    public List<RefundAppliedToTxnAdd> getRefundAppliedToTxnAdd() {
        if (refundAppliedToTxnAdd == null) {
            refundAppliedToTxnAdd = new ArrayList<RefundAppliedToTxnAdd>();
        }
        return this.refundAppliedToTxnAdd;
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

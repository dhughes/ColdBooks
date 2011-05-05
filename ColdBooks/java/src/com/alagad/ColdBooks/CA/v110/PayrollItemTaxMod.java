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
 *         &lt;element ref="{}ListID"/>
 *         &lt;element name="EditSequence">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element name="State" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}W2TrackingTypeValue" minOccurs="0"/>
 *         &lt;element ref="{}ExpenseAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}LiabilityAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}VendorRef" minOccurs="0"/>
 *         &lt;element name="VendorAccountNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}PaymentTemplateRef" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}Rate"/>
 *           &lt;element ref="{}RatePercent"/>
 *         &lt;/choice>
 *         &lt;element ref="{}RateChange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Limit" minOccurs="0"/>
 *         &lt;element ref="{}TaxCalculatedBasedOn" minOccurs="0"/>
 *         &lt;element ref="{}LiabilityPaymentSchedule" minOccurs="0"/>
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
    "listID",
    "editSequence",
    "name",
    "isActive",
    "state",
    "w2TrackingTypeValue",
    "expenseAccountRef",
    "liabilityAccountRef",
    "vendorRef",
    "vendorAccountNumber",
    "paymentTemplateRef",
    "rate",
    "ratePercent",
    "rateChange",
    "limit",
    "taxCalculatedBasedOn",
    "liabilityPaymentSchedule"
})
@XmlRootElement(name = "PayrollItemTaxMod")
public class PayrollItemTaxMod {

    @XmlElement(name = "ListID", required = true)
    protected String listID;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "W2TrackingTypeValue")
    protected BigInteger w2TrackingTypeValue;
    @XmlElement(name = "ExpenseAccountRef")
    protected ExpenseAccountRef expenseAccountRef;
    @XmlElement(name = "LiabilityAccountRef")
    protected LiabilityAccountRef liabilityAccountRef;
    @XmlElement(name = "VendorRef")
    protected VendorRef vendorRef;
    @XmlElement(name = "VendorAccountNumber")
    protected String vendorAccountNumber;
    @XmlElement(name = "PaymentTemplateRef")
    protected PaymentTemplateRef paymentTemplateRef;
    @XmlElement(name = "Rate")
    protected String rate;
    @XmlElement(name = "RatePercent")
    protected String ratePercent;
    @XmlElement(name = "RateChange")
    protected List<RateChange> rateChange;
    @XmlElement(name = "Limit")
    protected String limit;
    @XmlElement(name = "TaxCalculatedBasedOn")
    protected String taxCalculatedBasedOn;
    @XmlElement(name = "LiabilityPaymentSchedule")
    protected LiabilityPaymentSchedule liabilityPaymentSchedule;

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the w2TrackingTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getW2TrackingTypeValue() {
        return w2TrackingTypeValue;
    }

    /**
     * Sets the value of the w2TrackingTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setW2TrackingTypeValue(BigInteger value) {
        this.w2TrackingTypeValue = value;
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
     * Gets the value of the liabilityAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityAccountRef }
     *     
     */
    public LiabilityAccountRef getLiabilityAccountRef() {
        return liabilityAccountRef;
    }

    /**
     * Sets the value of the liabilityAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityAccountRef }
     *     
     */
    public void setLiabilityAccountRef(LiabilityAccountRef value) {
        this.liabilityAccountRef = value;
    }

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
     * Gets the value of the vendorAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorAccountNumber() {
        return vendorAccountNumber;
    }

    /**
     * Sets the value of the vendorAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorAccountNumber(String value) {
        this.vendorAccountNumber = value;
    }

    /**
     * Gets the value of the paymentTemplateRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTemplateRef }
     *     
     */
    public PaymentTemplateRef getPaymentTemplateRef() {
        return paymentTemplateRef;
    }

    /**
     * Sets the value of the paymentTemplateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTemplateRef }
     *     
     */
    public void setPaymentTemplateRef(PaymentTemplateRef value) {
        this.paymentTemplateRef = value;
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
     * Gets the value of the ratePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePercent() {
        return ratePercent;
    }

    /**
     * Sets the value of the ratePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePercent(String value) {
        this.ratePercent = value;
    }

    /**
     * Gets the value of the rateChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateChange }
     * 
     * 
     */
    public List<RateChange> getRateChange() {
        if (rateChange == null) {
            rateChange = new ArrayList<RateChange>();
        }
        return this.rateChange;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
        this.limit = value;
    }

    /**
     * Gets the value of the taxCalculatedBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCalculatedBasedOn() {
        return taxCalculatedBasedOn;
    }

    /**
     * Sets the value of the taxCalculatedBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCalculatedBasedOn(String value) {
        this.taxCalculatedBasedOn = value;
    }

    /**
     * Gets the value of the liabilityPaymentSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityPaymentSchedule }
     *     
     */
    public LiabilityPaymentSchedule getLiabilityPaymentSchedule() {
        return liabilityPaymentSchedule;
    }

    /**
     * Sets the value of the liabilityPaymentSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityPaymentSchedule }
     *     
     */
    public void setLiabilityPaymentSchedule(LiabilityPaymentSchedule value) {
        this.liabilityPaymentSchedule = value;
    }

}
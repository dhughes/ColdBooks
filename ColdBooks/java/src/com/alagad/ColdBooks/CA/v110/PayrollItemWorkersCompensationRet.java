//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:40 PM EDT 
//


package com.alagad.ColdBooks.CA.v110;

import java.math.BigInteger;
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
 *         &lt;element ref="{}ListID" minOccurs="0"/>
 *         &lt;element ref="{}TimeCreated" minOccurs="0"/>
 *         &lt;element ref="{}TimeModified" minOccurs="0"/>
 *         &lt;element name="EditSequence" minOccurs="0">
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
 *         &lt;element ref="{}PayrollItemDetailTypeValue" minOccurs="0"/>
 *         &lt;element ref="{}ExpenseAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}LiabilityAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}IsTrackedByCustJob" minOccurs="0"/>
 *         &lt;element ref="{}VendorRef" minOccurs="0"/>
 *         &lt;element name="VendorAccountNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}PaymentTemplateRef" minOccurs="0"/>
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
    "timeCreated",
    "timeModified",
    "editSequence",
    "name",
    "isActive",
    "payrollItemDetailTypeValue",
    "expenseAccountRef",
    "liabilityAccountRef",
    "isTrackedByCustJob",
    "vendorRef",
    "vendorAccountNumber",
    "paymentTemplateRef",
    "liabilityPaymentSchedule"
})
@XmlRootElement(name = "PayrollItemWorkersCompensationRet")
public class PayrollItemWorkersCompensationRet {

    @XmlElement(name = "ListID")
    protected String listID;
    @XmlElement(name = "TimeCreated")
    protected String timeCreated;
    @XmlElement(name = "TimeModified")
    protected String timeModified;
    @XmlElement(name = "EditSequence")
    protected String editSequence;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "PayrollItemDetailTypeValue")
    protected BigInteger payrollItemDetailTypeValue;
    @XmlElement(name = "ExpenseAccountRef")
    protected ExpenseAccountRef expenseAccountRef;
    @XmlElement(name = "LiabilityAccountRef")
    protected LiabilityAccountRef liabilityAccountRef;
    @XmlElement(name = "IsTrackedByCustJob")
    protected String isTrackedByCustJob;
    @XmlElement(name = "VendorRef")
    protected VendorRef vendorRef;
    @XmlElement(name = "VendorAccountNumber")
    protected String vendorAccountNumber;
    @XmlElement(name = "PaymentTemplateRef")
    protected PaymentTemplateRef paymentTemplateRef;
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
     * Gets the value of the payrollItemDetailTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPayrollItemDetailTypeValue() {
        return payrollItemDetailTypeValue;
    }

    /**
     * Sets the value of the payrollItemDetailTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPayrollItemDetailTypeValue(BigInteger value) {
        this.payrollItemDetailTypeValue = value;
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
     * Gets the value of the isTrackedByCustJob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTrackedByCustJob() {
        return isTrackedByCustJob;
    }

    /**
     * Sets the value of the isTrackedByCustJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTrackedByCustJob(String value) {
        this.isTrackedByCustJob = value;
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

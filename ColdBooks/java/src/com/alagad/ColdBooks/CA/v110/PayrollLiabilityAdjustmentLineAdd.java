//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:40 PM EDT 
//


package com.alagad.ColdBooks.CA.v110;

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
 *         &lt;element ref="{}PayrollItemRef" minOccurs="0"/>
 *         &lt;element ref="{}AccountRef" minOccurs="0"/>
 *         &lt;element ref="{}OtherAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}Amount" minOccurs="0"/>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}WorkersCompCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}WorkersCompAmount" minOccurs="0"/>
 *         &lt;element ref="{}ExperienceModRateAmount" minOccurs="0"/>
 *         &lt;element ref="{}CompanyPaidAttribute" minOccurs="0"/>
 *         &lt;element ref="{}WageBaseAmount" minOccurs="0"/>
 *         &lt;element ref="{}IncomeSubjectToTaxAmount" minOccurs="0"/>
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
    "payrollItemRef",
    "accountRef",
    "otherAccountRef",
    "classRef",
    "amount",
    "memo",
    "workersCompCodeRef",
    "workersCompAmount",
    "experienceModRateAmount",
    "companyPaidAttribute",
    "wageBaseAmount",
    "incomeSubjectToTaxAmount"
})
@XmlRootElement(name = "PayrollLiabilityAdjustmentLineAdd")
public class PayrollLiabilityAdjustmentLineAdd {

    @XmlElement(name = "PayrollItemRef")
    protected PayrollItemRef payrollItemRef;
    @XmlElement(name = "AccountRef")
    protected AccountRef accountRef;
    @XmlElement(name = "OtherAccountRef")
    protected OtherAccountRef otherAccountRef;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "WorkersCompCodeRef")
    protected WorkersCompCodeRef workersCompCodeRef;
    @XmlElement(name = "WorkersCompAmount")
    protected String workersCompAmount;
    @XmlElement(name = "ExperienceModRateAmount")
    protected String experienceModRateAmount;
    @XmlElement(name = "CompanyPaidAttribute")
    protected String companyPaidAttribute;
    @XmlElement(name = "WageBaseAmount")
    protected String wageBaseAmount;
    @XmlElement(name = "IncomeSubjectToTaxAmount")
    protected String incomeSubjectToTaxAmount;

    /**
     * Gets the value of the payrollItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemRef }
     *     
     */
    public PayrollItemRef getPayrollItemRef() {
        return payrollItemRef;
    }

    /**
     * Sets the value of the payrollItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemRef }
     *     
     */
    public void setPayrollItemRef(PayrollItemRef value) {
        this.payrollItemRef = value;
    }

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
     * Gets the value of the otherAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAccountRef }
     *     
     */
    public OtherAccountRef getOtherAccountRef() {
        return otherAccountRef;
    }

    /**
     * Sets the value of the otherAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAccountRef }
     *     
     */
    public void setOtherAccountRef(OtherAccountRef value) {
        this.otherAccountRef = value;
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
     * Gets the value of the workersCompCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link WorkersCompCodeRef }
     *     
     */
    public WorkersCompCodeRef getWorkersCompCodeRef() {
        return workersCompCodeRef;
    }

    /**
     * Sets the value of the workersCompCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkersCompCodeRef }
     *     
     */
    public void setWorkersCompCodeRef(WorkersCompCodeRef value) {
        this.workersCompCodeRef = value;
    }

    /**
     * Gets the value of the workersCompAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkersCompAmount() {
        return workersCompAmount;
    }

    /**
     * Sets the value of the workersCompAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkersCompAmount(String value) {
        this.workersCompAmount = value;
    }

    /**
     * Gets the value of the experienceModRateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperienceModRateAmount() {
        return experienceModRateAmount;
    }

    /**
     * Sets the value of the experienceModRateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperienceModRateAmount(String value) {
        this.experienceModRateAmount = value;
    }

    /**
     * Gets the value of the companyPaidAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPaidAttribute() {
        return companyPaidAttribute;
    }

    /**
     * Sets the value of the companyPaidAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPaidAttribute(String value) {
        this.companyPaidAttribute = value;
    }

    /**
     * Gets the value of the wageBaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWageBaseAmount() {
        return wageBaseAmount;
    }

    /**
     * Sets the value of the wageBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWageBaseAmount(String value) {
        this.wageBaseAmount = value;
    }

    /**
     * Gets the value of the incomeSubjectToTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeSubjectToTaxAmount() {
        return incomeSubjectToTaxAmount;
    }

    /**
     * Sets the value of the incomeSubjectToTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeSubjectToTaxAmount(String value) {
        this.incomeSubjectToTaxAmount = value;
    }

}

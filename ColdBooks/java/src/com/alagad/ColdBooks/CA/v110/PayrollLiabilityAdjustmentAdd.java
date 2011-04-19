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
 *         &lt;element ref="{}AccountRef" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeRef" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element name="RefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="11"/>
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
 *         &lt;element ref="{}IsAffectingAccounts"/>
 *         &lt;element ref="{}PayrollDate" minOccurs="0"/>
 *         &lt;element ref="{}TaxTableVersion" minOccurs="0"/>
 *         &lt;element ref="{}PayrollLiabilityAdjustmentLineAdd" maxOccurs="unbounded"/>
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
    "employeeRef",
    "classRef",
    "txnDate",
    "refNumber",
    "memo",
    "isAffectingAccounts",
    "payrollDate",
    "taxTableVersion",
    "payrollLiabilityAdjustmentLineAdd"
})
@XmlRootElement(name = "PayrollLiabilityAdjustmentAdd")
public class PayrollLiabilityAdjustmentAdd {

    @XmlElement(name = "AccountRef")
    protected AccountRef accountRef;
    @XmlElement(name = "EmployeeRef")
    protected EmployeeRef employeeRef;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "IsAffectingAccounts", required = true)
    protected String isAffectingAccounts;
    @XmlElement(name = "PayrollDate")
    protected String payrollDate;
    @XmlElement(name = "TaxTableVersion")
    protected BigInteger taxTableVersion;
    @XmlElement(name = "PayrollLiabilityAdjustmentLineAdd", required = true)
    protected List<PayrollLiabilityAdjustmentLineAdd> payrollLiabilityAdjustmentLineAdd;
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
     * Gets the value of the employeeRef property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRef }
     *     
     */
    public EmployeeRef getEmployeeRef() {
        return employeeRef;
    }

    /**
     * Sets the value of the employeeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRef }
     *     
     */
    public void setEmployeeRef(EmployeeRef value) {
        this.employeeRef = value;
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
     * Gets the value of the isAffectingAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAffectingAccounts() {
        return isAffectingAccounts;
    }

    /**
     * Sets the value of the isAffectingAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAffectingAccounts(String value) {
        this.isAffectingAccounts = value;
    }

    /**
     * Gets the value of the payrollDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollDate() {
        return payrollDate;
    }

    /**
     * Sets the value of the payrollDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollDate(String value) {
        this.payrollDate = value;
    }

    /**
     * Gets the value of the taxTableVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxTableVersion() {
        return taxTableVersion;
    }

    /**
     * Sets the value of the taxTableVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxTableVersion(BigInteger value) {
        this.taxTableVersion = value;
    }

    /**
     * Gets the value of the payrollLiabilityAdjustmentLineAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payrollLiabilityAdjustmentLineAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayrollLiabilityAdjustmentLineAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayrollLiabilityAdjustmentLineAdd }
     * 
     * 
     */
    public List<PayrollLiabilityAdjustmentLineAdd> getPayrollLiabilityAdjustmentLineAdd() {
        if (payrollLiabilityAdjustmentLineAdd == null) {
            payrollLiabilityAdjustmentLineAdd = new ArrayList<PayrollLiabilityAdjustmentLineAdd>();
        }
        return this.payrollLiabilityAdjustmentLineAdd;
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

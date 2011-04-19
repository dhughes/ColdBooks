//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:40 PM EDT 
//


package com.alagad.ColdBooks.CA.v110;

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
 *         &lt;element ref="{}IsCoveredByQualifiedPensionPlan" minOccurs="0"/>
 *         &lt;element ref="{}PayPeriod" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}Earnings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}NonEarnings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}UseTimeDataToCreatePaychecks" minOccurs="0"/>
 *         &lt;element ref="{}SickHoursDefault" minOccurs="0"/>
 *         &lt;element ref="{}VacationHoursDefault" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeTaxInfo" minOccurs="0"/>
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
    "isCoveredByQualifiedPensionPlan",
    "payPeriod",
    "classRef",
    "earnings",
    "nonEarnings",
    "useTimeDataToCreatePaychecks",
    "sickHoursDefault",
    "vacationHoursDefault",
    "employeeTaxInfo"
})
@XmlRootElement(name = "EmployeeDefaultPayrollInfo")
public class EmployeeDefaultPayrollInfo {

    @XmlElement(name = "IsCoveredByQualifiedPensionPlan")
    protected String isCoveredByQualifiedPensionPlan;
    @XmlElement(name = "PayPeriod")
    protected String payPeriod;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "Earnings")
    protected List<Earnings> earnings;
    @XmlElement(name = "NonEarnings")
    protected List<NonEarnings> nonEarnings;
    @XmlElement(name = "UseTimeDataToCreatePaychecks")
    protected String useTimeDataToCreatePaychecks;
    @XmlElement(name = "SickHoursDefault")
    protected SickHoursDefault sickHoursDefault;
    @XmlElement(name = "VacationHoursDefault")
    protected VacationHoursDefault vacationHoursDefault;
    @XmlElement(name = "EmployeeTaxInfo")
    protected EmployeeTaxInfo employeeTaxInfo;

    /**
     * Gets the value of the isCoveredByQualifiedPensionPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCoveredByQualifiedPensionPlan() {
        return isCoveredByQualifiedPensionPlan;
    }

    /**
     * Sets the value of the isCoveredByQualifiedPensionPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCoveredByQualifiedPensionPlan(String value) {
        this.isCoveredByQualifiedPensionPlan = value;
    }

    /**
     * Gets the value of the payPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPeriod() {
        return payPeriod;
    }

    /**
     * Sets the value of the payPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPeriod(String value) {
        this.payPeriod = value;
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
     * Gets the value of the earnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Earnings }
     * 
     * 
     */
    public List<Earnings> getEarnings() {
        if (earnings == null) {
            earnings = new ArrayList<Earnings>();
        }
        return this.earnings;
    }

    /**
     * Gets the value of the nonEarnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonEarnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonEarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonEarnings }
     * 
     * 
     */
    public List<NonEarnings> getNonEarnings() {
        if (nonEarnings == null) {
            nonEarnings = new ArrayList<NonEarnings>();
        }
        return this.nonEarnings;
    }

    /**
     * Gets the value of the useTimeDataToCreatePaychecks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTimeDataToCreatePaychecks() {
        return useTimeDataToCreatePaychecks;
    }

    /**
     * Sets the value of the useTimeDataToCreatePaychecks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTimeDataToCreatePaychecks(String value) {
        this.useTimeDataToCreatePaychecks = value;
    }

    /**
     * Gets the value of the sickHoursDefault property.
     * 
     * @return
     *     possible object is
     *     {@link SickHoursDefault }
     *     
     */
    public SickHoursDefault getSickHoursDefault() {
        return sickHoursDefault;
    }

    /**
     * Sets the value of the sickHoursDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link SickHoursDefault }
     *     
     */
    public void setSickHoursDefault(SickHoursDefault value) {
        this.sickHoursDefault = value;
    }

    /**
     * Gets the value of the vacationHoursDefault property.
     * 
     * @return
     *     possible object is
     *     {@link VacationHoursDefault }
     *     
     */
    public VacationHoursDefault getVacationHoursDefault() {
        return vacationHoursDefault;
    }

    /**
     * Sets the value of the vacationHoursDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link VacationHoursDefault }
     *     
     */
    public void setVacationHoursDefault(VacationHoursDefault value) {
        this.vacationHoursDefault = value;
    }

    /**
     * Gets the value of the employeeTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeTaxInfo }
     *     
     */
    public EmployeeTaxInfo getEmployeeTaxInfo() {
        return employeeTaxInfo;
    }

    /**
     * Sets the value of the employeeTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeTaxInfo }
     *     
     */
    public void setEmployeeTaxInfo(EmployeeTaxInfo value) {
        this.employeeTaxInfo = value;
    }

}

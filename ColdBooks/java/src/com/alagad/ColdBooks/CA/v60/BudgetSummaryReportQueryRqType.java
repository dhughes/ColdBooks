//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:58:57 PM EST 
//


package com.alagad.ColdBooks.CA.v60;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetSummaryReportQueryRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetSummaryReportQueryRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}BudgetSummaryReportQuery"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requestID" type="{}STRTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetSummaryReportQueryRqType", propOrder = {
    "budgetSummaryReportType",
    "displayReport",
    "fiscalYear",
    "budgetCriterion",
    "summarizeBudgetColumnsBy",
    "summarizeBudgetRowsBy"
})
public class BudgetSummaryReportQueryRqType {

    @XmlElement(name = "BudgetSummaryReportType", required = true)
    protected String budgetSummaryReportType;
    @XmlElement(name = "DisplayReport")
    protected String displayReport;
    @XmlElement(name = "FiscalYear", required = true)
    protected BigInteger fiscalYear;
    @XmlElement(name = "BudgetCriterion")
    protected String budgetCriterion;
    @XmlElement(name = "SummarizeBudgetColumnsBy")
    protected String summarizeBudgetColumnsBy;
    @XmlElement(name = "SummarizeBudgetRowsBy")
    protected String summarizeBudgetRowsBy;
    @XmlAttribute
    protected String requestID;

    /**
     * Gets the value of the budgetSummaryReportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetSummaryReportType() {
        return budgetSummaryReportType;
    }

    /**
     * Sets the value of the budgetSummaryReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetSummaryReportType(String value) {
        this.budgetSummaryReportType = value;
    }

    /**
     * Gets the value of the displayReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayReport() {
        return displayReport;
    }

    /**
     * Sets the value of the displayReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayReport(String value) {
        this.displayReport = value;
    }

    /**
     * Gets the value of the fiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Sets the value of the fiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFiscalYear(BigInteger value) {
        this.fiscalYear = value;
    }

    /**
     * Gets the value of the budgetCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetCriterion() {
        return budgetCriterion;
    }

    /**
     * Sets the value of the budgetCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetCriterion(String value) {
        this.budgetCriterion = value;
    }

    /**
     * Gets the value of the summarizeBudgetColumnsBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummarizeBudgetColumnsBy() {
        return summarizeBudgetColumnsBy;
    }

    /**
     * Sets the value of the summarizeBudgetColumnsBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummarizeBudgetColumnsBy(String value) {
        this.summarizeBudgetColumnsBy = value;
    }

    /**
     * Gets the value of the summarizeBudgetRowsBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummarizeBudgetRowsBy() {
        return summarizeBudgetRowsBy;
    }

    /**
     * Sets the value of the summarizeBudgetRowsBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummarizeBudgetRowsBy(String value) {
        this.summarizeBudgetRowsBy = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:02:55 PM EST 
//


package com.alagad.ColdBooks.US.v41;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralSummaryReportQueryRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralSummaryReportQueryRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}GeneralSummaryReportQuery"/>
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
@XmlType(name = "GeneralSummaryReportQueryRqType", propOrder = {
    "generalSummaryReportType",
    "displayReport",
    "reportPeriod",
    "reportDateMacro",
    "reportAccountFilter",
    "reportEntityFilter",
    "reportItemFilter",
    "reportClassFilter",
    "reportTxnTypeFilter",
    "reportModifiedDateRangeFilter",
    "reportModifiedDateRangeMacro",
    "reportDetailLevelFilter",
    "reportPostingStatusFilter",
    "summarizeColumnsBy",
    "includeSubcolumns",
    "reportCalendar",
    "returnRows",
    "returnColumns",
    "reportBasis"
})
public class GeneralSummaryReportQueryRqType {

    @XmlElement(name = "GeneralSummaryReportType", required = true)
    protected String generalSummaryReportType;
    @XmlElement(name = "DisplayReport")
    protected String displayReport;
    @XmlElement(name = "ReportPeriod")
    protected ReportPeriod reportPeriod;
    @XmlElement(name = "ReportDateMacro")
    protected String reportDateMacro;
    @XmlElement(name = "ReportAccountFilter")
    protected ReportAccountFilter reportAccountFilter;
    @XmlElement(name = "ReportEntityFilter")
    protected ReportEntityFilter reportEntityFilter;
    @XmlElement(name = "ReportItemFilter")
    protected ReportItemFilter reportItemFilter;
    @XmlElement(name = "ReportClassFilter")
    protected ReportClassFilter reportClassFilter;
    @XmlElement(name = "ReportTxnTypeFilter")
    protected ReportTxnTypeFilter reportTxnTypeFilter;
    @XmlElement(name = "ReportModifiedDateRangeFilter")
    protected ReportModifiedDateRangeFilter reportModifiedDateRangeFilter;
    @XmlElement(name = "ReportModifiedDateRangeMacro")
    protected String reportModifiedDateRangeMacro;
    @XmlElement(name = "ReportDetailLevelFilter", defaultValue = "All")
    protected String reportDetailLevelFilter;
    @XmlElement(name = "ReportPostingStatusFilter")
    protected String reportPostingStatusFilter;
    @XmlElement(name = "SummarizeColumnsBy")
    protected String summarizeColumnsBy;
    @XmlElement(name = "IncludeSubcolumns")
    protected String includeSubcolumns;
    @XmlElement(name = "ReportCalendar")
    protected String reportCalendar;
    @XmlElement(name = "ReturnRows")
    protected String returnRows;
    @XmlElement(name = "ReturnColumns")
    protected String returnColumns;
    @XmlElement(name = "ReportBasis", defaultValue = "None")
    protected String reportBasis;
    @XmlAttribute
    protected String requestID;

    /**
     * Gets the value of the generalSummaryReportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralSummaryReportType() {
        return generalSummaryReportType;
    }

    /**
     * Sets the value of the generalSummaryReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralSummaryReportType(String value) {
        this.generalSummaryReportType = value;
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
     * Gets the value of the reportPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPeriod }
     *     
     */
    public ReportPeriod getReportPeriod() {
        return reportPeriod;
    }

    /**
     * Sets the value of the reportPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPeriod }
     *     
     */
    public void setReportPeriod(ReportPeriod value) {
        this.reportPeriod = value;
    }

    /**
     * Gets the value of the reportDateMacro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDateMacro() {
        return reportDateMacro;
    }

    /**
     * Sets the value of the reportDateMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDateMacro(String value) {
        this.reportDateMacro = value;
    }

    /**
     * Gets the value of the reportAccountFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReportAccountFilter }
     *     
     */
    public ReportAccountFilter getReportAccountFilter() {
        return reportAccountFilter;
    }

    /**
     * Sets the value of the reportAccountFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportAccountFilter }
     *     
     */
    public void setReportAccountFilter(ReportAccountFilter value) {
        this.reportAccountFilter = value;
    }

    /**
     * Gets the value of the reportEntityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReportEntityFilter }
     *     
     */
    public ReportEntityFilter getReportEntityFilter() {
        return reportEntityFilter;
    }

    /**
     * Sets the value of the reportEntityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportEntityFilter }
     *     
     */
    public void setReportEntityFilter(ReportEntityFilter value) {
        this.reportEntityFilter = value;
    }

    /**
     * Gets the value of the reportItemFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReportItemFilter }
     *     
     */
    public ReportItemFilter getReportItemFilter() {
        return reportItemFilter;
    }

    /**
     * Sets the value of the reportItemFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportItemFilter }
     *     
     */
    public void setReportItemFilter(ReportItemFilter value) {
        this.reportItemFilter = value;
    }

    /**
     * Gets the value of the reportClassFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReportClassFilter }
     *     
     */
    public ReportClassFilter getReportClassFilter() {
        return reportClassFilter;
    }

    /**
     * Sets the value of the reportClassFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportClassFilter }
     *     
     */
    public void setReportClassFilter(ReportClassFilter value) {
        this.reportClassFilter = value;
    }

    /**
     * Gets the value of the reportTxnTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTxnTypeFilter }
     *     
     */
    public ReportTxnTypeFilter getReportTxnTypeFilter() {
        return reportTxnTypeFilter;
    }

    /**
     * Sets the value of the reportTxnTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTxnTypeFilter }
     *     
     */
    public void setReportTxnTypeFilter(ReportTxnTypeFilter value) {
        this.reportTxnTypeFilter = value;
    }

    /**
     * Gets the value of the reportModifiedDateRangeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReportModifiedDateRangeFilter }
     *     
     */
    public ReportModifiedDateRangeFilter getReportModifiedDateRangeFilter() {
        return reportModifiedDateRangeFilter;
    }

    /**
     * Sets the value of the reportModifiedDateRangeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportModifiedDateRangeFilter }
     *     
     */
    public void setReportModifiedDateRangeFilter(ReportModifiedDateRangeFilter value) {
        this.reportModifiedDateRangeFilter = value;
    }

    /**
     * Gets the value of the reportModifiedDateRangeMacro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportModifiedDateRangeMacro() {
        return reportModifiedDateRangeMacro;
    }

    /**
     * Sets the value of the reportModifiedDateRangeMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportModifiedDateRangeMacro(String value) {
        this.reportModifiedDateRangeMacro = value;
    }

    /**
     * Gets the value of the reportDetailLevelFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDetailLevelFilter() {
        return reportDetailLevelFilter;
    }

    /**
     * Sets the value of the reportDetailLevelFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDetailLevelFilter(String value) {
        this.reportDetailLevelFilter = value;
    }

    /**
     * Gets the value of the reportPostingStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportPostingStatusFilter() {
        return reportPostingStatusFilter;
    }

    /**
     * Sets the value of the reportPostingStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportPostingStatusFilter(String value) {
        this.reportPostingStatusFilter = value;
    }

    /**
     * Gets the value of the summarizeColumnsBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummarizeColumnsBy() {
        return summarizeColumnsBy;
    }

    /**
     * Sets the value of the summarizeColumnsBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummarizeColumnsBy(String value) {
        this.summarizeColumnsBy = value;
    }

    /**
     * Gets the value of the includeSubcolumns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeSubcolumns() {
        return includeSubcolumns;
    }

    /**
     * Sets the value of the includeSubcolumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeSubcolumns(String value) {
        this.includeSubcolumns = value;
    }

    /**
     * Gets the value of the reportCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportCalendar() {
        return reportCalendar;
    }

    /**
     * Sets the value of the reportCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportCalendar(String value) {
        this.reportCalendar = value;
    }

    /**
     * Gets the value of the returnRows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnRows() {
        return returnRows;
    }

    /**
     * Sets the value of the returnRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnRows(String value) {
        this.returnRows = value;
    }

    /**
     * Gets the value of the returnColumns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnColumns() {
        return returnColumns;
    }

    /**
     * Sets the value of the returnColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnColumns(String value) {
        this.returnColumns = value;
    }

    /**
     * Gets the value of the reportBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportBasis() {
        return reportBasis;
    }

    /**
     * Sets the value of the reportBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportBasis(String value) {
        this.reportBasis = value;
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

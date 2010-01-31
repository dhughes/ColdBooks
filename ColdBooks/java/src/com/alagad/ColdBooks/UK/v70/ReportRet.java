//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:00:13 PM EST 
//


package com.alagad.ColdBooks.UK.v70;

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
 *         &lt;element ref="{}ReportTitle"/>
 *         &lt;element ref="{}ReportSubtitle"/>
 *         &lt;element ref="{}ReportBasis" minOccurs="0"/>
 *         &lt;element ref="{}NumRows"/>
 *         &lt;element ref="{}NumColumns"/>
 *         &lt;element ref="{}NumColTitleRows"/>
 *         &lt;element ref="{}ColDesc" maxOccurs="unbounded"/>
 *         &lt;element ref="{}ReportData" minOccurs="0"/>
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
    "reportTitle",
    "reportSubtitle",
    "reportBasis",
    "numRows",
    "numColumns",
    "numColTitleRows",
    "colDesc",
    "reportData"
})
@XmlRootElement(name = "ReportRet")
public class ReportRet {

    @XmlElement(name = "ReportTitle", required = true)
    protected String reportTitle;
    @XmlElement(name = "ReportSubtitle", required = true)
    protected String reportSubtitle;
    @XmlElement(name = "ReportBasis", defaultValue = "None")
    protected String reportBasis;
    @XmlElement(name = "NumRows", required = true)
    protected BigInteger numRows;
    @XmlElement(name = "NumColumns", required = true)
    protected BigInteger numColumns;
    @XmlElement(name = "NumColTitleRows", required = true)
    protected BigInteger numColTitleRows;
    @XmlElement(name = "ColDesc", required = true)
    protected List<ColDesc> colDesc;
    @XmlElement(name = "ReportData")
    protected ReportData reportData;

    /**
     * Gets the value of the reportTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * Sets the value of the reportTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportTitle(String value) {
        this.reportTitle = value;
    }

    /**
     * Gets the value of the reportSubtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportSubtitle() {
        return reportSubtitle;
    }

    /**
     * Sets the value of the reportSubtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportSubtitle(String value) {
        this.reportSubtitle = value;
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
     * Gets the value of the numRows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumRows() {
        return numRows;
    }

    /**
     * Sets the value of the numRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumRows(BigInteger value) {
        this.numRows = value;
    }

    /**
     * Gets the value of the numColumns property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumColumns() {
        return numColumns;
    }

    /**
     * Sets the value of the numColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumColumns(BigInteger value) {
        this.numColumns = value;
    }

    /**
     * Gets the value of the numColTitleRows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumColTitleRows() {
        return numColTitleRows;
    }

    /**
     * Sets the value of the numColTitleRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumColTitleRows(BigInteger value) {
        this.numColTitleRows = value;
    }

    /**
     * Gets the value of the colDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColDesc }
     * 
     * 
     */
    public List<ColDesc> getColDesc() {
        if (colDesc == null) {
            colDesc = new ArrayList<ColDesc>();
        }
        return this.colDesc;
    }

    /**
     * Gets the value of the reportData property.
     * 
     * @return
     *     possible object is
     *     {@link ReportData }
     *     
     */
    public ReportData getReportData() {
        return reportData;
    }

    /**
     * Sets the value of the reportData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportData }
     *     
     */
    public void setReportData(ReportData value) {
        this.reportData = value;
    }

}
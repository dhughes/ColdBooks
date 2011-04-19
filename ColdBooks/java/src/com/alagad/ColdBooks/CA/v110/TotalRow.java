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
 *         &lt;element ref="{}RowData" minOccurs="0"/>
 *         &lt;element ref="{}ColData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rowNumber" use="required" type="{}INTTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rowData",
    "colData"
})
@XmlRootElement(name = "TotalRow")
public class TotalRow {

    @XmlElement(name = "RowData")
    protected RowData rowData;
    @XmlElement(name = "ColData")
    protected List<ColData> colData;
    @XmlAttribute(required = true)
    protected BigInteger rowNumber;

    /**
     * Gets the value of the rowData property.
     * 
     * @return
     *     possible object is
     *     {@link RowData }
     *     
     */
    public RowData getRowData() {
        return rowData;
    }

    /**
     * Sets the value of the rowData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowData }
     *     
     */
    public void setRowData(RowData value) {
        this.rowData = value;
    }

    /**
     * Gets the value of the colData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColData }
     * 
     * 
     */
    public List<ColData> getColData() {
        if (colData == null) {
            colData = new ArrayList<ColData>();
        }
        return this.colData;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

}

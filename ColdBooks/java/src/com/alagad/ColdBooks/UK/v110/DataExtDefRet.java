//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

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
 *         &lt;element ref="{}OwnerID" minOccurs="0"/>
 *         &lt;element ref="{}DataExtID"/>
 *         &lt;element name="DataExtName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}DataExtType" minOccurs="0"/>
 *         &lt;element ref="{}AssignToObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DataExtListRequire"/>
 *         &lt;element ref="{}DataExtTxnRequire"/>
 *         &lt;element ref="{}DataExtFormatString"/>
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
    "ownerID",
    "dataExtID",
    "dataExtName",
    "dataExtType",
    "assignToObject",
    "dataExtListRequire",
    "dataExtTxnRequire",
    "dataExtFormatString"
})
@XmlRootElement(name = "DataExtDefRet")
public class DataExtDefRet {

    @XmlElement(name = "OwnerID")
    protected String ownerID;
    @XmlElement(name = "DataExtID", required = true)
    protected BigInteger dataExtID;
    @XmlElement(name = "DataExtName")
    protected String dataExtName;
    @XmlElement(name = "DataExtType")
    protected String dataExtType;
    @XmlElement(name = "AssignToObject")
    protected List<String> assignToObject;
    @XmlElement(name = "DataExtListRequire", required = true)
    protected String dataExtListRequire;
    @XmlElement(name = "DataExtTxnRequire", required = true)
    protected String dataExtTxnRequire;
    @XmlElement(name = "DataExtFormatString", required = true)
    protected String dataExtFormatString;

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerID(String value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the dataExtID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataExtID() {
        return dataExtID;
    }

    /**
     * Sets the value of the dataExtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataExtID(BigInteger value) {
        this.dataExtID = value;
    }

    /**
     * Gets the value of the dataExtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtName() {
        return dataExtName;
    }

    /**
     * Sets the value of the dataExtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtName(String value) {
        this.dataExtName = value;
    }

    /**
     * Gets the value of the dataExtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtType() {
        return dataExtType;
    }

    /**
     * Sets the value of the dataExtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtType(String value) {
        this.dataExtType = value;
    }

    /**
     * Gets the value of the assignToObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignToObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignToObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssignToObject() {
        if (assignToObject == null) {
            assignToObject = new ArrayList<String>();
        }
        return this.assignToObject;
    }

    /**
     * Gets the value of the dataExtListRequire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtListRequire() {
        return dataExtListRequire;
    }

    /**
     * Sets the value of the dataExtListRequire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtListRequire(String value) {
        this.dataExtListRequire = value;
    }

    /**
     * Gets the value of the dataExtTxnRequire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtTxnRequire() {
        return dataExtTxnRequire;
    }

    /**
     * Sets the value of the dataExtTxnRequire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtTxnRequire(String value) {
        this.dataExtTxnRequire = value;
    }

    /**
     * Gets the value of the dataExtFormatString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtFormatString() {
        return dataExtFormatString;
    }

    /**
     * Sets the value of the dataExtFormatString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtFormatString(String value) {
        this.dataExtFormatString = value;
    }

}

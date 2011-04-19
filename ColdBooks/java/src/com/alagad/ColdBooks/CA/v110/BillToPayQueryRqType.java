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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillToPayQueryRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillToPayQueryRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}BillToPayQuery"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requestID" type="{}STRTYPE" />
 *       &lt;attribute name="metaData" default="NoMetaData">
 *         &lt;simpleType>
 *           &lt;restriction base="{}STRTYPE">
 *             &lt;enumeration value="NoMetaData"/>
 *             &lt;enumeration value="MetaDataOnly"/>
 *             &lt;enumeration value="MetaDataAndResponseData"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillToPayQueryRqType", propOrder = {
    "payeeEntityRef",
    "apAccountRef",
    "dueDate",
    "currencyFilter",
    "includeRetElement"
})
public class BillToPayQueryRqType {

    @XmlElement(name = "PayeeEntityRef", required = true)
    protected PayeeEntityRef payeeEntityRef;
    @XmlElement(name = "APAccountRef")
    protected APAccountRef apAccountRef;
    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "CurrencyFilter")
    protected CurrencyFilter currencyFilter;
    @XmlElement(name = "IncludeRetElement")
    protected List<String> includeRetElement;
    @XmlAttribute
    protected String requestID;
    @XmlAttribute
    protected String metaData;

    /**
     * Gets the value of the payeeEntityRef property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeEntityRef }
     *     
     */
    public PayeeEntityRef getPayeeEntityRef() {
        return payeeEntityRef;
    }

    /**
     * Sets the value of the payeeEntityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeEntityRef }
     *     
     */
    public void setPayeeEntityRef(PayeeEntityRef value) {
        this.payeeEntityRef = value;
    }

    /**
     * Gets the value of the apAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link APAccountRef }
     *     
     */
    public APAccountRef getAPAccountRef() {
        return apAccountRef;
    }

    /**
     * Sets the value of the apAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link APAccountRef }
     *     
     */
    public void setAPAccountRef(APAccountRef value) {
        this.apAccountRef = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the currencyFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyFilter }
     *     
     */
    public CurrencyFilter getCurrencyFilter() {
        return currencyFilter;
    }

    /**
     * Sets the value of the currencyFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyFilter }
     *     
     */
    public void setCurrencyFilter(CurrencyFilter value) {
        this.currencyFilter = value;
    }

    /**
     * Gets the value of the includeRetElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeRetElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeRetElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludeRetElement() {
        if (includeRetElement == null) {
            includeRetElement = new ArrayList<String>();
        }
        return this.includeRetElement;
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

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaData() {
        if (metaData == null) {
            return "NoMetaData";
        } else {
            return metaData;
        }
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaData(String value) {
        this.metaData = value;
    }

}

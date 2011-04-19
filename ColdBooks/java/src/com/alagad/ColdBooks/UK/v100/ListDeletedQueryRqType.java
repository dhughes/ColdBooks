//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:51:25 PM EDT 
//


package com.alagad.ColdBooks.UK.v100;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDeletedQueryRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDeletedQueryRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}ListDeletedQuery"/>
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
@XmlType(name = "ListDeletedQueryRqType", propOrder = {
    "listDelType",
    "deletedDateRangeFilter",
    "includeRetElement"
})
public class ListDeletedQueryRqType {

    @XmlElement(name = "ListDelType", required = true)
    protected List<String> listDelType;
    @XmlElement(name = "DeletedDateRangeFilter")
    protected DeletedDateRangeFilter deletedDateRangeFilter;
    @XmlElement(name = "IncludeRetElement")
    protected List<String> includeRetElement;
    @XmlAttribute
    protected String requestID;
    @XmlAttribute
    protected String metaData;

    /**
     * Gets the value of the listDelType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDelType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDelType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListDelType() {
        if (listDelType == null) {
            listDelType = new ArrayList<String>();
        }
        return this.listDelType;
    }

    /**
     * Gets the value of the deletedDateRangeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link DeletedDateRangeFilter }
     *     
     */
    public DeletedDateRangeFilter getDeletedDateRangeFilter() {
        return deletedDateRangeFilter;
    }

    /**
     * Sets the value of the deletedDateRangeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletedDateRangeFilter }
     *     
     */
    public void setDeletedDateRangeFilter(DeletedDateRangeFilter value) {
        this.deletedDateRangeFilter = value;
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

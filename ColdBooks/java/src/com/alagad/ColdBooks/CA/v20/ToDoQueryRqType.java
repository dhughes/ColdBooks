//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:58:36 PM EST 
//


package com.alagad.ColdBooks.CA.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToDoQueryRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToDoQueryRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}ToDoListQuery"/>
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
@XmlType(name = "ToDoQueryRqType", propOrder = {
    "listID",
    "maxReturned",
    "activeStatus",
    "fromModifiedDate",
    "toModifiedDate",
    "nameFilter",
    "nameRangeFilter",
    "doneStatus"
})
public class ToDoQueryRqType {

    @XmlElement(name = "ListID")
    protected List<String> listID;
    @XmlElement(name = "MaxReturned")
    protected Integer maxReturned;
    @XmlElement(name = "ActiveStatus", defaultValue = "ActiveOnly")
    protected String activeStatus;
    @XmlElement(name = "FromModifiedDate")
    protected String fromModifiedDate;
    @XmlElement(name = "ToModifiedDate")
    protected String toModifiedDate;
    @XmlElement(name = "NameFilter")
    protected NameFilter nameFilter;
    @XmlElement(name = "NameRangeFilter")
    protected NameRangeFilter nameRangeFilter;
    @XmlElement(name = "DoneStatus", defaultValue = "NotDoneOnly")
    protected String doneStatus;
    @XmlAttribute
    protected String requestID;

    /**
     * Gets the value of the listID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListID() {
        if (listID == null) {
            listID = new ArrayList<String>();
        }
        return this.listID;
    }

    /**
     * Gets the value of the maxReturned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxReturned() {
        return maxReturned;
    }

    /**
     * Sets the value of the maxReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxReturned(Integer value) {
        this.maxReturned = value;
    }

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStatus(String value) {
        this.activeStatus = value;
    }

    /**
     * Gets the value of the fromModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromModifiedDate() {
        return fromModifiedDate;
    }

    /**
     * Sets the value of the fromModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromModifiedDate(String value) {
        this.fromModifiedDate = value;
    }

    /**
     * Gets the value of the toModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToModifiedDate() {
        return toModifiedDate;
    }

    /**
     * Sets the value of the toModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToModifiedDate(String value) {
        this.toModifiedDate = value;
    }

    /**
     * Gets the value of the nameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link NameFilter }
     *     
     */
    public NameFilter getNameFilter() {
        return nameFilter;
    }

    /**
     * Sets the value of the nameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameFilter }
     *     
     */
    public void setNameFilter(NameFilter value) {
        this.nameFilter = value;
    }

    /**
     * Gets the value of the nameRangeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link NameRangeFilter }
     *     
     */
    public NameRangeFilter getNameRangeFilter() {
        return nameRangeFilter;
    }

    /**
     * Sets the value of the nameRangeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameRangeFilter }
     *     
     */
    public void setNameRangeFilter(NameRangeFilter value) {
        this.nameRangeFilter = value;
    }

    /**
     * Gets the value of the doneStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoneStatus() {
        return doneStatus;
    }

    /**
     * Sets the value of the doneStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoneStatus(String value) {
        this.doneStatus = value;
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

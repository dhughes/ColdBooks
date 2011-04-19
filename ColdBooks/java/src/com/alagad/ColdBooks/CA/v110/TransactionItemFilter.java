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
 *         &lt;choice>
 *           &lt;element ref="{}ItemTypeFilter"/>
 *           &lt;element ref="{}ListID" maxOccurs="unbounded"/>
 *           &lt;element ref="{}FullName" maxOccurs="unbounded"/>
 *           &lt;element ref="{}ListIDWithChildren"/>
 *           &lt;element ref="{}FullNameWithChildren"/>
 *         &lt;/choice>
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
    "itemTypeFilter",
    "listID",
    "fullName",
    "listIDWithChildren",
    "fullNameWithChildren"
})
@XmlRootElement(name = "TransactionItemFilter")
public class TransactionItemFilter {

    @XmlElement(name = "ItemTypeFilter")
    protected String itemTypeFilter;
    @XmlElement(name = "ListID")
    protected List<String> listID;
    @XmlElement(name = "FullName")
    protected List<String> fullName;
    @XmlElement(name = "ListIDWithChildren")
    protected String listIDWithChildren;
    @XmlElement(name = "FullNameWithChildren")
    protected String fullNameWithChildren;

    /**
     * Gets the value of the itemTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypeFilter() {
        return itemTypeFilter;
    }

    /**
     * Sets the value of the itemTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypeFilter(String value) {
        this.itemTypeFilter = value;
    }

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
     * Gets the value of the fullName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFullName() {
        if (fullName == null) {
            fullName = new ArrayList<String>();
        }
        return this.fullName;
    }

    /**
     * Gets the value of the listIDWithChildren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListIDWithChildren() {
        return listIDWithChildren;
    }

    /**
     * Sets the value of the listIDWithChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListIDWithChildren(String value) {
        this.listIDWithChildren = value;
    }

    /**
     * Gets the value of the fullNameWithChildren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameWithChildren() {
        return fullNameWithChildren;
    }

    /**
     * Sets the value of the fullNameWithChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameWithChildren(String value) {
        this.fullNameWithChildren = value;
    }

}

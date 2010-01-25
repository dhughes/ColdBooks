//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:02:08 PM EST 
//


package com.alagad.ColdBooks.US.v11;

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
 *         &lt;group ref="{}ListCore"/>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FullName">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="159"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive"/>
 *         &lt;element ref="{}ParentRef" minOccurs="0"/>
 *         &lt;element ref="{}Sublevel"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}SalesOrPurchase"/>
 *           &lt;element ref="{}SalesAndPurchase"/>
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
    "listID",
    "timeCreated",
    "timeModified",
    "editSequence",
    "name",
    "fullName",
    "isActive",
    "parentRef",
    "sublevel",
    "salesTaxCodeRef",
    "salesOrPurchase",
    "salesAndPurchase"
})
@XmlRootElement(name = "ItemServiceRet")
public class ItemServiceRet {

    @XmlElement(name = "ListID", required = true)
    protected String listID;
    @XmlElement(name = "TimeCreated", required = true)
    protected String timeCreated;
    @XmlElement(name = "TimeModified", required = true)
    protected String timeModified;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    @XmlElement(name = "IsActive", required = true)
    protected String isActive;
    @XmlElement(name = "ParentRef")
    protected ParentRef parentRef;
    @XmlElement(name = "Sublevel")
    protected int sublevel;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "SalesOrPurchase")
    protected SalesOrPurchase salesOrPurchase;
    @XmlElement(name = "SalesAndPurchase")
    protected SalesAndPurchase salesAndPurchase;

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCreated(String value) {
        this.timeCreated = value;
    }

    /**
     * Gets the value of the timeModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeModified() {
        return timeModified;
    }

    /**
     * Sets the value of the timeModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeModified(String value) {
        this.timeModified = value;
    }

    /**
     * Gets the value of the editSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditSequence() {
        return editSequence;
    }

    /**
     * Sets the value of the editSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditSequence(String value) {
        this.editSequence = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParentRef }
     *     
     */
    public ParentRef getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentRef }
     *     
     */
    public void setParentRef(ParentRef value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the sublevel property.
     * 
     */
    public int getSublevel() {
        return sublevel;
    }

    /**
     * Sets the value of the sublevel property.
     * 
     */
    public void setSublevel(int value) {
        this.sublevel = value;
    }

    /**
     * Gets the value of the salesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxCodeRef }
     *     
     */
    public SalesTaxCodeRef getSalesTaxCodeRef() {
        return salesTaxCodeRef;
    }

    /**
     * Sets the value of the salesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxCodeRef }
     *     
     */
    public void setSalesTaxCodeRef(SalesTaxCodeRef value) {
        this.salesTaxCodeRef = value;
    }

    /**
     * Gets the value of the salesOrPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrPurchase }
     *     
     */
    public SalesOrPurchase getSalesOrPurchase() {
        return salesOrPurchase;
    }

    /**
     * Sets the value of the salesOrPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrPurchase }
     *     
     */
    public void setSalesOrPurchase(SalesOrPurchase value) {
        this.salesOrPurchase = value;
    }

    /**
     * Gets the value of the salesAndPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link SalesAndPurchase }
     *     
     */
    public SalesAndPurchase getSalesAndPurchase() {
        return salesAndPurchase;
    }

    /**
     * Sets the value of the salesAndPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesAndPurchase }
     *     
     */
    public void setSalesAndPurchase(SalesAndPurchase value) {
        this.salesAndPurchase = value;
    }

}

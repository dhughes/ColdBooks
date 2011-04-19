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
 *         &lt;element ref="{}ListID" minOccurs="0"/>
 *         &lt;element ref="{}TimeCreated" minOccurs="0"/>
 *         &lt;element ref="{}TimeModified" minOccurs="0"/>
 *         &lt;element name="EditSequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}PayrollItemDetailTypeValue" minOccurs="0"/>
 *         &lt;element ref="{}ExpenseAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}IsTrackedByCustJob" minOccurs="0"/>
 *         &lt;element ref="{}W2TrackingTypeValue" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}Rate"/>
 *           &lt;element ref="{}RatePercent"/>
 *         &lt;/choice>
 *         &lt;element ref="{}Limit" minOccurs="0"/>
 *         &lt;element ref="{}LimitTimePeriod" minOccurs="0"/>
 *         &lt;element ref="{}CalculatedBasedOn" minOccurs="0"/>
 *         &lt;element ref="{}NetOrGross" minOccurs="0"/>
 *         &lt;element ref="{}Taxability" maxOccurs="unbounded" minOccurs="0"/>
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
    "isActive",
    "payrollItemDetailTypeValue",
    "expenseAccountRef",
    "isTrackedByCustJob",
    "w2TrackingTypeValue",
    "rate",
    "ratePercent",
    "limit",
    "limitTimePeriod",
    "calculatedBasedOn",
    "netOrGross",
    "taxability"
})
@XmlRootElement(name = "PayrollItemAdditionRet")
public class PayrollItemAdditionRet {

    @XmlElement(name = "ListID")
    protected String listID;
    @XmlElement(name = "TimeCreated")
    protected String timeCreated;
    @XmlElement(name = "TimeModified")
    protected String timeModified;
    @XmlElement(name = "EditSequence")
    protected String editSequence;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "PayrollItemDetailTypeValue")
    protected BigInteger payrollItemDetailTypeValue;
    @XmlElement(name = "ExpenseAccountRef")
    protected ExpenseAccountRef expenseAccountRef;
    @XmlElement(name = "IsTrackedByCustJob")
    protected String isTrackedByCustJob;
    @XmlElement(name = "W2TrackingTypeValue")
    protected BigInteger w2TrackingTypeValue;
    @XmlElement(name = "Rate")
    protected String rate;
    @XmlElement(name = "RatePercent")
    protected String ratePercent;
    @XmlElement(name = "Limit")
    protected String limit;
    @XmlElement(name = "LimitTimePeriod")
    protected String limitTimePeriod;
    @XmlElement(name = "CalculatedBasedOn")
    protected String calculatedBasedOn;
    @XmlElement(name = "NetOrGross")
    protected String netOrGross;
    @XmlElement(name = "Taxability")
    protected List<Taxability> taxability;

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
     * Gets the value of the payrollItemDetailTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPayrollItemDetailTypeValue() {
        return payrollItemDetailTypeValue;
    }

    /**
     * Sets the value of the payrollItemDetailTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPayrollItemDetailTypeValue(BigInteger value) {
        this.payrollItemDetailTypeValue = value;
    }

    /**
     * Gets the value of the expenseAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseAccountRef }
     *     
     */
    public ExpenseAccountRef getExpenseAccountRef() {
        return expenseAccountRef;
    }

    /**
     * Sets the value of the expenseAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseAccountRef }
     *     
     */
    public void setExpenseAccountRef(ExpenseAccountRef value) {
        this.expenseAccountRef = value;
    }

    /**
     * Gets the value of the isTrackedByCustJob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTrackedByCustJob() {
        return isTrackedByCustJob;
    }

    /**
     * Sets the value of the isTrackedByCustJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTrackedByCustJob(String value) {
        this.isTrackedByCustJob = value;
    }

    /**
     * Gets the value of the w2TrackingTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getW2TrackingTypeValue() {
        return w2TrackingTypeValue;
    }

    /**
     * Sets the value of the w2TrackingTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setW2TrackingTypeValue(BigInteger value) {
        this.w2TrackingTypeValue = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the ratePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePercent() {
        return ratePercent;
    }

    /**
     * Sets the value of the ratePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePercent(String value) {
        this.ratePercent = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
        this.limit = value;
    }

    /**
     * Gets the value of the limitTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitTimePeriod() {
        return limitTimePeriod;
    }

    /**
     * Sets the value of the limitTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitTimePeriod(String value) {
        this.limitTimePeriod = value;
    }

    /**
     * Gets the value of the calculatedBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedBasedOn() {
        return calculatedBasedOn;
    }

    /**
     * Sets the value of the calculatedBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedBasedOn(String value) {
        this.calculatedBasedOn = value;
    }

    /**
     * Gets the value of the netOrGross property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetOrGross() {
        return netOrGross;
    }

    /**
     * Sets the value of the netOrGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetOrGross(String value) {
        this.netOrGross = value;
    }

    /**
     * Gets the value of the taxability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Taxability }
     * 
     * 
     */
    public List<Taxability> getTaxability() {
        if (taxability == null) {
            taxability = new ArrayList<Taxability>();
        }
        return this.taxability;
    }

}

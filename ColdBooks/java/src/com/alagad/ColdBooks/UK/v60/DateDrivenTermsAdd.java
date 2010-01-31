//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:59:56 PM EST 
//


package com.alagad.ColdBooks.UK.v60;

import java.math.BigInteger;
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
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}DayOfMonthDue"/>
 *         &lt;element ref="{}DueNextMonthDays" minOccurs="0"/>
 *         &lt;element ref="{}DiscountDayOfMonth" minOccurs="0"/>
 *         &lt;element ref="{}DiscountPct" minOccurs="0"/>
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
    "name",
    "isActive",
    "dayOfMonthDue",
    "dueNextMonthDays",
    "discountDayOfMonth",
    "discountPct"
})
@XmlRootElement(name = "DateDrivenTermsAdd")
public class DateDrivenTermsAdd {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "DayOfMonthDue")
    protected int dayOfMonthDue;
    @XmlElement(name = "DueNextMonthDays")
    protected BigInteger dueNextMonthDays;
    @XmlElement(name = "DiscountDayOfMonth")
    protected Integer discountDayOfMonth;
    @XmlElement(name = "DiscountPct")
    protected String discountPct;

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
     * Gets the value of the dayOfMonthDue property.
     * 
     */
    public int getDayOfMonthDue() {
        return dayOfMonthDue;
    }

    /**
     * Sets the value of the dayOfMonthDue property.
     * 
     */
    public void setDayOfMonthDue(int value) {
        this.dayOfMonthDue = value;
    }

    /**
     * Gets the value of the dueNextMonthDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDueNextMonthDays() {
        return dueNextMonthDays;
    }

    /**
     * Sets the value of the dueNextMonthDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDueNextMonthDays(BigInteger value) {
        this.dueNextMonthDays = value;
    }

    /**
     * Gets the value of the discountDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountDayOfMonth() {
        return discountDayOfMonth;
    }

    /**
     * Sets the value of the discountDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountDayOfMonth(Integer value) {
        this.discountDayOfMonth = value;
    }

    /**
     * Gets the value of the discountPct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPct() {
        return discountPct;
    }

    /**
     * Sets the value of the discountPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPct(String value) {
        this.discountPct = value;
    }

}
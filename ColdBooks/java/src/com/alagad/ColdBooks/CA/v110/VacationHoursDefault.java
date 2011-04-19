//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:40 PM EDT 
//


package com.alagad.ColdBooks.CA.v110;

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
 *         &lt;element ref="{}AccrualPeriod" minOccurs="0"/>
 *         &lt;element ref="{}HoursAccrued" minOccurs="0"/>
 *         &lt;element ref="{}MaximumHours" minOccurs="0"/>
 *         &lt;element ref="{}IsResettingHoursEachNewYear" minOccurs="0"/>
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
    "accrualPeriod",
    "hoursAccrued",
    "maximumHours",
    "isResettingHoursEachNewYear"
})
@XmlRootElement(name = "VacationHoursDefault")
public class VacationHoursDefault {

    @XmlElement(name = "AccrualPeriod")
    protected String accrualPeriod;
    @XmlElement(name = "HoursAccrued")
    protected String hoursAccrued;
    @XmlElement(name = "MaximumHours")
    protected String maximumHours;
    @XmlElement(name = "IsResettingHoursEachNewYear")
    protected String isResettingHoursEachNewYear;

    /**
     * Gets the value of the accrualPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrualPeriod() {
        return accrualPeriod;
    }

    /**
     * Sets the value of the accrualPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrualPeriod(String value) {
        this.accrualPeriod = value;
    }

    /**
     * Gets the value of the hoursAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursAccrued() {
        return hoursAccrued;
    }

    /**
     * Sets the value of the hoursAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursAccrued(String value) {
        this.hoursAccrued = value;
    }

    /**
     * Gets the value of the maximumHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumHours() {
        return maximumHours;
    }

    /**
     * Sets the value of the maximumHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumHours(String value) {
        this.maximumHours = value;
    }

    /**
     * Gets the value of the isResettingHoursEachNewYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsResettingHoursEachNewYear() {
        return isResettingHoursEachNewYear;
    }

    /**
     * Sets the value of the isResettingHoursEachNewYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsResettingHoursEachNewYear(String value) {
        this.isResettingHoursEachNewYear = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

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
 *         &lt;element ref="{}PayrollItemWageRef"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}Rate"/>
 *           &lt;element ref="{}RatePercent"/>
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
    "payrollItemWageRef",
    "rate",
    "ratePercent"
})
@XmlRootElement(name = "Earnings")
public class Earnings {

    @XmlElement(name = "PayrollItemWageRef", required = true)
    protected PayrollItemWageRef payrollItemWageRef;
    @XmlElement(name = "Rate")
    protected String rate;
    @XmlElement(name = "RatePercent")
    protected String ratePercent;

    /**
     * Gets the value of the payrollItemWageRef property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemWageRef }
     *     
     */
    public PayrollItemWageRef getPayrollItemWageRef() {
        return payrollItemWageRef;
    }

    /**
     * Sets the value of the payrollItemWageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemWageRef }
     *     
     */
    public void setPayrollItemWageRef(PayrollItemWageRef value) {
        this.payrollItemWageRef = value;
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

}

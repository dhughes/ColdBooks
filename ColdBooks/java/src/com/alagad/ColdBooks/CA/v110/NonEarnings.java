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
 *         &lt;element ref="{}PayrollItemNonWageRef"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}Amount"/>
 *           &lt;element ref="{}RatePercent"/>
 *         &lt;/choice>
 *         &lt;element ref="{}Limit" minOccurs="0"/>
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
    "payrollItemNonWageRef",
    "amount",
    "ratePercent",
    "limit"
})
@XmlRootElement(name = "NonEarnings")
public class NonEarnings {

    @XmlElement(name = "PayrollItemNonWageRef", required = true)
    protected PayrollItemNonWageRef payrollItemNonWageRef;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "RatePercent")
    protected String ratePercent;
    @XmlElement(name = "Limit")
    protected String limit;

    /**
     * Gets the value of the payrollItemNonWageRef property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemNonWageRef }
     *     
     */
    public PayrollItemNonWageRef getPayrollItemNonWageRef() {
        return payrollItemNonWageRef;
    }

    /**
     * Sets the value of the payrollItemNonWageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemNonWageRef }
     *     
     */
    public void setPayrollItemNonWageRef(PayrollItemNonWageRef value) {
        this.payrollItemNonWageRef = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
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

}

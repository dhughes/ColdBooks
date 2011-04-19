//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:40 PM EDT 
//


package com.alagad.ColdBooks.CA.v110;

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
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}PayrollItemDetailTypeValue" minOccurs="0"/>
 *         &lt;element ref="{}LiabilityAccountRef"/>
 *         &lt;element ref="{}VendorRef" minOccurs="0"/>
 *         &lt;element name="VendorAccountNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}PaymentTemplateRef"/>
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
 *         &lt;element ref="{}LiabilityPaymentSchedule" minOccurs="0"/>
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
    "payrollItemDetailTypeValue",
    "liabilityAccountRef",
    "vendorRef",
    "vendorAccountNumber",
    "paymentTemplateRef",
    "w2TrackingTypeValue",
    "rate",
    "ratePercent",
    "limit",
    "limitTimePeriod",
    "calculatedBasedOn",
    "netOrGross",
    "taxability",
    "liabilityPaymentSchedule"
})
@XmlRootElement(name = "PayrollItemDeductionAdd")
public class PayrollItemDeductionAdd {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "PayrollItemDetailTypeValue")
    protected BigInteger payrollItemDetailTypeValue;
    @XmlElement(name = "LiabilityAccountRef", required = true)
    protected LiabilityAccountRef liabilityAccountRef;
    @XmlElement(name = "VendorRef")
    protected VendorRef vendorRef;
    @XmlElement(name = "VendorAccountNumber")
    protected String vendorAccountNumber;
    @XmlElement(name = "PaymentTemplateRef", required = true)
    protected PaymentTemplateRef paymentTemplateRef;
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
    @XmlElement(name = "LiabilityPaymentSchedule")
    protected LiabilityPaymentSchedule liabilityPaymentSchedule;

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
     * Gets the value of the liabilityAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityAccountRef }
     *     
     */
    public LiabilityAccountRef getLiabilityAccountRef() {
        return liabilityAccountRef;
    }

    /**
     * Sets the value of the liabilityAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityAccountRef }
     *     
     */
    public void setLiabilityAccountRef(LiabilityAccountRef value) {
        this.liabilityAccountRef = value;
    }

    /**
     * Gets the value of the vendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link VendorRef }
     *     
     */
    public VendorRef getVendorRef() {
        return vendorRef;
    }

    /**
     * Sets the value of the vendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorRef }
     *     
     */
    public void setVendorRef(VendorRef value) {
        this.vendorRef = value;
    }

    /**
     * Gets the value of the vendorAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorAccountNumber() {
        return vendorAccountNumber;
    }

    /**
     * Sets the value of the vendorAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorAccountNumber(String value) {
        this.vendorAccountNumber = value;
    }

    /**
     * Gets the value of the paymentTemplateRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTemplateRef }
     *     
     */
    public PaymentTemplateRef getPaymentTemplateRef() {
        return paymentTemplateRef;
    }

    /**
     * Sets the value of the paymentTemplateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTemplateRef }
     *     
     */
    public void setPaymentTemplateRef(PaymentTemplateRef value) {
        this.paymentTemplateRef = value;
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

    /**
     * Gets the value of the liabilityPaymentSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityPaymentSchedule }
     *     
     */
    public LiabilityPaymentSchedule getLiabilityPaymentSchedule() {
        return liabilityPaymentSchedule;
    }

    /**
     * Sets the value of the liabilityPaymentSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityPaymentSchedule }
     *     
     */
    public void setLiabilityPaymentSchedule(LiabilityPaymentSchedule value) {
        this.liabilityPaymentSchedule = value;
    }

}

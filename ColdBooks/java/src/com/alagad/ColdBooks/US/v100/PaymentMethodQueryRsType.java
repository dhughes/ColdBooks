//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:49:51 PM EDT 
//


package com.alagad.ColdBooks.US.v100;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodQueryRsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodQueryRsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PaymentMethodRet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requestID" type="{}STRTYPE" />
 *       &lt;attribute name="statusCode" use="required" type="{}INTTYPE" />
 *       &lt;attribute name="statusSeverity" use="required" type="{}STRTYPE" />
 *       &lt;attribute name="statusMessage" type="{}STRTYPE" />
 *       &lt;attribute name="retCount" type="{}INTTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodQueryRsType", propOrder = {
    "paymentMethodRet"
})
public class PaymentMethodQueryRsType {

    @XmlElement(name = "PaymentMethodRet")
    protected List<PaymentMethodRet> paymentMethodRet;
    @XmlAttribute
    protected String requestID;
    @XmlAttribute(required = true)
    protected BigInteger statusCode;
    @XmlAttribute(required = true)
    protected String statusSeverity;
    @XmlAttribute
    protected String statusMessage;
    @XmlAttribute
    protected BigInteger retCount;

    /**
     * Gets the value of the paymentMethodRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethodRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethodRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodRet }
     * 
     * 
     */
    public List<PaymentMethodRet> getPaymentMethodRet() {
        if (paymentMethodRet == null) {
            paymentMethodRet = new ArrayList<PaymentMethodRet>();
        }
        return this.paymentMethodRet;
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
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusCode(BigInteger value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSeverity() {
        return statusSeverity;
    }

    /**
     * Sets the value of the statusSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSeverity(String value) {
        this.statusSeverity = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the retCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetCount() {
        return retCount;
    }

    /**
     * Sets the value of the retCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetCount(BigInteger value) {
        this.retCount = value;
    }

}

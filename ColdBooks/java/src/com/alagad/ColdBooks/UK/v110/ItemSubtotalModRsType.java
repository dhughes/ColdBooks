//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSubtotalModRsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSubtotalModRsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ItemSubtotalRet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requestID" type="{}STRTYPE" />
 *       &lt;attribute name="statusCode" use="required" type="{}INTTYPE" />
 *       &lt;attribute name="statusSeverity" use="required" type="{}STRTYPE" />
 *       &lt;attribute name="statusMessage" type="{}STRTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSubtotalModRsType", propOrder = {
    "itemSubtotalRet"
})
public class ItemSubtotalModRsType {

    @XmlElement(name = "ItemSubtotalRet")
    protected ItemSubtotalRet itemSubtotalRet;
    @XmlAttribute
    protected String requestID;
    @XmlAttribute(required = true)
    protected BigInteger statusCode;
    @XmlAttribute(required = true)
    protected String statusSeverity;
    @XmlAttribute
    protected String statusMessage;

    /**
     * Gets the value of the itemSubtotalRet property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSubtotalRet }
     *     
     */
    public ItemSubtotalRet getItemSubtotalRet() {
        return itemSubtotalRet;
    }

    /**
     * Sets the value of the itemSubtotalRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSubtotalRet }
     *     
     */
    public void setItemSubtotalRet(ItemSubtotalRet value) {
        this.itemSubtotalRet = value;
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

}
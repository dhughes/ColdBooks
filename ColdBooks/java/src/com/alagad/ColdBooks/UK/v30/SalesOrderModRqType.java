//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:59:41 PM EST 
//


package com.alagad.ColdBooks.UK.v30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderModRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderModRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}SalesOrderMod"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requestID" type="{}STRTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderModRqType", propOrder = {
    "salesOrderMod"
})
public class SalesOrderModRqType {

    @XmlElement(name = "SalesOrderMod", required = true)
    protected SalesOrderMod salesOrderMod;
    @XmlAttribute
    protected String requestID;

    /**
     * Gets the value of the salesOrderMod property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderMod }
     *     
     */
    public SalesOrderMod getSalesOrderMod() {
        return salesOrderMod;
    }

    /**
     * Sets the value of the salesOrderMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderMod }
     *     
     */
    public void setSalesOrderMod(SalesOrderMod value) {
        this.salesOrderMod = value;
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

}
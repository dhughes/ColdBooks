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
 *         &lt;choice>
 *           &lt;element ref="{}NewQuantity"/>
 *           &lt;element ref="{}QuantityDifference"/>
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
    "newQuantity",
    "quantityDifference"
})
@XmlRootElement(name = "QuantityAdjustment")
public class QuantityAdjustment {

    @XmlElement(name = "NewQuantity")
    protected String newQuantity;
    @XmlElement(name = "QuantityDifference")
    protected String quantityDifference;

    /**
     * Gets the value of the newQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewQuantity() {
        return newQuantity;
    }

    /**
     * Sets the value of the newQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewQuantity(String value) {
        this.newQuantity = value;
    }

    /**
     * Gets the value of the quantityDifference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityDifference() {
        return quantityDifference;
    }

    /**
     * Sets the value of the quantityDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityDifference(String value) {
        this.quantityDifference = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:02:55 PM EST 
//


package com.alagad.ColdBooks.US.v41;

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
 *         &lt;element ref="{}NewQuantity" minOccurs="0"/>
 *         &lt;element ref="{}NewValue"/>
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
    "newValue"
})
@XmlRootElement(name = "ValueAdjustment")
public class ValueAdjustment {

    @XmlElement(name = "NewQuantity")
    protected String newQuantity;
    @XmlElement(name = "NewValue", required = true)
    protected String newValue;

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
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

}

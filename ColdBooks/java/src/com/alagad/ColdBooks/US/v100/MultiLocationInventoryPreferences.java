//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:49:51 PM EDT 
//


package com.alagad.ColdBooks.US.v100;

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
 *         &lt;element ref="{}IsMultiLocationInventoryAvailable" minOccurs="0"/>
 *         &lt;element ref="{}IsMultiLocationInventoryEnabled" minOccurs="0"/>
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
    "isMultiLocationInventoryAvailable",
    "isMultiLocationInventoryEnabled"
})
@XmlRootElement(name = "MultiLocationInventoryPreferences")
public class MultiLocationInventoryPreferences {

    @XmlElement(name = "IsMultiLocationInventoryAvailable")
    protected String isMultiLocationInventoryAvailable;
    @XmlElement(name = "IsMultiLocationInventoryEnabled")
    protected String isMultiLocationInventoryEnabled;

    /**
     * Gets the value of the isMultiLocationInventoryAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiLocationInventoryAvailable() {
        return isMultiLocationInventoryAvailable;
    }

    /**
     * Sets the value of the isMultiLocationInventoryAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiLocationInventoryAvailable(String value) {
        this.isMultiLocationInventoryAvailable = value;
    }

    /**
     * Gets the value of the isMultiLocationInventoryEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiLocationInventoryEnabled() {
        return isMultiLocationInventoryEnabled;
    }

    /**
     * Sets the value of the isMultiLocationInventoryEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiLocationInventoryEnabled(String value) {
        this.isMultiLocationInventoryEnabled = value;
    }

}
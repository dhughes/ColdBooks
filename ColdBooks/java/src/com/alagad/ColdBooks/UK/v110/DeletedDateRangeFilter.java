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
 *         &lt;element ref="{}FromDeletedDate" minOccurs="0"/>
 *         &lt;element ref="{}ToDeletedDate" minOccurs="0"/>
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
    "fromDeletedDate",
    "toDeletedDate"
})
@XmlRootElement(name = "DeletedDateRangeFilter")
public class DeletedDateRangeFilter {

    @XmlElement(name = "FromDeletedDate")
    protected String fromDeletedDate;
    @XmlElement(name = "ToDeletedDate")
    protected String toDeletedDate;

    /**
     * Gets the value of the fromDeletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDeletedDate() {
        return fromDeletedDate;
    }

    /**
     * Sets the value of the fromDeletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDeletedDate(String value) {
        this.fromDeletedDate = value;
    }

    /**
     * Gets the value of the toDeletedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDeletedDate() {
        return toDeletedDate;
    }

    /**
     * Sets the value of the toDeletedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDeletedDate(String value) {
        this.toDeletedDate = value;
    }

}

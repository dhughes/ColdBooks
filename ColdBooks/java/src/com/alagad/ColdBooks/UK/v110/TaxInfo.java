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
 *         &lt;element name="TaxInfoCategory">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}TaxInfoValue"/>
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
    "taxInfoCategory",
    "taxInfoValue"
})
@XmlRootElement(name = "TaxInfo")
public class TaxInfo {

    @XmlElement(name = "TaxInfoCategory", required = true)
    protected String taxInfoCategory;
    @XmlElement(name = "TaxInfoValue", required = true)
    protected String taxInfoValue;

    /**
     * Gets the value of the taxInfoCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInfoCategory() {
        return taxInfoCategory;
    }

    /**
     * Sets the value of the taxInfoCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxInfoCategory(String value) {
        this.taxInfoCategory = value;
    }

    /**
     * Gets the value of the taxInfoValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInfoValue() {
        return taxInfoValue;
    }

    /**
     * Sets the value of the taxInfoValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxInfoValue(String value) {
        this.taxInfoValue = value;
    }

}

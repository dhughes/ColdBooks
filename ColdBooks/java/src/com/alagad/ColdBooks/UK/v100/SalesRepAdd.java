//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:51:25 PM EDT 
//


package com.alagad.ColdBooks.UK.v100;

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
 *         &lt;element name="Initial">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}SalesRepEntityRef"/>
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
    "initial",
    "isActive",
    "salesRepEntityRef"
})
@XmlRootElement(name = "SalesRepAdd")
public class SalesRepAdd {

    @XmlElement(name = "Initial", required = true)
    protected String initial;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "SalesRepEntityRef", required = true)
    protected SalesRepEntityRef salesRepEntityRef;

    /**
     * Gets the value of the initial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitial(String value) {
        this.initial = value;
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
     * Gets the value of the salesRepEntityRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRepEntityRef }
     *     
     */
    public SalesRepEntityRef getSalesRepEntityRef() {
        return salesRepEntityRef;
    }

    /**
     * Sets the value of the salesRepEntityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRepEntityRef }
     *     
     */
    public void setSalesRepEntityRef(SalesRepEntityRef value) {
        this.salesRepEntityRef = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:40 PM EDT 
//


package com.alagad.ColdBooks.CA.v110;

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
 *         &lt;element ref="{}ItemInventoryRef"/>
 *         &lt;element ref="{}Quantity" minOccurs="0"/>
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
    "itemInventoryRef",
    "quantity"
})
@XmlRootElement(name = "ItemInventoryAssemblyLine")
public class ItemInventoryAssemblyLine {

    @XmlElement(name = "ItemInventoryRef", required = true)
    protected ItemInventoryRef itemInventoryRef;
    @XmlElement(name = "Quantity")
    protected String quantity;

    /**
     * Gets the value of the itemInventoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInventoryRef }
     *     
     */
    public ItemInventoryRef getItemInventoryRef() {
        return itemInventoryRef;
    }

    /**
     * Sets the value of the itemInventoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInventoryRef }
     *     
     */
    public void setItemInventoryRef(ItemInventoryRef value) {
        this.itemInventoryRef = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

}

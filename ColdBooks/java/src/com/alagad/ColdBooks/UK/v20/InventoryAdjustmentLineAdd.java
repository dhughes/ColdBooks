//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:59:32 PM EST 
//


package com.alagad.ColdBooks.UK.v20;

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
 *         &lt;element ref="{}ItemRef"/>
 *         &lt;choice>
 *           &lt;element ref="{}QuantityAdjustment"/>
 *           &lt;element ref="{}ValueAdjustment"/>
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
    "itemRef",
    "quantityAdjustment",
    "valueAdjustment"
})
@XmlRootElement(name = "InventoryAdjustmentLineAdd")
public class InventoryAdjustmentLineAdd {

    @XmlElement(name = "ItemRef", required = true)
    protected ItemRef itemRef;
    @XmlElement(name = "QuantityAdjustment")
    protected QuantityAdjustment quantityAdjustment;
    @XmlElement(name = "ValueAdjustment")
    protected ValueAdjustment valueAdjustment;

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRef }
     *     
     */
    public ItemRef getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRef }
     *     
     */
    public void setItemRef(ItemRef value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the quantityAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAdjustment }
     *     
     */
    public QuantityAdjustment getQuantityAdjustment() {
        return quantityAdjustment;
    }

    /**
     * Sets the value of the quantityAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAdjustment }
     *     
     */
    public void setQuantityAdjustment(QuantityAdjustment value) {
        this.quantityAdjustment = value;
    }

    /**
     * Gets the value of the valueAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link ValueAdjustment }
     *     
     */
    public ValueAdjustment getValueAdjustment() {
        return valueAdjustment;
    }

    /**
     * Sets the value of the valueAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAdjustment }
     *     
     */
    public void setValueAdjustment(ValueAdjustment value) {
        this.valueAdjustment = value;
    }

}

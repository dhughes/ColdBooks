//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:50:28 PM EDT 
//


package com.alagad.ColdBooks.US.v110;

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
 *         &lt;element ref="{}TxnLineID"/>
 *         &lt;element ref="{}ItemRef" minOccurs="0"/>
 *         &lt;element ref="{}QuantityDifference" minOccurs="0"/>
 *         &lt;element ref="{}ValueDifference" minOccurs="0"/>
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
    "txnLineID",
    "itemRef",
    "quantityDifference",
    "valueDifference"
})
@XmlRootElement(name = "InventoryAdjustmentLineMod")
public class InventoryAdjustmentLineMod {

    @XmlElement(name = "TxnLineID", required = true)
    protected String txnLineID;
    @XmlElement(name = "ItemRef")
    protected ItemRef itemRef;
    @XmlElement(name = "QuantityDifference")
    protected String quantityDifference;
    @XmlElement(name = "ValueDifference")
    protected String valueDifference;

    /**
     * Gets the value of the txnLineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnLineID() {
        return txnLineID;
    }

    /**
     * Sets the value of the txnLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnLineID(String value) {
        this.txnLineID = value;
    }

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

    /**
     * Gets the value of the valueDifference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDifference() {
        return valueDifference;
    }

    /**
     * Sets the value of the valueDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDifference(String value) {
        this.valueDifference = value;
    }

}
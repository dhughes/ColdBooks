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
 *         &lt;element ref="{}ItemInventoryAssemblyRef"/>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element ref="{}QuantityCanBuild"/>
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
    "itemInventoryAssemblyRef",
    "txnDate",
    "quantityCanBuild"
})
@XmlRootElement(name = "ItemAssembliesCanBuildRet")
public class ItemAssembliesCanBuildRet {

    @XmlElement(name = "ItemInventoryAssemblyRef", required = true)
    protected ItemInventoryAssemblyRef itemInventoryAssemblyRef;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "QuantityCanBuild", required = true)
    protected String quantityCanBuild;

    /**
     * Gets the value of the itemInventoryAssemblyRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInventoryAssemblyRef }
     *     
     */
    public ItemInventoryAssemblyRef getItemInventoryAssemblyRef() {
        return itemInventoryAssemblyRef;
    }

    /**
     * Sets the value of the itemInventoryAssemblyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInventoryAssemblyRef }
     *     
     */
    public void setItemInventoryAssemblyRef(ItemInventoryAssemblyRef value) {
        this.itemInventoryAssemblyRef = value;
    }

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(String value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the quantityCanBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityCanBuild() {
        return quantityCanBuild;
    }

    /**
     * Sets the value of the quantityCanBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityCanBuild(String value) {
        this.quantityCanBuild = value;
    }

}

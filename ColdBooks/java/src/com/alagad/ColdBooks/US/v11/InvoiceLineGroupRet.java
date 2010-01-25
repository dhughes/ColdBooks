//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:02:08 PM EST 
//


package com.alagad.ColdBooks.US.v11;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;group ref="{}TxnLineGroupCore"/>
 *         &lt;element ref="{}IsPrintItemsInGroup"/>
 *         &lt;element ref="{}TotalAmount"/>
 *         &lt;element ref="{}ServiceDate" minOccurs="0"/>
 *         &lt;element ref="{}InvoiceLineRet" maxOccurs="unbounded"/>
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
    "itemGroupRef",
    "desc",
    "quantity",
    "isPrintItemsInGroup",
    "totalAmount",
    "serviceDate",
    "invoiceLineRet"
})
@XmlRootElement(name = "InvoiceLineGroupRet")
public class InvoiceLineGroupRet {

    @XmlElement(name = "ItemGroupRef", required = true)
    protected ItemGroupRef itemGroupRef;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "IsPrintItemsInGroup", required = true)
    protected String isPrintItemsInGroup;
    @XmlElement(name = "TotalAmount", required = true)
    protected String totalAmount;
    @XmlElement(name = "ServiceDate")
    protected String serviceDate;
    @XmlElement(name = "InvoiceLineRet", required = true)
    protected List<InvoiceLineRet> invoiceLineRet;

    /**
     * Gets the value of the itemGroupRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemGroupRef }
     *     
     */
    public ItemGroupRef getItemGroupRef() {
        return itemGroupRef;
    }

    /**
     * Sets the value of the itemGroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemGroupRef }
     *     
     */
    public void setItemGroupRef(ItemGroupRef value) {
        this.itemGroupRef = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
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

    /**
     * Gets the value of the isPrintItemsInGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrintItemsInGroup() {
        return isPrintItemsInGroup;
    }

    /**
     * Sets the value of the isPrintItemsInGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrintItemsInGroup(String value) {
        this.isPrintItemsInGroup = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(String value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the invoiceLineRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLineRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLineRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineRet }
     * 
     * 
     */
    public List<InvoiceLineRet> getInvoiceLineRet() {
        if (invoiceLineRet == null) {
            invoiceLineRet = new ArrayList<InvoiceLineRet>();
        }
        return this.invoiceLineRet;
    }

}

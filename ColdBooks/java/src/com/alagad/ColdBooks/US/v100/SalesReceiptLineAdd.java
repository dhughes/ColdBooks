//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:49:51 PM EDT 
//


package com.alagad.ColdBooks.US.v100;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;group ref="{}TxnLineCorePriceLevelAdd"/>
 *         &lt;element ref="{}InventorySiteRef" minOccurs="0"/>
 *         &lt;element ref="{}ServiceDate" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}IsTaxable" minOccurs="0"/>
 *         &lt;element ref="{}OverrideItemAccountRef" minOccurs="0"/>
 *         &lt;element name="Other1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="29"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="29"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}CreditCardTxnInfo" minOccurs="0"/>
 *         &lt;element ref="{}DataExt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="defMacro" type="{}MACROTYPE" />
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
    "desc",
    "quantity",
    "unitOfMeasure",
    "rate",
    "ratePercent",
    "priceLevelRef",
    "classRef",
    "amount",
    "taxAmount",
    "inventorySiteRef",
    "serviceDate",
    "salesTaxCodeRef",
    "isTaxable",
    "overrideItemAccountRef",
    "other1",
    "other2",
    "creditCardTxnInfo",
    "dataExt"
})
@XmlRootElement(name = "SalesReceiptLineAdd")
public class SalesReceiptLineAdd {

    @XmlElement(name = "ItemRef")
    protected ItemRef itemRef;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "Rate")
    protected String rate;
    @XmlElement(name = "RatePercent")
    protected String ratePercent;
    @XmlElement(name = "PriceLevelRef")
    protected PriceLevelRef priceLevelRef;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "InventorySiteRef")
    protected InventorySiteRef inventorySiteRef;
    @XmlElement(name = "ServiceDate")
    protected String serviceDate;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "IsTaxable")
    protected String isTaxable;
    @XmlElement(name = "OverrideItemAccountRef")
    protected OverrideItemAccountRef overrideItemAccountRef;
    @XmlElement(name = "Other1")
    protected String other1;
    @XmlElement(name = "Other2")
    protected String other2;
    @XmlElement(name = "CreditCardTxnInfo")
    protected CreditCardTxnInfo creditCardTxnInfo;
    @XmlElement(name = "DataExt")
    protected List<DataExt> dataExt;
    @XmlAttribute
    protected String defMacro;

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
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the ratePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePercent() {
        return ratePercent;
    }

    /**
     * Sets the value of the ratePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePercent(String value) {
        this.ratePercent = value;
    }

    /**
     * Gets the value of the priceLevelRef property.
     * 
     * @return
     *     possible object is
     *     {@link PriceLevelRef }
     *     
     */
    public PriceLevelRef getPriceLevelRef() {
        return priceLevelRef;
    }

    /**
     * Sets the value of the priceLevelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceLevelRef }
     *     
     */
    public void setPriceLevelRef(PriceLevelRef value) {
        this.priceLevelRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRef }
     *     
     */
    public ClassRef getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRef }
     *     
     */
    public void setClassRef(ClassRef value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the inventorySiteRef property.
     * 
     * @return
     *     possible object is
     *     {@link InventorySiteRef }
     *     
     */
    public InventorySiteRef getInventorySiteRef() {
        return inventorySiteRef;
    }

    /**
     * Sets the value of the inventorySiteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventorySiteRef }
     *     
     */
    public void setInventorySiteRef(InventorySiteRef value) {
        this.inventorySiteRef = value;
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
     * Gets the value of the salesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxCodeRef }
     *     
     */
    public SalesTaxCodeRef getSalesTaxCodeRef() {
        return salesTaxCodeRef;
    }

    /**
     * Sets the value of the salesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxCodeRef }
     *     
     */
    public void setSalesTaxCodeRef(SalesTaxCodeRef value) {
        this.salesTaxCodeRef = value;
    }

    /**
     * Gets the value of the isTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTaxable() {
        return isTaxable;
    }

    /**
     * Sets the value of the isTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTaxable(String value) {
        this.isTaxable = value;
    }

    /**
     * Gets the value of the overrideItemAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideItemAccountRef }
     *     
     */
    public OverrideItemAccountRef getOverrideItemAccountRef() {
        return overrideItemAccountRef;
    }

    /**
     * Sets the value of the overrideItemAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideItemAccountRef }
     *     
     */
    public void setOverrideItemAccountRef(OverrideItemAccountRef value) {
        this.overrideItemAccountRef = value;
    }

    /**
     * Gets the value of the other1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther1() {
        return other1;
    }

    /**
     * Sets the value of the other1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther1(String value) {
        this.other1 = value;
    }

    /**
     * Gets the value of the other2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther2() {
        return other2;
    }

    /**
     * Sets the value of the other2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther2(String value) {
        this.other2 = value;
    }

    /**
     * Gets the value of the creditCardTxnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardTxnInfo }
     *     
     */
    public CreditCardTxnInfo getCreditCardTxnInfo() {
        return creditCardTxnInfo;
    }

    /**
     * Sets the value of the creditCardTxnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardTxnInfo }
     *     
     */
    public void setCreditCardTxnInfo(CreditCardTxnInfo value) {
        this.creditCardTxnInfo = value;
    }

    /**
     * Gets the value of the dataExt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataExt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataExt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataExt }
     * 
     * 
     */
    public List<DataExt> getDataExt() {
        if (dataExt == null) {
            dataExt = new ArrayList<DataExt>();
        }
        return this.dataExt;
    }

    /**
     * Gets the value of the defMacro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefMacro() {
        return defMacro;
    }

    /**
     * Sets the value of the defMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefMacro(String value) {
        this.defMacro = value;
    }

}

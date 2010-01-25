//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:58:36 PM EST 
//


package com.alagad.ColdBooks.CA.v20;

import java.math.BigInteger;
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
 *         &lt;group ref="{}ListCore"/>
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FullName">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="159"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}ParentRef" minOccurs="0"/>
 *         &lt;element ref="{}Sublevel"/>
 *         &lt;element ref="{}TaxCodeRef" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="SalesDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}SalesPrice" minOccurs="0"/>
 *         &lt;element ref="{}IncomeAccountRef"/>
 *         &lt;element name="PurchaseDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}PurchaseCost" minOccurs="0"/>
 *         &lt;element ref="{}COGSAccountRef"/>
 *         &lt;element ref="{}PrefVendorRef" minOccurs="0"/>
 *         &lt;element ref="{}AssetAccountRef"/>
 *         &lt;element ref="{}BuildPoint" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnHand" minOccurs="0"/>
 *         &lt;element ref="{}AverageCost" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnOrder" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnSalesOrder" minOccurs="0"/>
 *         &lt;element ref="{}ItemInventoryAssemblyLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ForeignPrice" minOccurs="0"/>
 *         &lt;element ref="{}DataExtRet" maxOccurs="unbounded" minOccurs="0"/>
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
    "listID",
    "timeCreated",
    "timeModified",
    "editSequence",
    "name",
    "fullName",
    "isActive",
    "parentRef",
    "sublevel",
    "taxCodeRef",
    "salesDesc",
    "salesPrice",
    "incomeAccountRef",
    "purchaseDesc",
    "purchaseCost",
    "cogsAccountRef",
    "prefVendorRef",
    "assetAccountRef",
    "buildPoint",
    "quantityOnHand",
    "averageCost",
    "quantityOnOrder",
    "quantityOnSalesOrder",
    "itemInventoryAssemblyLine",
    "foreignPrice",
    "dataExtRet"
})
@XmlRootElement(name = "ItemInventoryAssemblyRet")
public class ItemInventoryAssemblyRet {

    @XmlElement(name = "ListID", required = true)
    protected String listID;
    @XmlElement(name = "TimeCreated", required = true)
    protected String timeCreated;
    @XmlElement(name = "TimeModified", required = true)
    protected String timeModified;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "ParentRef")
    protected ParentRef parentRef;
    @XmlElement(name = "Sublevel", required = true)
    protected BigInteger sublevel;
    @XmlElement(name = "TaxCodeRef")
    protected List<TaxCodeRef> taxCodeRef;
    @XmlElement(name = "SalesDesc")
    protected String salesDesc;
    @XmlElement(name = "SalesPrice")
    protected String salesPrice;
    @XmlElement(name = "IncomeAccountRef", required = true)
    protected IncomeAccountRef incomeAccountRef;
    @XmlElement(name = "PurchaseDesc")
    protected String purchaseDesc;
    @XmlElement(name = "PurchaseCost")
    protected String purchaseCost;
    @XmlElement(name = "COGSAccountRef", required = true)
    protected COGSAccountRef cogsAccountRef;
    @XmlElement(name = "PrefVendorRef")
    protected PrefVendorRef prefVendorRef;
    @XmlElement(name = "AssetAccountRef", required = true)
    protected AssetAccountRef assetAccountRef;
    @XmlElement(name = "BuildPoint")
    protected String buildPoint;
    @XmlElement(name = "QuantityOnHand")
    protected String quantityOnHand;
    @XmlElement(name = "AverageCost")
    protected String averageCost;
    @XmlElement(name = "QuantityOnOrder")
    protected String quantityOnOrder;
    @XmlElement(name = "QuantityOnSalesOrder")
    protected String quantityOnSalesOrder;
    @XmlElement(name = "ItemInventoryAssemblyLine")
    protected List<ItemInventoryAssemblyLine> itemInventoryAssemblyLine;
    @XmlElement(name = "ForeignPrice")
    protected String foreignPrice;
    @XmlElement(name = "DataExtRet")
    protected List<DataExtRet> dataExtRet;

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCreated(String value) {
        this.timeCreated = value;
    }

    /**
     * Gets the value of the timeModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeModified() {
        return timeModified;
    }

    /**
     * Sets the value of the timeModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeModified(String value) {
        this.timeModified = value;
    }

    /**
     * Gets the value of the editSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditSequence() {
        return editSequence;
    }

    /**
     * Sets the value of the editSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditSequence(String value) {
        this.editSequence = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParentRef }
     *     
     */
    public ParentRef getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentRef }
     *     
     */
    public void setParentRef(ParentRef value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the sublevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSublevel() {
        return sublevel;
    }

    /**
     * Sets the value of the sublevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSublevel(BigInteger value) {
        this.sublevel = value;
    }

    /**
     * Gets the value of the taxCodeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCodeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCodeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCodeRef }
     * 
     * 
     */
    public List<TaxCodeRef> getTaxCodeRef() {
        if (taxCodeRef == null) {
            taxCodeRef = new ArrayList<TaxCodeRef>();
        }
        return this.taxCodeRef;
    }

    /**
     * Gets the value of the salesDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDesc() {
        return salesDesc;
    }

    /**
     * Sets the value of the salesDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDesc(String value) {
        this.salesDesc = value;
    }

    /**
     * Gets the value of the salesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPrice(String value) {
        this.salesPrice = value;
    }

    /**
     * Gets the value of the incomeAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeAccountRef }
     *     
     */
    public IncomeAccountRef getIncomeAccountRef() {
        return incomeAccountRef;
    }

    /**
     * Sets the value of the incomeAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeAccountRef }
     *     
     */
    public void setIncomeAccountRef(IncomeAccountRef value) {
        this.incomeAccountRef = value;
    }

    /**
     * Gets the value of the purchaseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDesc() {
        return purchaseDesc;
    }

    /**
     * Sets the value of the purchaseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDesc(String value) {
        this.purchaseDesc = value;
    }

    /**
     * Gets the value of the purchaseCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseCost() {
        return purchaseCost;
    }

    /**
     * Sets the value of the purchaseCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseCost(String value) {
        this.purchaseCost = value;
    }

    /**
     * Gets the value of the cogsAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link COGSAccountRef }
     *     
     */
    public COGSAccountRef getCOGSAccountRef() {
        return cogsAccountRef;
    }

    /**
     * Sets the value of the cogsAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link COGSAccountRef }
     *     
     */
    public void setCOGSAccountRef(COGSAccountRef value) {
        this.cogsAccountRef = value;
    }

    /**
     * Gets the value of the prefVendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link PrefVendorRef }
     *     
     */
    public PrefVendorRef getPrefVendorRef() {
        return prefVendorRef;
    }

    /**
     * Sets the value of the prefVendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefVendorRef }
     *     
     */
    public void setPrefVendorRef(PrefVendorRef value) {
        this.prefVendorRef = value;
    }

    /**
     * Gets the value of the assetAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAccountRef }
     *     
     */
    public AssetAccountRef getAssetAccountRef() {
        return assetAccountRef;
    }

    /**
     * Sets the value of the assetAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAccountRef }
     *     
     */
    public void setAssetAccountRef(AssetAccountRef value) {
        this.assetAccountRef = value;
    }

    /**
     * Gets the value of the buildPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildPoint() {
        return buildPoint;
    }

    /**
     * Sets the value of the buildPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildPoint(String value) {
        this.buildPoint = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnHand(String value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the averageCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAverageCost() {
        return averageCost;
    }

    /**
     * Sets the value of the averageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageCost(String value) {
        this.averageCost = value;
    }

    /**
     * Gets the value of the quantityOnOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnOrder() {
        return quantityOnOrder;
    }

    /**
     * Sets the value of the quantityOnOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnOrder(String value) {
        this.quantityOnOrder = value;
    }

    /**
     * Gets the value of the quantityOnSalesOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnSalesOrder() {
        return quantityOnSalesOrder;
    }

    /**
     * Sets the value of the quantityOnSalesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnSalesOrder(String value) {
        this.quantityOnSalesOrder = value;
    }

    /**
     * Gets the value of the itemInventoryAssemblyLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInventoryAssemblyLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInventoryAssemblyLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInventoryAssemblyLine }
     * 
     * 
     */
    public List<ItemInventoryAssemblyLine> getItemInventoryAssemblyLine() {
        if (itemInventoryAssemblyLine == null) {
            itemInventoryAssemblyLine = new ArrayList<ItemInventoryAssemblyLine>();
        }
        return this.itemInventoryAssemblyLine;
    }

    /**
     * Gets the value of the foreignPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignPrice() {
        return foreignPrice;
    }

    /**
     * Sets the value of the foreignPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignPrice(String value) {
        this.foreignPrice = value;
    }

    /**
     * Gets the value of the dataExtRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataExtRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataExtRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataExtRet }
     * 
     * 
     */
    public List<DataExtRet> getDataExtRet() {
        if (dataExtRet == null) {
            dataExtRet = new ArrayList<DataExtRet>();
        }
        return this.dataExtRet;
    }

}

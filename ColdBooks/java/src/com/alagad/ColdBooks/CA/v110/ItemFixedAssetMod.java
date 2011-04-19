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
 *         &lt;group ref="{}ListCoreMod"/>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}AcquiredAs" minOccurs="0"/>
 *         &lt;element name="PurchaseDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}PurchaseDate" minOccurs="0"/>
 *         &lt;element ref="{}PurchaseCost" minOccurs="0"/>
 *         &lt;element name="VendorOrPayeeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AssetAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}FixedAssetSalesInfoMod" minOccurs="0"/>
 *         &lt;element name="AssetDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Location" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PONumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SerialNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}WarrantyExpDate" minOccurs="0"/>
 *         &lt;element name="Notes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AssetNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}CostBasis" minOccurs="0"/>
 *         &lt;element ref="{}YearEndAccumulatedDepreciation" minOccurs="0"/>
 *         &lt;element ref="{}YearEndBookValue" minOccurs="0"/>
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
    "editSequence",
    "name",
    "isActive",
    "acquiredAs",
    "purchaseDesc",
    "purchaseDate",
    "purchaseCost",
    "vendorOrPayeeName",
    "assetAccountRef",
    "fixedAssetSalesInfoMod",
    "assetDesc",
    "location",
    "poNumber",
    "serialNumber",
    "warrantyExpDate",
    "notes",
    "assetNumber",
    "costBasis",
    "yearEndAccumulatedDepreciation",
    "yearEndBookValue"
})
@XmlRootElement(name = "ItemFixedAssetMod")
public class ItemFixedAssetMod {

    @XmlElement(name = "ListID", required = true)
    protected String listID;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "AcquiredAs")
    protected String acquiredAs;
    @XmlElement(name = "PurchaseDesc")
    protected String purchaseDesc;
    @XmlElement(name = "PurchaseDate")
    protected String purchaseDate;
    @XmlElement(name = "PurchaseCost")
    protected String purchaseCost;
    @XmlElement(name = "VendorOrPayeeName")
    protected String vendorOrPayeeName;
    @XmlElement(name = "AssetAccountRef")
    protected AssetAccountRef assetAccountRef;
    @XmlElement(name = "FixedAssetSalesInfoMod")
    protected FixedAssetSalesInfoMod fixedAssetSalesInfoMod;
    @XmlElement(name = "AssetDesc")
    protected String assetDesc;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "PONumber")
    protected String poNumber;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "WarrantyExpDate")
    protected String warrantyExpDate;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "AssetNumber")
    protected String assetNumber;
    @XmlElement(name = "CostBasis")
    protected String costBasis;
    @XmlElement(name = "YearEndAccumulatedDepreciation")
    protected String yearEndAccumulatedDepreciation;
    @XmlElement(name = "YearEndBookValue")
    protected String yearEndBookValue;

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
     * Gets the value of the acquiredAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquiredAs() {
        return acquiredAs;
    }

    /**
     * Sets the value of the acquiredAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquiredAs(String value) {
        this.acquiredAs = value;
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
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDate(String value) {
        this.purchaseDate = value;
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
     * Gets the value of the vendorOrPayeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorOrPayeeName() {
        return vendorOrPayeeName;
    }

    /**
     * Sets the value of the vendorOrPayeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorOrPayeeName(String value) {
        this.vendorOrPayeeName = value;
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
     * Gets the value of the fixedAssetSalesInfoMod property.
     * 
     * @return
     *     possible object is
     *     {@link FixedAssetSalesInfoMod }
     *     
     */
    public FixedAssetSalesInfoMod getFixedAssetSalesInfoMod() {
        return fixedAssetSalesInfoMod;
    }

    /**
     * Sets the value of the fixedAssetSalesInfoMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedAssetSalesInfoMod }
     *     
     */
    public void setFixedAssetSalesInfoMod(FixedAssetSalesInfoMod value) {
        this.fixedAssetSalesInfoMod = value;
    }

    /**
     * Gets the value of the assetDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetDesc() {
        return assetDesc;
    }

    /**
     * Sets the value of the assetDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetDesc(String value) {
        this.assetDesc = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the warrantyExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyExpDate() {
        return warrantyExpDate;
    }

    /**
     * Sets the value of the warrantyExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyExpDate(String value) {
        this.warrantyExpDate = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the costBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostBasis() {
        return costBasis;
    }

    /**
     * Sets the value of the costBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostBasis(String value) {
        this.costBasis = value;
    }

    /**
     * Gets the value of the yearEndAccumulatedDepreciation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearEndAccumulatedDepreciation() {
        return yearEndAccumulatedDepreciation;
    }

    /**
     * Sets the value of the yearEndAccumulatedDepreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearEndAccumulatedDepreciation(String value) {
        this.yearEndAccumulatedDepreciation = value;
    }

    /**
     * Gets the value of the yearEndBookValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearEndBookValue() {
        return yearEndBookValue;
    }

    /**
     * Sets the value of the yearEndBookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearEndBookValue(String value) {
        this.yearEndBookValue = value;
    }

}

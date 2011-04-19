//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

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
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="41"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FullName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="209"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}ParentRef" minOccurs="0"/>
 *         &lt;element ref="{}Sublevel" minOccurs="0"/>
 *         &lt;element name="CompanyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="41"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;group ref="{}PersonName"/>
 *         &lt;element ref="{}BillAddress" minOccurs="0"/>
 *         &lt;element ref="{}BillAddressBlock" minOccurs="0"/>
 *         &lt;element ref="{}ShipAddress" minOccurs="0"/>
 *         &lt;element ref="{}ShipAddressBlock" minOccurs="0"/>
 *         &lt;element name="PrintAs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="41"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;group ref="{}CommInfo"/>
 *         &lt;element ref="{}CustomerTypeRef" minOccurs="0"/>
 *         &lt;element ref="{}TermsRef" minOccurs="0"/>
 *         &lt;element ref="{}SalesRepRef" minOccurs="0"/>
 *         &lt;element ref="{}Balance" minOccurs="0"/>
 *         &lt;element ref="{}TotalBalance" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}ItemSalesTaxRef" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCountry" minOccurs="0"/>
 *         &lt;element name="ResaleNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccountNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}CreditLimit" minOccurs="0"/>
 *         &lt;element ref="{}PreferredPaymentMethodRef" minOccurs="0"/>
 *         &lt;element ref="{}CreditCardInfo" minOccurs="0"/>
 *         &lt;element ref="{}JobStatus" minOccurs="0"/>
 *         &lt;element ref="{}JobStartDate" minOccurs="0"/>
 *         &lt;element ref="{}JobProjectedEndDate" minOccurs="0"/>
 *         &lt;element ref="{}JobEndDate" minOccurs="0"/>
 *         &lt;element name="JobDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}JobTypeRef" minOccurs="0"/>
 *         &lt;element name="Notes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsStatementWithParent" minOccurs="0"/>
 *         &lt;element ref="{}DeliveryMethod" minOccurs="0"/>
 *         &lt;element ref="{}PriceLevelRef" minOccurs="0"/>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;element name="TaxRegistrationNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}CurrencyRef" minOccurs="0"/>
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
    "companyName",
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "suffix",
    "billAddress",
    "billAddressBlock",
    "shipAddress",
    "shipAddressBlock",
    "printAs",
    "phone",
    "mobile",
    "pager",
    "altPhone",
    "fax",
    "email",
    "contact",
    "altContact",
    "customerTypeRef",
    "termsRef",
    "salesRepRef",
    "balance",
    "totalBalance",
    "salesTaxCodeRef",
    "itemSalesTaxRef",
    "salesTaxCountry",
    "resaleNumber",
    "accountNumber",
    "creditLimit",
    "preferredPaymentMethodRef",
    "creditCardInfo",
    "jobStatus",
    "jobStartDate",
    "jobProjectedEndDate",
    "jobEndDate",
    "jobDesc",
    "jobTypeRef",
    "notes",
    "isStatementWithParent",
    "deliveryMethod",
    "priceLevelRef",
    "externalGUID",
    "taxRegistrationNumber",
    "currencyRef",
    "dataExtRet"
})
@XmlRootElement(name = "CustomerRet")
public class CustomerRet {

    @XmlElement(name = "ListID")
    protected String listID;
    @XmlElement(name = "TimeCreated")
    protected String timeCreated;
    @XmlElement(name = "TimeModified")
    protected String timeModified;
    @XmlElement(name = "EditSequence")
    protected String editSequence;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "ParentRef")
    protected ParentRef parentRef;
    @XmlElement(name = "Sublevel")
    protected BigInteger sublevel;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "Salutation")
    protected String salutation;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "BillAddress")
    protected BillAddress billAddress;
    @XmlElement(name = "BillAddressBlock")
    protected BillAddressBlock billAddressBlock;
    @XmlElement(name = "ShipAddress")
    protected ShipAddress shipAddress;
    @XmlElement(name = "ShipAddressBlock")
    protected ShipAddressBlock shipAddressBlock;
    @XmlElement(name = "PrintAs")
    protected String printAs;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Pager")
    protected String pager;
    @XmlElement(name = "AltPhone")
    protected String altPhone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "AltContact")
    protected String altContact;
    @XmlElement(name = "CustomerTypeRef")
    protected CustomerTypeRef customerTypeRef;
    @XmlElement(name = "TermsRef")
    protected TermsRef termsRef;
    @XmlElement(name = "SalesRepRef")
    protected SalesRepRef salesRepRef;
    @XmlElement(name = "Balance")
    protected String balance;
    @XmlElement(name = "TotalBalance")
    protected String totalBalance;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "ItemSalesTaxRef")
    protected ItemSalesTaxRef itemSalesTaxRef;
    @XmlElement(name = "SalesTaxCountry", defaultValue = "Canada")
    protected String salesTaxCountry;
    @XmlElement(name = "ResaleNumber")
    protected String resaleNumber;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "CreditLimit")
    protected String creditLimit;
    @XmlElement(name = "PreferredPaymentMethodRef")
    protected PreferredPaymentMethodRef preferredPaymentMethodRef;
    @XmlElement(name = "CreditCardInfo")
    protected CreditCardInfo creditCardInfo;
    @XmlElement(name = "JobStatus", defaultValue = "None")
    protected String jobStatus;
    @XmlElement(name = "JobStartDate")
    protected String jobStartDate;
    @XmlElement(name = "JobProjectedEndDate")
    protected String jobProjectedEndDate;
    @XmlElement(name = "JobEndDate")
    protected String jobEndDate;
    @XmlElement(name = "JobDesc")
    protected String jobDesc;
    @XmlElement(name = "JobTypeRef")
    protected JobTypeRef jobTypeRef;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "IsStatementWithParent")
    protected String isStatementWithParent;
    @XmlElement(name = "DeliveryMethod", defaultValue = "Print")
    protected String deliveryMethod;
    @XmlElement(name = "PriceLevelRef")
    protected PriceLevelRef priceLevelRef;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElement(name = "TaxRegistrationNumber")
    protected String taxRegistrationNumber;
    @XmlElement(name = "CurrencyRef")
    protected CurrencyRef currencyRef;
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
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the billAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BillAddress }
     *     
     */
    public BillAddress getBillAddress() {
        return billAddress;
    }

    /**
     * Sets the value of the billAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillAddress }
     *     
     */
    public void setBillAddress(BillAddress value) {
        this.billAddress = value;
    }

    /**
     * Gets the value of the billAddressBlock property.
     * 
     * @return
     *     possible object is
     *     {@link BillAddressBlock }
     *     
     */
    public BillAddressBlock getBillAddressBlock() {
        return billAddressBlock;
    }

    /**
     * Sets the value of the billAddressBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillAddressBlock }
     *     
     */
    public void setBillAddressBlock(BillAddressBlock value) {
        this.billAddressBlock = value;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipAddress }
     *     
     */
    public ShipAddress getShipAddress() {
        return shipAddress;
    }

    /**
     * Sets the value of the shipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipAddress }
     *     
     */
    public void setShipAddress(ShipAddress value) {
        this.shipAddress = value;
    }

    /**
     * Gets the value of the shipAddressBlock property.
     * 
     * @return
     *     possible object is
     *     {@link ShipAddressBlock }
     *     
     */
    public ShipAddressBlock getShipAddressBlock() {
        return shipAddressBlock;
    }

    /**
     * Sets the value of the shipAddressBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipAddressBlock }
     *     
     */
    public void setShipAddressBlock(ShipAddressBlock value) {
        this.shipAddressBlock = value;
    }

    /**
     * Gets the value of the printAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintAs() {
        return printAs;
    }

    /**
     * Sets the value of the printAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintAs(String value) {
        this.printAs = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPager(String value) {
        this.pager = value;
    }

    /**
     * Gets the value of the altPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * Sets the value of the altPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhone(String value) {
        this.altPhone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the altContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltContact() {
        return altContact;
    }

    /**
     * Sets the value of the altContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltContact(String value) {
        this.altContact = value;
    }

    /**
     * Gets the value of the customerTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTypeRef }
     *     
     */
    public CustomerTypeRef getCustomerTypeRef() {
        return customerTypeRef;
    }

    /**
     * Sets the value of the customerTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTypeRef }
     *     
     */
    public void setCustomerTypeRef(CustomerTypeRef value) {
        this.customerTypeRef = value;
    }

    /**
     * Gets the value of the termsRef property.
     * 
     * @return
     *     possible object is
     *     {@link TermsRef }
     *     
     */
    public TermsRef getTermsRef() {
        return termsRef;
    }

    /**
     * Sets the value of the termsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsRef }
     *     
     */
    public void setTermsRef(TermsRef value) {
        this.termsRef = value;
    }

    /**
     * Gets the value of the salesRepRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRepRef }
     *     
     */
    public SalesRepRef getSalesRepRef() {
        return salesRepRef;
    }

    /**
     * Sets the value of the salesRepRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRepRef }
     *     
     */
    public void setSalesRepRef(SalesRepRef value) {
        this.salesRepRef = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the totalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBalance() {
        return totalBalance;
    }

    /**
     * Sets the value of the totalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBalance(String value) {
        this.totalBalance = value;
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
     * Gets the value of the itemSalesTaxRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSalesTaxRef }
     *     
     */
    public ItemSalesTaxRef getItemSalesTaxRef() {
        return itemSalesTaxRef;
    }

    /**
     * Sets the value of the itemSalesTaxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSalesTaxRef }
     *     
     */
    public void setItemSalesTaxRef(ItemSalesTaxRef value) {
        this.itemSalesTaxRef = value;
    }

    /**
     * Gets the value of the salesTaxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxCountry() {
        return salesTaxCountry;
    }

    /**
     * Sets the value of the salesTaxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxCountry(String value) {
        this.salesTaxCountry = value;
    }

    /**
     * Gets the value of the resaleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResaleNumber() {
        return resaleNumber;
    }

    /**
     * Sets the value of the resaleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResaleNumber(String value) {
        this.resaleNumber = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the preferredPaymentMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredPaymentMethodRef }
     *     
     */
    public PreferredPaymentMethodRef getPreferredPaymentMethodRef() {
        return preferredPaymentMethodRef;
    }

    /**
     * Sets the value of the preferredPaymentMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredPaymentMethodRef }
     *     
     */
    public void setPreferredPaymentMethodRef(PreferredPaymentMethodRef value) {
        this.preferredPaymentMethodRef = value;
    }

    /**
     * Gets the value of the creditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInfo }
     *     
     */
    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Sets the value of the creditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInfo }
     *     
     */
    public void setCreditCardInfo(CreditCardInfo value) {
        this.creditCardInfo = value;
    }

    /**
     * Gets the value of the jobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * Sets the value of the jobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStatus(String value) {
        this.jobStatus = value;
    }

    /**
     * Gets the value of the jobStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStartDate() {
        return jobStartDate;
    }

    /**
     * Sets the value of the jobStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStartDate(String value) {
        this.jobStartDate = value;
    }

    /**
     * Gets the value of the jobProjectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobProjectedEndDate() {
        return jobProjectedEndDate;
    }

    /**
     * Sets the value of the jobProjectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobProjectedEndDate(String value) {
        this.jobProjectedEndDate = value;
    }

    /**
     * Gets the value of the jobEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobEndDate() {
        return jobEndDate;
    }

    /**
     * Sets the value of the jobEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobEndDate(String value) {
        this.jobEndDate = value;
    }

    /**
     * Gets the value of the jobDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * Sets the value of the jobDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDesc(String value) {
        this.jobDesc = value;
    }

    /**
     * Gets the value of the jobTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link JobTypeRef }
     *     
     */
    public JobTypeRef getJobTypeRef() {
        return jobTypeRef;
    }

    /**
     * Sets the value of the jobTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTypeRef }
     *     
     */
    public void setJobTypeRef(JobTypeRef value) {
        this.jobTypeRef = value;
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
     * Gets the value of the isStatementWithParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStatementWithParent() {
        return isStatementWithParent;
    }

    /**
     * Sets the value of the isStatementWithParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStatementWithParent(String value) {
        this.isStatementWithParent = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
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
     * Gets the value of the externalGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalGUID() {
        return externalGUID;
    }

    /**
     * Sets the value of the externalGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalGUID(String value) {
        this.externalGUID = value;
    }

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * Sets the value of the taxRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationNumber(String value) {
        this.taxRegistrationNumber = value;
    }

    /**
     * Gets the value of the currencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRef }
     *     
     */
    public CurrencyRef getCurrencyRef() {
        return currencyRef;
    }

    /**
     * Sets the value of the currencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRef }
     *     
     */
    public void setCurrencyRef(CurrencyRef value) {
        this.currencyRef = value;
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

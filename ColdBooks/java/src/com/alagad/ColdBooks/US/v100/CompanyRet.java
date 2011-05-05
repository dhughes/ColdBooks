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
 *         &lt;element ref="{}IsSampleCompany" minOccurs="0"/>
 *         &lt;element name="CompanyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="59"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LegalCompanyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="59"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}Address" minOccurs="0"/>
 *         &lt;element ref="{}AddressBlock" minOccurs="0"/>
 *         &lt;element ref="{}LegalAddress" minOccurs="0"/>
 *         &lt;element ref="{}CompanyAddressForCustomer" minOccurs="0"/>
 *         &lt;element ref="{}CompanyAddressBlockForCustomer" minOccurs="0"/>
 *         &lt;element name="Phone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="51"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Fax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="51"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Email" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="1023"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}CompanyEmailForCustomer" minOccurs="0"/>
 *         &lt;element name="CompanyWebSite" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}FirstMonthFiscalYear" minOccurs="0"/>
 *         &lt;element ref="{}FirstMonthIncomeTaxYear" minOccurs="0"/>
 *         &lt;element name="CompanyType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SSN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}TaxForm" minOccurs="0"/>
 *         &lt;element ref="{}SubscribedServices" minOccurs="0"/>
 *         &lt;element ref="{}AccountantCopy" minOccurs="0"/>
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
    "isSampleCompany",
    "companyName",
    "legalCompanyName",
    "address",
    "addressBlock",
    "legalAddress",
    "companyAddressForCustomer",
    "companyAddressBlockForCustomer",
    "phone",
    "fax",
    "email",
    "companyEmailForCustomer",
    "companyWebSite",
    "firstMonthFiscalYear",
    "firstMonthIncomeTaxYear",
    "companyType",
    "ein",
    "ssn",
    "taxForm",
    "subscribedServices",
    "accountantCopy",
    "dataExtRet"
})
@XmlRootElement(name = "CompanyRet")
public class CompanyRet {

    @XmlElement(name = "IsSampleCompany")
    protected String isSampleCompany;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "LegalCompanyName")
    protected String legalCompanyName;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "AddressBlock")
    protected AddressBlock addressBlock;
    @XmlElement(name = "LegalAddress")
    protected LegalAddress legalAddress;
    @XmlElement(name = "CompanyAddressForCustomer")
    protected CompanyAddressForCustomer companyAddressForCustomer;
    @XmlElement(name = "CompanyAddressBlockForCustomer")
    protected CompanyAddressBlockForCustomer companyAddressBlockForCustomer;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "CompanyEmailForCustomer")
    protected String companyEmailForCustomer;
    @XmlElement(name = "CompanyWebSite")
    protected String companyWebSite;
    @XmlElement(name = "FirstMonthFiscalYear")
    protected String firstMonthFiscalYear;
    @XmlElement(name = "FirstMonthIncomeTaxYear")
    protected String firstMonthIncomeTaxYear;
    @XmlElement(name = "CompanyType")
    protected String companyType;
    @XmlElement(name = "EIN")
    protected String ein;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "TaxForm")
    protected String taxForm;
    @XmlElement(name = "SubscribedServices")
    protected SubscribedServices subscribedServices;
    @XmlElement(name = "AccountantCopy")
    protected AccountantCopy accountantCopy;
    @XmlElement(name = "DataExtRet")
    protected List<DataExtRet> dataExtRet;

    /**
     * Gets the value of the isSampleCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSampleCompany() {
        return isSampleCompany;
    }

    /**
     * Sets the value of the isSampleCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSampleCompany(String value) {
        this.isSampleCompany = value;
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
     * Gets the value of the legalCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalCompanyName() {
        return legalCompanyName;
    }

    /**
     * Sets the value of the legalCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalCompanyName(String value) {
        this.legalCompanyName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressBlock property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBlock }
     *     
     */
    public AddressBlock getAddressBlock() {
        return addressBlock;
    }

    /**
     * Sets the value of the addressBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBlock }
     *     
     */
    public void setAddressBlock(AddressBlock value) {
        this.addressBlock = value;
    }

    /**
     * Gets the value of the legalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link LegalAddress }
     *     
     */
    public LegalAddress getLegalAddress() {
        return legalAddress;
    }

    /**
     * Sets the value of the legalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalAddress }
     *     
     */
    public void setLegalAddress(LegalAddress value) {
        this.legalAddress = value;
    }

    /**
     * Gets the value of the companyAddressForCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAddressForCustomer }
     *     
     */
    public CompanyAddressForCustomer getCompanyAddressForCustomer() {
        return companyAddressForCustomer;
    }

    /**
     * Sets the value of the companyAddressForCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAddressForCustomer }
     *     
     */
    public void setCompanyAddressForCustomer(CompanyAddressForCustomer value) {
        this.companyAddressForCustomer = value;
    }

    /**
     * Gets the value of the companyAddressBlockForCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAddressBlockForCustomer }
     *     
     */
    public CompanyAddressBlockForCustomer getCompanyAddressBlockForCustomer() {
        return companyAddressBlockForCustomer;
    }

    /**
     * Sets the value of the companyAddressBlockForCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAddressBlockForCustomer }
     *     
     */
    public void setCompanyAddressBlockForCustomer(CompanyAddressBlockForCustomer value) {
        this.companyAddressBlockForCustomer = value;
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
     * Gets the value of the companyEmailForCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyEmailForCustomer() {
        return companyEmailForCustomer;
    }

    /**
     * Sets the value of the companyEmailForCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyEmailForCustomer(String value) {
        this.companyEmailForCustomer = value;
    }

    /**
     * Gets the value of the companyWebSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWebSite() {
        return companyWebSite;
    }

    /**
     * Sets the value of the companyWebSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWebSite(String value) {
        this.companyWebSite = value;
    }

    /**
     * Gets the value of the firstMonthFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstMonthFiscalYear() {
        return firstMonthFiscalYear;
    }

    /**
     * Sets the value of the firstMonthFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstMonthFiscalYear(String value) {
        this.firstMonthFiscalYear = value;
    }

    /**
     * Gets the value of the firstMonthIncomeTaxYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstMonthIncomeTaxYear() {
        return firstMonthIncomeTaxYear;
    }

    /**
     * Sets the value of the firstMonthIncomeTaxYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstMonthIncomeTaxYear(String value) {
        this.firstMonthIncomeTaxYear = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the ein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN() {
        return ein;
    }

    /**
     * Sets the value of the ein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN(String value) {
        this.ein = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the taxForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxForm() {
        return taxForm;
    }

    /**
     * Sets the value of the taxForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxForm(String value) {
        this.taxForm = value;
    }

    /**
     * Gets the value of the subscribedServices property.
     * 
     * @return
     *     possible object is
     *     {@link SubscribedServices }
     *     
     */
    public SubscribedServices getSubscribedServices() {
        return subscribedServices;
    }

    /**
     * Sets the value of the subscribedServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscribedServices }
     *     
     */
    public void setSubscribedServices(SubscribedServices value) {
        this.subscribedServices = value;
    }

    /**
     * Gets the value of the accountantCopy property.
     * 
     * @return
     *     possible object is
     *     {@link AccountantCopy }
     *     
     */
    public AccountantCopy getAccountantCopy() {
        return accountantCopy;
    }

    /**
     * Sets the value of the accountantCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountantCopy }
     *     
     */
    public void setAccountantCopy(AccountantCopy value) {
        this.accountantCopy = value;
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
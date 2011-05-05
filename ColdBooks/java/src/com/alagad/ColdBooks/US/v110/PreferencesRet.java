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
 *         &lt;element ref="{}AccountingPreferences" minOccurs="0"/>
 *         &lt;element ref="{}FinanceChargePreferences" minOccurs="0"/>
 *         &lt;element ref="{}JobsAndEstimatesPreferences" minOccurs="0"/>
 *         &lt;element ref="{}MultiCurrencyPreferences" minOccurs="0"/>
 *         &lt;element ref="{}MultiLocationInventoryPreferences" minOccurs="0"/>
 *         &lt;element ref="{}PurchasesAndVendorsPreferences" minOccurs="0"/>
 *         &lt;element ref="{}ReportsPreferences" minOccurs="0"/>
 *         &lt;element ref="{}SalesAndCustomersPreferences" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxPreferences" minOccurs="0"/>
 *         &lt;element ref="{}TimeTrackingPreferences" minOccurs="0"/>
 *         &lt;element ref="{}CurrentAppAccessRights" minOccurs="0"/>
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
    "accountingPreferences",
    "financeChargePreferences",
    "jobsAndEstimatesPreferences",
    "multiCurrencyPreferences",
    "multiLocationInventoryPreferences",
    "purchasesAndVendorsPreferences",
    "reportsPreferences",
    "salesAndCustomersPreferences",
    "salesTaxPreferences",
    "timeTrackingPreferences",
    "currentAppAccessRights"
})
@XmlRootElement(name = "PreferencesRet")
public class PreferencesRet {

    @XmlElement(name = "AccountingPreferences")
    protected AccountingPreferences accountingPreferences;
    @XmlElement(name = "FinanceChargePreferences")
    protected FinanceChargePreferences financeChargePreferences;
    @XmlElement(name = "JobsAndEstimatesPreferences")
    protected JobsAndEstimatesPreferences jobsAndEstimatesPreferences;
    @XmlElement(name = "MultiCurrencyPreferences")
    protected MultiCurrencyPreferences multiCurrencyPreferences;
    @XmlElement(name = "MultiLocationInventoryPreferences")
    protected MultiLocationInventoryPreferences multiLocationInventoryPreferences;
    @XmlElement(name = "PurchasesAndVendorsPreferences")
    protected PurchasesAndVendorsPreferences purchasesAndVendorsPreferences;
    @XmlElement(name = "ReportsPreferences")
    protected ReportsPreferences reportsPreferences;
    @XmlElement(name = "SalesAndCustomersPreferences")
    protected SalesAndCustomersPreferences salesAndCustomersPreferences;
    @XmlElement(name = "SalesTaxPreferences")
    protected SalesTaxPreferences salesTaxPreferences;
    @XmlElement(name = "TimeTrackingPreferences")
    protected TimeTrackingPreferences timeTrackingPreferences;
    @XmlElement(name = "CurrentAppAccessRights")
    protected CurrentAppAccessRights currentAppAccessRights;

    /**
     * Gets the value of the accountingPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPreferences }
     *     
     */
    public AccountingPreferences getAccountingPreferences() {
        return accountingPreferences;
    }

    /**
     * Sets the value of the accountingPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPreferences }
     *     
     */
    public void setAccountingPreferences(AccountingPreferences value) {
        this.accountingPreferences = value;
    }

    /**
     * Gets the value of the financeChargePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link FinanceChargePreferences }
     *     
     */
    public FinanceChargePreferences getFinanceChargePreferences() {
        return financeChargePreferences;
    }

    /**
     * Sets the value of the financeChargePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinanceChargePreferences }
     *     
     */
    public void setFinanceChargePreferences(FinanceChargePreferences value) {
        this.financeChargePreferences = value;
    }

    /**
     * Gets the value of the jobsAndEstimatesPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link JobsAndEstimatesPreferences }
     *     
     */
    public JobsAndEstimatesPreferences getJobsAndEstimatesPreferences() {
        return jobsAndEstimatesPreferences;
    }

    /**
     * Sets the value of the jobsAndEstimatesPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobsAndEstimatesPreferences }
     *     
     */
    public void setJobsAndEstimatesPreferences(JobsAndEstimatesPreferences value) {
        this.jobsAndEstimatesPreferences = value;
    }

    /**
     * Gets the value of the multiCurrencyPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurrencyPreferences }
     *     
     */
    public MultiCurrencyPreferences getMultiCurrencyPreferences() {
        return multiCurrencyPreferences;
    }

    /**
     * Sets the value of the multiCurrencyPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurrencyPreferences }
     *     
     */
    public void setMultiCurrencyPreferences(MultiCurrencyPreferences value) {
        this.multiCurrencyPreferences = value;
    }

    /**
     * Gets the value of the multiLocationInventoryPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLocationInventoryPreferences }
     *     
     */
    public MultiLocationInventoryPreferences getMultiLocationInventoryPreferences() {
        return multiLocationInventoryPreferences;
    }

    /**
     * Sets the value of the multiLocationInventoryPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLocationInventoryPreferences }
     *     
     */
    public void setMultiLocationInventoryPreferences(MultiLocationInventoryPreferences value) {
        this.multiLocationInventoryPreferences = value;
    }

    /**
     * Gets the value of the purchasesAndVendorsPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasesAndVendorsPreferences }
     *     
     */
    public PurchasesAndVendorsPreferences getPurchasesAndVendorsPreferences() {
        return purchasesAndVendorsPreferences;
    }

    /**
     * Sets the value of the purchasesAndVendorsPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasesAndVendorsPreferences }
     *     
     */
    public void setPurchasesAndVendorsPreferences(PurchasesAndVendorsPreferences value) {
        this.purchasesAndVendorsPreferences = value;
    }

    /**
     * Gets the value of the reportsPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ReportsPreferences }
     *     
     */
    public ReportsPreferences getReportsPreferences() {
        return reportsPreferences;
    }

    /**
     * Sets the value of the reportsPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportsPreferences }
     *     
     */
    public void setReportsPreferences(ReportsPreferences value) {
        this.reportsPreferences = value;
    }

    /**
     * Gets the value of the salesAndCustomersPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SalesAndCustomersPreferences }
     *     
     */
    public SalesAndCustomersPreferences getSalesAndCustomersPreferences() {
        return salesAndCustomersPreferences;
    }

    /**
     * Sets the value of the salesAndCustomersPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesAndCustomersPreferences }
     *     
     */
    public void setSalesAndCustomersPreferences(SalesAndCustomersPreferences value) {
        this.salesAndCustomersPreferences = value;
    }

    /**
     * Gets the value of the salesTaxPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxPreferences }
     *     
     */
    public SalesTaxPreferences getSalesTaxPreferences() {
        return salesTaxPreferences;
    }

    /**
     * Sets the value of the salesTaxPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxPreferences }
     *     
     */
    public void setSalesTaxPreferences(SalesTaxPreferences value) {
        this.salesTaxPreferences = value;
    }

    /**
     * Gets the value of the timeTrackingPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTrackingPreferences }
     *     
     */
    public TimeTrackingPreferences getTimeTrackingPreferences() {
        return timeTrackingPreferences;
    }

    /**
     * Sets the value of the timeTrackingPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTrackingPreferences }
     *     
     */
    public void setTimeTrackingPreferences(TimeTrackingPreferences value) {
        this.timeTrackingPreferences = value;
    }

    /**
     * Gets the value of the currentAppAccessRights property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentAppAccessRights }
     *     
     */
    public CurrentAppAccessRights getCurrentAppAccessRights() {
        return currentAppAccessRights;
    }

    /**
     * Sets the value of the currentAppAccessRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentAppAccessRights }
     *     
     */
    public void setCurrentAppAccessRights(CurrentAppAccessRights value) {
        this.currentAppAccessRights = value;
    }

}
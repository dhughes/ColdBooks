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
 *         &lt;element ref="{}AccountMetaData"/>
 *         &lt;element ref="{}BillingRateMetaData"/>
 *         &lt;element ref="{}ClassMetaData"/>
 *         &lt;element ref="{}CustomerMsgMetaData"/>
 *         &lt;element ref="{}CustomerTypeMetaData"/>
 *         &lt;element ref="{}EntityMetaData"/>
 *         &lt;element ref="{}ItemMetaData"/>
 *         &lt;element ref="{}JobTypeMetaData"/>
 *         &lt;element ref="{}PaymentMethodMetaData"/>
 *         &lt;element ref="{}PayrollItemMetaData"/>
 *         &lt;element ref="{}PriceLevelMetaData"/>
 *         &lt;element ref="{}SalesRepMetaData"/>
 *         &lt;element ref="{}SalesTaxCodeMetaData"/>
 *         &lt;element ref="{}ShipMethodMetaData"/>
 *         &lt;element ref="{}TemplateMetaData"/>
 *         &lt;element ref="{}TermsMetaData"/>
 *         &lt;element ref="{}ToDoMetaData"/>
 *         &lt;element ref="{}VehicleMetaData"/>
 *         &lt;element ref="{}VendorTypeMetaData"/>
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
    "accountMetaData",
    "billingRateMetaData",
    "classMetaData",
    "customerMsgMetaData",
    "customerTypeMetaData",
    "entityMetaData",
    "itemMetaData",
    "jobTypeMetaData",
    "paymentMethodMetaData",
    "payrollItemMetaData",
    "priceLevelMetaData",
    "salesRepMetaData",
    "salesTaxCodeMetaData",
    "shipMethodMetaData",
    "templateMetaData",
    "termsMetaData",
    "toDoMetaData",
    "vehicleMetaData",
    "vendorTypeMetaData"
})
@XmlRootElement(name = "ListMetaData")
public class ListMetaData {

    @XmlElement(name = "AccountMetaData", required = true)
    protected AccountMetaData accountMetaData;
    @XmlElement(name = "BillingRateMetaData", required = true)
    protected BillingRateMetaData billingRateMetaData;
    @XmlElement(name = "ClassMetaData", required = true)
    protected ClassMetaData classMetaData;
    @XmlElement(name = "CustomerMsgMetaData", required = true)
    protected CustomerMsgMetaData customerMsgMetaData;
    @XmlElement(name = "CustomerTypeMetaData", required = true)
    protected CustomerTypeMetaData customerTypeMetaData;
    @XmlElement(name = "EntityMetaData", required = true)
    protected EntityMetaData entityMetaData;
    @XmlElement(name = "ItemMetaData", required = true)
    protected ItemMetaData itemMetaData;
    @XmlElement(name = "JobTypeMetaData", required = true)
    protected JobTypeMetaData jobTypeMetaData;
    @XmlElement(name = "PaymentMethodMetaData", required = true)
    protected PaymentMethodMetaData paymentMethodMetaData;
    @XmlElement(name = "PayrollItemMetaData", required = true)
    protected PayrollItemMetaData payrollItemMetaData;
    @XmlElement(name = "PriceLevelMetaData", required = true)
    protected PriceLevelMetaData priceLevelMetaData;
    @XmlElement(name = "SalesRepMetaData", required = true)
    protected SalesRepMetaData salesRepMetaData;
    @XmlElement(name = "SalesTaxCodeMetaData", required = true)
    protected SalesTaxCodeMetaData salesTaxCodeMetaData;
    @XmlElement(name = "ShipMethodMetaData", required = true)
    protected ShipMethodMetaData shipMethodMetaData;
    @XmlElement(name = "TemplateMetaData", required = true)
    protected TemplateMetaData templateMetaData;
    @XmlElement(name = "TermsMetaData", required = true)
    protected TermsMetaData termsMetaData;
    @XmlElement(name = "ToDoMetaData", required = true)
    protected ToDoMetaData toDoMetaData;
    @XmlElement(name = "VehicleMetaData", required = true)
    protected VehicleMetaData vehicleMetaData;
    @XmlElement(name = "VendorTypeMetaData", required = true)
    protected VendorTypeMetaData vendorTypeMetaData;

    /**
     * Gets the value of the accountMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountMetaData }
     *     
     */
    public AccountMetaData getAccountMetaData() {
        return accountMetaData;
    }

    /**
     * Sets the value of the accountMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountMetaData }
     *     
     */
    public void setAccountMetaData(AccountMetaData value) {
        this.accountMetaData = value;
    }

    /**
     * Gets the value of the billingRateMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link BillingRateMetaData }
     *     
     */
    public BillingRateMetaData getBillingRateMetaData() {
        return billingRateMetaData;
    }

    /**
     * Sets the value of the billingRateMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingRateMetaData }
     *     
     */
    public void setBillingRateMetaData(BillingRateMetaData value) {
        this.billingRateMetaData = value;
    }

    /**
     * Gets the value of the classMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link ClassMetaData }
     *     
     */
    public ClassMetaData getClassMetaData() {
        return classMetaData;
    }

    /**
     * Sets the value of the classMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassMetaData }
     *     
     */
    public void setClassMetaData(ClassMetaData value) {
        this.classMetaData = value;
    }

    /**
     * Gets the value of the customerMsgMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMsgMetaData }
     *     
     */
    public CustomerMsgMetaData getCustomerMsgMetaData() {
        return customerMsgMetaData;
    }

    /**
     * Sets the value of the customerMsgMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMsgMetaData }
     *     
     */
    public void setCustomerMsgMetaData(CustomerMsgMetaData value) {
        this.customerMsgMetaData = value;
    }

    /**
     * Gets the value of the customerTypeMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTypeMetaData }
     *     
     */
    public CustomerTypeMetaData getCustomerTypeMetaData() {
        return customerTypeMetaData;
    }

    /**
     * Sets the value of the customerTypeMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTypeMetaData }
     *     
     */
    public void setCustomerTypeMetaData(CustomerTypeMetaData value) {
        this.customerTypeMetaData = value;
    }

    /**
     * Gets the value of the entityMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link EntityMetaData }
     *     
     */
    public EntityMetaData getEntityMetaData() {
        return entityMetaData;
    }

    /**
     * Sets the value of the entityMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityMetaData }
     *     
     */
    public void setEntityMetaData(EntityMetaData value) {
        this.entityMetaData = value;
    }

    /**
     * Gets the value of the itemMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link ItemMetaData }
     *     
     */
    public ItemMetaData getItemMetaData() {
        return itemMetaData;
    }

    /**
     * Sets the value of the itemMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemMetaData }
     *     
     */
    public void setItemMetaData(ItemMetaData value) {
        this.itemMetaData = value;
    }

    /**
     * Gets the value of the jobTypeMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link JobTypeMetaData }
     *     
     */
    public JobTypeMetaData getJobTypeMetaData() {
        return jobTypeMetaData;
    }

    /**
     * Sets the value of the jobTypeMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTypeMetaData }
     *     
     */
    public void setJobTypeMetaData(JobTypeMetaData value) {
        this.jobTypeMetaData = value;
    }

    /**
     * Gets the value of the paymentMethodMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodMetaData }
     *     
     */
    public PaymentMethodMetaData getPaymentMethodMetaData() {
        return paymentMethodMetaData;
    }

    /**
     * Sets the value of the paymentMethodMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodMetaData }
     *     
     */
    public void setPaymentMethodMetaData(PaymentMethodMetaData value) {
        this.paymentMethodMetaData = value;
    }

    /**
     * Gets the value of the payrollItemMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemMetaData }
     *     
     */
    public PayrollItemMetaData getPayrollItemMetaData() {
        return payrollItemMetaData;
    }

    /**
     * Sets the value of the payrollItemMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemMetaData }
     *     
     */
    public void setPayrollItemMetaData(PayrollItemMetaData value) {
        this.payrollItemMetaData = value;
    }

    /**
     * Gets the value of the priceLevelMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link PriceLevelMetaData }
     *     
     */
    public PriceLevelMetaData getPriceLevelMetaData() {
        return priceLevelMetaData;
    }

    /**
     * Sets the value of the priceLevelMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceLevelMetaData }
     *     
     */
    public void setPriceLevelMetaData(PriceLevelMetaData value) {
        this.priceLevelMetaData = value;
    }

    /**
     * Gets the value of the salesRepMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRepMetaData }
     *     
     */
    public SalesRepMetaData getSalesRepMetaData() {
        return salesRepMetaData;
    }

    /**
     * Sets the value of the salesRepMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRepMetaData }
     *     
     */
    public void setSalesRepMetaData(SalesRepMetaData value) {
        this.salesRepMetaData = value;
    }

    /**
     * Gets the value of the salesTaxCodeMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxCodeMetaData }
     *     
     */
    public SalesTaxCodeMetaData getSalesTaxCodeMetaData() {
        return salesTaxCodeMetaData;
    }

    /**
     * Sets the value of the salesTaxCodeMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxCodeMetaData }
     *     
     */
    public void setSalesTaxCodeMetaData(SalesTaxCodeMetaData value) {
        this.salesTaxCodeMetaData = value;
    }

    /**
     * Gets the value of the shipMethodMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link ShipMethodMetaData }
     *     
     */
    public ShipMethodMetaData getShipMethodMetaData() {
        return shipMethodMetaData;
    }

    /**
     * Sets the value of the shipMethodMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipMethodMetaData }
     *     
     */
    public void setShipMethodMetaData(ShipMethodMetaData value) {
        this.shipMethodMetaData = value;
    }

    /**
     * Gets the value of the templateMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateMetaData }
     *     
     */
    public TemplateMetaData getTemplateMetaData() {
        return templateMetaData;
    }

    /**
     * Sets the value of the templateMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateMetaData }
     *     
     */
    public void setTemplateMetaData(TemplateMetaData value) {
        this.templateMetaData = value;
    }

    /**
     * Gets the value of the termsMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link TermsMetaData }
     *     
     */
    public TermsMetaData getTermsMetaData() {
        return termsMetaData;
    }

    /**
     * Sets the value of the termsMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsMetaData }
     *     
     */
    public void setTermsMetaData(TermsMetaData value) {
        this.termsMetaData = value;
    }

    /**
     * Gets the value of the toDoMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link ToDoMetaData }
     *     
     */
    public ToDoMetaData getToDoMetaData() {
        return toDoMetaData;
    }

    /**
     * Sets the value of the toDoMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToDoMetaData }
     *     
     */
    public void setToDoMetaData(ToDoMetaData value) {
        this.toDoMetaData = value;
    }

    /**
     * Gets the value of the vehicleMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMetaData }
     *     
     */
    public VehicleMetaData getVehicleMetaData() {
        return vehicleMetaData;
    }

    /**
     * Sets the value of the vehicleMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMetaData }
     *     
     */
    public void setVehicleMetaData(VehicleMetaData value) {
        this.vehicleMetaData = value;
    }

    /**
     * Gets the value of the vendorTypeMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link VendorTypeMetaData }
     *     
     */
    public VendorTypeMetaData getVendorTypeMetaData() {
        return vendorTypeMetaData;
    }

    /**
     * Sets the value of the vendorTypeMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorTypeMetaData }
     *     
     */
    public void setVendorTypeMetaData(VendorTypeMetaData value) {
        this.vendorTypeMetaData = value;
    }

}

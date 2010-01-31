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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="HostQueryRs" type="{}HostQueryRsType"/>
 *         &lt;element name="CompanyQueryRs" type="{}CompanyQueryRsType"/>
 *         &lt;element name="CompanyActivityQueryRs" type="{}CompanyActivityQueryRsType"/>
 *         &lt;element name="PreferencesQueryRs" type="{}PreferencesQueryRsType"/>
 *         &lt;element name="AccountAddRs" type="{}AccountAddRsType"/>
 *         &lt;element name="AccountQueryRs" type="{}AccountQueryRsType"/>
 *         &lt;element name="CustomerAddRs" type="{}CustomerAddRsType"/>
 *         &lt;element name="CustomerModRs" type="{}CustomerModRsType"/>
 *         &lt;element name="CustomerQueryRs" type="{}CustomerQueryRsType"/>
 *         &lt;element name="EmployeeAddRs" type="{}EmployeeAddRsType"/>
 *         &lt;element name="EmployeeModRs" type="{}EmployeeModRsType"/>
 *         &lt;element name="EmployeeQueryRs" type="{}EmployeeQueryRsType"/>
 *         &lt;element name="OtherNameAddRs" type="{}OtherNameAddRsType"/>
 *         &lt;element name="OtherNameModRs" type="{}OtherNameModRsType"/>
 *         &lt;element name="OtherNameQueryRs" type="{}OtherNameQueryRsType"/>
 *         &lt;element name="VendorAddRs" type="{}VendorAddRsType"/>
 *         &lt;element name="VendorModRs" type="{}VendorModRsType"/>
 *         &lt;element name="VendorQueryRs" type="{}VendorQueryRsType"/>
 *         &lt;element name="EntityQueryRs" type="{}EntityQueryRsType"/>
 *         &lt;element name="StandardTermsAddRs" type="{}StandardTermsAddRsType"/>
 *         &lt;element name="StandardTermsQueryRs" type="{}StandardTermsQueryRsType"/>
 *         &lt;element name="DateDrivenTermsAddRs" type="{}DateDrivenTermsAddRsType"/>
 *         &lt;element name="DateDrivenTermsQueryRs" type="{}DateDrivenTermsQueryRsType"/>
 *         &lt;element name="TermsQueryRs" type="{}TermsQueryRsType"/>
 *         &lt;element name="ClassAddRs" type="{}ClassAddRsType"/>
 *         &lt;element name="ClassQueryRs" type="{}ClassQueryRsType"/>
 *         &lt;element name="SalesRepAddRs" type="{}SalesRepAddRsType"/>
 *         &lt;element name="SalesRepQueryRs" type="{}SalesRepQueryRsType"/>
 *         &lt;element name="CustomerTypeAddRs" type="{}CustomerTypeAddRsType"/>
 *         &lt;element name="CustomerTypeQueryRs" type="{}CustomerTypeQueryRsType"/>
 *         &lt;element name="VendorTypeAddRs" type="{}VendorTypeAddRsType"/>
 *         &lt;element name="VendorTypeQueryRs" type="{}VendorTypeQueryRsType"/>
 *         &lt;element name="JobTypeAddRs" type="{}JobTypeAddRsType"/>
 *         &lt;element name="JobTypeQueryRs" type="{}JobTypeQueryRsType"/>
 *         &lt;element name="CustomerMsgAddRs" type="{}CustomerMsgAddRsType"/>
 *         &lt;element name="CustomerMsgQueryRs" type="{}CustomerMsgQueryRsType"/>
 *         &lt;element name="PaymentMethodAddRs" type="{}PaymentMethodAddRsType"/>
 *         &lt;element name="PaymentMethodQueryRs" type="{}PaymentMethodQueryRsType"/>
 *         &lt;element name="ShipMethodAddRs" type="{}ShipMethodAddRsType"/>
 *         &lt;element name="ShipMethodQueryRs" type="{}ShipMethodQueryRsType"/>
 *         &lt;element name="TaxCodeAddRs" type="{}TaxCodeAddRsType"/>
 *         &lt;element name="TaxCodeModRs" type="{}TaxCodeModRsType"/>
 *         &lt;element name="TaxCodeQueryRs" type="{}TaxCodeQueryRsType"/>
 *         &lt;element name="CurrencyAddRs" type="{}CurrencyAddRsType"/>
 *         &lt;element name="CurrencyModRs" type="{}CurrencyModRsType"/>
 *         &lt;element name="CurrencyQueryRs" type="{}CurrencyQueryRsType"/>
 *         &lt;element name="ToDoAddRs" type="{}ToDoAddRsType"/>
 *         &lt;element name="ToDoQueryRs" type="{}ToDoQueryRsType"/>
 *         &lt;element name="ItemServiceAddRs" type="{}ItemServiceAddRsType"/>
 *         &lt;element name="ItemServiceModRs" type="{}ItemServiceModRsType"/>
 *         &lt;element name="ItemServiceQueryRs" type="{}ItemServiceQueryRsType"/>
 *         &lt;element name="ItemNonInventoryAddRs" type="{}ItemNonInventoryAddRsType"/>
 *         &lt;element name="ItemNonInventoryModRs" type="{}ItemNonInventoryModRsType"/>
 *         &lt;element name="ItemNonInventoryQueryRs" type="{}ItemNonInventoryQueryRsType"/>
 *         &lt;element name="ItemOtherChargeAddRs" type="{}ItemOtherChargeAddRsType"/>
 *         &lt;element name="ItemOtherChargeQueryRs" type="{}ItemOtherChargeQueryRsType"/>
 *         &lt;element name="ItemInventoryAddRs" type="{}ItemInventoryAddRsType"/>
 *         &lt;element name="ItemInventoryModRs" type="{}ItemInventoryModRsType"/>
 *         &lt;element name="ItemInventoryQueryRs" type="{}ItemInventoryQueryRsType"/>
 *         &lt;element name="ItemInventoryAssemblyAddRs" type="{}ItemInventoryAssemblyAddRsType"/>
 *         &lt;element name="ItemInventoryAssemblyQueryRs" type="{}ItemInventoryAssemblyQueryRsType"/>
 *         &lt;element name="ItemSubtotalAddRs" type="{}ItemSubtotalAddRsType"/>
 *         &lt;element name="ItemSubtotalQueryRs" type="{}ItemSubtotalQueryRsType"/>
 *         &lt;element name="ItemDiscountAddRs" type="{}ItemDiscountAddRsType"/>
 *         &lt;element name="ItemDiscountQueryRs" type="{}ItemDiscountQueryRsType"/>
 *         &lt;element name="ItemPaymentAddRs" type="{}ItemPaymentAddRsType"/>
 *         &lt;element name="ItemPaymentQueryRs" type="{}ItemPaymentQueryRsType"/>
 *         &lt;element name="ItemGroupAddRs" type="{}ItemGroupAddRsType"/>
 *         &lt;element name="ItemGroupQueryRs" type="{}ItemGroupQueryRsType"/>
 *         &lt;element name="ItemQueryRs" type="{}ItemQueryRsType"/>
 *         &lt;element name="PayrollItemWageAddRs" type="{}PayrollItemWageAddRsType"/>
 *         &lt;element name="PayrollItemWageQueryRs" type="{}PayrollItemWageQueryRsType"/>
 *         &lt;element name="InvoiceAddRs" type="{}InvoiceAddRsType"/>
 *         &lt;element name="InvoiceQueryRs" type="{}InvoiceQueryRsType"/>
 *         &lt;element name="EstimateAddRs" type="{}EstimateAddRsType"/>
 *         &lt;element name="EstimateQueryRs" type="{}EstimateQueryRsType"/>
 *         &lt;element name="SalesReceiptAddRs" type="{}SalesReceiptAddRsType"/>
 *         &lt;element name="SalesReceiptQueryRs" type="{}SalesReceiptQueryRsType"/>
 *         &lt;element name="CreditMemoAddRs" type="{}CreditMemoAddRsType"/>
 *         &lt;element name="CreditMemoQueryRs" type="{}CreditMemoQueryRsType"/>
 *         &lt;element name="ReceivePaymentAddRs" type="{}ReceivePaymentAddRsType"/>
 *         &lt;element name="ReceivePaymentQueryRs" type="{}ReceivePaymentQueryRsType"/>
 *         &lt;element name="ReceivePaymentToDepositQueryRs" type="{}ReceivePaymentToDepositQueryRsType"/>
 *         &lt;element name="ChargeAddRs" type="{}ChargeAddRsType"/>
 *         &lt;element name="ChargeQueryRs" type="{}ChargeQueryRsType"/>
 *         &lt;element name="PurchaseOrderAddRs" type="{}PurchaseOrderAddRsType"/>
 *         &lt;element name="PurchaseOrderQueryRs" type="{}PurchaseOrderQueryRsType"/>
 *         &lt;element name="BillAddRs" type="{}BillAddRsType"/>
 *         &lt;element name="BillQueryRs" type="{}BillQueryRsType"/>
 *         &lt;element name="VendorCreditAddRs" type="{}VendorCreditAddRsType"/>
 *         &lt;element name="VendorCreditQueryRs" type="{}VendorCreditQueryRsType"/>
 *         &lt;element name="BillPaymentCheckAddRs" type="{}BillPaymentCheckAddRsType"/>
 *         &lt;element name="BillPaymentCheckQueryRs" type="{}BillPaymentCheckQueryRsType"/>
 *         &lt;element name="BillPaymentCreditCardAddRs" type="{}BillPaymentCreditCardAddRsType"/>
 *         &lt;element name="BillPaymentCreditCardQueryRs" type="{}BillPaymentCreditCardQueryRsType"/>
 *         &lt;element name="BillToPayQueryRs" type="{}BillToPayQueryRsType"/>
 *         &lt;element name="InventoryAdjustmentAddRs" type="{}InventoryAdjustmentAddRsType"/>
 *         &lt;element name="InventoryAdjustmentQueryRs" type="{}InventoryAdjustmentQueryRsType"/>
 *         &lt;element name="TimeTrackingAddRs" type="{}TimeTrackingAddRsType"/>
 *         &lt;element name="TimeTrackingQueryRs" type="{}TimeTrackingQueryRsType"/>
 *         &lt;element name="CheckAddRs" type="{}CheckAddRsType"/>
 *         &lt;element name="CheckQueryRs" type="{}CheckQueryRsType"/>
 *         &lt;element name="CreditCardChargeAddRs" type="{}CreditCardChargeAddRsType"/>
 *         &lt;element name="CreditCardChargeQueryRs" type="{}CreditCardChargeQueryRsType"/>
 *         &lt;element name="CreditCardCreditAddRs" type="{}CreditCardCreditAddRsType"/>
 *         &lt;element name="CreditCardCreditQueryRs" type="{}CreditCardCreditQueryRsType"/>
 *         &lt;element name="JournalEntryAddRs" type="{}JournalEntryAddRsType"/>
 *         &lt;element name="JournalEntryQueryRs" type="{}JournalEntryQueryRsType"/>
 *         &lt;element name="DepositAddRs" type="{}DepositAddRsType"/>
 *         &lt;element name="DepositQueryRs" type="{}DepositQueryRsType"/>
 *         &lt;element name="ListDelRs" type="{}ListDelRsType"/>
 *         &lt;element name="ListDeletedQueryRs" type="{}ListDeletedQueryRsType"/>
 *         &lt;element name="TxnDelRs" type="{}TxnDelRsType"/>
 *         &lt;element name="TxnVoidRs" type="{}TxnVoidRsType"/>
 *         &lt;element name="TxnDeletedQueryRs" type="{}TxnDeletedQueryRsType"/>
 *         &lt;element name="ClearedStatusModRs" type="{}ClearedStatusModRsType"/>
 *         &lt;element name="GeneralSummaryReportQueryRs" type="{}GeneralSummaryReportQueryRsType"/>
 *         &lt;element name="JobReportQueryRs" type="{}JobReportQueryRsType"/>
 *         &lt;element name="TimeReportQueryRs" type="{}TimeReportQueryRsType"/>
 *         &lt;element name="AgingReportQueryRs" type="{}AgingReportQueryRsType"/>
 *         &lt;element name="GeneralDetailReportQueryRs" type="{}GeneralDetailReportQueryRsType"/>
 *         &lt;element name="CustomDetailReportQueryRs" type="{}CustomDetailReportQueryRsType"/>
 *         &lt;element name="CustomSummaryReportQueryRs" type="{}CustomSummaryReportQueryRsType"/>
 *         &lt;element name="DataExtDefAddRs" type="{}DataExtDefAddRsType"/>
 *         &lt;element name="DataExtDefModRs" type="{}DataExtDefModRsType"/>
 *         &lt;element name="DataExtDefDelRs" type="{}DataExtDefDelRsType"/>
 *         &lt;element name="DataExtDefQueryRs" type="{}DataExtDefQueryRsType"/>
 *         &lt;element name="DataExtAddRs" type="{}DataExtAddRsType"/>
 *         &lt;element name="DataExtModRs" type="{}DataExtModRsType"/>
 *         &lt;element name="DataExtDelRs" type="{}DataExtDelRsType"/>
 *       &lt;/choice>
 *       &lt;attribute name="newMessageSetID" type="{}STRTYPE" />
 *       &lt;attribute name="messageSetStatusCode" type="{}INTTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs"
})
@XmlRootElement(name = "QBXMLMsgsRs")
public class QBXMLMsgsRs {

    @XmlElements({
        @XmlElement(name = "JournalEntryAddRs", type = JournalEntryAddRsType.class),
        @XmlElement(name = "ToDoQueryRs", type = ToDoQueryRsType.class),
        @XmlElement(name = "ItemOtherChargeAddRs", type = ItemOtherChargeAddRsType.class),
        @XmlElement(name = "ItemServiceQueryRs", type = ItemServiceQueryRsType.class),
        @XmlElement(name = "CustomDetailReportQueryRs", type = CustomDetailReportQueryRsType.class),
        @XmlElement(name = "ReceivePaymentToDepositQueryRs", type = ReceivePaymentToDepositQueryRsType.class),
        @XmlElement(name = "TermsQueryRs", type = TermsQueryRsType.class),
        @XmlElement(name = "ListDeletedQueryRs", type = ListDeletedQueryRsType.class),
        @XmlElement(name = "ReceivePaymentAddRs", type = ReceivePaymentAddRsType.class),
        @XmlElement(name = "TxnDelRs", type = TxnDelRsType.class),
        @XmlElement(name = "CompanyQueryRs", type = CompanyQueryRsType.class),
        @XmlElement(name = "CustomerMsgAddRs", type = CustomerMsgAddRsType.class),
        @XmlElement(name = "JobTypeQueryRs", type = JobTypeQueryRsType.class),
        @XmlElement(name = "CustomerTypeQueryRs", type = CustomerTypeQueryRsType.class),
        @XmlElement(name = "ShipMethodQueryRs", type = ShipMethodQueryRsType.class),
        @XmlElement(name = "TimeTrackingQueryRs", type = TimeTrackingQueryRsType.class),
        @XmlElement(name = "VendorModRs", type = VendorModRsType.class),
        @XmlElement(name = "InvoiceAddRs", type = InvoiceAddRsType.class),
        @XmlElement(name = "OtherNameModRs", type = OtherNameModRsType.class),
        @XmlElement(name = "TimeReportQueryRs", type = TimeReportQueryRsType.class),
        @XmlElement(name = "BillPaymentCheckQueryRs", type = BillPaymentCheckQueryRsType.class),
        @XmlElement(name = "TimeTrackingAddRs", type = TimeTrackingAddRsType.class),
        @XmlElement(name = "InventoryAdjustmentQueryRs", type = InventoryAdjustmentQueryRsType.class),
        @XmlElement(name = "EstimateAddRs", type = EstimateAddRsType.class),
        @XmlElement(name = "StandardTermsQueryRs", type = StandardTermsQueryRsType.class),
        @XmlElement(name = "CreditCardCreditAddRs", type = CreditCardCreditAddRsType.class),
        @XmlElement(name = "StandardTermsAddRs", type = StandardTermsAddRsType.class),
        @XmlElement(name = "InvoiceQueryRs", type = InvoiceQueryRsType.class),
        @XmlElement(name = "TxnDeletedQueryRs", type = TxnDeletedQueryRsType.class),
        @XmlElement(name = "DepositAddRs", type = DepositAddRsType.class),
        @XmlElement(name = "TaxCodeModRs", type = TaxCodeModRsType.class),
        @XmlElement(name = "ItemServiceModRs", type = ItemServiceModRsType.class),
        @XmlElement(name = "ChargeAddRs", type = ChargeAddRsType.class),
        @XmlElement(name = "ItemPaymentQueryRs", type = ItemPaymentQueryRsType.class),
        @XmlElement(name = "ClassQueryRs", type = ClassQueryRsType.class),
        @XmlElement(name = "ItemInventoryAddRs", type = ItemInventoryAddRsType.class),
        @XmlElement(name = "CreditMemoQueryRs", type = CreditMemoQueryRsType.class),
        @XmlElement(name = "PayrollItemWageAddRs", type = PayrollItemWageAddRsType.class),
        @XmlElement(name = "CreditCardChargeAddRs", type = CreditCardChargeAddRsType.class),
        @XmlElement(name = "ItemInventoryQueryRs", type = ItemInventoryQueryRsType.class),
        @XmlElement(name = "ToDoAddRs", type = ToDoAddRsType.class),
        @XmlElement(name = "CustomerMsgQueryRs", type = CustomerMsgQueryRsType.class),
        @XmlElement(name = "GeneralDetailReportQueryRs", type = GeneralDetailReportQueryRsType.class),
        @XmlElement(name = "CreditCardChargeQueryRs", type = CreditCardChargeQueryRsType.class),
        @XmlElement(name = "ItemGroupQueryRs", type = ItemGroupQueryRsType.class),
        @XmlElement(name = "CheckQueryRs", type = CheckQueryRsType.class),
        @XmlElement(name = "TaxCodeQueryRs", type = TaxCodeQueryRsType.class),
        @XmlElement(name = "CheckAddRs", type = CheckAddRsType.class),
        @XmlElement(name = "ListDelRs", type = ListDelRsType.class),
        @XmlElement(name = "CurrencyAddRs", type = CurrencyAddRsType.class),
        @XmlElement(name = "PreferencesQueryRs", type = PreferencesQueryRsType.class),
        @XmlElement(name = "DepositQueryRs", type = DepositQueryRsType.class),
        @XmlElement(name = "ItemServiceAddRs", type = ItemServiceAddRsType.class),
        @XmlElement(name = "AgingReportQueryRs", type = AgingReportQueryRsType.class),
        @XmlElement(name = "CustomerAddRs", type = CustomerAddRsType.class),
        @XmlElement(name = "JobTypeAddRs", type = JobTypeAddRsType.class),
        @XmlElement(name = "BillToPayQueryRs", type = BillToPayQueryRsType.class),
        @XmlElement(name = "ItemInventoryModRs", type = ItemInventoryModRsType.class),
        @XmlElement(name = "TaxCodeAddRs", type = TaxCodeAddRsType.class),
        @XmlElement(name = "BillQueryRs", type = BillQueryRsType.class),
        @XmlElement(name = "ItemNonInventoryQueryRs", type = ItemNonInventoryQueryRsType.class),
        @XmlElement(name = "SalesReceiptAddRs", type = SalesReceiptAddRsType.class),
        @XmlElement(name = "CompanyActivityQueryRs", type = CompanyActivityQueryRsType.class),
        @XmlElement(name = "HostQueryRs", type = HostQueryRsType.class),
        @XmlElement(name = "PurchaseOrderQueryRs", type = PurchaseOrderQueryRsType.class),
        @XmlElement(name = "VendorCreditAddRs", type = VendorCreditAddRsType.class),
        @XmlElement(name = "CreditCardCreditQueryRs", type = CreditCardCreditQueryRsType.class),
        @XmlElement(name = "PayrollItemWageQueryRs", type = PayrollItemWageQueryRsType.class),
        @XmlElement(name = "ItemNonInventoryAddRs", type = ItemNonInventoryAddRsType.class),
        @XmlElement(name = "DataExtAddRs", type = DataExtAddRsType.class),
        @XmlElement(name = "ItemGroupAddRs", type = ItemGroupAddRsType.class),
        @XmlElement(name = "PaymentMethodAddRs", type = PaymentMethodAddRsType.class),
        @XmlElement(name = "ItemPaymentAddRs", type = ItemPaymentAddRsType.class),
        @XmlElement(name = "JobReportQueryRs", type = JobReportQueryRsType.class),
        @XmlElement(name = "CreditMemoAddRs", type = CreditMemoAddRsType.class),
        @XmlElement(name = "ItemOtherChargeQueryRs", type = ItemOtherChargeQueryRsType.class),
        @XmlElement(name = "ChargeQueryRs", type = ChargeQueryRsType.class),
        @XmlElement(name = "TxnVoidRs", type = TxnVoidRsType.class),
        @XmlElement(name = "CustomerTypeAddRs", type = CustomerTypeAddRsType.class),
        @XmlElement(name = "VendorCreditQueryRs", type = VendorCreditQueryRsType.class),
        @XmlElement(name = "ItemNonInventoryModRs", type = ItemNonInventoryModRsType.class),
        @XmlElement(name = "DateDrivenTermsAddRs", type = DateDrivenTermsAddRsType.class),
        @XmlElement(name = "DataExtDefDelRs", type = DataExtDefDelRsType.class),
        @XmlElement(name = "AccountQueryRs", type = AccountQueryRsType.class),
        @XmlElement(name = "DataExtModRs", type = DataExtModRsType.class),
        @XmlElement(name = "ItemQueryRs", type = ItemQueryRsType.class),
        @XmlElement(name = "ClassAddRs", type = ClassAddRsType.class),
        @XmlElement(name = "SalesRepAddRs", type = SalesRepAddRsType.class),
        @XmlElement(name = "VendorTypeAddRs", type = VendorTypeAddRsType.class),
        @XmlElement(name = "AccountAddRs", type = AccountAddRsType.class),
        @XmlElement(name = "ItemDiscountQueryRs", type = ItemDiscountQueryRsType.class),
        @XmlElement(name = "ItemInventoryAssemblyQueryRs", type = ItemInventoryAssemblyQueryRsType.class),
        @XmlElement(name = "OtherNameQueryRs", type = OtherNameQueryRsType.class),
        @XmlElement(name = "BillPaymentCreditCardAddRs", type = BillPaymentCreditCardAddRsType.class),
        @XmlElement(name = "CustomerQueryRs", type = CustomerQueryRsType.class),
        @XmlElement(name = "InventoryAdjustmentAddRs", type = InventoryAdjustmentAddRsType.class),
        @XmlElement(name = "ClearedStatusModRs", type = ClearedStatusModRsType.class),
        @XmlElement(name = "CustomSummaryReportQueryRs", type = CustomSummaryReportQueryRsType.class),
        @XmlElement(name = "DateDrivenTermsQueryRs", type = DateDrivenTermsQueryRsType.class),
        @XmlElement(name = "DataExtDelRs", type = DataExtDelRsType.class),
        @XmlElement(name = "VendorAddRs", type = VendorAddRsType.class),
        @XmlElement(name = "OtherNameAddRs", type = OtherNameAddRsType.class),
        @XmlElement(name = "DataExtDefAddRs", type = DataExtDefAddRsType.class),
        @XmlElement(name = "DataExtDefQueryRs", type = DataExtDefQueryRsType.class),
        @XmlElement(name = "SalesRepQueryRs", type = SalesRepQueryRsType.class),
        @XmlElement(name = "ShipMethodAddRs", type = ShipMethodAddRsType.class),
        @XmlElement(name = "EmployeeQueryRs", type = EmployeeQueryRsType.class),
        @XmlElement(name = "BillPaymentCreditCardQueryRs", type = BillPaymentCreditCardQueryRsType.class),
        @XmlElement(name = "BillPaymentCheckAddRs", type = BillPaymentCheckAddRsType.class),
        @XmlElement(name = "ItemDiscountAddRs", type = ItemDiscountAddRsType.class),
        @XmlElement(name = "VendorTypeQueryRs", type = VendorTypeQueryRsType.class),
        @XmlElement(name = "EmployeeAddRs", type = EmployeeAddRsType.class),
        @XmlElement(name = "ItemInventoryAssemblyAddRs", type = ItemInventoryAssemblyAddRsType.class),
        @XmlElement(name = "SalesReceiptQueryRs", type = SalesReceiptQueryRsType.class),
        @XmlElement(name = "VendorQueryRs", type = VendorQueryRsType.class),
        @XmlElement(name = "EmployeeModRs", type = EmployeeModRsType.class),
        @XmlElement(name = "JournalEntryQueryRs", type = JournalEntryQueryRsType.class),
        @XmlElement(name = "BillAddRs", type = BillAddRsType.class),
        @XmlElement(name = "DataExtDefModRs", type = DataExtDefModRsType.class),
        @XmlElement(name = "EntityQueryRs", type = EntityQueryRsType.class),
        @XmlElement(name = "ReceivePaymentQueryRs", type = ReceivePaymentQueryRsType.class),
        @XmlElement(name = "ItemSubtotalAddRs", type = ItemSubtotalAddRsType.class),
        @XmlElement(name = "ItemSubtotalQueryRs", type = ItemSubtotalQueryRsType.class),
        @XmlElement(name = "CurrencyQueryRs", type = CurrencyQueryRsType.class),
        @XmlElement(name = "PaymentMethodQueryRs", type = PaymentMethodQueryRsType.class),
        @XmlElement(name = "PurchaseOrderAddRs", type = PurchaseOrderAddRsType.class),
        @XmlElement(name = "EstimateQueryRs", type = EstimateQueryRsType.class),
        @XmlElement(name = "CurrencyModRs", type = CurrencyModRsType.class),
        @XmlElement(name = "CustomerModRs", type = CustomerModRsType.class),
        @XmlElement(name = "GeneralSummaryReportQueryRs", type = GeneralSummaryReportQueryRsType.class)
    })
    protected List<Object> hostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs;
    @XmlAttribute
    protected String newMessageSetID;
    @XmlAttribute
    protected BigInteger messageSetStatusCode;

    /**
     * Gets the value of the hostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalEntryAddRsType }
     * {@link ToDoQueryRsType }
     * {@link ItemOtherChargeAddRsType }
     * {@link ItemServiceQueryRsType }
     * {@link CustomDetailReportQueryRsType }
     * {@link ReceivePaymentToDepositQueryRsType }
     * {@link TermsQueryRsType }
     * {@link ListDeletedQueryRsType }
     * {@link ReceivePaymentAddRsType }
     * {@link TxnDelRsType }
     * {@link CompanyQueryRsType }
     * {@link CustomerMsgAddRsType }
     * {@link JobTypeQueryRsType }
     * {@link CustomerTypeQueryRsType }
     * {@link ShipMethodQueryRsType }
     * {@link TimeTrackingQueryRsType }
     * {@link VendorModRsType }
     * {@link InvoiceAddRsType }
     * {@link OtherNameModRsType }
     * {@link TimeReportQueryRsType }
     * {@link BillPaymentCheckQueryRsType }
     * {@link TimeTrackingAddRsType }
     * {@link InventoryAdjustmentQueryRsType }
     * {@link EstimateAddRsType }
     * {@link StandardTermsQueryRsType }
     * {@link CreditCardCreditAddRsType }
     * {@link StandardTermsAddRsType }
     * {@link InvoiceQueryRsType }
     * {@link TxnDeletedQueryRsType }
     * {@link DepositAddRsType }
     * {@link TaxCodeModRsType }
     * {@link ItemServiceModRsType }
     * {@link ChargeAddRsType }
     * {@link ItemPaymentQueryRsType }
     * {@link ClassQueryRsType }
     * {@link ItemInventoryAddRsType }
     * {@link CreditMemoQueryRsType }
     * {@link PayrollItemWageAddRsType }
     * {@link CreditCardChargeAddRsType }
     * {@link ItemInventoryQueryRsType }
     * {@link ToDoAddRsType }
     * {@link CustomerMsgQueryRsType }
     * {@link GeneralDetailReportQueryRsType }
     * {@link CreditCardChargeQueryRsType }
     * {@link ItemGroupQueryRsType }
     * {@link CheckQueryRsType }
     * {@link TaxCodeQueryRsType }
     * {@link CheckAddRsType }
     * {@link ListDelRsType }
     * {@link CurrencyAddRsType }
     * {@link PreferencesQueryRsType }
     * {@link DepositQueryRsType }
     * {@link ItemServiceAddRsType }
     * {@link AgingReportQueryRsType }
     * {@link CustomerAddRsType }
     * {@link JobTypeAddRsType }
     * {@link BillToPayQueryRsType }
     * {@link ItemInventoryModRsType }
     * {@link TaxCodeAddRsType }
     * {@link BillQueryRsType }
     * {@link ItemNonInventoryQueryRsType }
     * {@link SalesReceiptAddRsType }
     * {@link CompanyActivityQueryRsType }
     * {@link HostQueryRsType }
     * {@link PurchaseOrderQueryRsType }
     * {@link VendorCreditAddRsType }
     * {@link CreditCardCreditQueryRsType }
     * {@link PayrollItemWageQueryRsType }
     * {@link ItemNonInventoryAddRsType }
     * {@link DataExtAddRsType }
     * {@link ItemGroupAddRsType }
     * {@link PaymentMethodAddRsType }
     * {@link ItemPaymentAddRsType }
     * {@link JobReportQueryRsType }
     * {@link CreditMemoAddRsType }
     * {@link ItemOtherChargeQueryRsType }
     * {@link ChargeQueryRsType }
     * {@link TxnVoidRsType }
     * {@link CustomerTypeAddRsType }
     * {@link VendorCreditQueryRsType }
     * {@link ItemNonInventoryModRsType }
     * {@link DateDrivenTermsAddRsType }
     * {@link DataExtDefDelRsType }
     * {@link AccountQueryRsType }
     * {@link DataExtModRsType }
     * {@link ItemQueryRsType }
     * {@link ClassAddRsType }
     * {@link SalesRepAddRsType }
     * {@link VendorTypeAddRsType }
     * {@link AccountAddRsType }
     * {@link ItemDiscountQueryRsType }
     * {@link ItemInventoryAssemblyQueryRsType }
     * {@link OtherNameQueryRsType }
     * {@link BillPaymentCreditCardAddRsType }
     * {@link CustomerQueryRsType }
     * {@link InventoryAdjustmentAddRsType }
     * {@link ClearedStatusModRsType }
     * {@link CustomSummaryReportQueryRsType }
     * {@link DateDrivenTermsQueryRsType }
     * {@link DataExtDelRsType }
     * {@link VendorAddRsType }
     * {@link OtherNameAddRsType }
     * {@link DataExtDefAddRsType }
     * {@link DataExtDefQueryRsType }
     * {@link SalesRepQueryRsType }
     * {@link ShipMethodAddRsType }
     * {@link EmployeeQueryRsType }
     * {@link BillPaymentCreditCardQueryRsType }
     * {@link BillPaymentCheckAddRsType }
     * {@link ItemDiscountAddRsType }
     * {@link VendorTypeQueryRsType }
     * {@link EmployeeAddRsType }
     * {@link ItemInventoryAssemblyAddRsType }
     * {@link SalesReceiptQueryRsType }
     * {@link VendorQueryRsType }
     * {@link EmployeeModRsType }
     * {@link JournalEntryQueryRsType }
     * {@link BillAddRsType }
     * {@link DataExtDefModRsType }
     * {@link EntityQueryRsType }
     * {@link ReceivePaymentQueryRsType }
     * {@link ItemSubtotalAddRsType }
     * {@link ItemSubtotalQueryRsType }
     * {@link CurrencyQueryRsType }
     * {@link PaymentMethodQueryRsType }
     * {@link PurchaseOrderAddRsType }
     * {@link EstimateQueryRsType }
     * {@link CurrencyModRsType }
     * {@link CustomerModRsType }
     * {@link GeneralSummaryReportQueryRsType }
     * 
     * 
     */
    public List<Object> getHostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs() {
        if (hostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs == null) {
            hostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs = new ArrayList<Object>();
        }
        return this.hostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs;
    }

    /**
     * Gets the value of the newMessageSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMessageSetID() {
        return newMessageSetID;
    }

    /**
     * Sets the value of the newMessageSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMessageSetID(String value) {
        this.newMessageSetID = value;
    }

    /**
     * Gets the value of the messageSetStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessageSetStatusCode() {
        return messageSetStatusCode;
    }

    /**
     * Sets the value of the messageSetStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessageSetStatusCode(BigInteger value) {
        this.messageSetStatusCode = value;
    }

}
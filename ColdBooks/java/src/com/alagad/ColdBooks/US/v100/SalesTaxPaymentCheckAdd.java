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
 *         &lt;element ref="{}PayeeEntityRef"/>
 *         &lt;element ref="{}TxnDate"/>
 *         &lt;element ref="{}BankAccountRef"/>
 *         &lt;choice>
 *           &lt;element ref="{}IsToBePrinted"/>
 *           &lt;element ref="{}RefNumber"/>
 *         &lt;/choice>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxPaymentCheckLineAdd" maxOccurs="unbounded"/>
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
    "payeeEntityRef",
    "txnDate",
    "bankAccountRef",
    "isToBePrinted",
    "refNumber",
    "externalGUID",
    "salesTaxPaymentCheckLineAdd"
})
@XmlRootElement(name = "SalesTaxPaymentCheckAdd")
public class SalesTaxPaymentCheckAdd {

    @XmlElement(name = "PayeeEntityRef", required = true)
    protected PayeeEntityRef payeeEntityRef;
    @XmlElement(name = "TxnDate", required = true)
    protected String txnDate;
    @XmlElement(name = "BankAccountRef", required = true)
    protected BankAccountRef bankAccountRef;
    @XmlElement(name = "IsToBePrinted")
    protected String isToBePrinted;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElement(name = "SalesTaxPaymentCheckLineAdd", required = true)
    protected List<SalesTaxPaymentCheckLineAdd> salesTaxPaymentCheckLineAdd;
    @XmlAttribute
    protected String defMacro;

    /**
     * Gets the value of the payeeEntityRef property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeEntityRef }
     *     
     */
    public PayeeEntityRef getPayeeEntityRef() {
        return payeeEntityRef;
    }

    /**
     * Sets the value of the payeeEntityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeEntityRef }
     *     
     */
    public void setPayeeEntityRef(PayeeEntityRef value) {
        this.payeeEntityRef = value;
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
     * Gets the value of the bankAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountRef }
     *     
     */
    public BankAccountRef getBankAccountRef() {
        return bankAccountRef;
    }

    /**
     * Sets the value of the bankAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountRef }
     *     
     */
    public void setBankAccountRef(BankAccountRef value) {
        this.bankAccountRef = value;
    }

    /**
     * Gets the value of the isToBePrinted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsToBePrinted() {
        return isToBePrinted;
    }

    /**
     * Sets the value of the isToBePrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsToBePrinted(String value) {
        this.isToBePrinted = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNumber(String value) {
        this.refNumber = value;
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
     * Gets the value of the salesTaxPaymentCheckLineAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTaxPaymentCheckLineAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTaxPaymentCheckLineAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesTaxPaymentCheckLineAdd }
     * 
     * 
     */
    public List<SalesTaxPaymentCheckLineAdd> getSalesTaxPaymentCheckLineAdd() {
        if (salesTaxPaymentCheckLineAdd == null) {
            salesTaxPaymentCheckLineAdd = new ArrayList<SalesTaxPaymentCheckLineAdd>();
        }
        return this.salesTaxPaymentCheckLineAdd;
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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:51:25 PM EDT 
//


package com.alagad.ColdBooks.UK.v100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element ref="{}TxnLineID"/>
 *         &lt;choice>
 *           &lt;group ref="{}PaymentLine"/>
 *           &lt;group ref="{}DepositInfoMod"/>
 *         &lt;/choice>
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
    "txnLineID",
    "paymentTxnID",
    "paymentTxnLineID",
    "overrideMemo",
    "overrideCheckNumber",
    "overrideClassRef",
    "entityRef",
    "accountRef",
    "memo",
    "checkNumber",
    "paymentMethodRef",
    "classRef",
    "amount"
})
@XmlRootElement(name = "DepositLineMod")
public class DepositLineMod {

    @XmlElement(name = "TxnLineID", required = true)
    protected String txnLineID;
    @XmlElement(name = "PaymentTxnID")
    protected DepositLineMod.PaymentTxnID paymentTxnID;
    @XmlElement(name = "PaymentTxnLineID")
    protected DepositLineMod.PaymentTxnLineID paymentTxnLineID;
    @XmlElement(name = "OverrideMemo")
    protected String overrideMemo;
    @XmlElement(name = "OverrideCheckNumber")
    protected String overrideCheckNumber;
    @XmlElement(name = "OverrideClassRef")
    protected OverrideClassRef overrideClassRef;
    @XmlElement(name = "EntityRef")
    protected EntityRef entityRef;
    @XmlElement(name = "AccountRef")
    protected AccountRef accountRef;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "CheckNumber")
    protected String checkNumber;
    @XmlElement(name = "PaymentMethodRef")
    protected PaymentMethodRef paymentMethodRef;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "Amount")
    protected String amount;

    /**
     * Gets the value of the txnLineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnLineID() {
        return txnLineID;
    }

    /**
     * Sets the value of the txnLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnLineID(String value) {
        this.txnLineID = value;
    }

    /**
     * Gets the value of the paymentTxnID property.
     * 
     * @return
     *     possible object is
     *     {@link DepositLineMod.PaymentTxnID }
     *     
     */
    public DepositLineMod.PaymentTxnID getPaymentTxnID() {
        return paymentTxnID;
    }

    /**
     * Sets the value of the paymentTxnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositLineMod.PaymentTxnID }
     *     
     */
    public void setPaymentTxnID(DepositLineMod.PaymentTxnID value) {
        this.paymentTxnID = value;
    }

    /**
     * Gets the value of the paymentTxnLineID property.
     * 
     * @return
     *     possible object is
     *     {@link DepositLineMod.PaymentTxnLineID }
     *     
     */
    public DepositLineMod.PaymentTxnLineID getPaymentTxnLineID() {
        return paymentTxnLineID;
    }

    /**
     * Sets the value of the paymentTxnLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositLineMod.PaymentTxnLineID }
     *     
     */
    public void setPaymentTxnLineID(DepositLineMod.PaymentTxnLineID value) {
        this.paymentTxnLineID = value;
    }

    /**
     * Gets the value of the overrideMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideMemo() {
        return overrideMemo;
    }

    /**
     * Sets the value of the overrideMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideMemo(String value) {
        this.overrideMemo = value;
    }

    /**
     * Gets the value of the overrideCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCheckNumber() {
        return overrideCheckNumber;
    }

    /**
     * Sets the value of the overrideCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideCheckNumber(String value) {
        this.overrideCheckNumber = value;
    }

    /**
     * Gets the value of the overrideClassRef property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideClassRef }
     *     
     */
    public OverrideClassRef getOverrideClassRef() {
        return overrideClassRef;
    }

    /**
     * Sets the value of the overrideClassRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideClassRef }
     *     
     */
    public void setOverrideClassRef(OverrideClassRef value) {
        this.overrideClassRef = value;
    }

    /**
     * Gets the value of the entityRef property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRef }
     *     
     */
    public EntityRef getEntityRef() {
        return entityRef;
    }

    /**
     * Sets the value of the entityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRef }
     *     
     */
    public void setEntityRef(EntityRef value) {
        this.entityRef = value;
    }

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRef }
     *     
     */
    public AccountRef getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRef }
     *     
     */
    public void setAccountRef(AccountRef value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the paymentMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodRef }
     *     
     */
    public PaymentMethodRef getPaymentMethodRef() {
        return paymentMethodRef;
    }

    /**
     * Sets the value of the paymentMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodRef }
     *     
     */
    public void setPaymentMethodRef(PaymentMethodRef value) {
        this.paymentMethodRef = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>IDTYPE">
     *       &lt;attribute name="useMacro" type="{}MACROTYPE" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PaymentTxnID {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected String useMacro;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the useMacro property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseMacro() {
            return useMacro;
        }

        /**
         * Sets the value of the useMacro property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseMacro(String value) {
            this.useMacro = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>IDTYPE">
     *       &lt;attribute name="useMacro" type="{}MACROTYPE" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PaymentTxnLineID {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected String useMacro;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the useMacro property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseMacro() {
            return useMacro;
        }

        /**
         * Sets the value of the useMacro property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseMacro(String value) {
            this.useMacro = value;
        }

    }

}

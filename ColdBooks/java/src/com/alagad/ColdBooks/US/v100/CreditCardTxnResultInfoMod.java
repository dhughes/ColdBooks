//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:49:51 PM EDT 
//


package com.alagad.ColdBooks.US.v100;

import java.math.BigInteger;
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
 *         &lt;element ref="{}ResultCode" minOccurs="0"/>
 *         &lt;element name="ResultMessage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreditCardTransID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MerchantAccountNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AuthorizationCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AVSStreet" minOccurs="0"/>
 *         &lt;element ref="{}AVSZip" minOccurs="0"/>
 *         &lt;element ref="{}CardSecurityCodeMatch" minOccurs="0"/>
 *         &lt;element name="ReconBatchID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="84"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}PaymentGroupingCode" minOccurs="0"/>
 *         &lt;element ref="{}PaymentStatus" minOccurs="0"/>
 *         &lt;element ref="{}TxnAuthorizationTime" minOccurs="0"/>
 *         &lt;element ref="{}TxnAuthorizationStamp" minOccurs="0"/>
 *         &lt;element name="ClientTransID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "resultCode",
    "resultMessage",
    "creditCardTransID",
    "merchantAccountNumber",
    "authorizationCode",
    "avsStreet",
    "avsZip",
    "cardSecurityCodeMatch",
    "reconBatchID",
    "paymentGroupingCode",
    "paymentStatus",
    "txnAuthorizationTime",
    "txnAuthorizationStamp",
    "clientTransID"
})
@XmlRootElement(name = "CreditCardTxnResultInfoMod")
public class CreditCardTxnResultInfoMod {

    @XmlElement(name = "ResultCode")
    protected BigInteger resultCode;
    @XmlElement(name = "ResultMessage")
    protected String resultMessage;
    @XmlElement(name = "CreditCardTransID")
    protected String creditCardTransID;
    @XmlElement(name = "MerchantAccountNumber")
    protected String merchantAccountNumber;
    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "AVSStreet")
    protected String avsStreet;
    @XmlElement(name = "AVSZip")
    protected String avsZip;
    @XmlElement(name = "CardSecurityCodeMatch")
    protected String cardSecurityCodeMatch;
    @XmlElement(name = "ReconBatchID")
    protected String reconBatchID;
    @XmlElement(name = "PaymentGroupingCode")
    protected BigInteger paymentGroupingCode;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "TxnAuthorizationTime")
    protected String txnAuthorizationTime;
    @XmlElement(name = "TxnAuthorizationStamp")
    protected BigInteger txnAuthorizationStamp;
    @XmlElement(name = "ClientTransID")
    protected String clientTransID;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultCode(BigInteger value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * Sets the value of the resultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMessage(String value) {
        this.resultMessage = value;
    }

    /**
     * Gets the value of the creditCardTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardTransID() {
        return creditCardTransID;
    }

    /**
     * Sets the value of the creditCardTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardTransID(String value) {
        this.creditCardTransID = value;
    }

    /**
     * Gets the value of the merchantAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAccountNumber() {
        return merchantAccountNumber;
    }

    /**
     * Sets the value of the merchantAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAccountNumber(String value) {
        this.merchantAccountNumber = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the avsStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSStreet() {
        return avsStreet;
    }

    /**
     * Sets the value of the avsStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSStreet(String value) {
        this.avsStreet = value;
    }

    /**
     * Gets the value of the avsZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSZip() {
        return avsZip;
    }

    /**
     * Sets the value of the avsZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSZip(String value) {
        this.avsZip = value;
    }

    /**
     * Gets the value of the cardSecurityCodeMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSecurityCodeMatch() {
        return cardSecurityCodeMatch;
    }

    /**
     * Sets the value of the cardSecurityCodeMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSecurityCodeMatch(String value) {
        this.cardSecurityCodeMatch = value;
    }

    /**
     * Gets the value of the reconBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconBatchID() {
        return reconBatchID;
    }

    /**
     * Sets the value of the reconBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconBatchID(String value) {
        this.reconBatchID = value;
    }

    /**
     * Gets the value of the paymentGroupingCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentGroupingCode() {
        return paymentGroupingCode;
    }

    /**
     * Sets the value of the paymentGroupingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentGroupingCode(BigInteger value) {
        this.paymentGroupingCode = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the txnAuthorizationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnAuthorizationTime() {
        return txnAuthorizationTime;
    }

    /**
     * Sets the value of the txnAuthorizationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnAuthorizationTime(String value) {
        this.txnAuthorizationTime = value;
    }

    /**
     * Gets the value of the txnAuthorizationStamp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxnAuthorizationStamp() {
        return txnAuthorizationStamp;
    }

    /**
     * Sets the value of the txnAuthorizationStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxnAuthorizationStamp(BigInteger value) {
        this.txnAuthorizationStamp = value;
    }

    /**
     * Gets the value of the clientTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransID() {
        return clientTransID;
    }

    /**
     * Sets the value of the clientTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransID(String value) {
        this.clientTransID = value;
    }

}

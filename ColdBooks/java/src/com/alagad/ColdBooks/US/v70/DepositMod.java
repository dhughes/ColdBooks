//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:03:31 PM EST 
//


package com.alagad.ColdBooks.US.v70;

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
 *         &lt;group ref="{}TxnCoreMod"/>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element ref="{}DepositToAccountRef" minOccurs="0"/>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}CashBackInfoMod" minOccurs="0"/>
 *         &lt;element ref="{}DepositLineMod" maxOccurs="unbounded" minOccurs="0"/>
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
    "txnID",
    "editSequence",
    "txnDate",
    "depositToAccountRef",
    "memo",
    "cashBackInfoMod",
    "depositLineMod"
})
@XmlRootElement(name = "DepositMod")
public class DepositMod {

    @XmlElement(name = "TxnID", required = true)
    protected String txnID;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "DepositToAccountRef")
    protected DepositToAccountRef depositToAccountRef;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "CashBackInfoMod")
    protected CashBackInfoMod cashBackInfoMod;
    @XmlElement(name = "DepositLineMod")
    protected List<DepositLineMod> depositLineMod;

    /**
     * Gets the value of the txnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnID() {
        return txnID;
    }

    /**
     * Sets the value of the txnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnID(String value) {
        this.txnID = value;
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
     * Gets the value of the depositToAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link DepositToAccountRef }
     *     
     */
    public DepositToAccountRef getDepositToAccountRef() {
        return depositToAccountRef;
    }

    /**
     * Sets the value of the depositToAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositToAccountRef }
     *     
     */
    public void setDepositToAccountRef(DepositToAccountRef value) {
        this.depositToAccountRef = value;
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
     * Gets the value of the cashBackInfoMod property.
     * 
     * @return
     *     possible object is
     *     {@link CashBackInfoMod }
     *     
     */
    public CashBackInfoMod getCashBackInfoMod() {
        return cashBackInfoMod;
    }

    /**
     * Sets the value of the cashBackInfoMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBackInfoMod }
     *     
     */
    public void setCashBackInfoMod(CashBackInfoMod value) {
        this.cashBackInfoMod = value;
    }

    /**
     * Gets the value of the depositLineMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositLineMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositLineMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositLineMod }
     * 
     * 
     */
    public List<DepositLineMod> getDepositLineMod() {
        if (depositLineMod == null) {
            depositLineMod = new ArrayList<DepositLineMod>();
        }
        return this.depositLineMod;
    }

}

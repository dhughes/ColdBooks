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
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element name="RefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}FromInventorySiteRef"/>
 *         &lt;element ref="{}ToInventorySiteRef"/>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;element ref="{}TransferInventoryLineAdd" maxOccurs="unbounded" minOccurs="0"/>
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
    "txnDate",
    "refNumber",
    "fromInventorySiteRef",
    "toInventorySiteRef",
    "memo",
    "externalGUID",
    "transferInventoryLineAdd"
})
@XmlRootElement(name = "TransferInventoryAdd")
public class TransferInventoryAdd {

    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "FromInventorySiteRef", required = true)
    protected FromInventorySiteRef fromInventorySiteRef;
    @XmlElement(name = "ToInventorySiteRef", required = true)
    protected ToInventorySiteRef toInventorySiteRef;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElement(name = "TransferInventoryLineAdd")
    protected List<TransferInventoryLineAdd> transferInventoryLineAdd;
    @XmlAttribute
    protected String defMacro;

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
     * Gets the value of the fromInventorySiteRef property.
     * 
     * @return
     *     possible object is
     *     {@link FromInventorySiteRef }
     *     
     */
    public FromInventorySiteRef getFromInventorySiteRef() {
        return fromInventorySiteRef;
    }

    /**
     * Sets the value of the fromInventorySiteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromInventorySiteRef }
     *     
     */
    public void setFromInventorySiteRef(FromInventorySiteRef value) {
        this.fromInventorySiteRef = value;
    }

    /**
     * Gets the value of the toInventorySiteRef property.
     * 
     * @return
     *     possible object is
     *     {@link ToInventorySiteRef }
     *     
     */
    public ToInventorySiteRef getToInventorySiteRef() {
        return toInventorySiteRef;
    }

    /**
     * Sets the value of the toInventorySiteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToInventorySiteRef }
     *     
     */
    public void setToInventorySiteRef(ToInventorySiteRef value) {
        this.toInventorySiteRef = value;
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
     * Gets the value of the transferInventoryLineAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferInventoryLineAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferInventoryLineAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferInventoryLineAdd }
     * 
     * 
     */
    public List<TransferInventoryLineAdd> getTransferInventoryLineAdd() {
        if (transferInventoryLineAdd == null) {
            transferInventoryLineAdd = new ArrayList<TransferInventoryLineAdd>();
        }
        return this.transferInventoryLineAdd;
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
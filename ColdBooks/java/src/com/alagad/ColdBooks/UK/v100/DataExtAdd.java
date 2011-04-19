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
 *         &lt;element ref="{}OwnerID"/>
 *         &lt;element name="DataExtName">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;group ref="{}ListDataExt"/>
 *           &lt;group ref="{}TxnDataExtWithMacro"/>
 *           &lt;element ref="{}OtherDataExtType"/>
 *         &lt;/choice>
 *         &lt;element ref="{}DataExtValue"/>
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
    "ownerID",
    "dataExtName",
    "listDataExtType",
    "listObjRef",
    "txnDataExtType",
    "txnID",
    "txnLineID",
    "otherDataExtType",
    "dataExtValue"
})
@XmlRootElement(name = "DataExtAdd")
public class DataExtAdd {

    @XmlElement(name = "OwnerID", required = true)
    protected String ownerID;
    @XmlElement(name = "DataExtName", required = true)
    protected String dataExtName;
    @XmlElement(name = "ListDataExtType")
    protected String listDataExtType;
    @XmlElement(name = "ListObjRef")
    protected ListObjRef listObjRef;
    @XmlElement(name = "TxnDataExtType")
    protected String txnDataExtType;
    @XmlElement(name = "TxnID")
    protected DataExtAdd.TxnID txnID;
    @XmlElement(name = "TxnLineID")
    protected String txnLineID;
    @XmlElement(name = "OtherDataExtType")
    protected String otherDataExtType;
    @XmlElement(name = "DataExtValue", required = true)
    protected String dataExtValue;

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerID(String value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the dataExtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtName() {
        return dataExtName;
    }

    /**
     * Sets the value of the dataExtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtName(String value) {
        this.dataExtName = value;
    }

    /**
     * Gets the value of the listDataExtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListDataExtType() {
        return listDataExtType;
    }

    /**
     * Sets the value of the listDataExtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListDataExtType(String value) {
        this.listDataExtType = value;
    }

    /**
     * Gets the value of the listObjRef property.
     * 
     * @return
     *     possible object is
     *     {@link ListObjRef }
     *     
     */
    public ListObjRef getListObjRef() {
        return listObjRef;
    }

    /**
     * Sets the value of the listObjRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListObjRef }
     *     
     */
    public void setListObjRef(ListObjRef value) {
        this.listObjRef = value;
    }

    /**
     * Gets the value of the txnDataExtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDataExtType() {
        return txnDataExtType;
    }

    /**
     * Sets the value of the txnDataExtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDataExtType(String value) {
        this.txnDataExtType = value;
    }

    /**
     * Gets the value of the txnID property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtAdd.TxnID }
     *     
     */
    public DataExtAdd.TxnID getTxnID() {
        return txnID;
    }

    /**
     * Sets the value of the txnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtAdd.TxnID }
     *     
     */
    public void setTxnID(DataExtAdd.TxnID value) {
        this.txnID = value;
    }

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
     * Gets the value of the otherDataExtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDataExtType() {
        return otherDataExtType;
    }

    /**
     * Sets the value of the otherDataExtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDataExtType(String value) {
        this.otherDataExtType = value;
    }

    /**
     * Gets the value of the dataExtValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtValue() {
        return dataExtValue;
    }

    /**
     * Sets the value of the dataExtValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtValue(String value) {
        this.dataExtValue = value;
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
    public static class TxnID {

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

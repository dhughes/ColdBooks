//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;/sequence>
 *       &lt;attribute name="rowType">
 *         &lt;simpleType>
 *           &lt;restriction base="{}STRTYPE">
 *             &lt;enumeration value="account"/>
 *             &lt;enumeration value="class"/>
 *             &lt;enumeration value="customer"/>
 *             &lt;enumeration value="customerMessage"/>
 *             &lt;enumeration value="customerType"/>
 *             &lt;enumeration value="employee"/>
 *             &lt;enumeration value="item"/>
 *             &lt;enumeration value="jobType"/>
 *             &lt;enumeration value="label"/>
 *             &lt;enumeration value="memorizedTxn"/>
 *             &lt;enumeration value="memorizedReport"/>
 *             &lt;enumeration value="name"/>
 *             &lt;enumeration value="otherName"/>
 *             &lt;enumeration value="paymentMethod"/>
 *             &lt;enumeration value="payrollItem"/>
 *             &lt;enumeration value="salesRep"/>
 *             &lt;enumeration value="salesTaxCode"/>
 *             &lt;enumeration value="shipMethod"/>
 *             &lt;enumeration value="state"/>
 *             &lt;enumeration value="style"/>
 *             &lt;enumeration value="terms"/>
 *             &lt;enumeration value="toDo"/>
 *             &lt;enumeration value="vendor"/>
 *             &lt;enumeration value="vendorType"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="value" type="{}STRTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RowData")
public class RowData {

    @XmlAttribute
    protected String rowType;
    @XmlAttribute
    protected String value;

    /**
     * Gets the value of the rowType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowType() {
        return rowType;
    }

    /**
     * Sets the value of the rowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowType(String value) {
        this.rowType = value;
    }

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

}

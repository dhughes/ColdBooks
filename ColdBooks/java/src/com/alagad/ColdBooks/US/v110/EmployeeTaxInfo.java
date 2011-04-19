//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:50:28 PM EDT 
//


package com.alagad.ColdBooks.US.v110;

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
 *         &lt;element name="StateLived" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StateWorked" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsStandardTaxationRequired" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeTax" maxOccurs="unbounded" minOccurs="0"/>
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
    "stateLived",
    "stateWorked",
    "isStandardTaxationRequired",
    "employeeTax"
})
@XmlRootElement(name = "EmployeeTaxInfo")
public class EmployeeTaxInfo {

    @XmlElement(name = "StateLived")
    protected String stateLived;
    @XmlElement(name = "StateWorked")
    protected String stateWorked;
    @XmlElement(name = "IsStandardTaxationRequired")
    protected String isStandardTaxationRequired;
    @XmlElement(name = "EmployeeTax")
    protected List<EmployeeTax> employeeTax;

    /**
     * Gets the value of the stateLived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateLived() {
        return stateLived;
    }

    /**
     * Sets the value of the stateLived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateLived(String value) {
        this.stateLived = value;
    }

    /**
     * Gets the value of the stateWorked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateWorked() {
        return stateWorked;
    }

    /**
     * Sets the value of the stateWorked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateWorked(String value) {
        this.stateWorked = value;
    }

    /**
     * Gets the value of the isStandardTaxationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsStandardTaxationRequired() {
        return isStandardTaxationRequired;
    }

    /**
     * Sets the value of the isStandardTaxationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsStandardTaxationRequired(String value) {
        this.isStandardTaxationRequired = value;
    }

    /**
     * Gets the value of the employeeTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeTax }
     * 
     * 
     */
    public List<EmployeeTax> getEmployeeTax() {
        if (employeeTax == null) {
            employeeTax = new ArrayList<EmployeeTax>();
        }
        return this.employeeTax;
    }

}

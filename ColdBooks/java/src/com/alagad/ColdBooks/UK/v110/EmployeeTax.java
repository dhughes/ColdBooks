//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

import java.math.BigInteger;
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
 *         &lt;element ref="{}IsSubjectToTax" minOccurs="0"/>
 *         &lt;element ref="{}PayrollItemTaxRef"/>
 *         &lt;element ref="{}TaxLawVersion" minOccurs="0"/>
 *         &lt;element ref="{}TaxInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "isSubjectToTax",
    "payrollItemTaxRef",
    "taxLawVersion",
    "taxInfo"
})
@XmlRootElement(name = "EmployeeTax")
public class EmployeeTax {

    @XmlElement(name = "IsSubjectToTax")
    protected String isSubjectToTax;
    @XmlElement(name = "PayrollItemTaxRef", required = true)
    protected PayrollItemTaxRef payrollItemTaxRef;
    @XmlElement(name = "TaxLawVersion")
    protected BigInteger taxLawVersion;
    @XmlElement(name = "TaxInfo")
    protected List<TaxInfo> taxInfo;

    /**
     * Gets the value of the isSubjectToTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSubjectToTax() {
        return isSubjectToTax;
    }

    /**
     * Sets the value of the isSubjectToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSubjectToTax(String value) {
        this.isSubjectToTax = value;
    }

    /**
     * Gets the value of the payrollItemTaxRef property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemTaxRef }
     *     
     */
    public PayrollItemTaxRef getPayrollItemTaxRef() {
        return payrollItemTaxRef;
    }

    /**
     * Sets the value of the payrollItemTaxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemTaxRef }
     *     
     */
    public void setPayrollItemTaxRef(PayrollItemTaxRef value) {
        this.payrollItemTaxRef = value;
    }

    /**
     * Gets the value of the taxLawVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaxLawVersion() {
        return taxLawVersion;
    }

    /**
     * Sets the value of the taxLawVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaxLawVersion(BigInteger value) {
        this.taxLawVersion = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInfo }
     * 
     * 
     */
    public List<TaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TaxInfo>();
        }
        return this.taxInfo;
    }

}

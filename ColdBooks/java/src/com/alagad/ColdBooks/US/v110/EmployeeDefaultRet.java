//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:50:28 PM EDT 
//


package com.alagad.ColdBooks.US.v110;

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
 *         &lt;element ref="{}EmployeeDefaultPayrollInfo" minOccurs="0"/>
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
    "employeeDefaultPayrollInfo"
})
@XmlRootElement(name = "EmployeeDefaultRet")
public class EmployeeDefaultRet {

    @XmlElement(name = "EmployeeDefaultPayrollInfo")
    protected EmployeeDefaultPayrollInfo employeeDefaultPayrollInfo;

    /**
     * Gets the value of the employeeDefaultPayrollInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDefaultPayrollInfo }
     *     
     */
    public EmployeeDefaultPayrollInfo getEmployeeDefaultPayrollInfo() {
        return employeeDefaultPayrollInfo;
    }

    /**
     * Sets the value of the employeeDefaultPayrollInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDefaultPayrollInfo }
     *     
     */
    public void setEmployeeDefaultPayrollInfo(EmployeeDefaultPayrollInfo value) {
        this.employeeDefaultPayrollInfo = value;
    }

}

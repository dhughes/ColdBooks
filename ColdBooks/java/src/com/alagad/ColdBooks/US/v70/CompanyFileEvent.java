//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:03:31 PM EST 
//


package com.alagad.ColdBooks.US.v70;

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
 *         &lt;element ref="{}CompanyFileEventOperation"/>
 *         &lt;element ref="{}IsNewCompany" minOccurs="0"/>
 *         &lt;element ref="{}IsAutomaticLogin" minOccurs="0"/>
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
    "companyFileEventOperation",
    "isNewCompany",
    "isAutomaticLogin"
})
@XmlRootElement(name = "CompanyFileEvent")
public class CompanyFileEvent {

    @XmlElement(name = "CompanyFileEventOperation", required = true)
    protected String companyFileEventOperation;
    @XmlElement(name = "IsNewCompany")
    protected String isNewCompany;
    @XmlElement(name = "IsAutomaticLogin")
    protected String isAutomaticLogin;

    /**
     * Gets the value of the companyFileEventOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyFileEventOperation() {
        return companyFileEventOperation;
    }

    /**
     * Sets the value of the companyFileEventOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyFileEventOperation(String value) {
        this.companyFileEventOperation = value;
    }

    /**
     * Gets the value of the isNewCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNewCompany() {
        return isNewCompany;
    }

    /**
     * Sets the value of the isNewCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNewCompany(String value) {
        this.isNewCompany = value;
    }

    /**
     * Gets the value of the isAutomaticLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAutomaticLogin() {
        return isAutomaticLogin;
    }

    /**
     * Sets the value of the isAutomaticLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAutomaticLogin(String value) {
        this.isAutomaticLogin = value;
    }

}

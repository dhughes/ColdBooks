//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

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
 *         &lt;element name="CompanyFilePath">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="260"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}HostInfo"/>
 *         &lt;element ref="{}CompanyFileEvent"/>
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
    "companyFilePath",
    "hostInfo",
    "companyFileEvent"
})
@XmlRootElement(name = "UIEvent")
public class UIEvent {

    @XmlElement(name = "CompanyFilePath", required = true)
    protected String companyFilePath;
    @XmlElement(name = "HostInfo", required = true)
    protected HostInfo hostInfo;
    @XmlElement(name = "CompanyFileEvent", required = true)
    protected CompanyFileEvent companyFileEvent;

    /**
     * Gets the value of the companyFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyFilePath() {
        return companyFilePath;
    }

    /**
     * Sets the value of the companyFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyFilePath(String value) {
        this.companyFilePath = value;
    }

    /**
     * Gets the value of the hostInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostInfo }
     *     
     */
    public HostInfo getHostInfo() {
        return hostInfo;
    }

    /**
     * Sets the value of the hostInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInfo }
     *     
     */
    public void setHostInfo(HostInfo value) {
        this.hostInfo = value;
    }

    /**
     * Gets the value of the companyFileEvent property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyFileEvent }
     *     
     */
    public CompanyFileEvent getCompanyFileEvent() {
        return companyFileEvent;
    }

    /**
     * Sets the value of the companyFileEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyFileEvent }
     *     
     */
    public void setCompanyFileEvent(CompanyFileEvent value) {
        this.companyFileEvent = value;
    }

}

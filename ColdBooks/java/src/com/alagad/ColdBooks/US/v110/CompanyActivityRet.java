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
 *         &lt;element ref="{}LastRestoreTime" minOccurs="0"/>
 *         &lt;element ref="{}LastCondenseTime" minOccurs="0"/>
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
    "lastRestoreTime",
    "lastCondenseTime"
})
@XmlRootElement(name = "CompanyActivityRet")
public class CompanyActivityRet {

    @XmlElement(name = "LastRestoreTime")
    protected String lastRestoreTime;
    @XmlElement(name = "LastCondenseTime")
    protected String lastCondenseTime;

    /**
     * Gets the value of the lastRestoreTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRestoreTime() {
        return lastRestoreTime;
    }

    /**
     * Sets the value of the lastRestoreTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRestoreTime(String value) {
        this.lastRestoreTime = value;
    }

    /**
     * Gets the value of the lastCondenseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCondenseTime() {
        return lastCondenseTime;
    }

    /**
     * Sets the value of the lastCondenseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCondenseTime(String value) {
        this.lastCondenseTime = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:02:45 PM EST 
//


package com.alagad.ColdBooks.US.v40;

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
 *         &lt;element ref="{}OwnerID"/>
 *         &lt;element name="AlertTag">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsMarkedDone"/>
 *         &lt;element ref="{}NextAlertDate" minOccurs="0"/>
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
    "alertTag",
    "isMarkedDone",
    "nextAlertDate"
})
@XmlRootElement(name = "AlertRet")
public class AlertRet {

    @XmlElement(name = "OwnerID", required = true)
    protected String ownerID;
    @XmlElement(name = "AlertTag", required = true)
    protected String alertTag;
    @XmlElement(name = "IsMarkedDone", required = true)
    protected String isMarkedDone;
    @XmlElement(name = "NextAlertDate")
    protected String nextAlertDate;

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
     * Gets the value of the alertTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertTag() {
        return alertTag;
    }

    /**
     * Sets the value of the alertTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertTag(String value) {
        this.alertTag = value;
    }

    /**
     * Gets the value of the isMarkedDone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMarkedDone() {
        return isMarkedDone;
    }

    /**
     * Sets the value of the isMarkedDone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMarkedDone(String value) {
        this.isMarkedDone = value;
    }

    /**
     * Gets the value of the nextAlertDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextAlertDate() {
        return nextAlertDate;
    }

    /**
     * Sets the value of the nextAlertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextAlertDate(String value) {
        this.nextAlertDate = value;
    }

}

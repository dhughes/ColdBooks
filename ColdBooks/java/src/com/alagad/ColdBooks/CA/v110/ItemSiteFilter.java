//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:40 PM EDT 
//


package com.alagad.ColdBooks.CA.v110;

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
 *         &lt;element ref="{}ItemFilter" minOccurs="0"/>
 *         &lt;element ref="{}SiteFilter" minOccurs="0"/>
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
    "itemFilter",
    "siteFilter"
})
@XmlRootElement(name = "ItemSiteFilter")
public class ItemSiteFilter {

    @XmlElement(name = "ItemFilter")
    protected ItemFilter itemFilter;
    @XmlElement(name = "SiteFilter")
    protected SiteFilter siteFilter;

    /**
     * Gets the value of the itemFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFilter }
     *     
     */
    public ItemFilter getItemFilter() {
        return itemFilter;
    }

    /**
     * Sets the value of the itemFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFilter }
     *     
     */
    public void setItemFilter(ItemFilter value) {
        this.itemFilter = value;
    }

    /**
     * Gets the value of the siteFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SiteFilter }
     *     
     */
    public SiteFilter getSiteFilter() {
        return siteFilter;
    }

    /**
     * Sets the value of the siteFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteFilter }
     *     
     */
    public void setSiteFilter(SiteFilter value) {
        this.siteFilter = value;
    }

}

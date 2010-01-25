//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 09:02:35 PM EST 
//


package com.alagad.ColdBooks.US.v30;

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
 *         &lt;element ref="{}DisplayCondition" minOccurs="0"/>
 *         &lt;element ref="{}MenuItem" maxOccurs="unbounded"/>
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
    "displayCondition",
    "menuItem"
})
@XmlRootElement(name = "Submenu")
public class Submenu {

    @XmlElement(name = "DisplayCondition")
    protected DisplayCondition displayCondition;
    @XmlElement(name = "MenuItem", required = true)
    protected List<MenuItem> menuItem;

    /**
     * Gets the value of the displayCondition property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayCondition }
     *     
     */
    public DisplayCondition getDisplayCondition() {
        return displayCondition;
    }

    /**
     * Sets the value of the displayCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayCondition }
     *     
     */
    public void setDisplayCondition(DisplayCondition value) {
        this.displayCondition = value;
    }

    /**
     * Gets the value of the menuItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menuItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenuItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MenuItem }
     * 
     * 
     */
    public List<MenuItem> getMenuItem() {
        if (menuItem == null) {
            menuItem = new ArrayList<MenuItem>();
        }
        return this.menuItem;
    }

}

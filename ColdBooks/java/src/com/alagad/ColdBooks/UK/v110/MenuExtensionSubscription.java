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
 *         &lt;element ref="{}AddToMenu"/>
 *         &lt;choice>
 *           &lt;element ref="{}Submenu"/>
 *           &lt;element ref="{}MenuItem"/>
 *         &lt;/choice>
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
    "addToMenu",
    "submenu",
    "menuItem"
})
@XmlRootElement(name = "MenuExtensionSubscription")
public class MenuExtensionSubscription {

    @XmlElement(name = "AddToMenu", required = true)
    protected String addToMenu;
    @XmlElement(name = "Submenu")
    protected Submenu submenu;
    @XmlElement(name = "MenuItem")
    protected MenuItem menuItem;

    /**
     * Gets the value of the addToMenu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddToMenu() {
        return addToMenu;
    }

    /**
     * Sets the value of the addToMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddToMenu(String value) {
        this.addToMenu = value;
    }

    /**
     * Gets the value of the submenu property.
     * 
     * @return
     *     possible object is
     *     {@link Submenu }
     *     
     */
    public Submenu getSubmenu() {
        return submenu;
    }

    /**
     * Sets the value of the submenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Submenu }
     *     
     */
    public void setSubmenu(Submenu value) {
        this.submenu = value;
    }

    /**
     * Gets the value of the menuItem property.
     * 
     * @return
     *     possible object is
     *     {@link MenuItem }
     *     
     */
    public MenuItem getMenuItem() {
        return menuItem;
    }

    /**
     * Sets the value of the menuItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuItem }
     *     
     */
    public void setMenuItem(MenuItem value) {
        this.menuItem = value;
    }

}

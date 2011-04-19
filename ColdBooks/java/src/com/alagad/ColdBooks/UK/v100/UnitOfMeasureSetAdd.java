//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:51:25 PM EDT 
//


package com.alagad.ColdBooks.UK.v100;

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
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}UnitOfMeasureType"/>
 *         &lt;element ref="{}BaseUnit"/>
 *         &lt;element ref="{}RelatedUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DefaultUnit" maxOccurs="unbounded" minOccurs="0"/>
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
    "name",
    "isActive",
    "unitOfMeasureType",
    "baseUnit",
    "relatedUnit",
    "defaultUnit"
})
@XmlRootElement(name = "UnitOfMeasureSetAdd")
public class UnitOfMeasureSetAdd {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "UnitOfMeasureType", required = true)
    protected String unitOfMeasureType;
    @XmlElement(name = "BaseUnit", required = true)
    protected BaseUnit baseUnit;
    @XmlElement(name = "RelatedUnit")
    protected List<RelatedUnit> relatedUnit;
    @XmlElement(name = "DefaultUnit")
    protected List<DefaultUnit> defaultUnit;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the unitOfMeasureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureType() {
        return unitOfMeasureType;
    }

    /**
     * Sets the value of the unitOfMeasureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureType(String value) {
        this.unitOfMeasureType = value;
    }

    /**
     * Gets the value of the baseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BaseUnit }
     *     
     */
    public BaseUnit getBaseUnit() {
        return baseUnit;
    }

    /**
     * Sets the value of the baseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseUnit }
     *     
     */
    public void setBaseUnit(BaseUnit value) {
        this.baseUnit = value;
    }

    /**
     * Gets the value of the relatedUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedUnit }
     * 
     * 
     */
    public List<RelatedUnit> getRelatedUnit() {
        if (relatedUnit == null) {
            relatedUnit = new ArrayList<RelatedUnit>();
        }
        return this.relatedUnit;
    }

    /**
     * Gets the value of the defaultUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultUnit }
     * 
     * 
     */
    public List<DefaultUnit> getDefaultUnit() {
        if (defaultUnit == null) {
            defaultUnit = new ArrayList<DefaultUnit>();
        }
        return this.defaultUnit;
    }

}

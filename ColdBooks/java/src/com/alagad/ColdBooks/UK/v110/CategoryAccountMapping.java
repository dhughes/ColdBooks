//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:52:02 PM EDT 
//


package com.alagad.ColdBooks.UK.v110;

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
 *         &lt;element ref="{}MappingCategory"/>
 *         &lt;element ref="{}AccountRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Threshold" minOccurs="0"/>
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
    "mappingCategory",
    "accountRef",
    "threshold"
})
@XmlRootElement(name = "CategoryAccountMapping")
public class CategoryAccountMapping {

    @XmlElement(name = "MappingCategory", required = true)
    protected String mappingCategory;
    @XmlElement(name = "AccountRef")
    protected List<AccountRef> accountRef;
    @XmlElement(name = "Threshold")
    protected String threshold;

    /**
     * Gets the value of the mappingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingCategory() {
        return mappingCategory;
    }

    /**
     * Sets the value of the mappingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingCategory(String value) {
        this.mappingCategory = value;
    }

    /**
     * Gets the value of the accountRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountRef }
     * 
     * 
     */
    public List<AccountRef> getAccountRef() {
        if (accountRef == null) {
            accountRef = new ArrayList<AccountRef>();
        }
        return this.accountRef;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreshold(String value) {
        this.threshold = value;
    }

}

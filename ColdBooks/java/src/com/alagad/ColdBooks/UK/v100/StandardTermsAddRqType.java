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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardTermsAddRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardTermsAddRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}StandardTermsAdd"/>
 *         &lt;element name="IncludeRetElement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="requestID" type="{}STRTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardTermsAddRqType", propOrder = {
    "standardTermsAdd",
    "includeRetElement"
})
public class StandardTermsAddRqType {

    @XmlElement(name = "StandardTermsAdd", required = true)
    protected StandardTermsAdd standardTermsAdd;
    @XmlElement(name = "IncludeRetElement")
    protected List<String> includeRetElement;
    @XmlAttribute
    protected String requestID;

    /**
     * Gets the value of the standardTermsAdd property.
     * 
     * @return
     *     possible object is
     *     {@link StandardTermsAdd }
     *     
     */
    public StandardTermsAdd getStandardTermsAdd() {
        return standardTermsAdd;
    }

    /**
     * Sets the value of the standardTermsAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardTermsAdd }
     *     
     */
    public void setStandardTermsAdd(StandardTermsAdd value) {
        this.standardTermsAdd = value;
    }

    /**
     * Gets the value of the includeRetElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeRetElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeRetElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludeRetElement() {
        if (includeRetElement == null) {
            includeRetElement = new ArrayList<String>();
        }
        return this.includeRetElement;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

}

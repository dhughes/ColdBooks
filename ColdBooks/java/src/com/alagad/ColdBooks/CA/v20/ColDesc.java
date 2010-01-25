//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:58:36 PM EST 
//


package com.alagad.ColdBooks.CA.v20;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}ColTitle" maxOccurs="unbounded"/>
 *         &lt;element ref="{}ColType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="colID" use="required" type="{}INTTYPE" />
 *       &lt;attribute name="dataType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{}STRTYPE">
 *             &lt;enumeration value="IDTYPE"/>
 *             &lt;enumeration value="GUIDTYPE"/>
 *             &lt;enumeration value="STRTYPE"/>
 *             &lt;enumeration value="BOOLTYPE"/>
 *             &lt;enumeration value="DATETYPE"/>
 *             &lt;enumeration value="DATETIMETYPE"/>
 *             &lt;enumeration value="TIMEINTERVALTYPE"/>
 *             &lt;enumeration value="AMTTYPE"/>
 *             &lt;enumeration value="PRICETYPE"/>
 *             &lt;enumeration value="QUANTYPE"/>
 *             &lt;enumeration value="PERCENTTYPE"/>
 *             &lt;enumeration value="ENUMTYPE"/>
 *             &lt;enumeration value="INTTYPE"/>
 *             &lt;enumeration value="FLOATTYPE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "colTitle",
    "colType"
})
@XmlRootElement(name = "ColDesc")
public class ColDesc {

    @XmlElement(name = "ColTitle", required = true)
    protected List<ColTitle> colTitle;
    @XmlElement(name = "ColType", required = true)
    protected String colType;
    @XmlAttribute(required = true)
    protected BigInteger colID;
    @XmlAttribute(required = true)
    protected String dataType;

    /**
     * Gets the value of the colTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColTitle }
     * 
     * 
     */
    public List<ColTitle> getColTitle() {
        if (colTitle == null) {
            colTitle = new ArrayList<ColTitle>();
        }
        return this.colTitle;
    }

    /**
     * Gets the value of the colType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColType() {
        return colType;
    }

    /**
     * Sets the value of the colType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColType(String value) {
        this.colType = value;
    }

    /**
     * Gets the value of the colID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColID() {
        return colID;
    }

    /**
     * Sets the value of the colID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColID(BigInteger value) {
        this.colID = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:49:51 PM EDT 
//


package com.alagad.ColdBooks.US.v100;

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
 *         &lt;element ref="{}VehicleRef"/>
 *         &lt;element ref="{}CustomerRef" minOccurs="0"/>
 *         &lt;element ref="{}ItemRef" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}TripStartDate" minOccurs="0"/>
 *         &lt;element ref="{}TripEndDate" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;group ref="{}OdometerReadingAdd"/>
 *           &lt;element ref="{}TotalMiles"/>
 *         &lt;/choice>
 *         &lt;element name="Notes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}BillableStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="defMacro" type="{}MACROTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleRef",
    "customerRef",
    "itemRef",
    "classRef",
    "tripStartDate",
    "tripEndDate",
    "odometerStart",
    "odometerEnd",
    "totalMiles",
    "notes",
    "billableStatus"
})
@XmlRootElement(name = "VehicleMileageAdd")
public class VehicleMileageAdd {

    @XmlElement(name = "VehicleRef", required = true)
    protected VehicleRef vehicleRef;
    @XmlElement(name = "CustomerRef")
    protected CustomerRef customerRef;
    @XmlElement(name = "ItemRef")
    protected ItemRef itemRef;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "TripStartDate")
    protected String tripStartDate;
    @XmlElement(name = "TripEndDate")
    protected String tripEndDate;
    @XmlElement(name = "OdometerStart")
    protected String odometerStart;
    @XmlElement(name = "OdometerEnd")
    protected String odometerEnd;
    @XmlElement(name = "TotalMiles")
    protected String totalMiles;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "BillableStatus")
    protected String billableStatus;
    @XmlAttribute
    protected String defMacro;

    /**
     * Gets the value of the vehicleRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRef }
     *     
     */
    public VehicleRef getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Sets the value of the vehicleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRef }
     *     
     */
    public void setVehicleRef(VehicleRef value) {
        this.vehicleRef = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRef }
     *     
     */
    public CustomerRef getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRef }
     *     
     */
    public void setCustomerRef(CustomerRef value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRef }
     *     
     */
    public ItemRef getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRef }
     *     
     */
    public void setItemRef(ItemRef value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRef }
     *     
     */
    public ClassRef getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRef }
     *     
     */
    public void setClassRef(ClassRef value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the tripStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripStartDate() {
        return tripStartDate;
    }

    /**
     * Sets the value of the tripStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripStartDate(String value) {
        this.tripStartDate = value;
    }

    /**
     * Gets the value of the tripEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripEndDate() {
        return tripEndDate;
    }

    /**
     * Sets the value of the tripEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripEndDate(String value) {
        this.tripEndDate = value;
    }

    /**
     * Gets the value of the odometerStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdometerStart() {
        return odometerStart;
    }

    /**
     * Sets the value of the odometerStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdometerStart(String value) {
        this.odometerStart = value;
    }

    /**
     * Gets the value of the odometerEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdometerEnd() {
        return odometerEnd;
    }

    /**
     * Sets the value of the odometerEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdometerEnd(String value) {
        this.odometerEnd = value;
    }

    /**
     * Gets the value of the totalMiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMiles() {
        return totalMiles;
    }

    /**
     * Sets the value of the totalMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMiles(String value) {
        this.totalMiles = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the billableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillableStatus() {
        return billableStatus;
    }

    /**
     * Sets the value of the billableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillableStatus(String value) {
        this.billableStatus = value;
    }

    /**
     * Gets the value of the defMacro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefMacro() {
        return defMacro;
    }

    /**
     * Sets the value of the defMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefMacro(String value) {
        this.defMacro = value;
    }

}

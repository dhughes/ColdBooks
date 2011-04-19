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
 *         &lt;element ref="{}SubscriberID"/>
 *         &lt;element ref="{}COMCallbackInfo"/>
 *         &lt;element ref="{}DeliveryPolicy"/>
 *         &lt;element ref="{}TrackLostEvents" minOccurs="0"/>
 *         &lt;element ref="{}DeliverOwnEvents" minOccurs="0"/>
 *         &lt;element ref="{}ListEventSubscription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}TxnEventSubscription" maxOccurs="unbounded" minOccurs="0"/>
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
    "subscriberID",
    "comCallbackInfo",
    "deliveryPolicy",
    "trackLostEvents",
    "deliverOwnEvents",
    "listEventSubscription",
    "txnEventSubscription"
})
@XmlRootElement(name = "DataEventSubscriptionAdd")
public class DataEventSubscriptionAdd {

    @XmlElement(name = "SubscriberID", required = true)
    protected String subscriberID;
    @XmlElement(name = "COMCallbackInfo", required = true)
    protected COMCallbackInfo comCallbackInfo;
    @XmlElement(name = "DeliveryPolicy", required = true)
    protected String deliveryPolicy;
    @XmlElement(name = "TrackLostEvents", defaultValue = "None")
    protected String trackLostEvents;
    @XmlElement(name = "DeliverOwnEvents")
    protected String deliverOwnEvents;
    @XmlElement(name = "ListEventSubscription")
    protected List<ListEventSubscription> listEventSubscription;
    @XmlElement(name = "TxnEventSubscription")
    protected List<TxnEventSubscription> txnEventSubscription;

    /**
     * Gets the value of the subscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberID() {
        return subscriberID;
    }

    /**
     * Sets the value of the subscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberID(String value) {
        this.subscriberID = value;
    }

    /**
     * Gets the value of the comCallbackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link COMCallbackInfo }
     *     
     */
    public COMCallbackInfo getCOMCallbackInfo() {
        return comCallbackInfo;
    }

    /**
     * Sets the value of the comCallbackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMCallbackInfo }
     *     
     */
    public void setCOMCallbackInfo(COMCallbackInfo value) {
        this.comCallbackInfo = value;
    }

    /**
     * Gets the value of the deliveryPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPolicy() {
        return deliveryPolicy;
    }

    /**
     * Sets the value of the deliveryPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPolicy(String value) {
        this.deliveryPolicy = value;
    }

    /**
     * Gets the value of the trackLostEvents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackLostEvents() {
        return trackLostEvents;
    }

    /**
     * Sets the value of the trackLostEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackLostEvents(String value) {
        this.trackLostEvents = value;
    }

    /**
     * Gets the value of the deliverOwnEvents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverOwnEvents() {
        return deliverOwnEvents;
    }

    /**
     * Sets the value of the deliverOwnEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverOwnEvents(String value) {
        this.deliverOwnEvents = value;
    }

    /**
     * Gets the value of the listEventSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listEventSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListEventSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListEventSubscription }
     * 
     * 
     */
    public List<ListEventSubscription> getListEventSubscription() {
        if (listEventSubscription == null) {
            listEventSubscription = new ArrayList<ListEventSubscription>();
        }
        return this.listEventSubscription;
    }

    /**
     * Gets the value of the txnEventSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnEventSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnEventSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxnEventSubscription }
     * 
     * 
     */
    public List<TxnEventSubscription> getTxnEventSubscription() {
        if (txnEventSubscription == null) {
            txnEventSubscription = new ArrayList<TxnEventSubscription>();
        }
        return this.txnEventSubscription;
    }

}

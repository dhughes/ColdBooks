//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.18 at 07:49:51 PM EDT 
//


package com.alagad.ColdBooks.US.v100;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="DataEventSubscriptionAddRq" type="{}DataEventSubscriptionAddRqType"/>
 *         &lt;element name="DataEventSubscriptionQueryRq" type="{}DataEventSubscriptionQueryRqType"/>
 *         &lt;element name="UIEventSubscriptionAddRq" type="{}UIEventSubscriptionAddRqType"/>
 *         &lt;element name="UIEventSubscriptionQueryRq" type="{}UIEventSubscriptionQueryRqType"/>
 *         &lt;element name="UIExtensionSubscriptionAddRq" type="{}UIExtensionSubscriptionAddRqType"/>
 *         &lt;element name="UIExtensionSubscriptionQueryRq" type="{}UIExtensionSubscriptionQueryRqType"/>
 *         &lt;element name="SubscriptionDelRq" type="{}SubscriptionDelRqType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataEventSubscriptionAddRqOrDataEventSubscriptionQueryRqOrUIEventSubscriptionAddRq"
})
@XmlRootElement(name = "QBXMLSubscriptionMsgsRq")
public class QBXMLSubscriptionMsgsRq {

    @XmlElements({
        @XmlElement(name = "UIEventSubscriptionQueryRq", type = UIEventSubscriptionQueryRqType.class),
        @XmlElement(name = "UIEventSubscriptionAddRq", type = UIEventSubscriptionAddRqType.class),
        @XmlElement(name = "UIExtensionSubscriptionAddRq", type = UIExtensionSubscriptionAddRqType.class),
        @XmlElement(name = "DataEventSubscriptionAddRq", type = DataEventSubscriptionAddRqType.class),
        @XmlElement(name = "SubscriptionDelRq", type = SubscriptionDelRqType.class),
        @XmlElement(name = "UIExtensionSubscriptionQueryRq", type = UIExtensionSubscriptionQueryRqType.class),
        @XmlElement(name = "DataEventSubscriptionQueryRq", type = DataEventSubscriptionQueryRqType.class)
    })
    protected List<Object> dataEventSubscriptionAddRqOrDataEventSubscriptionQueryRqOrUIEventSubscriptionAddRq;

    /**
     * Gets the value of the dataEventSubscriptionAddRqOrDataEventSubscriptionQueryRqOrUIEventSubscriptionAddRq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataEventSubscriptionAddRqOrDataEventSubscriptionQueryRqOrUIEventSubscriptionAddRq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataEventSubscriptionAddRqOrDataEventSubscriptionQueryRqOrUIEventSubscriptionAddRq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UIEventSubscriptionQueryRqType }
     * {@link UIEventSubscriptionAddRqType }
     * {@link UIExtensionSubscriptionAddRqType }
     * {@link DataEventSubscriptionAddRqType }
     * {@link SubscriptionDelRqType }
     * {@link UIExtensionSubscriptionQueryRqType }
     * {@link DataEventSubscriptionQueryRqType }
     * 
     * 
     */
    public List<Object> getDataEventSubscriptionAddRqOrDataEventSubscriptionQueryRqOrUIEventSubscriptionAddRq() {
        if (dataEventSubscriptionAddRqOrDataEventSubscriptionQueryRqOrUIEventSubscriptionAddRq == null) {
            dataEventSubscriptionAddRqOrDataEventSubscriptionQueryRqOrUIEventSubscriptionAddRq = new ArrayList<Object>();
        }
        return this.dataEventSubscriptionAddRqOrDataEventSubscriptionQueryRqOrUIEventSubscriptionAddRq;
    }

}

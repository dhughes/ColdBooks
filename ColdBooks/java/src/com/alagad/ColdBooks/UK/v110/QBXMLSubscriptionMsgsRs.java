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
 *         &lt;element name="DataEventSubscriptionAddRs" type="{}DataEventSubscriptionAddRsType"/>
 *         &lt;element name="DataEventSubscriptionQueryRs" type="{}DataEventSubscriptionQueryRsType"/>
 *         &lt;element name="UIEventSubscriptionAddRs" type="{}UIEventSubscriptionAddRsType"/>
 *         &lt;element name="UIEventSubscriptionQueryRs" type="{}UIEventSubscriptionQueryRsType"/>
 *         &lt;element name="UIExtensionSubscriptionAddRs" type="{}UIExtensionSubscriptionAddRsType"/>
 *         &lt;element name="UIExtensionSubscriptionQueryRs" type="{}UIExtensionSubscriptionQueryRsType"/>
 *         &lt;element name="SubscriptionDelRs" type="{}SubscriptionDelRsType"/>
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
    "dataEventSubscriptionAddRsOrDataEventSubscriptionQueryRsOrUIEventSubscriptionAddRs"
})
@XmlRootElement(name = "QBXMLSubscriptionMsgsRs")
public class QBXMLSubscriptionMsgsRs {

    @XmlElements({
        @XmlElement(name = "UIEventSubscriptionQueryRs", type = UIEventSubscriptionQueryRsType.class),
        @XmlElement(name = "UIEventSubscriptionAddRs", type = UIEventSubscriptionAddRsType.class),
        @XmlElement(name = "SubscriptionDelRs", type = SubscriptionDelRsType.class),
        @XmlElement(name = "DataEventSubscriptionAddRs", type = DataEventSubscriptionAddRsType.class),
        @XmlElement(name = "UIExtensionSubscriptionAddRs", type = UIExtensionSubscriptionAddRsType.class),
        @XmlElement(name = "DataEventSubscriptionQueryRs", type = DataEventSubscriptionQueryRsType.class),
        @XmlElement(name = "UIExtensionSubscriptionQueryRs", type = UIExtensionSubscriptionQueryRsType.class)
    })
    protected List<Object> dataEventSubscriptionAddRsOrDataEventSubscriptionQueryRsOrUIEventSubscriptionAddRs;

    /**
     * Gets the value of the dataEventSubscriptionAddRsOrDataEventSubscriptionQueryRsOrUIEventSubscriptionAddRs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataEventSubscriptionAddRsOrDataEventSubscriptionQueryRsOrUIEventSubscriptionAddRs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataEventSubscriptionAddRsOrDataEventSubscriptionQueryRsOrUIEventSubscriptionAddRs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UIEventSubscriptionQueryRsType }
     * {@link UIEventSubscriptionAddRsType }
     * {@link SubscriptionDelRsType }
     * {@link DataEventSubscriptionAddRsType }
     * {@link UIExtensionSubscriptionAddRsType }
     * {@link DataEventSubscriptionQueryRsType }
     * {@link UIExtensionSubscriptionQueryRsType }
     * 
     * 
     */
    public List<Object> getDataEventSubscriptionAddRsOrDataEventSubscriptionQueryRsOrUIEventSubscriptionAddRs() {
        if (dataEventSubscriptionAddRsOrDataEventSubscriptionQueryRsOrUIEventSubscriptionAddRs == null) {
            dataEventSubscriptionAddRsOrDataEventSubscriptionQueryRsOrUIEventSubscriptionAddRs = new ArrayList<Object>();
        }
        return this.dataEventSubscriptionAddRsOrDataEventSubscriptionQueryRsOrUIEventSubscriptionAddRs;
    }

}

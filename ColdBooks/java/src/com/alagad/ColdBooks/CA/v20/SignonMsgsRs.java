//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.06 at 08:58:36 PM EST 
//


package com.alagad.ColdBooks.CA.v20;

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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="SignonAppCertRs" type="{}SignonAppCertRsType"/>
 *         &lt;element name="SignonDesktopRs" type="{}SignonDesktopRsType"/>
 *         &lt;element name="SignonTicketRs" type="{}SignonTicketRsType"/>
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
    "signonAppCertRsOrSignonDesktopRsOrSignonTicketRs"
})
@XmlRootElement(name = "SignonMsgsRs")
public class SignonMsgsRs {

    @XmlElements({
        @XmlElement(name = "SignonTicketRs", type = SignonTicketRsType.class),
        @XmlElement(name = "SignonAppCertRs", type = SignonAppCertRsType.class),
        @XmlElement(name = "SignonDesktopRs", type = SignonDesktopRsType.class)
    })
    protected List<Object> signonAppCertRsOrSignonDesktopRsOrSignonTicketRs;

    /**
     * Gets the value of the signonAppCertRsOrSignonDesktopRsOrSignonTicketRs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signonAppCertRsOrSignonDesktopRsOrSignonTicketRs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignonAppCertRsOrSignonDesktopRsOrSignonTicketRs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignonTicketRsType }
     * {@link SignonAppCertRsType }
     * {@link SignonDesktopRsType }
     * 
     * 
     */
    public List<Object> getSignonAppCertRsOrSignonDesktopRsOrSignonTicketRs() {
        if (signonAppCertRsOrSignonDesktopRsOrSignonTicketRs == null) {
            signonAppCertRsOrSignonDesktopRsOrSignonTicketRs = new ArrayList<Object>();
        }
        return this.signonAppCertRsOrSignonDesktopRsOrSignonTicketRs;
    }

}

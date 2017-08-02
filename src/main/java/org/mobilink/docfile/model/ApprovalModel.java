//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 02:30:27 PM ICT 
//


package org.mobilink.docfile.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


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
 *         &lt;element name="approvalDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="signerUserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="verified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "approvalDate",
    "signerUserId",
    "verified"
})
@XmlRootElement(name = "ApprovalModel")
public class ApprovalModel {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date approvalDate;
    protected long signerUserId;
    protected boolean verified;

    /**
     * Gets the value of the approvalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDate(Date value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the signerUserId property.
     * 
     */
    public long getSignerUserId() {
        return signerUserId;
    }

    /**
     * Sets the value of the signerUserId property.
     * 
     */
    public void setSignerUserId(long value) {
        this.signerUserId = value;
    }

    /**
     * Gets the value of the verified property.
     * 
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * Sets the value of the verified property.
     * 
     */
    public void setVerified(boolean value) {
        this.verified = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 02:30:27 PM ICT 
//


package org.mobilink.docfile.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="readwrite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="approval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "readwrite",
    "approval"
})
@XmlRootElement(name = "UserDocFileInputModel")
public class UserDocFileInputModel {

    protected boolean readwrite;
    protected boolean approval;

    /**
     * Gets the value of the readwrite property.
     * 
     */
    public boolean isReadwrite() {
        return readwrite;
    }

    /**
     * Sets the value of the readwrite property.
     * 
     */
    public void setReadwrite(boolean value) {
        this.readwrite = value;
    }

    /**
     * Gets the value of the approval property.
     * 
     */
    public boolean isApproval() {
        return approval;
    }

    /**
     * Sets the value of the approval property.
     * 
     */
    public void setApproval(boolean value) {
        this.approval = value;
    }

}

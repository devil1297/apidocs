//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.03 at 11:21:16 AM ICT 
//


package org.mobilink.employee.model;

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
 *         &lt;element name="jobPosId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workingUnitId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="workingUnitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "jobPosId",
    "title",
    "workingUnitId",
    "workingUnitName"
})
@XmlRootElement(name = "MainJobPostModel")
public class MainJobPostModel {

    protected long jobPosId;
    @XmlElement(required = true)
    protected String title;
    protected long workingUnitId;
    @XmlElement(required = true)
    protected String workingUnitName;

    /**
     * Gets the value of the jobPosId property.
     * 
     */
    public long getJobPosId() {
        return jobPosId;
    }

    /**
     * Sets the value of the jobPosId property.
     * 
     */
    public void setJobPosId(long value) {
        this.jobPosId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the workingUnitId property.
     * 
     */
    public long getWorkingUnitId() {
        return workingUnitId;
    }

    /**
     * Sets the value of the workingUnitId property.
     * 
     */
    public void setWorkingUnitId(long value) {
        this.workingUnitId = value;
    }

    /**
     * Gets the value of the workingUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingUnitName() {
        return workingUnitName;
    }

    /**
     * Sets the value of the workingUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingUnitName(String value) {
        this.workingUnitName = value;
    }

}

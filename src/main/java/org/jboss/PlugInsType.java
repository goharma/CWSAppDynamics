//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.23 at 01:55:54 PM PDT 
//


package org.jboss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 List of modules to be searched for supported security realm plug-ins.
 *             
 * 
 * <p>Java class for plug-insType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plug-insType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plug-in" type="{urn:jboss:domain:1.4}plug-inType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plug-insType", propOrder = {
    "plugIn"
})
public class PlugInsType {

    @XmlElement(name = "plug-in", required = true)
    protected PlugInType plugIn;

    /**
     * Gets the value of the plugIn property.
     * 
     * @return
     *     possible object is
     *     {@link PlugInType }
     *     
     */
    public PlugInType getPlugIn() {
        return plugIn;
    }

    /**
     * Sets the value of the plugIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlugInType }
     *     
     */
    public void setPlugIn(PlugInType value) {
        this.plugIn = value;
    }

}

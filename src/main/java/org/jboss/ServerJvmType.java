//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.23 at 01:55:54 PM PDT 
//


package org.jboss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverJvmType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverJvmType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:jboss:domain:1.4}namedJvmType">
 *       &lt;attribute name="debug-enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="debug-options" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverJvmType")
public class ServerJvmType
    extends NamedJvmType
{

    @XmlAttribute(name = "debug-enabled")
    protected Boolean debugEnabled;
    @XmlAttribute(name = "debug-options")
    protected String debugOptions;

    /**
     * Gets the value of the debugEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDebugEnabled() {
        if (debugEnabled == null) {
            return false;
        } else {
            return debugEnabled;
        }
    }

    /**
     * Sets the value of the debugEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebugEnabled(Boolean value) {
        this.debugEnabled = value;
    }

    /**
     * Gets the value of the debugOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebugOptions() {
        return debugOptions;
    }

    /**
     * Sets the value of the debugOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebugOptions(String value) {
        this.debugOptions = value;
    }

}
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
 * <p>Java class for socket-binding-group-refType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="socket-binding-group-refType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="port-offset" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "socket-binding-group-refType")
public class SocketBindingGroupRefType {

    @XmlAttribute
    protected String ref;
    @XmlAttribute(name = "port-offset")
    protected Integer portOffset;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the portOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPortOffset() {
        if (portOffset == null) {
            return  0;
        } else {
            return portOffset;
        }
    }

    /**
     * Sets the value of the portOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortOffset(Integer value) {
        this.portOffset = value;
    }

}

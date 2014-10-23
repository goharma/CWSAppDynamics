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
 * <p>Java class for host-management-interfacesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="host-management-interfacesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="native-interface" type="{urn:jboss:domain:1.4}host-native-management-interfaceType"/>
 *         &lt;element name="http-interface" type="{urn:jboss:domain:1.4}host-http-management-interfaceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "host-management-interfacesType", propOrder = {
    "nativeInterface",
    "httpInterface"
})
public class HostManagementInterfacesType {

    @XmlElement(name = "native-interface", required = true)
    protected HostNativeManagementInterfaceType nativeInterface;
    @XmlElement(name = "http-interface")
    protected HostHttpManagementInterfaceType httpInterface;

    /**
     * Gets the value of the nativeInterface property.
     * 
     * @return
     *     possible object is
     *     {@link HostNativeManagementInterfaceType }
     *     
     */
    public HostNativeManagementInterfaceType getNativeInterface() {
        return nativeInterface;
    }

    /**
     * Sets the value of the nativeInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNativeManagementInterfaceType }
     *     
     */
    public void setNativeInterface(HostNativeManagementInterfaceType value) {
        this.nativeInterface = value;
    }

    /**
     * Gets the value of the httpInterface property.
     * 
     * @return
     *     possible object is
     *     {@link HostHttpManagementInterfaceType }
     *     
     */
    public HostHttpManagementInterfaceType getHttpInterface() {
        return httpInterface;
    }

    /**
     * Sets the value of the httpInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostHttpManagementInterfaceType }
     *     
     */
    public void setHttpInterface(HostHttpManagementInterfaceType value) {
        this.httpInterface = value;
    }

}
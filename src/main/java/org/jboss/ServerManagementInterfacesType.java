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
 * <p>Java class for server-management-interfacesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="server-management-interfacesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="native-remoting-interface" type="{urn:jboss:domain:1.4}management-remoting-interfaceType" minOccurs="0"/>
 *         &lt;element name="native-interface" type="{urn:jboss:domain:1.4}server-native-management-interfaceType" minOccurs="0"/>
 *         &lt;element name="http-interface" type="{urn:jboss:domain:1.4}server-http-management-interfaceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "server-management-interfacesType", propOrder = {
    "nativeRemotingInterface",
    "nativeInterface",
    "httpInterface"
})
public class ServerManagementInterfacesType {

    @XmlElement(name = "native-remoting-interface")
    protected ManagementRemotingInterfaceType nativeRemotingInterface;
    @XmlElement(name = "native-interface")
    protected ServerNativeManagementInterfaceType nativeInterface;
    @XmlElement(name = "http-interface")
    protected ServerHttpManagementInterfaceType httpInterface;

    /**
     * Gets the value of the nativeRemotingInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementRemotingInterfaceType }
     *     
     */
    public ManagementRemotingInterfaceType getNativeRemotingInterface() {
        return nativeRemotingInterface;
    }

    /**
     * Sets the value of the nativeRemotingInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementRemotingInterfaceType }
     *     
     */
    public void setNativeRemotingInterface(ManagementRemotingInterfaceType value) {
        this.nativeRemotingInterface = value;
    }

    /**
     * Gets the value of the nativeInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ServerNativeManagementInterfaceType }
     *     
     */
    public ServerNativeManagementInterfaceType getNativeInterface() {
        return nativeInterface;
    }

    /**
     * Sets the value of the nativeInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerNativeManagementInterfaceType }
     *     
     */
    public void setNativeInterface(ServerNativeManagementInterfaceType value) {
        this.nativeInterface = value;
    }

    /**
     * Gets the value of the httpInterface property.
     * 
     * @return
     *     possible object is
     *     {@link ServerHttpManagementInterfaceType }
     *     
     */
    public ServerHttpManagementInterfaceType getHttpInterface() {
        return httpInterface;
    }

    /**
     * Sets the value of the httpInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerHttpManagementInterfaceType }
     *     
     */
    public void setHttpInterface(ServerHttpManagementInterfaceType value) {
        this.httpInterface = value;
    }

}

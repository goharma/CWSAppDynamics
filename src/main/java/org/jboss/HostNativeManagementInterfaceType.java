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
 *                 Configuration of a host's exposed native management interface.
 *             
 * 
 * <p>Java class for host-native-management-interfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="host-native-management-interfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:jboss:domain:1.4}management-interfaceType">
 *       &lt;sequence>
 *         &lt;element name="socket" type="{urn:jboss:domain:1.4}native-management-socketType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "host-native-management-interfaceType", propOrder = {
    "socket"
})
public class HostNativeManagementInterfaceType
    extends ManagementInterfaceType
{

    @XmlElement(required = true)
    protected NativeManagementSocketType socket;

    /**
     * Gets the value of the socket property.
     * 
     * @return
     *     possible object is
     *     {@link NativeManagementSocketType }
     *     
     */
    public NativeManagementSocketType getSocket() {
        return socket;
    }

    /**
     * Sets the value of the socket property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeManagementSocketType }
     *     
     */
    public void setSocket(NativeManagementSocketType value) {
        this.socket = value;
    }

}
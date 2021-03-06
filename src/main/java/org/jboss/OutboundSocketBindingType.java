//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.23 at 01:55:54 PM PDT 
//


package org.jboss;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Configuration information for a outbound socket.
 * 
 * <p>Java class for outbound-socket-bindingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outbound-socket-bindingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="remote-destination" type="{urn:jboss:domain:1.4}remote-destinationType"/>
 *         &lt;element name="local-destination" type="{urn:jboss:domain:1.4}local-destinationType"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source-interface" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source-port" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="fixed-source-port" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outbound-socket-bindingType", propOrder = {
    "remoteDestination",
    "localDestination"
})
public class OutboundSocketBindingType {

    @XmlElement(name = "remote-destination")
    protected RemoteDestinationType remoteDestination;
    @XmlElement(name = "local-destination")
    protected LocalDestinationType localDestination;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(name = "source-interface")
    protected String sourceInterface;
    @XmlAttribute(name = "source-port")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sourcePort;
    @XmlAttribute(name = "fixed-source-port")
    protected Boolean fixedSourcePort;

    /**
     * Gets the value of the remoteDestination property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteDestinationType }
     *     
     */
    public RemoteDestinationType getRemoteDestination() {
        return remoteDestination;
    }

    /**
     * Sets the value of the remoteDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteDestinationType }
     *     
     */
    public void setRemoteDestination(RemoteDestinationType value) {
        this.remoteDestination = value;
    }

    /**
     * Gets the value of the localDestination property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDestinationType }
     *     
     */
    public LocalDestinationType getLocalDestination() {
        return localDestination;
    }

    /**
     * Sets the value of the localDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDestinationType }
     *     
     */
    public void setLocalDestination(LocalDestinationType value) {
        this.localDestination = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sourceInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInterface() {
        return sourceInterface;
    }

    /**
     * Sets the value of the sourceInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInterface(String value) {
        this.sourceInterface = value;
    }

    /**
     * Gets the value of the sourcePort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourcePort() {
        return sourcePort;
    }

    /**
     * Sets the value of the sourcePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourcePort(BigInteger value) {
        this.sourcePort = value;
    }

    /**
     * Gets the value of the fixedSourcePort property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFixedSourcePort() {
        if (fixedSourcePort == null) {
            return false;
        } else {
            return fixedSourcePort;
        }
    }

    /**
     * Sets the value of the fixedSourcePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedSourcePort(Boolean value) {
        this.fixedSourcePort = value;
    }

}

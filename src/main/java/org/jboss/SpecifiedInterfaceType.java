//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.23 at 01:55:54 PM PDT 
//


package org.jboss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A named network interface, along with required criteria
 *                 for determining the IP address to associate with that interface.
 *             
 * 
 * <p>Java class for specified-interfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specified-interfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{urn:jboss:domain:1.4}interface-criteriaGroup"/>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specified-interfaceType", propOrder = {
    "anyAddress",
    "anyIpv6Address",
    "anyIpv4Address",
    "inetAddressOrLoopbackOrLoopbackAddress"
})
public class SpecifiedInterfaceType {

    @XmlElement(name = "any-address")
    protected AnyAddressType anyAddress;
    @XmlElement(name = "any-ipv6-address")
    protected AnyIpv6AddressType anyIpv6Address;
    @XmlElement(name = "any-ipv4-address")
    protected AnyIpv4AddressType anyIpv4Address;
    @XmlElementRefs({
        @XmlElementRef(name = "subnet-match", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "loopback", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "nic-match", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "site-local-address", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "point-to-point", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "multicast", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "inet-address", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "nic", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "loopback-address", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "any", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "up", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "public-address", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "link-local-address", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "virtual", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class),
        @XmlElementRef(name = "not", namespace = "urn:jboss:domain:1.4", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> inetAddressOrLoopbackOrLoopbackAddress;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the anyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AnyAddressType }
     *     
     */
    public AnyAddressType getAnyAddress() {
        return anyAddress;
    }

    /**
     * Sets the value of the anyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyAddressType }
     *     
     */
    public void setAnyAddress(AnyAddressType value) {
        this.anyAddress = value;
    }

    /**
     * Gets the value of the anyIpv6Address property.
     * 
     * @return
     *     possible object is
     *     {@link AnyIpv6AddressType }
     *     
     */
    public AnyIpv6AddressType getAnyIpv6Address() {
        return anyIpv6Address;
    }

    /**
     * Sets the value of the anyIpv6Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyIpv6AddressType }
     *     
     */
    public void setAnyIpv6Address(AnyIpv6AddressType value) {
        this.anyIpv6Address = value;
    }

    /**
     * Gets the value of the anyIpv4Address property.
     * 
     * @return
     *     possible object is
     *     {@link AnyIpv4AddressType }
     *     
     */
    public AnyIpv4AddressType getAnyIpv4Address() {
        return anyIpv4Address;
    }

    /**
     * Sets the value of the anyIpv4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyIpv4AddressType }
     *     
     */
    public void setAnyIpv4Address(AnyIpv4AddressType value) {
        this.anyIpv4Address = value;
    }

    /**
     * Gets the value of the inetAddressOrLoopbackOrLoopbackAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inetAddressOrLoopbackOrLoopbackAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInetAddressOrLoopbackOrLoopbackAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SubnetMatchType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoopbackType }{@code >}
     * {@link JAXBElement }{@code <}{@link NicMatchType }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteLocalAddressType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointToPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link MulticastType }{@code >}
     * {@link JAXBElement }{@code <}{@link InetAddressType }{@code >}
     * {@link JAXBElement }{@code <}{@link NicType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoopbackAddressType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressExclusionType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceUpType }{@code >}
     * {@link JAXBElement }{@code <}{@link PublicAddressType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceVirtualType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkLocalAddressType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressExclusionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getInetAddressOrLoopbackOrLoopbackAddress() {
        if (inetAddressOrLoopbackOrLoopbackAddress == null) {
            inetAddressOrLoopbackOrLoopbackAddress = new ArrayList<JAXBElement<?>>();
        }
        return this.inetAddressOrLoopbackOrLoopbackAddress;
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

}

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
 *         &lt;element name="system-properties" type="{urn:jboss:domain:1.4}properties-with-boottime" minOccurs="0"/>
 *         &lt;element name="paths" type="{urn:jboss:domain:1.4}specified-pathsType" minOccurs="0"/>
 *         &lt;element name="vault" type="{urn:jboss:domain:1.4}vaultType" minOccurs="0"/>
 *         &lt;element name="management" type="{urn:jboss:domain:1.4}host-managementType"/>
 *         &lt;element name="domain-controller" type="{urn:jboss:domain:1.4}domain-controllerType"/>
 *         &lt;element name="interfaces" type="{urn:jboss:domain:1.4}specified-interfacesType" minOccurs="0"/>
 *         &lt;element name="jvms" type="{urn:jboss:domain:1.4}jvmsType" minOccurs="0"/>
 *         &lt;element name="servers" type="{urn:jboss:domain:1.4}serversType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "systemProperties",
    "paths",
    "vault",
    "management",
    "domainController",
    "interfaces",
    "jvms",
    "servers"
})
@XmlRootElement(name = "host")
public class Host {

    @XmlElement(name = "system-properties")
    protected PropertiesWithBoottime systemProperties;
    protected SpecifiedPathsType paths;
    protected VaultType vault;
    @XmlElement(required = true)
    protected HostManagementType management;
    @XmlElement(name = "domain-controller", required = true)
    protected DomainControllerType domainController;
    protected SpecifiedInterfacesType interfaces;
    protected JvmsType jvms;
    protected ServersType servers;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the systemProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesWithBoottime }
     *     
     */
    public PropertiesWithBoottime getSystemProperties() {
        return systemProperties;
    }

    /**
     * Sets the value of the systemProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesWithBoottime }
     *     
     */
    public void setSystemProperties(PropertiesWithBoottime value) {
        this.systemProperties = value;
    }

    /**
     * Gets the value of the paths property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPathsType }
     *     
     */
    public SpecifiedPathsType getPaths() {
        return paths;
    }

    /**
     * Sets the value of the paths property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPathsType }
     *     
     */
    public void setPaths(SpecifiedPathsType value) {
        this.paths = value;
    }

    /**
     * Gets the value of the vault property.
     * 
     * @return
     *     possible object is
     *     {@link VaultType }
     *     
     */
    public VaultType getVault() {
        return vault;
    }

    /**
     * Sets the value of the vault property.
     * 
     * @param value
     *     allowed object is
     *     {@link VaultType }
     *     
     */
    public void setVault(VaultType value) {
        this.vault = value;
    }

    /**
     * Gets the value of the management property.
     * 
     * @return
     *     possible object is
     *     {@link HostManagementType }
     *     
     */
    public HostManagementType getManagement() {
        return management;
    }

    /**
     * Sets the value of the management property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostManagementType }
     *     
     */
    public void setManagement(HostManagementType value) {
        this.management = value;
    }

    /**
     * Gets the value of the domainController property.
     * 
     * @return
     *     possible object is
     *     {@link DomainControllerType }
     *     
     */
    public DomainControllerType getDomainController() {
        return domainController;
    }

    /**
     * Sets the value of the domainController property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainControllerType }
     *     
     */
    public void setDomainController(DomainControllerType value) {
        this.domainController = value;
    }

    /**
     * Gets the value of the interfaces property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedInterfacesType }
     *     
     */
    public SpecifiedInterfacesType getInterfaces() {
        return interfaces;
    }

    /**
     * Sets the value of the interfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedInterfacesType }
     *     
     */
    public void setInterfaces(SpecifiedInterfacesType value) {
        this.interfaces = value;
    }

    /**
     * Gets the value of the jvms property.
     * 
     * @return
     *     possible object is
     *     {@link JvmsType }
     *     
     */
    public JvmsType getJvms() {
        return jvms;
    }

    /**
     * Sets the value of the jvms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JvmsType }
     *     
     */
    public void setJvms(JvmsType value) {
        this.jvms = value;
    }

    /**
     * Gets the value of the servers property.
     * 
     * @return
     *     possible object is
     *     {@link ServersType }
     *     
     */
    public ServersType getServers() {
        return servers;
    }

    /**
     * Sets the value of the servers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServersType }
     *     
     */
    public void setServers(ServersType value) {
        this.servers = value;
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
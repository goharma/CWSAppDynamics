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
 *         &lt;element name="extensions" type="{urn:jboss:domain:1.4}extensionsType" minOccurs="0"/>
 *         &lt;element name="system-properties" type="{urn:jboss:domain:1.4}properties" minOccurs="0"/>
 *         &lt;element name="paths" type="{urn:jboss:domain:1.4}specified-pathsType" minOccurs="0"/>
 *         &lt;element name="vault" type="{urn:jboss:domain:1.4}vaultType" minOccurs="0"/>
 *         &lt;element name="management" type="{urn:jboss:domain:1.4}server-managementType" minOccurs="0"/>
 *         &lt;element name="profile" type="{urn:jboss:domain:1.4}standalone-profileType" minOccurs="0"/>
 *         &lt;element name="interfaces" type="{urn:jboss:domain:1.4}specified-interfacesType" minOccurs="0"/>
 *         &lt;element name="socket-binding-group" type="{urn:jboss:domain:1.4}standalone-socket-binding-groupType" minOccurs="0"/>
 *         &lt;element name="deployments" type="{urn:jboss:domain:1.4}server-deploymentsType" minOccurs="0"/>
 *         &lt;element name="deployment-overlays" type="{urn:jboss:domain:1.4}standalone-deployment-overlaysType" minOccurs="0"/>
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
    "extensions",
    "systemProperties",
    "paths",
    "vault",
    "management",
    "profile",
    "interfaces",
    "socketBindingGroup",
    "deployments",
    "deploymentOverlays"
})
@XmlRootElement(name = "server")
public class Server {

    protected ExtensionsType extensions;
    @XmlElement(name = "system-properties")
    protected Properties systemProperties;
    protected SpecifiedPathsType paths;
    protected VaultType vault;
    protected ServerManagementType management;
    protected StandaloneProfileType profile;
    protected SpecifiedInterfacesType interfaces;
    @XmlElement(name = "socket-binding-group")
    protected StandaloneSocketBindingGroupType socketBindingGroup;
    protected ServerDeploymentsType deployments;
    @XmlElement(name = "deployment-overlays")
    protected StandaloneDeploymentOverlaysType deploymentOverlays;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setExtensions(ExtensionsType value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the systemProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getSystemProperties() {
        return systemProperties;
    }

    /**
     * Sets the value of the systemProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setSystemProperties(Properties value) {
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
     *     {@link ServerManagementType }
     *     
     */
    public ServerManagementType getManagement() {
        return management;
    }

    /**
     * Sets the value of the management property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerManagementType }
     *     
     */
    public void setManagement(ServerManagementType value) {
        this.management = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link StandaloneProfileType }
     *     
     */
    public StandaloneProfileType getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandaloneProfileType }
     *     
     */
    public void setProfile(StandaloneProfileType value) {
        this.profile = value;
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
     * Gets the value of the socketBindingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link StandaloneSocketBindingGroupType }
     *     
     */
    public StandaloneSocketBindingGroupType getSocketBindingGroup() {
        return socketBindingGroup;
    }

    /**
     * Sets the value of the socketBindingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandaloneSocketBindingGroupType }
     *     
     */
    public void setSocketBindingGroup(StandaloneSocketBindingGroupType value) {
        this.socketBindingGroup = value;
    }

    /**
     * Gets the value of the deployments property.
     * 
     * @return
     *     possible object is
     *     {@link ServerDeploymentsType }
     *     
     */
    public ServerDeploymentsType getDeployments() {
        return deployments;
    }

    /**
     * Sets the value of the deployments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerDeploymentsType }
     *     
     */
    public void setDeployments(ServerDeploymentsType value) {
        this.deployments = value;
    }

    /**
     * Gets the value of the deploymentOverlays property.
     * 
     * @return
     *     possible object is
     *     {@link StandaloneDeploymentOverlaysType }
     *     
     */
    public StandaloneDeploymentOverlaysType getDeploymentOverlays() {
        return deploymentOverlays;
    }

    /**
     * Sets the value of the deploymentOverlays property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandaloneDeploymentOverlaysType }
     *     
     */
    public void setDeploymentOverlays(StandaloneDeploymentOverlaysType value) {
        this.deploymentOverlays = value;
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

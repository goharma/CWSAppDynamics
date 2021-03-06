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
 * 
 *                 The LDAP connection definition.
 *             
 * 
 * <p>Java class for ldapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ldapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="search-dn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="search-credential" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="security-realm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initial-context-factory" type="{http://www.w3.org/2001/XMLSchema}string" default="com.sun.jndi.ldap.LdapCtxFactory" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapType")
public class LdapType {

    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected String url;
    @XmlAttribute(name = "search-dn")
    protected String searchDn;
    @XmlAttribute(name = "search-credential")
    protected String searchCredential;
    @XmlAttribute(name = "security-realm")
    protected String securityRealm;
    @XmlAttribute(name = "initial-context-factory")
    protected String initialContextFactory;

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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the searchDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDn() {
        return searchDn;
    }

    /**
     * Sets the value of the searchDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDn(String value) {
        this.searchDn = value;
    }

    /**
     * Gets the value of the searchCredential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCredential() {
        return searchCredential;
    }

    /**
     * Sets the value of the searchCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCredential(String value) {
        this.searchCredential = value;
    }

    /**
     * Gets the value of the securityRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityRealm() {
        return securityRealm;
    }

    /**
     * Sets the value of the securityRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityRealm(String value) {
        this.securityRealm = value;
    }

    /**
     * Gets the value of the initialContextFactory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialContextFactory() {
        if (initialContextFactory == null) {
            return "com.sun.jndi.ldap.LdapCtxFactory";
        } else {
            return initialContextFactory;
        }
    }

    /**
     * Sets the value of the initialContextFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialContextFactory(String value) {
        this.initialContextFactory = value;
    }

}

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
 * Deployment represents anything that can be deployed (e.g. an application such as EJB-JAR,
 *                 WAR, EAR,
 *                 any kind of standard archive such as RAR or JBoss-specific deployment),
 *                 which can be enabled or disabled on a domain level.
 *             
 * 
 * <p>Java class for domain-deploymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="domain-deploymentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:jboss:domain:1.4}base-deploymentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="content" type="{urn:jboss:domain:1.4}contentType"/>
 *           &lt;element name="fs-archive" type="{urn:jboss:domain:1.4}fs-archiveType"/>
 *           &lt;element name="fs-exploded" type="{urn:jboss:domain:1.4}fs-explodedType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domain-deploymentType", propOrder = {
    "content",
    "fsArchive",
    "fsExploded"
})
public class DomainDeploymentType
    extends BaseDeploymentType
{

    protected ContentType content;
    @XmlElement(name = "fs-archive")
    protected FsArchiveType fsArchive;
    @XmlElement(name = "fs-exploded")
    protected FsExplodedType fsExploded;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setContent(ContentType value) {
        this.content = value;
    }

    /**
     * Gets the value of the fsArchive property.
     * 
     * @return
     *     possible object is
     *     {@link FsArchiveType }
     *     
     */
    public FsArchiveType getFsArchive() {
        return fsArchive;
    }

    /**
     * Sets the value of the fsArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link FsArchiveType }
     *     
     */
    public void setFsArchive(FsArchiveType value) {
        this.fsArchive = value;
    }

    /**
     * Gets the value of the fsExploded property.
     * 
     * @return
     *     possible object is
     *     {@link FsExplodedType }
     *     
     */
    public FsExplodedType getFsExploded() {
        return fsExploded;
    }

    /**
     * Sets the value of the fsExploded property.
     * 
     * @param value
     *     allowed object is
     *     {@link FsExplodedType }
     *     
     */
    public void setFsExploded(FsExplodedType value) {
        this.fsExploded = value;
    }

}

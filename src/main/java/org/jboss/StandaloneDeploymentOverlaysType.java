//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.23 at 01:55:54 PM PDT 
//


package org.jboss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 *                    Stores information about deployment overlays that can be used to override deployment content.
 *                 
 *             
 * 
 * <p>Java class for standalone-deployment-overlaysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standalone-deployment-overlaysType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deployment-overlay" type="{urn:jboss:domain:1.4}standalone-deployment-overlayType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standalone-deployment-overlaysType", propOrder = {
    "deploymentOverlay"
})
public class StandaloneDeploymentOverlaysType {

    @XmlElement(name = "deployment-overlay")
    protected List<StandaloneDeploymentOverlayType> deploymentOverlay;

    /**
     * Gets the value of the deploymentOverlay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deploymentOverlay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeploymentOverlay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandaloneDeploymentOverlayType }
     * 
     * 
     */
    public List<StandaloneDeploymentOverlayType> getDeploymentOverlay() {
        if (deploymentOverlay == null) {
            deploymentOverlay = new ArrayList<StandaloneDeploymentOverlayType>();
        }
        return this.deploymentOverlay;
    }

}

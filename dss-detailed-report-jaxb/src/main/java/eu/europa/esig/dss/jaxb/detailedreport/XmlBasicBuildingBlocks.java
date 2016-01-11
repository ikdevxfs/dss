//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.11 at 09:03:52 AM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicBuildingBlocks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicBuildingBlocks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISC" type="{http://dss.esig.europa.eu/validation/diagnostic}ISC" minOccurs="0"/>
 *         &lt;element name="VCI" type="{http://dss.esig.europa.eu/validation/diagnostic}VCI" minOccurs="0"/>
 *         &lt;element name="CV" type="{http://dss.esig.europa.eu/validation/diagnostic}CV" minOccurs="0"/>
 *         &lt;element name="SAV" type="{http://dss.esig.europa.eu/validation/diagnostic}SAV" minOccurs="0"/>
 *         &lt;element name="XCV" type="{http://dss.esig.europa.eu/validation/diagnostic}XCV" minOccurs="0"/>
 *         &lt;element name="Conclusion" type="{http://dss.esig.europa.eu/validation/diagnostic}Conclusion"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicBuildingBlocks", propOrder = {
    "isc",
    "vci",
    "cv",
    "sav",
    "xcv",
    "conclusion"
})
public class XmlBasicBuildingBlocks {

    @XmlElement(name = "ISC")
    protected XmlISC isc;
    @XmlElement(name = "VCI")
    protected XmlVCI vci;
    @XmlElement(name = "CV")
    protected XmlCV cv;
    @XmlElement(name = "SAV")
    protected XmlSAV sav;
    @XmlElement(name = "XCV")
    protected XmlXCV xcv;
    @XmlElement(name = "Conclusion", required = true)
    protected XmlConclusion conclusion;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Type", required = true)
    protected String type;

    /**
     * Gets the value of the isc property.
     * 
     * @return
     *     possible object is
     *     {@link XmlISC }
     *     
     */
    public XmlISC getISC() {
        return isc;
    }

    /**
     * Sets the value of the isc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlISC }
     *     
     */
    public void setISC(XmlISC value) {
        this.isc = value;
    }

    /**
     * Gets the value of the vci property.
     * 
     * @return
     *     possible object is
     *     {@link XmlVCI }
     *     
     */
    public XmlVCI getVCI() {
        return vci;
    }

    /**
     * Sets the value of the vci property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlVCI }
     *     
     */
    public void setVCI(XmlVCI value) {
        this.vci = value;
    }

    /**
     * Gets the value of the cv property.
     * 
     * @return
     *     possible object is
     *     {@link XmlCV }
     *     
     */
    public XmlCV getCV() {
        return cv;
    }

    /**
     * Sets the value of the cv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlCV }
     *     
     */
    public void setCV(XmlCV value) {
        this.cv = value;
    }

    /**
     * Gets the value of the sav property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSAV }
     *     
     */
    public XmlSAV getSAV() {
        return sav;
    }

    /**
     * Sets the value of the sav property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSAV }
     *     
     */
    public void setSAV(XmlSAV value) {
        this.sav = value;
    }

    /**
     * Gets the value of the xcv property.
     * 
     * @return
     *     possible object is
     *     {@link XmlXCV }
     *     
     */
    public XmlXCV getXCV() {
        return xcv;
    }

    /**
     * Sets the value of the xcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlXCV }
     *     
     */
    public void setXCV(XmlXCV value) {
        this.xcv = value;
    }

    /**
     * Gets the value of the conclusion property.
     * 
     * @return
     *     possible object is
     *     {@link XmlConclusion }
     *     
     */
    public XmlConclusion getConclusion() {
        return conclusion;
    }

    /**
     * Sets the value of the conclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlConclusion }
     *     
     */
    public void setConclusion(XmlConclusion value) {
        this.conclusion = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}

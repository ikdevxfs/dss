//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.11 at 09:03:52 AM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="NOT OK"/>
 *     &lt;enumeration value="IGNORED"/>
 *     &lt;enumeration value="INFORMATION"/>
 *     &lt;enumeration value="WARNING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Status")
@XmlEnum
public enum XmlStatus {

    OK("OK"),
    @XmlEnumValue("NOT OK")
    NOT_OK("NOT OK"),
    IGNORED("IGNORED"),
    INFORMATION("INFORMATION"),
    WARNING("WARNING");
    private final String value;

    XmlStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlStatus fromValue(String v) {
        for (XmlStatus c: XmlStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

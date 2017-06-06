//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 02:08:21 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="update"/>
 *     &lt;enumeration value="revert"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="void"/>
 *     &lt;enumeration value="send"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationEnum")
@XmlEnum
public enum OperationEnum {

    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("revert")
    REVERT("revert"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("void")
    VOID("void"),
    @XmlEnumValue("send")
    SEND("send");
    private final String value;

    OperationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationEnum fromValue(String v) {
        for (OperationEnum c: OperationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

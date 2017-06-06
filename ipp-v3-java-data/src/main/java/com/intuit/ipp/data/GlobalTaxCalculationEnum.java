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
 * <p>Java class for GlobalTaxCalculationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalTaxCalculationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TaxInclusive"/>
 *     &lt;enumeration value="TaxExcluded"/>
 *     &lt;enumeration value="NotApplicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GlobalTaxCalculationEnum")
@XmlEnum
public enum GlobalTaxCalculationEnum {

    @XmlEnumValue("TaxInclusive")
    TAX_INCLUSIVE("TaxInclusive"),
    @XmlEnumValue("TaxExcluded")
    TAX_EXCLUDED("TaxExcluded"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    GlobalTaxCalculationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalTaxCalculationEnum fromValue(String v) {
        for (GlobalTaxCalculationEnum c: GlobalTaxCalculationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

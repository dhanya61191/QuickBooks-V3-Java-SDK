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
 * <p>Java class for BudgetTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ProfitAndLoss"/>
 *     &lt;enumeration value="BalanceSheet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetTypeEnum")
@XmlEnum
public enum BudgetTypeEnum {

    @XmlEnumValue("ProfitAndLoss")
    PROFIT_AND_LOSS("ProfitAndLoss"),
    @XmlEnumValue("BalanceSheet")
    BALANCE_SHEET("BalanceSheet");
    private final String value;

    BudgetTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BudgetTypeEnum fromValue(String v) {
        for (BudgetTypeEnum c: BudgetTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

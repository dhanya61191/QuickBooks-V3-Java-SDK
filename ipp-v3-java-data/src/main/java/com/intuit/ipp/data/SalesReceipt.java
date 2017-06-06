//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 02:08:21 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * SalesReceipt Transaction entity 
 * 
 * <p>Java class for SalesReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesReceipt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}SalesTransaction">
 *       &lt;sequence>
 *         &lt;element name="SalesReceiptEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesReceipt", propOrder = {
    "salesReceiptEx"
})
public class SalesReceipt
    extends SalesTransaction
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SalesReceiptEx")
    protected IntuitAnyType salesReceiptEx;

    /**
     * Gets the value of the salesReceiptEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getSalesReceiptEx() {
        return salesReceiptEx;
    }

    /**
     * Sets the value of the salesReceiptEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setSalesReceiptEx(IntuitAnyType value) {
        this.salesReceiptEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SalesReceipt)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SalesReceipt that = ((SalesReceipt) object);
        {
            IntuitAnyType lhsSalesReceiptEx;
            lhsSalesReceiptEx = this.getSalesReceiptEx();
            IntuitAnyType rhsSalesReceiptEx;
            rhsSalesReceiptEx = that.getSalesReceiptEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesReceiptEx", lhsSalesReceiptEx), LocatorUtils.property(thatLocator, "salesReceiptEx", rhsSalesReceiptEx), lhsSalesReceiptEx, rhsSalesReceiptEx)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            IntuitAnyType theSalesReceiptEx;
            theSalesReceiptEx = this.getSalesReceiptEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesReceiptEx", theSalesReceiptEx), currentHashCode, theSalesReceiptEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

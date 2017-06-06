//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 02:08:21 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Financial transaction representing a refund (or
 * 				credit) of payment or part of a payment for goods or services that
 * 				have been sold.
 * 
 * <p>Java class for RefundReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundReceipt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}SalesTransaction">
 *       &lt;sequence>
 *         &lt;element name="RemainingCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RefundReceiptEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundReceipt", propOrder = {
    "remainingCredit",
    "refundReceiptEx"
})
public class RefundReceipt
    extends SalesTransaction
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RemainingCredit")
    protected BigDecimal remainingCredit;
    @XmlElement(name = "RefundReceiptEx")
    protected IntuitAnyType refundReceiptEx;

    /**
     * Gets the value of the remainingCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingCredit() {
        return remainingCredit;
    }

    /**
     * Sets the value of the remainingCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingCredit(BigDecimal value) {
        this.remainingCredit = value;
    }

    /**
     * Gets the value of the refundReceiptEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getRefundReceiptEx() {
        return refundReceiptEx;
    }

    /**
     * Sets the value of the refundReceiptEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setRefundReceiptEx(IntuitAnyType value) {
        this.refundReceiptEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RefundReceipt)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RefundReceipt that = ((RefundReceipt) object);
        {
            BigDecimal lhsRemainingCredit;
            lhsRemainingCredit = this.getRemainingCredit();
            BigDecimal rhsRemainingCredit;
            rhsRemainingCredit = that.getRemainingCredit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remainingCredit", lhsRemainingCredit), LocatorUtils.property(thatLocator, "remainingCredit", rhsRemainingCredit), lhsRemainingCredit, rhsRemainingCredit)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsRefundReceiptEx;
            lhsRefundReceiptEx = this.getRefundReceiptEx();
            IntuitAnyType rhsRefundReceiptEx;
            rhsRefundReceiptEx = that.getRefundReceiptEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refundReceiptEx", lhsRefundReceiptEx), LocatorUtils.property(thatLocator, "refundReceiptEx", rhsRefundReceiptEx), lhsRefundReceiptEx, rhsRefundReceiptEx)) {
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
            BigDecimal theRemainingCredit;
            theRemainingCredit = this.getRemainingCredit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remainingCredit", theRemainingCredit), currentHashCode, theRemainingCredit);
        }
        {
            IntuitAnyType theRefundReceiptEx;
            theRefundReceiptEx = this.getRefundReceiptEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refundReceiptEx", theRefundReceiptEx), currentHashCode, theRefundReceiptEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

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
 * Financial transaction representing transfer of
 * 				funds between accounts.
 * 				Non QB-writable.
 * 			
 * 
 * <p>Java class for Transfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transfer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Transaction">
 *       &lt;sequence>
 *         &lt;element name="FromAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ToAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="TransferEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer", propOrder = {
    "fromAccountRef",
    "toAccountRef",
    "amount",
    "classRef",
    "transferEx"
})
public class Transfer
    extends Transaction
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FromAccountRef")
    protected ReferenceType fromAccountRef;
    @XmlElement(name = "ToAccountRef")
    protected ReferenceType toAccountRef;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;
    @XmlElement(name = "TransferEx", required = true)
    protected IntuitAnyType transferEx;

    /**
     * Gets the value of the fromAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getFromAccountRef() {
        return fromAccountRef;
    }

    /**
     * Sets the value of the fromAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setFromAccountRef(ReferenceType value) {
        this.fromAccountRef = value;
    }

    /**
     * Gets the value of the toAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getToAccountRef() {
        return toAccountRef;
    }

    /**
     * Sets the value of the toAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setToAccountRef(ReferenceType value) {
        this.toAccountRef = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the transferEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getTransferEx() {
        return transferEx;
    }

    /**
     * Sets the value of the transferEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setTransferEx(IntuitAnyType value) {
        this.transferEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Transfer)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Transfer that = ((Transfer) object);
        {
            ReferenceType lhsFromAccountRef;
            lhsFromAccountRef = this.getFromAccountRef();
            ReferenceType rhsFromAccountRef;
            rhsFromAccountRef = that.getFromAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromAccountRef", lhsFromAccountRef), LocatorUtils.property(thatLocator, "fromAccountRef", rhsFromAccountRef), lhsFromAccountRef, rhsFromAccountRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsToAccountRef;
            lhsToAccountRef = this.getToAccountRef();
            ReferenceType rhsToAccountRef;
            rhsToAccountRef = that.getToAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toAccountRef", lhsToAccountRef), LocatorUtils.property(thatLocator, "toAccountRef", rhsToAccountRef), lhsToAccountRef, rhsToAccountRef)) {
                return false;
            }
        }
        {
            BigDecimal lhsAmount;
            lhsAmount = this.getAmount();
            BigDecimal rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount)) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsTransferEx;
            lhsTransferEx = this.getTransferEx();
            IntuitAnyType rhsTransferEx;
            rhsTransferEx = that.getTransferEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transferEx", lhsTransferEx), LocatorUtils.property(thatLocator, "transferEx", rhsTransferEx), lhsTransferEx, rhsTransferEx)) {
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
            ReferenceType theFromAccountRef;
            theFromAccountRef = this.getFromAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromAccountRef", theFromAccountRef), currentHashCode, theFromAccountRef);
        }
        {
            ReferenceType theToAccountRef;
            theToAccountRef = this.getToAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toAccountRef", theToAccountRef), currentHashCode, theToAccountRef);
        }
        {
            BigDecimal theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount);
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef);
        }
        {
            IntuitAnyType theTransferEx;
            theTransferEx = this.getTransferEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transferEx", theTransferEx), currentHashCode, theTransferEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

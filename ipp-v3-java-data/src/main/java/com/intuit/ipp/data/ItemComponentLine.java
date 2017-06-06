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
 * 
 * 				Product: ALL
 * 				Description: Constituent line of a
 * 				group item.
 * 			
 * 
 * <p>Java class for ItemComponentLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemComponentLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UOMRef" type="{http://schema.intuit.com/finance/v3}UOMRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemComponentLine", propOrder = {
    "itemRef",
    "qty",
    "uomRef"
})
public class ItemComponentLine
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemRef")
    protected ReferenceType itemRef;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "UOMRef")
    protected UOMRef uomRef;

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setItemRef(ReferenceType value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the uomRef property.
     * 
     * @return
     *     possible object is
     *     {@link UOMRef }
     *     
     */
    public UOMRef getUOMRef() {
        return uomRef;
    }

    /**
     * Sets the value of the uomRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMRef }
     *     
     */
    public void setUOMRef(UOMRef value) {
        this.uomRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemComponentLine)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemComponentLine that = ((ItemComponentLine) object);
        {
            ReferenceType lhsItemRef;
            lhsItemRef = this.getItemRef();
            ReferenceType rhsItemRef;
            rhsItemRef = that.getItemRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemRef", lhsItemRef), LocatorUtils.property(thatLocator, "itemRef", rhsItemRef), lhsItemRef, rhsItemRef)) {
                return false;
            }
        }
        {
            BigDecimal lhsQty;
            lhsQty = this.getQty();
            BigDecimal rhsQty;
            rhsQty = that.getQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qty", lhsQty), LocatorUtils.property(thatLocator, "qty", rhsQty), lhsQty, rhsQty)) {
                return false;
            }
        }
        {
            UOMRef lhsUOMRef;
            lhsUOMRef = this.getUOMRef();
            UOMRef rhsUOMRef;
            rhsUOMRef = that.getUOMRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomRef", lhsUOMRef), LocatorUtils.property(thatLocator, "uomRef", rhsUOMRef), lhsUOMRef, rhsUOMRef)) {
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
        int currentHashCode = 1;
        {
            ReferenceType theItemRef;
            theItemRef = this.getItemRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemRef", theItemRef), currentHashCode, theItemRef);
        }
        {
            BigDecimal theQty;
            theQty = this.getQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qty", theQty), currentHashCode, theQty);
        }
        {
            UOMRef theUOMRef;
            theUOMRef = this.getUOMRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomRef", theUOMRef), currentHashCode, theUOMRef);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

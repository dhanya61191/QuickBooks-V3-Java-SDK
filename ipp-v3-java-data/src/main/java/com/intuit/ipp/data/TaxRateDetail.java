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
 * <p>Java class for TaxRateDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRateDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxRateRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="TaxTypeApplicable" type="{http://schema.intuit.com/finance/v3}TaxTypeApplicablityEnum" minOccurs="0"/>
 *         &lt;element name="TaxOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxOnTaxOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRateDetail", propOrder = {
    "taxRateRef",
    "taxTypeApplicable",
    "taxOrder",
    "taxOnTaxOrder"
})
public class TaxRateDetail
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TaxRateRef")
    protected ReferenceType taxRateRef;
    @XmlElement(name = "TaxTypeApplicable")
    protected TaxTypeApplicablityEnum taxTypeApplicable;
    @XmlElement(name = "TaxOrder")
    protected Integer taxOrder;
    @XmlElement(name = "TaxOnTaxOrder")
    protected Integer taxOnTaxOrder;

    /**
     * Gets the value of the taxRateRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxRateRef() {
        return taxRateRef;
    }

    /**
     * Sets the value of the taxRateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxRateRef(ReferenceType value) {
        this.taxRateRef = value;
    }

    /**
     * Gets the value of the taxTypeApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeApplicablityEnum }
     *     
     */
    public TaxTypeApplicablityEnum getTaxTypeApplicable() {
        return taxTypeApplicable;
    }

    /**
     * Sets the value of the taxTypeApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeApplicablityEnum }
     *     
     */
    public void setTaxTypeApplicable(TaxTypeApplicablityEnum value) {
        this.taxTypeApplicable = value;
    }

    /**
     * Gets the value of the taxOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxOrder() {
        return taxOrder;
    }

    /**
     * Sets the value of the taxOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxOrder(Integer value) {
        this.taxOrder = value;
    }

    /**
     * Gets the value of the taxOnTaxOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxOnTaxOrder() {
        return taxOnTaxOrder;
    }

    /**
     * Sets the value of the taxOnTaxOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxOnTaxOrder(Integer value) {
        this.taxOnTaxOrder = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TaxRateDetail)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxRateDetail that = ((TaxRateDetail) object);
        {
            ReferenceType lhsTaxRateRef;
            lhsTaxRateRef = this.getTaxRateRef();
            ReferenceType rhsTaxRateRef;
            rhsTaxRateRef = that.getTaxRateRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxRateRef", lhsTaxRateRef), LocatorUtils.property(thatLocator, "taxRateRef", rhsTaxRateRef), lhsTaxRateRef, rhsTaxRateRef)) {
                return false;
            }
        }
        {
            TaxTypeApplicablityEnum lhsTaxTypeApplicable;
            lhsTaxTypeApplicable = this.getTaxTypeApplicable();
            TaxTypeApplicablityEnum rhsTaxTypeApplicable;
            rhsTaxTypeApplicable = that.getTaxTypeApplicable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxTypeApplicable", lhsTaxTypeApplicable), LocatorUtils.property(thatLocator, "taxTypeApplicable", rhsTaxTypeApplicable), lhsTaxTypeApplicable, rhsTaxTypeApplicable)) {
                return false;
            }
        }
        {
            Integer lhsTaxOrder;
            lhsTaxOrder = this.getTaxOrder();
            Integer rhsTaxOrder;
            rhsTaxOrder = that.getTaxOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxOrder", lhsTaxOrder), LocatorUtils.property(thatLocator, "taxOrder", rhsTaxOrder), lhsTaxOrder, rhsTaxOrder)) {
                return false;
            }
        }
        {
            Integer lhsTaxOnTaxOrder;
            lhsTaxOnTaxOrder = this.getTaxOnTaxOrder();
            Integer rhsTaxOnTaxOrder;
            rhsTaxOnTaxOrder = that.getTaxOnTaxOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxOnTaxOrder", lhsTaxOnTaxOrder), LocatorUtils.property(thatLocator, "taxOnTaxOrder", rhsTaxOnTaxOrder), lhsTaxOnTaxOrder, rhsTaxOnTaxOrder)) {
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
            ReferenceType theTaxRateRef;
            theTaxRateRef = this.getTaxRateRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRateRef", theTaxRateRef), currentHashCode, theTaxRateRef);
        }
        {
            TaxTypeApplicablityEnum theTaxTypeApplicable;
            theTaxTypeApplicable = this.getTaxTypeApplicable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTypeApplicable", theTaxTypeApplicable), currentHashCode, theTaxTypeApplicable);
        }
        {
            Integer theTaxOrder;
            theTaxOrder = this.getTaxOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxOrder", theTaxOrder), currentHashCode, theTaxOrder);
        }
        {
            Integer theTaxOnTaxOrder;
            theTaxOnTaxOrder = this.getTaxOnTaxOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxOnTaxOrder", theTaxOnTaxOrder), currentHashCode, theTaxOnTaxOrder);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

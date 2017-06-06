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
 * <p>Java class for TaxPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPrefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsingSalesTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartnerTaxEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="TaxGroupCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *           &lt;element name="TaxRateRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="PaySalesTax" type="{http://schema.intuit.com/finance/v3}PaySalesTaxEnum" minOccurs="0"/>
 *         &lt;element name="NonTaxableSalesTaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="TaxableSalesTaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxPrefs", propOrder = {
    "usingSalesTax",
    "partnerTaxEnabled",
    "taxGroupCodeRef",
    "taxRateRef",
    "paySalesTax",
    "nonTaxableSalesTaxCodeRef",
    "taxableSalesTaxCodeRef"
})
public class TaxPrefs
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UsingSalesTax")
    protected Boolean usingSalesTax;
    @XmlElement(name = "PartnerTaxEnabled")
    protected Boolean partnerTaxEnabled;
    @XmlElement(name = "TaxGroupCodeRef")
    protected ReferenceType taxGroupCodeRef;
    @XmlElement(name = "TaxRateRef")
    protected ReferenceType taxRateRef;
    @XmlElement(name = "PaySalesTax")
    protected PaySalesTaxEnum paySalesTax;
    @XmlElement(name = "NonTaxableSalesTaxCodeRef")
    protected ReferenceType nonTaxableSalesTaxCodeRef;
    @XmlElement(name = "TaxableSalesTaxCodeRef")
    protected ReferenceType taxableSalesTaxCodeRef;

    /**
     * Gets the value of the usingSalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsingSalesTax() {
        return usingSalesTax;
    }

    /**
     * Sets the value of the usingSalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsingSalesTax(Boolean value) {
        this.usingSalesTax = value;
    }

    /**
     * Gets the value of the partnerTaxEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartnerTaxEnabled() {
        return partnerTaxEnabled;
    }

    /**
     * Sets the value of the partnerTaxEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartnerTaxEnabled(Boolean value) {
        this.partnerTaxEnabled = value;
    }

    /**
     * Gets the value of the taxGroupCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxGroupCodeRef() {
        return taxGroupCodeRef;
    }

    /**
     * Sets the value of the taxGroupCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxGroupCodeRef(ReferenceType value) {
        this.taxGroupCodeRef = value;
    }

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
     * Gets the value of the paySalesTax property.
     * 
     * @return
     *     possible object is
     *     {@link PaySalesTaxEnum }
     *     
     */
    public PaySalesTaxEnum getPaySalesTax() {
        return paySalesTax;
    }

    /**
     * Sets the value of the paySalesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaySalesTaxEnum }
     *     
     */
    public void setPaySalesTax(PaySalesTaxEnum value) {
        this.paySalesTax = value;
    }

    /**
     * Gets the value of the nonTaxableSalesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getNonTaxableSalesTaxCodeRef() {
        return nonTaxableSalesTaxCodeRef;
    }

    /**
     * Sets the value of the nonTaxableSalesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setNonTaxableSalesTaxCodeRef(ReferenceType value) {
        this.nonTaxableSalesTaxCodeRef = value;
    }

    /**
     * Gets the value of the taxableSalesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxableSalesTaxCodeRef() {
        return taxableSalesTaxCodeRef;
    }

    /**
     * Sets the value of the taxableSalesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxableSalesTaxCodeRef(ReferenceType value) {
        this.taxableSalesTaxCodeRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TaxPrefs)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxPrefs that = ((TaxPrefs) object);
        {
            Boolean lhsUsingSalesTax;
            lhsUsingSalesTax = this.isUsingSalesTax();
            Boolean rhsUsingSalesTax;
            rhsUsingSalesTax = that.isUsingSalesTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usingSalesTax", lhsUsingSalesTax), LocatorUtils.property(thatLocator, "usingSalesTax", rhsUsingSalesTax), lhsUsingSalesTax, rhsUsingSalesTax)) {
                return false;
            }
        }
        {
            Boolean lhsPartnerTaxEnabled;
            lhsPartnerTaxEnabled = this.isPartnerTaxEnabled();
            Boolean rhsPartnerTaxEnabled;
            rhsPartnerTaxEnabled = that.isPartnerTaxEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerTaxEnabled", lhsPartnerTaxEnabled), LocatorUtils.property(thatLocator, "partnerTaxEnabled", rhsPartnerTaxEnabled), lhsPartnerTaxEnabled, rhsPartnerTaxEnabled)) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxGroupCodeRef;
            lhsTaxGroupCodeRef = this.getTaxGroupCodeRef();
            ReferenceType rhsTaxGroupCodeRef;
            rhsTaxGroupCodeRef = that.getTaxGroupCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxGroupCodeRef", lhsTaxGroupCodeRef), LocatorUtils.property(thatLocator, "taxGroupCodeRef", rhsTaxGroupCodeRef), lhsTaxGroupCodeRef, rhsTaxGroupCodeRef)) {
                return false;
            }
        }
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
            PaySalesTaxEnum lhsPaySalesTax;
            lhsPaySalesTax = this.getPaySalesTax();
            PaySalesTaxEnum rhsPaySalesTax;
            rhsPaySalesTax = that.getPaySalesTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paySalesTax", lhsPaySalesTax), LocatorUtils.property(thatLocator, "paySalesTax", rhsPaySalesTax), lhsPaySalesTax, rhsPaySalesTax)) {
                return false;
            }
        }
        {
            ReferenceType lhsNonTaxableSalesTaxCodeRef;
            lhsNonTaxableSalesTaxCodeRef = this.getNonTaxableSalesTaxCodeRef();
            ReferenceType rhsNonTaxableSalesTaxCodeRef;
            rhsNonTaxableSalesTaxCodeRef = that.getNonTaxableSalesTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nonTaxableSalesTaxCodeRef", lhsNonTaxableSalesTaxCodeRef), LocatorUtils.property(thatLocator, "nonTaxableSalesTaxCodeRef", rhsNonTaxableSalesTaxCodeRef), lhsNonTaxableSalesTaxCodeRef, rhsNonTaxableSalesTaxCodeRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxableSalesTaxCodeRef;
            lhsTaxableSalesTaxCodeRef = this.getTaxableSalesTaxCodeRef();
            ReferenceType rhsTaxableSalesTaxCodeRef;
            rhsTaxableSalesTaxCodeRef = that.getTaxableSalesTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxableSalesTaxCodeRef", lhsTaxableSalesTaxCodeRef), LocatorUtils.property(thatLocator, "taxableSalesTaxCodeRef", rhsTaxableSalesTaxCodeRef), lhsTaxableSalesTaxCodeRef, rhsTaxableSalesTaxCodeRef)) {
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
            Boolean theUsingSalesTax;
            theUsingSalesTax = this.isUsingSalesTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usingSalesTax", theUsingSalesTax), currentHashCode, theUsingSalesTax);
        }
        {
            Boolean thePartnerTaxEnabled;
            thePartnerTaxEnabled = this.isPartnerTaxEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerTaxEnabled", thePartnerTaxEnabled), currentHashCode, thePartnerTaxEnabled);
        }
        {
            ReferenceType theTaxGroupCodeRef;
            theTaxGroupCodeRef = this.getTaxGroupCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxGroupCodeRef", theTaxGroupCodeRef), currentHashCode, theTaxGroupCodeRef);
        }
        {
            ReferenceType theTaxRateRef;
            theTaxRateRef = this.getTaxRateRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRateRef", theTaxRateRef), currentHashCode, theTaxRateRef);
        }
        {
            PaySalesTaxEnum thePaySalesTax;
            thePaySalesTax = this.getPaySalesTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paySalesTax", thePaySalesTax), currentHashCode, thePaySalesTax);
        }
        {
            ReferenceType theNonTaxableSalesTaxCodeRef;
            theNonTaxableSalesTaxCodeRef = this.getNonTaxableSalesTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nonTaxableSalesTaxCodeRef", theNonTaxableSalesTaxCodeRef), currentHashCode, theNonTaxableSalesTaxCodeRef);
        }
        {
            ReferenceType theTaxableSalesTaxCodeRef;
            theTaxableSalesTaxCodeRef = this.getTaxableSalesTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxableSalesTaxCodeRef", theTaxableSalesTaxCodeRef), currentHashCode, theTaxableSalesTaxCodeRef);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

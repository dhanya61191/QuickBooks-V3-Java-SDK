//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 02:08:21 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Transaction entity is the base class of all
 * 				transactions
 * 
 * <p>Java class for Estimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Estimate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}SalesTransaction">
 *       &lt;sequence>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AcceptedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcceptedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EstimateEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estimate", propOrder = {
    "expirationDate",
    "acceptedBy",
    "acceptedDate",
    "estimateEx"
})
public class Estimate
    extends SalesTransaction
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ExpirationDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date expirationDate;
    @XmlElement(name = "AcceptedBy")
    protected String acceptedBy;
    @XmlElement(name = "AcceptedDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date acceptedDate;
    @XmlElement(name = "EstimateEx")
    protected IntuitAnyType estimateEx;

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the acceptedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptedBy() {
        return acceptedBy;
    }

    /**
     * Sets the value of the acceptedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedBy(String value) {
        this.acceptedBy = value;
    }

    /**
     * Gets the value of the acceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAcceptedDate() {
        return acceptedDate;
    }

    /**
     * Sets the value of the acceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedDate(Date value) {
        this.acceptedDate = value;
    }

    /**
     * Gets the value of the estimateEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getEstimateEx() {
        return estimateEx;
    }

    /**
     * Sets the value of the estimateEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setEstimateEx(IntuitAnyType value) {
        this.estimateEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Estimate)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Estimate that = ((Estimate) object);
        {
            Date lhsExpirationDate;
            lhsExpirationDate = this.getExpirationDate();
            Date rhsExpirationDate;
            rhsExpirationDate = that.getExpirationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expirationDate", lhsExpirationDate), LocatorUtils.property(thatLocator, "expirationDate", rhsExpirationDate), lhsExpirationDate, rhsExpirationDate)) {
                return false;
            }
        }
        {
            String lhsAcceptedBy;
            lhsAcceptedBy = this.getAcceptedBy();
            String rhsAcceptedBy;
            rhsAcceptedBy = that.getAcceptedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptedBy", lhsAcceptedBy), LocatorUtils.property(thatLocator, "acceptedBy", rhsAcceptedBy), lhsAcceptedBy, rhsAcceptedBy)) {
                return false;
            }
        }
        {
            Date lhsAcceptedDate;
            lhsAcceptedDate = this.getAcceptedDate();
            Date rhsAcceptedDate;
            rhsAcceptedDate = that.getAcceptedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptedDate", lhsAcceptedDate), LocatorUtils.property(thatLocator, "acceptedDate", rhsAcceptedDate), lhsAcceptedDate, rhsAcceptedDate)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsEstimateEx;
            lhsEstimateEx = this.getEstimateEx();
            IntuitAnyType rhsEstimateEx;
            rhsEstimateEx = that.getEstimateEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimateEx", lhsEstimateEx), LocatorUtils.property(thatLocator, "estimateEx", rhsEstimateEx), lhsEstimateEx, rhsEstimateEx)) {
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
            Date theExpirationDate;
            theExpirationDate = this.getExpirationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expirationDate", theExpirationDate), currentHashCode, theExpirationDate);
        }
        {
            String theAcceptedBy;
            theAcceptedBy = this.getAcceptedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptedBy", theAcceptedBy), currentHashCode, theAcceptedBy);
        }
        {
            Date theAcceptedDate;
            theAcceptedDate = this.getAcceptedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptedDate", theAcceptedDate), currentHashCode, theAcceptedDate);
        }
        {
            IntuitAnyType theEstimateEx;
            theEstimateEx = this.getEstimateEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimateEx", theEstimateEx), currentHashCode, theEstimateEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

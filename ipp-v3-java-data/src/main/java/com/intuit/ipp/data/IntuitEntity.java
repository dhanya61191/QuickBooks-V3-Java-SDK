//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 02:08:21 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.intuit.ipp.core.IEntity;
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
 * 				Description: Base type of any top level Intuit Entity of small business type.
 * 			
 * 
 * <p>Java class for IntuitEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntuitEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://schema.intuit.com/finance/v3}id" minOccurs="0"/>
 *         &lt;element name="SyncToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetaData" type="{http://schema.intuit.com/finance/v3}ModificationMetaData" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://schema.intuit.com/finance/v3}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttachableRef" type="{http://schema.intuit.com/finance/v3}AttachableRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://schema.intuit.com/finance/v3}EntityStatusEnum" />
 *       &lt;attribute name="sparse" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntuitEntity", propOrder = {
    "id",
    "syncToken",
    "metaData",
    "customField",
    "attachableRef"
})
@XmlSeeAlso({
    Task.class,
    Company.class,
    FixedAsset.class,
    Item.class,
    InventorySite.class,
    Department.class,
    QbdtEntityIdMapping.class,
    TimeActivity.class,
    Status.class,
    JournalCode.class,
    Term.class,
    CustomerType.class,
    UserAlert.class,
    SyncActivity.class,
    PaymentMethod.class,
    Class.class,
    TaxService.class,
    CompanyInfo.class,
    CompanyCurrency.class,
    ExchangeRate.class,
    Account.class,
    PriceLevel.class,
    TaxCode.class,
    TaxRate.class,
    Budget.class,
    Preferences.class,
    SalesRep.class,
    EmailDeliveryInfo.class,
    VendorType.class,
    TDSMetadata.class,
    CustomFieldDefinition.class,
    Attachable.class,
    TaxReturn.class,
    Currency.class,
    PriceLevelPerItem.class,
    ShipMethod.class,
    UOM.class,
    CustomerMsg.class,
    NameBase.class,
    User.class,
    TemplateName.class,
    Transaction.class,
    JobType.class
})
public abstract class IntuitEntity implements Serializable, IEntity, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "SyncToken")
    protected String syncToken;
    @XmlElement(name = "MetaData")
    protected ModificationMetaData metaData;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customField;
    @XmlElement(name = "AttachableRef")
    protected List<AttachableRef> attachableRef;
    @XmlAttribute(name = "domain")
    protected String domain;
    @XmlAttribute(name = "status")
    protected EntityStatusEnum status;
    @XmlAttribute(name = "sparse")
    protected Boolean sparse;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the syncToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncToken() {
        return syncToken;
    }

    /**
     * Sets the value of the syncToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncToken(String value) {
        this.syncToken = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationMetaData }
     *     
     */
    public ModificationMetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationMetaData }
     *     
     */
    public void setMetaData(ModificationMetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the customField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomField>();
        }
        return this.customField;
    }

    /**
     * Gets the value of the attachableRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachableRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachableRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachableRef }
     * 
     * 
     */
    public List<AttachableRef> getAttachableRef() {
        if (attachableRef == null) {
            attachableRef = new ArrayList<AttachableRef>();
        }
        return this.attachableRef;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatusEnum }
     *     
     */
    public EntityStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatusEnum }
     *     
     */
    public void setStatus(EntityStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the sparse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSparse() {
        return sparse;
    }

    /**
     * Sets the value of the sparse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSparse(Boolean value) {
        this.sparse = value;
    }

    /**
     * Sets the value of the customField property.
     * 
     * @param customField
     *     allowed object is
     *     {@link CustomField }
     *     
     */
    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    /**
     * Sets the value of the attachableRef property.
     * 
     * @param attachableRef
     *     allowed object is
     *     {@link AttachableRef }
     *     
     */
    public void setAttachableRef(List<AttachableRef> attachableRef) {
        this.attachableRef = attachableRef;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IntuitEntity)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IntuitEntity that = ((IntuitEntity) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsSyncToken;
            lhsSyncToken = this.getSyncToken();
            String rhsSyncToken;
            rhsSyncToken = that.getSyncToken();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncToken", lhsSyncToken), LocatorUtils.property(thatLocator, "syncToken", rhsSyncToken), lhsSyncToken, rhsSyncToken)) {
                return false;
            }
        }
        {
            ModificationMetaData lhsMetaData;
            lhsMetaData = this.getMetaData();
            ModificationMetaData rhsMetaData;
            rhsMetaData = that.getMetaData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metaData", lhsMetaData), LocatorUtils.property(thatLocator, "metaData", rhsMetaData), lhsMetaData, rhsMetaData)) {
                return false;
            }
        }
        {
            List<CustomField> lhsCustomField;
            lhsCustomField = (((this.customField!= null)&&(!this.customField.isEmpty()))?this.getCustomField():null);
            List<CustomField> rhsCustomField;
            rhsCustomField = (((that.customField!= null)&&(!that.customField.isEmpty()))?that.getCustomField():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customField", lhsCustomField), LocatorUtils.property(thatLocator, "customField", rhsCustomField), lhsCustomField, rhsCustomField)) {
                return false;
            }
        }
        {
            List<AttachableRef> lhsAttachableRef;
            lhsAttachableRef = (((this.attachableRef!= null)&&(!this.attachableRef.isEmpty()))?this.getAttachableRef():null);
            List<AttachableRef> rhsAttachableRef;
            rhsAttachableRef = (((that.attachableRef!= null)&&(!that.attachableRef.isEmpty()))?that.getAttachableRef():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachableRef", lhsAttachableRef), LocatorUtils.property(thatLocator, "attachableRef", rhsAttachableRef), lhsAttachableRef, rhsAttachableRef)) {
                return false;
            }
        }
        {
            String lhsDomain;
            lhsDomain = this.getDomain();
            String rhsDomain;
            rhsDomain = that.getDomain();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domain", lhsDomain), LocatorUtils.property(thatLocator, "domain", rhsDomain), lhsDomain, rhsDomain)) {
                return false;
            }
        }
        {
            EntityStatusEnum lhsStatus;
            lhsStatus = this.getStatus();
            EntityStatusEnum rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            Boolean lhsSparse;
            lhsSparse = this.isSparse();
            Boolean rhsSparse;
            rhsSparse = that.isSparse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sparse", lhsSparse), LocatorUtils.property(thatLocator, "sparse", rhsSparse), lhsSparse, rhsSparse)) {
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
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theSyncToken;
            theSyncToken = this.getSyncToken();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncToken", theSyncToken), currentHashCode, theSyncToken);
        }
        {
            ModificationMetaData theMetaData;
            theMetaData = this.getMetaData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metaData", theMetaData), currentHashCode, theMetaData);
        }
        {
            List<CustomField> theCustomField;
            theCustomField = (((this.customField!= null)&&(!this.customField.isEmpty()))?this.getCustomField():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customField", theCustomField), currentHashCode, theCustomField);
        }
        {
            List<AttachableRef> theAttachableRef;
            theAttachableRef = (((this.attachableRef!= null)&&(!this.attachableRef.isEmpty()))?this.getAttachableRef():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachableRef", theAttachableRef), currentHashCode, theAttachableRef);
        }
        {
            String theDomain;
            theDomain = this.getDomain();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domain", theDomain), currentHashCode, theDomain);
        }
        {
            EntityStatusEnum theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            Boolean theSparse;
            theSparse = this.isSparse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sparse", theSparse), currentHashCode, theSparse);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

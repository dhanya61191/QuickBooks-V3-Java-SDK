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
 * <p>Java class for TxnTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TxnTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APCreditCard"/>
 *     &lt;enumeration value="ARRefundCreditCard"/>
 *     &lt;enumeration value="Bill"/>
 *     &lt;enumeration value="BillPaymentCheck"/>
 *     &lt;enumeration value="BuildAssembly"/>
 *     &lt;enumeration value="CarryOver"/>
 *     &lt;enumeration value="CashPurchase"/>
 *     &lt;enumeration value="Charge"/>
 *     &lt;enumeration value="Check"/>
 *     &lt;enumeration value="CreditMemo"/>
 *     &lt;enumeration value="Deposit"/>
 *     &lt;enumeration value="EFPLiabilityCheck"/>
 *     &lt;enumeration value="EFTBillPayment"/>
 *     &lt;enumeration value="EFTRefund"/>
 *     &lt;enumeration value="Estimate"/>
 *     &lt;enumeration value="InventoryAdjustment"/>
 *     &lt;enumeration value="InventoryTransfer"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="ItemReceipt"/>
 *     &lt;enumeration value="JournalEntry"/>
 *     &lt;enumeration value="LiabilityAdjustment"/>
 *     &lt;enumeration value="Paycheck"/>
 *     &lt;enumeration value="PayrollLiabilityCheck"/>
 *     &lt;enumeration value="PurchaseOrder"/>
 *     &lt;enumeration value="PriorPayment"/>
 *     &lt;enumeration value="ReceivePayment"/>
 *     &lt;enumeration value="RefundCheck"/>
 *     &lt;enumeration value="SalesOrder"/>
 *     &lt;enumeration value="SalesReceipt"/>
 *     &lt;enumeration value="SalesTaxPaymentCheck"/>
 *     &lt;enumeration value="Transfer"/>
 *     &lt;enumeration value="TimeActivity"/>
 *     &lt;enumeration value="VendorCredit"/>
 *     &lt;enumeration value="YTDAdjustment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TxnTypeEnum")
@XmlEnum
public enum TxnTypeEnum {

    @XmlEnumValue("APCreditCard")
    AP_CREDIT_CARD("APCreditCard"),
    @XmlEnumValue("ARRefundCreditCard")
    AR_REFUND_CREDIT_CARD("ARRefundCreditCard"),
    @XmlEnumValue("Bill")
    BILL("Bill"),
    @XmlEnumValue("BillPaymentCheck")
    BILL_PAYMENT_CHECK("BillPaymentCheck"),
    @XmlEnumValue("BuildAssembly")
    BUILD_ASSEMBLY("BuildAssembly"),
    @XmlEnumValue("CarryOver")
    CARRY_OVER("CarryOver"),
    @XmlEnumValue("CashPurchase")
    CASH_PURCHASE("CashPurchase"),
    @XmlEnumValue("Charge")
    CHARGE("Charge"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("CreditMemo")
    CREDIT_MEMO("CreditMemo"),
    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("EFPLiabilityCheck")
    EFP_LIABILITY_CHECK("EFPLiabilityCheck"),
    @XmlEnumValue("EFTBillPayment")
    EFT_BILL_PAYMENT("EFTBillPayment"),
    @XmlEnumValue("EFTRefund")
    EFT_REFUND("EFTRefund"),
    @XmlEnumValue("Estimate")
    ESTIMATE("Estimate"),
    @XmlEnumValue("InventoryAdjustment")
    INVENTORY_ADJUSTMENT("InventoryAdjustment"),
    @XmlEnumValue("InventoryTransfer")
    INVENTORY_TRANSFER("InventoryTransfer"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("ItemReceipt")
    ITEM_RECEIPT("ItemReceipt"),
    @XmlEnumValue("JournalEntry")
    JOURNAL_ENTRY("JournalEntry"),
    @XmlEnumValue("LiabilityAdjustment")
    LIABILITY_ADJUSTMENT("LiabilityAdjustment"),
    @XmlEnumValue("Paycheck")
    PAYCHECK("Paycheck"),
    @XmlEnumValue("PayrollLiabilityCheck")
    PAYROLL_LIABILITY_CHECK("PayrollLiabilityCheck"),
    @XmlEnumValue("PurchaseOrder")
    PURCHASE_ORDER("PurchaseOrder"),
    @XmlEnumValue("PriorPayment")
    PRIOR_PAYMENT("PriorPayment"),
    @XmlEnumValue("ReceivePayment")
    RECEIVE_PAYMENT("ReceivePayment"),
    @XmlEnumValue("RefundCheck")
    REFUND_CHECK("RefundCheck"),
    @XmlEnumValue("SalesOrder")
    SALES_ORDER("SalesOrder"),
    @XmlEnumValue("SalesReceipt")
    SALES_RECEIPT("SalesReceipt"),
    @XmlEnumValue("SalesTaxPaymentCheck")
    SALES_TAX_PAYMENT_CHECK("SalesTaxPaymentCheck"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("TimeActivity")
    TIME_ACTIVITY("TimeActivity"),
    @XmlEnumValue("VendorCredit")
    VENDOR_CREDIT("VendorCredit"),
    @XmlEnumValue("YTDAdjustment")
    YTD_ADJUSTMENT("YTDAdjustment");
    private final String value;

    TxnTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TxnTypeEnum fromValue(String v) {
        for (TxnTypeEnum c: TxnTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

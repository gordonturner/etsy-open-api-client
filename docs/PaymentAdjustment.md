

# PaymentAdjustment

Represents a refund, which applies to a prior Etsy payment. All monetary amounts are in USD pennies unless otherwise specified.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentAdjustmentId** | **Long** | The numeric ID for a payment adjustment. |  [optional]
**paymentId** | **Long** | A unique numeric ID for a payment to a specific Etsy [shop](/documentation/reference#tag/Shop). |  [optional]
**status** | **String** | The status string of the payment adjustment. |  [optional]
**isSuccess** | **Boolean** | When true, the payment adjustment was or is likely to complete successfully. |  [optional]
**userId** | **Long** | The numeric ID for the [user](/documentation/reference#tag/User) (seller) fulfilling the purchase. |  [optional]
**reasonCode** | **String** | A human-readable string describing the reason for the refund. |  [optional]
**totalAdjustmentAmount** | **Long** | The total numeric amount of the refund in the payment currency. |  [optional]
**shopTotalAdjustmentAmount** | **Long** | The numeric amount of the refund in the shop currency. |  [optional]
**buyerTotalAdjustmentAmount** | **Long** | The numeric amount of the refund in the buyer currency. |  [optional]
**totalFeeAdjustmentAmount** | **Long** | The numeric amount of card processing fees associated with a payment adjustment. |  [optional]
**createTimestamp** | **Long** | The transaction\\&#39;s creation date and time, in epoch seconds. |  [optional]
**createdTimestamp** | **Long** | The transaction\\&#39;s creation date and time, in epoch seconds. |  [optional]
**updateTimestamp** | **Long** | The date and time of the last change to the payment adjustment in epoch seconds. |  [optional]
**updatedTimestamp** | **Long** | The date and time of the last change to the payment adjustment in epoch seconds. |  [optional]
**paymentAdjustmentItems** | [**List&lt;PaymentAdjustmentItem&gt;**](PaymentAdjustmentItem.md) | List of payment adjustment line items. |  [optional]




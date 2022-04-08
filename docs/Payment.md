

# Payment

Represents a payment made with Etsy Payments. All monetary amounts are in USD pennies unless otherwise specified.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentId** | **Integer** | A unique numeric ID for a payment to a specific Etsy [shop](/documentation/reference#tag/Shop). | 
**buyerUserId** | **Integer** | The numeric ID for the [user](/documentation/reference#tag/User) who paid the purchase. | 
**shopId** | **Integer** | The unique positive non-zero numeric ID for an Etsy Shop. | 
**receiptId** | **Integer** | The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. | 
**amountGross** | [**Money**](Money.md) | An integer equal to gross amount of the order, in pennies, including shipping and taxes. | 
**amountFees** | [**Money**](Money.md) | An integer equal to the original card processing fee of the order in pennies. | 
**amountNet** | [**Money**](Money.md) | An integer equal to the payment value, in pennies, less fees (&#x60;amount_gross&#x60; - &#x60;amount_fees&#x60;). | 
**postedGross** | [**Money**](Money.md) | The total gross value of the payment posted once the purchase ships. This is equal to the &#x60;amount_gross&#x60; UNLESS the seller issues a refund prior to shipping. We consider \&quot;shipping\&quot; to the event which \&quot;posts\&quot; to the ledger. Therefore, if the seller refunds first, we reduce the &#x60;amount_gross&#x60; first and post then that amount. The seller never sees the refunded amount in their ledger. This is equal to the \&quot;Credit\&quot; amount in the ledger entry. |  [optional]
**postedFees** | [**Money**](Money.md) | The total value of the fees posted once the purchase ships. Etsy refunds a proportional amount of the fees when a seller refunds a buyer. When the seller issues a refund prior to shipping, the posted amount is less then the original. |  [optional]
**postedNet** | [**Money**](Money.md) | The total value of the payment at the time of posting, less fees. (&#x60;posted_gross&#x60; - &#x60;posted_fees&#x60;) |  [optional]
**adjustedGross** | [**Money**](Money.md) | The gross payment amount after the seller refunds a payment, partially or fully. |  [optional]
**adjustedFees** | [**Money**](Money.md) | The new fee amount after a seller refunds a payment, partially or fully. |  [optional]
**adjustedNet** | [**Money**](Money.md) | The total value of the payment after refunds, less fees (&#x60;adjusted_gross&#x60; - &#x60;adjusted_fees&#x60;). |  [optional]
**currency** | **String** | The ISO (alphabetic) code string for the payment&#39;s currency. | 
**shopCurrency** | **String** | The ISO (alphabetic) code for the shop&#39;s currency. The shop displays all prices in this currency by default. | 
**buyerCurrency** | **String** | The currency string of the buyer. | 
**shippingUserId** | **Integer** | The numeric ID of the user to which the seller ships the order. | 
**shippingAddressId** | **Integer** | The numeric id identifying the shipping address. | 
**billingAddressId** | **Integer** | The numeric ID identifying the billing address of the buyer. | 
**status** | **String** | A string indicating the current status of the payment, most commonly \&quot;settled\&quot; or \&quot;authed\&quot;. | 
**shippedTimestamp** | **Integer** | The transaction\\&#39;s shipping date and time, in epoch seconds. | 
**createTimestamp** | **Integer** | The transaction\\&#39;s creation date and time, in epoch seconds. | 
**updateTimestamp** | **Integer** | The date and time of the last change to the payment adjustment in epoch seconds. | 
**paymentAdjustments** | [**List&lt;PaymentAdjustment&gt;**](PaymentAdjustment.md) | List of refund objects on an Etsy Payments transaction. All monetary amounts are in USD pennies unless otherwise specified. | 




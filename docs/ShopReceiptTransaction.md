

# ShopReceiptTransaction

A transaction object associated with a shop receipt. Etsy generates one transaction per listing purchased as recorded on the order receipt.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **Integer** | The unique numeric ID for a transaction. | 
**title** | **String** | The title string of the [listing](/documentation/reference#tag/ShopListing) purchased in this transaction. | 
**description** | **String** | The description string of the [listing](/documentation/reference#tag/ShopListing) purchased in this transaction. | 
**sellerUserId** | **Integer** | The numeric user ID for the seller in this transaction. | 
**buyerUserId** | **Integer** | The numeric user ID for the buyer in this transaction. | 
**createTimestamp** | **Integer** | The transaction\\&#39;s creation date and time, in epoch seconds. | 
**paidTimestamp** | **Integer** | The transaction\\&#39;s paid date and time, in epoch seconds. | 
**shippedTimestamp** | **Integer** | The transaction\\&#39;s shipping date and time, in epoch seconds. | 
**quantity** | **Integer** | The numeric quantity of products purchased in this transaction. | 
**listingImageId** | **Integer** | The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction. | 
**receiptId** | **Integer** | The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. | 
**isDigital** | **Boolean** | When true, the transaction recorded the purchase of a digital listing. | 
**fileData** | **String** | A string describing the files purchased in this transaction. | 
**listingId** | **Integer** | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. | 
**transactionType** | **String** | The type string for the transaction, usually \&quot;listing\&quot; | 
**productId** | **Integer** | The numeric ID for a specific [product](/documentation/reference#tag/ShopListing-Product) purchased from a listing. | 
**sku** | **String** | The SKU string for the product | 
**price** | [**Money**](Money.md) | A money object representing the price recorded the transaction. | 
**shippingCost** | [**Money**](Money.md) | A money object representing the shipping cost for this transaction. | 
**variations** | [**List&lt;TransactionVariations&gt;**](TransactionVariations.md) | Array of variations and personalizations the buyer chose. | 
**shippingProfileId** | **Integer** | The ID of the shipping profile selected for this listing. | 
**minProcessingDays** | **Integer** | The minimum number of days for processing the listing. | 
**maxProcessingDays** | **Integer** | The maximum number of days for processing the listing. | 
**shippingMethod** | **String** | Name of the selected shipping method. | 
**shippingUpgrade** | **String** | The name of the shipping upgrade selected for this listing. Default value is null. | 
**expectedShipDate** | **Integer** | The date &amp; time of the expected ship date, in epoch seconds. | 




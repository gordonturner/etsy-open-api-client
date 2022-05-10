

# InlineObject3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**products** | [**List&lt;V3ApplicationListingsListingIdInventoryProducts&gt;**](V3ApplicationListingsListingIdInventoryProducts.md) | A JSON array of products available in a listing, even if only one product. All field names in the JSON blobs are lowercase. | 
**priceOnProperty** | **List&lt;Long&gt;** | An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change product prices, if any. For example, if you charge specific prices for different sized products in the same listing, then this array contains the property ID for size. |  [optional]
**quantityOnProperty** | **List&lt;Long&gt;** | An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change the quantity of the products, if any. For example, if you stock specific quantities of different colored products in the same listing, then this array contains the property ID for color. |  [optional]
**skuOnProperty** | **List&lt;Long&gt;** | An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change the product SKU, if any. For example, if you use specific skus for different colored products in the same listing, then this array contains the property ID for color. |  [optional]






# V3ApplicationListingsListingIdInventoryPropertyValues


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyId** | **Integer** | The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties). | 
**valueIds** | **List&lt;Integer&gt;** | An array of unique IDs of multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different sizes of a product, then the value ID list contains value IDs for each size. | 
**scaleId** | **Integer** | The numeric ID of a single Etsy.com measurement scale. For example, for shoe size, there are three &#x60;scale_id&#x60;s available - *UK*, *US/Canada*, and *EU*, where *US/Canada* has &#x60;scale_id&#x60; 19. |  [optional]
**propertyName** | **String** | The name of the property, in the requested locale language. |  [optional]
**values** | **List&lt;String&gt;** | A list of property value entries for this product. | 




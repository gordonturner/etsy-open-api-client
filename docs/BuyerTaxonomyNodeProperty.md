

# BuyerTaxonomyNodeProperty

A product property definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyId** | **Long** | The unique numeric ID of this product property. |  [optional]
**name** | **String** | The name string for this taxonomy node. |  [optional]
**displayName** | **String** | The human-readable product property name string. |  [optional]
**scales** | [**List&lt;BuyerTaxonomyPropertyScale&gt;**](BuyerTaxonomyPropertyScale.md) | A list of available scales. |  [optional]
**isRequired** | **Boolean** | When true, listings assigned eligible taxonomy IDs require this property. |  [optional]
**supportsAttributes** | **Boolean** | When true, you can use this property in listing attributes. |  [optional]
**supportsVariations** | **Boolean** | When true, you can use this property in listing variations. |  [optional]
**isMultivalued** | **Boolean** | When true, you can assign multiple property values to this property |  [optional]
**maxValuesAllowed** | **Long** | When true, you can assign multiple property values to this property |  [optional]
**possibleValues** | [**List&lt;BuyerTaxonomyPropertyValue&gt;**](BuyerTaxonomyPropertyValue.md) | A list of supported property value strings for this property. |  [optional]
**selectedValues** | [**List&lt;BuyerTaxonomyPropertyValue&gt;**](BuyerTaxonomyPropertyValue.md) | A list of property value strings automatically and always selected for the given property. |  [optional]




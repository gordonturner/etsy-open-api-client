

# TaxonomyNodeProperty

A product property definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyId** | **Long** | The unique numeric ID of this product property. | 
**name** | **String** | The name string for this taxonomy node. | 
**displayName** | **String** | The human-readable product property name string. | 
**scales** | [**List&lt;TaxonomyPropertyScale&gt;**](TaxonomyPropertyScale.md) | A list of available scales. | 
**isRequired** | **Boolean** | When true, listings assigned eligible taxonomy IDs require this property. | 
**supportsAttributes** | **Boolean** | When true, you can use this property in listing attributes. | 
**supportsVariations** | **Boolean** | When true, you can use this property in listing variations. | 
**isMultivalued** | **Boolean** | When true, you can assign multiple property values to this property | 
**possibleValues** | [**List&lt;TaxonomyPropertyValue&gt;**](TaxonomyPropertyValue.md) | A list of supported property value strings for this property. | 
**selectedValues** | [**List&lt;TaxonomyPropertyValue&gt;**](TaxonomyPropertyValue.md) | A list of property value strings automatically and always selected for the given property. | 




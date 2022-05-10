

# ShopShippingProfileDestination

Represents a shipping destination assigned to a shipping profile.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shippingProfileDestinationId** | **Long** | The numeric ID of the shipping profile destination in the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. | 
**shippingProfileId** | **Long** | The numeric ID of the shipping profile. | 
**originCountryIso** | **String** | The ISO code of the country from which the listing ships. | 
**destinationCountryIso** | **String** | The ISO code of the country to which the listing ships. If null, request sets destination to destination_region. Required if destination_region is null or not provided. | 
**destinationRegion** | [**DestinationRegionEnum**](#DestinationRegionEnum) | The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If \\&#x60;none\\&#x60;, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided. | 
**primaryCost** | [**Money**](Money.md) | The cost of shipping to this country/region alone, measured in the store&#39;s default currency. | 
**secondaryCost** | [**Money**](Money.md) | The cost of shipping to this country/region with another item, measured in the store&#39;s default currency. | 
**shippingCarrierId** | **Long** | The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with &#x60;mail_class&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | 
**mailClass** | **String** | The unique ID string of a shipping carrier&#39;s mail class, which is used to calculate an estimated delivery date. **Required with &#x60;shipping_carrier_id&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | 
**minDeliveryDays** | **Long** | The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;max_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | 
**maxDeliveryDays** | **Long** | The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;min_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | 



## Enum: DestinationRegionEnum

Name | Value
---- | -----
EU | &quot;eu&quot;
NON_EU | &quot;non_eu&quot;
NONE | &quot;none&quot;




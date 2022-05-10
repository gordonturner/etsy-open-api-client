

# ShopShippingProfile

Represents a profile used to set a listing's shipping information. Please note that it's not possible to create calculated shipping templates via the API. However, you can associate calculated shipping profiles created from Shop Manager with listings using the API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shippingProfileId** | **Long** | The numeric ID of the shipping profile. | 
**title** | **String** | The name string of this shipping profile. | 
**userId** | **Long** | The numeric ID for the [user](/documentation/reference#tag/User) who owns the shipping profile. | 
**minProcessingDays** | **Long** | The minimum number of days for processing the listing. | 
**maxProcessingDays** | **Long** | The maximum number of days for processing the listing. | 
**processingDaysDisplayLabel** | **String** | Translated display label string for processing days. | 
**originCountryIso** | **String** | The ISO code of the country from which the listing ships. | 
**isDeleted** | **Boolean** | When true, someone deleted this shipping profile. | 
**shippingProfileDestinations** | [**List&lt;ShopShippingProfileDestination&gt;**](ShopShippingProfileDestination.md) | A list of [shipping profile destinations](/documentation/reference#operation/createListingShippingProfileDestination) available for this shipping profile. | 
**shippingProfileUpgrades** | [**List&lt;ShopShippingProfileUpgrade&gt;**](ShopShippingProfileUpgrade.md) | A list of [shipping profile upgrades](/documentation/reference#operation/createListingShippingProfileUpgrade) available for this shipping profile. | 
**originPostalCode** | **String** | The postal code string (not necessarily a number) for the location from which the listing ships. Required if the &#x60;origin_country_iso&#x60; is &#x60;US&#x60; or &#x60;CA&#x60;. | 
**profileType** | [**ProfileTypeEnum**](#ProfileTypeEnum) |  |  [optional]
**domesticHandlingFee** | **Float** | The domestic handling fee added to buyer&#39;s shipping total - only available for calculated shipping profiles. |  [optional]
**internationalHandlingFee** | **Float** | The international handling fee added to buyer&#39;s shipping total - only available for calculated shipping profiles. |  [optional]



## Enum: ProfileTypeEnum

Name | Value
---- | -----
MANUAL | &quot;manual&quot;
CALCULATED | &quot;calculated&quot;




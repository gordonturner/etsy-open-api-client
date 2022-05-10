# ShopShippingProfileApi

All URIs are relative to *https://openapi.etsy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createShopShippingProfile**](ShopShippingProfileApi.md#createShopShippingProfile) | **POST** /v3/application/shops/{shop_id}/shipping-profiles | 
[**createShopShippingProfileDestination**](ShopShippingProfileApi.md#createShopShippingProfileDestination) | **POST** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/destinations | 
[**createShopShippingProfileUpgrade**](ShopShippingProfileApi.md#createShopShippingProfileUpgrade) | **POST** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/upgrades | 
[**deleteShopShippingProfile**](ShopShippingProfileApi.md#deleteShopShippingProfile) | **DELETE** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id} | 
[**deleteShopShippingProfileDestination**](ShopShippingProfileApi.md#deleteShopShippingProfileDestination) | **DELETE** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/destinations/{shipping_profile_destination_id} | 
[**deleteShopShippingProfileUpgrade**](ShopShippingProfileApi.md#deleteShopShippingProfileUpgrade) | **DELETE** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/upgrades/{upgrade_id} | 
[**getShippingCarriers**](ShopShippingProfileApi.md#getShippingCarriers) | **GET** /v3/application/shipping-carriers | 
[**getShopShippingProfile**](ShopShippingProfileApi.md#getShopShippingProfile) | **GET** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id} | 
[**getShopShippingProfileDestinationsByShippingProfile**](ShopShippingProfileApi.md#getShopShippingProfileDestinationsByShippingProfile) | **GET** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/destinations | 
[**getShopShippingProfileUpgrades**](ShopShippingProfileApi.md#getShopShippingProfileUpgrades) | **GET** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/upgrades | 
[**getShopShippingProfiles**](ShopShippingProfileApi.md#getShopShippingProfiles) | **GET** /v3/application/shops/{shop_id}/shipping-profiles | 
[**updateShopShippingProfile**](ShopShippingProfileApi.md#updateShopShippingProfile) | **PUT** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id} | 
[**updateShopShippingProfileDestination**](ShopShippingProfileApi.md#updateShopShippingProfileDestination) | **PUT** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/destinations/{shipping_profile_destination_id} | 
[**updateShopShippingProfileUpgrade**](ShopShippingProfileApi.md#updateShopShippingProfileUpgrade) | **PUT** /v3/application/shops/{shop_id}/shipping-profiles/{shipping_profile_id}/upgrades/{upgrade_id} | 


<a name="createShopShippingProfile"></a>
# **createShopShippingProfile**
> ShopShippingProfile createShopShippingProfile(shopId, title, originCountryIso, primaryCost, secondaryCost, minProcessingTime, maxProcessingTime, processingTimeUnit, destinationCountryIso, destinationRegion, originPostalCode, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates a new ShippingProfile. You can pass a country iso code or a region when creating a ShippingProfile, but not both. Only one is required. You must pass either a shipping_carrier_id AND mail_class, or both min and max_delivery_days.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    String title = "title_example"; // String | The name string of this shipping profile.
    String originCountryIso = "originCountryIso_example"; // String | The ISO code of the country from which the listing ships.
    Float primaryCost = 3.4F; // Float | The cost of shipping to this country/region alone, measured in the store's default currency.
    Float secondaryCost = 3.4F; // Float | The cost of shipping to this country/region with another item, measured in the store's default currency.
    Long minProcessingTime = 56L; // Long | The minimum time required to process to ship listings with this shipping profile.
    Long maxProcessingTime = 56L; // Long | The maximum processing time the listing needs to ship.
    String processingTimeUnit = "business_days"; // String | The unit used to represent how long a processing time is. A week is equivalent to 5 business days. If none is provided, the unit is set to \\\"business_days\\\".
    String destinationCountryIso = "\"null\""; // String | The ISO code of the country to which the listing ships. If null, request sets destination to destination_region. Required if destination_region is null or not provided.
    String destinationRegion = "eu"; // String | The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If `none`, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided.
    String originPostalCode = "\"\""; // String | The postal code string (not necessarily a number) for the location from which the listing ships. Required if the `origin_country_iso` is `US` or `CA`.
    Long shippingCarrierId = 0L; // Long | The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with `mail_class`** if `min_delivery_days` and `max_delivery_days` are null.
    String mailClass = "\"null\""; // String | The unique ID string of a shipping carrier's mail class, which is used to calculate an estimated delivery date. **Required with `shipping_carrier_id`** if `min_delivery_days` and `max_delivery_days` are null.
    Long minDeliveryDays = 56L; // Long | The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `max_delivery_days`** if `mail_class` is null.
    Long maxDeliveryDays = 56L; // Long | The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `min_delivery_days`** if `mail_class` is null.
    try {
      ShopShippingProfile result = apiInstance.createShopShippingProfile(shopId, title, originCountryIso, primaryCost, secondaryCost, minProcessingTime, maxProcessingTime, processingTimeUnit, destinationCountryIso, destinationRegion, originPostalCode, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#createShopShippingProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **title** | **String**| The name string of this shipping profile. |
 **originCountryIso** | **String**| The ISO code of the country from which the listing ships. |
 **primaryCost** | **Float**| The cost of shipping to this country/region alone, measured in the store&#39;s default currency. |
 **secondaryCost** | **Float**| The cost of shipping to this country/region with another item, measured in the store&#39;s default currency. |
 **minProcessingTime** | **Long**| The minimum time required to process to ship listings with this shipping profile. |
 **maxProcessingTime** | **Long**| The maximum processing time the listing needs to ship. |
 **processingTimeUnit** | **String**| The unit used to represent how long a processing time is. A week is equivalent to 5 business days. If none is provided, the unit is set to \\\&quot;business_days\\\&quot;. | [optional] [default to business_days] [enum: business_days, weeks]
 **destinationCountryIso** | **String**| The ISO code of the country to which the listing ships. If null, request sets destination to destination_region. Required if destination_region is null or not provided. | [optional] [default to &quot;null&quot;]
 **destinationRegion** | **String**| The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If &#x60;none&#x60;, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided. | [optional] [default to none] [enum: eu, non_eu, none]
 **originPostalCode** | **String**| The postal code string (not necessarily a number) for the location from which the listing ships. Required if the &#x60;origin_country_iso&#x60; is &#x60;US&#x60; or &#x60;CA&#x60;. | [optional] [default to &quot;&quot;]
 **shippingCarrierId** | **Long**| The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with &#x60;mail_class&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional] [default to 0]
 **mailClass** | **String**| The unique ID string of a shipping carrier&#39;s mail class, which is used to calculate an estimated delivery date. **Required with &#x60;shipping_carrier_id&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional] [default to &quot;null&quot;]
 **minDeliveryDays** | **Long**| The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;max_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]
 **maxDeliveryDays** | **Long**| The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;min_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]

### Return type

[**ShopShippingProfile**](ShopShippingProfile.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ShippingProfile |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="createShopShippingProfileDestination"></a>
# **createShopShippingProfileDestination**
> ShopShippingProfileDestination createShopShippingProfileDestination(shopId, shippingProfileId, primaryCost, secondaryCost, destinationCountryIso, destinationRegion, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates a new shipping destination, which sets the shipping cost, carrier, and class for a destination in a [shipping profile](/documentation/reference/#tag/Shop-ShippingProfile). createShopShippingProfileDestination assigns costs using the currency of the associated shop. Set the destination using either &#x60;destination_country_iso&#x60; or &#x60;destination_region&#x60;; &#x60;destination_country_iso&#x60; and &#x60;destination_region&#x60; are mutually exclusive — set one or the other. Setting both triggers error 400. If the request sets neither &#x60;destination_country_iso&#x60; nor &#x60;destination_region&#x60;, the default destination is \&quot;everywhere\&quot;. You must also either assign both a &#x60;shipping_carrier_id&#x60; AND &#x60;mail_class&#x60; or both &#x60;min_delivery_days&#x60; AND &#x60;max_delivery_days&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    Float primaryCost = 3.4F; // Float | The cost of shipping to this country/region alone, measured in the store's default currency.
    Float secondaryCost = 3.4F; // Float | The cost of shipping to this country/region with another item, measured in the store's default currency.
    String destinationCountryIso = "\"null\""; // String | The ISO code of the country to which the listing ships. If null, request sets destination to destination_region. Required if destination_region is null or not provided.
    String destinationRegion = "eu"; // String | The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If `none`, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided.
    Long shippingCarrierId = 0L; // Long | The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with `mail_class`** if `min_delivery_days` and `max_delivery_days` are null.
    String mailClass = "\"null\""; // String | The unique ID string of a shipping carrier's mail class, which is used to calculate an estimated delivery date. **Required with `shipping_carrier_id`** if `min_delivery_days` and `max_delivery_days` are null.
    Long minDeliveryDays = 56L; // Long | The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `max_delivery_days`** if `mail_class` is null.
    Long maxDeliveryDays = 56L; // Long | The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `min_delivery_days`** if `mail_class` is null.
    try {
      ShopShippingProfileDestination result = apiInstance.createShopShippingProfileDestination(shopId, shippingProfileId, primaryCost, secondaryCost, destinationCountryIso, destinationRegion, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#createShopShippingProfileDestination");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |
 **primaryCost** | **Float**| The cost of shipping to this country/region alone, measured in the store&#39;s default currency. |
 **secondaryCost** | **Float**| The cost of shipping to this country/region with another item, measured in the store&#39;s default currency. |
 **destinationCountryIso** | **String**| The ISO code of the country to which the listing ships. If null, request sets destination to destination_region. Required if destination_region is null or not provided. | [optional] [default to &quot;null&quot;]
 **destinationRegion** | **String**| The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If &#x60;none&#x60;, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided. | [optional] [default to DestinationRegionEnum.NONE] [enum: eu, non_eu, none]
 **shippingCarrierId** | **Long**| The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with &#x60;mail_class&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional] [default to 0]
 **mailClass** | **String**| The unique ID string of a shipping carrier&#39;s mail class, which is used to calculate an estimated delivery date. **Required with &#x60;shipping_carrier_id&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional] [default to &quot;null&quot;]
 **minDeliveryDays** | **Long**| The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;max_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]
 **maxDeliveryDays** | **Long**| The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;min_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]

### Return type

[**ShopShippingProfileDestination**](ShopShippingProfileDestination.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A single shipping destination. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="createShopShippingProfileUpgrade"></a>
# **createShopShippingProfileUpgrade**
> ShopShippingProfileUpgrade createShopShippingProfileUpgrade(shopId, shippingProfileId, type, upgradeName, price, secondaryPrice, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates a new shipping profile upgrade, which can establish a price for a shipping option, such as an alternate carrier or faster delivery.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    String type = "0"; // String | The type of the shipping upgrade. Domestic (0) or international (1).
    String upgradeName = "upgradeName_example"; // String | Name for the shipping upgrade shown to shoppers at checkout, e.g. USPS Priority.
    Float price = 3.4F; // Float | Additional cost of adding the shipping upgrade.
    Float secondaryPrice = 3.4F; // Float | Additional cost of adding the shipping upgrade for each additional item.
    Long shippingCarrierId = 0L; // Long | The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with `mail_class`** if `min_delivery_days` and `max_delivery_days` are null.
    String mailClass = "\"null\""; // String | The unique ID string of a shipping carrier's mail class, which is used to calculate an estimated delivery date. **Required with `shipping_carrier_id`** if `min_delivery_days` and `max_delivery_days` are null.
    Long minDeliveryDays = 56L; // Long | The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `max_delivery_days`** if `mail_class` is null.
    Long maxDeliveryDays = 56L; // Long | The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `min_delivery_days`** if `mail_class` is null.
    try {
      ShopShippingProfileUpgrade result = apiInstance.createShopShippingProfileUpgrade(shopId, shippingProfileId, type, upgradeName, price, secondaryPrice, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#createShopShippingProfileUpgrade");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |
 **type** | **String**| The type of the shipping upgrade. Domestic (0) or international (1). | [enum: 0, 1]
 **upgradeName** | **String**| Name for the shipping upgrade shown to shoppers at checkout, e.g. USPS Priority. |
 **price** | **Float**| Additional cost of adding the shipping upgrade. |
 **secondaryPrice** | **Float**| Additional cost of adding the shipping upgrade for each additional item. |
 **shippingCarrierId** | **Long**| The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with &#x60;mail_class&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional] [default to 0]
 **mailClass** | **String**| The unique ID string of a shipping carrier&#39;s mail class, which is used to calculate an estimated delivery date. **Required with &#x60;shipping_carrier_id&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional] [default to &quot;null&quot;]
 **minDeliveryDays** | **Long**| The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;max_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]
 **maxDeliveryDays** | **Long**| The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;min_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]

### Return type

[**ShopShippingProfileUpgrade**](ShopShippingProfileUpgrade.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single shipping profile upgrade. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="deleteShopShippingProfile"></a>
# **deleteShopShippingProfile**
> deleteShopShippingProfile(shopId, shippingProfileId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Deletes a ShippingProfile by given id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    try {
      apiInstance.deleteShopShippingProfile(shopId, shippingProfileId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#deleteShopShippingProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**204** | The ShopShippingProfile resource was correctly deleted |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="deleteShopShippingProfileDestination"></a>
# **deleteShopShippingProfileDestination**
> deleteShopShippingProfileDestination(shopId, shippingProfileId, shippingProfileDestinationId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Deletes a shipping destination and removes the destination option from every listing that uses the associated shipping profile. A shipping profile requires at least one shipping destination, so this endpoint cannot delete the final shipping destination for any shipping profile. To delete the final shipping destination from a shipping profile, you must [delete the entire shipping profile](/documentation/reference/#operation/deleteShopShippingProfile).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    Long shippingProfileDestinationId = 56L; // Long | The numeric ID of the shipping profile destination in the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing.
    try {
      apiInstance.deleteShopShippingProfileDestination(shopId, shippingProfileId, shippingProfileDestinationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#deleteShopShippingProfileDestination");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |
 **shippingProfileDestinationId** | **Long**| The numeric ID of the shipping profile destination in the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Etsy deleted the shipping profile destination. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="deleteShopShippingProfileUpgrade"></a>
# **deleteShopShippingProfileUpgrade**
> deleteShopShippingProfileUpgrade(shopId, shippingProfileId, upgradeId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Deletes a shipping profile upgrade and removes the upgrade option from every listing that uses the associated shipping profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the shipping profile.
    Long upgradeId = 56L; // Long | The numeric ID that is associated with a shipping upgrade
    try {
      apiInstance.deleteShopShippingProfileUpgrade(shopId, shippingProfileId, upgradeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#deleteShopShippingProfileUpgrade");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the shipping profile. |
 **upgradeId** | **Long**| The numeric ID that is associated with a shipping upgrade |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Etsy deleted the shipping profile upgrade. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getShippingCarriers"></a>
# **getShippingCarriers**
> ShippingCarriers getShippingCarriers(originCountryIso)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a list of available shipping carriers and the mail classes associated with them for a given country

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    String originCountryIso = "originCountryIso_example"; // String | The ISO code of the country from which the listing ships.
    try {
      ShippingCarriers result = apiInstance.getShippingCarriers(originCountryIso);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#getShippingCarriers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **originCountryIso** | **String**| The ISO code of the country from which the listing ships. |

### Return type

[**ShippingCarriers**](ShippingCarriers.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of ShippingCarriers |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getShopShippingProfile"></a>
# **getShopShippingProfile**
> ShopShippingProfile getShopShippingProfile(shopId, shippingProfileId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a Shipping Profile referenced by shipping profile ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    try {
      ShopShippingProfile result = apiInstance.getShopShippingProfile(shopId, shippingProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#getShopShippingProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |

### Return type

[**ShopShippingProfile**](ShopShippingProfile.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ShippingProfile |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getShopShippingProfileDestinationsByShippingProfile"></a>
# **getShopShippingProfileDestinationsByShippingProfile**
> ShopShippingProfileDestinations getShopShippingProfileDestinationsByShippingProfile(shopId, shippingProfileId, limit, offset)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a list of shipping destination objects associated with a shipping profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    try {
      ShopShippingProfileDestinations result = apiInstance.getShopShippingProfileDestinationsByShippingProfile(shopId, shippingProfileId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#getShopShippingProfileDestinationsByShippingProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]

### Return type

[**ShopShippingProfileDestinations**](ShopShippingProfileDestinations.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of shipping destination objects. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getShopShippingProfileUpgrades"></a>
# **getShopShippingProfileUpgrades**
> ShopShippingProfileUpgrades getShopShippingProfileUpgrades(shopId, shippingProfileId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves the list of shipping profile upgrades assigned to a specific shipping profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    try {
      ShopShippingProfileUpgrades result = apiInstance.getShopShippingProfileUpgrades(shopId, shippingProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#getShopShippingProfileUpgrades");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |

### Return type

[**ShopShippingProfileUpgrades**](ShopShippingProfileUpgrades.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of shipping profile upgrades. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getShopShippingProfiles"></a>
# **getShopShippingProfiles**
> ShopShippingProfiles getShopShippingProfiles(shopId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a list of shipping profiles available in the specific Etsy shop identified by its shop ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    try {
      ShopShippingProfiles result = apiInstance.getShopShippingProfiles(shopId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#getShopShippingProfiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |

### Return type

[**ShopShippingProfiles**](ShopShippingProfiles.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of shipping profiles |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateShopShippingProfile"></a>
# **updateShopShippingProfile**
> ShopShippingProfile updateShopShippingProfile(shopId, shippingProfileId, title, originCountryIso, minProcessingTime, maxProcessingTime, processingTimeUnit, originPostalCode)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Changes the settings in a shipping profile. You can pass a country iso code or a region when updating a ShippingProfile, but not both. Only one is required. You must pass either a shipping_carrier_id AND mail_class, or both min and max_delivery_days.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    String title = "title_example"; // String | The name string of this shipping profile.
    String originCountryIso = "originCountryIso_example"; // String | The ISO code of the country from which the listing ships.
    Long minProcessingTime = 56L; // Long | The minimum time required to process to ship listings with this shipping profile.
    Long maxProcessingTime = 56L; // Long | The maximum processing time the listing needs to ship.
    String processingTimeUnit = "business_days"; // String | The unit used to represent how long a processing time is. A week is equivalent to 5 business days. If none is provided, the unit is set to \\\"business_days\\\".
    String originPostalCode = "\"null\""; // String | The postal code string (not necessarily a number) for the location from which the listing ships. Required if the `origin_country_iso` is `US` or `CA`.
    try {
      ShopShippingProfile result = apiInstance.updateShopShippingProfile(shopId, shippingProfileId, title, originCountryIso, minProcessingTime, maxProcessingTime, processingTimeUnit, originPostalCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#updateShopShippingProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |
 **title** | **String**| The name string of this shipping profile. | [optional]
 **originCountryIso** | **String**| The ISO code of the country from which the listing ships. | [optional]
 **minProcessingTime** | **Long**| The minimum time required to process to ship listings with this shipping profile. | [optional]
 **maxProcessingTime** | **Long**| The maximum processing time the listing needs to ship. | [optional]
 **processingTimeUnit** | **String**| The unit used to represent how long a processing time is. A week is equivalent to 5 business days. If none is provided, the unit is set to \\\&quot;business_days\\\&quot;. | [optional] [default to ProcessingTimeUnitEnum.BUSINESS_DAYS] [enum: business_days, weeks]
 **originPostalCode** | **String**| The postal code string (not necessarily a number) for the location from which the listing ships. Required if the &#x60;origin_country_iso&#x60; is &#x60;US&#x60; or &#x60;CA&#x60;. | [optional] [default to &quot;null&quot;]

### Return type

[**ShopShippingProfile**](ShopShippingProfile.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated shipping profile. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateShopShippingProfileDestination"></a>
# **updateShopShippingProfileDestination**
> ShopShippingProfileDestination updateShopShippingProfileDestination(shopId, shippingProfileId, shippingProfileDestinationId, primaryCost, secondaryCost, destinationCountryIso, destinationRegion, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates an existing shipping destination, which can set or reassign the shipping cost, carrier, and class for a destination.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    Long shippingProfileDestinationId = 56L; // Long | The numeric ID of the shipping profile destination in the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing.
    Float primaryCost = 3.4F; // Float | The cost of shipping to this country/region alone, measured in the store's default currency.
    Float secondaryCost = 3.4F; // Float | The cost of shipping to this country/region with another item, measured in the store's default currency.
    String destinationCountryIso = "\"null\""; // String | The ISO code of the country to which the listing ships. If null, request sets destination to destination_region. Required if destination_region is null or not provided.
    String destinationRegion = "eu"; // String | The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If `none`, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided.
    Long shippingCarrierId = 56L; // Long | The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with `mail_class`** if `min_delivery_days` and `max_delivery_days` are null.
    String mailClass = "\"null\""; // String | The unique ID string of a shipping carrier's mail class, which is used to calculate an estimated delivery date. **Required with `shipping_carrier_id`** if `min_delivery_days` and `max_delivery_days` are null.
    Long minDeliveryDays = 56L; // Long | The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `max_delivery_days`** if `mail_class` is null.
    Long maxDeliveryDays = 56L; // Long | The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `min_delivery_days`** if `mail_class` is null.
    try {
      ShopShippingProfileDestination result = apiInstance.updateShopShippingProfileDestination(shopId, shippingProfileId, shippingProfileDestinationId, primaryCost, secondaryCost, destinationCountryIso, destinationRegion, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#updateShopShippingProfileDestination");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |
 **shippingProfileDestinationId** | **Long**| The numeric ID of the shipping profile destination in the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. |
 **primaryCost** | **Float**| The cost of shipping to this country/region alone, measured in the store&#39;s default currency. | [optional]
 **secondaryCost** | **Float**| The cost of shipping to this country/region with another item, measured in the store&#39;s default currency. | [optional]
 **destinationCountryIso** | **String**| The ISO code of the country to which the listing ships. If null, request sets destination to destination_region. Required if destination_region is null or not provided. | [optional] [default to &quot;null&quot;]
 **destinationRegion** | **String**| The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If &#x60;none&#x60;, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided. | [optional] [default to DestinationRegionEnum.NONE] [enum: eu, non_eu, none]
 **shippingCarrierId** | **Long**| The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with &#x60;mail_class&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional]
 **mailClass** | **String**| The unique ID string of a shipping carrier&#39;s mail class, which is used to calculate an estimated delivery date. **Required with &#x60;shipping_carrier_id&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional] [default to &quot;null&quot;]
 **minDeliveryDays** | **Long**| The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;max_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]
 **maxDeliveryDays** | **Long**| The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;min_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]

### Return type

[**ShopShippingProfileDestination**](ShopShippingProfileDestination.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single shipping destination. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateShopShippingProfileUpgrade"></a>
# **updateShopShippingProfileUpgrade**
> ShopShippingProfileUpgrade updateShopShippingProfileUpgrade(shopId, shippingProfileId, upgradeId, upgradeName, type, price, secondaryPrice, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates a shipping profile upgrade and updates any listings that use the shipping profile.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopShippingProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ShopShippingProfileApi apiInstance = new ShopShippingProfileApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    Long upgradeId = 56L; // Long | The numeric ID that is associated with a shipping upgrade
    String upgradeName = "\"null\""; // String | Name for the shipping upgrade shown to shoppers at checkout, e.g. USPS Priority.
    String type = "0"; // String | The type of the shipping upgrade. Domestic (0) or international (1).
    Float price = 3.4F; // Float | Additional cost of adding the shipping upgrade.
    Float secondaryPrice = 3.4F; // Float | Additional cost of adding the shipping upgrade for each additional item.
    Long shippingCarrierId = 56L; // Long | The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with `mail_class`** if `min_delivery_days` and `max_delivery_days` are null.
    String mailClass = "\"null\""; // String | The unique ID string of a shipping carrier's mail class, which is used to calculate an estimated delivery date. **Required with `shipping_carrier_id`** if `min_delivery_days` and `max_delivery_days` are null.
    Long minDeliveryDays = 56L; // Long | The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `max_delivery_days`** if `mail_class` is null.
    Long maxDeliveryDays = 56L; // Long | The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `min_delivery_days`** if `mail_class` is null.
    try {
      ShopShippingProfileUpgrade result = apiInstance.updateShopShippingProfileUpgrade(shopId, shippingProfileId, upgradeId, upgradeName, type, price, secondaryPrice, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopShippingProfileApi#updateShopShippingProfileUpgrade");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. |
 **upgradeId** | **Long**| The numeric ID that is associated with a shipping upgrade |
 **upgradeName** | **String**| Name for the shipping upgrade shown to shoppers at checkout, e.g. USPS Priority. | [optional] [default to &quot;null&quot;]
 **type** | **String**| The type of the shipping upgrade. Domestic (0) or international (1). | [optional] [enum: 0, 1]
 **price** | **Float**| Additional cost of adding the shipping upgrade. | [optional]
 **secondaryPrice** | **Float**| Additional cost of adding the shipping upgrade for each additional item. | [optional]
 **shippingCarrierId** | **Long**| The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with &#x60;mail_class&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional]
 **mailClass** | **String**| The unique ID string of a shipping carrier&#39;s mail class, which is used to calculate an estimated delivery date. **Required with &#x60;shipping_carrier_id&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | [optional] [default to &quot;null&quot;]
 **minDeliveryDays** | **Long**| The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;max_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]
 **maxDeliveryDays** | **Long**| The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;min_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | [optional]

### Return type

[**ShopShippingProfileUpgrade**](ShopShippingProfileUpgrade.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single shipping profile upgrade. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |


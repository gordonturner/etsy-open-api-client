# ShopListingApi

All URIs are relative to *https://openapi.etsy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDraftListing**](ShopListingApi.md#createDraftListing) | **POST** /v3/application/shops/{shop_id}/listings | 
[**deleteListing**](ShopListingApi.md#deleteListing) | **DELETE** /v3/application/listings/{listing_id} | 
[**deleteListingProperty**](ShopListingApi.md#deleteListingProperty) | **DELETE** /v3/application/shops/{shop_id}/listings/{listing_id}/properties/{property_id} | 
[**findAllActiveListingsByShop**](ShopListingApi.md#findAllActiveListingsByShop) | **GET** /v3/application/shops/{shop_id}/listings/active | 
[**findAllListingsActive**](ShopListingApi.md#findAllListingsActive) | **GET** /v3/application/listings/active | 
[**getFeaturedListingsByShop**](ShopListingApi.md#getFeaturedListingsByShop) | **GET** /v3/application/shops/{shop_id}/listings/featured | 
[**getListing**](ShopListingApi.md#getListing) | **GET** /v3/application/listings/{listing_id} | 
[**getListingProperties**](ShopListingApi.md#getListingProperties) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/properties | 
[**getListingProperty**](ShopListingApi.md#getListingProperty) | **GET** /v3/application/listings/{listing_id}/properties/{property_id} | 
[**getListingsByListingIds**](ShopListingApi.md#getListingsByListingIds) | **GET** /v3/application/listings/batch | 
[**getListingsByShop**](ShopListingApi.md#getListingsByShop) | **GET** /v3/application/shops/{shop_id}/listings | 
[**getListingsByShopReceipt**](ShopListingApi.md#getListingsByShopReceipt) | **GET** /v3/application/shops/{shop_id}/receipts/{receipt_id}/listings | 
[**getListingsByShopReturnPolicy**](ShopListingApi.md#getListingsByShopReturnPolicy) | **GET** /v3/application/shops/{shop_id}/policies/return/{return_policy_id}/listings | 
[**getListingsByShopSectionId**](ShopListingApi.md#getListingsByShopSectionId) | **GET** /v3/application/shops/{shop_id}/shop-sections/listings | 
[**updateListing**](ShopListingApi.md#updateListing) | **PATCH** /v3/application/shops/{shop_id}/listings/{listing_id} | 
[**updateListingDeprecated**](ShopListingApi.md#updateListingDeprecated) | **PUT** /v3/application/shops/{shop_id}/listings/{listing_id} | 
[**updateListingProperty**](ShopListingApi.md#updateListingProperty) | **PUT** /v3/application/shops/{shop_id}/listings/{listing_id}/properties/{property_id} | 


<a name="createDraftListing"></a>
# **createDraftListing**
> ShopListing createDraftListing(shopId, quantity, title, description, price, whoMade, whenMade, taxonomyId, shippingProfileId, returnPolicyId, materials, shopSectionId, processingMin, processingMax, tags, styles, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, productionPartnerIds, imageIds, isSupply, isCustomizable, shouldAutoRenew, isTaxable, type)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates a physical draft [listing](/documentation/reference#tag/ShopListing) product in a shop on the Etsy channel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

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

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long quantity = 56L; // Long | The positive non-zero number of products available for purchase in the listing. Note: The listing quantity is the sum of available offering quantities. You can request the quantities for individual offerings from the ListingInventory resource using the [getListingInventory](/documentation/reference#operation/getListingInventory) endpoint.
    String title = "title_example"; // String | The listing's title string. When creating or updating a listing, valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, & and + characters once each.
    String description = "description_example"; // String | A description string of the product for sale in the listing.
    Float price = 3.4F; // Float | The positive non-zero price of the product. (Sold product listings are private) Note: The price is the minimum possible price. The [`getListingInventory`](/documentation/reference/#operation/getListingInventory) method requests exact prices for available offerings.
    String whoMade = "i_did"; // String | An enumerated string indicating who made the product. Helps buyers locate the listing under the Handmade heading. Requires 'is_supply' and 'when_made'.
    String whenMade = "made_to_order"; // String | An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires 'is_supply' and 'who_made'.
    Long taxonomyId = 56L; // Long | The numerical taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#operation/getShopShippingProfile) associated with the listing. Required when listing type is `physical`.
    Long returnPolicyId = 56L; // Long | The numeric ID of the [Return Policy](/documentation/reference#operation/getShopReturnPolicies).
    List<String> materials = Arrays.asList(); // List<String> | A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null.
    Long shopSectionId = 56L; // Long | The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null.
    Long processingMin = 56L; // Long | The minimum number of days required to process this listing. Default value is null.
    Long processingMax = 56L; // Long | The maximum number of days required to process this listing. Default value is null.
    List<String> tags = Arrays.asList(); // List<String> | A comma-separated list of tag strings for the listing. When creating or updating a listing, valid tag strings contain only letters, numbers, whitespace characters, -, ', ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-'™©®]/u) Default value is null.
    List<String> styles = Arrays.asList(); // List<String> | An array of style strings for this listing, each of which is free-form text string such as \\\"Formal\\\", or \\\"Steampunk\\\". When creating or updating a listing, the listing may have up to two styles. Valid style strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null.
    Float itemWeight = 3.4F; // Float | The numeric weight of the product measured in units set in 'item_weight_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemLength = 3.4F; // Float | The numeric length of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemWidth = 3.4F; // Float | The numeric width of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemHeight = 3.4F; // Float | The numeric height of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    String itemWeightUnit = "oz"; // String | A string defining the units used to measure the weight of the product. Default value is null.
    String itemDimensionsUnit = "in"; // String | A string defining the units used to measure the dimensions of the product. Default value is null.
    Boolean isPersonalizable = true; // Boolean | When true, this listing is personalizable. The default value is null.
    Boolean personalizationIsRequired = true; // Boolean | When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is 'true'.
    Long personalizationCharCountMax = 56L; // Long | This is an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is 'true'.
    String personalizationInstructions = "personalizationInstructions_example"; // String | A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is 'true'.
    List<Long> productionPartnerIds = Arrays.asList(); // List<Long> | An array of unique IDs of production partner ids.
    List<Long> imageIds = Arrays.asList(); // List<Long> | An array of numeric image IDs of the images in a listing, which can include up to 10 images.
    Boolean isSupply = true; // Boolean | When true, tags the listing as a supply product, else indicates that it's a finished product. Helps buyers locate the listing under the Supplies heading. Requires 'who_made' and 'when_made'.
    Boolean isCustomizable = true; // Boolean | When true, a buyer may contact the seller for a customized order. The default value is true when a shop accepts custom orders. Does not apply to shops that do not accept custom orders.
    Boolean shouldAutoRenew = true; // Boolean | When true, renews a listing for four months upon expiration.
    Boolean isTaxable = true; // Boolean | When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout.
    String type = "physical"; // String | An enumerated type string that indicates whether the listing is physical or a digital download.
    try {
      ShopListing result = apiInstance.createDraftListing(shopId, quantity, title, description, price, whoMade, whenMade, taxonomyId, shippingProfileId, returnPolicyId, materials, shopSectionId, processingMin, processingMax, tags, styles, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, productionPartnerIds, imageIds, isSupply, isCustomizable, shouldAutoRenew, isTaxable, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#createDraftListing");
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
 **quantity** | **Long**| The positive non-zero number of products available for purchase in the listing. Note: The listing quantity is the sum of available offering quantities. You can request the quantities for individual offerings from the ListingInventory resource using the [getListingInventory](/documentation/reference#operation/getListingInventory) endpoint. |
 **title** | **String**| The listing&#39;s title string. When creating or updating a listing, valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, &amp; and + characters once each. |
 **description** | **String**| A description string of the product for sale in the listing. |
 **price** | **Float**| The positive non-zero price of the product. (Sold product listings are private) Note: The price is the minimum possible price. The [&#x60;getListingInventory&#x60;](/documentation/reference/#operation/getListingInventory) method requests exact prices for available offerings. |
 **whoMade** | **String**| An enumerated string indicating who made the product. Helps buyers locate the listing under the Handmade heading. Requires &#39;is_supply&#39; and &#39;when_made&#39;. | [enum: i_did, someone_else, collective]
 **whenMade** | **String**| An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires &#39;is_supply&#39; and &#39;who_made&#39;. | [enum: made_to_order, 2020_2023, 2010_2019, 2004_2009, before_2004, 2000_2003, 1990s, 1980s, 1970s, 1960s, 1950s, 1940s, 1930s, 1920s, 1910s, 1900s, 1800s, 1700s, before_1700]
 **taxonomyId** | **Long**| The numerical taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information. |
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#operation/getShopShippingProfile) associated with the listing. Required when listing type is &#x60;physical&#x60;. | [optional]
 **returnPolicyId** | **Long**| The numeric ID of the [Return Policy](/documentation/reference#operation/getShopReturnPolicies). | [optional]
 **materials** | [**List&lt;String&gt;**](String.md)| A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. | [optional]
 **shopSectionId** | **Long**| The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null. | [optional]
 **processingMin** | **Long**| The minimum number of days required to process this listing. Default value is null. | [optional]
 **processingMax** | **Long**| The maximum number of days required to process this listing. Default value is null. | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A comma-separated list of tag strings for the listing. When creating or updating a listing, valid tag strings contain only letters, numbers, whitespace characters, -, &#39;, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-&#39;™©®]/u) Default value is null. | [optional]
 **styles** | [**List&lt;String&gt;**](String.md)| An array of style strings for this listing, each of which is free-form text string such as \\\&quot;Formal\\\&quot;, or \\\&quot;Steampunk\\\&quot;. When creating or updating a listing, the listing may have up to two styles. Valid style strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. | [optional]
 **itemWeight** | **Float**| The numeric weight of the product measured in units set in &#39;item_weight_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemLength** | **Float**| The numeric length of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWidth** | **Float**| The numeric width of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemHeight** | **Float**| The numeric height of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWeightUnit** | **String**| A string defining the units used to measure the weight of the product. Default value is null. | [optional] [enum: oz, lb, g, kg]
 **itemDimensionsUnit** | **String**| A string defining the units used to measure the dimensions of the product. Default value is null. | [optional] [enum: in, ft, mm, cm, m, yd, inches]
 **isPersonalizable** | **Boolean**| When true, this listing is personalizable. The default value is null. | [optional]
 **personalizationIsRequired** | **Boolean**| When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationCharCountMax** | **Long**| This is an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationInstructions** | **String**| A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **productionPartnerIds** | [**List&lt;Long&gt;**](Long.md)| An array of unique IDs of production partner ids. | [optional]
 **imageIds** | [**List&lt;Long&gt;**](Long.md)| An array of numeric image IDs of the images in a listing, which can include up to 10 images. | [optional]
 **isSupply** | **Boolean**| When true, tags the listing as a supply product, else indicates that it&#39;s a finished product. Helps buyers locate the listing under the Supplies heading. Requires &#39;who_made&#39; and &#39;when_made&#39;. | [optional]
 **isCustomizable** | **Boolean**| When true, a buyer may contact the seller for a customized order. The default value is true when a shop accepts custom orders. Does not apply to shops that do not accept custom orders. | [optional]
 **shouldAutoRenew** | **Boolean**| When true, renews a listing for four months upon expiration. | [optional]
 **isTaxable** | **Boolean**| When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout. | [optional]
 **type** | **String**| An enumerated type string that indicates whether the listing is physical or a digital download. | [optional] [enum: physical, download, both]

### Return type

[**ShopListing**](ShopListing.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A single ShopListing |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="deleteListing"></a>
# **deleteListing**
> deleteListing(listingId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to delete a ShopListing. A ShopListing can be deleted only if the state is one of the following:  SOLD_OUT, DRAFT, EXPIRED, INACTIVE, ACTIVE and is_available or ACTIVE and has seller flags:  SUPRESSED (frozen), VACATION, CUSTOM_SHOPS (pattern), SELL_ON_FACEBOOK

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

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

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    try {
      apiInstance.deleteListing(listingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#deleteListing");
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
 **listingId** | **Long**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |

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
**409** | There was a request conflict with the current state of the target resource. See the error message for details. |  -  |
**204** | The Listing resource was correctly deleted |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="deleteListingProperty"></a>
# **deleteListingProperty**
> deleteListingProperty(shopId, listingId, propertyId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Deletes a property for a Listing.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

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

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Long propertyId = 56L; // Long | The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties).
    try {
      apiInstance.deleteListingProperty(shopId, listingId, propertyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#deleteListingProperty");
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
 **listingId** | **Long**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **propertyId** | **Long**| The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties). |

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
**204** | The ListingProperty resource was correctly deleted |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="findAllActiveListingsByShop"></a>
# **findAllActiveListingsByShop**
> ShopListings findAllActiveListingsByShop(shopId, limit, sortOn, sortOrder, offset, keywords)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a list of all active listings on Etsy in a specific shop, paginated by listing creation date.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long limit = 25L; // Long | The maximum number of results to return.
    String sortOn = "created"; // String | The value to sort a search result of listings on. NOTES: a) `sort_on` only works when combined with one of the search options (keywords, region, etc.). b) when using `score` the returned results will always be in _descending_ order, regardless of the `sort_order` parameter.
    String sortOrder = "asc"; // String | The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.).
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    String keywords = "null"; // String | Search term or phrase that must appear in all results.
    try {
      ShopListings result = apiInstance.findAllActiveListingsByShop(shopId, limit, sortOn, sortOrder, offset, keywords);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#findAllActiveListingsByShop");
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
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **sortOn** | **String**| The value to sort a search result of listings on. NOTES: a) &#x60;sort_on&#x60; only works when combined with one of the search options (keywords, region, etc.). b) when using &#x60;score&#x60; the returned results will always be in _descending_ order, regardless of the &#x60;sort_order&#x60; parameter. | [optional] [default to created] [enum: created, price, updated, score]
 **sortOrder** | **String**| The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.). | [optional] [default to desc] [enum: asc, ascending, desc, descending, up, down]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]
 **keywords** | **String**| Search term or phrase that must appear in all results. | [optional] [default to null]

### Return type

[**ShopListings**](ShopListings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieves a list of all active listings on Etsy in a specific shop, paginated by listing creation date. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="findAllListingsActive"></a>
# **findAllListingsActive**
> ShopListings findAllListingsActive(limit, offset, keywords, sortOn, sortOrder, minPrice, maxPrice, taxonomyId, shopLocation)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  A list of all active listings on Etsy paginated by their creation date. Without sort_order listings will be returned newest-first by default.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    String keywords = "null"; // String | Search term or phrase that must appear in all results.
    String sortOn = "created"; // String | The value to sort a search result of listings on. NOTES: a) `sort_on` only works when combined with one of the search options (keywords, region, etc.). b) when using `score` the returned results will always be in _descending_ order, regardless of the `sort_order` parameter.
    String sortOrder = "asc"; // String | The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.).
    Float minPrice = 3.4F; // Float | The minimum price of listings to be returned by a search result.
    Float maxPrice = 3.4F; // Float | The maximum price of listings to be returned by a search result.
    Long taxonomyId = 56L; // Long | The numerical taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information.
    String shopLocation = "null"; // String | Filters by shop location. If location cannot be parsed, Etsy responds with an error.
    try {
      ShopListings result = apiInstance.findAllListingsActive(limit, offset, keywords, sortOn, sortOrder, minPrice, maxPrice, taxonomyId, shopLocation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#findAllListingsActive");
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
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]
 **keywords** | **String**| Search term or phrase that must appear in all results. | [optional] [default to null]
 **sortOn** | **String**| The value to sort a search result of listings on. NOTES: a) &#x60;sort_on&#x60; only works when combined with one of the search options (keywords, region, etc.). b) when using &#x60;score&#x60; the returned results will always be in _descending_ order, regardless of the &#x60;sort_order&#x60; parameter. | [optional] [default to created] [enum: created, price, updated, score]
 **sortOrder** | **String**| The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.). | [optional] [default to desc] [enum: asc, ascending, desc, descending, up, down]
 **minPrice** | **Float**| The minimum price of listings to be returned by a search result. | [optional]
 **maxPrice** | **Float**| The maximum price of listings to be returned by a search result. | [optional]
 **taxonomyId** | **Long**| The numerical taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information. | [optional]
 **shopLocation** | **String**| Filters by shop location. If location cannot be parsed, Etsy responds with an error. | [optional] [default to null]

### Return type

[**ShopListings**](ShopListings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of all active listings on Etsy paginated by their creation date. Without sort_order listings will be returned newest-first by default. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getFeaturedListingsByShop"></a>
# **getFeaturedListingsByShop**
> ShopListings getFeaturedListingsByShop(shopId, limit, offset)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves Listings associated to a Shop that are featured.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    try {
      ShopListings result = apiInstance.getFeaturedListingsByShop(shopId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#getFeaturedListingsByShop");
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
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]

### Return type

[**ShopListings**](ShopListings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Listings |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListing"></a>
# **getListing**
> ShopListingWithAssociations getListing(listingId, includes, language)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a listing record by listing ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    List<String> includes = Arrays.asList(); // List<String> | An enumerated string that attaches a valid association. Acceptable inputs are 'Shipping', 'Shop', 'Images', 'User', 'Translations' and 'Inventory'.
    String language = "null"; // String | The IETF language tag for the language of this translation. Ex: `de`, `en`, `es`, `fr`, `it`, `ja`, `nl`, `pl`, `pt`.
    try {
      ShopListingWithAssociations result = apiInstance.getListing(listingId, includes, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#getListing");
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
 **listingId** | **Long**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **includes** | [**List&lt;String&gt;**](String.md)| An enumerated string that attaches a valid association. Acceptable inputs are &#39;Shipping&#39;, &#39;Shop&#39;, &#39;Images&#39;, &#39;User&#39;, &#39;Translations&#39; and &#39;Inventory&#39;. | [optional] [enum: Shipping, Images, Shop, User, Translations, Inventory, Videos]
 **language** | **String**| The IETF language tag for the language of this translation. Ex: &#x60;de&#x60;, &#x60;en&#x60;, &#x60;es&#x60;, &#x60;fr&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;nl&#x60;, &#x60;pl&#x60;, &#x60;pt&#x60;. | [optional] [default to null]

### Return type

[**ShopListingWithAssociations**](ShopListingWithAssociations.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single Listing. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingProperties"></a>
# **getListingProperties**
> ListingPropertyValues getListingProperties(shopId, listingId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get a listing&#39;s properties

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    try {
      ListingPropertyValues result = apiInstance.getListingProperties(shopId, listingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#getListingProperties");
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
 **listingId** | **Long**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |

### Return type

[**ListingPropertyValues**](ListingPropertyValues.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Listing&#39;s Properties |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingProperty"></a>
# **getListingProperty**
> ListingPropertyValue getListingProperty(listingId, propertyId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-01 wt-mr-xs-2\&quot;&gt; Feedback only &lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Give feedback&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;Development for this endpoint is in progress. It will only return a 501 response.&lt;/p&gt;&lt;/div&gt;  Retrieves a listing&#39;s property

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Long propertyId = 56L; // Long | The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties).
    try {
      ListingPropertyValue result = apiInstance.getListingProperty(listingId, propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#getListingProperty");
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
 **listingId** | **Long**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **propertyId** | **Long**| The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties). |

### Return type

[**ListingPropertyValue**](ListingPropertyValue.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ListingProperty. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**501** | This endpoint is not functional at this time. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingsByListingIds"></a>
# **getListingsByListingIds**
> ShopListingsWithAssociations getListingsByListingIds(listingIds, includes)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Allows to query multiple listing ids at once. Limit 100 ids maximum per query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    List<Long> listingIds = Arrays.asList(); // List<Long> | The list of numeric IDS for the listings in a specific Etsy shop.
    List<String> includes = Arrays.asList(); // List<String> | An enumerated string that attaches a valid association. Acceptable inputs are 'Shipping', 'Shop', 'Images', 'User', 'Translations' and 'Inventory'.
    try {
      ShopListingsWithAssociations result = apiInstance.getListingsByListingIds(listingIds, includes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#getListingsByListingIds");
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
 **listingIds** | [**List&lt;Long&gt;**](Long.md)| The list of numeric IDS for the listings in a specific Etsy shop. |
 **includes** | [**List&lt;String&gt;**](String.md)| An enumerated string that attaches a valid association. Acceptable inputs are &#39;Shipping&#39;, &#39;Shop&#39;, &#39;Images&#39;, &#39;User&#39;, &#39;Translations&#39; and &#39;Inventory&#39;. | [optional] [enum: Shipping, Images, Shop, User, Translations, Inventory, Videos]

### Return type

[**ShopListingsWithAssociations**](ShopListingsWithAssociations.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Listings |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingsByShop"></a>
# **getListingsByShop**
> ShopListingsWithAssociations getListingsByShop(shopId, state, limit, offset, sortOn, sortOrder, includes)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Endpoint to list Listings that belong to a Shop. Listings can be filtered using the &#39;state&#39; param.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

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

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    String state = "active"; // String | When _updating_ a listing, this value can be either `active` or `inactive`. Note: Setting a `draft` listing to `active` will also publish the listing on etsy.com and requires that the listing have an image set. Setting a `sold_out` listing to active will update the quantity to 1 and renew the listing on etsy.com.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    String sortOn = "created"; // String | The value to sort a search result of listings on. NOTES: a) `sort_on` only works when combined with one of the search options (keywords, region, etc.). b) when using `score` the returned results will always be in _descending_ order, regardless of the `sort_order` parameter.
    String sortOrder = "asc"; // String | The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.).
    List<String> includes = Arrays.asList(); // List<String> | An enumerated string that attaches a valid association. Acceptable inputs are 'Shipping', 'Shop', 'Images', 'User', 'Translations' and 'Inventory'.
    try {
      ShopListingsWithAssociations result = apiInstance.getListingsByShop(shopId, state, limit, offset, sortOn, sortOrder, includes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#getListingsByShop");
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
 **state** | **String**| When _updating_ a listing, this value can be either &#x60;active&#x60; or &#x60;inactive&#x60;. Note: Setting a &#x60;draft&#x60; listing to &#x60;active&#x60; will also publish the listing on etsy.com and requires that the listing have an image set. Setting a &#x60;sold_out&#x60; listing to active will update the quantity to 1 and renew the listing on etsy.com. | [optional] [default to active] [enum: active, inactive, sold_out, draft, expired]
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]
 **sortOn** | **String**| The value to sort a search result of listings on. NOTES: a) &#x60;sort_on&#x60; only works when combined with one of the search options (keywords, region, etc.). b) when using &#x60;score&#x60; the returned results will always be in _descending_ order, regardless of the &#x60;sort_order&#x60; parameter. | [optional] [default to created] [enum: created, price, updated, score]
 **sortOrder** | **String**| The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.). | [optional] [default to desc] [enum: asc, ascending, desc, descending, up, down]
 **includes** | [**List&lt;String&gt;**](String.md)| An enumerated string that attaches a valid association. Acceptable inputs are &#39;Shipping&#39;, &#39;Shop&#39;, &#39;Images&#39;, &#39;User&#39;, &#39;Translations&#39; and &#39;Inventory&#39;. | [optional] [enum: Shipping, Images, Shop, User, Translations, Inventory, Videos]

### Return type

[**ShopListingsWithAssociations**](ShopListingsWithAssociations.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Listings |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingsByShopReceipt"></a>
# **getListingsByShopReceipt**
> ShopListings getListingsByShopReceipt(receiptId, shopId, limit, offset)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Gets all listings associated with a receipt.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

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

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long receiptId = 56L; // Long | The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    try {
      ShopListings result = apiInstance.getListingsByShopReceipt(receiptId, shopId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#getListingsByShopReceipt");
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
 **receiptId** | **Long**| The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. |
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]

### Return type

[**ShopListings**](ShopListings.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of ShopListing resources. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingsByShopReturnPolicy"></a>
# **getListingsByShopReturnPolicy**
> ShopListings getListingsByShopReturnPolicy(returnPolicyId, shopId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Gets all listings associated with a Return Policy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

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

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long returnPolicyId = 56L; // Long | The numeric ID of the [Return Policy](/documentation/reference#operation/getShopReturnPolicies).
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    try {
      ShopListings result = apiInstance.getListingsByShopReturnPolicy(returnPolicyId, shopId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#getListingsByShopReturnPolicy");
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
 **returnPolicyId** | **Long**| The numeric ID of the [Return Policy](/documentation/reference#operation/getShopReturnPolicies). |
 **shopId** | **Long**| The unique positive non-zero numeric ID for an Etsy Shop. |

### Return type

[**ShopListings**](ShopListings.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of ShopListing resources. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingsByShopSectionId"></a>
# **getListingsByShopSectionId**
> ShopListings getListingsByShopSectionId(shopId, shopSectionIds, limit, offset, sortOn, sortOrder)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves all the listings from the section of a specific shop.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    List<Long> shopSectionIds = Arrays.asList(); // List<Long> | A list of numeric IDS for all sections in a specific Etsy shop.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    String sortOn = "created"; // String | The value to sort a search result of listings on. NOTES: a) `sort_on` only works when combined with one of the search options (keywords, region, etc.). b) when using `score` the returned results will always be in _descending_ order, regardless of the `sort_order` parameter.
    String sortOrder = "asc"; // String | The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.).
    try {
      ShopListings result = apiInstance.getListingsByShopSectionId(shopId, shopSectionIds, limit, offset, sortOn, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#getListingsByShopSectionId");
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
 **shopSectionIds** | [**List&lt;Long&gt;**](Long.md)| A list of numeric IDS for all sections in a specific Etsy shop. |
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]
 **sortOn** | **String**| The value to sort a search result of listings on. NOTES: a) &#x60;sort_on&#x60; only works when combined with one of the search options (keywords, region, etc.). b) when using &#x60;score&#x60; the returned results will always be in _descending_ order, regardless of the &#x60;sort_order&#x60; parameter. | [optional] [default to created] [enum: created, price, updated, score]
 **sortOrder** | **String**| The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.). | [optional] [default to desc] [enum: asc, ascending, desc, descending, up, down]

### Return type

[**ShopListings**](ShopListings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of listings from a shop section. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateListing"></a>
# **updateListing**
> ShopListing updateListing(shopId, listingId, imageIds, title, description, materials, shouldAutoRenew, shippingProfileId, returnPolicyId, shopSectionId, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isTaxable, taxonomyId, tags, whoMade, whenMade, featuredRank, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, state, isSupply, productionPartnerIds, type)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates a listing, identified by a listing ID, for a specific shop identified by a shop ID. Note that this is a PATCH method type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

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

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    List<Long> imageIds = Arrays.asList(); // List<Long> | An array of numeric image IDs of the images in a listing, which can include up to 10 images.
    String title = "title_example"; // String | The listing's title string. When creating or updating a listing, valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, & and + characters once each.
    String description = "description_example"; // String | A description string of the product for sale in the listing.
    List<String> materials = Arrays.asList(); // List<String> | A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null.
    Boolean shouldAutoRenew = true; // Boolean | When true, renews a listing for four months upon expiration.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#operation/getShopShippingProfile) associated with the listing. Required when listing type is `physical`.
    Long returnPolicyId = 56L; // Long | The numeric ID of the [Return Policy](/documentation/reference#operation/getShopReturnPolicies). Required for active physical listings. This requirement does not apply to listings of EU-based shops.
    Long shopSectionId = 56L; // Long | The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null.
    Float itemWeight = 3.4F; // Float | The numeric weight of the product measured in units set in 'item_weight_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemLength = 3.4F; // Float | The numeric length of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemWidth = 3.4F; // Float | The numeric width of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemHeight = 3.4F; // Float | The numeric height of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    String itemWeightUnit = ""; // String | A string defining the units used to measure the weight of the product. Default value is null.
    String itemDimensionsUnit = ""; // String | A string defining the units used to measure the dimensions of the product. Default value is null.
    Boolean isTaxable = true; // Boolean | When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout.
    Long taxonomyId = 56L; // Long | The numerical taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information.
    List<String> tags = Arrays.asList(); // List<String> | A comma-separated list of tag strings for the listing. When creating or updating a listing, valid tag strings contain only letters, numbers, whitespace characters, -, ', ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-'™©®]/u) Default value is null.
    String whoMade = "i_did"; // String | An enumerated string indicating who made the product. Helps buyers locate the listing under the Handmade heading. Requires 'is_supply' and 'when_made'.
    String whenMade = "made_to_order"; // String | An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires 'is_supply' and 'who_made'.
    Long featuredRank = 56L; // Long | The positive non-zero numeric position in the featured listings of the shop, with rank 1 listings appearing in the left-most position in featured listing on a shop’s home page.
    Boolean isPersonalizable = true; // Boolean | When true, this listing is personalizable. The default value is null.
    Boolean personalizationIsRequired = true; // Boolean | When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is 'true'.
    Long personalizationCharCountMax = 56L; // Long | This is an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is 'true'.
    String personalizationInstructions = "personalizationInstructions_example"; // String | A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is 'true'.
    String state = "active"; // String | When _updating_ a listing, this value can be either `active` or `inactive`. Note: Setting a `draft` listing to `active` will also publish the listing on etsy.com and requires that the listing have an image set. Setting a `sold_out` listing to active will update the quantity to 1 and renew the listing on etsy.com.
    Boolean isSupply = true; // Boolean | When true, tags the listing as a supply product, else indicates that it's a finished product. Helps buyers locate the listing under the Supplies heading. Requires 'who_made' and 'when_made'.
    List<Long> productionPartnerIds = Arrays.asList(); // List<Long> | An array of unique IDs of production partner ids.
    String type = "physical"; // String | An enumerated type string that indicates whether the listing is physical or a digital download.
    try {
      ShopListing result = apiInstance.updateListing(shopId, listingId, imageIds, title, description, materials, shouldAutoRenew, shippingProfileId, returnPolicyId, shopSectionId, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isTaxable, taxonomyId, tags, whoMade, whenMade, featuredRank, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, state, isSupply, productionPartnerIds, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#updateListing");
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
 **listingId** | **Long**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **imageIds** | [**List&lt;Long&gt;**](Long.md)| An array of numeric image IDs of the images in a listing, which can include up to 10 images. | [optional]
 **title** | **String**| The listing&#39;s title string. When creating or updating a listing, valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, &amp; and + characters once each. | [optional]
 **description** | **String**| A description string of the product for sale in the listing. | [optional]
 **materials** | [**List&lt;String&gt;**](String.md)| A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. | [optional]
 **shouldAutoRenew** | **Boolean**| When true, renews a listing for four months upon expiration. | [optional]
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#operation/getShopShippingProfile) associated with the listing. Required when listing type is &#x60;physical&#x60;. | [optional]
 **returnPolicyId** | **Long**| The numeric ID of the [Return Policy](/documentation/reference#operation/getShopReturnPolicies). Required for active physical listings. This requirement does not apply to listings of EU-based shops. | [optional]
 **shopSectionId** | **Long**| The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null. | [optional]
 **itemWeight** | **Float**| The numeric weight of the product measured in units set in &#39;item_weight_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemLength** | **Float**| The numeric length of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWidth** | **Float**| The numeric width of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemHeight** | **Float**| The numeric height of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWeightUnit** | **String**| A string defining the units used to measure the weight of the product. Default value is null. | [optional] [enum: , oz, lb, g, kg]
 **itemDimensionsUnit** | **String**| A string defining the units used to measure the dimensions of the product. Default value is null. | [optional] [enum: , in, ft, mm, cm, m, yd, inches]
 **isTaxable** | **Boolean**| When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout. | [optional]
 **taxonomyId** | **Long**| The numerical taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information. | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A comma-separated list of tag strings for the listing. When creating or updating a listing, valid tag strings contain only letters, numbers, whitespace characters, -, &#39;, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-&#39;™©®]/u) Default value is null. | [optional]
 **whoMade** | **String**| An enumerated string indicating who made the product. Helps buyers locate the listing under the Handmade heading. Requires &#39;is_supply&#39; and &#39;when_made&#39;. | [optional] [enum: i_did, someone_else, collective]
 **whenMade** | **String**| An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires &#39;is_supply&#39; and &#39;who_made&#39;. | [optional] [enum: made_to_order, 2020_2023, 2010_2019, 2004_2009, before_2004, 2000_2003, 1990s, 1980s, 1970s, 1960s, 1950s, 1940s, 1930s, 1920s, 1910s, 1900s, 1800s, 1700s, before_1700]
 **featuredRank** | **Long**| The positive non-zero numeric position in the featured listings of the shop, with rank 1 listings appearing in the left-most position in featured listing on a shop’s home page. | [optional]
 **isPersonalizable** | **Boolean**| When true, this listing is personalizable. The default value is null. | [optional]
 **personalizationIsRequired** | **Boolean**| When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationCharCountMax** | **Long**| This is an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationInstructions** | **String**| A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **state** | **String**| When _updating_ a listing, this value can be either &#x60;active&#x60; or &#x60;inactive&#x60;. Note: Setting a &#x60;draft&#x60; listing to &#x60;active&#x60; will also publish the listing on etsy.com and requires that the listing have an image set. Setting a &#x60;sold_out&#x60; listing to active will update the quantity to 1 and renew the listing on etsy.com. | [optional] [enum: active, inactive]
 **isSupply** | **Boolean**| When true, tags the listing as a supply product, else indicates that it&#39;s a finished product. Helps buyers locate the listing under the Supplies heading. Requires &#39;who_made&#39; and &#39;when_made&#39;. | [optional]
 **productionPartnerIds** | [**List&lt;Long&gt;**](Long.md)| An array of unique IDs of production partner ids. | [optional]
 **type** | **String**| An enumerated type string that indicates whether the listing is physical or a digital download. | [optional] [enum: physical, download, both]

### Return type

[**ShopListing**](ShopListing.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ShopListing |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**409** | There was a request conflict with the current state of the target resource. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateListingDeprecated"></a>
# **updateListingDeprecated**
> ShopListing updateListingDeprecated(shopId, listingId, imageIds, title, description, materials, shouldAutoRenew, shippingProfileId, shopSectionId, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isTaxable, taxonomyId, tags, whoMade, whenMade, featuredRank, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, state, isSupply, productionPartnerIds, type)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates a listing, identified by a listing ID, for a specific shop identified by a shop ID. This endpoint will be removed in the near future in favor of &#x60;updateListing&#x60; PATCH version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

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

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    List<Long> imageIds = Arrays.asList(); // List<Long> | An array of numeric image IDs of the images in a listing, which can include up to 10 images.
    String title = "title_example"; // String | The listing's title string. When creating or updating a listing, valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, & and + characters once each.
    String description = "description_example"; // String | A description string of the product for sale in the listing.
    List<String> materials = Arrays.asList(); // List<String> | A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null.
    Boolean shouldAutoRenew = true; // Boolean | When true, renews a listing for four months upon expiration.
    Long shippingProfileId = 56L; // Long | The numeric ID of the [shipping profile](/documentation/reference#operation/getShopShippingProfile) associated with the listing. Required when listing type is `physical`.
    Long shopSectionId = 56L; // Long | The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null.
    Float itemWeight = 3.4F; // Float | The numeric weight of the product measured in units set in 'item_weight_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemLength = 3.4F; // Float | The numeric length of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemWidth = 3.4F; // Float | The numeric width of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemHeight = 3.4F; // Float | The numeric height of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    String itemWeightUnit = "oz"; // String | A string defining the units used to measure the weight of the product. Default value is null.
    String itemDimensionsUnit = "in"; // String | A string defining the units used to measure the dimensions of the product. Default value is null.
    Boolean isTaxable = true; // Boolean | When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout.
    Long taxonomyId = 56L; // Long | The numerical taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information.
    List<String> tags = Arrays.asList(); // List<String> | A comma-separated list of tag strings for the listing. When creating or updating a listing, valid tag strings contain only letters, numbers, whitespace characters, -, ', ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-'™©®]/u) Default value is null.
    String whoMade = "i_did"; // String | An enumerated string indicating who made the product. Helps buyers locate the listing under the Handmade heading. Requires 'is_supply' and 'when_made'.
    String whenMade = "made_to_order"; // String | An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires 'is_supply' and 'who_made'.
    Long featuredRank = 56L; // Long | The positive non-zero numeric position in the featured listings of the shop, with rank 1 listings appearing in the left-most position in featured listing on a shop’s home page.
    Boolean isPersonalizable = true; // Boolean | When true, this listing is personalizable. The default value is null.
    Boolean personalizationIsRequired = true; // Boolean | When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is 'true'.
    Long personalizationCharCountMax = 56L; // Long | This is an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is 'true'.
    String personalizationInstructions = "personalizationInstructions_example"; // String | A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is 'true'.
    String state = "active"; // String | When _updating_ a listing, this value can be either `active` or `inactive`. Note: Setting a `draft` listing to `active` will also publish the listing on etsy.com and requires that the listing have an image set. Setting a `sold_out` listing to active will update the quantity to 1 and renew the listing on etsy.com.
    Boolean isSupply = true; // Boolean | When true, tags the listing as a supply product, else indicates that it's a finished product. Helps buyers locate the listing under the Supplies heading. Requires 'who_made' and 'when_made'.
    List<Long> productionPartnerIds = Arrays.asList(); // List<Long> | An array of unique IDs of production partner ids.
    String type = "physical"; // String | An enumerated type string that indicates whether the listing is physical or a digital download.
    try {
      ShopListing result = apiInstance.updateListingDeprecated(shopId, listingId, imageIds, title, description, materials, shouldAutoRenew, shippingProfileId, shopSectionId, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isTaxable, taxonomyId, tags, whoMade, whenMade, featuredRank, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, state, isSupply, productionPartnerIds, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#updateListingDeprecated");
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
 **listingId** | **Long**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **imageIds** | [**List&lt;Long&gt;**](Long.md)| An array of numeric image IDs of the images in a listing, which can include up to 10 images. | [optional]
 **title** | **String**| The listing&#39;s title string. When creating or updating a listing, valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, &amp; and + characters once each. | [optional]
 **description** | **String**| A description string of the product for sale in the listing. | [optional]
 **materials** | [**List&lt;String&gt;**](String.md)| A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. | [optional]
 **shouldAutoRenew** | **Boolean**| When true, renews a listing for four months upon expiration. | [optional]
 **shippingProfileId** | **Long**| The numeric ID of the [shipping profile](/documentation/reference#operation/getShopShippingProfile) associated with the listing. Required when listing type is &#x60;physical&#x60;. | [optional]
 **shopSectionId** | **Long**| The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null. | [optional]
 **itemWeight** | **Float**| The numeric weight of the product measured in units set in &#39;item_weight_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemLength** | **Float**| The numeric length of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWidth** | **Float**| The numeric width of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemHeight** | **Float**| The numeric height of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWeightUnit** | **String**| A string defining the units used to measure the weight of the product. Default value is null. | [optional] [enum: oz, lb, g, kg]
 **itemDimensionsUnit** | **String**| A string defining the units used to measure the dimensions of the product. Default value is null. | [optional] [enum: in, ft, mm, cm, m, yd, inches]
 **isTaxable** | **Boolean**| When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout. | [optional]
 **taxonomyId** | **Long**| The numerical taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information. | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A comma-separated list of tag strings for the listing. When creating or updating a listing, valid tag strings contain only letters, numbers, whitespace characters, -, &#39;, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-&#39;™©®]/u) Default value is null. | [optional]
 **whoMade** | **String**| An enumerated string indicating who made the product. Helps buyers locate the listing under the Handmade heading. Requires &#39;is_supply&#39; and &#39;when_made&#39;. | [optional] [enum: i_did, someone_else, collective]
 **whenMade** | **String**| An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires &#39;is_supply&#39; and &#39;who_made&#39;. | [optional] [enum: made_to_order, 2020_2023, 2010_2019, 2004_2009, before_2004, 2000_2003, 1990s, 1980s, 1970s, 1960s, 1950s, 1940s, 1930s, 1920s, 1910s, 1900s, 1800s, 1700s, before_1700]
 **featuredRank** | **Long**| The positive non-zero numeric position in the featured listings of the shop, with rank 1 listings appearing in the left-most position in featured listing on a shop’s home page. | [optional]
 **isPersonalizable** | **Boolean**| When true, this listing is personalizable. The default value is null. | [optional]
 **personalizationIsRequired** | **Boolean**| When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationCharCountMax** | **Long**| This is an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationInstructions** | **String**| A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **state** | **String**| When _updating_ a listing, this value can be either &#x60;active&#x60; or &#x60;inactive&#x60;. Note: Setting a &#x60;draft&#x60; listing to &#x60;active&#x60; will also publish the listing on etsy.com and requires that the listing have an image set. Setting a &#x60;sold_out&#x60; listing to active will update the quantity to 1 and renew the listing on etsy.com. | [optional] [enum: active, inactive]
 **isSupply** | **Boolean**| When true, tags the listing as a supply product, else indicates that it&#39;s a finished product. Helps buyers locate the listing under the Supplies heading. Requires &#39;who_made&#39; and &#39;when_made&#39;. | [optional]
 **productionPartnerIds** | [**List&lt;Long&gt;**](Long.md)| An array of unique IDs of production partner ids. | [optional]
 **type** | **String**| An enumerated type string that indicates whether the listing is physical or a digital download. | [optional] [enum: physical, download, both]

### Return type

[**ShopListing**](ShopListing.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ShopListing |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**409** | There was a request conflict with the current state of the target resource. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateListingProperty"></a>
# **updateListingProperty**
> ListingPropertyValue updateListingProperty(shopId, listingId, propertyId, valueIds, values, scaleId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates or populates the properties list defining product offerings for a listing. Each offering requires both a &#x60;value&#x60; and a &#x60;value_id&#x60; that are valid for a &#x60;scale_id&#x60; assigned to the listing or that you assign to the listing with this request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingApi;

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

    ShopListingApi apiInstance = new ShopListingApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Long propertyId = 56L; // Long | The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties).
    List<Long> valueIds = Arrays.asList(); // List<Long> | An array of unique IDs of multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different sizes of a product, then the value ID list contains value IDs for each size.
    List<String> values = Arrays.asList(); // List<String> | An array of value strings for multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different colored products, then the values array contains the color strings for each color. Note: parenthesis characters (`(` and `)`) are not allowed.
    Long scaleId = 56L; // Long | The numeric ID of a single Etsy.com measurement scale. For example, for shoe size, there are three `scale_id`s available - `UK`, `US/Canada`, and `EU`, where `US/Canada` has `scale_id` 19.
    try {
      ListingPropertyValue result = apiInstance.updateListingProperty(shopId, listingId, propertyId, valueIds, values, scaleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingApi#updateListingProperty");
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
 **listingId** | **Long**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **propertyId** | **Long**| The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties). |
 **valueIds** | [**List&lt;Long&gt;**](Long.md)| An array of unique IDs of multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different sizes of a product, then the value ID list contains value IDs for each size. |
 **values** | [**List&lt;String&gt;**](String.md)| An array of value strings for multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different colored products, then the values array contains the color strings for each color. Note: parenthesis characters (&#x60;(&#x60; and &#x60;)&#x60;) are not allowed. |
 **scaleId** | **Long**| The numeric ID of a single Etsy.com measurement scale. For example, for shoe size, there are three &#x60;scale_id&#x60;s available - &#x60;UK&#x60;, &#x60;US/Canada&#x60;, and &#x60;EU&#x60;, where &#x60;US/Canada&#x60; has &#x60;scale_id&#x60; 19. | [optional]

### Return type

[**ListingPropertyValue**](ListingPropertyValue.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single listing property. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |


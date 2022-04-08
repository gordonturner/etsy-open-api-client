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
[**getListingsByShopSectionId**](ShopListingApi.md#getListingsByShopSectionId) | **GET** /v3/application/shops/{shop_id}/shop-sections/listings | 
[**updateListing**](ShopListingApi.md#updateListing) | **PUT** /v3/application/shops/{shop_id}/listings/{listing_id} | 
[**updateListingProperty**](ShopListingApi.md#updateListingProperty) | **PUT** /v3/application/shops/{shop_id}/listings/{listing_id}/properties/{property_id} | 


<a name="createDraftListing"></a>
# **createDraftListing**
> ShopListing createDraftListing(shopId, quantity, title, description, price, whoMade, whenMade, taxonomyId, shippingProfileId, materials, shopSectionId, processingMin, processingMax, tags, styles, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, productionPartnerIds, imageIds, isSupply, isCustomizable, shouldAutoRenew, isTaxable, type)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates a physical draft [listing](/documentation/reference#tag/ShopListing) product in a shop on the Etsy channel.

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
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    Integer quantity = 56; // Integer | The positive non-zero number of products available for purchase in the listing. Note: The listing quantity is the sum of available offering quantities. You can request the quantities for individual offerings from the ListingInventory resource using the [getListingInventory](/documentation/reference#operation/getListingInventory) endpoint.
    String title = "title_example"; // String | The listing's title string. Valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, & and + characters once each.
    String description = "description_example"; // String | A description string of the product for sale in the listing.
    Float price = 3.4F; // Float | The positive non-zero price of the product. (Sold product listings are private) Note: The price is the minimum possible price. The getInventory method requests exact prices for available offerings.
    String whoMade = "i_did"; // String | An enumerated string inidcated who made the product. Helps buyers locate the listing under the Handmade heading. Requires 'is_supply' and 'when_made'.
    String whenMade = "made_to_order"; // String | An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires 'is_supply' and 'who_made'.
    Integer taxonomyId = 56; // Integer | The numeric taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information.
    Integer shippingProfileId = 56; // Integer | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    List<String> materials = Arrays.asList(); // List<String> | A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null.
    Integer shopSectionId = 56; // Integer | The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null.
    Integer processingMin = 56; // Integer | The minimum number of days required to process this listing. Default value is null.
    Integer processingMax = 56; // Integer | The maximum number of days required to process this listing. Default value is null.
    List<String> tags = Arrays.asList(); // List<String> | A comma-separated list of tag strings for the listing. Valid tag strings contain only letters, numbers, whitespace characters, -, ', ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-'™©®]/u) Default value is null.
    List<String> styles = Arrays.asList(); // List<String> | An array of style strings for this listing, each of which is free-form text string such as \\\"Formal\\\", or \\\"Steampunk\\\". A Listing may have up to two styles. Valid style strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null.
    Float itemWeight = 3.4F; // Float | The numeric weight of the product measured in units set in 'item_weight_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemLength = 3.4F; // Float | The numeric length of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemWidth = 3.4F; // Float | The numeric width of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemHeight = 3.4F; // Float | The numeric height of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    String itemWeightUnit = "oz"; // String | A string defining the units used to measure the weight of the product. Default value is null.
    String itemDimensionsUnit = "in"; // String | A string defining the units used to measure the dimensions of the product. Default value is null.
    Boolean isPersonalizable = true; // Boolean | When true, this listing is personalizable. The default value is null.
    Boolean personalizationIsRequired = true; // Boolean | When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is 'true'.
    Integer personalizationCharCountMax = 56; // Integer | This an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is 'true'.
    String personalizationInstructions = "personalizationInstructions_example"; // String | A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is 'true'.
    List<Integer> productionPartnerIds = Arrays.asList(); // List<Integer> | An array of unique IDs of production partner ids.
    List<Integer> imageIds = Arrays.asList(); // List<Integer> | An array of numeric image IDs of the images in a listing, which can include up to 10 images.
    Boolean isSupply = true; // Boolean | When true, tags the listing as a supply product, else indicates that it's a finished product. Helps buyers locate the listing under the Supplies heading. Requires 'who_made' and 'when_made'.
    Boolean isCustomizable = true; // Boolean | When true, a buyer may contact the seller for a customized order. The default value is true when a shop accepts custom orders. Does not apply to shops that do not accept custom orders.
    Boolean shouldAutoRenew = true; // Boolean | When true, renews a listing for four months upon expriation. If set to true when previously false, etsy.com renews the listing before it expires, but the renewal period starts immidiately rather than extending the listing's expiration date. Any unused time remaining on the listing is lost. Renewals result in charges to a user's bill.
    Boolean isTaxable = true; // Boolean | When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout.
    String type = "physical"; // String | An enumerated type string that indicates whether the listing is physical or a digital download.
    try {
      ShopListing result = apiInstance.createDraftListing(shopId, quantity, title, description, price, whoMade, whenMade, taxonomyId, shippingProfileId, materials, shopSectionId, processingMin, processingMax, tags, styles, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, productionPartnerIds, imageIds, isSupply, isCustomizable, shouldAutoRenew, isTaxable, type);
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
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **quantity** | **Integer**| The positive non-zero number of products available for purchase in the listing. Note: The listing quantity is the sum of available offering quantities. You can request the quantities for individual offerings from the ListingInventory resource using the [getListingInventory](/documentation/reference#operation/getListingInventory) endpoint. |
 **title** | **String**| The listing&#39;s title string. Valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, &amp; and + characters once each. |
 **description** | **String**| A description string of the product for sale in the listing. |
 **price** | **Float**| The positive non-zero price of the product. (Sold product listings are private) Note: The price is the minimum possible price. The getInventory method requests exact prices for available offerings. |
 **whoMade** | **String**| An enumerated string inidcated who made the product. Helps buyers locate the listing under the Handmade heading. Requires &#39;is_supply&#39; and &#39;when_made&#39;. | [enum: i_did, someone_else, collective]
 **whenMade** | **String**| An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires &#39;is_supply&#39; and &#39;who_made&#39;. | [enum: made_to_order, 2020_2022, 2010_2019, 2003_2009, before_2003, 2000_2002, 1990s, 1980s, 1970s, 1960s, 1950s, 1940s, 1930s, 1920s, 1910s, 1900s, 1800s, 1700s, before_1700]
 **taxonomyId** | **Integer**| The numeric taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information. |
 **shippingProfileId** | **Integer**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. | [optional]
 **materials** | [**List&lt;String&gt;**](String.md)| A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. | [optional]
 **shopSectionId** | **Integer**| The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null. | [optional]
 **processingMin** | **Integer**| The minimum number of days required to process this listing. Default value is null. | [optional]
 **processingMax** | **Integer**| The maximum number of days required to process this listing. Default value is null. | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A comma-separated list of tag strings for the listing. Valid tag strings contain only letters, numbers, whitespace characters, -, &#39;, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-&#39;™©®]/u) Default value is null. | [optional]
 **styles** | [**List&lt;String&gt;**](String.md)| An array of style strings for this listing, each of which is free-form text string such as \\\&quot;Formal\\\&quot;, or \\\&quot;Steampunk\\\&quot;. A Listing may have up to two styles. Valid style strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. | [optional]
 **itemWeight** | **Float**| The numeric weight of the product measured in units set in &#39;item_weight_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemLength** | **Float**| The numeric length of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWidth** | **Float**| The numeric width of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemHeight** | **Float**| The numeric height of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWeightUnit** | **String**| A string defining the units used to measure the weight of the product. Default value is null. | [optional] [enum: oz, lb, g, kg]
 **itemDimensionsUnit** | **String**| A string defining the units used to measure the dimensions of the product. Default value is null. | [optional] [enum: in, ft, mm, cm, m, yd, inches]
 **isPersonalizable** | **Boolean**| When true, this listing is personalizable. The default value is null. | [optional]
 **personalizationIsRequired** | **Boolean**| When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationCharCountMax** | **Integer**| This an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationInstructions** | **String**| A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **productionPartnerIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of unique IDs of production partner ids. | [optional]
 **imageIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of numeric image IDs of the images in a listing, which can include up to 10 images. | [optional]
 **isSupply** | **Boolean**| When true, tags the listing as a supply product, else indicates that it&#39;s a finished product. Helps buyers locate the listing under the Supplies heading. Requires &#39;who_made&#39; and &#39;when_made&#39;. | [optional]
 **isCustomizable** | **Boolean**| When true, a buyer may contact the seller for a customized order. The default value is true when a shop accepts custom orders. Does not apply to shops that do not accept custom orders. | [optional]
 **shouldAutoRenew** | **Boolean**| When true, renews a listing for four months upon expriation. If set to true when previously false, etsy.com renews the listing before it expires, but the renewal period starts immidiately rather than extending the listing&#39;s expiration date. Any unused time remaining on the listing is lost. Renewals result in charges to a user&#39;s bill. | [optional]
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



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to delete a ShopListing. A ShopListing can be deleted only if the state is one of the following:  SOLD_OUT, DRAFT, EXPIRED, INACTIVE, ACTIVE and is_available or ACTIVE and has seller flags:  SUPRESSED (frozen), VACATION, CUSTOM_SHOPS (pattern), SELL_ON_FACEBOOK

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
    Integer listingId = 56; // Integer | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
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
 **listingId** | **Integer**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |

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
**409** | There was a request conflict with current state of the target resource. See the error message for details. |  -  |
**204** | The Listing resource was correctly deleted |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="deleteListingProperty"></a>
# **deleteListingProperty**
> deleteListingProperty(shopId, listingId, propertyId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Deletes a property for a Listing.

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
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    Integer listingId = 56; // Integer | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Integer propertyId = 56; // Integer | The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties).
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
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **listingId** | **Integer**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **propertyId** | **Integer**| The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties). |

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



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a list of all active listings on Etsy in a specific shop, paginated by listing creation date.

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
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    Integer limit = 25; // Integer | The maximum number of results to return.
    String sortOn = "created"; // String | The value to sort a search result of listings on. NOTE: sort_on only works when combined with one of the search options (keywords, region, etc.). 
    String sortOrder = "asc"; // String | The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.).
    Integer offset = 0; // Integer | The number of records to skip before selecting the first result.
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
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **limit** | **Integer**| The maximum number of results to return. | [optional] [default to 25]
 **sortOn** | **String**| The value to sort a search result of listings on. NOTE: sort_on only works when combined with one of the search options (keywords, region, etc.).  | [optional] [default to created] [enum: created, price, updated, score]
 **sortOrder** | **String**| The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.). | [optional] [default to desc] [enum: asc, ascending, desc, descending, up, down]
 **offset** | **Integer**| The number of records to skip before selecting the first result. | [optional] [default to 0]
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



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  A list of all active listings on Etsy paginated by their creation date. Without sort_order listings will be returned newest-first by default.

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
    Integer limit = 25; // Integer | The maximum number of results to return.
    Integer offset = 0; // Integer | The number of records to skip before selecting the first result.
    String keywords = "null"; // String | Search term or phrase that must appear in all results.
    String sortOn = "created"; // String | The value to sort a search result of listings on. NOTE: sort_on only works when combined with one of the search options (keywords, region, etc.). 
    String sortOrder = "asc"; // String | The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.).
    Float minPrice = 3.4F; // Float | The minimum price of listings to be returned by a search result.
    Float maxPrice = 3.4F; // Float | The maximum price of listings to be returned by a search result.
    Integer taxonomyId = 56; // Integer | The numeric taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information.
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
 **limit** | **Integer**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of records to skip before selecting the first result. | [optional] [default to 0]
 **keywords** | **String**| Search term or phrase that must appear in all results. | [optional] [default to null]
 **sortOn** | **String**| The value to sort a search result of listings on. NOTE: sort_on only works when combined with one of the search options (keywords, region, etc.).  | [optional] [default to created] [enum: created, price, updated, score]
 **sortOrder** | **String**| The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.). | [optional] [default to desc] [enum: asc, ascending, desc, descending, up, down]
 **minPrice** | **Float**| The minimum price of listings to be returned by a search result. | [optional]
 **maxPrice** | **Float**| The maximum price of listings to be returned by a search result. | [optional]
 **taxonomyId** | **Integer**| The numeric taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information. | [optional]
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



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves Listings associated to a Shop that are featured.

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
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    Integer limit = 25; // Integer | The maximum number of results to return.
    Integer offset = 0; // Integer | The number of records to skip before selecting the first result.
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
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **limit** | **Integer**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of records to skip before selecting the first result. | [optional] [default to 0]

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
> ShopListingWithAssociations getListing(listingId, includes)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a listing record by listing ID.

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
    Integer listingId = 56; // Integer | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    List<String> includes = Arrays.asList(); // List<String> | An enumerated string that attaches a valid association. Acceptable inputs are 'shop', 'images', 'user' and 'translations'. Default value is an empty array.
    try {
      ShopListingWithAssociations result = apiInstance.getListing(listingId, includes);
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
 **listingId** | **Integer**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **includes** | [**List&lt;String&gt;**](String.md)| An enumerated string that attaches a valid association. Acceptable inputs are &#39;shop&#39;, &#39;images&#39;, &#39;user&#39; and &#39;translations&#39;. Default value is an empty array. | [optional] [enum: Shipping, Images, Shop, User, Translations]

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



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get a listing&#39;s properties

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
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    Integer listingId = 56; // Integer | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
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
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **listingId** | **Integer**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |

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



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-01 wt-mr-xs-2\&quot;&gt; Feedback only &lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Give feedback&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;Development for this endpoint is in progress. It will only return a 501 response.&lt;/p&gt;&lt;/div&gt;  Retrieves a listing&#39;s property

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
    Integer listingId = 56; // Integer | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Integer propertyId = 56; // Integer | The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties).
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
 **listingId** | **Integer**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **propertyId** | **Integer**| The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties). |

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



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Allows to query multiple listing ids at once. Limit 100 ids maximum per query.

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
    List<Integer> listingIds = Arrays.asList(); // List<Integer> | The list of numeric IDS for the listings in a specific Etsy shop.
    List<String> includes = Arrays.asList(); // List<String> | An enumerated string that attaches a valid association. Acceptable inputs are 'shop', 'images', 'user' and 'translations'. Default value is an empty array.
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
 **listingIds** | [**List&lt;Integer&gt;**](Integer.md)| The list of numeric IDS for the listings in a specific Etsy shop. |
 **includes** | [**List&lt;String&gt;**](String.md)| An enumerated string that attaches a valid association. Acceptable inputs are &#39;shop&#39;, &#39;images&#39;, &#39;user&#39; and &#39;translations&#39;. Default value is an empty array. | [optional] [enum: Shipping, Images, Shop, User, Translations]

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
> ShopListings getListingsByShop(shopId, state, limit, offset, sortOn, sortOrder)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Endpoint to list Listings that belong to a Shop. Listings can be filtered using the &#39;state&#39; param.

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
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    String state = "active"; // String | An enumerated string from any of: active or inactive. Note: Setting a draft listing to active will also publish the listing on etsy.com. Setting a sold out listing to active will update the quantity to 1 and renew the listing on etsy.com.
    Integer limit = 25; // Integer | The maximum number of results to return.
    Integer offset = 0; // Integer | The number of records to skip before selecting the first result.
    String sortOn = "created"; // String | The value to sort a search result of listings on. NOTE: sort_on only works when combined with one of the search options (keywords, region, etc.). 
    String sortOrder = "asc"; // String | The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.).
    try {
      ShopListings result = apiInstance.getListingsByShop(shopId, state, limit, offset, sortOn, sortOrder);
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
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **state** | **String**| An enumerated string from any of: active or inactive. Note: Setting a draft listing to active will also publish the listing on etsy.com. Setting a sold out listing to active will update the quantity to 1 and renew the listing on etsy.com. | [optional] [default to active] [enum: active, inactive, sold_out, draft, expired]
 **limit** | **Integer**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of records to skip before selecting the first result. | [optional] [default to 0]
 **sortOn** | **String**| The value to sort a search result of listings on. NOTE: sort_on only works when combined with one of the search options (keywords, region, etc.).  | [optional] [default to created] [enum: created, price, updated, score]
 **sortOrder** | **String**| The ascending(up) or descending(down) order to sort listings by. NOTE: sort_order only works when combined with one of the search options (keywords, region, etc.). | [optional] [default to desc] [enum: asc, ascending, desc, descending, up, down]

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
**200** | A list of Listings |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingsByShopReceipt"></a>
# **getListingsByShopReceipt**
> ShopListings getListingsByShopReceipt(receiptId, shopId, limit, offset)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Gets all listings associated with a receipt.

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
    Integer receiptId = 56; // Integer | The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    Integer limit = 25; // Integer | The maximum number of results to return.
    Integer offset = 0; // Integer | The number of records to skip before selecting the first result.
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
 **receiptId** | **Integer**| The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. |
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **limit** | **Integer**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of records to skip before selecting the first result. | [optional] [default to 0]

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



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves all the listings from the section of a specific shop.

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
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    List<Integer> shopSectionIds = Arrays.asList(); // List<Integer> | A list of numeric IDS for all sections in a specific Etsy shop.
    Integer limit = 25; // Integer | The maximum number of results to return.
    Integer offset = 0; // Integer | The number of records to skip before selecting the first result.
    String sortOn = "created"; // String | The value to sort a search result of listings on. NOTE: sort_on only works when combined with one of the search options (keywords, region, etc.). 
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
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **shopSectionIds** | [**List&lt;Integer&gt;**](Integer.md)| A list of numeric IDS for all sections in a specific Etsy shop. |
 **limit** | **Integer**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Integer**| The number of records to skip before selecting the first result. | [optional] [default to 0]
 **sortOn** | **String**| The value to sort a search result of listings on. NOTE: sort_on only works when combined with one of the search options (keywords, region, etc.).  | [optional] [default to created] [enum: created, price, updated, score]
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
> ShopListing updateListing(shopId, listingId, imageIds, quantity, price, title, description, materials, shouldAutoRenew, shippingProfileId, shopSectionId, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isTaxable, taxonomyId, tags, whoMade, whenMade, featuredRank, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, state, isSupply, productionPartnerIds, type)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates a listing, identified by a listing ID, for a specific shop identified by a shop ID.

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
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    Integer listingId = 56; // Integer | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    List<Integer> imageIds = Arrays.asList(); // List<Integer> | An array of numeric image IDs of the images in a listing, which can include up to 10 images.
    Integer quantity = 56; // Integer | The positive non-zero number of products available for purchase in the listing. Note: The listing quantity is the sum of available offering quantities. You can request the quantities for individual offerings from the ListingInventory resource using the [getListingInventory](/documentation/reference#operation/getListingInventory) endpoint.
    Float price = 3.4F; // Float | The positive non-zero price of the product. (Sold product listings are private) Note: The price is the minimum possible price. The getInventory method requests exact prices for available offerings.
    String title = "title_example"; // String | The listing's title string. Valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, & and + characters once each.
    String description = "description_example"; // String | A description string of the product for sale in the listing.
    List<String> materials = Arrays.asList(); // List<String> | A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null.
    Boolean shouldAutoRenew = true; // Boolean | When true, renews a listing for four months upon expriation. If set to true when previously false, etsy.com renews the listing before it expires, but the renewal period starts immidiately rather than extending the listing's expiration date. Any unused time remaining on the listing is lost. Renewals result in charges to a user's bill.
    Integer shippingProfileId = 56; // Integer | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type=physical.
    Integer shopSectionId = 56; // Integer | The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null.
    Float itemWeight = 3.4F; // Float | The numeric weight of the product measured in units set in 'item_weight_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemLength = 3.4F; // Float | The numeric length of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemWidth = 3.4F; // Float | The numeric width of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    Float itemHeight = 3.4F; // Float | The numeric height of the product measured in units set in 'item_dimensions_unit'. Default value is null. If set, the value must be greater than 0.
    String itemWeightUnit = "oz"; // String | A string defining the units used to measure the weight of the product. Default value is null.
    String itemDimensionsUnit = "in"; // String | A string defining the units used to measure the dimensions of the product. Default value is null.
    Boolean isTaxable = true; // Boolean | When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout.
    Integer taxonomyId = 56; // Integer | The numeric taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information.
    List<String> tags = Arrays.asList(); // List<String> | A comma-separated list of tag strings for the listing. Valid tag strings contain only letters, numbers, whitespace characters, -, ', ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-'™©®]/u) Default value is null.
    String whoMade = "i_did"; // String | An enumerated string inidcated who made the product. Helps buyers locate the listing under the Handmade heading. Requires 'is_supply' and 'when_made'.
    String whenMade = "made_to_order"; // String | An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires 'is_supply' and 'who_made'.
    Integer featuredRank = 56; // Integer | The positive non-zero numeric position in the featured listings of the shop, with rank 1 listings appearing in the left-most position in featured listing on a shop’s home page.
    Boolean isPersonalizable = true; // Boolean | When true, this listing is personalizable. The default value is null.
    Boolean personalizationIsRequired = true; // Boolean | When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is 'true'.
    Integer personalizationCharCountMax = 56; // Integer | This an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is 'true'.
    String personalizationInstructions = "personalizationInstructions_example"; // String | A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is 'true'.
    String state = "active"; // String | An enumerated string from any of: active or inactive. Note: Setting a draft listing to active will also publish the listing on etsy.com. Setting a sold out listing to active will update the quantity to 1 and renew the listing on etsy.com.
    Boolean isSupply = true; // Boolean | When true, tags the listing as a supply product, else indicates that it's a finished product. Helps buyers locate the listing under the Supplies heading. Requires 'who_made' and 'when_made'.
    List<Integer> productionPartnerIds = Arrays.asList(); // List<Integer> | An array of unique IDs of production partner ids.
    String type = "physical"; // String | An enumerated type string that indicates whether the listing is physical or a digital download.
    try {
      ShopListing result = apiInstance.updateListing(shopId, listingId, imageIds, quantity, price, title, description, materials, shouldAutoRenew, shippingProfileId, shopSectionId, itemWeight, itemLength, itemWidth, itemHeight, itemWeightUnit, itemDimensionsUnit, isTaxable, taxonomyId, tags, whoMade, whenMade, featuredRank, isPersonalizable, personalizationIsRequired, personalizationCharCountMax, personalizationInstructions, state, isSupply, productionPartnerIds, type);
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
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **listingId** | **Integer**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **imageIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of numeric image IDs of the images in a listing, which can include up to 10 images. | [optional]
 **quantity** | **Integer**| The positive non-zero number of products available for purchase in the listing. Note: The listing quantity is the sum of available offering quantities. You can request the quantities for individual offerings from the ListingInventory resource using the [getListingInventory](/documentation/reference#operation/getListingInventory) endpoint. | [optional]
 **price** | **Float**| The positive non-zero price of the product. (Sold product listings are private) Note: The price is the minimum possible price. The getInventory method requests exact prices for available offerings. | [optional]
 **title** | **String**| The listing&#39;s title string. Valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, &amp; and + characters once each. | [optional]
 **description** | **String**| A description string of the product for sale in the listing. | [optional]
 **materials** | [**List&lt;String&gt;**](String.md)| A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. | [optional]
 **shouldAutoRenew** | **Boolean**| When true, renews a listing for four months upon expriation. If set to true when previously false, etsy.com renews the listing before it expires, but the renewal period starts immidiately rather than extending the listing&#39;s expiration date. Any unused time remaining on the listing is lost. Renewals result in charges to a user&#39;s bill. | [optional]
 **shippingProfileId** | **Integer**| The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. | [optional]
 **shopSectionId** | **Integer**| The numeric ID of the [shop section](/documentation/reference#tag/Shop-Section) for this listing. Default value is null. | [optional]
 **itemWeight** | **Float**| The numeric weight of the product measured in units set in &#39;item_weight_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemLength** | **Float**| The numeric length of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWidth** | **Float**| The numeric width of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemHeight** | **Float**| The numeric height of the product measured in units set in &#39;item_dimensions_unit&#39;. Default value is null. If set, the value must be greater than 0. | [optional]
 **itemWeightUnit** | **String**| A string defining the units used to measure the weight of the product. Default value is null. | [optional] [enum: oz, lb, g, kg]
 **itemDimensionsUnit** | **String**| A string defining the units used to measure the dimensions of the product. Default value is null. | [optional] [enum: in, ft, mm, cm, m, yd, inches]
 **isTaxable** | **Boolean**| When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout. | [optional]
 **taxonomyId** | **Integer**| The numeric taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information. | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A comma-separated list of tag strings for the listing. Valid tag strings contain only letters, numbers, whitespace characters, -, &#39;, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-&#39;™©®]/u) Default value is null. | [optional]
 **whoMade** | **String**| An enumerated string inidcated who made the product. Helps buyers locate the listing under the Handmade heading. Requires &#39;is_supply&#39; and &#39;when_made&#39;. | [optional] [enum: i_did, someone_else, collective]
 **whenMade** | **String**| An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires &#39;is_supply&#39; and &#39;who_made&#39;. | [optional] [enum: made_to_order, 2020_2022, 2010_2019, 2003_2009, before_2003, 2000_2002, 1990s, 1980s, 1970s, 1960s, 1950s, 1940s, 1930s, 1920s, 1910s, 1900s, 1800s, 1700s, before_1700]
 **featuredRank** | **Integer**| The positive non-zero numeric position in the featured listings of the shop, with rank 1 listings appearing in the left-most position in featured listing on a shop’s home page. | [optional]
 **isPersonalizable** | **Boolean**| When true, this listing is personalizable. The default value is null. | [optional]
 **personalizationIsRequired** | **Boolean**| When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationCharCountMax** | **Integer**| This an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **personalizationInstructions** | **String**| A string representing instructions for the buyer to enter the personalization. Will only change if is_personalizable is &#39;true&#39;. | [optional]
 **state** | **String**| An enumerated string from any of: active or inactive. Note: Setting a draft listing to active will also publish the listing on etsy.com. Setting a sold out listing to active will update the quantity to 1 and renew the listing on etsy.com. | [optional] [enum: active, inactive]
 **isSupply** | **Boolean**| When true, tags the listing as a supply product, else indicates that it&#39;s a finished product. Helps buyers locate the listing under the Supplies heading. Requires &#39;who_made&#39; and &#39;when_made&#39;. | [optional]
 **productionPartnerIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of unique IDs of production partner ids. | [optional]
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
**409** | There was a request conflict with current state of the target resource. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateListingProperty"></a>
# **updateListingProperty**
> ListingPropertyValue updateListingProperty(shopId, listingId, propertyId, valueIds, values, scaleId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates or populates the properties list defining product offerings for a listing. Each offering requires both a &#x60;value&#x60; and a &#x60;value_id&#x60; that are valid for a &#x60;scale_id&#x60; assigned to the listing or that you assign to the listing with this request.

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
    Integer shopId = 56; // Integer | The unique positive non-zero numeric ID for an Etsy Shop.
    Integer listingId = 56; // Integer | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Integer propertyId = 56; // Integer | The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties).
    List<Integer> valueIds = Arrays.asList(); // List<Integer> | An array of unique IDs of multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different sizes of a product, then the value ID list contains value IDs for each size.
    List<String> values = Arrays.asList(); // List<String> | An array of value strings for multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different colored products, then the values array contains the color strings for each color.
    Integer scaleId = 56; // Integer | The numeric ID of a single Etsy.com measurement scale. For example, for shoe size, there are three `scale_id`s available - *UK*, *US/Canada*, and *EU*, where *US/Canada* has `scale_id` 19.
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
 **shopId** | **Integer**| The unique positive non-zero numeric ID for an Etsy Shop. |
 **listingId** | **Integer**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |
 **propertyId** | **Integer**| The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties). |
 **valueIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of unique IDs of multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different sizes of a product, then the value ID list contains value IDs for each size. |
 **values** | [**List&lt;String&gt;**](String.md)| An array of value strings for multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different colored products, then the values array contains the color strings for each color. |
 **scaleId** | **Integer**| The numeric ID of a single Etsy.com measurement scale. For example, for shoe size, there are three &#x60;scale_id&#x60;s available - *UK*, *US/Canada*, and *EU*, where *US/Canada* has &#x60;scale_id&#x60; 19. | [optional]

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


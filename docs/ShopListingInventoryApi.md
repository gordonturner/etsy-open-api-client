# ShopListingInventoryApi

All URIs are relative to *https://openapi.etsy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListingInventory**](ShopListingInventoryApi.md#getListingInventory) | **GET** /v3/application/listings/{listing_id}/inventory | 
[**updateListingInventory**](ShopListingInventoryApi.md#updateListingInventory) | **PUT** /v3/application/listings/{listing_id}/inventory | 


<a name="getListingInventory"></a>
# **getListingInventory**
> ListingInventoryWithAssociations getListingInventory(listingId, showDeleted, includes)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves the inventory record for a listing. Listings you did not edit using the Etsy.com inventory tools have no inventory records. This endpoint returns SKU data if you are the owner of the inventory records being fetched.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingInventoryApi;

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

    ShopListingInventoryApi apiInstance = new ShopListingInventoryApi(defaultClient);
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Boolean showDeleted = true; // Boolean | A boolean value for inventory whether to include deleted products and their offerings. Default value is false.
    String includes = "Listing"; // String | An enumerated string that attaches a valid association. Default value is null.
    try {
      ListingInventoryWithAssociations result = apiInstance.getListingInventory(listingId, showDeleted, includes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingInventoryApi#getListingInventory");
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
 **showDeleted** | **Boolean**| A boolean value for inventory whether to include deleted products and their offerings. Default value is false. | [optional]
 **includes** | **String**| An enumerated string that attaches a valid association. Default value is null. | [optional] [enum: Listing]

### Return type

[**ListingInventoryWithAssociations**](ListingInventoryWithAssociations.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single listing inventory record. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateListingInventory"></a>
# **updateListingInventory**
> ListingInventory updateListingInventory(listingId, inlineObject3)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates the inventory for a listing identified by a listing ID. The update fails if the supplied values for product sku, offering quantity, and/or price are incompatible with values in &#x60;*_on_property_*&#x60; fields. When setting a price, assign a float equal to amount divided by divisor as specified in the Money resource.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingInventoryApi;

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

    ShopListingInventoryApi apiInstance = new ShopListingInventoryApi(defaultClient);
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      ListingInventory result = apiInstance.updateListingInventory(listingId, inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingInventoryApi#updateListingInventory");
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**ListingInventory**](ListingInventory.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single listing&#39;s inventory record. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |


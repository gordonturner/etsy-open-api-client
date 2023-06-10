# ShopListingTranslationApi

All URIs are relative to *https://openapi.etsy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createListingTranslation**](ShopListingTranslationApi.md#createListingTranslation) | **POST** /v3/application/shops/{shop_id}/listings/{listing_id}/translations/{language} | 
[**getListingTranslation**](ShopListingTranslationApi.md#getListingTranslation) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/translations/{language} | 
[**updateListingTranslation**](ShopListingTranslationApi.md#updateListingTranslation) | **PUT** /v3/application/shops/{shop_id}/listings/{listing_id}/translations/{language} | 


<a name="createListingTranslation"></a>
# **createListingTranslation**
> ListingTranslation createListingTranslation(shopId, listingId, language, title, description, tags)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates a ListingTranslation by listing_id and language

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingTranslationApi;

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

    ShopListingTranslationApi apiInstance = new ShopListingTranslationApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    String language = "language_example"; // String | The IETF language tag for the language of this translation. Ex: `de`, `en`, `es`, `fr`, `it`, `ja`, `nl`, `pl`, `pt`.
    String title = "title_example"; // String | The title of the Listing of this Translation.
    String description = "description_example"; // String | The description of the Listing of this Translation.
    List<String> tags = Arrays.asList(); // List<String> | The tags of the Listing of this Translation.
    try {
      ListingTranslation result = apiInstance.createListingTranslation(shopId, listingId, language, title, description, tags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingTranslationApi#createListingTranslation");
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
 **language** | **String**| The IETF language tag for the language of this translation. Ex: &#x60;de&#x60;, &#x60;en&#x60;, &#x60;es&#x60;, &#x60;fr&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;nl&#x60;, &#x60;pl&#x60;, &#x60;pt&#x60;. |
 **title** | **String**| The title of the Listing of this Translation. |
 **description** | **String**| The description of the Listing of this Translation. |
 **tags** | [**List&lt;String&gt;**](String.md)| The tags of the Listing of this Translation. | [optional]

### Return type

[**ListingTranslation**](ListingTranslation.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ListingTranslation |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingTranslation"></a>
# **getListingTranslation**
> ListingTranslation getListingTranslation(shopId, listingId, language)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get a Translation for a Listing in the given language

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingTranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingTranslationApi apiInstance = new ShopListingTranslationApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    String language = "language_example"; // String | The IETF language tag for the language of this translation. Ex: `de`, `en`, `es`, `fr`, `it`, `ja`, `nl`, `pl`, `pt`.
    try {
      ListingTranslation result = apiInstance.getListingTranslation(shopId, listingId, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingTranslationApi#getListingTranslation");
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
 **language** | **String**| The IETF language tag for the language of this translation. Ex: &#x60;de&#x60;, &#x60;en&#x60;, &#x60;es&#x60;, &#x60;fr&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;nl&#x60;, &#x60;pl&#x60;, &#x60;pt&#x60;. |

### Return type

[**ListingTranslation**](ListingTranslation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ListingTranslation |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="updateListingTranslation"></a>
# **updateListingTranslation**
> ListingTranslation updateListingTranslation(shopId, listingId, language, title, description, tags)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Updates a ListingTranslation by listing_id and language

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingTranslationApi;

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

    ShopListingTranslationApi apiInstance = new ShopListingTranslationApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    String language = "language_example"; // String | The IETF language tag for the language of this translation. Ex: `de`, `en`, `es`, `fr`, `it`, `ja`, `nl`, `pl`, `pt`.
    String title = "title_example"; // String | The title of the Listing of this Translation.
    String description = "description_example"; // String | The description of the Listing of this Translation.
    List<String> tags = Arrays.asList(); // List<String> | The tags of the Listing of this Translation.
    try {
      ListingTranslation result = apiInstance.updateListingTranslation(shopId, listingId, language, title, description, tags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingTranslationApi#updateListingTranslation");
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
 **language** | **String**| The IETF language tag for the language of this translation. Ex: &#x60;de&#x60;, &#x60;en&#x60;, &#x60;es&#x60;, &#x60;fr&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;nl&#x60;, &#x60;pl&#x60;, &#x60;pt&#x60;. |
 **title** | **String**| The title of the Listing of this Translation. |
 **description** | **String**| The description of the Listing of this Translation. |
 **tags** | [**List&lt;String&gt;**](String.md)| The tags of the Listing of this Translation. | [optional]

### Return type

[**ListingTranslation**](ListingTranslation.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ListingTranslation |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |


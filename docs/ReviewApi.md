# ReviewApi

All URIs are relative to *https://openapi.etsy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReviewsByListing**](ReviewApi.md#getReviewsByListing) | **GET** /v3/application/listings/{listing_id}/reviews | 
[**getReviewsByShop**](ReviewApi.md#getReviewsByShop) | **GET** /v3/application/shops/{shop_id}/reviews | 


<a name="getReviewsByListing"></a>
# **getReviewsByListing**
> ListingReviews getReviewsByListing(listingId, limit, offset, minCreated, maxCreated)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 to retrieve the reviews for a listing given its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ReviewApi apiInstance = new ReviewApi(defaultClient);
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    Long minCreated = 56L; // Long | The earliest unix timestamp for when a record was created.
    Long maxCreated = 56L; // Long | The latest unix timestamp for when a record was created.
    try {
      ListingReviews result = apiInstance.getReviewsByListing(listingId, limit, offset, minCreated, maxCreated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewApi#getReviewsByListing");
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
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]
 **minCreated** | **Long**| The earliest unix timestamp for when a record was created. | [optional]
 **maxCreated** | **Long**| The latest unix timestamp for when a record was created. | [optional]

### Return type

[**ListingReviews**](ListingReviews.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of Transaction Reviews by Listing ID |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getReviewsByShop"></a>
# **getReviewsByShop**
> TransactionReviews getReviewsByShop(shopId, limit, offset, minCreated, maxCreated)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 to retrieve the reviews from a shop given its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ReviewApi apiInstance = new ReviewApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    Long minCreated = 56L; // Long | The earliest unix timestamp for when a record was created.
    Long maxCreated = 56L; // Long | The latest unix timestamp for when a record was created.
    try {
      TransactionReviews result = apiInstance.getReviewsByShop(shopId, limit, offset, minCreated, maxCreated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewApi#getReviewsByShop");
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
 **minCreated** | **Long**| The earliest unix timestamp for when a record was created. | [optional]
 **maxCreated** | **Long**| The latest unix timestamp for when a record was created. | [optional]

### Return type

[**TransactionReviews**](TransactionReviews.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of Transaction Reviews By Shop ID |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |


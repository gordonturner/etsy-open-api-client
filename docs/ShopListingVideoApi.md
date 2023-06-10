# ShopListingVideoApi

All URIs are relative to *https://openapi.etsy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteListingVideo**](ShopListingVideoApi.md#deleteListingVideo) | **DELETE** /v3/application/shops/{shop_id}/listings/{listing_id}/videos/{video_id} | 
[**getListingVideo**](ShopListingVideoApi.md#getListingVideo) | **GET** /v3/application/listings/{listing_id}/videos/{video_id} | 
[**getListingVideos**](ShopListingVideoApi.md#getListingVideos) | **GET** /v3/application/listings/{listing_id}/videos | 
[**uploadListingVideo**](ShopListingVideoApi.md#uploadListingVideo) | **POST** /v3/application/shops/{shop_id}/listings/{listing_id}/videos | 


<a name="deleteListingVideo"></a>
# **deleteListingVideo**
> deleteListingVideo(shopId, listingId, videoId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to delete a listing video. A copy of the video remains on our servers, and so a deleted video may be re-associated with the listing without re-uploading the original video; see uploadListingVideo.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingVideoApi;

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

    ShopListingVideoApi apiInstance = new ShopListingVideoApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Long videoId = 56L; // Long | The unique ID of a video associated with a listing.
    try {
      apiInstance.deleteListingVideo(shopId, listingId, videoId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingVideoApi#deleteListingVideo");
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
 **videoId** | **Long**| The unique ID of a video associated with a listing. |

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
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**204** | The ListingVideo resource was correctly deleted |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingVideo"></a>
# **getListingVideo**
> ListingVideo getListingVideo(videoId, listingId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a single video associated with the given listing. Requesting a video from a listing returns an empty result.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingVideoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingVideoApi apiInstance = new ShopListingVideoApi(defaultClient);
    Long videoId = 56L; // Long | The unique ID of a video associated with a listing.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    try {
      ListingVideo result = apiInstance.getListingVideo(videoId, listingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingVideoApi#getListingVideo");
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
 **videoId** | **Long**| The unique ID of a video associated with a listing. |
 **listingId** | **Long**| The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. |

### Return type

[**ListingVideo**](ListingVideo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The metatdata for a video associated with a listing. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingVideos"></a>
# **getListingVideos**
> ListingVideos getListingVideos(listingId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves all listing video resources for a listing with a specific listing ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingVideoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingVideoApi apiInstance = new ShopListingVideoApi(defaultClient);
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    try {
      ListingVideos result = apiInstance.getListingVideos(listingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingVideoApi#getListingVideos");
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

[**ListingVideos**](ListingVideos.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of videos for a listing |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="uploadListingVideo"></a>
# **uploadListingVideo**
> ListingVideo uploadListingVideo(shopId, listingId, videoId, video, name)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Uploads a new video for a listing, or associates an existing video with a specific listing. You must either provide the &#x60;video_id&#x60; of an existing video, or the name and binary file data for a video to upload.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingVideoApi;

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

    ShopListingVideoApi apiInstance = new ShopListingVideoApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Long videoId = 56L; // Long | The unique ID of a video associated with a listing.
    File video = new File("/path/to/file"); // File | A video file to upload.
    String name = "name_example"; // String | The file name string for the video to upload.
    try {
      ListingVideo result = apiInstance.uploadListingVideo(shopId, listingId, videoId, video, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingVideoApi#uploadListingVideo");
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
 **videoId** | **Long**| The unique ID of a video associated with a listing. | [optional]
 **video** | **File**| A video file to upload. | [optional]
 **name** | **String**| The file name string for the video to upload. | [optional]

### Return type

[**ListingVideo**](ListingVideo.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The metadata for a file associated with a digital listing. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |


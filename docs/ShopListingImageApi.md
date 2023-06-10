# ShopListingImageApi

All URIs are relative to *https://openapi.etsy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteListingImage**](ShopListingImageApi.md#deleteListingImage) | **DELETE** /v3/application/shops/{shop_id}/listings/{listing_id}/images/{listing_image_id} | 
[**getListingImage**](ShopListingImageApi.md#getListingImage) | **GET** /v3/application/listings/{listing_id}/images/{listing_image_id} | 
[**getListingImageDeprecated**](ShopListingImageApi.md#getListingImageDeprecated) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/images/{listing_image_id} | 
[**getListingImages**](ShopListingImageApi.md#getListingImages) | **GET** /v3/application/listings/{listing_id}/images | 
[**getListingImagesDeprecated**](ShopListingImageApi.md#getListingImagesDeprecated) | **GET** /v3/application/shops/{shop_id}/listings/{listing_id}/images | 
[**uploadListingImage**](ShopListingImageApi.md#uploadListingImage) | **POST** /v3/application/shops/{shop_id}/listings/{listing_id}/images | 


<a name="deleteListingImage"></a>
# **deleteListingImage**
> deleteListingImage(shopId, listingId, listingImageId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to delete a listing image. A copy of the file remains on our servers, and so a deleted image may be re-associated with the listing without re-uploading the original image; see uploadListingImage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingImageApi;

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

    ShopListingImageApi apiInstance = new ShopListingImageApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Long listingImageId = 56L; // Long | The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction.
    try {
      apiInstance.deleteListingImage(shopId, listingId, listingImageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingImageApi#deleteListingImage");
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
 **listingImageId** | **Long**| The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction. |

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
**204** | The ListingImage resource was correctly deleted |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingImage"></a>
# **getListingImage**
> ListingImage getListingImage(listingId, listingImageId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves the references and metadata for a listing image with a specific image ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingImageApi apiInstance = new ShopListingImageApi(defaultClient);
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Long listingImageId = 56L; // Long | The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction.
    try {
      ListingImage result = apiInstance.getListingImage(listingId, listingImageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingImageApi#getListingImage");
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
 **listingImageId** | **Long**| The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction. |

### Return type

[**ListingImage**](ListingImage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ListingImage |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingImageDeprecated"></a>
# **getListingImageDeprecated**
> ListingImage getListingImageDeprecated(shopId, listingId, listingImageId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  NOTE: This endpoint is being deprecated in favor of not requiring the shops/:shop_id as part of the URL. Retrieves the references and metadata for a listing image with a specific image ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingImageApi apiInstance = new ShopListingImageApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    Long listingImageId = 56L; // Long | The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction.
    try {
      ListingImage result = apiInstance.getListingImageDeprecated(shopId, listingId, listingImageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingImageApi#getListingImageDeprecated");
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
 **listingImageId** | **Long**| The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction. |

### Return type

[**ListingImage**](ListingImage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ListingImage |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingImages"></a>
# **getListingImages**
> ListingImages getListingImages(listingId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves all listing image resources for a listing with a specific listing ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingImageApi apiInstance = new ShopListingImageApi(defaultClient);
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    try {
      ListingImages result = apiInstance.getListingImages(listingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingImageApi#getListingImages");
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

[**ListingImages**](ListingImages.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of ListingImage |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getListingImagesDeprecated"></a>
# **getListingImagesDeprecated**
> ListingImages getListingImagesDeprecated(shopId, listingId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  NOTE: This endpoint is being deprecated in favor of not requiring the shops/:shop_id as part of the URL. Retrieves all listing image resources for a listing with a specific listing ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.etsy.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ShopListingImageApi apiInstance = new ShopListingImageApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    try {
      ListingImages result = apiInstance.getListingImagesDeprecated(shopId, listingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingImageApi#getListingImagesDeprecated");
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

[**ListingImages**](ListingImages.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ListingImage |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="uploadListingImage"></a>
# **uploadListingImage**
> ListingImage uploadListingImage(shopId, listingId, image, listingImageId, rank, overwrite, isWatermarked, altText)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/discussions\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Uploads or assigns an image to a listing identified by a shop ID with a listing ID. To upload a new image, set the image file as the value for the &#x60;image&#x60; parameter. You can assign a previously deleted image to a listing using the deleted image&#39;s image ID in the &#x60;listing_image_id&#x60; parameter. When a request contains both &#x60;image&#x60; and &#x60;listing_image_id&#x60; parameter values, the endpoint uploads the image in the &#x60;image&#x60; parameter only. Note: When uploading a new image, data such as colors and size may return as null values due to asynchronous processing of the image. Use getListingImage endpoint to fetch these values.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopListingImageApi;

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

    ShopListingImageApi apiInstance = new ShopListingImageApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long listingId = 56L; // Long | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction.
    File image = new File("/path/to/file"); // File | The file name string of a file to upload
    Long listingImageId = 56L; // Long | The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction.
    Long rank = 1L; // Long | The positive non-zero numeric position in the images displayed in a listing, with rank 1 images appearing in the left-most position in a listing.
    Boolean overwrite = false; // Boolean | When true, this request replaces the existing image at a given rank.
    Boolean isWatermarked = false; // Boolean | When true, indicates that the uploaded image has a watermark.
    String altText = "\"\""; // String | Alt text for the listing image. Max length 250 characters.
    try {
      ListingImage result = apiInstance.uploadListingImage(shopId, listingId, image, listingImageId, rank, overwrite, isWatermarked, altText);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopListingImageApi#uploadListingImage");
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
 **image** | **File**| The file name string of a file to upload | [optional]
 **listingImageId** | **Long**| The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction. | [optional]
 **rank** | **Long**| The positive non-zero numeric position in the images displayed in a listing, with rank 1 images appearing in the left-most position in a listing. | [optional] [default to 1]
 **overwrite** | **Boolean**| When true, this request replaces the existing image at a given rank. | [optional] [default to false]
 **isWatermarked** | **Boolean**| When true, indicates that the uploaded image has a watermark. | [optional] [default to false]
 **altText** | **String**| Alt text for the listing image. Max length 250 characters. | [optional] [default to &quot;&quot;]

### Return type

[**ListingImage**](ListingImage.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A single ListingImage |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**409** | There was a request conflict with the current state of the target resource. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |


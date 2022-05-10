# ShopReceiptApi

All URIs are relative to *https://openapi.etsy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReceiptShipment**](ShopReceiptApi.md#createReceiptShipment) | **POST** /v3/application/shops/{shop_id}/receipts/{receipt_id}/tracking | 
[**getShopReceipt**](ShopReceiptApi.md#getShopReceipt) | **GET** /v3/application/shops/{shop_id}/receipts/{receipt_id} | 
[**getShopReceipts**](ShopReceiptApi.md#getShopReceipts) | **GET** /v3/application/shops/{shop_id}/receipts | 


<a name="createReceiptShipment"></a>
# **createReceiptShipment**
> ShopReceipt createReceiptShipment(shopId, receiptId, trackingCode, carrierName, sendBcc, noteToBuyer)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Submits tracking information for a Shop Receipt, which creates a Shop Receipt Shipment entry for the given receipt_id. Each time you successfully submit tracking info, Etsy sends a notification email to the buyer User. When send_bcc is true, Etsy sends shipping notifications to the seller as well. When tracking_code and carrier_name aren&#39;t sent, the receipt is marked as shipped only. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopReceiptApi;

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

    ShopReceiptApi apiInstance = new ShopReceiptApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long receiptId = 56L; // Long | The receipt to submit tracking for.
    String trackingCode = "trackingCode_example"; // String | The tracking code for this receipt.
    String carrierName = "carrierName_example"; // String | The carrier name for this receipt.
    Boolean sendBcc = true; // Boolean | If true, the shipping notification will be sent to the seller as well
    String noteToBuyer = "noteToBuyer_example"; // String | Message to include in notification to the buyer.
    try {
      ShopReceipt result = apiInstance.createReceiptShipment(shopId, receiptId, trackingCode, carrierName, sendBcc, noteToBuyer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopReceiptApi#createReceiptShipment");
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
 **receiptId** | **Long**| The receipt to submit tracking for. |
 **trackingCode** | **String**| The tracking code for this receipt. | [optional]
 **carrierName** | **String**| The carrier name for this receipt. | [optional]
 **sendBcc** | **Boolean**| If true, the shipping notification will be sent to the seller as well | [optional]
 **noteToBuyer** | **String**| Message to include in notification to the buyer. | [optional]

### Return type

[**ShopReceipt**](ShopReceipt.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single ShopReceipt |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**409** | There was a request conflict with current state of the target resource. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getShopReceipt"></a>
# **getShopReceipt**
> ShopReceipt getShopReceipt(shopId, receiptId)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a receipt, identified by a receipt id, from an Etsy shop

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopReceiptApi;

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

    ShopReceiptApi apiInstance = new ShopReceiptApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long receiptId = 56L; // Long | The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.
    try {
      ShopReceipt result = apiInstance.getShopReceipt(shopId, receiptId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopReceiptApi#getShopReceipt");
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
 **receiptId** | **Long**| The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. |

### Return type

[**ShopReceipt**](ShopReceipt.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A single Shop Receipt |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |

<a name="getShopReceipts"></a>
# **getShopReceipts**
> ShopReceipts getShopReceipts(shopId, minCreated, maxCreated, minLastModified, maxLastModified, limit, offset, wasPaid, wasShipped, wasDelivered)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Requests the Shop Receipts from a specific Shop, unfiltered or filtered by receipt id range or offset, date, paid, and/or shipped purchases.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShopReceiptApi;

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

    ShopReceiptApi apiInstance = new ShopReceiptApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long minCreated = 56L; // Long | The earliest unix timestamp for when a record was created.
    Long maxCreated = 56L; // Long | The latest unix timestamp for when a record was created.
    Long minLastModified = 56L; // Long | The earliest unix timestamp for when a record last changed.
    Long maxLastModified = 56L; // Long | The latest unix timestamp for when a record last changed.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    Boolean wasPaid = true; // Boolean | When true, the seller recieved payment for the product(s) in this receipt.
    Boolean wasShipped = true; // Boolean | When true, the seller shipped the product(s) in this receipt.
    Boolean wasDelivered = true; // Boolean | When true, returns receipts that have been delivered.
    try {
      ShopReceipts result = apiInstance.getShopReceipts(shopId, minCreated, maxCreated, minLastModified, maxLastModified, limit, offset, wasPaid, wasShipped, wasDelivered);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShopReceiptApi#getShopReceipts");
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
 **minCreated** | **Long**| The earliest unix timestamp for when a record was created. | [optional]
 **maxCreated** | **Long**| The latest unix timestamp for when a record was created. | [optional]
 **minLastModified** | **Long**| The earliest unix timestamp for when a record last changed. | [optional]
 **maxLastModified** | **Long**| The latest unix timestamp for when a record last changed. | [optional]
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]
 **wasPaid** | **Boolean**| When true, the seller recieved payment for the product(s) in this receipt. | [optional]
 **wasShipped** | **Boolean**| When true, the seller shipped the product(s) in this receipt. | [optional]
 **wasDelivered** | **Boolean**| When true, returns receipts that have been delivered. | [optional]

### Return type

[**ShopReceipts**](ShopReceipts.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Shop Receipts |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**404** | A resource could not be found. See the error message for details. |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |


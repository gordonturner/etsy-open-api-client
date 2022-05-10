# LedgerEntryApi

All URIs are relative to *https://openapi.etsy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShopPaymentAccountLedgerEntries**](LedgerEntryApi.md#getShopPaymentAccountLedgerEntries) | **GET** /v3/application/shops/{shop_id}/payment-account/ledger-entries | 


<a name="getShopPaymentAccountLedgerEntries"></a>
# **getShopPaymentAccountLedgerEntries**
> PaymentAccountLedgerEntries getShopPaymentAccountLedgerEntries(shopId, minCreated, maxCreated, limit, offset)



&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get a Shop Payment Account Ledger&#39;s Entries

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LedgerEntryApi;

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

    LedgerEntryApi apiInstance = new LedgerEntryApi(defaultClient);
    Long shopId = 56L; // Long | The unique positive non-zero numeric ID for an Etsy Shop.
    Long minCreated = 56L; // Long | The earliest unix timestamp for when a record was created.
    Long maxCreated = 56L; // Long | The latest unix timestamp for when a record was created.
    Long limit = 25L; // Long | The maximum number of results to return.
    Long offset = 0L; // Long | The number of records to skip before selecting the first result.
    try {
      PaymentAccountLedgerEntries result = apiInstance.getShopPaymentAccountLedgerEntries(shopId, minCreated, maxCreated, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LedgerEntryApi#getShopPaymentAccountLedgerEntries");
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
 **minCreated** | **Long**| The earliest unix timestamp for when a record was created. |
 **maxCreated** | **Long**| The latest unix timestamp for when a record was created. |
 **limit** | **Long**| The maximum number of results to return. | [optional] [default to 25]
 **offset** | **Long**| The number of records to skip before selecting the first result. | [optional] [default to 0]

### Return type

[**PaymentAccountLedgerEntries**](PaymentAccountLedgerEntries.md)

### Authorization

[api_key](../README.md#api_key), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of PaymentAccountLedgerEntries |  -  |
**400** | There was a problem with the request data. See the error message for details. |  -  |
**403** | The request attempted to perform an operation it is not allowed to. See the error message for details. |  -  |
**401** | The request lacks valid authentication credentials. See the error message for details. |  -  |
**500** | The server encountered an internal error. See the error message for details. |  -  |


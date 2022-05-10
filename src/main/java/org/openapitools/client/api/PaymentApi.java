/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace <a class=\"wt-text-link wt-p-xs-0\" href=\"https://www.etsy.com/developers/documentation\">Etsy's Open API v2</a>, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/issues/new/choose\">please add an issue in Github</a>.</p></div>&copy; 2021-2022 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: developers@etsy.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ErrorSchema;
import org.openapitools.client.model.Payments;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getPaymentAccountLedgerEntryPayments
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param ledgerEntryIds  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of Payments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentAccountLedgerEntryPaymentsCall(Long shopId, List<Long> ledgerEntryIds, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/application/shops/{shop_id}/payment-account/ledger-entries/payments"
            .replaceAll("\\{" + "shop_id" + "\\}", localVarApiClient.escapeString(shopId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ledgerEntryIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "ledger_entry_ids", ledgerEntryIds));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentAccountLedgerEntryPaymentsValidateBeforeCall(Long shopId, List<Long> ledgerEntryIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'shopId' is set
        if (shopId == null) {
            throw new ApiException("Missing the required parameter 'shopId' when calling getPaymentAccountLedgerEntryPayments(Async)");
        }
        
        // verify the required parameter 'ledgerEntryIds' is set
        if (ledgerEntryIds == null) {
            throw new ApiException("Missing the required parameter 'ledgerEntryIds' when calling getPaymentAccountLedgerEntryPayments(Async)");
        }
        

        okhttp3.Call localVarCall = getPaymentAccountLedgerEntryPaymentsCall(shopId, ledgerEntryIds, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get a Payment from a PaymentAccount Ledger Entry ID, if applicable
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param ledgerEntryIds  (required)
     * @return Payments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of Payments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public Payments getPaymentAccountLedgerEntryPayments(Long shopId, List<Long> ledgerEntryIds) throws ApiException {
        ApiResponse<Payments> localVarResp = getPaymentAccountLedgerEntryPaymentsWithHttpInfo(shopId, ledgerEntryIds);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get a Payment from a PaymentAccount Ledger Entry ID, if applicable
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param ledgerEntryIds  (required)
     * @return ApiResponse&lt;Payments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of Payments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Payments> getPaymentAccountLedgerEntryPaymentsWithHttpInfo(Long shopId, List<Long> ledgerEntryIds) throws ApiException {
        okhttp3.Call localVarCall = getPaymentAccountLedgerEntryPaymentsValidateBeforeCall(shopId, ledgerEntryIds, null);
        Type localVarReturnType = new TypeToken<Payments>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Get a Payment from a PaymentAccount Ledger Entry ID, if applicable
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param ledgerEntryIds  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of Payments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentAccountLedgerEntryPaymentsAsync(Long shopId, List<Long> ledgerEntryIds, final ApiCallback<Payments> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentAccountLedgerEntryPaymentsValidateBeforeCall(shopId, ledgerEntryIds, _callback);
        Type localVarReturnType = new TypeToken<Payments>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPayments
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param paymentIds A comma-separated array of Payment IDs numbers. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of payments from a specific shop. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentsCall(Long shopId, List<Long> paymentIds, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/application/shops/{shop_id}/payments"
            .replaceAll("\\{" + "shop_id" + "\\}", localVarApiClient.escapeString(shopId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (paymentIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "payment_ids", paymentIds));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentsValidateBeforeCall(Long shopId, List<Long> paymentIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'shopId' is set
        if (shopId == null) {
            throw new ApiException("Missing the required parameter 'shopId' when calling getPayments(Async)");
        }
        
        // verify the required parameter 'paymentIds' is set
        if (paymentIds == null) {
            throw new ApiException("Missing the required parameter 'paymentIds' when calling getPayments(Async)");
        }
        

        okhttp3.Call localVarCall = getPaymentsCall(shopId, paymentIds, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrives a list of payments from a shop identified by &#x60;shop_id&#x60;. You can also filter results using a list of payment IDs.
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param paymentIds A comma-separated array of Payment IDs numbers. (required)
     * @return Payments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of payments from a specific shop. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public Payments getPayments(Long shopId, List<Long> paymentIds) throws ApiException {
        ApiResponse<Payments> localVarResp = getPaymentsWithHttpInfo(shopId, paymentIds);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrives a list of payments from a shop identified by &#x60;shop_id&#x60;. You can also filter results using a list of payment IDs.
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param paymentIds A comma-separated array of Payment IDs numbers. (required)
     * @return ApiResponse&lt;Payments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of payments from a specific shop. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Payments> getPaymentsWithHttpInfo(Long shopId, List<Long> paymentIds) throws ApiException {
        okhttp3.Call localVarCall = getPaymentsValidateBeforeCall(shopId, paymentIds, null);
        Type localVarReturnType = new TypeToken<Payments>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrives a list of payments from a shop identified by &#x60;shop_id&#x60;. You can also filter results using a list of payment IDs.
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param paymentIds A comma-separated array of Payment IDs numbers. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of payments from a specific shop. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentsAsync(Long shopId, List<Long> paymentIds, final ApiCallback<Payments> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentsValidateBeforeCall(shopId, paymentIds, _callback);
        Type localVarReturnType = new TypeToken<Payments>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getShopPaymentByReceiptId
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param receiptId The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single payment </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getShopPaymentByReceiptIdCall(Long shopId, Long receiptId, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/application/shops/{shop_id}/receipts/{receipt_id}/payments"
            .replaceAll("\\{" + "shop_id" + "\\}", localVarApiClient.escapeString(shopId.toString()))
            .replaceAll("\\{" + "receipt_id" + "\\}", localVarApiClient.escapeString(receiptId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getShopPaymentByReceiptIdValidateBeforeCall(Long shopId, Long receiptId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'shopId' is set
        if (shopId == null) {
            throw new ApiException("Missing the required parameter 'shopId' when calling getShopPaymentByReceiptId(Async)");
        }
        
        // verify the required parameter 'receiptId' is set
        if (receiptId == null) {
            throw new ApiException("Missing the required parameter 'receiptId' when calling getShopPaymentByReceiptId(Async)");
        }
        

        okhttp3.Call localVarCall = getShopPaymentByReceiptIdCall(shopId, receiptId, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a payment from a specific receipt, identified by &#x60;receipt_id&#x60;, from a specific shop, identified by &#x60;shop_id&#x60;
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param receiptId The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. (required)
     * @return Payments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single payment </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public Payments getShopPaymentByReceiptId(Long shopId, Long receiptId) throws ApiException {
        ApiResponse<Payments> localVarResp = getShopPaymentByReceiptIdWithHttpInfo(shopId, receiptId);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a payment from a specific receipt, identified by &#x60;receipt_id&#x60;, from a specific shop, identified by &#x60;shop_id&#x60;
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param receiptId The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. (required)
     * @return ApiResponse&lt;Payments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single payment </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Payments> getShopPaymentByReceiptIdWithHttpInfo(Long shopId, Long receiptId) throws ApiException {
        okhttp3.Call localVarCall = getShopPaymentByReceiptIdValidateBeforeCall(shopId, receiptId, null);
        Type localVarReturnType = new TypeToken<Payments>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Retrieves a payment from a specific receipt, identified by &#x60;receipt_id&#x60;, from a specific shop, identified by &#x60;shop_id&#x60;
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param receiptId The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single payment </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getShopPaymentByReceiptIdAsync(Long shopId, Long receiptId, final ApiCallback<Payments> _callback) throws ApiException {

        okhttp3.Call localVarCall = getShopPaymentByReceiptIdValidateBeforeCall(shopId, receiptId, _callback);
        Type localVarReturnType = new TypeToken<Payments>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

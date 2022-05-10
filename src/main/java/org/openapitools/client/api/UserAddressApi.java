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
import org.openapitools.client.model.UserAddress;
import org.openapitools.client.model.UserAddresses;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAddressApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserAddressApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserAddressApi(ApiClient apiClient) {
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
     * Build call for apiApplicationOpenAPIUsersAddressesDelete
     * @param userAddressId The numeric ID of the user&#39;s address. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The User Address resource was correctly deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiApplicationOpenAPIUsersAddressesDeleteCall(Long userAddressId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v3/application/user/addresses/{user_address_id}"
            .replaceAll("\\{" + "user_address_id" + "\\}", localVarApiClient.escapeString(userAddressId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiApplicationOpenAPIUsersAddressesDeleteValidateBeforeCall(Long userAddressId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userAddressId' is set
        if (userAddressId == null) {
            throw new ApiException("Missing the required parameter 'userAddressId' when calling apiApplicationOpenAPIUsersAddressesDelete(Async)");
        }
        

        okhttp3.Call localVarCall = apiApplicationOpenAPIUsersAddressesDeleteCall(userAddressId, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to delete a UserAddress for a User.
     * @param userAddressId The numeric ID of the user&#39;s address. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The User Address resource was correctly deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public void apiApplicationOpenAPIUsersAddressesDelete(Long userAddressId) throws ApiException {
        apiApplicationOpenAPIUsersAddressesDeleteWithHttpInfo(userAddressId);
    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to delete a UserAddress for a User.
     * @param userAddressId The numeric ID of the user&#39;s address. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The User Address resource was correctly deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> apiApplicationOpenAPIUsersAddressesDeleteWithHttpInfo(Long userAddressId) throws ApiException {
        okhttp3.Call localVarCall = apiApplicationOpenAPIUsersAddressesDeleteValidateBeforeCall(userAddressId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to delete a UserAddress for a User.
     * @param userAddressId The numeric ID of the user&#39;s address. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The User Address resource was correctly deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiApplicationOpenAPIUsersAddressesDeleteAsync(Long userAddressId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiApplicationOpenAPIUsersAddressesDeleteValidateBeforeCall(userAddressId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserAddress
     * @param userAddressId The numeric ID of the user&#39;s address. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single UserAddress </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> This endpoint is not functional at this time. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserAddressCall(Long userAddressId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v3/application/user/addresses/{user_address_id}"
            .replaceAll("\\{" + "user_address_id" + "\\}", localVarApiClient.escapeString(userAddressId.toString()));

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
    private okhttp3.Call getUserAddressValidateBeforeCall(Long userAddressId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userAddressId' is set
        if (userAddressId == null) {
            throw new ApiException("Missing the required parameter 'userAddressId' when calling getUserAddress(Async)");
        }
        

        okhttp3.Call localVarCall = getUserAddressCall(userAddressId, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-01 wt-mr-xs-2\&quot;&gt; Feedback only &lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Give feedback&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;Development for this endpoint is in progress. It will only return a 501 response.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to retrieve a UserAddress for a User.
     * @param userAddressId The numeric ID of the user&#39;s address. (required)
     * @return UserAddress
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single UserAddress </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> This endpoint is not functional at this time. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public UserAddress getUserAddress(Long userAddressId) throws ApiException {
        ApiResponse<UserAddress> localVarResp = getUserAddressWithHttpInfo(userAddressId);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-01 wt-mr-xs-2\&quot;&gt; Feedback only &lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Give feedback&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;Development for this endpoint is in progress. It will only return a 501 response.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to retrieve a UserAddress for a User.
     * @param userAddressId The numeric ID of the user&#39;s address. (required)
     * @return ApiResponse&lt;UserAddress&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single UserAddress </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> This endpoint is not functional at this time. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserAddress> getUserAddressWithHttpInfo(Long userAddressId) throws ApiException {
        okhttp3.Call localVarCall = getUserAddressValidateBeforeCall(userAddressId, null);
        Type localVarReturnType = new TypeToken<UserAddress>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-01 wt-mr-xs-2\&quot;&gt; Feedback only &lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Give feedback&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;Development for this endpoint is in progress. It will only return a 501 response.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to retrieve a UserAddress for a User.
     * @param userAddressId The numeric ID of the user&#39;s address. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single UserAddress </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> This endpoint is not functional at this time. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserAddressAsync(Long userAddressId, final ApiCallback<UserAddress> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserAddressValidateBeforeCall(userAddressId, _callback);
        Type localVarReturnType = new TypeToken<UserAddress>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserAddresses
     * @param limit The maximum number of results to return. (optional, default to 25)
     * @param offset The number of records to skip before selecting the first result. (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of UserAddress records </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserAddressesCall(Long limit, Long offset, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v3/application/user/addresses";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
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
    private okhttp3.Call getUserAddressesValidateBeforeCall(Long limit, Long offset, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getUserAddressesCall(limit, offset, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to retrieve UserAddresses for a User.
     * @param limit The maximum number of results to return. (optional, default to 25)
     * @param offset The number of records to skip before selecting the first result. (optional, default to 0)
     * @return UserAddresses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of UserAddress records </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public UserAddresses getUserAddresses(Long limit, Long offset) throws ApiException {
        ApiResponse<UserAddresses> localVarResp = getUserAddressesWithHttpInfo(limit, offset);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to retrieve UserAddresses for a User.
     * @param limit The maximum number of results to return. (optional, default to 25)
     * @param offset The number of records to skip before selecting the first result. (optional, default to 0)
     * @return ApiResponse&lt;UserAddresses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of UserAddress records </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserAddresses> getUserAddressesWithHttpInfo(Long limit, Long offset) throws ApiException {
        okhttp3.Call localVarCall = getUserAddressesValidateBeforeCall(limit, offset, null);
        Type localVarReturnType = new TypeToken<UserAddresses>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Open API V3 endpoint to retrieve UserAddresses for a User.
     * @param limit The maximum number of results to return. (optional, default to 25)
     * @param offset The number of records to skip before selecting the first result. (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of UserAddress records </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserAddressesAsync(Long limit, Long offset, final ApiCallback<UserAddresses> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserAddressesValidateBeforeCall(limit, offset, _callback);
        Type localVarReturnType = new TypeToken<UserAddresses>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

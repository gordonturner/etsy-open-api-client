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
import org.openapitools.client.model.InlineObject8;
import org.openapitools.client.model.ListingVariationImages;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopListingVariationImageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ShopListingVariationImageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShopListingVariationImageApi(ApiClient apiClient) {
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
     * Build call for getListingVariationImages
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param listingId The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of ListingVariationImages </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getListingVariationImagesCall(Integer shopId, Integer listingId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v3/application/shops/{shop_id}/listings/{listing_id}/variation-images"
            .replaceAll("\\{" + "shop_id" + "\\}", localVarApiClient.escapeString(shopId.toString()))
            .replaceAll("\\{" + "listing_id" + "\\}", localVarApiClient.escapeString(listingId.toString()));

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

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getListingVariationImagesValidateBeforeCall(Integer shopId, Integer listingId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'shopId' is set
        if (shopId == null) {
            throw new ApiException("Missing the required parameter 'shopId' when calling getListingVariationImages(Async)");
        }
        
        // verify the required parameter 'listingId' is set
        if (listingId == null) {
            throw new ApiException("Missing the required parameter 'listingId' when calling getListingVariationImages(Async)");
        }
        

        okhttp3.Call localVarCall = getListingVariationImagesCall(shopId, listingId, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Gets all variation images on a listing.
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param listingId The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. (required)
     * @return ListingVariationImages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of ListingVariationImages </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ListingVariationImages getListingVariationImages(Integer shopId, Integer listingId) throws ApiException {
        ApiResponse<ListingVariationImages> localVarResp = getListingVariationImagesWithHttpInfo(shopId, listingId);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Gets all variation images on a listing.
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param listingId The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. (required)
     * @return ApiResponse&lt;ListingVariationImages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of ListingVariationImages </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListingVariationImages> getListingVariationImagesWithHttpInfo(Integer shopId, Integer listingId) throws ApiException {
        okhttp3.Call localVarCall = getListingVariationImagesValidateBeforeCall(shopId, listingId, null);
        Type localVarReturnType = new TypeToken<ListingVariationImages>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Gets all variation images on a listing.
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param listingId The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of ListingVariationImages </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getListingVariationImagesAsync(Integer shopId, Integer listingId, final ApiCallback<ListingVariationImages> _callback) throws ApiException {

        okhttp3.Call localVarCall = getListingVariationImagesValidateBeforeCall(shopId, listingId, _callback);
        Type localVarReturnType = new TypeToken<ListingVariationImages>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVariationImages
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param listingId The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. (required)
     * @param inlineObject8  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single ListingVariationImage </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There was a request conflict with current state of the target resource. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVariationImagesCall(Integer shopId, Integer listingId, InlineObject8 inlineObject8, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inlineObject8;

        // create path and map variables
        String localVarPath = "/v3/application/shops/{shop_id}/listings/{listing_id}/variation-images"
            .replaceAll("\\{" + "shop_id" + "\\}", localVarApiClient.escapeString(shopId.toString()))
            .replaceAll("\\{" + "listing_id" + "\\}", localVarApiClient.escapeString(listingId.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateVariationImagesValidateBeforeCall(Integer shopId, Integer listingId, InlineObject8 inlineObject8, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'shopId' is set
        if (shopId == null) {
            throw new ApiException("Missing the required parameter 'shopId' when calling updateVariationImages(Async)");
        }
        
        // verify the required parameter 'listingId' is set
        if (listingId == null) {
            throw new ApiException("Missing the required parameter 'listingId' when calling updateVariationImages(Async)");
        }
        

        okhttp3.Call localVarCall = updateVariationImagesCall(shopId, listingId, inlineObject8, _callback);
        return localVarCall;

    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates variation images on a listing.\\n\\nvariation_images is an array with inputs for the property_id, value_id, and image_id fields. image_ids are associated with a ListingImage on the Listing associated with the provided listing_id. property_id and value_id pairs are associated with a ListingProduct on the Listing associated with the provided listing_id. variation_images does not contain any duplicates. variation_images does not contain more than one property_id as variation images can only be associated on one property. The update overwrites all existing variation images on a listing, so if your request is successful, the variation images on the listing will be exactly those you specify. 
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param listingId The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. (required)
     * @param inlineObject8  (optional)
     * @return ListingVariationImages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single ListingVariationImage </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There was a request conflict with current state of the target resource. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ListingVariationImages updateVariationImages(Integer shopId, Integer listingId, InlineObject8 inlineObject8) throws ApiException {
        ApiResponse<ListingVariationImages> localVarResp = updateVariationImagesWithHttpInfo(shopId, listingId, inlineObject8);
        return localVarResp.getData();
    }

    /**
     * 
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates variation images on a listing.\\n\\nvariation_images is an array with inputs for the property_id, value_id, and image_id fields. image_ids are associated with a ListingImage on the Listing associated with the provided listing_id. property_id and value_id pairs are associated with a ListingProduct on the Listing associated with the provided listing_id. variation_images does not contain any duplicates. variation_images does not contain more than one property_id as variation images can only be associated on one property. The update overwrites all existing variation images on a listing, so if your request is successful, the variation images on the listing will be exactly those you specify. 
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param listingId The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. (required)
     * @param inlineObject8  (optional)
     * @return ApiResponse&lt;ListingVariationImages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single ListingVariationImage </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There was a request conflict with current state of the target resource. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListingVariationImages> updateVariationImagesWithHttpInfo(Integer shopId, Integer listingId, InlineObject8 inlineObject8) throws ApiException {
        okhttp3.Call localVarCall = updateVariationImagesValidateBeforeCall(shopId, listingId, inlineObject8, null);
        Type localVarReturnType = new TypeToken<ListingVariationImages>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * &lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;span class&#x3D;\&quot;wt-badge wt-badge--notification-03 wt-bg-slime-tint wt-mr-xs-2\&quot;&gt;General Release&lt;/span&gt;&lt;a class&#x3D;\&quot;wt-text-link\&quot; href&#x3D;\&quot;https://github.com/etsy/open-api/issues/new/choose\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener noreferrer\&quot;&gt;Report bug&lt;/a&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;wt-display-flex-xs wt-align-items-center wt-mt-xs-2 wt-mb-xs-3\&quot;&gt;&lt;p class&#x3D;\&quot;wt-text-body-01 banner-text\&quot;&gt;This endpoint is ready for production use.&lt;/p&gt;&lt;/div&gt;  Creates variation images on a listing.\\n\\nvariation_images is an array with inputs for the property_id, value_id, and image_id fields. image_ids are associated with a ListingImage on the Listing associated with the provided listing_id. property_id and value_id pairs are associated with a ListingProduct on the Listing associated with the provided listing_id. variation_images does not contain any duplicates. variation_images does not contain more than one property_id as variation images can only be associated on one property. The update overwrites all existing variation images on a listing, so if your request is successful, the variation images on the listing will be exactly those you specify. 
     * @param shopId The unique positive non-zero numeric ID for an Etsy Shop. (required)
     * @param listingId The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. (required)
     * @param inlineObject8  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single ListingVariationImage </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A resource could not be found. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> There was a problem with the request data. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There was a request conflict with current state of the target resource. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request attempted to perform an operation it is not allowed to. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request lacks valid authentication credentials. See the error message for details. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The server encountered an internal error. See the error message for details. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVariationImagesAsync(Integer shopId, Integer listingId, InlineObject8 inlineObject8, final ApiCallback<ListingVariationImages> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateVariationImagesValidateBeforeCall(shopId, listingId, inlineObject8, _callback);
        Type localVarReturnType = new TypeToken<ListingVariationImages>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

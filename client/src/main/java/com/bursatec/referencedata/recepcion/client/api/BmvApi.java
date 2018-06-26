

package com.bursatec.referencedata.recepcion.client.api;

import com.bursatec.referencedata.recepcion.client.ApiCallback;
import com.bursatec.referencedata.recepcion.client.ApiClient;
import com.bursatec.referencedata.recepcion.client.ApiException;
import com.bursatec.referencedata.recepcion.client.ApiResponse;
import com.bursatec.referencedata.recepcion.client.Configuration;
import com.bursatec.referencedata.recepcion.client.Pair;
import com.bursatec.referencedata.recepcion.client.ProgressRequestBody;
import com.bursatec.referencedata.recepcion.client.ProgressResponseBody;
import com.bursatec.referencedata.recepcion.client.model.ReferenceData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BmvApi {
    private ApiClient apiClient;

    public BmvApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BmvApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for receiveHeartBeat
     * @param userid The user name for login (required)
     * @param password The user name for login (required)
     * @param refDataId Last sequence generated by receive operation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call receiveHeartBeatCall(String userid, String password, Long refDataId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/referenceData/heartbeat";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("userid", userid));
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("password", password));
        if (refDataId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("refDataId", refDataId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call receiveHeartBeatValidateBeforeCall(String userid, String password, Long refDataId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new ApiException("Missing the required parameter 'userid' when calling receiveHeartBeat(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling receiveHeartBeat(Async)");
        }
        
        // verify the required parameter 'refDataId' is set
        if (refDataId == null) {
            throw new ApiException("Missing the required parameter 'refDataId' when calling receiveHeartBeat(Async)");
        }
        

        com.squareup.okhttp.Call call = receiveHeartBeatCall(userid, password, refDataId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Receives heartbeats.
     * 
     * @param userid The user name for login (required)
     * @param password The user name for login (required)
     * @param refDataId Last sequence generated by receive operation (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void receiveHeartBeat(String userid, String password, Long refDataId) throws ApiException {
        receiveHeartBeatWithHttpInfo(userid, password, refDataId);
    }

    /**
     * Receives heartbeats.
     * 
     * @param userid The user name for login (required)
     * @param password The user name for login (required)
     * @param refDataId Last sequence generated by receive operation (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> receiveHeartBeatWithHttpInfo(String userid, String password, Long refDataId) throws ApiException {
        com.squareup.okhttp.Call call = receiveHeartBeatValidateBeforeCall(userid, password, refDataId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Receives heartbeats. (asynchronously)
     * 
     * @param userid The user name for login (required)
     * @param password The user name for login (required)
     * @param refDataId Last sequence generated by receive operation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call receiveHeartBeatAsync(String userid, String password, Long refDataId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = receiveHeartBeatValidateBeforeCall(userid, password, refDataId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for receiveRefData
     * @param userid The user name for login (required)
     * @param password The user name for login (required)
     * @param referenceData  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call receiveRefDataCall(String userid, String password, List<ReferenceData> referenceData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = referenceData;

        // create path and map variables
        String localVarPath = "/v1/referenceData/receive";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("userid", userid));
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("password", password));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call receiveRefDataValidateBeforeCall(String userid, String password, List<ReferenceData> referenceData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new ApiException("Missing the required parameter 'userid' when calling receiveRefData(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling receiveRefData(Async)");
        }
        
        // verify the required parameter 'referenceData' is set
        if (referenceData == null) {
            throw new ApiException("Missing the required parameter 'referenceData' when calling receiveRefData(Async)");
        }
        

        com.squareup.okhttp.Call call = receiveRefDataCall(userid, password, referenceData, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Receives Data Reference.
     * 
     * @param userid The user name for login (required)
     * @param password The user name for login (required)
     * @param referenceData  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void receiveRefData(String userid, String password, List<ReferenceData> referenceData) throws ApiException {
        receiveRefDataWithHttpInfo(userid, password, referenceData);
    }

    /**
     * Receives Data Reference.
     * 
     * @param userid The user name for login (required)
     * @param password The user name for login (required)
     * @param referenceData  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> receiveRefDataWithHttpInfo(String userid, String password, List<ReferenceData> referenceData) throws ApiException {
        com.squareup.okhttp.Call call = receiveRefDataValidateBeforeCall(userid, password, referenceData, null, null);
        return apiClient.execute(call);
    }

    /**
     * Receives Data Reference. (asynchronously)
     * 
     * @param userid The user name for login (required)
     * @param password The user name for login (required)
     * @param referenceData  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call receiveRefDataAsync(String userid, String password, List<ReferenceData> referenceData, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = receiveRefDataValidateBeforeCall(userid, password, referenceData, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}

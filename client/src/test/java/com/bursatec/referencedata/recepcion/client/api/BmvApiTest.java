package com.bursatec.referencedata.recepcion.client.api;

import com.bursatec.referencedata.recepcion.client.ApiException;
import com.bursatec.referencedata.recepcion.client.ApiResponse;
import com.bursatec.referencedata.recepcion.client.model.ReferenceData;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * API tests for BmvApi
 */
@Ignore
public class BmvApiTest {

    private final BmvApi api = new BmvApi();

//    MockWebServer server;

//    @Before
//    public void init() throws IOException {
//        server = new MockWebServer();
//        server.enqueue(new MockResponse().setResponseCode(200));
//        server.enqueue(new MockResponse().setResponseCode(200));
//        server.start();
//    }
    /**
     * Receives Data Reference.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void receiveRefDataOKTest() throws ApiException, InterruptedException {
        String userid = "bmv";
        String password = "c893bad68927b457dbed39460e6afd62";
        Long heartbeatSeq = 2L;
        List<ReferenceData> referenceData = new ArrayList<>();

        referenceData.add(new ReferenceData(1L, "Zx2018XXXXXXXXXX"));
        referenceData.add(new ReferenceData(2L, "Zx2018XXXXXXXXXY"));

//        String path = server.url("/").toString();
//        path = path.substring(0, path.length() - 1);
        api.getApiClient().setBasePath("http://localhost:8080");
        ApiResponse<Void> response = api.receiveRefDataWithHttpInfo(userid, password, referenceData);
        assertEquals(200, response.getStatusCode());

//        RecordedRequest request1 = server.takeRequest();
//        assertEquals("/v1/referenceData/receive?userid=" + userid + "&password=" + password, request1.getPath());
//        assertEquals("[{\"refDataId\":1,\"refData\":\"Zx2018XXXXXXXXXX\"},{\"refDataId\":2,\"refData\":\"Zx2018XXXXXXXXXY\"}]", request1.getBody().readUtf8());

        ApiResponse<Void> responseHeartbeat = api.receiveHeartBeatWithHttpInfo(userid, password, heartbeatSeq);
        assertEquals(200, responseHeartbeat.getStatusCode());

//        RecordedRequest request2 = server.takeRequest();
//        assertEquals("/v1/referenceData/heartbeat?userid=" + userid + "&password=" + password + "&refDataId=" + heartbeatSeq, request2.getPath());
    }
    
}

/*
 * BrowserCat API
 * Providing purr-fect headless browser access via utility endpoints and direct websocket connections.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@browsercat.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BrowsersApi
 */
@Disabled
public class BrowsersApiTest {

    private static BrowsersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BrowsersApi(apiClient);
    }

    /**
     * Connect to a browser
     *
     * Create a websocket connection to a headless browser. Currently only supports Playwright.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void establishConnectionTest() throws ApiException {
        String region = null;
        api.establishConnection()
                .region(region)
                .execute();
        // TODO: test validations
    }

}

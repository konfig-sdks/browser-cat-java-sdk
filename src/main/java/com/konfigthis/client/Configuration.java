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


package com.konfigthis.client;

@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();
    public boolean verifyingSsl = true;
    public String host = "https://api.browsercat.com";
    public String jwtCookie;
    public String token;
    public String keyHeader;

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}

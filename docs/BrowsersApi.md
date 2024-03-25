# BrowsersApi

All URIs are relative to *https://api.browsercat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**establishConnection**](BrowsersApi.md#establishConnection) | **GET** /connect | Connect to a browser |


<a name="establishConnection"></a>
# **establishConnection**
> establishConnection().region(region).execute();

Connect to a browser

Create a websocket connection to a headless browser. Currently only supports Playwright.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrowsersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.browsercat.com";
    
    configuration.jwtCookie  = "YOUR API KEY";
    
    configuration.keyHeader  = "YOUR API KEY";
    BrowserCat client = new BrowserCat(configuration);
    String region = "ams";
    try {
      client
              .browsers
              .establishConnection()
              .region(region)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrowsersApi#establishConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .browsers
              .establishConnection()
              .region(region)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrowsersApi#establishConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | **String**|  | [optional] [enum: ams, iad, atl, bog, bos, otp, maa, ord, dfw, den, eze, fra, gdl, hkg, jnb, lhr, lax, mad, mia, yul, bom, cdg, phx, qro, gig, sjc, scl, gru, sea, ewr, sin, arn, syd, nrt, yyz, waw] |

### Return type

null (empty response body)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


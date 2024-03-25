# ServerApi

All URIs are relative to *https://api.browsercat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkHealthStatus**](ServerApi.md#checkHealthStatus) | **GET** /health | Show server health |
| [**showMetrics**](ServerApi.md#showMetrics) | **GET** /metrics | Show server metrics |


<a name="checkHealthStatus"></a>
# **checkHealthStatus**
> ServerCheckHealthStatusResponse checkHealthStatus().execute();

Show server health

Lightweight endpoint to check server health.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.browsercat.com";
    BrowserCat client = new BrowserCat(configuration);
    try {
      ServerCheckHealthStatusResponse result = client
              .server
              .checkHealthStatus()
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getUptime());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#checkHealthStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServerCheckHealthStatusResponse> response = client
              .server
              .checkHealthStatus()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#checkHealthStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServerCheckHealthStatusResponse**](ServerCheckHealthStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Server Status |  -  |

<a name="showMetrics"></a>
# **showMetrics**
> showMetrics().execute();

Show server metrics

Returns server metrics in Prometheus format. Use this endpoint to monitor server health.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.browsercat.com";
    BrowserCat client = new BrowserCat(configuration);
    try {
      client
              .server
              .showMetrics()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#showMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .server
              .showMetrics()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerApi#showMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


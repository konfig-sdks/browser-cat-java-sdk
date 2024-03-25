# OpenApiApi

All URIs are relative to *https://api.browsercat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exploreFunctionality**](OpenApiApi.md#exploreFunctionality) | **GET** /openapi | Open OpenAPI docs |
| [**getSpecJson**](OpenApiApi.md#getSpecJson) | **GET** /openapi.json | Retrieve API spec as JSON |
| [**getYamlSpec**](OpenApiApi.md#getYamlSpec) | **GET** /openapi.yaml | Retrieve API spec as YAML |


<a name="exploreFunctionality"></a>
# **exploreFunctionality**
> String exploreFunctionality().execute();

Open OpenAPI docs

Open OpenAPI docs explorer. Easily explore functionality, request formats, and response types.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OpenApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.browsercat.com";
    BrowserCat client = new BrowserCat(configuration);
    try {
      String result = client
              .openApi
              .exploreFunctionality()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApiApi#exploreFunctionality");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .openApi
              .exploreFunctionality()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApiApi#exploreFunctionality");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OpenAPI HTML |  -  |

<a name="getSpecJson"></a>
# **getSpecJson**
> OpenApiGetSpecJsonResponse getSpecJson().execute();

Retrieve API spec as JSON

Retrieve API spec in JSON format. Use this format to generate types, clients, and mocks in your language of choice.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OpenApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.browsercat.com";
    BrowserCat client = new BrowserCat(configuration);
    try {
      OpenApiGetSpecJsonResponse result = client
              .openApi
              .getSpecJson()
              .execute();
      System.out.println(result);
      System.out.println(result.getOpenapi());
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApiApi#getSpecJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OpenApiGetSpecJsonResponse> response = client
              .openApi
              .getSpecJson()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApiApi#getSpecJson");
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

[**OpenApiGetSpecJsonResponse**](OpenApiGetSpecJsonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OpenAPI JSON |  -  |

<a name="getYamlSpec"></a>
# **getYamlSpec**
> OpenApiGetYamlSpecResponse getYamlSpec().execute();

Retrieve API spec as YAML

Retrieve API spec in YAML format. Use this format to generate types, clients, and mocks in your language of choice.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OpenApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.browsercat.com";
    BrowserCat client = new BrowserCat(configuration);
    try {
      OpenApiGetYamlSpecResponse result = client
              .openApi
              .getYamlSpec()
              .execute();
      System.out.println(result);
      System.out.println(result.getOpenapi());
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApiApi#getYamlSpec");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OpenApiGetYamlSpecResponse> response = client
              .openApi
              .getYamlSpec()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenApiApi#getYamlSpec");
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

[**OpenApiGetYamlSpecResponse**](OpenApiGetYamlSpecResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/x-yaml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OpenAPI YAML |  -  |


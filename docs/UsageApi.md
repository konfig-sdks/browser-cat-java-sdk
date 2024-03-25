# UsageApi

All URIs are relative to *https://api.browsercat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEventData**](UsageApi.md#getEventData) | **GET** /usage/sessions/{sessionId}/events/{eventId} | Retrieve data for an event |
| [**getRequestData**](UsageApi.md#getRequestData) | **GET** /usage/sessions/{sessionId} | Retrieve data for a request |
| [**getSessionRange**](UsageApi.md#getSessionRange) | **GET** /usage/sessions | List sessions within range |
| [**listAggregateAccountUsage**](UsageApi.md#listAggregateAccountUsage) | **GET** /usage/buckets | List aggregate account usage |
| [**listRequestEvents**](UsageApi.md#listRequestEvents) | **GET** /usage/sessions/{sessionId}/events | List events for a request |


<a name="getEventData"></a>
# **getEventData**
> UsageEvent getEventData(sessionId, eventId).execute();

Retrieve data for an event

Retrieve a particular event for a request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageApi;
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
    String sessionId = "sessionId_example";
    String eventId = "eventId_example";
    try {
      UsageEvent result = client
              .usage
              .getEventData(sessionId, eventId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsageEventId());
      System.out.println(result.getUsageSessionId());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getData());
      System.out.println(result.getSentAt());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getSessionId());
      System.out.println(result.getEventId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#getEventData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsageEvent> response = client
              .usage
              .getEventData(sessionId, eventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#getEventData");
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
| **sessionId** | **String**|  | |
| **eventId** | **String**|  | |

### Return type

[**UsageEvent**](UsageEvent.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getRequestData"></a>
# **getRequestData**
> UsageSessionPublic getRequestData(sessionId).execute();

Retrieve data for a request

Retrieve data for a particular request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageApi;
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
    String sessionId = "sessionId_example";
    try {
      UsageSessionPublic result = client
              .usage
              .getRequestData(sessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsageSessionId());
      System.out.println(result.getClerkOrgId());
      System.out.println(result.getClerkUserId());
      System.out.println(result.getKeyId());
      System.out.println(result.getMethod());
      System.out.println(result.getEndpoint());
      System.out.println(result.getStatus());
      System.out.println(result.getMachineId());
      System.out.println(result.getMachineRegion());
      System.out.println(result.getBrowserType());
      System.out.println(result.getBrowserVersion());
      System.out.println(result.getAgentType());
      System.out.println(result.getAgentVersion());
      System.out.println(result.getStartedAt());
      System.out.println(result.getEndedAt());
      System.out.println(result.getSessionId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#getRequestData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsageSessionPublic> response = client
              .usage
              .getRequestData(sessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#getRequestData");
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
| **sessionId** | **String**|  | |

### Return type

[**UsageSessionPublic**](UsageSessionPublic.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSessionRange"></a>
# **getSessionRange**
> List&lt;UsageSessionPublic&gt; getSessionRange().limit(limit).offset(offset).afterDate(afterDate).beforeDate(beforeDate).execute();

List sessions within range

List all sessions within a time range.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageApi;
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
    Integer limit = 100;
    Object offset = 0;
    OffsetDateTime afterDate = OffsetDateTime.now();
    OffsetDateTime beforeDate = OffsetDateTime.now();
    try {
      List<UsageSessionPublic> result = client
              .usage
              .getSessionRange()
              .limit(limit)
              .offset(offset)
              .afterDate(afterDate)
              .beforeDate(beforeDate)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#getSessionRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UsageSessionPublic>> response = client
              .usage
              .getSessionRange()
              .limit(limit)
              .offset(offset)
              .afterDate(afterDate)
              .beforeDate(beforeDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#getSessionRange");
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
| **limit** | **Integer**|  | [optional] [default to 100] |
| **offset** | [**Object**](.md)|  | [optional] [default to 0] |
| **afterDate** | **OffsetDateTime**|  | [optional] |
| **beforeDate** | **OffsetDateTime**|  | [optional] |

### Return type

[**List&lt;UsageSessionPublic&gt;**](UsageSessionPublic.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAggregateAccountUsage"></a>
# **listAggregateAccountUsage**
> List&lt;UsageBucket&gt; listAggregateAccountUsage().limit(limit).offset(offset).afterDate(afterDate).beforeDate(beforeDate).unit(unit).userId(userId).keyId(keyId).method(method).endpoint(endpoint).execute();

List aggregate account usage

List account usage within a time range.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageApi;
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
    Integer limit = 100;
    Object offset = 0;
    OffsetDateTime afterDate = OffsetDateTime.now();
    OffsetDateTime beforeDate = OffsetDateTime.now();
    String unit = "minute";
    String userId = "userId_example";
    String keyId = "keyId_example";
    String method = "api";
    String endpoint = "endpoint_example";
    try {
      List<UsageBucket> result = client
              .usage
              .listAggregateAccountUsage()
              .limit(limit)
              .offset(offset)
              .afterDate(afterDate)
              .beforeDate(beforeDate)
              .unit(unit)
              .userId(userId)
              .keyId(keyId)
              .method(method)
              .endpoint(endpoint)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#listAggregateAccountUsage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UsageBucket>> response = client
              .usage
              .listAggregateAccountUsage()
              .limit(limit)
              .offset(offset)
              .afterDate(afterDate)
              .beforeDate(beforeDate)
              .unit(unit)
              .userId(userId)
              .keyId(keyId)
              .method(method)
              .endpoint(endpoint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#listAggregateAccountUsage");
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
| **limit** | **Integer**|  | [optional] [default to 100] |
| **offset** | [**Object**](.md)|  | [optional] [default to 0] |
| **afterDate** | **OffsetDateTime**|  | [optional] |
| **beforeDate** | **OffsetDateTime**|  | [optional] |
| **unit** | **String**|  | [optional] [enum: minute, hour, day, week] |
| **userId** | **String**|  | [optional] |
| **keyId** | **String**|  | [optional] |
| **method** | **String**|  | [optional] [enum: api, ws] |
| **endpoint** | **String**|  | [optional] |

### Return type

[**List&lt;UsageBucket&gt;**](UsageBucket.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listRequestEvents"></a>
# **listRequestEvents**
> List&lt;UsageEvent&gt; listRequestEvents(sessionId).limit(limit).offset(offset).afterDate(afterDate).beforeDate(beforeDate).execute();

List events for a request

List all events within a particular request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageApi;
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
    String sessionId = "sessionId_example";
    Integer limit = 100;
    Object offset = 0;
    OffsetDateTime afterDate = OffsetDateTime.now();
    OffsetDateTime beforeDate = OffsetDateTime.now();
    try {
      List<UsageEvent> result = client
              .usage
              .listRequestEvents(sessionId)
              .limit(limit)
              .offset(offset)
              .afterDate(afterDate)
              .beforeDate(beforeDate)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#listRequestEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UsageEvent>> response = client
              .usage
              .listRequestEvents(sessionId)
              .limit(limit)
              .offset(offset)
              .afterDate(afterDate)
              .beforeDate(beforeDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApi#listRequestEvents");
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
| **sessionId** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 100] |
| **offset** | [**Object**](.md)|  | [optional] [default to 0] |
| **afterDate** | **OffsetDateTime**|  | [optional] |
| **beforeDate** | **OffsetDateTime**|  | [optional] |

### Return type

[**List&lt;UsageEvent&gt;**](UsageEvent.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


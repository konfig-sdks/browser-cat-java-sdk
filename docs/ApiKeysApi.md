# ApiKeysApi

All URIs are relative to *https://api.browsercat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApiKey**](ApiKeysApi.md#createApiKey) | **POST** /auth/keys | Create an API key |
| [**getKey**](ApiKeysApi.md#getKey) | **GET** /auth/keys/{keyId} | Retrieve an API key |
| [**listAll**](ApiKeysApi.md#listAll) | **GET** /auth/keys | List API keys |
| [**revokeKey**](ApiKeysApi.md#revokeKey) | **DELETE** /auth/keys/{keyId} | Revoke an API key |
| [**updateApiKey**](ApiKeysApi.md#updateApiKey) | **PUT** /auth/keys/{keyId} | Update an API key |
| [**updateKey**](ApiKeysApi.md#updateKey) | **PATCH** /auth/keys/{keyId} | Patch an API key |


<a name="createApiKey"></a>
# **createApiKey**
> KeySecret createApiKey(keyPost).execute();

Create an API key

Create a new API key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiKeysApi;
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
    String name = "name_example";
    String role = "member";
    OffsetDateTime expiredAt = OffsetDateTime.now();
    try {
      KeySecret result = client
              .apiKeys
              .createApiKey(name)
              .role(role)
              .expiredAt(expiredAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeyId());
      System.out.println(result.getName());
      System.out.println(result.getRole());
      System.out.println(result.getLastFour());
      System.out.println(result.getExpiredAt());
      System.out.println(result.getSecret());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#createApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeySecret> response = client
              .apiKeys
              .createApiKey(name)
              .role(role)
              .expiredAt(expiredAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#createApiKey");
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
| **keyPost** | [**KeyPost**](KeyPost.md)|  | |

### Return type

[**KeySecret**](KeySecret.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getKey"></a>
# **getKey**
> KeyPublic getKey(keyId).execute();

Retrieve an API key

Retrieve an API key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiKeysApi;
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
    String keyId = "keyId_example";
    try {
      KeyPublic result = client
              .apiKeys
              .getKey(keyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeyId());
      System.out.println(result.getName());
      System.out.println(result.getRole());
      System.out.println(result.getLastFour());
      System.out.println(result.getExpiredAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#getKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyPublic> response = client
              .apiKeys
              .getKey(keyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#getKey");
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
| **keyId** | **String**|  | |

### Return type

[**KeyPublic**](KeyPublic.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAll"></a>
# **listAll**
> List&lt;KeyPublic&gt; listAll().execute();

List API keys

List all API keys.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiKeysApi;
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
    try {
      List<KeyPublic> result = client
              .apiKeys
              .listAll()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<KeyPublic>> response = client
              .apiKeys
              .listAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#listAll");
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

[**List&lt;KeyPublic&gt;**](KeyPublic.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="revokeKey"></a>
# **revokeKey**
> KeyPublic revokeKey(keyId).execute();

Revoke an API key

Revoke an API key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiKeysApi;
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
    String keyId = "keyId_example";
    try {
      KeyPublic result = client
              .apiKeys
              .revokeKey(keyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeyId());
      System.out.println(result.getName());
      System.out.println(result.getRole());
      System.out.println(result.getLastFour());
      System.out.println(result.getExpiredAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#revokeKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyPublic> response = client
              .apiKeys
              .revokeKey(keyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#revokeKey");
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
| **keyId** | **String**|  | |

### Return type

[**KeyPublic**](KeyPublic.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateApiKey"></a>
# **updateApiKey**
> KeyPublic updateApiKey(keyId, keyPut).execute();

Update an API key

Update an API key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiKeysApi;
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
    String name = "name_example";
    String role = "member";
    OffsetDateTime expiredAt = OffsetDateTime.now();
    String keyId = "keyId_example";
    try {
      KeyPublic result = client
              .apiKeys
              .updateApiKey(name, role, expiredAt, keyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeyId());
      System.out.println(result.getName());
      System.out.println(result.getRole());
      System.out.println(result.getLastFour());
      System.out.println(result.getExpiredAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#updateApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyPublic> response = client
              .apiKeys
              .updateApiKey(name, role, expiredAt, keyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#updateApiKey");
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
| **keyId** | **String**|  | |
| **keyPut** | [**KeyPut**](KeyPut.md)|  | |

### Return type

[**KeyPublic**](KeyPublic.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateKey"></a>
# **updateKey**
> KeyPublic updateKey(keyId, keyPatch).execute();

Patch an API key

Patch an API key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiKeysApi;
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
    String keyId = "keyId_example";
    String name = "name_example";
    String role = "member";
    OffsetDateTime expiredAt = OffsetDateTime.now();
    try {
      KeyPublic result = client
              .apiKeys
              .updateKey(keyId)
              .name(name)
              .role(role)
              .expiredAt(expiredAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeyId());
      System.out.println(result.getName());
      System.out.println(result.getRole());
      System.out.println(result.getLastFour());
      System.out.println(result.getExpiredAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#updateKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyPublic> response = client
              .apiKeys
              .updateKey(keyId)
              .name(name)
              .role(role)
              .expiredAt(expiredAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#updateKey");
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
| **keyId** | **String**|  | |
| **keyPatch** | [**KeyPatch**](KeyPatch.md)|  | |

### Return type

[**KeyPublic**](KeyPublic.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


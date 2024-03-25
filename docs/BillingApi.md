# BillingApi

All URIs are relative to *https://api.browsercat.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActiveSubscription**](BillingApi.md#getActiveSubscription) | **GET** /billing/subscriptions/current | Get active subscription |
| [**getInvoicePdf**](BillingApi.md#getInvoicePdf) | **GET** /billing/invoices/{invId}.pdf | Get PDF receipt for specific invoice |
| [**getSpecificInvoice**](BillingApi.md#getSpecificInvoice) | **GET** /billing/invoices/{invId} | Get specific invoice |
| [**getSpecificSubscription**](BillingApi.md#getSpecificSubscription) | **GET** /billing/subscriptions/{subId} | Get specific subscription |
| [**listInvoicesRange**](BillingApi.md#listInvoicesRange) | **GET** /billing/invoices | List invoices within range |
| [**listSubscriptionsWithinRange**](BillingApi.md#listSubscriptionsWithinRange) | **GET** /billing/subscriptions | List subscriptions within range |


<a name="getActiveSubscription"></a>
# **getActiveSubscription**
> Subscription getActiveSubscription().execute();

Get active subscription

Get the primary, active subscription.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillingApi;
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
      Subscription result = client
              .billing
              .getActiveSubscription()
              .execute();
      System.out.println(result);
      System.out.println(result.getSubId());
      System.out.println(result.getTier());
      System.out.println(result.getStatus());
      System.out.println(result.getCurrency());
      System.out.println(result.getPeriodUnit());
      System.out.println(result.getPeriodCount());
      System.out.println(result.getPeriodStartsAt());
      System.out.println(result.getPeriodEndsAt());
      System.out.println(result.getAnchoredAt());
      System.out.println(result.getCanceledAt());
      System.out.println(result.getResumedAt());
      System.out.println(result.getPausedAt());
      System.out.println(result.getStripeSubId());
      System.out.println(result.getStripeCusId());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#getActiveSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Subscription> response = client
              .billing
              .getActiveSubscription()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#getActiveSubscription");
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

[**Subscription**](Subscription.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getInvoicePdf"></a>
# **getInvoicePdf**
> File getInvoicePdf(invId).execute();

Get PDF receipt for specific invoice

Get specific invoice PDF.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillingApi;
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
    String invId = "invId_example";
    try {
      File result = client
              .billing
              .getInvoicePdf(invId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#getInvoicePdf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .billing
              .getInvoicePdf(invId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#getInvoicePdf");
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
| **invId** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSpecificInvoice"></a>
# **getSpecificInvoice**
> Invoice getSpecificInvoice(invId).execute();

Get specific invoice

Get specific invoice info.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillingApi;
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
    String invId = "invId_example";
    try {
      Invoice result = client
              .billing
              .getSpecificInvoice(invId)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvId());
      System.out.println(result.getSubId());
      System.out.println(result.getStatus());
      System.out.println(result.getError());
      System.out.println(result.getCurrency());
      System.out.println(result.getAmountDue());
      System.out.println(result.getAmountPaid());
      System.out.println(result.getTotal());
      System.out.println(result.getTotalDiscount());
      System.out.println(result.getTotalTax());
      System.out.println(result.getBilledAt());
      System.out.println(result.getStripeInvId());
      System.out.println(result.getStripeSubId());
      System.out.println(result.getStripeCusId());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#getSpecificInvoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Invoice> response = client
              .billing
              .getSpecificInvoice(invId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#getSpecificInvoice");
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
| **invId** | **String**|  | |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSpecificSubscription"></a>
# **getSpecificSubscription**
> Subscription getSpecificSubscription(subId).execute();

Get specific subscription

Get specific subscription details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillingApi;
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
    String subId = "subId_example";
    try {
      Subscription result = client
              .billing
              .getSpecificSubscription(subId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSubId());
      System.out.println(result.getTier());
      System.out.println(result.getStatus());
      System.out.println(result.getCurrency());
      System.out.println(result.getPeriodUnit());
      System.out.println(result.getPeriodCount());
      System.out.println(result.getPeriodStartsAt());
      System.out.println(result.getPeriodEndsAt());
      System.out.println(result.getAnchoredAt());
      System.out.println(result.getCanceledAt());
      System.out.println(result.getResumedAt());
      System.out.println(result.getPausedAt());
      System.out.println(result.getStripeSubId());
      System.out.println(result.getStripeCusId());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#getSpecificSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Subscription> response = client
              .billing
              .getSpecificSubscription(subId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#getSpecificSubscription");
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
| **subId** | **String**|  | |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listInvoicesRange"></a>
# **listInvoicesRange**
> List&lt;Invoice&gt; listInvoicesRange().limit(limit).offset(offset).afterDate(afterDate).beforeDate(beforeDate).execute();

List invoices within range

List all invoices (including failed and refunds) within a given time range.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillingApi;
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
      List<Invoice> result = client
              .billing
              .listInvoicesRange()
              .limit(limit)
              .offset(offset)
              .afterDate(afterDate)
              .beforeDate(beforeDate)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#listInvoicesRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Invoice>> response = client
              .billing
              .listInvoicesRange()
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
      System.err.println("Exception when calling BillingApi#listInvoicesRange");
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

[**List&lt;Invoice&gt;**](Invoice.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listSubscriptionsWithinRange"></a>
# **listSubscriptionsWithinRange**
> List&lt;Subscription&gt; listSubscriptionsWithinRange().limit(limit).offset(offset).afterDate(afterDate).beforeDate(beforeDate).execute();

List subscriptions within range

List all current and previous subscriptions within a given time range.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrowserCat;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BillingApi;
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
      List<Subscription> result = client
              .billing
              .listSubscriptionsWithinRange()
              .limit(limit)
              .offset(offset)
              .afterDate(afterDate)
              .beforeDate(beforeDate)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#listSubscriptionsWithinRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Subscription>> response = client
              .billing
              .listSubscriptionsWithinRange()
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
      System.err.println("Exception when calling BillingApi#listSubscriptionsWithinRange");
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

[**List&lt;Subscription&gt;**](Subscription.md)

### Authorization

[jwtCookie](../README.md#jwtCookie), [keyHeader](../README.md#keyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


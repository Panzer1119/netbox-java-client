# StatusApi

All URIs are relative to *https://demo.netbox.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statusList**](StatusApi.md#statusList) | **GET** /status/ |  |
| [**statusListWithHttpInfo**](StatusApi.md#statusListWithHttpInfo) | **GET** /status/ |  |



## statusList

> void statusList()



A lightweight read-only endpoint for conveying NetBox&#39;s current operational status.

### Example

```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.netbox.dev/api");
        
        // Configure API key authorization: Bearer
        ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer.setApiKeyPrefix("Token");

        StatusApi apiInstance = new StatusApi(defaultClient);
        try {
            apiInstance.statusList();
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#statusList");
            System.err.println("Status code: " + e.getCode());
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

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

## statusListWithHttpInfo

> ApiResponse<Void> statusList statusListWithHttpInfo()



A lightweight read-only endpoint for conveying NetBox&#39;s current operational status.

### Example

```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.ApiResponse;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.netbox.dev/api");
        
        // Configure API key authorization: Bearer
        ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Bearer.setApiKeyPrefix("Token");

        StatusApi apiInstance = new StatusApi(defaultClient);
        try {
            ApiResponse<Void> response = apiInstance.statusListWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#statusList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type


ApiResponse<Void>

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


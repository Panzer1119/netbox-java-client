# WirelessApi

All URIs are relative to *https://demo.netbox.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**wirelessWirelessLanGroupsBulkDelete**](WirelessApi.md#wirelessWirelessLanGroupsBulkDelete) | **DELETE** /wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsBulkPartialUpdate**](WirelessApi.md#wirelessWirelessLanGroupsBulkPartialUpdate) | **PATCH** /wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsBulkUpdate**](WirelessApi.md#wirelessWirelessLanGroupsBulkUpdate) | **PUT** /wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsCreate**](WirelessApi.md#wirelessWirelessLanGroupsCreate) | **POST** /wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsDelete**](WirelessApi.md#wirelessWirelessLanGroupsDelete) | **DELETE** /wireless/wireless-lan-groups/{id}/ |  |
| [**wirelessWirelessLanGroupsList**](WirelessApi.md#wirelessWirelessLanGroupsList) | **GET** /wireless/wireless-lan-groups/ |  |
| [**wirelessWirelessLanGroupsPartialUpdate**](WirelessApi.md#wirelessWirelessLanGroupsPartialUpdate) | **PATCH** /wireless/wireless-lan-groups/{id}/ |  |
| [**wirelessWirelessLanGroupsRead**](WirelessApi.md#wirelessWirelessLanGroupsRead) | **GET** /wireless/wireless-lan-groups/{id}/ |  |
| [**wirelessWirelessLanGroupsUpdate**](WirelessApi.md#wirelessWirelessLanGroupsUpdate) | **PUT** /wireless/wireless-lan-groups/{id}/ |  |
| [**wirelessWirelessLansBulkDelete**](WirelessApi.md#wirelessWirelessLansBulkDelete) | **DELETE** /wireless/wireless-lans/ |  |
| [**wirelessWirelessLansBulkPartialUpdate**](WirelessApi.md#wirelessWirelessLansBulkPartialUpdate) | **PATCH** /wireless/wireless-lans/ |  |
| [**wirelessWirelessLansBulkUpdate**](WirelessApi.md#wirelessWirelessLansBulkUpdate) | **PUT** /wireless/wireless-lans/ |  |
| [**wirelessWirelessLansCreate**](WirelessApi.md#wirelessWirelessLansCreate) | **POST** /wireless/wireless-lans/ |  |
| [**wirelessWirelessLansDelete**](WirelessApi.md#wirelessWirelessLansDelete) | **DELETE** /wireless/wireless-lans/{id}/ |  |
| [**wirelessWirelessLansList**](WirelessApi.md#wirelessWirelessLansList) | **GET** /wireless/wireless-lans/ |  |
| [**wirelessWirelessLansPartialUpdate**](WirelessApi.md#wirelessWirelessLansPartialUpdate) | **PATCH** /wireless/wireless-lans/{id}/ |  |
| [**wirelessWirelessLansRead**](WirelessApi.md#wirelessWirelessLansRead) | **GET** /wireless/wireless-lans/{id}/ |  |
| [**wirelessWirelessLansUpdate**](WirelessApi.md#wirelessWirelessLansUpdate) | **PUT** /wireless/wireless-lans/{id}/ |  |
| [**wirelessWirelessLinksBulkDelete**](WirelessApi.md#wirelessWirelessLinksBulkDelete) | **DELETE** /wireless/wireless-links/ |  |
| [**wirelessWirelessLinksBulkPartialUpdate**](WirelessApi.md#wirelessWirelessLinksBulkPartialUpdate) | **PATCH** /wireless/wireless-links/ |  |
| [**wirelessWirelessLinksBulkUpdate**](WirelessApi.md#wirelessWirelessLinksBulkUpdate) | **PUT** /wireless/wireless-links/ |  |
| [**wirelessWirelessLinksCreate**](WirelessApi.md#wirelessWirelessLinksCreate) | **POST** /wireless/wireless-links/ |  |
| [**wirelessWirelessLinksDelete**](WirelessApi.md#wirelessWirelessLinksDelete) | **DELETE** /wireless/wireless-links/{id}/ |  |
| [**wirelessWirelessLinksList**](WirelessApi.md#wirelessWirelessLinksList) | **GET** /wireless/wireless-links/ |  |
| [**wirelessWirelessLinksPartialUpdate**](WirelessApi.md#wirelessWirelessLinksPartialUpdate) | **PATCH** /wireless/wireless-links/{id}/ |  |
| [**wirelessWirelessLinksRead**](WirelessApi.md#wirelessWirelessLinksRead) | **GET** /wireless/wireless-links/{id}/ |  |
| [**wirelessWirelessLinksUpdate**](WirelessApi.md#wirelessWirelessLinksUpdate) | **PUT** /wireless/wireless-links/{id}/ |  |


<a name="wirelessWirelessLanGroupsBulkDelete"></a>
# **wirelessWirelessLanGroupsBulkDelete**
> wirelessWirelessLanGroupsBulkDelete()



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    try {
      apiInstance.wirelessWirelessLanGroupsBulkDelete();
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsBulkDelete");
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
| **204** |  |  -  |

<a name="wirelessWirelessLanGroupsBulkPartialUpdate"></a>
# **wirelessWirelessLanGroupsBulkPartialUpdate**
> WirelessLANGroup wirelessWirelessLanGroupsBulkPartialUpdate(data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    WritableWirelessLANGroup data = new WritableWirelessLANGroup(); // WritableWirelessLANGroup | 
    try {
      WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsBulkPartialUpdate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsBulkPartialUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **data** | [**WritableWirelessLANGroup**](WritableWirelessLANGroup.md)|  | |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLanGroupsBulkUpdate"></a>
# **wirelessWirelessLanGroupsBulkUpdate**
> WirelessLANGroup wirelessWirelessLanGroupsBulkUpdate(data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    WritableWirelessLANGroup data = new WritableWirelessLANGroup(); // WritableWirelessLANGroup | 
    try {
      WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsBulkUpdate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsBulkUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **data** | [**WritableWirelessLANGroup**](WritableWirelessLANGroup.md)|  | |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLanGroupsCreate"></a>
# **wirelessWirelessLanGroupsCreate**
> WirelessLANGroup wirelessWirelessLanGroupsCreate(data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    WritableWirelessLANGroup data = new WritableWirelessLANGroup(); // WritableWirelessLANGroup | 
    try {
      WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsCreate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsCreate");
      System.err.println("Status code: " + e.getCode());
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
| **data** | [**WritableWirelessLANGroup**](WritableWirelessLANGroup.md)|  | |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="wirelessWirelessLanGroupsDelete"></a>
# **wirelessWirelessLanGroupsDelete**
> wirelessWirelessLanGroupsDelete(id)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Wireless LAN Group.
    try {
      apiInstance.wirelessWirelessLanGroupsDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsDelete");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this Wireless LAN Group. | |

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
| **204** |  |  -  |

<a name="wirelessWirelessLanGroupsList"></a>
# **wirelessWirelessLanGroupsList**
> WirelessWirelessLanGroupsList200Response wirelessWirelessLanGroupsList(id, name, slug, description, created, lastUpdated, q, tag, parentId, parent, idN, idLte, idLt, idGte, idGt, nameN, nameIc, nameNic, nameIew, nameNiew, nameIsw, nameNisw, nameIe, nameNie, slugN, slugIc, slugNic, slugIew, slugNiew, slugIsw, slugNisw, slugIe, slugNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, createdN, createdLte, createdLt, createdGte, createdGt, lastUpdatedN, lastUpdatedLte, lastUpdatedLt, lastUpdatedGte, lastUpdatedGt, tagN, parentIdN, parentN, ordering, limit, offset)



Overrides ListModelMixin to allow processing ExportTemplates.

### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    String id = "id_example"; // String | 
    String name = "name_example"; // String | 
    String slug = "slug_example"; // String | 
    String description = "description_example"; // String | 
    String created = "created_example"; // String | 
    String lastUpdated = "lastUpdated_example"; // String | 
    String q = "q_example"; // String | 
    String tag = "tag_example"; // String | 
    String parentId = "parentId_example"; // String | 
    String parent = "parent_example"; // String | 
    String idN = "idN_example"; // String | 
    String idLte = "idLte_example"; // String | 
    String idLt = "idLt_example"; // String | 
    String idGte = "idGte_example"; // String | 
    String idGt = "idGt_example"; // String | 
    String nameN = "nameN_example"; // String | 
    String nameIc = "nameIc_example"; // String | 
    String nameNic = "nameNic_example"; // String | 
    String nameIew = "nameIew_example"; // String | 
    String nameNiew = "nameNiew_example"; // String | 
    String nameIsw = "nameIsw_example"; // String | 
    String nameNisw = "nameNisw_example"; // String | 
    String nameIe = "nameIe_example"; // String | 
    String nameNie = "nameNie_example"; // String | 
    String slugN = "slugN_example"; // String | 
    String slugIc = "slugIc_example"; // String | 
    String slugNic = "slugNic_example"; // String | 
    String slugIew = "slugIew_example"; // String | 
    String slugNiew = "slugNiew_example"; // String | 
    String slugIsw = "slugIsw_example"; // String | 
    String slugNisw = "slugNisw_example"; // String | 
    String slugIe = "slugIe_example"; // String | 
    String slugNie = "slugNie_example"; // String | 
    String descriptionN = "descriptionN_example"; // String | 
    String descriptionIc = "descriptionIc_example"; // String | 
    String descriptionNic = "descriptionNic_example"; // String | 
    String descriptionIew = "descriptionIew_example"; // String | 
    String descriptionNiew = "descriptionNiew_example"; // String | 
    String descriptionIsw = "descriptionIsw_example"; // String | 
    String descriptionNisw = "descriptionNisw_example"; // String | 
    String descriptionIe = "descriptionIe_example"; // String | 
    String descriptionNie = "descriptionNie_example"; // String | 
    String createdN = "createdN_example"; // String | 
    String createdLte = "createdLte_example"; // String | 
    String createdLt = "createdLt_example"; // String | 
    String createdGte = "createdGte_example"; // String | 
    String createdGt = "createdGt_example"; // String | 
    String lastUpdatedN = "lastUpdatedN_example"; // String | 
    String lastUpdatedLte = "lastUpdatedLte_example"; // String | 
    String lastUpdatedLt = "lastUpdatedLt_example"; // String | 
    String lastUpdatedGte = "lastUpdatedGte_example"; // String | 
    String lastUpdatedGt = "lastUpdatedGt_example"; // String | 
    String tagN = "tagN_example"; // String | 
    String parentIdN = "parentIdN_example"; // String | 
    String parentN = "parentN_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    try {
      WirelessWirelessLanGroupsList200Response result = apiInstance.wirelessWirelessLanGroupsList(id, name, slug, description, created, lastUpdated, q, tag, parentId, parent, idN, idLte, idLt, idGte, idGt, nameN, nameIc, nameNic, nameIew, nameNiew, nameIsw, nameNisw, nameIe, nameNie, slugN, slugIc, slugNic, slugIew, slugNiew, slugIsw, slugNisw, slugIe, slugNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, createdN, createdLte, createdLt, createdGte, createdGt, lastUpdatedN, lastUpdatedLte, lastUpdatedLt, lastUpdatedGte, lastUpdatedGt, tagN, parentIdN, parentN, ordering, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsList");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **slug** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **created** | **String**|  | [optional] |
| **lastUpdated** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |
| **parentId** | **String**|  | [optional] |
| **parent** | **String**|  | [optional] |
| **idN** | **String**|  | [optional] |
| **idLte** | **String**|  | [optional] |
| **idLt** | **String**|  | [optional] |
| **idGte** | **String**|  | [optional] |
| **idGt** | **String**|  | [optional] |
| **nameN** | **String**|  | [optional] |
| **nameIc** | **String**|  | [optional] |
| **nameNic** | **String**|  | [optional] |
| **nameIew** | **String**|  | [optional] |
| **nameNiew** | **String**|  | [optional] |
| **nameIsw** | **String**|  | [optional] |
| **nameNisw** | **String**|  | [optional] |
| **nameIe** | **String**|  | [optional] |
| **nameNie** | **String**|  | [optional] |
| **slugN** | **String**|  | [optional] |
| **slugIc** | **String**|  | [optional] |
| **slugNic** | **String**|  | [optional] |
| **slugIew** | **String**|  | [optional] |
| **slugNiew** | **String**|  | [optional] |
| **slugIsw** | **String**|  | [optional] |
| **slugNisw** | **String**|  | [optional] |
| **slugIe** | **String**|  | [optional] |
| **slugNie** | **String**|  | [optional] |
| **descriptionN** | **String**|  | [optional] |
| **descriptionIc** | **String**|  | [optional] |
| **descriptionNic** | **String**|  | [optional] |
| **descriptionIew** | **String**|  | [optional] |
| **descriptionNiew** | **String**|  | [optional] |
| **descriptionIsw** | **String**|  | [optional] |
| **descriptionNisw** | **String**|  | [optional] |
| **descriptionIe** | **String**|  | [optional] |
| **descriptionNie** | **String**|  | [optional] |
| **createdN** | **String**|  | [optional] |
| **createdLte** | **String**|  | [optional] |
| **createdLt** | **String**|  | [optional] |
| **createdGte** | **String**|  | [optional] |
| **createdGt** | **String**|  | [optional] |
| **lastUpdatedN** | **String**|  | [optional] |
| **lastUpdatedLte** | **String**|  | [optional] |
| **lastUpdatedLt** | **String**|  | [optional] |
| **lastUpdatedGte** | **String**|  | [optional] |
| **lastUpdatedGt** | **String**|  | [optional] |
| **tagN** | **String**|  | [optional] |
| **parentIdN** | **String**|  | [optional] |
| **parentN** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |

### Return type

[**WirelessWirelessLanGroupsList200Response**](WirelessWirelessLanGroupsList200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLanGroupsPartialUpdate"></a>
# **wirelessWirelessLanGroupsPartialUpdate**
> WirelessLANGroup wirelessWirelessLanGroupsPartialUpdate(id, data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Wireless LAN Group.
    WritableWirelessLANGroup data = new WritableWirelessLANGroup(); // WritableWirelessLANGroup | 
    try {
      WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsPartialUpdate(id, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this Wireless LAN Group. | |
| **data** | [**WritableWirelessLANGroup**](WritableWirelessLANGroup.md)|  | |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLanGroupsRead"></a>
# **wirelessWirelessLanGroupsRead**
> WirelessLANGroup wirelessWirelessLanGroupsRead(id)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Wireless LAN Group.
    try {
      WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsRead");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this Wireless LAN Group. | |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLanGroupsUpdate"></a>
# **wirelessWirelessLanGroupsUpdate**
> WirelessLANGroup wirelessWirelessLanGroupsUpdate(id, data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Wireless LAN Group.
    WritableWirelessLANGroup data = new WritableWirelessLANGroup(); // WritableWirelessLANGroup | 
    try {
      WirelessLANGroup result = apiInstance.wirelessWirelessLanGroupsUpdate(id, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLanGroupsUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this Wireless LAN Group. | |
| **data** | [**WritableWirelessLANGroup**](WritableWirelessLANGroup.md)|  | |

### Return type

[**WirelessLANGroup**](WirelessLANGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLansBulkDelete"></a>
# **wirelessWirelessLansBulkDelete**
> wirelessWirelessLansBulkDelete()



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    try {
      apiInstance.wirelessWirelessLansBulkDelete();
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLansBulkDelete");
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
| **204** |  |  -  |

<a name="wirelessWirelessLansBulkPartialUpdate"></a>
# **wirelessWirelessLansBulkPartialUpdate**
> WirelessLAN wirelessWirelessLansBulkPartialUpdate(data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    WritableWirelessLAN data = new WritableWirelessLAN(); // WritableWirelessLAN | 
    try {
      WirelessLAN result = apiInstance.wirelessWirelessLansBulkPartialUpdate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLansBulkPartialUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **data** | [**WritableWirelessLAN**](WritableWirelessLAN.md)|  | |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLansBulkUpdate"></a>
# **wirelessWirelessLansBulkUpdate**
> WirelessLAN wirelessWirelessLansBulkUpdate(data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    WritableWirelessLAN data = new WritableWirelessLAN(); // WritableWirelessLAN | 
    try {
      WirelessLAN result = apiInstance.wirelessWirelessLansBulkUpdate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLansBulkUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **data** | [**WritableWirelessLAN**](WritableWirelessLAN.md)|  | |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLansCreate"></a>
# **wirelessWirelessLansCreate**
> WirelessLAN wirelessWirelessLansCreate(data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    WritableWirelessLAN data = new WritableWirelessLAN(); // WritableWirelessLAN | 
    try {
      WirelessLAN result = apiInstance.wirelessWirelessLansCreate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLansCreate");
      System.err.println("Status code: " + e.getCode());
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
| **data** | [**WritableWirelessLAN**](WritableWirelessLAN.md)|  | |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="wirelessWirelessLansDelete"></a>
# **wirelessWirelessLansDelete**
> wirelessWirelessLansDelete(id)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Wireless LAN.
    try {
      apiInstance.wirelessWirelessLansDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLansDelete");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this Wireless LAN. | |

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
| **204** |  |  -  |

<a name="wirelessWirelessLansList"></a>
# **wirelessWirelessLansList**
> WirelessWirelessLansList200Response wirelessWirelessLansList(id, ssid, authPsk, description, created, lastUpdated, q, tag, tenantGroupId, tenantGroup, tenantId, tenant, groupId, group, vlanId, authType, authCipher, idN, idLte, idLt, idGte, idGt, ssidN, ssidIc, ssidNic, ssidIew, ssidNiew, ssidIsw, ssidNisw, ssidIe, ssidNie, authPskN, authPskIc, authPskNic, authPskIew, authPskNiew, authPskIsw, authPskNisw, authPskIe, authPskNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, createdN, createdLte, createdLt, createdGte, createdGt, lastUpdatedN, lastUpdatedLte, lastUpdatedLt, lastUpdatedGte, lastUpdatedGt, tagN, tenantGroupIdN, tenantGroupN, tenantIdN, tenantN, groupIdN, groupN, vlanIdN, authTypeN, authCipherN, ordering, limit, offset)



Overrides ListModelMixin to allow processing ExportTemplates.

### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    String id = "id_example"; // String | 
    String ssid = "ssid_example"; // String | 
    String authPsk = "authPsk_example"; // String | 
    String description = "description_example"; // String | 
    String created = "created_example"; // String | 
    String lastUpdated = "lastUpdated_example"; // String | 
    String q = "q_example"; // String | 
    String tag = "tag_example"; // String | 
    String tenantGroupId = "tenantGroupId_example"; // String | 
    String tenantGroup = "tenantGroup_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String tenant = "tenant_example"; // String | 
    String groupId = "groupId_example"; // String | 
    String group = "group_example"; // String | 
    String vlanId = "vlanId_example"; // String | 
    String authType = "authType_example"; // String | 
    String authCipher = "authCipher_example"; // String | 
    String idN = "idN_example"; // String | 
    String idLte = "idLte_example"; // String | 
    String idLt = "idLt_example"; // String | 
    String idGte = "idGte_example"; // String | 
    String idGt = "idGt_example"; // String | 
    String ssidN = "ssidN_example"; // String | 
    String ssidIc = "ssidIc_example"; // String | 
    String ssidNic = "ssidNic_example"; // String | 
    String ssidIew = "ssidIew_example"; // String | 
    String ssidNiew = "ssidNiew_example"; // String | 
    String ssidIsw = "ssidIsw_example"; // String | 
    String ssidNisw = "ssidNisw_example"; // String | 
    String ssidIe = "ssidIe_example"; // String | 
    String ssidNie = "ssidNie_example"; // String | 
    String authPskN = "authPskN_example"; // String | 
    String authPskIc = "authPskIc_example"; // String | 
    String authPskNic = "authPskNic_example"; // String | 
    String authPskIew = "authPskIew_example"; // String | 
    String authPskNiew = "authPskNiew_example"; // String | 
    String authPskIsw = "authPskIsw_example"; // String | 
    String authPskNisw = "authPskNisw_example"; // String | 
    String authPskIe = "authPskIe_example"; // String | 
    String authPskNie = "authPskNie_example"; // String | 
    String descriptionN = "descriptionN_example"; // String | 
    String descriptionIc = "descriptionIc_example"; // String | 
    String descriptionNic = "descriptionNic_example"; // String | 
    String descriptionIew = "descriptionIew_example"; // String | 
    String descriptionNiew = "descriptionNiew_example"; // String | 
    String descriptionIsw = "descriptionIsw_example"; // String | 
    String descriptionNisw = "descriptionNisw_example"; // String | 
    String descriptionIe = "descriptionIe_example"; // String | 
    String descriptionNie = "descriptionNie_example"; // String | 
    String createdN = "createdN_example"; // String | 
    String createdLte = "createdLte_example"; // String | 
    String createdLt = "createdLt_example"; // String | 
    String createdGte = "createdGte_example"; // String | 
    String createdGt = "createdGt_example"; // String | 
    String lastUpdatedN = "lastUpdatedN_example"; // String | 
    String lastUpdatedLte = "lastUpdatedLte_example"; // String | 
    String lastUpdatedLt = "lastUpdatedLt_example"; // String | 
    String lastUpdatedGte = "lastUpdatedGte_example"; // String | 
    String lastUpdatedGt = "lastUpdatedGt_example"; // String | 
    String tagN = "tagN_example"; // String | 
    String tenantGroupIdN = "tenantGroupIdN_example"; // String | 
    String tenantGroupN = "tenantGroupN_example"; // String | 
    String tenantIdN = "tenantIdN_example"; // String | 
    String tenantN = "tenantN_example"; // String | 
    String groupIdN = "groupIdN_example"; // String | 
    String groupN = "groupN_example"; // String | 
    String vlanIdN = "vlanIdN_example"; // String | 
    String authTypeN = "authTypeN_example"; // String | 
    String authCipherN = "authCipherN_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    try {
      WirelessWirelessLansList200Response result = apiInstance.wirelessWirelessLansList(id, ssid, authPsk, description, created, lastUpdated, q, tag, tenantGroupId, tenantGroup, tenantId, tenant, groupId, group, vlanId, authType, authCipher, idN, idLte, idLt, idGte, idGt, ssidN, ssidIc, ssidNic, ssidIew, ssidNiew, ssidIsw, ssidNisw, ssidIe, ssidNie, authPskN, authPskIc, authPskNic, authPskIew, authPskNiew, authPskIsw, authPskNisw, authPskIe, authPskNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, createdN, createdLte, createdLt, createdGte, createdGt, lastUpdatedN, lastUpdatedLte, lastUpdatedLt, lastUpdatedGte, lastUpdatedGt, tagN, tenantGroupIdN, tenantGroupN, tenantIdN, tenantN, groupIdN, groupN, vlanIdN, authTypeN, authCipherN, ordering, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLansList");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **String**|  | [optional] |
| **ssid** | **String**|  | [optional] |
| **authPsk** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **created** | **String**|  | [optional] |
| **lastUpdated** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |
| **tenantGroupId** | **String**|  | [optional] |
| **tenantGroup** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **tenant** | **String**|  | [optional] |
| **groupId** | **String**|  | [optional] |
| **group** | **String**|  | [optional] |
| **vlanId** | **String**|  | [optional] |
| **authType** | **String**|  | [optional] |
| **authCipher** | **String**|  | [optional] |
| **idN** | **String**|  | [optional] |
| **idLte** | **String**|  | [optional] |
| **idLt** | **String**|  | [optional] |
| **idGte** | **String**|  | [optional] |
| **idGt** | **String**|  | [optional] |
| **ssidN** | **String**|  | [optional] |
| **ssidIc** | **String**|  | [optional] |
| **ssidNic** | **String**|  | [optional] |
| **ssidIew** | **String**|  | [optional] |
| **ssidNiew** | **String**|  | [optional] |
| **ssidIsw** | **String**|  | [optional] |
| **ssidNisw** | **String**|  | [optional] |
| **ssidIe** | **String**|  | [optional] |
| **ssidNie** | **String**|  | [optional] |
| **authPskN** | **String**|  | [optional] |
| **authPskIc** | **String**|  | [optional] |
| **authPskNic** | **String**|  | [optional] |
| **authPskIew** | **String**|  | [optional] |
| **authPskNiew** | **String**|  | [optional] |
| **authPskIsw** | **String**|  | [optional] |
| **authPskNisw** | **String**|  | [optional] |
| **authPskIe** | **String**|  | [optional] |
| **authPskNie** | **String**|  | [optional] |
| **descriptionN** | **String**|  | [optional] |
| **descriptionIc** | **String**|  | [optional] |
| **descriptionNic** | **String**|  | [optional] |
| **descriptionIew** | **String**|  | [optional] |
| **descriptionNiew** | **String**|  | [optional] |
| **descriptionIsw** | **String**|  | [optional] |
| **descriptionNisw** | **String**|  | [optional] |
| **descriptionIe** | **String**|  | [optional] |
| **descriptionNie** | **String**|  | [optional] |
| **createdN** | **String**|  | [optional] |
| **createdLte** | **String**|  | [optional] |
| **createdLt** | **String**|  | [optional] |
| **createdGte** | **String**|  | [optional] |
| **createdGt** | **String**|  | [optional] |
| **lastUpdatedN** | **String**|  | [optional] |
| **lastUpdatedLte** | **String**|  | [optional] |
| **lastUpdatedLt** | **String**|  | [optional] |
| **lastUpdatedGte** | **String**|  | [optional] |
| **lastUpdatedGt** | **String**|  | [optional] |
| **tagN** | **String**|  | [optional] |
| **tenantGroupIdN** | **String**|  | [optional] |
| **tenantGroupN** | **String**|  | [optional] |
| **tenantIdN** | **String**|  | [optional] |
| **tenantN** | **String**|  | [optional] |
| **groupIdN** | **String**|  | [optional] |
| **groupN** | **String**|  | [optional] |
| **vlanIdN** | **String**|  | [optional] |
| **authTypeN** | **String**|  | [optional] |
| **authCipherN** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |

### Return type

[**WirelessWirelessLansList200Response**](WirelessWirelessLansList200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLansPartialUpdate"></a>
# **wirelessWirelessLansPartialUpdate**
> WirelessLAN wirelessWirelessLansPartialUpdate(id, data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Wireless LAN.
    WritableWirelessLAN data = new WritableWirelessLAN(); // WritableWirelessLAN | 
    try {
      WirelessLAN result = apiInstance.wirelessWirelessLansPartialUpdate(id, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLansPartialUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this Wireless LAN. | |
| **data** | [**WritableWirelessLAN**](WritableWirelessLAN.md)|  | |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLansRead"></a>
# **wirelessWirelessLansRead**
> WirelessLAN wirelessWirelessLansRead(id)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Wireless LAN.
    try {
      WirelessLAN result = apiInstance.wirelessWirelessLansRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLansRead");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this Wireless LAN. | |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLansUpdate"></a>
# **wirelessWirelessLansUpdate**
> WirelessLAN wirelessWirelessLansUpdate(id, data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Wireless LAN.
    WritableWirelessLAN data = new WritableWirelessLAN(); // WritableWirelessLAN | 
    try {
      WirelessLAN result = apiInstance.wirelessWirelessLansUpdate(id, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLansUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this Wireless LAN. | |
| **data** | [**WritableWirelessLAN**](WritableWirelessLAN.md)|  | |

### Return type

[**WirelessLAN**](WirelessLAN.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLinksBulkDelete"></a>
# **wirelessWirelessLinksBulkDelete**
> wirelessWirelessLinksBulkDelete()



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    try {
      apiInstance.wirelessWirelessLinksBulkDelete();
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksBulkDelete");
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
| **204** |  |  -  |

<a name="wirelessWirelessLinksBulkPartialUpdate"></a>
# **wirelessWirelessLinksBulkPartialUpdate**
> WirelessLink wirelessWirelessLinksBulkPartialUpdate(data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    WritableWirelessLink data = new WritableWirelessLink(); // WritableWirelessLink | 
    try {
      WirelessLink result = apiInstance.wirelessWirelessLinksBulkPartialUpdate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksBulkPartialUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **data** | [**WritableWirelessLink**](WritableWirelessLink.md)|  | |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLinksBulkUpdate"></a>
# **wirelessWirelessLinksBulkUpdate**
> WirelessLink wirelessWirelessLinksBulkUpdate(data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    WritableWirelessLink data = new WritableWirelessLink(); // WritableWirelessLink | 
    try {
      WirelessLink result = apiInstance.wirelessWirelessLinksBulkUpdate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksBulkUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **data** | [**WritableWirelessLink**](WritableWirelessLink.md)|  | |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLinksCreate"></a>
# **wirelessWirelessLinksCreate**
> WirelessLink wirelessWirelessLinksCreate(data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    WritableWirelessLink data = new WritableWirelessLink(); // WritableWirelessLink | 
    try {
      WirelessLink result = apiInstance.wirelessWirelessLinksCreate(data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksCreate");
      System.err.println("Status code: " + e.getCode());
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
| **data** | [**WritableWirelessLink**](WritableWirelessLink.md)|  | |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="wirelessWirelessLinksDelete"></a>
# **wirelessWirelessLinksDelete**
> wirelessWirelessLinksDelete(id)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this wireless link.
    try {
      apiInstance.wirelessWirelessLinksDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksDelete");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this wireless link. | |

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
| **204** |  |  -  |

<a name="wirelessWirelessLinksList"></a>
# **wirelessWirelessLinksList**
> WirelessWirelessLinksList200Response wirelessWirelessLinksList(id, ssid, authPsk, description, created, lastUpdated, q, tag, tenantGroupId, tenantGroup, tenantId, tenant, interfaceAId, interfaceBId, status, authType, authCipher, idN, idLte, idLt, idGte, idGt, ssidN, ssidIc, ssidNic, ssidIew, ssidNiew, ssidIsw, ssidNisw, ssidIe, ssidNie, authPskN, authPskIc, authPskNic, authPskIew, authPskNiew, authPskIsw, authPskNisw, authPskIe, authPskNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, createdN, createdLte, createdLt, createdGte, createdGt, lastUpdatedN, lastUpdatedLte, lastUpdatedLt, lastUpdatedGte, lastUpdatedGt, tagN, tenantGroupIdN, tenantGroupN, tenantIdN, tenantN, interfaceAIdN, interfaceAIdLte, interfaceAIdLt, interfaceAIdGte, interfaceAIdGt, interfaceBIdN, interfaceBIdLte, interfaceBIdLt, interfaceBIdGte, interfaceBIdGt, statusN, authTypeN, authCipherN, ordering, limit, offset)



Overrides ListModelMixin to allow processing ExportTemplates.

### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    String id = "id_example"; // String | 
    String ssid = "ssid_example"; // String | 
    String authPsk = "authPsk_example"; // String | 
    String description = "description_example"; // String | 
    String created = "created_example"; // String | 
    String lastUpdated = "lastUpdated_example"; // String | 
    String q = "q_example"; // String | 
    String tag = "tag_example"; // String | 
    String tenantGroupId = "tenantGroupId_example"; // String | 
    String tenantGroup = "tenantGroup_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String tenant = "tenant_example"; // String | 
    String interfaceAId = "interfaceAId_example"; // String | 
    String interfaceBId = "interfaceBId_example"; // String | 
    String status = "status_example"; // String | 
    String authType = "authType_example"; // String | 
    String authCipher = "authCipher_example"; // String | 
    String idN = "idN_example"; // String | 
    String idLte = "idLte_example"; // String | 
    String idLt = "idLt_example"; // String | 
    String idGte = "idGte_example"; // String | 
    String idGt = "idGt_example"; // String | 
    String ssidN = "ssidN_example"; // String | 
    String ssidIc = "ssidIc_example"; // String | 
    String ssidNic = "ssidNic_example"; // String | 
    String ssidIew = "ssidIew_example"; // String | 
    String ssidNiew = "ssidNiew_example"; // String | 
    String ssidIsw = "ssidIsw_example"; // String | 
    String ssidNisw = "ssidNisw_example"; // String | 
    String ssidIe = "ssidIe_example"; // String | 
    String ssidNie = "ssidNie_example"; // String | 
    String authPskN = "authPskN_example"; // String | 
    String authPskIc = "authPskIc_example"; // String | 
    String authPskNic = "authPskNic_example"; // String | 
    String authPskIew = "authPskIew_example"; // String | 
    String authPskNiew = "authPskNiew_example"; // String | 
    String authPskIsw = "authPskIsw_example"; // String | 
    String authPskNisw = "authPskNisw_example"; // String | 
    String authPskIe = "authPskIe_example"; // String | 
    String authPskNie = "authPskNie_example"; // String | 
    String descriptionN = "descriptionN_example"; // String | 
    String descriptionIc = "descriptionIc_example"; // String | 
    String descriptionNic = "descriptionNic_example"; // String | 
    String descriptionIew = "descriptionIew_example"; // String | 
    String descriptionNiew = "descriptionNiew_example"; // String | 
    String descriptionIsw = "descriptionIsw_example"; // String | 
    String descriptionNisw = "descriptionNisw_example"; // String | 
    String descriptionIe = "descriptionIe_example"; // String | 
    String descriptionNie = "descriptionNie_example"; // String | 
    String createdN = "createdN_example"; // String | 
    String createdLte = "createdLte_example"; // String | 
    String createdLt = "createdLt_example"; // String | 
    String createdGte = "createdGte_example"; // String | 
    String createdGt = "createdGt_example"; // String | 
    String lastUpdatedN = "lastUpdatedN_example"; // String | 
    String lastUpdatedLte = "lastUpdatedLte_example"; // String | 
    String lastUpdatedLt = "lastUpdatedLt_example"; // String | 
    String lastUpdatedGte = "lastUpdatedGte_example"; // String | 
    String lastUpdatedGt = "lastUpdatedGt_example"; // String | 
    String tagN = "tagN_example"; // String | 
    String tenantGroupIdN = "tenantGroupIdN_example"; // String | 
    String tenantGroupN = "tenantGroupN_example"; // String | 
    String tenantIdN = "tenantIdN_example"; // String | 
    String tenantN = "tenantN_example"; // String | 
    String interfaceAIdN = "interfaceAIdN_example"; // String | 
    String interfaceAIdLte = "interfaceAIdLte_example"; // String | 
    String interfaceAIdLt = "interfaceAIdLt_example"; // String | 
    String interfaceAIdGte = "interfaceAIdGte_example"; // String | 
    String interfaceAIdGt = "interfaceAIdGt_example"; // String | 
    String interfaceBIdN = "interfaceBIdN_example"; // String | 
    String interfaceBIdLte = "interfaceBIdLte_example"; // String | 
    String interfaceBIdLt = "interfaceBIdLt_example"; // String | 
    String interfaceBIdGte = "interfaceBIdGte_example"; // String | 
    String interfaceBIdGt = "interfaceBIdGt_example"; // String | 
    String statusN = "statusN_example"; // String | 
    String authTypeN = "authTypeN_example"; // String | 
    String authCipherN = "authCipherN_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    try {
      WirelessWirelessLinksList200Response result = apiInstance.wirelessWirelessLinksList(id, ssid, authPsk, description, created, lastUpdated, q, tag, tenantGroupId, tenantGroup, tenantId, tenant, interfaceAId, interfaceBId, status, authType, authCipher, idN, idLte, idLt, idGte, idGt, ssidN, ssidIc, ssidNic, ssidIew, ssidNiew, ssidIsw, ssidNisw, ssidIe, ssidNie, authPskN, authPskIc, authPskNic, authPskIew, authPskNiew, authPskIsw, authPskNisw, authPskIe, authPskNie, descriptionN, descriptionIc, descriptionNic, descriptionIew, descriptionNiew, descriptionIsw, descriptionNisw, descriptionIe, descriptionNie, createdN, createdLte, createdLt, createdGte, createdGt, lastUpdatedN, lastUpdatedLte, lastUpdatedLt, lastUpdatedGte, lastUpdatedGt, tagN, tenantGroupIdN, tenantGroupN, tenantIdN, tenantN, interfaceAIdN, interfaceAIdLte, interfaceAIdLt, interfaceAIdGte, interfaceAIdGt, interfaceBIdN, interfaceBIdLte, interfaceBIdLt, interfaceBIdGte, interfaceBIdGt, statusN, authTypeN, authCipherN, ordering, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksList");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **String**|  | [optional] |
| **ssid** | **String**|  | [optional] |
| **authPsk** | **String**|  | [optional] |
| **description** | **String**|  | [optional] |
| **created** | **String**|  | [optional] |
| **lastUpdated** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |
| **tag** | **String**|  | [optional] |
| **tenantGroupId** | **String**|  | [optional] |
| **tenantGroup** | **String**|  | [optional] |
| **tenantId** | **String**|  | [optional] |
| **tenant** | **String**|  | [optional] |
| **interfaceAId** | **String**|  | [optional] |
| **interfaceBId** | **String**|  | [optional] |
| **status** | **String**|  | [optional] |
| **authType** | **String**|  | [optional] |
| **authCipher** | **String**|  | [optional] |
| **idN** | **String**|  | [optional] |
| **idLte** | **String**|  | [optional] |
| **idLt** | **String**|  | [optional] |
| **idGte** | **String**|  | [optional] |
| **idGt** | **String**|  | [optional] |
| **ssidN** | **String**|  | [optional] |
| **ssidIc** | **String**|  | [optional] |
| **ssidNic** | **String**|  | [optional] |
| **ssidIew** | **String**|  | [optional] |
| **ssidNiew** | **String**|  | [optional] |
| **ssidIsw** | **String**|  | [optional] |
| **ssidNisw** | **String**|  | [optional] |
| **ssidIe** | **String**|  | [optional] |
| **ssidNie** | **String**|  | [optional] |
| **authPskN** | **String**|  | [optional] |
| **authPskIc** | **String**|  | [optional] |
| **authPskNic** | **String**|  | [optional] |
| **authPskIew** | **String**|  | [optional] |
| **authPskNiew** | **String**|  | [optional] |
| **authPskIsw** | **String**|  | [optional] |
| **authPskNisw** | **String**|  | [optional] |
| **authPskIe** | **String**|  | [optional] |
| **authPskNie** | **String**|  | [optional] |
| **descriptionN** | **String**|  | [optional] |
| **descriptionIc** | **String**|  | [optional] |
| **descriptionNic** | **String**|  | [optional] |
| **descriptionIew** | **String**|  | [optional] |
| **descriptionNiew** | **String**|  | [optional] |
| **descriptionIsw** | **String**|  | [optional] |
| **descriptionNisw** | **String**|  | [optional] |
| **descriptionIe** | **String**|  | [optional] |
| **descriptionNie** | **String**|  | [optional] |
| **createdN** | **String**|  | [optional] |
| **createdLte** | **String**|  | [optional] |
| **createdLt** | **String**|  | [optional] |
| **createdGte** | **String**|  | [optional] |
| **createdGt** | **String**|  | [optional] |
| **lastUpdatedN** | **String**|  | [optional] |
| **lastUpdatedLte** | **String**|  | [optional] |
| **lastUpdatedLt** | **String**|  | [optional] |
| **lastUpdatedGte** | **String**|  | [optional] |
| **lastUpdatedGt** | **String**|  | [optional] |
| **tagN** | **String**|  | [optional] |
| **tenantGroupIdN** | **String**|  | [optional] |
| **tenantGroupN** | **String**|  | [optional] |
| **tenantIdN** | **String**|  | [optional] |
| **tenantN** | **String**|  | [optional] |
| **interfaceAIdN** | **String**|  | [optional] |
| **interfaceAIdLte** | **String**|  | [optional] |
| **interfaceAIdLt** | **String**|  | [optional] |
| **interfaceAIdGte** | **String**|  | [optional] |
| **interfaceAIdGt** | **String**|  | [optional] |
| **interfaceBIdN** | **String**|  | [optional] |
| **interfaceBIdLte** | **String**|  | [optional] |
| **interfaceBIdLt** | **String**|  | [optional] |
| **interfaceBIdGte** | **String**|  | [optional] |
| **interfaceBIdGt** | **String**|  | [optional] |
| **statusN** | **String**|  | [optional] |
| **authTypeN** | **String**|  | [optional] |
| **authCipherN** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |

### Return type

[**WirelessWirelessLinksList200Response**](WirelessWirelessLinksList200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLinksPartialUpdate"></a>
# **wirelessWirelessLinksPartialUpdate**
> WirelessLink wirelessWirelessLinksPartialUpdate(id, data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this wireless link.
    WritableWirelessLink data = new WritableWirelessLink(); // WritableWirelessLink | 
    try {
      WirelessLink result = apiInstance.wirelessWirelessLinksPartialUpdate(id, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksPartialUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this wireless link. | |
| **data** | [**WritableWirelessLink**](WritableWirelessLink.md)|  | |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLinksRead"></a>
# **wirelessWirelessLinksRead**
> WirelessLink wirelessWirelessLinksRead(id)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this wireless link.
    try {
      WirelessLink result = apiInstance.wirelessWirelessLinksRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksRead");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this wireless link. | |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="wirelessWirelessLinksUpdate"></a>
# **wirelessWirelessLinksUpdate**
> WirelessLink wirelessWirelessLinksUpdate(id, data)



### Example
```java
// Import classes:
import de.codemakers.netbox.client.ApiClient;
import de.codemakers.netbox.client.ApiException;
import de.codemakers.netbox.client.Configuration;
import de.codemakers.netbox.client.auth.*;
import de.codemakers.netbox.client.models.*;
import de.codemakers.netbox.client.api.WirelessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://demo.netbox.dev/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WirelessApi apiInstance = new WirelessApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this wireless link.
    WritableWirelessLink data = new WritableWirelessLink(); // WritableWirelessLink | 
    try {
      WirelessLink result = apiInstance.wirelessWirelessLinksUpdate(id, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WirelessApi#wirelessWirelessLinksUpdate");
      System.err.println("Status code: " + e.getCode());
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
| **id** | **Integer**| A unique integer value identifying this wireless link. | |
| **data** | [**WritableWirelessLink**](WritableWirelessLink.md)|  | |

### Return type

[**WirelessLink**](WirelessLink.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


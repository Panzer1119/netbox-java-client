

# VirtualMachineWithConfigContext


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**status** | [**Status10**](Status10.md) |  |  [optional] |
|**site** | [**NestedSite**](NestedSite.md) |  |  [optional] |
|**cluster** | [**NestedCluster**](NestedCluster.md) |  |  |
|**role** | [**NestedDeviceRole**](NestedDeviceRole.md) |  |  [optional] |
|**tenant** | [**NestedTenant**](NestedTenant.md) |  |  [optional] |
|**platform** | [**NestedPlatform**](NestedPlatform.md) |  |  [optional] |
|**primaryIp** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional] |
|**primaryIp4** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional] |
|**primaryIp6** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional] |
|**vcpus** | **BigDecimal** |  |  [optional] |
|**memory** | **Integer** |  |  [optional] |
|**disk** | **Integer** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**localContextData** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**configContext** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |






# DeviceWithConfigContext


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**deviceType** | [**NestedDeviceType**](NestedDeviceType.md) |  |  |
|**deviceRole** | [**NestedDeviceRole**](NestedDeviceRole.md) |  |  |
|**tenant** | [**NestedTenant**](NestedTenant.md) |  |  [optional] |
|**platform** | [**NestedPlatform**](NestedPlatform.md) |  |  [optional] |
|**serial** | **String** |  |  [optional] |
|**assetTag** | **String** | A unique tag used to identify this device |  [optional] |
|**site** | [**NestedSite**](NestedSite.md) |  |  |
|**location** | [**NestedLocation**](NestedLocation.md) |  |  [optional] |
|**rack** | [**NestedRack**](NestedRack.md) |  |  [optional] |
|**position** | **BigDecimal** |  |  [optional] |
|**face** | [**Face**](Face.md) |  |  [optional] |
|**parentDevice** | [**NestedDevice**](NestedDevice.md) |  |  [optional] |
|**status** | [**Status2**](Status2.md) |  |  [optional] |
|**airflow** | [**Airflow**](Airflow.md) |  |  [optional] |
|**primaryIp** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional] |
|**primaryIp4** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional] |
|**primaryIp6** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional] |
|**cluster** | [**NestedCluster**](NestedCluster.md) |  |  [optional] |
|**virtualChassis** | [**NestedVirtualChassis**](NestedVirtualChassis.md) |  |  [optional] |
|**vcPosition** | **Integer** |  |  [optional] |
|**vcPriority** | **Integer** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**localContextData** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**configContext** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |




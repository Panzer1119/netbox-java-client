

# InventoryItemTemplate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**deviceType** | [**NestedDeviceType**](NestedDeviceType.md) |  |  |
|**parent** | **Integer** |  |  [optional] |
|**name** | **String** |  {module} is accepted as a substitution for the module bay position when attached to a module type.  |  |
|**label** | **String** | Physical label |  [optional] |
|**role** | [**NestedInventoryItemRole**](NestedInventoryItemRole.md) |  |  [optional] |
|**manufacturer** | [**NestedManufacturer**](NestedManufacturer.md) |  |  [optional] |
|**partId** | **String** | Manufacturer-assigned part identifier |  [optional] |
|**description** | **String** |  |  [optional] |
|**componentType** | **String** |  |  [optional] |
|**componentId** | **Integer** |  |  [optional] |
|**component** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**depth** | **Integer** |  |  [optional] [readonly] |




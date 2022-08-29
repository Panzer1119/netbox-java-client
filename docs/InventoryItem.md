

# InventoryItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**device** | [**NestedDevice**](NestedDevice.md) |  |  |
|**parent** | **Integer** |  |  [optional] |
|**name** | **String** |  |  |
|**label** | **String** | Physical label |  [optional] |
|**role** | [**NestedInventoryItemRole**](NestedInventoryItemRole.md) |  |  [optional] |
|**manufacturer** | [**NestedManufacturer**](NestedManufacturer.md) |  |  [optional] |
|**partId** | **String** | Manufacturer-assigned part identifier |  [optional] |
|**serial** | **String** |  |  [optional] |
|**assetTag** | **String** | A unique tag used to identify this item |  [optional] |
|**discovered** | **Boolean** | This item was automatically discovered |  [optional] |
|**description** | **String** |  |  [optional] |
|**componentType** | **String** |  |  [optional] |
|**componentId** | **Integer** |  |  [optional] |
|**component** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**depth** | **Integer** |  |  [optional] [readonly] |




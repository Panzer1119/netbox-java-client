

# Site


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**status** | [**Status3**](Status3.md) |  |  [optional] |
|**region** | [**NestedRegion**](NestedRegion.md) |  |  [optional] |
|**group** | [**NestedSiteGroup**](NestedSiteGroup.md) |  |  [optional] |
|**tenant** | [**NestedTenant**](NestedTenant.md) |  |  [optional] |
|**facility** | **String** | Local facility ID or description |  [optional] |
|**timeZone** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**physicalAddress** | **String** |  |  [optional] |
|**shippingAddress** | **String** |  |  [optional] |
|**latitude** | **BigDecimal** | GPS coordinate (latitude) |  [optional] |
|**longitude** | **BigDecimal** | GPS coordinate (longitude) |  [optional] |
|**comments** | **String** |  |  [optional] |
|**asns** | [**Set&lt;NestedASN&gt;**](NestedASN.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**circuitCount** | **Integer** |  |  [optional] [readonly] |
|**deviceCount** | **Integer** |  |  [optional] [readonly] |
|**prefixCount** | **Integer** |  |  [optional] [readonly] |
|**rackCount** | **Integer** |  |  [optional] [readonly] |
|**virtualmachineCount** | **Integer** |  |  [optional] [readonly] |
|**vlanCount** | **Integer** |  |  [optional] [readonly] |




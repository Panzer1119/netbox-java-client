

# WritableSite


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**slug** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**region** | **Integer** |  |  [optional] |
|**group** | **Integer** |  |  [optional] |
|**tenant** | **Integer** |  |  [optional] |
|**facility** | **String** | Local facility ID or description |  [optional] |
|**timeZone** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**physicalAddress** | **String** |  |  [optional] |
|**shippingAddress** | **String** |  |  [optional] |
|**latitude** | **BigDecimal** | GPS coordinate (latitude) |  [optional] |
|**longitude** | **BigDecimal** | GPS coordinate (longitude) |  [optional] |
|**comments** | **String** |  |  [optional] |
|**asns** | **Set&lt;Integer&gt;** |  |  [optional] |
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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;planned&quot; |
| STAGING | &quot;staging&quot; |
| ACTIVE | &quot;active&quot; |
| DECOMMISSIONING | &quot;decommissioning&quot; |
| RETIRED | &quot;retired&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




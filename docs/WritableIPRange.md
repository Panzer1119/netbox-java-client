

# WritableIPRange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**family** | **String** |  |  [optional] [readonly] |
|**startAddress** | **String** | IPv4 or IPv6 address (with mask) |  |
|**endAddress** | **String** | IPv4 or IPv6 address (with mask) |  |
|**size** | **Integer** |  |  [optional] [readonly] |
|**vrf** | **Integer** |  |  [optional] |
|**tenant** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Operational status of this range |  [optional] |
|**role** | **Integer** | The primary function of this range |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**children** | **Integer** |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| RESERVED | &quot;reserved&quot; |
| DEPRECATED | &quot;deprecated&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




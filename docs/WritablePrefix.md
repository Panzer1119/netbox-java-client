

# WritablePrefix


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**family** | **String** |  |  [optional] [readonly] |
|**prefix** | **String** | IPv4 or IPv6 network with mask |  |
|**site** | **Integer** |  |  [optional] |
|**vrf** | **Integer** |  |  [optional] |
|**tenant** | **Integer** |  |  [optional] |
|**vlan** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Operational status of this prefix |  [optional] |
|**role** | **Integer** | The primary function of this prefix |  [optional] |
|**isPool** | **Boolean** | All IP addresses within this prefix are considered usable |  [optional] |
|**markUtilized** | **Boolean** | Treat as 100% utilized |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**children** | **Integer** |  |  [optional] [readonly] |
|**depth** | **Integer** |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONTAINER | &quot;container&quot; |
| ACTIVE | &quot;active&quot; |
| RESERVED | &quot;reserved&quot; |
| DEPRECATED | &quot;deprecated&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




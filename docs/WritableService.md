

# WritableService


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**device** | **Integer** |  |  [optional] |
|**virtualMachine** | **Integer** |  |  [optional] |
|**name** | **String** |  |  |
|**ports** | **List&lt;Integer&gt;** |  |  |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) |  |  |
|**ipaddresses** | **Set&lt;Integer&gt;** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| TCP | &quot;tcp&quot; |
| UDP | &quot;udp&quot; |
| SCTP | &quot;sctp&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |






# WritableVMInterface


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**virtualMachine** | **Integer** |  |  |
|**name** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**parent** | **Integer** |  |  [optional] |
|**bridge** | **Integer** |  |  [optional] |
|**mtu** | **Integer** |  |  [optional] |
|**macAddress** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |
|**untaggedVlan** | **Integer** |  |  [optional] |
|**taggedVlans** | **Set&lt;Integer&gt;** |  |  [optional] |
|**vrf** | **Integer** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**countIpaddresses** | **Integer** |  |  [optional] [readonly] |
|**countFhrpGroups** | **Integer** |  |  [optional] [readonly] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| ACCESS | &quot;access&quot; |
| TAGGED | &quot;tagged&quot; |
| TAGGED_ALL | &quot;tagged-all&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |






# FHRPGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) |  |  |
|**groupId** | **Integer** |  |  |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) |  |  [optional] |
|**authKey** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**ipAddresses** | [**List&lt;NestedIPAddress&gt;**](NestedIPAddress.md) |  |  [optional] [readonly] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| VRRP2 | &quot;vrrp2&quot; |
| VRRP3 | &quot;vrrp3&quot; |
| CARP | &quot;carp&quot; |
| CLUSTERXL | &quot;clusterxl&quot; |
| HSRP | &quot;hsrp&quot; |
| GLBP | &quot;glbp&quot; |
| OTHER | &quot;other&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| PLAINTEXT | &quot;plaintext&quot; |
| MD5 | &quot;md5&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




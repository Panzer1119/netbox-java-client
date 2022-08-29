

# WritableCircuit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**cid** | **String** |  |  |
|**provider** | **Integer** |  |  |
|**type** | **Integer** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**tenant** | **Integer** |  |  [optional] |
|**installDate** | **LocalDate** |  |  [optional] |
|**terminationDate** | **LocalDate** |  |  [optional] |
|**commitRate** | **Integer** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**terminationA** | **Integer** |  |  [optional] [readonly] |
|**terminationZ** | **Integer** |  |  [optional] [readonly] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;planned&quot; |
| PROVISIONING | &quot;provisioning&quot; |
| ACTIVE | &quot;active&quot; |
| OFFLINE | &quot;offline&quot; |
| DEPROVISIONING | &quot;deprovisioning&quot; |
| DECOMMISSIONED | &quot;decommissioned&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




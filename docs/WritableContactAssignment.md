

# WritableContactAssignment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**contentType** | **String** |  |  |
|**objectId** | **Integer** |  |  |
|**_object** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**contact** | **Integer** |  |  |
|**role** | **Integer** |  |  |
|**priority** | [**PriorityEnum**](#PriorityEnum) |  |  |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| SECONDARY | &quot;secondary&quot; |
| TERTIARY | &quot;tertiary&quot; |
| INACTIVE | &quot;inactive&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




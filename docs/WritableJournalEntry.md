

# WritableJournalEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**assignedObjectType** | **String** |  |  |
|**assignedObjectId** | **Integer** |  |  |
|**assignedObject** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**createdBy** | **Integer** |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**comments** | **String** |  |  |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| INFO | &quot;info&quot; |
| SUCCESS | &quot;success&quot; |
| WARNING | &quot;warning&quot; |
| DANGER | &quot;danger&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




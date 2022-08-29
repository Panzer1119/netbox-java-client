

# WritableRack


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**facilityId** | **String** |  |  [optional] |
|**site** | **Integer** |  |  |
|**location** | **Integer** |  |  |
|**tenant** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**role** | **Integer** | Functional role |  [optional] |
|**serial** | **String** |  |  [optional] |
|**assetTag** | **String** | A unique tag used to identify this rack |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**width** | **Integer** | Rail-to-rail width |  [optional] |
|**uHeight** | **Integer** | Height in rack units |  [optional] |
|**descUnits** | **Boolean** | Units are numbered top-to-bottom |  [optional] |
|**outerWidth** | **Integer** | Outer dimension of rack (width) |  [optional] |
|**outerDepth** | **Integer** | Outer dimension of rack (depth) |  [optional] |
|**outerUnit** | [**OuterUnitEnum**](#OuterUnitEnum) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**deviceCount** | **Integer** |  |  [optional] [readonly] |
|**powerfeedCount** | **Integer** |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RESERVED | &quot;reserved&quot; |
| AVAILABLE | &quot;available&quot; |
| PLANNED | &quot;planned&quot; |
| ACTIVE | &quot;active&quot; |
| DEPRECATED | &quot;deprecated&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| _2_POST_FRAME | &quot;2-post-frame&quot; |
| _4_POST_FRAME | &quot;4-post-frame&quot; |
| _4_POST_CABINET | &quot;4-post-cabinet&quot; |
| WALL_FRAME | &quot;wall-frame&quot; |
| WALL_CABINET | &quot;wall-cabinet&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: OuterUnitEnum

| Name | Value |
|---- | -----|
| MM | &quot;mm&quot; |
| IN | &quot;in&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




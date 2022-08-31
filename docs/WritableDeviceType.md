

# WritableDeviceType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**manufacturer** | **Integer** |  |  |
|**model** | **String** |  |  |
|**slug** | **String** |  |  |
|**partNumber** | **String** | Discrete part number (optional) |  [optional] |
|**uHeight** | **Integer** |  |  [optional] |
|**isFullDepth** | **Boolean** | Device consumes both front and rear rack faces |  [optional] |
|**subdeviceRole** | [**SubdeviceRoleEnum**](#SubdeviceRoleEnum) | Parent devices house child devices in device bays. Leave blank if this device type is neither a parent nor a child. |  [optional] |
|**airflow** | [**AirflowEnum**](#AirflowEnum) |  |  [optional] |
|**frontImage** | **URI** |  |  [optional] [readonly] |
|**rearImage** | **URI** |  |  [optional] [readonly] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**deviceCount** | **Integer** |  |  [optional] [readonly] |



## Enum: SubdeviceRoleEnum

| Name | Value |
|---- | -----|
| PARENT | &quot;parent&quot; |
| CHILD | &quot;child&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: AirflowEnum

| Name | Value |
|---- | -----|
| FRONT_TO_REAR | &quot;front-to-rear&quot; |
| REAR_TO_FRONT | &quot;rear-to-front&quot; |
| LEFT_TO_RIGHT | &quot;left-to-right&quot; |
| RIGHT_TO_LEFT | &quot;right-to-left&quot; |
| SIDE_TO_REAR | &quot;side-to-rear&quot; |
| PASSIVE | &quot;passive&quot; |
| MIXED | &quot;mixed&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




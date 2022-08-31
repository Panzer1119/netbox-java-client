

# DeviceType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**manufacturer** | [**NestedManufacturer**](NestedManufacturer.md) |  |  |
|**model** | **String** |  |  |
|**slug** | **String** |  |  |
|**partNumber** | **String** | Discrete part number (optional) |  [optional] |
|**uHeight** | **Integer** |  |  [optional] |
|**isFullDepth** | **Boolean** | Device consumes both front and rear rack faces |  [optional] |
|**subdeviceRole** | [**SubdeviceRole**](SubdeviceRole.md) |  |  [optional] |
|**airflow** | [**Airflow**](Airflow.md) |  |  [optional] |
|**frontImage** | **URI** |  |  [optional] [readonly] |
|**rearImage** | **URI** |  |  [optional] [readonly] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**deviceCount** | **Integer** |  |  [optional] [readonly] |




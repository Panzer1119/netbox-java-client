

# WritableDeviceWithConfigContext


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**deviceType** | **Integer** |  |  |
|**deviceRole** | **Integer** |  |  |
|**tenant** | **Integer** |  |  |
|**platform** | **Integer** |  |  [optional] |
|**serial** | **String** |  |  [optional] |
|**assetTag** | **String** | A unique tag used to identify this device |  [optional] |
|**site** | **Integer** |  |  |
|**location** | **Integer** |  |  [optional] |
|**rack** | **Integer** |  |  |
|**position** | **BigDecimal** |  |  [optional] |
|**face** | [**FaceEnum**](#FaceEnum) |  |  |
|**parentDevice** | [**NestedDevice**](NestedDevice.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**airflow** | [**AirflowEnum**](#AirflowEnum) |  |  [optional] |
|**primaryIp** | **String** |  |  [optional] [readonly] |
|**primaryIp4** | **Integer** |  |  [optional] |
|**primaryIp6** | **Integer** |  |  [optional] |
|**cluster** | **Integer** |  |  [optional] |
|**virtualChassis** | **Integer** |  |  |
|**vcPosition** | **Integer** |  |  [optional] |
|**vcPriority** | **Integer** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**localContextData** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**configContext** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: FaceEnum

| Name | Value |
|---- | -----|
| FRONT | &quot;front&quot; |
| REAR | &quot;rear&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OFFLINE | &quot;offline&quot; |
| ACTIVE | &quot;active&quot; |
| PLANNED | &quot;planned&quot; |
| STAGED | &quot;staged&quot; |
| FAILED | &quot;failed&quot; |
| INVENTORY | &quot;inventory&quot; |
| DECOMMISSIONING | &quot;decommissioning&quot; |
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




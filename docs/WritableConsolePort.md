

# WritableConsolePort


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**device** | **Integer** |  |  |
|**module** | **Integer** |  |  [optional] |
|**name** | **String** |  |  |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Physical port type |  [optional] |
|**speed** | **Integer** | Port speed in bits per second |  [optional] |
|**description** | **String** |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**cable** | [**NestedCable**](NestedCable.md) |  |  [optional] |
|**cableEnd** | **String** |  |  [optional] [readonly] |
|**linkPeers** | **List&lt;String&gt;** |  Return the appropriate serializer for the link termination model.  |  [optional] [readonly] |
|**linkPeersType** | **String** |  |  [optional] [readonly] |
|**connectedEndpoints** | **List&lt;String&gt;** |  Return the appropriate serializer for the type of connected object.  |  [optional] [readonly] |
|**connectedEndpointsType** | **String** |  |  [optional] [readonly] |
|**connectedEndpointsReachable** | **Boolean** |  |  [optional] [readonly] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**occupied** | **Boolean** |  |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DE_9 | &quot;de-9&quot; |
| DB_25 | &quot;db-25&quot; |
| RJ_11 | &quot;rj-11&quot; |
| RJ_12 | &quot;rj-12&quot; |
| RJ_45 | &quot;rj-45&quot; |
| MINI_DIN_8 | &quot;mini-din-8&quot; |
| USB_A | &quot;usb-a&quot; |
| USB_B | &quot;usb-b&quot; |
| USB_C | &quot;usb-c&quot; |
| USB_MINI_A | &quot;usb-mini-a&quot; |
| USB_MINI_B | &quot;usb-mini-b&quot; |
| USB_MICRO_A | &quot;usb-micro-a&quot; |
| USB_MICRO_B | &quot;usb-micro-b&quot; |
| USB_MICRO_AB | &quot;usb-micro-ab&quot; |
| OTHER | &quot;other&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




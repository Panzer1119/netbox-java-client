

# WritableWirelessLAN


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**ssid** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**group** | **Integer** |  |  [optional] |
|**vlan** | **Integer** |  |  [optional] |
|**tenant** | **Integer** |  |  [optional] |
|**authType** | [**AuthTypeEnum**](#AuthTypeEnum) |  |  [optional] |
|**authCipher** | [**AuthCipherEnum**](#AuthCipherEnum) |  |  [optional] |
|**authPsk** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: AuthTypeEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| WEP | &quot;wep&quot; |
| WPA_PERSONAL | &quot;wpa-personal&quot; |
| WPA_ENTERPRISE | &quot;wpa-enterprise&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: AuthCipherEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| TKIP | &quot;tkip&quot; |
| AES | &quot;aes&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |






# WritableIPAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**family** | **String** |  |  [optional] [readonly] |
|**address** | **String** | IPv4 or IPv6 address (with mask) |  |
|**vrf** | **Integer** |  |  [optional] |
|**tenant** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The operational status of this IP |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | The functional role of this IP |  [optional] |
|**assignedObjectType** | **String** |  |  [optional] |
|**assignedObjectId** | **Integer** |  |  [optional] |
|**assignedObject** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**natInside** | **Integer** | The IP for which this address is the \&quot;outside\&quot; IP |  [optional] |
|**natOutside** | [**List&lt;NestedIPAddress&gt;**](NestedIPAddress.md) |  |  [optional] [readonly] |
|**dnsName** | **String** | Hostname or FQDN (not case-sensitive) |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| RESERVED | &quot;reserved&quot; |
| DEPRECATED | &quot;deprecated&quot; |
| DHCP | &quot;dhcp&quot; |
| SLAAC | &quot;slaac&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| LOOPBACK | &quot;loopback&quot; |
| SECONDARY | &quot;secondary&quot; |
| ANYCAST | &quot;anycast&quot; |
| VIP | &quot;vip&quot; |
| VRRP | &quot;vrrp&quot; |
| HSRP | &quot;hsrp&quot; |
| GLBP | &quot;glbp&quot; |
| CARP | &quot;carp&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




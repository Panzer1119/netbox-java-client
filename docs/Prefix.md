

# Prefix


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**family** | [**Family**](Family.md) |  |  [optional] |
|**prefix** | **String** | IPv4 or IPv6 network with mask |  |
|**site** | [**NestedSite**](NestedSite.md) |  |  [optional] |
|**vrf** | [**NestedVRF**](NestedVRF.md) |  |  [optional] |
|**tenant** | [**NestedTenant**](NestedTenant.md) |  |  [optional] |
|**vlan** | [**NestedVLAN**](NestedVLAN.md) |  |  [optional] |
|**status** | [**Status9**](Status9.md) |  |  [optional] |
|**role** | [**NestedRole**](NestedRole.md) |  |  [optional] |
|**isPool** | **Boolean** | All IP addresses within this prefix are considered usable |  [optional] |
|**markUtilized** | **Boolean** | Treat as 100% utilized |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**children** | **Integer** |  |  [optional] [readonly] |
|**depth** | **Integer** |  |  [optional] [readonly] |




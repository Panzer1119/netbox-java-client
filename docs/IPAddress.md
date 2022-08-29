

# IPAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**family** | [**Family**](Family.md) |  |  [optional] |
|**address** | **String** | IPv4 or IPv6 address (with mask) |  |
|**vrf** | [**NestedVRF**](NestedVRF.md) |  |  [optional] |
|**tenant** | [**NestedTenant**](NestedTenant.md) |  |  [optional] |
|**status** | [**Status7**](Status7.md) |  |  [optional] |
|**role** | [**Role1**](Role1.md) |  |  [optional] |
|**assignedObjectType** | **String** |  |  [optional] |
|**assignedObjectId** | **Integer** |  |  [optional] |
|**assignedObject** | **Map&lt;String, String&gt;** |  |  [optional] [readonly] |
|**natInside** | [**NestedIPAddress**](NestedIPAddress.md) |  |  [optional] |
|**natOutside** | [**List&lt;NestedIPAddress&gt;**](NestedIPAddress.md) |  |  [optional] [readonly] |
|**dnsName** | **String** | Hostname or FQDN (not case-sensitive) |  [optional] |
|**description** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |






# VRF


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**rd** | **String** | Unique route distinguisher (as defined in RFC 4364) |  [optional] |
|**tenant** | [**NestedTenant**](NestedTenant.md) |  |  [optional] |
|**enforceUnique** | **Boolean** | Prevent duplicate prefixes/IP addresses within this VRF |  [optional] |
|**description** | **String** |  |  [optional] |
|**importTargets** | [**Set&lt;NestedRouteTarget&gt;**](NestedRouteTarget.md) |  |  [optional] |
|**exportTargets** | [**Set&lt;NestedRouteTarget&gt;**](NestedRouteTarget.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**ipaddressCount** | **Integer** |  |  [optional] [readonly] |
|**prefixCount** | **Integer** |  |  [optional] [readonly] |




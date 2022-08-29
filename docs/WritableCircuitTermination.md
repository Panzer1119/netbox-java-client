

# WritableCircuitTermination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**circuit** | **Integer** |  |  |
|**termSide** | [**TermSideEnum**](#TermSideEnum) |  |  |
|**site** | **Integer** |  |  [optional] |
|**providerNetwork** | **Integer** |  |  [optional] |
|**portSpeed** | **Integer** |  |  [optional] |
|**upstreamSpeed** | **Integer** | Upstream speed, if different from port speed |  [optional] |
|**xconnectId** | **String** |  |  [optional] |
|**ppInfo** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**cable** | [**NestedCable**](NestedCable.md) |  |  [optional] |
|**cableEnd** | **String** |  |  [optional] [readonly] |
|**linkPeers** | **List&lt;String&gt;** |  Return the appropriate serializer for the link termination model.  |  [optional] [readonly] |
|**linkPeersType** | **String** |  |  [optional] [readonly] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**occupied** | **Boolean** |  |  [optional] [readonly] |



## Enum: TermSideEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| Z | &quot;Z&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




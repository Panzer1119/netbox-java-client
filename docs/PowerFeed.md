

# PowerFeed


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**powerPanel** | [**NestedPowerPanel**](NestedPowerPanel.md) |  |  |
|**rack** | [**NestedRack**](NestedRack.md) |  |  [optional] |
|**name** | **String** |  |  |
|**status** | [**Status4**](Status4.md) |  |  [optional] |
|**type** | [**Type3**](Type3.md) |  |  [optional] |
|**supply** | [**Supply**](Supply.md) |  |  [optional] |
|**phase** | [**Phase**](Phase.md) |  |  [optional] |
|**voltage** | **Integer** |  |  [optional] |
|**amperage** | **Integer** |  |  [optional] |
|**maxUtilization** | **Integer** | Maximum permissible draw (percentage) |  [optional] |
|**comments** | **String** |  |  [optional] |
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




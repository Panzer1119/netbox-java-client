

# FrontPort


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**device** | [**NestedDevice**](NestedDevice.md) |  |  |
|**module** | [**ComponentNestedModule**](ComponentNestedModule.md) |  |  [optional] |
|**name** | **String** |  |  |
|**label** | **String** | Physical label |  [optional] |
|**type** | [**Type1**](Type1.md) |  |  |
|**color** | **String** |  |  [optional] |
|**rearPort** | [**FrontPortRearPort**](FrontPortRearPort.md) |  |  |
|**rearPortPosition** | **Integer** |  |  [optional] |
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




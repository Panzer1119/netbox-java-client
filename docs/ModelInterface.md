

# ModelInterface


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
|**type** | [**Type2**](Type2.md) |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**parent** | [**NestedInterface**](NestedInterface.md) |  |  [optional] |
|**bridge** | [**NestedInterface**](NestedInterface.md) |  |  [optional] |
|**lag** | [**NestedInterface**](NestedInterface.md) |  |  [optional] |
|**mtu** | **Integer** |  |  [optional] |
|**macAddress** | **String** |  |  [optional] |
|**speed** | **Integer** |  |  [optional] |
|**duplex** | [**Duplex**](Duplex.md) |  |  [optional] |
|**wwn** | **String** | 64-bit World Wide Name |  [optional] |
|**mgmtOnly** | **Boolean** | This interface is used only for out-of-band management |  [optional] |
|**description** | **String** |  |  [optional] |
|**mode** | [**Mode**](Mode.md) |  |  [optional] |
|**rfRole** | [**RfRole**](RfRole.md) |  |  [optional] |
|**rfChannel** | [**RfChannel**](RfChannel.md) |  |  [optional] |
|**rfChannelFrequency** | **BigDecimal** |  |  [optional] |
|**rfChannelWidth** | **BigDecimal** |  |  [optional] |
|**txPower** | **Integer** |  |  [optional] |
|**untaggedVlan** | [**NestedVLAN**](NestedVLAN.md) |  |  [optional] |
|**taggedVlans** | [**Set&lt;NestedVLAN&gt;**](NestedVLAN.md) |  |  [optional] |
|**markConnected** | **Boolean** | Treat as if a cable is connected |  [optional] |
|**cable** | [**NestedCable**](NestedCable.md) |  |  [optional] |
|**wirelessLink** | [**NestedWirelessLink**](NestedWirelessLink.md) |  |  [optional] |
|**linkPeer** | **Map&lt;String, String&gt;** |  Return the appropriate serializer for the link termination model.  |  [optional] [readonly] |
|**linkPeerType** | **String** |  |  [optional] [readonly] |
|**wirelessLans** | [**Set&lt;NestedWirelessLAN&gt;**](NestedWirelessLAN.md) |  |  [optional] |
|**vrf** | [**NestedVRF**](NestedVRF.md) |  |  [optional] |
|**connectedEndpoint** | **Map&lt;String, String&gt;** |  Return the appropriate serializer for the type of connected object.  |  [optional] [readonly] |
|**connectedEndpointType** | **String** |  |  [optional] [readonly] |
|**connectedEndpointReachable** | **Boolean** |  |  [optional] [readonly] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**countIpaddresses** | **Integer** |  |  [optional] [readonly] |
|**countFhrpGroups** | **Integer** |  |  [optional] [readonly] |
|**occupied** | **Boolean** |  |  [optional] [readonly] |




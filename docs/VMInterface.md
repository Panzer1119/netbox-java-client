

# VMInterface


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**virtualMachine** | [**NestedVirtualMachine**](NestedVirtualMachine.md) |  |  |
|**name** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**parent** | [**NestedVMInterface**](NestedVMInterface.md) |  |  [optional] |
|**bridge** | [**NestedVMInterface**](NestedVMInterface.md) |  |  [optional] |
|**mtu** | **Integer** |  |  [optional] |
|**macAddress** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**mode** | [**Mode**](Mode.md) |  |  [optional] |
|**untaggedVlan** | [**NestedVLAN**](NestedVLAN.md) |  |  [optional] |
|**taggedVlans** | [**Set&lt;NestedVLAN&gt;**](NestedVLAN.md) |  |  [optional] |
|**vrf** | [**NestedVRF**](NestedVRF.md) |  |  [optional] |
|**l2vpnTermination** | [**NestedL2VPNTermination**](NestedL2VPNTermination.md) |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Object** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |
|**countIpaddresses** | **Integer** |  |  [optional] [readonly] |
|**countFhrpGroups** | **Integer** |  |  [optional] [readonly] |




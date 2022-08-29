

# ObjectChange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**time** | **OffsetDateTime** |  |  [optional] [readonly] |
|**user** | [**NestedUser**](NestedUser.md) |  |  [optional] |
|**userName** | **String** |  |  [optional] [readonly] |
|**requestId** | **UUID** |  |  [optional] [readonly] |
|**action** | [**Action**](Action.md) |  |  [optional] |
|**changedObjectType** | **String** |  |  [optional] [readonly] |
|**changedObjectId** | **Integer** |  |  |
|**changedObject** | **Map&lt;String, String&gt;** |  Serialize a nested representation of the changed object.  |  [optional] [readonly] |
|**prechangeData** | **String** |  |  [optional] [readonly] |
|**postchangeData** | **String** |  |  [optional] [readonly] |




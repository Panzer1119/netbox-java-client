

# ObjectPermission


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**objectTypes** | **Set&lt;String&gt;** |  |  |
|**groups** | [**Set&lt;NestedGroup&gt;**](NestedGroup.md) |  |  [optional] |
|**users** | [**Set&lt;NestedUser&gt;**](NestedUser.md) |  |  [optional] |
|**actions** | **List&lt;String&gt;** | The list of actions granted by this permission |  |
|**constraints** | **String** | Queryset filter matching the applicable objects of the selected type(s) |  [optional] |




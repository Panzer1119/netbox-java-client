

# CustomLink


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**contentType** | **String** |  |  |
|**name** | **String** |  |  |
|**enabled** | **Boolean** |  |  [optional] |
|**linkText** | **String** | Jinja2 template code for link text |  |
|**linkUrl** | **String** | Jinja2 template code for link URL |  |
|**weight** | **Integer** |  |  [optional] |
|**groupName** | **String** | Links with the same group will appear as a dropdown menu |  [optional] |
|**buttonClass** | [**ButtonClassEnum**](#ButtonClassEnum) | The class of the first link in a group will be used for the dropdown button |  [optional] |
|**newWindow** | **Boolean** | Force link to open in a new window |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: ButtonClassEnum

| Name | Value |
|---- | -----|
| OUTLINE_DARK | &quot;outline-dark&quot; |
| BLUE | &quot;blue&quot; |
| INDIGO | &quot;indigo&quot; |
| PURPLE | &quot;purple&quot; |
| PINK | &quot;pink&quot; |
| RED | &quot;red&quot; |
| ORANGE | &quot;orange&quot; |
| YELLOW | &quot;yellow&quot; |
| GREEN | &quot;green&quot; |
| TEAL | &quot;teal&quot; |
| CYAN | &quot;cyan&quot; |
| GRAY | &quot;gray&quot; |
| BLACK | &quot;black&quot; |
| WHITE | &quot;white&quot; |
| GHOST_DARK | &quot;ghost-dark&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |






# ExportTemplate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**contentType** | **String** |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**templateCode** | **String** | Jinja2 template code. The list of objects being exported is passed as a context variable named &lt;code&gt;queryset&lt;/code&gt;. |  |
|**mimeType** | **String** | Defaults to &lt;code&gt;text/plain&lt;/code&gt; |  [optional] |
|**fileExtension** | **String** | Extension to append to the rendered filename |  [optional] |
|**asAttachment** | **Boolean** | Download file as attachment |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |




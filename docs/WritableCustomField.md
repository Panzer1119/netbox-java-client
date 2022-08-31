

# WritableCustomField


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**url** | **URI** |  |  [optional] [readonly] |
|**display** | **String** |  |  [optional] [readonly] |
|**contentTypes** | **Set&lt;String&gt;** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of data this custom field holds |  [optional] |
|**objectType** | **String** |  |  [optional] |
|**dataType** | **String** |  |  [optional] [readonly] |
|**name** | **String** | Internal field name |  |
|**label** | **String** | Name of the field as displayed to users (if not provided, the field&#39;s name will be used) |  [optional] |
|**description** | **String** |  |  [optional] |
|**required** | **Boolean** | If true, this field is required when creating new objects or editing an existing object. |  [optional] |
|**filterLogic** | [**FilterLogicEnum**](#FilterLogicEnum) | Loose matches any instance of a given string; exact matches the entire field. |  [optional] |
|**_default** | **String** | Default value for the field (must be a JSON value). Encapsulate strings with double quotes (e.g. \&quot;Foo\&quot;). |  [optional] |
|**weight** | **Integer** | Fields with higher weights appear lower in a form. |  [optional] |
|**validationMinimum** | **Integer** | Minimum allowed value (for numeric fields) |  [optional] |
|**validationMaximum** | **Integer** | Maximum allowed value (for numeric fields) |  [optional] |
|**validationRegex** | **String** | Regular expression to enforce on text field values. Use ^ and $ to force matching of entire string. For example, &lt;code&gt;^[A-Z]{3}$&lt;/code&gt; will limit values to exactly three uppercase letters. |  [optional] |
|**choices** | **List&lt;String&gt;** | Comma-separated list of available choices (for selection fields) |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| LONGTEXT | &quot;longtext&quot; |
| INTEGER | &quot;integer&quot; |
| BOOLEAN | &quot;boolean&quot; |
| DATE | &quot;date&quot; |
| URL | &quot;url&quot; |
| JSON | &quot;json&quot; |
| SELECT | &quot;select&quot; |
| MULTISELECT | &quot;multiselect&quot; |
| OBJECT | &quot;object&quot; |
| MULTIOBJECT | &quot;multiobject&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: FilterLogicEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| LOOSE | &quot;loose&quot; |
| EXACT | &quot;exact&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |




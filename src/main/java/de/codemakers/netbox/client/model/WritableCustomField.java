/*
 * NetBox API
 * API to access NetBox
 *
 * The version of the OpenAPI document: 3.3
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.codemakers.netbox.client.model;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.codemakers.netbox.client.JSON;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Map.Entry;

/**
 * WritableCustomField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritableCustomField {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_CONTENT_TYPES = "content_types";
    @SerializedName(SERIALIZED_NAME_CONTENT_TYPES)
    private Set<String> contentTypes = new LinkedHashSet<>();
    
    /**
     * The type of data this custom field holds
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        TEXT("text"),
        
        LONGTEXT("longtext"),
        
        INTEGER("integer"),
        
        BOOLEAN("boolean"),
        
        DATE("date"),
        
        URL("url"),
        
        JSON("json"),
        
        SELECT("select"),
        
        MULTISELECT("multiselect"),
        
        OBJECT("object"),
        
        MULTIOBJECT("multiobject"),
        
        UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");
        
        private String value;
        
        TypeEnum(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return String.valueOf(value);
        }
        
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
        
        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }
            
            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }
    }
    
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private TypeEnum type;
    
    public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
    @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
    private String objectType;
    
    public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
    @SerializedName(SERIALIZED_NAME_DATA_TYPE)
    private String dataType;
    
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;
    
    public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
    @SerializedName(SERIALIZED_NAME_GROUP_NAME)
    private String groupName;
    
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    
    public static final String SERIALIZED_NAME_REQUIRED = "required";
    @SerializedName(SERIALIZED_NAME_REQUIRED)
    private Boolean required;
    
    /**
     * Loose matches any instance of a given string; exact matches the entire field.
     */
    @JsonAdapter(FilterLogicEnum.Adapter.class)
    public enum FilterLogicEnum {
        DISABLED("disabled"),
        
        LOOSE("loose"),
        
        EXACT("exact"),
        
        UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");
        
        private String value;
        
        FilterLogicEnum(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return String.valueOf(value);
        }
        
        public static FilterLogicEnum fromValue(String value) {
            for (FilterLogicEnum b : FilterLogicEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
        
        public static class Adapter extends TypeAdapter<FilterLogicEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FilterLogicEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }
            
            @Override
            public FilterLogicEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FilterLogicEnum.fromValue(value);
            }
        }
    }
    
    public static final String SERIALIZED_NAME_FILTER_LOGIC = "filter_logic";
    @SerializedName(SERIALIZED_NAME_FILTER_LOGIC)
    private FilterLogicEnum filterLogic;
    
    /**
     * Specifies the visibility of custom field in the UI
     */
    @JsonAdapter(UiVisibilityEnum.Adapter.class)
    public enum UiVisibilityEnum {
        READ_WRITE("read-write"),
        
        READ_ONLY("read-only"),
        
        HIDDEN("hidden"),
        
        UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");
        
        private String value;
        
        UiVisibilityEnum(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return String.valueOf(value);
        }
        
        public static UiVisibilityEnum fromValue(String value) {
            for (UiVisibilityEnum b : UiVisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
        
        public static class Adapter extends TypeAdapter<UiVisibilityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final UiVisibilityEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }
            
            @Override
            public UiVisibilityEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return UiVisibilityEnum.fromValue(value);
            }
        }
    }
    
    public static final String SERIALIZED_NAME_UI_VISIBILITY = "ui_visibility";
    @SerializedName(SERIALIZED_NAME_UI_VISIBILITY)
    private UiVisibilityEnum uiVisibility;
    
    public static final String SERIALIZED_NAME_DEFAULT = "default";
    @SerializedName(SERIALIZED_NAME_DEFAULT)
    private String _default;
    
    public static final String SERIALIZED_NAME_WEIGHT = "weight";
    @SerializedName(SERIALIZED_NAME_WEIGHT)
    private Integer weight;
    
    public static final String SERIALIZED_NAME_VALIDATION_MINIMUM = "validation_minimum";
    @SerializedName(SERIALIZED_NAME_VALIDATION_MINIMUM)
    private Integer validationMinimum;
    
    public static final String SERIALIZED_NAME_VALIDATION_MAXIMUM = "validation_maximum";
    @SerializedName(SERIALIZED_NAME_VALIDATION_MAXIMUM)
    private Integer validationMaximum;
    
    public static final String SERIALIZED_NAME_VALIDATION_REGEX = "validation_regex";
    @SerializedName(SERIALIZED_NAME_VALIDATION_REGEX)
    private String validationRegex;
    
    public static final String SERIALIZED_NAME_CHOICES = "choices";
    @SerializedName(SERIALIZED_NAME_CHOICES)
    private List<String> choices = null;
    
    public static final String SERIALIZED_NAME_CREATED = "created";
    @SerializedName(SERIALIZED_NAME_CREATED)
    private OffsetDateTime created;
    
    public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
    @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
    private OffsetDateTime lastUpdated;
    
    public WritableCustomField() {
    }
    
    
    public WritableCustomField(Integer id, URI url, String display, String dataType, OffsetDateTime created, OffsetDateTime lastUpdated) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.dataType = dataType;
        this.created = created;
        this.lastUpdated = lastUpdated;
    }
    
    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getId() {
        return id;
    }
    
    
    /**
     * Get url
     *
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public URI getUrl() {
        return url;
    }
    
    
    /**
     * Get display
     *
     * @return display
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getDisplay() {
        return display;
    }
    
    
    public WritableCustomField contentTypes(Set<String> contentTypes) {
        
        this.contentTypes = contentTypes;
        return this;
    }
    
    public WritableCustomField addContentTypesItem(String contentTypesItem) {
        this.contentTypes.add(contentTypesItem);
        return this;
    }
    
    /**
     * Get contentTypes
     *
     * @return contentTypes
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public Set<String> getContentTypes() {
        return contentTypes;
    }
    
    
    public void setContentTypes(Set<String> contentTypes) {
        this.contentTypes = contentTypes;
    }
    
    
    public WritableCustomField type(TypeEnum type) {
        
        this.type = type;
        return this;
    }
    
    /**
     * The type of data this custom field holds
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The type of data this custom field holds")
    
    public TypeEnum getType() {
        return type;
    }
    
    
    public void setType(TypeEnum type) {
        this.type = type;
    }
    
    
    public WritableCustomField objectType(String objectType) {
        
        this.objectType = objectType;
        return this;
    }
    
    /**
     * Get objectType
     *
     * @return objectType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getObjectType() {
        return objectType;
    }
    
    
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
    
    
    /**
     * Get dataType
     *
     * @return dataType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getDataType() {
        return dataType;
    }
    
    
    public WritableCustomField name(String name) {
        
        this.name = name;
        return this;
    }
    
    /**
     * Internal field name
     *
     * @return name
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Internal field name")
    
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public WritableCustomField label(String label) {
        
        this.label = label;
        return this;
    }
    
    /**
     * Name of the field as displayed to users (if not provided, the field&#39;s name will be used)
     *
     * @return label
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Name of the field as displayed to users (if not provided, the field's name will be used)")
    
    public String getLabel() {
        return label;
    }
    
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    
    public WritableCustomField groupName(String groupName) {
        
        this.groupName = groupName;
        return this;
    }
    
    /**
     * Custom fields within the same group will be displayed together
     *
     * @return groupName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Custom fields within the same group will be displayed together")
    
    public String getGroupName() {
        return groupName;
    }
    
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    
    public WritableCustomField description(String description) {
        
        this.description = description;
        return this;
    }
    
    /**
     * Get description
     *
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getDescription() {
        return description;
    }
    
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public WritableCustomField required(Boolean required) {
        
        this.required = required;
        return this;
    }
    
    /**
     * If true, this field is required when creating new objects or editing an existing object.
     *
     * @return required
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "If true, this field is required when creating new objects or editing an existing object.")
    
    public Boolean getRequired() {
        return required;
    }
    
    
    public void setRequired(Boolean required) {
        this.required = required;
    }
    
    
    public WritableCustomField filterLogic(FilterLogicEnum filterLogic) {
        
        this.filterLogic = filterLogic;
        return this;
    }
    
    /**
     * Loose matches any instance of a given string; exact matches the entire field.
     *
     * @return filterLogic
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Loose matches any instance of a given string; exact matches the entire field.")
    
    public FilterLogicEnum getFilterLogic() {
        return filterLogic;
    }
    
    
    public void setFilterLogic(FilterLogicEnum filterLogic) {
        this.filterLogic = filterLogic;
    }
    
    
    public WritableCustomField uiVisibility(UiVisibilityEnum uiVisibility) {
        
        this.uiVisibility = uiVisibility;
        return this;
    }
    
    /**
     * Specifies the visibility of custom field in the UI
     *
     * @return uiVisibility
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Specifies the visibility of custom field in the UI")
    
    public UiVisibilityEnum getUiVisibility() {
        return uiVisibility;
    }
    
    
    public void setUiVisibility(UiVisibilityEnum uiVisibility) {
        this.uiVisibility = uiVisibility;
    }
    
    
    public WritableCustomField _default(String _default) {
        
        this._default = _default;
        return this;
    }
    
    /**
     * Default value for the field (must be a JSON value). Encapsulate strings with double quotes (e.g. \&quot;Foo\&quot;).
     *
     * @return _default
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Default value for the field (must be a JSON value). Encapsulate strings with double quotes (e.g. \"Foo\").")
    
    public String getDefault() {
        return _default;
    }
    
    
    public void setDefault(String _default) {
        this._default = _default;
    }
    
    
    public WritableCustomField weight(Integer weight) {
        
        this.weight = weight;
        return this;
    }
    
    /**
     * Fields with higher weights appear lower in a form.
     * minimum: 0
     * maximum: 32767
     *
     * @return weight
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Fields with higher weights appear lower in a form.")
    
    public Integer getWeight() {
        return weight;
    }
    
    
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    
    public WritableCustomField validationMinimum(Integer validationMinimum) {
        
        this.validationMinimum = validationMinimum;
        return this;
    }
    
    /**
     * Minimum allowed value (for numeric fields)
     * minimum: -2147483648
     * maximum: 2147483647
     *
     * @return validationMinimum
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Minimum allowed value (for numeric fields)")
    
    public Integer getValidationMinimum() {
        return validationMinimum;
    }
    
    
    public void setValidationMinimum(Integer validationMinimum) {
        this.validationMinimum = validationMinimum;
    }
    
    
    public WritableCustomField validationMaximum(Integer validationMaximum) {
        
        this.validationMaximum = validationMaximum;
        return this;
    }
    
    /**
     * Maximum allowed value (for numeric fields)
     * minimum: -2147483648
     * maximum: 2147483647
     *
     * @return validationMaximum
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Maximum allowed value (for numeric fields)")
    
    public Integer getValidationMaximum() {
        return validationMaximum;
    }
    
    
    public void setValidationMaximum(Integer validationMaximum) {
        this.validationMaximum = validationMaximum;
    }
    
    
    public WritableCustomField validationRegex(String validationRegex) {
        
        this.validationRegex = validationRegex;
        return this;
    }
    
    /**
     * Regular expression to enforce on text field values. Use ^ and $ to force matching of entire string. For example, &lt;code&gt;^[A-Z]{3}$&lt;/code&gt; will limit values to exactly three uppercase letters.
     *
     * @return validationRegex
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Regular expression to enforce on text field values. Use ^ and $ to force matching of entire string. For example, <code>^[A-Z]{3}$</code> will limit values to exactly three uppercase letters.")
    
    public String getValidationRegex() {
        return validationRegex;
    }
    
    
    public void setValidationRegex(String validationRegex) {
        this.validationRegex = validationRegex;
    }
    
    
    public WritableCustomField choices(List<String> choices) {
        
        this.choices = choices;
        return this;
    }
    
    public WritableCustomField addChoicesItem(String choicesItem) {
        if (this.choices == null) {
            this.choices = new ArrayList<>();
        }
        this.choices.add(choicesItem);
        return this;
    }
    
    /**
     * Comma-separated list of available choices (for selection fields)
     *
     * @return choices
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Comma-separated list of available choices (for selection fields)")
    
    public List<String> getChoices() {
        return choices;
    }
    
    
    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
    
    
    /**
     * Get created
     *
     * @return created
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public OffsetDateTime getCreated() {
        return created;
    }
    
    
    /**
     * Get lastUpdated
     *
     * @return lastUpdated
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WritableCustomField writableCustomField = (WritableCustomField) o;
        return Objects.equals(this.id, writableCustomField.id) && Objects.equals(this.url, writableCustomField.url) && Objects.equals(this.display, writableCustomField.display) && Objects.equals(this.contentTypes, writableCustomField.contentTypes) && Objects.equals(this.type, writableCustomField.type) && Objects.equals(this.objectType, writableCustomField.objectType) && Objects.equals(this.dataType, writableCustomField.dataType) && Objects.equals(this.name, writableCustomField.name) && Objects.equals(this.label, writableCustomField.label) && Objects.equals(this.groupName, writableCustomField.groupName) && Objects.equals(this.description, writableCustomField.description) && Objects.equals(this.required, writableCustomField.required) && Objects.equals(this.filterLogic, writableCustomField.filterLogic) && Objects.equals(this.uiVisibility, writableCustomField.uiVisibility) && Objects.equals(this._default, writableCustomField._default) && Objects.equals(this.weight, writableCustomField.weight) && Objects.equals(this.validationMinimum, writableCustomField.validationMinimum) && Objects.equals(this.validationMaximum, writableCustomField.validationMaximum) && Objects.equals(this.validationRegex, writableCustomField.validationRegex) && Objects.equals(this.choices, writableCustomField.choices) && Objects.equals(this.created, writableCustomField.created) && Objects.equals(this.lastUpdated, writableCustomField.lastUpdated);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, contentTypes, type, objectType, dataType, name, label, groupName, description, required, filterLogic, uiVisibility, _default, weight, validationMinimum, validationMaximum, validationRegex, choices, created, lastUpdated);
    }
    
    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WritableCustomField {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    contentTypes: ").append(toIndentedString(contentTypes)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    filterLogic: ").append(toIndentedString(filterLogic)).append("\n");
        sb.append("    uiVisibility: ").append(toIndentedString(uiVisibility)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    validationMinimum: ").append(toIndentedString(validationMinimum)).append("\n");
        sb.append("    validationMaximum: ").append(toIndentedString(validationMaximum)).append("\n");
        sb.append("    validationRegex: ").append(toIndentedString(validationRegex)).append("\n");
        sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
    
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;
    
    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("id");
        openapiFields.add("url");
        openapiFields.add("display");
        openapiFields.add("content_types");
        openapiFields.add("type");
        openapiFields.add("object_type");
        openapiFields.add("data_type");
        openapiFields.add("name");
        openapiFields.add("label");
        openapiFields.add("group_name");
        openapiFields.add("description");
        openapiFields.add("required");
        openapiFields.add("filter_logic");
        openapiFields.add("ui_visibility");
        openapiFields.add("default");
        openapiFields.add("weight");
        openapiFields.add("validation_minimum");
        openapiFields.add("validation_maximum");
        openapiFields.add("validation_regex");
        openapiFields.add("choices");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("content_types");
        openapiRequiredFields.add("name");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to WritableCustomField
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (WritableCustomField.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in WritableCustomField is not found in the empty JSON string", WritableCustomField.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!WritableCustomField.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritableCustomField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WritableCustomField.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
            }
        }
        if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url")
                    .toString()));
        }
        if (jsonObj.get("display") != null && !jsonObj.get("display").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("content_types") != null && !jsonObj.get("content_types").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `content_types` to be an array in the JSON string but got `%s`", jsonObj.get("content_types")
                    .toString()));
        }
        if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type")
                    .toString()));
        }
        if (jsonObj.get("object_type") != null && !jsonObj.get("object_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `object_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object_type")
                    .toString()));
        }
        if (jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type")
                    .toString()));
        }
        if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name")
                    .toString()));
        }
        if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label")
                    .toString()));
        }
        if (jsonObj.get("group_name") != null && !jsonObj.get("group_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `group_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_name")
                    .toString()));
        }
        if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description")
                    .toString()));
        }
        if (jsonObj.get("filter_logic") != null && !jsonObj.get("filter_logic").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `filter_logic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter_logic")
                    .toString()));
        }
        if (jsonObj.get("ui_visibility") != null && !jsonObj.get("ui_visibility").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `ui_visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ui_visibility")
                    .toString()));
        }
        if (jsonObj.get("default") != null && !jsonObj.get("default").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `default` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default")
                    .toString()));
        }
        if (jsonObj.get("validation_regex") != null && !jsonObj.get("validation_regex").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `validation_regex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validation_regex")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("choices") != null && !jsonObj.get("choices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `choices` to be an array in the JSON string but got `%s`", jsonObj.get("choices")
                    .toString()));
        }
    }
    
    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WritableCustomField.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WritableCustomField' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WritableCustomField> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(WritableCustomField.class));
            
            return (TypeAdapter<T>) new TypeAdapter<WritableCustomField>() {
                @Override
                public void write(JsonWriter out, WritableCustomField value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public WritableCustomField read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of WritableCustomField given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of WritableCustomField
     *
     * @throws IOException if the JSON string is invalid with respect to WritableCustomField
     */
    public static WritableCustomField fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WritableCustomField.class);
    }
    
    /**
     * Convert an instance of WritableCustomField to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


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
 * WritableCluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritableCluster {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private Integer type;
    
    public static final String SERIALIZED_NAME_GROUP = "group";
    @SerializedName(SERIALIZED_NAME_GROUP)
    private Integer group;
    
    /**
     * Gets or Sets status
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        PLANNED("planned"),
        
        STAGING("staging"),
        
        ACTIVE("active"),
        
        DECOMMISSIONING("decommissioning"),
        
        OFFLINE("offline"),
        
        UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");
        
        private String value;
        
        StatusEnum(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return String.valueOf(value);
        }
        
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
        
        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }
            
            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }
    
    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;
    
    public static final String SERIALIZED_NAME_TENANT = "tenant";
    @SerializedName(SERIALIZED_NAME_TENANT)
    private Integer tenant;
    
    public static final String SERIALIZED_NAME_SITE = "site";
    @SerializedName(SERIALIZED_NAME_SITE)
    private Integer site;
    
    public static final String SERIALIZED_NAME_COMMENTS = "comments";
    @SerializedName(SERIALIZED_NAME_COMMENTS)
    private String comments;
    
    public static final String SERIALIZED_NAME_TAGS = "tags";
    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<NestedTag> tags = null;
    
    public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
    @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
    private Object customFields;
    
    public static final String SERIALIZED_NAME_CREATED = "created";
    @SerializedName(SERIALIZED_NAME_CREATED)
    private OffsetDateTime created;
    
    public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
    @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
    private OffsetDateTime lastUpdated;
    
    public static final String SERIALIZED_NAME_DEVICE_COUNT = "device_count";
    @SerializedName(SERIALIZED_NAME_DEVICE_COUNT)
    private Integer deviceCount;
    
    public static final String SERIALIZED_NAME_VIRTUALMACHINE_COUNT = "virtualmachine_count";
    @SerializedName(SERIALIZED_NAME_VIRTUALMACHINE_COUNT)
    private Integer virtualmachineCount;
    
    public WritableCluster() {
    }
    
    
    public WritableCluster(Integer id, URI url, String display, OffsetDateTime created, OffsetDateTime lastUpdated, Integer deviceCount, Integer virtualmachineCount) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.deviceCount = deviceCount;
        this.virtualmachineCount = virtualmachineCount;
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
    
    
    public WritableCluster name(String name) {
        
        this.name = name;
        return this;
    }
    
    /**
     * Get name
     *
     * @return name
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public WritableCluster type(Integer type) {
        
        this.type = type;
        return this;
    }
    
    /**
     * Get type
     *
     * @return type
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public Integer getType() {
        return type;
    }
    
    
    public void setType(Integer type) {
        this.type = type;
    }
    
    
    public WritableCluster group(Integer group) {
        
        this.group = group;
        return this;
    }
    
    /**
     * Get group
     *
     * @return group
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(required = true, value = "")
    
    public Integer getGroup() {
        return group;
    }
    
    
    public void setGroup(Integer group) {
        this.group = group;
    }
    
    
    public WritableCluster status(StatusEnum status) {
        
        this.status = status;
        return this;
    }
    
    /**
     * Get status
     *
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public StatusEnum getStatus() {
        return status;
    }
    
    
    public void setStatus(StatusEnum status) {
        this.status = status;
    }
    
    
    public WritableCluster tenant(Integer tenant) {
        
        this.tenant = tenant;
        return this;
    }
    
    /**
     * Get tenant
     *
     * @return tenant
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getTenant() {
        return tenant;
    }
    
    
    public void setTenant(Integer tenant) {
        this.tenant = tenant;
    }
    
    
    public WritableCluster site(Integer site) {
        
        this.site = site;
        return this;
    }
    
    /**
     * Get site
     *
     * @return site
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(required = true, value = "")
    
    public Integer getSite() {
        return site;
    }
    
    
    public void setSite(Integer site) {
        this.site = site;
    }
    
    
    public WritableCluster comments(String comments) {
        
        this.comments = comments;
        return this;
    }
    
    /**
     * Get comments
     *
     * @return comments
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getComments() {
        return comments;
    }
    
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    public WritableCluster tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public WritableCluster addTagsItem(NestedTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }
    
    /**
     * Get tags
     *
     * @return tags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public List<NestedTag> getTags() {
        return tags;
    }
    
    
    public void setTags(List<NestedTag> tags) {
        this.tags = tags;
    }
    
    
    public WritableCluster customFields(Object customFields) {
        
        this.customFields = customFields;
        return this;
    }
    
    /**
     * Get customFields
     *
     * @return customFields
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Object getCustomFields() {
        return customFields;
    }
    
    
    public void setCustomFields(Object customFields) {
        this.customFields = customFields;
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
    
    
    /**
     * Get deviceCount
     *
     * @return deviceCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getDeviceCount() {
        return deviceCount;
    }
    
    
    /**
     * Get virtualmachineCount
     *
     * @return virtualmachineCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getVirtualmachineCount() {
        return virtualmachineCount;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WritableCluster writableCluster = (WritableCluster) o;
        return Objects.equals(this.id, writableCluster.id) && Objects.equals(this.url, writableCluster.url) && Objects.equals(this.display, writableCluster.display) && Objects.equals(this.name, writableCluster.name) && Objects.equals(this.type, writableCluster.type) && Objects.equals(this.group, writableCluster.group) && Objects.equals(this.status, writableCluster.status) && Objects.equals(this.tenant, writableCluster.tenant) && Objects.equals(this.site, writableCluster.site) && Objects.equals(this.comments, writableCluster.comments) && Objects.equals(this.tags, writableCluster.tags) && Objects.equals(this.customFields, writableCluster.customFields) && Objects.equals(this.created, writableCluster.created) && Objects.equals(this.lastUpdated, writableCluster.lastUpdated) && Objects.equals(this.deviceCount, writableCluster.deviceCount) && Objects.equals(this.virtualmachineCount, writableCluster.virtualmachineCount);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, name, type, group, status, tenant, site, comments, tags, customFields, created, lastUpdated, deviceCount, virtualmachineCount);
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
        sb.append("class WritableCluster {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    deviceCount: ").append(toIndentedString(deviceCount)).append("\n");
        sb.append("    virtualmachineCount: ").append(toIndentedString(virtualmachineCount)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("type");
        openapiFields.add("group");
        openapiFields.add("status");
        openapiFields.add("tenant");
        openapiFields.add("site");
        openapiFields.add("comments");
        openapiFields.add("tags");
        openapiFields.add("custom_fields");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        openapiFields.add("device_count");
        openapiFields.add("virtualmachine_count");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("group");
        openapiRequiredFields.add("site");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to WritableCluster
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (WritableCluster.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in WritableCluster is not found in the empty JSON string", WritableCluster.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!WritableCluster.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritableCluster` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WritableCluster.openapiRequiredFields) {
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
        if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name")
                    .toString()));
        }
        if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status")
                    .toString()));
        }
        if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments")
                    .toString()));
        }
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
            // ensure the json data is an array
            if (!jsonObj.get("tags").isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags")
                        .toString()));
            }
            
            // validate the optional field `tags` (array)
            for (int i = 0; i < jsonArraytags.size(); i++) {
                NestedTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
            }
            ;
        }
    }
    
    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WritableCluster.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WritableCluster' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WritableCluster> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(WritableCluster.class));
            
            return (TypeAdapter<T>) new TypeAdapter<WritableCluster>() {
                @Override
                public void write(JsonWriter out, WritableCluster value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public WritableCluster read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of WritableCluster given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of WritableCluster
     *
     * @throws IOException if the JSON string is invalid with respect to WritableCluster
     */
    public static WritableCluster fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WritableCluster.class);
    }
    
    /**
     * Convert an instance of WritableCluster to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


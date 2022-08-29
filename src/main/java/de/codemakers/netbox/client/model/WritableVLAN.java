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
 * WritableVLAN
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritableVLAN {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_SITE = "site";
    @SerializedName(SERIALIZED_NAME_SITE)
    private Integer site;
    
    public static final String SERIALIZED_NAME_GROUP = "group";
    @SerializedName(SERIALIZED_NAME_GROUP)
    private Integer group;
    
    public static final String SERIALIZED_NAME_VID = "vid";
    @SerializedName(SERIALIZED_NAME_VID)
    private Integer vid;
    
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    
    public static final String SERIALIZED_NAME_TENANT = "tenant";
    @SerializedName(SERIALIZED_NAME_TENANT)
    private Integer tenant;
    
    /**
     * Gets or Sets status
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        ACTIVE("active"),
        
        RESERVED("reserved"),
        
        DEPRECATED("deprecated"),
        
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
    
    public static final String SERIALIZED_NAME_ROLE = "role";
    @SerializedName(SERIALIZED_NAME_ROLE)
    private Integer role;
    
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    
    public static final String SERIALIZED_NAME_L2VPN_TERMINATION = "l2vpn_termination";
    @SerializedName(SERIALIZED_NAME_L2VPN_TERMINATION)
    private String l2vpnTermination;
    
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
    
    public static final String SERIALIZED_NAME_PREFIX_COUNT = "prefix_count";
    @SerializedName(SERIALIZED_NAME_PREFIX_COUNT)
    private Integer prefixCount;
    
    public WritableVLAN() {
    }
    
    
    public WritableVLAN(Integer id, URI url, String display, String l2vpnTermination, OffsetDateTime created, OffsetDateTime lastUpdated, Integer prefixCount) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.l2vpnTermination = l2vpnTermination;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.prefixCount = prefixCount;
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
    
    
    public WritableVLAN site(Integer site) {
        
        this.site = site;
        return this;
    }
    
    /**
     * Get site
     *
     * @return site
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getSite() {
        return site;
    }
    
    
    public void setSite(Integer site) {
        this.site = site;
    }
    
    
    public WritableVLAN group(Integer group) {
        
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
    
    
    public WritableVLAN vid(Integer vid) {
        
        this.vid = vid;
        return this;
    }
    
    /**
     * Get vid
     * minimum: 1
     * maximum: 4094
     *
     * @return vid
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public Integer getVid() {
        return vid;
    }
    
    
    public void setVid(Integer vid) {
        this.vid = vid;
    }
    
    
    public WritableVLAN name(String name) {
        
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
    
    
    public WritableVLAN tenant(Integer tenant) {
        
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
    
    
    public WritableVLAN status(StatusEnum status) {
        
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
    
    
    public WritableVLAN role(Integer role) {
        
        this.role = role;
        return this;
    }
    
    /**
     * Get role
     *
     * @return role
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getRole() {
        return role;
    }
    
    
    public void setRole(Integer role) {
        this.role = role;
    }
    
    
    public WritableVLAN description(String description) {
        
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
    
    
    /**
     * Get l2vpnTermination
     *
     * @return l2vpnTermination
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getL2vpnTermination() {
        return l2vpnTermination;
    }
    
    
    public WritableVLAN tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public WritableVLAN addTagsItem(NestedTag tagsItem) {
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
    
    
    public WritableVLAN customFields(Object customFields) {
        
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
     * Get prefixCount
     *
     * @return prefixCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getPrefixCount() {
        return prefixCount;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WritableVLAN writableVLAN = (WritableVLAN) o;
        return Objects.equals(this.id, writableVLAN.id) && Objects.equals(this.url, writableVLAN.url) && Objects.equals(this.display, writableVLAN.display) && Objects.equals(this.site, writableVLAN.site) && Objects.equals(this.group, writableVLAN.group) && Objects.equals(this.vid, writableVLAN.vid) && Objects.equals(this.name, writableVLAN.name) && Objects.equals(this.tenant, writableVLAN.tenant) && Objects.equals(this.status, writableVLAN.status) && Objects.equals(this.role, writableVLAN.role) && Objects.equals(this.description, writableVLAN.description) && Objects.equals(this.l2vpnTermination, writableVLAN.l2vpnTermination) && Objects.equals(this.tags, writableVLAN.tags) && Objects.equals(this.customFields, writableVLAN.customFields) && Objects.equals(this.created, writableVLAN.created) && Objects.equals(this.lastUpdated, writableVLAN.lastUpdated) && Objects.equals(this.prefixCount, writableVLAN.prefixCount);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, site, group, vid, name, tenant, status, role, description, l2vpnTermination, tags, customFields, created, lastUpdated, prefixCount);
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
        sb.append("class WritableVLAN {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    l2vpnTermination: ").append(toIndentedString(l2vpnTermination)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    prefixCount: ").append(toIndentedString(prefixCount)).append("\n");
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
        openapiFields.add("site");
        openapiFields.add("group");
        openapiFields.add("vid");
        openapiFields.add("name");
        openapiFields.add("tenant");
        openapiFields.add("status");
        openapiFields.add("role");
        openapiFields.add("description");
        openapiFields.add("l2vpn_termination");
        openapiFields.add("tags");
        openapiFields.add("custom_fields");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        openapiFields.add("prefix_count");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("group");
        openapiRequiredFields.add("vid");
        openapiRequiredFields.add("name");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to WritableVLAN
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (WritableVLAN.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in WritableVLAN is not found in the empty JSON string", WritableVLAN.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!WritableVLAN.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritableVLAN` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WritableVLAN.openapiRequiredFields) {
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
        if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description")
                    .toString()));
        }
        if (jsonObj.get("l2vpn_termination") != null && !jsonObj.get("l2vpn_termination").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `l2vpn_termination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("l2vpn_termination")
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
            if (!WritableVLAN.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WritableVLAN' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WritableVLAN> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(WritableVLAN.class));
            
            return (TypeAdapter<T>) new TypeAdapter<WritableVLAN>() {
                @Override
                public void write(JsonWriter out, WritableVLAN value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public WritableVLAN read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of WritableVLAN given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of WritableVLAN
     *
     * @throws IOException if the JSON string is invalid with respect to WritableVLAN
     */
    public static WritableVLAN fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WritableVLAN.class);
    }
    
    /**
     * Convert an instance of WritableVLAN to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


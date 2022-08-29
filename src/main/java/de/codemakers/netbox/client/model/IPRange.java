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
 * IPRange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class IPRange {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_FAMILY = "family";
    @SerializedName(SERIALIZED_NAME_FAMILY)
    private Family family;
    
    public static final String SERIALIZED_NAME_START_ADDRESS = "start_address";
    @SerializedName(SERIALIZED_NAME_START_ADDRESS)
    private String startAddress;
    
    public static final String SERIALIZED_NAME_END_ADDRESS = "end_address";
    @SerializedName(SERIALIZED_NAME_END_ADDRESS)
    private String endAddress;
    
    public static final String SERIALIZED_NAME_SIZE = "size";
    @SerializedName(SERIALIZED_NAME_SIZE)
    private Integer size;
    
    public static final String SERIALIZED_NAME_VRF = "vrf";
    @SerializedName(SERIALIZED_NAME_VRF)
    private NestedVRF vrf;
    
    public static final String SERIALIZED_NAME_TENANT = "tenant";
    @SerializedName(SERIALIZED_NAME_TENANT)
    private NestedTenant tenant;
    
    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private Status8 status;
    
    public static final String SERIALIZED_NAME_ROLE = "role";
    @SerializedName(SERIALIZED_NAME_ROLE)
    private NestedRole role;
    
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    
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
    
    public static final String SERIALIZED_NAME_CHILDREN = "children";
    @SerializedName(SERIALIZED_NAME_CHILDREN)
    private Integer children;
    
    public IPRange() {
    }
    
    
    public IPRange(Integer id, URI url, String display, Integer size, OffsetDateTime created, OffsetDateTime lastUpdated, Integer children) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.size = size;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.children = children;
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
    
    
    public IPRange family(Family family) {
        
        this.family = family;
        return this;
    }
    
    /**
     * Get family
     *
     * @return family
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Family getFamily() {
        return family;
    }
    
    
    public void setFamily(Family family) {
        this.family = family;
    }
    
    
    public IPRange startAddress(String startAddress) {
        
        this.startAddress = startAddress;
        return this;
    }
    
    /**
     * IPv4 or IPv6 address (with mask)
     *
     * @return startAddress
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "IPv4 or IPv6 address (with mask)")
    
    public String getStartAddress() {
        return startAddress;
    }
    
    
    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }
    
    
    public IPRange endAddress(String endAddress) {
        
        this.endAddress = endAddress;
        return this;
    }
    
    /**
     * IPv4 or IPv6 address (with mask)
     *
     * @return endAddress
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "IPv4 or IPv6 address (with mask)")
    
    public String getEndAddress() {
        return endAddress;
    }
    
    
    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }
    
    
    /**
     * Get size
     *
     * @return size
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getSize() {
        return size;
    }
    
    
    public IPRange vrf(NestedVRF vrf) {
        
        this.vrf = vrf;
        return this;
    }
    
    /**
     * Get vrf
     *
     * @return vrf
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedVRF getVrf() {
        return vrf;
    }
    
    
    public void setVrf(NestedVRF vrf) {
        this.vrf = vrf;
    }
    
    
    public IPRange tenant(NestedTenant tenant) {
        
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
    
    public NestedTenant getTenant() {
        return tenant;
    }
    
    
    public void setTenant(NestedTenant tenant) {
        this.tenant = tenant;
    }
    
    
    public IPRange status(Status8 status) {
        
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
    
    public Status8 getStatus() {
        return status;
    }
    
    
    public void setStatus(Status8 status) {
        this.status = status;
    }
    
    
    public IPRange role(NestedRole role) {
        
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
    
    public NestedRole getRole() {
        return role;
    }
    
    
    public void setRole(NestedRole role) {
        this.role = role;
    }
    
    
    public IPRange description(String description) {
        
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
    
    
    public IPRange tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public IPRange addTagsItem(NestedTag tagsItem) {
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
    
    
    public IPRange customFields(Object customFields) {
        
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
     * Get children
     *
     * @return children
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getChildren() {
        return children;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IPRange ipRange = (IPRange) o;
        return Objects.equals(this.id, ipRange.id) && Objects.equals(this.url, ipRange.url) && Objects.equals(this.display, ipRange.display) && Objects.equals(this.family, ipRange.family) && Objects.equals(this.startAddress, ipRange.startAddress) && Objects.equals(this.endAddress, ipRange.endAddress) && Objects.equals(this.size, ipRange.size) && Objects.equals(this.vrf, ipRange.vrf) && Objects.equals(this.tenant, ipRange.tenant) && Objects.equals(this.status, ipRange.status) && Objects.equals(this.role, ipRange.role) && Objects.equals(this.description, ipRange.description) && Objects.equals(this.tags, ipRange.tags) && Objects.equals(this.customFields, ipRange.customFields) && Objects.equals(this.created, ipRange.created) && Objects.equals(this.lastUpdated, ipRange.lastUpdated) && Objects.equals(this.children, ipRange.children);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, family, startAddress, endAddress, size, vrf, tenant, status, role, description, tags, customFields, created, lastUpdated, children);
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
        sb.append("class IPRange {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    family: ").append(toIndentedString(family)).append("\n");
        sb.append("    startAddress: ").append(toIndentedString(startAddress)).append("\n");
        sb.append("    endAddress: ").append(toIndentedString(endAddress)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    vrf: ").append(toIndentedString(vrf)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
        openapiFields.add("family");
        openapiFields.add("start_address");
        openapiFields.add("end_address");
        openapiFields.add("size");
        openapiFields.add("vrf");
        openapiFields.add("tenant");
        openapiFields.add("status");
        openapiFields.add("role");
        openapiFields.add("description");
        openapiFields.add("tags");
        openapiFields.add("custom_fields");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        openapiFields.add("children");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("start_address");
        openapiRequiredFields.add("end_address");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to IPRange
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (IPRange.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in IPRange is not found in the empty JSON string", IPRange.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!IPRange.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IPRange` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : IPRange.openapiRequiredFields) {
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
        // validate the optional field `family`
        if (jsonObj.getAsJsonObject("family") != null) {
            Family.validateJsonObject(jsonObj.getAsJsonObject("family"));
        }
        if (jsonObj.get("start_address") != null && !jsonObj.get("start_address").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `start_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_address")
                    .toString()));
        }
        if (jsonObj.get("end_address") != null && !jsonObj.get("end_address").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `end_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_address")
                    .toString()));
        }
        // validate the optional field `vrf`
        if (jsonObj.getAsJsonObject("vrf") != null) {
            NestedVRF.validateJsonObject(jsonObj.getAsJsonObject("vrf"));
        }
        // validate the optional field `tenant`
        if (jsonObj.getAsJsonObject("tenant") != null) {
            NestedTenant.validateJsonObject(jsonObj.getAsJsonObject("tenant"));
        }
        // validate the optional field `status`
        if (jsonObj.getAsJsonObject("status") != null) {
            Status8.validateJsonObject(jsonObj.getAsJsonObject("status"));
        }
        // validate the optional field `role`
        if (jsonObj.getAsJsonObject("role") != null) {
            NestedRole.validateJsonObject(jsonObj.getAsJsonObject("role"));
        }
        if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description")
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
            if (!IPRange.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'IPRange' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<IPRange> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(IPRange.class));
            
            return (TypeAdapter<T>) new TypeAdapter<IPRange>() {
                @Override
                public void write(JsonWriter out, IPRange value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public IPRange read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of IPRange given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of IPRange
     *
     * @throws IOException if the JSON string is invalid with respect to IPRange
     */
    public static IPRange fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, IPRange.class);
    }
    
    /**
     * Convert an instance of IPRange to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


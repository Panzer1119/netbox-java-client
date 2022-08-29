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
 * InventoryItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class InventoryItem {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_DEVICE = "device";
    @SerializedName(SERIALIZED_NAME_DEVICE)
    private NestedDevice device;
    
    public static final String SERIALIZED_NAME_PARENT = "parent";
    @SerializedName(SERIALIZED_NAME_PARENT)
    private Integer parent;
    
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;
    
    public static final String SERIALIZED_NAME_ROLE = "role";
    @SerializedName(SERIALIZED_NAME_ROLE)
    private NestedInventoryItemRole role;
    
    public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
    @SerializedName(SERIALIZED_NAME_MANUFACTURER)
    private NestedManufacturer manufacturer;
    
    public static final String SERIALIZED_NAME_PART_ID = "part_id";
    @SerializedName(SERIALIZED_NAME_PART_ID)
    private String partId;
    
    public static final String SERIALIZED_NAME_SERIAL = "serial";
    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;
    
    public static final String SERIALIZED_NAME_ASSET_TAG = "asset_tag";
    @SerializedName(SERIALIZED_NAME_ASSET_TAG)
    private String assetTag;
    
    public static final String SERIALIZED_NAME_DISCOVERED = "discovered";
    @SerializedName(SERIALIZED_NAME_DISCOVERED)
    private Boolean discovered;
    
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    
    public static final String SERIALIZED_NAME_COMPONENT_TYPE = "component_type";
    @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
    private String componentType;
    
    public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
    @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
    private Integer componentId;
    
    public static final String SERIALIZED_NAME_COMPONENT = "component";
    @SerializedName(SERIALIZED_NAME_COMPONENT)
    private Map<String, String> component = null;
    
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
    
    public static final String SERIALIZED_NAME_DEPTH = "_depth";
    @SerializedName(SERIALIZED_NAME_DEPTH)
    private Integer depth;
    
    public InventoryItem() {
    }
    
    
    public InventoryItem(Integer id, URI url, String display, Map<String, String> component, OffsetDateTime created, OffsetDateTime lastUpdated, Integer depth) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.component = component;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.depth = depth;
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
    
    
    public InventoryItem device(NestedDevice device) {
        
        this.device = device;
        return this;
    }
    
    /**
     * Get device
     *
     * @return device
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public NestedDevice getDevice() {
        return device;
    }
    
    
    public void setDevice(NestedDevice device) {
        this.device = device;
    }
    
    
    public InventoryItem parent(Integer parent) {
        
        this.parent = parent;
        return this;
    }
    
    /**
     * Get parent
     *
     * @return parent
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getParent() {
        return parent;
    }
    
    
    public void setParent(Integer parent) {
        this.parent = parent;
    }
    
    
    public InventoryItem name(String name) {
        
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
    
    
    public InventoryItem label(String label) {
        
        this.label = label;
        return this;
    }
    
    /**
     * Physical label
     *
     * @return label
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Physical label")
    
    public String getLabel() {
        return label;
    }
    
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    
    public InventoryItem role(NestedInventoryItemRole role) {
        
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
    
    public NestedInventoryItemRole getRole() {
        return role;
    }
    
    
    public void setRole(NestedInventoryItemRole role) {
        this.role = role;
    }
    
    
    public InventoryItem manufacturer(NestedManufacturer manufacturer) {
        
        this.manufacturer = manufacturer;
        return this;
    }
    
    /**
     * Get manufacturer
     *
     * @return manufacturer
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedManufacturer getManufacturer() {
        return manufacturer;
    }
    
    
    public void setManufacturer(NestedManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    
    public InventoryItem partId(String partId) {
        
        this.partId = partId;
        return this;
    }
    
    /**
     * Manufacturer-assigned part identifier
     *
     * @return partId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Manufacturer-assigned part identifier")
    
    public String getPartId() {
        return partId;
    }
    
    
    public void setPartId(String partId) {
        this.partId = partId;
    }
    
    
    public InventoryItem serial(String serial) {
        
        this.serial = serial;
        return this;
    }
    
    /**
     * Get serial
     *
     * @return serial
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getSerial() {
        return serial;
    }
    
    
    public void setSerial(String serial) {
        this.serial = serial;
    }
    
    
    public InventoryItem assetTag(String assetTag) {
        
        this.assetTag = assetTag;
        return this;
    }
    
    /**
     * A unique tag used to identify this item
     *
     * @return assetTag
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A unique tag used to identify this item")
    
    public String getAssetTag() {
        return assetTag;
    }
    
    
    public void setAssetTag(String assetTag) {
        this.assetTag = assetTag;
    }
    
    
    public InventoryItem discovered(Boolean discovered) {
        
        this.discovered = discovered;
        return this;
    }
    
    /**
     * This item was automatically discovered
     *
     * @return discovered
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "This item was automatically discovered")
    
    public Boolean getDiscovered() {
        return discovered;
    }
    
    
    public void setDiscovered(Boolean discovered) {
        this.discovered = discovered;
    }
    
    
    public InventoryItem description(String description) {
        
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
    
    
    public InventoryItem componentType(String componentType) {
        
        this.componentType = componentType;
        return this;
    }
    
    /**
     * Get componentType
     *
     * @return componentType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getComponentType() {
        return componentType;
    }
    
    
    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }
    
    
    public InventoryItem componentId(Integer componentId) {
        
        this.componentId = componentId;
        return this;
    }
    
    /**
     * Get componentId
     * minimum: 0
     * maximum: 9223372036854775807
     *
     * @return componentId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getComponentId() {
        return componentId;
    }
    
    
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }
    
    
    /**
     * Get component
     *
     * @return component
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Map<String, String> getComponent() {
        return component;
    }
    
    
    public InventoryItem tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public InventoryItem addTagsItem(NestedTag tagsItem) {
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
    
    
    public InventoryItem customFields(Object customFields) {
        
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
     * Get depth
     *
     * @return depth
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getDepth() {
        return depth;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InventoryItem inventoryItem = (InventoryItem) o;
        return Objects.equals(this.id, inventoryItem.id) && Objects.equals(this.url, inventoryItem.url) && Objects.equals(this.display, inventoryItem.display) && Objects.equals(this.device, inventoryItem.device) && Objects.equals(this.parent, inventoryItem.parent) && Objects.equals(this.name, inventoryItem.name) && Objects.equals(this.label, inventoryItem.label) && Objects.equals(this.role, inventoryItem.role) && Objects.equals(this.manufacturer, inventoryItem.manufacturer) && Objects.equals(this.partId, inventoryItem.partId) && Objects.equals(this.serial, inventoryItem.serial) && Objects.equals(this.assetTag, inventoryItem.assetTag) && Objects.equals(this.discovered, inventoryItem.discovered) && Objects.equals(this.description, inventoryItem.description) && Objects.equals(this.componentType, inventoryItem.componentType) && Objects.equals(this.componentId, inventoryItem.componentId) && Objects.equals(this.component, inventoryItem.component) && Objects.equals(this.tags, inventoryItem.tags) && Objects.equals(this.customFields, inventoryItem.customFields) && Objects.equals(this.created, inventoryItem.created) && Objects.equals(this.lastUpdated, inventoryItem.lastUpdated) && Objects.equals(this.depth, inventoryItem.depth);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, device, parent, name, label, role, manufacturer, partId, serial, assetTag, discovered, description, componentType, componentId, component, tags, customFields, created, lastUpdated, depth);
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
        sb.append("class InventoryItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    partId: ").append(toIndentedString(partId)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    assetTag: ").append(toIndentedString(assetTag)).append("\n");
        sb.append("    discovered: ").append(toIndentedString(discovered)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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
        openapiFields.add("device");
        openapiFields.add("parent");
        openapiFields.add("name");
        openapiFields.add("label");
        openapiFields.add("role");
        openapiFields.add("manufacturer");
        openapiFields.add("part_id");
        openapiFields.add("serial");
        openapiFields.add("asset_tag");
        openapiFields.add("discovered");
        openapiFields.add("description");
        openapiFields.add("component_type");
        openapiFields.add("component_id");
        openapiFields.add("component");
        openapiFields.add("tags");
        openapiFields.add("custom_fields");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        openapiFields.add("_depth");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("device");
        openapiRequiredFields.add("name");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to InventoryItem
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (InventoryItem.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in InventoryItem is not found in the empty JSON string", InventoryItem.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!InventoryItem.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InventoryItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : InventoryItem.openapiRequiredFields) {
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
        // validate the optional field `device`
        if (jsonObj.getAsJsonObject("device") != null) {
            NestedDevice.validateJsonObject(jsonObj.getAsJsonObject("device"));
        }
        if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name")
                    .toString()));
        }
        if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label")
                    .toString()));
        }
        // validate the optional field `role`
        if (jsonObj.getAsJsonObject("role") != null) {
            NestedInventoryItemRole.validateJsonObject(jsonObj.getAsJsonObject("role"));
        }
        // validate the optional field `manufacturer`
        if (jsonObj.getAsJsonObject("manufacturer") != null) {
            NestedManufacturer.validateJsonObject(jsonObj.getAsJsonObject("manufacturer"));
        }
        if (jsonObj.get("part_id") != null && !jsonObj.get("part_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `part_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part_id")
                    .toString()));
        }
        if (jsonObj.get("serial") != null && !jsonObj.get("serial").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `serial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial")
                    .toString()));
        }
        if (jsonObj.get("asset_tag") != null && !jsonObj.get("asset_tag").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `asset_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_tag")
                    .toString()));
        }
        if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description")
                    .toString()));
        }
        if (jsonObj.get("component_type") != null && !jsonObj.get("component_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `component_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component_type")
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
            if (!InventoryItem.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'InventoryItem' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<InventoryItem> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(InventoryItem.class));
            
            return (TypeAdapter<T>) new TypeAdapter<InventoryItem>() {
                @Override
                public void write(JsonWriter out, InventoryItem value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public InventoryItem read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of InventoryItem given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of InventoryItem
     *
     * @throws IOException if the JSON string is invalid with respect to InventoryItem
     */
    public static InventoryItem fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, InventoryItem.class);
    }
    
    /**
     * Convert an instance of InventoryItem to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


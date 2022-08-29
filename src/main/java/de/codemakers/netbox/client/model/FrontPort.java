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
 * FrontPort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class FrontPort {
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
    
    public static final String SERIALIZED_NAME_MODULE = "module";
    @SerializedName(SERIALIZED_NAME_MODULE)
    private ComponentNestedModule module;
    
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;
    
    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private Type1 type;
    
    public static final String SERIALIZED_NAME_COLOR = "color";
    @SerializedName(SERIALIZED_NAME_COLOR)
    private String color;
    
    public static final String SERIALIZED_NAME_REAR_PORT = "rear_port";
    @SerializedName(SERIALIZED_NAME_REAR_PORT)
    private FrontPortRearPort rearPort;
    
    public static final String SERIALIZED_NAME_REAR_PORT_POSITION = "rear_port_position";
    @SerializedName(SERIALIZED_NAME_REAR_PORT_POSITION)
    private Integer rearPortPosition;
    
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    
    public static final String SERIALIZED_NAME_MARK_CONNECTED = "mark_connected";
    @SerializedName(SERIALIZED_NAME_MARK_CONNECTED)
    private Boolean markConnected;
    
    public static final String SERIALIZED_NAME_CABLE = "cable";
    @SerializedName(SERIALIZED_NAME_CABLE)
    private NestedCable cable;
    
    public static final String SERIALIZED_NAME_CABLE_END = "cable_end";
    @SerializedName(SERIALIZED_NAME_CABLE_END)
    private String cableEnd;
    
    public static final String SERIALIZED_NAME_LINK_PEERS = "link_peers";
    @SerializedName(SERIALIZED_NAME_LINK_PEERS)
    private List<String> linkPeers = null;
    
    public static final String SERIALIZED_NAME_LINK_PEERS_TYPE = "link_peers_type";
    @SerializedName(SERIALIZED_NAME_LINK_PEERS_TYPE)
    private String linkPeersType;
    
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
    
    public static final String SERIALIZED_NAME_OCCUPIED = "_occupied";
    @SerializedName(SERIALIZED_NAME_OCCUPIED)
    private Boolean occupied;
    
    public FrontPort() {
    }
    
    
    public FrontPort(Integer id, URI url, String display, String cableEnd, List<String> linkPeers, String linkPeersType, OffsetDateTime created, OffsetDateTime lastUpdated, Boolean occupied) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.cableEnd = cableEnd;
        this.linkPeers = linkPeers;
        this.linkPeersType = linkPeersType;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.occupied = occupied;
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
    
    
    public FrontPort device(NestedDevice device) {
        
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
    
    
    public FrontPort module(ComponentNestedModule module) {
        
        this.module = module;
        return this;
    }
    
    /**
     * Get module
     *
     * @return module
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public ComponentNestedModule getModule() {
        return module;
    }
    
    
    public void setModule(ComponentNestedModule module) {
        this.module = module;
    }
    
    
    public FrontPort name(String name) {
        
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
    
    
    public FrontPort label(String label) {
        
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
    
    
    public FrontPort type(Type1 type) {
        
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
    
    public Type1 getType() {
        return type;
    }
    
    
    public void setType(Type1 type) {
        this.type = type;
    }
    
    
    public FrontPort color(String color) {
        
        this.color = color;
        return this;
    }
    
    /**
     * Get color
     *
     * @return color
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getColor() {
        return color;
    }
    
    
    public void setColor(String color) {
        this.color = color;
    }
    
    
    public FrontPort rearPort(FrontPortRearPort rearPort) {
        
        this.rearPort = rearPort;
        return this;
    }
    
    /**
     * Get rearPort
     *
     * @return rearPort
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public FrontPortRearPort getRearPort() {
        return rearPort;
    }
    
    
    public void setRearPort(FrontPortRearPort rearPort) {
        this.rearPort = rearPort;
    }
    
    
    public FrontPort rearPortPosition(Integer rearPortPosition) {
        
        this.rearPortPosition = rearPortPosition;
        return this;
    }
    
    /**
     * Get rearPortPosition
     * minimum: 1
     * maximum: 1024
     *
     * @return rearPortPosition
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getRearPortPosition() {
        return rearPortPosition;
    }
    
    
    public void setRearPortPosition(Integer rearPortPosition) {
        this.rearPortPosition = rearPortPosition;
    }
    
    
    public FrontPort description(String description) {
        
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
    
    
    public FrontPort markConnected(Boolean markConnected) {
        
        this.markConnected = markConnected;
        return this;
    }
    
    /**
     * Treat as if a cable is connected
     *
     * @return markConnected
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Treat as if a cable is connected")
    
    public Boolean getMarkConnected() {
        return markConnected;
    }
    
    
    public void setMarkConnected(Boolean markConnected) {
        this.markConnected = markConnected;
    }
    
    
    public FrontPort cable(NestedCable cable) {
        
        this.cable = cable;
        return this;
    }
    
    /**
     * Get cable
     *
     * @return cable
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedCable getCable() {
        return cable;
    }
    
    
    public void setCable(NestedCable cable) {
        this.cable = cable;
    }
    
    
    /**
     * Get cableEnd
     *
     * @return cableEnd
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getCableEnd() {
        return cableEnd;
    }
    
    
    /**
     * Return the appropriate serializer for the link termination model.
     *
     * @return linkPeers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = " Return the appropriate serializer for the link termination model. ")
    
    public List<String> getLinkPeers() {
        return linkPeers;
    }
    
    
    /**
     * Get linkPeersType
     *
     * @return linkPeersType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getLinkPeersType() {
        return linkPeersType;
    }
    
    
    public FrontPort tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public FrontPort addTagsItem(NestedTag tagsItem) {
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
    
    
    public FrontPort customFields(Object customFields) {
        
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
     * Get occupied
     *
     * @return occupied
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Boolean getOccupied() {
        return occupied;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FrontPort frontPort = (FrontPort) o;
        return Objects.equals(this.id, frontPort.id) && Objects.equals(this.url, frontPort.url) && Objects.equals(this.display, frontPort.display) && Objects.equals(this.device, frontPort.device) && Objects.equals(this.module, frontPort.module) && Objects.equals(this.name, frontPort.name) && Objects.equals(this.label, frontPort.label) && Objects.equals(this.type, frontPort.type) && Objects.equals(this.color, frontPort.color) && Objects.equals(this.rearPort, frontPort.rearPort) && Objects.equals(this.rearPortPosition, frontPort.rearPortPosition) && Objects.equals(this.description, frontPort.description) && Objects.equals(this.markConnected, frontPort.markConnected) && Objects.equals(this.cable, frontPort.cable) && Objects.equals(this.cableEnd, frontPort.cableEnd) && Objects.equals(this.linkPeers, frontPort.linkPeers) && Objects.equals(this.linkPeersType, frontPort.linkPeersType) && Objects.equals(this.tags, frontPort.tags) && Objects.equals(this.customFields, frontPort.customFields) && Objects.equals(this.created, frontPort.created) && Objects.equals(this.lastUpdated, frontPort.lastUpdated) && Objects.equals(this.occupied, frontPort.occupied);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, device, module, name, label, type, color, rearPort, rearPortPosition, description, markConnected, cable, cableEnd, linkPeers, linkPeersType, tags, customFields, created, lastUpdated, occupied);
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
        sb.append("class FrontPort {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    rearPort: ").append(toIndentedString(rearPort)).append("\n");
        sb.append("    rearPortPosition: ").append(toIndentedString(rearPortPosition)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    markConnected: ").append(toIndentedString(markConnected)).append("\n");
        sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
        sb.append("    cableEnd: ").append(toIndentedString(cableEnd)).append("\n");
        sb.append("    linkPeers: ").append(toIndentedString(linkPeers)).append("\n");
        sb.append("    linkPeersType: ").append(toIndentedString(linkPeersType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    occupied: ").append(toIndentedString(occupied)).append("\n");
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
        openapiFields.add("module");
        openapiFields.add("name");
        openapiFields.add("label");
        openapiFields.add("type");
        openapiFields.add("color");
        openapiFields.add("rear_port");
        openapiFields.add("rear_port_position");
        openapiFields.add("description");
        openapiFields.add("mark_connected");
        openapiFields.add("cable");
        openapiFields.add("cable_end");
        openapiFields.add("link_peers");
        openapiFields.add("link_peers_type");
        openapiFields.add("tags");
        openapiFields.add("custom_fields");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        openapiFields.add("_occupied");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("device");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("rear_port");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to FrontPort
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (FrontPort.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in FrontPort is not found in the empty JSON string", FrontPort.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FrontPort.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FrontPort` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : FrontPort.openapiRequiredFields) {
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
        // validate the optional field `module`
        if (jsonObj.getAsJsonObject("module") != null) {
            ComponentNestedModule.validateJsonObject(jsonObj.getAsJsonObject("module"));
        }
        if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name")
                    .toString()));
        }
        if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label")
                    .toString()));
        }
        // validate the optional field `type`
        if (jsonObj.getAsJsonObject("type") != null) {
            Type1.validateJsonObject(jsonObj.getAsJsonObject("type"));
        }
        if (jsonObj.get("color") != null && !jsonObj.get("color").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color")
                    .toString()));
        }
        // validate the optional field `rear_port`
        if (jsonObj.getAsJsonObject("rear_port") != null) {
            FrontPortRearPort.validateJsonObject(jsonObj.getAsJsonObject("rear_port"));
        }
        if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description")
                    .toString()));
        }
        // validate the optional field `cable`
        if (jsonObj.getAsJsonObject("cable") != null) {
            NestedCable.validateJsonObject(jsonObj.getAsJsonObject("cable"));
        }
        if (jsonObj.get("cable_end") != null && !jsonObj.get("cable_end").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `cable_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cable_end")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("link_peers") != null && !jsonObj.get("link_peers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `link_peers` to be an array in the JSON string but got `%s`", jsonObj.get("link_peers")
                    .toString()));
        }
        if (jsonObj.get("link_peers_type") != null && !jsonObj.get("link_peers_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `link_peers_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_peers_type")
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
            if (!FrontPort.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FrontPort' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FrontPort> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(FrontPort.class));
            
            return (TypeAdapter<T>) new TypeAdapter<FrontPort>() {
                @Override
                public void write(JsonWriter out, FrontPort value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public FrontPort read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of FrontPort given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of FrontPort
     *
     * @throws IOException if the JSON string is invalid with respect to FrontPort
     */
    public static FrontPort fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FrontPort.class);
    }
    
    /**
     * Convert an instance of FrontPort to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


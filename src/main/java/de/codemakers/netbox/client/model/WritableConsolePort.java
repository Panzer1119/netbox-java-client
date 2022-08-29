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
 * WritableConsolePort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritableConsolePort {
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
    private Integer device;
    
    public static final String SERIALIZED_NAME_MODULE = "module";
    @SerializedName(SERIALIZED_NAME_MODULE)
    private Integer module;
    
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;
    
    /**
     * Physical port type
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        DE_9("de-9"),
        
        DB_25("db-25"),
        
        RJ_11("rj-11"),
        
        RJ_12("rj-12"),
        
        RJ_45("rj-45"),
        
        MINI_DIN_8("mini-din-8"),
        
        USB_A("usb-a"),
        
        USB_B("usb-b"),
        
        USB_C("usb-c"),
        
        USB_MINI_A("usb-mini-a"),
        
        USB_MINI_B("usb-mini-b"),
        
        USB_MICRO_A("usb-micro-a"),
        
        USB_MICRO_B("usb-micro-b"),
        
        USB_MICRO_AB("usb-micro-ab"),
        
        OTHER("other"),
        
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
    
    public static final String SERIALIZED_NAME_SPEED = "speed";
    @SerializedName(SERIALIZED_NAME_SPEED)
    private Integer speed;
    
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
    
    public static final String SERIALIZED_NAME_CONNECTED_ENDPOINTS = "connected_endpoints";
    @SerializedName(SERIALIZED_NAME_CONNECTED_ENDPOINTS)
    private List<String> connectedEndpoints = null;
    
    public static final String SERIALIZED_NAME_CONNECTED_ENDPOINTS_TYPE = "connected_endpoints_type";
    @SerializedName(SERIALIZED_NAME_CONNECTED_ENDPOINTS_TYPE)
    private String connectedEndpointsType;
    
    public static final String SERIALIZED_NAME_CONNECTED_ENDPOINTS_REACHABLE = "connected_endpoints_reachable";
    @SerializedName(SERIALIZED_NAME_CONNECTED_ENDPOINTS_REACHABLE)
    private Boolean connectedEndpointsReachable;
    
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
    
    public WritableConsolePort() {
    }
    
    
    public WritableConsolePort(Integer id, URI url, String display, String cableEnd, List<String> linkPeers, String linkPeersType, List<String> connectedEndpoints, String connectedEndpointsType, Boolean connectedEndpointsReachable, OffsetDateTime created, OffsetDateTime lastUpdated, Boolean occupied) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.cableEnd = cableEnd;
        this.linkPeers = linkPeers;
        this.linkPeersType = linkPeersType;
        this.connectedEndpoints = connectedEndpoints;
        this.connectedEndpointsType = connectedEndpointsType;
        this.connectedEndpointsReachable = connectedEndpointsReachable;
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
    
    
    public WritableConsolePort device(Integer device) {
        
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
    
    public Integer getDevice() {
        return device;
    }
    
    
    public void setDevice(Integer device) {
        this.device = device;
    }
    
    
    public WritableConsolePort module(Integer module) {
        
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
    
    public Integer getModule() {
        return module;
    }
    
    
    public void setModule(Integer module) {
        this.module = module;
    }
    
    
    public WritableConsolePort name(String name) {
        
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
    
    
    public WritableConsolePort label(String label) {
        
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
    
    
    public WritableConsolePort type(TypeEnum type) {
        
        this.type = type;
        return this;
    }
    
    /**
     * Physical port type
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Physical port type")
    
    public TypeEnum getType() {
        return type;
    }
    
    
    public void setType(TypeEnum type) {
        this.type = type;
    }
    
    
    public WritableConsolePort speed(Integer speed) {
        
        this.speed = speed;
        return this;
    }
    
    /**
     * Port speed in bits per second
     *
     * @return speed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Port speed in bits per second")
    
    public Integer getSpeed() {
        return speed;
    }
    
    
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    
    
    public WritableConsolePort description(String description) {
        
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
    
    
    public WritableConsolePort markConnected(Boolean markConnected) {
        
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
    
    
    public WritableConsolePort cable(NestedCable cable) {
        
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
    
    
    /**
     * Return the appropriate serializer for the type of connected object.
     *
     * @return connectedEndpoints
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = " Return the appropriate serializer for the type of connected object. ")
    
    public List<String> getConnectedEndpoints() {
        return connectedEndpoints;
    }
    
    
    /**
     * Get connectedEndpointsType
     *
     * @return connectedEndpointsType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getConnectedEndpointsType() {
        return connectedEndpointsType;
    }
    
    
    /**
     * Get connectedEndpointsReachable
     *
     * @return connectedEndpointsReachable
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Boolean getConnectedEndpointsReachable() {
        return connectedEndpointsReachable;
    }
    
    
    public WritableConsolePort tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public WritableConsolePort addTagsItem(NestedTag tagsItem) {
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
    
    
    public WritableConsolePort customFields(Object customFields) {
        
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
        WritableConsolePort writableConsolePort = (WritableConsolePort) o;
        return Objects.equals(this.id, writableConsolePort.id) && Objects.equals(this.url, writableConsolePort.url) && Objects.equals(this.display, writableConsolePort.display) && Objects.equals(this.device, writableConsolePort.device) && Objects.equals(this.module, writableConsolePort.module) && Objects.equals(this.name, writableConsolePort.name) && Objects.equals(this.label, writableConsolePort.label) && Objects.equals(this.type, writableConsolePort.type) && Objects.equals(this.speed, writableConsolePort.speed) && Objects.equals(this.description, writableConsolePort.description) && Objects.equals(this.markConnected, writableConsolePort.markConnected) && Objects.equals(this.cable, writableConsolePort.cable) && Objects.equals(this.cableEnd, writableConsolePort.cableEnd) && Objects.equals(this.linkPeers, writableConsolePort.linkPeers) && Objects.equals(this.linkPeersType, writableConsolePort.linkPeersType) && Objects.equals(this.connectedEndpoints, writableConsolePort.connectedEndpoints) && Objects.equals(this.connectedEndpointsType, writableConsolePort.connectedEndpointsType) && Objects.equals(this.connectedEndpointsReachable, writableConsolePort.connectedEndpointsReachable) && Objects.equals(this.tags, writableConsolePort.tags) && Objects.equals(this.customFields, writableConsolePort.customFields) && Objects.equals(this.created, writableConsolePort.created) && Objects.equals(this.lastUpdated, writableConsolePort.lastUpdated) && Objects.equals(this.occupied, writableConsolePort.occupied);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, device, module, name, label, type, speed, description, markConnected, cable, cableEnd, linkPeers, linkPeersType, connectedEndpoints, connectedEndpointsType, connectedEndpointsReachable, tags, customFields, created, lastUpdated, occupied);
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
        sb.append("class WritableConsolePort {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    markConnected: ").append(toIndentedString(markConnected)).append("\n");
        sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
        sb.append("    cableEnd: ").append(toIndentedString(cableEnd)).append("\n");
        sb.append("    linkPeers: ").append(toIndentedString(linkPeers)).append("\n");
        sb.append("    linkPeersType: ").append(toIndentedString(linkPeersType)).append("\n");
        sb.append("    connectedEndpoints: ").append(toIndentedString(connectedEndpoints)).append("\n");
        sb.append("    connectedEndpointsType: ").append(toIndentedString(connectedEndpointsType)).append("\n");
        sb.append("    connectedEndpointsReachable: ").append(toIndentedString(connectedEndpointsReachable)).append("\n");
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
        openapiFields.add("speed");
        openapiFields.add("description");
        openapiFields.add("mark_connected");
        openapiFields.add("cable");
        openapiFields.add("cable_end");
        openapiFields.add("link_peers");
        openapiFields.add("link_peers_type");
        openapiFields.add("connected_endpoints");
        openapiFields.add("connected_endpoints_type");
        openapiFields.add("connected_endpoints_reachable");
        openapiFields.add("tags");
        openapiFields.add("custom_fields");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        openapiFields.add("_occupied");
        
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
     * @throws IOException if the JSON Object is invalid with respect to WritableConsolePort
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (WritableConsolePort.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in WritableConsolePort is not found in the empty JSON string", WritableConsolePort.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!WritableConsolePort.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritableConsolePort` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WritableConsolePort.openapiRequiredFields) {
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
        if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label")
                    .toString()));
        }
        if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type")
                    .toString()));
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
        // ensure the json data is an array
        if (jsonObj.get("connected_endpoints") != null && !jsonObj.get("connected_endpoints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `connected_endpoints` to be an array in the JSON string but got `%s`", jsonObj.get("connected_endpoints")
                    .toString()));
        }
        if (jsonObj.get("connected_endpoints_type") != null && !jsonObj.get("connected_endpoints_type").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `connected_endpoints_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connected_endpoints_type")
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
            if (!WritableConsolePort.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WritableConsolePort' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WritableConsolePort> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(WritableConsolePort.class));
            
            return (TypeAdapter<T>) new TypeAdapter<WritableConsolePort>() {
                @Override
                public void write(JsonWriter out, WritableConsolePort value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public WritableConsolePort read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of WritableConsolePort given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of WritableConsolePort
     *
     * @throws IOException if the JSON string is invalid with respect to WritableConsolePort
     */
    public static WritableConsolePort fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WritableConsolePort.class);
    }
    
    /**
     * Convert an instance of WritableConsolePort to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


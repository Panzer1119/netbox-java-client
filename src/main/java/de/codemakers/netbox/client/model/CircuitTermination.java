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
 * CircuitTermination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class CircuitTermination {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_CIRCUIT = "circuit";
    @SerializedName(SERIALIZED_NAME_CIRCUIT)
    private NestedCircuit circuit;
    
    /**
     * Gets or Sets termSide
     */
    @JsonAdapter(TermSideEnum.Adapter.class)
    public enum TermSideEnum {
        A("A"),
        
        Z("Z"),
        
        UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");
        
        private String value;
        
        TermSideEnum(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return String.valueOf(value);
        }
        
        public static TermSideEnum fromValue(String value) {
            for (TermSideEnum b : TermSideEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
        
        public static class Adapter extends TypeAdapter<TermSideEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TermSideEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }
            
            @Override
            public TermSideEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TermSideEnum.fromValue(value);
            }
        }
    }
    
    public static final String SERIALIZED_NAME_TERM_SIDE = "term_side";
    @SerializedName(SERIALIZED_NAME_TERM_SIDE)
    private TermSideEnum termSide;
    
    public static final String SERIALIZED_NAME_SITE = "site";
    @SerializedName(SERIALIZED_NAME_SITE)
    private NestedSite site;
    
    public static final String SERIALIZED_NAME_PROVIDER_NETWORK = "provider_network";
    @SerializedName(SERIALIZED_NAME_PROVIDER_NETWORK)
    private NestedProviderNetwork providerNetwork;
    
    public static final String SERIALIZED_NAME_PORT_SPEED = "port_speed";
    @SerializedName(SERIALIZED_NAME_PORT_SPEED)
    private Integer portSpeed;
    
    public static final String SERIALIZED_NAME_UPSTREAM_SPEED = "upstream_speed";
    @SerializedName(SERIALIZED_NAME_UPSTREAM_SPEED)
    private Integer upstreamSpeed;
    
    public static final String SERIALIZED_NAME_XCONNECT_ID = "xconnect_id";
    @SerializedName(SERIALIZED_NAME_XCONNECT_ID)
    private String xconnectId;
    
    public static final String SERIALIZED_NAME_PP_INFO = "pp_info";
    @SerializedName(SERIALIZED_NAME_PP_INFO)
    private String ppInfo;
    
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
    
    public CircuitTermination() {
    }
    
    
    public CircuitTermination(Integer id, URI url, String display, String cableEnd, List<String> linkPeers, String linkPeersType, OffsetDateTime created, OffsetDateTime lastUpdated, Boolean occupied) {
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
    
    
    public CircuitTermination circuit(NestedCircuit circuit) {
        
        this.circuit = circuit;
        return this;
    }
    
    /**
     * Get circuit
     *
     * @return circuit
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public NestedCircuit getCircuit() {
        return circuit;
    }
    
    
    public void setCircuit(NestedCircuit circuit) {
        this.circuit = circuit;
    }
    
    
    public CircuitTermination termSide(TermSideEnum termSide) {
        
        this.termSide = termSide;
        return this;
    }
    
    /**
     * Get termSide
     *
     * @return termSide
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public TermSideEnum getTermSide() {
        return termSide;
    }
    
    
    public void setTermSide(TermSideEnum termSide) {
        this.termSide = termSide;
    }
    
    
    public CircuitTermination site(NestedSite site) {
        
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
    
    public NestedSite getSite() {
        return site;
    }
    
    
    public void setSite(NestedSite site) {
        this.site = site;
    }
    
    
    public CircuitTermination providerNetwork(NestedProviderNetwork providerNetwork) {
        
        this.providerNetwork = providerNetwork;
        return this;
    }
    
    /**
     * Get providerNetwork
     *
     * @return providerNetwork
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedProviderNetwork getProviderNetwork() {
        return providerNetwork;
    }
    
    
    public void setProviderNetwork(NestedProviderNetwork providerNetwork) {
        this.providerNetwork = providerNetwork;
    }
    
    
    public CircuitTermination portSpeed(Integer portSpeed) {
        
        this.portSpeed = portSpeed;
        return this;
    }
    
    /**
     * Get portSpeed
     * minimum: 0
     * maximum: 2147483647
     *
     * @return portSpeed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getPortSpeed() {
        return portSpeed;
    }
    
    
    public void setPortSpeed(Integer portSpeed) {
        this.portSpeed = portSpeed;
    }
    
    
    public CircuitTermination upstreamSpeed(Integer upstreamSpeed) {
        
        this.upstreamSpeed = upstreamSpeed;
        return this;
    }
    
    /**
     * Upstream speed, if different from port speed
     * minimum: 0
     * maximum: 2147483647
     *
     * @return upstreamSpeed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Upstream speed, if different from port speed")
    
    public Integer getUpstreamSpeed() {
        return upstreamSpeed;
    }
    
    
    public void setUpstreamSpeed(Integer upstreamSpeed) {
        this.upstreamSpeed = upstreamSpeed;
    }
    
    
    public CircuitTermination xconnectId(String xconnectId) {
        
        this.xconnectId = xconnectId;
        return this;
    }
    
    /**
     * Get xconnectId
     *
     * @return xconnectId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getXconnectId() {
        return xconnectId;
    }
    
    
    public void setXconnectId(String xconnectId) {
        this.xconnectId = xconnectId;
    }
    
    
    public CircuitTermination ppInfo(String ppInfo) {
        
        this.ppInfo = ppInfo;
        return this;
    }
    
    /**
     * Get ppInfo
     *
     * @return ppInfo
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getPpInfo() {
        return ppInfo;
    }
    
    
    public void setPpInfo(String ppInfo) {
        this.ppInfo = ppInfo;
    }
    
    
    public CircuitTermination description(String description) {
        
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
    
    
    public CircuitTermination markConnected(Boolean markConnected) {
        
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
    
    
    public CircuitTermination cable(NestedCable cable) {
        
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
    
    
    public CircuitTermination tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public CircuitTermination addTagsItem(NestedTag tagsItem) {
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
    
    
    public CircuitTermination customFields(Object customFields) {
        
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
        CircuitTermination circuitTermination = (CircuitTermination) o;
        return Objects.equals(this.id, circuitTermination.id) && Objects.equals(this.url, circuitTermination.url) && Objects.equals(this.display, circuitTermination.display) && Objects.equals(this.circuit, circuitTermination.circuit) && Objects.equals(this.termSide, circuitTermination.termSide) && Objects.equals(this.site, circuitTermination.site) && Objects.equals(this.providerNetwork, circuitTermination.providerNetwork) && Objects.equals(this.portSpeed, circuitTermination.portSpeed) && Objects.equals(this.upstreamSpeed, circuitTermination.upstreamSpeed) && Objects.equals(this.xconnectId, circuitTermination.xconnectId) && Objects.equals(this.ppInfo, circuitTermination.ppInfo) && Objects.equals(this.description, circuitTermination.description) && Objects.equals(this.markConnected, circuitTermination.markConnected) && Objects.equals(this.cable, circuitTermination.cable) && Objects.equals(this.cableEnd, circuitTermination.cableEnd) && Objects.equals(this.linkPeers, circuitTermination.linkPeers) && Objects.equals(this.linkPeersType, circuitTermination.linkPeersType) && Objects.equals(this.tags, circuitTermination.tags) && Objects.equals(this.customFields, circuitTermination.customFields) && Objects.equals(this.created, circuitTermination.created) && Objects.equals(this.lastUpdated, circuitTermination.lastUpdated) && Objects.equals(this.occupied, circuitTermination.occupied);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, circuit, termSide, site, providerNetwork, portSpeed, upstreamSpeed, xconnectId, ppInfo, description, markConnected, cable, cableEnd, linkPeers, linkPeersType, tags, customFields, created, lastUpdated, occupied);
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
        sb.append("class CircuitTermination {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    circuit: ").append(toIndentedString(circuit)).append("\n");
        sb.append("    termSide: ").append(toIndentedString(termSide)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    providerNetwork: ").append(toIndentedString(providerNetwork)).append("\n");
        sb.append("    portSpeed: ").append(toIndentedString(portSpeed)).append("\n");
        sb.append("    upstreamSpeed: ").append(toIndentedString(upstreamSpeed)).append("\n");
        sb.append("    xconnectId: ").append(toIndentedString(xconnectId)).append("\n");
        sb.append("    ppInfo: ").append(toIndentedString(ppInfo)).append("\n");
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
        openapiFields.add("circuit");
        openapiFields.add("term_side");
        openapiFields.add("site");
        openapiFields.add("provider_network");
        openapiFields.add("port_speed");
        openapiFields.add("upstream_speed");
        openapiFields.add("xconnect_id");
        openapiFields.add("pp_info");
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
        openapiRequiredFields.add("circuit");
        openapiRequiredFields.add("term_side");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to CircuitTermination
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (CircuitTermination.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in CircuitTermination is not found in the empty JSON string", CircuitTermination.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CircuitTermination.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CircuitTermination` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CircuitTermination.openapiRequiredFields) {
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
        // validate the optional field `circuit`
        if (jsonObj.getAsJsonObject("circuit") != null) {
            NestedCircuit.validateJsonObject(jsonObj.getAsJsonObject("circuit"));
        }
        if (jsonObj.get("term_side") != null && !jsonObj.get("term_side").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `term_side` to be a primitive type in the JSON string but got `%s`", jsonObj.get("term_side")
                    .toString()));
        }
        // validate the optional field `site`
        if (jsonObj.getAsJsonObject("site") != null) {
            NestedSite.validateJsonObject(jsonObj.getAsJsonObject("site"));
        }
        // validate the optional field `provider_network`
        if (jsonObj.getAsJsonObject("provider_network") != null) {
            NestedProviderNetwork.validateJsonObject(jsonObj.getAsJsonObject("provider_network"));
        }
        if (jsonObj.get("xconnect_id") != null && !jsonObj.get("xconnect_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `xconnect_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xconnect_id")
                    .toString()));
        }
        if (jsonObj.get("pp_info") != null && !jsonObj.get("pp_info").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `pp_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pp_info")
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
            if (!CircuitTermination.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CircuitTermination' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CircuitTermination> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(CircuitTermination.class));
            
            return (TypeAdapter<T>) new TypeAdapter<CircuitTermination>() {
                @Override
                public void write(JsonWriter out, CircuitTermination value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public CircuitTermination read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of CircuitTermination given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of CircuitTermination
     *
     * @throws IOException if the JSON string is invalid with respect to CircuitTermination
     */
    public static CircuitTermination fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CircuitTermination.class);
    }
    
    /**
     * Convert an instance of CircuitTermination to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


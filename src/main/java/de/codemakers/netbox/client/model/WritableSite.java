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
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Map.Entry;

/**
 * WritableSite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritableSite {
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
    
    public static final String SERIALIZED_NAME_SLUG = "slug";
    @SerializedName(SERIALIZED_NAME_SLUG)
    private String slug;
    
    /**
     * Gets or Sets status
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        PLANNED("planned"),
        
        STAGING("staging"),
        
        ACTIVE("active"),
        
        DECOMMISSIONING("decommissioning"),
        
        RETIRED("retired"),
        
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
    
    public static final String SERIALIZED_NAME_REGION = "region";
    @SerializedName(SERIALIZED_NAME_REGION)
    private Integer region;
    
    public static final String SERIALIZED_NAME_GROUP = "group";
    @SerializedName(SERIALIZED_NAME_GROUP)
    private Integer group;
    
    public static final String SERIALIZED_NAME_TENANT = "tenant";
    @SerializedName(SERIALIZED_NAME_TENANT)
    private Integer tenant;
    
    public static final String SERIALIZED_NAME_FACILITY = "facility";
    @SerializedName(SERIALIZED_NAME_FACILITY)
    private String facility;
    
    public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
    @SerializedName(SERIALIZED_NAME_TIME_ZONE)
    private String timeZone;
    
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    
    public static final String SERIALIZED_NAME_PHYSICAL_ADDRESS = "physical_address";
    @SerializedName(SERIALIZED_NAME_PHYSICAL_ADDRESS)
    private String physicalAddress;
    
    public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shipping_address";
    @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
    private String shippingAddress;
    
    public static final String SERIALIZED_NAME_LATITUDE = "latitude";
    @SerializedName(SERIALIZED_NAME_LATITUDE)
    private BigDecimal latitude;
    
    public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
    @SerializedName(SERIALIZED_NAME_LONGITUDE)
    private BigDecimal longitude;
    
    public static final String SERIALIZED_NAME_COMMENTS = "comments";
    @SerializedName(SERIALIZED_NAME_COMMENTS)
    private String comments;
    
    public static final String SERIALIZED_NAME_ASNS = "asns";
    @SerializedName(SERIALIZED_NAME_ASNS)
    private Set<Integer> asns = null;
    
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
    
    public static final String SERIALIZED_NAME_CIRCUIT_COUNT = "circuit_count";
    @SerializedName(SERIALIZED_NAME_CIRCUIT_COUNT)
    private Integer circuitCount;
    
    public static final String SERIALIZED_NAME_DEVICE_COUNT = "device_count";
    @SerializedName(SERIALIZED_NAME_DEVICE_COUNT)
    private Integer deviceCount;
    
    public static final String SERIALIZED_NAME_PREFIX_COUNT = "prefix_count";
    @SerializedName(SERIALIZED_NAME_PREFIX_COUNT)
    private Integer prefixCount;
    
    public static final String SERIALIZED_NAME_RACK_COUNT = "rack_count";
    @SerializedName(SERIALIZED_NAME_RACK_COUNT)
    private Integer rackCount;
    
    public static final String SERIALIZED_NAME_VIRTUALMACHINE_COUNT = "virtualmachine_count";
    @SerializedName(SERIALIZED_NAME_VIRTUALMACHINE_COUNT)
    private Integer virtualmachineCount;
    
    public static final String SERIALIZED_NAME_VLAN_COUNT = "vlan_count";
    @SerializedName(SERIALIZED_NAME_VLAN_COUNT)
    private Integer vlanCount;
    
    public WritableSite() {
    }
    
    
    public WritableSite(Integer id, URI url, String display, OffsetDateTime created, OffsetDateTime lastUpdated, Integer circuitCount, Integer deviceCount, Integer prefixCount, Integer rackCount, Integer virtualmachineCount, Integer vlanCount) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.circuitCount = circuitCount;
        this.deviceCount = deviceCount;
        this.prefixCount = prefixCount;
        this.rackCount = rackCount;
        this.virtualmachineCount = virtualmachineCount;
        this.vlanCount = vlanCount;
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
    
    
    public WritableSite name(String name) {
        
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
    
    
    public WritableSite slug(String slug) {
        
        this.slug = slug;
        return this;
    }
    
    /**
     * Get slug
     *
     * @return slug
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public String getSlug() {
        return slug;
    }
    
    
    public void setSlug(String slug) {
        this.slug = slug;
    }
    
    
    public WritableSite status(StatusEnum status) {
        
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
    
    
    public WritableSite region(Integer region) {
        
        this.region = region;
        return this;
    }
    
    /**
     * Get region
     *
     * @return region
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getRegion() {
        return region;
    }
    
    
    public void setRegion(Integer region) {
        this.region = region;
    }
    
    
    public WritableSite group(Integer group) {
        
        this.group = group;
        return this;
    }
    
    /**
     * Get group
     *
     * @return group
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getGroup() {
        return group;
    }
    
    
    public void setGroup(Integer group) {
        this.group = group;
    }
    
    
    public WritableSite tenant(Integer tenant) {
        
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
    
    
    public WritableSite facility(String facility) {
        
        this.facility = facility;
        return this;
    }
    
    /**
     * Local facility ID or description
     *
     * @return facility
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Local facility ID or description")
    
    public String getFacility() {
        return facility;
    }
    
    
    public void setFacility(String facility) {
        this.facility = facility;
    }
    
    
    public WritableSite timeZone(String timeZone) {
        
        this.timeZone = timeZone;
        return this;
    }
    
    /**
     * Get timeZone
     *
     * @return timeZone
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getTimeZone() {
        return timeZone;
    }
    
    
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    
    
    public WritableSite description(String description) {
        
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
    
    
    public WritableSite physicalAddress(String physicalAddress) {
        
        this.physicalAddress = physicalAddress;
        return this;
    }
    
    /**
     * Get physicalAddress
     *
     * @return physicalAddress
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getPhysicalAddress() {
        return physicalAddress;
    }
    
    
    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }
    
    
    public WritableSite shippingAddress(String shippingAddress) {
        
        this.shippingAddress = shippingAddress;
        return this;
    }
    
    /**
     * Get shippingAddress
     *
     * @return shippingAddress
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getShippingAddress() {
        return shippingAddress;
    }
    
    
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    
    
    public WritableSite latitude(BigDecimal latitude) {
        
        this.latitude = latitude;
        return this;
    }
    
    /**
     * GPS coordinate (latitude)
     *
     * @return latitude
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "GPS coordinate (latitude)")
    
    public BigDecimal getLatitude() {
        return latitude;
    }
    
    
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
    
    
    public WritableSite longitude(BigDecimal longitude) {
        
        this.longitude = longitude;
        return this;
    }
    
    /**
     * GPS coordinate (longitude)
     *
     * @return longitude
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "GPS coordinate (longitude)")
    
    public BigDecimal getLongitude() {
        return longitude;
    }
    
    
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
    
    
    public WritableSite comments(String comments) {
        
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
    
    
    public WritableSite asns(Set<Integer> asns) {
        
        this.asns = asns;
        return this;
    }
    
    public WritableSite addAsnsItem(Integer asnsItem) {
        if (this.asns == null) {
            this.asns = new LinkedHashSet<>();
        }
        this.asns.add(asnsItem);
        return this;
    }
    
    /**
     * Get asns
     *
     * @return asns
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getAsns() {
        return asns;
    }
    
    
    public void setAsns(Set<Integer> asns) {
        this.asns = asns;
    }
    
    
    public WritableSite tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public WritableSite addTagsItem(NestedTag tagsItem) {
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
    
    
    public WritableSite customFields(Object customFields) {
        
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
     * Get circuitCount
     *
     * @return circuitCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getCircuitCount() {
        return circuitCount;
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
     * Get prefixCount
     *
     * @return prefixCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getPrefixCount() {
        return prefixCount;
    }
    
    
    /**
     * Get rackCount
     *
     * @return rackCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getRackCount() {
        return rackCount;
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
    
    
    /**
     * Get vlanCount
     *
     * @return vlanCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getVlanCount() {
        return vlanCount;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WritableSite writableSite = (WritableSite) o;
        return Objects.equals(this.id, writableSite.id) && Objects.equals(this.url, writableSite.url) && Objects.equals(this.display, writableSite.display) && Objects.equals(this.name, writableSite.name) && Objects.equals(this.slug, writableSite.slug) && Objects.equals(this.status, writableSite.status) && Objects.equals(this.region, writableSite.region) && Objects.equals(this.group, writableSite.group) && Objects.equals(this.tenant, writableSite.tenant) && Objects.equals(this.facility, writableSite.facility) && Objects.equals(this.timeZone, writableSite.timeZone) && Objects.equals(this.description, writableSite.description) && Objects.equals(this.physicalAddress, writableSite.physicalAddress) && Objects.equals(this.shippingAddress, writableSite.shippingAddress) && Objects.equals(this.latitude, writableSite.latitude) && Objects.equals(this.longitude, writableSite.longitude) && Objects.equals(this.comments, writableSite.comments) && Objects.equals(this.asns, writableSite.asns) && Objects.equals(this.tags, writableSite.tags) && Objects.equals(this.customFields, writableSite.customFields) && Objects.equals(this.created, writableSite.created) && Objects.equals(this.lastUpdated, writableSite.lastUpdated) && Objects.equals(this.circuitCount, writableSite.circuitCount) && Objects.equals(this.deviceCount, writableSite.deviceCount) && Objects.equals(this.prefixCount, writableSite.prefixCount) && Objects.equals(this.rackCount, writableSite.rackCount) && Objects.equals(this.virtualmachineCount, writableSite.virtualmachineCount) && Objects.equals(this.vlanCount, writableSite.vlanCount);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, name, slug, status, region, group, tenant, facility, timeZone, description, physicalAddress, shippingAddress, latitude, longitude, comments, asns, tags, customFields, created, lastUpdated, circuitCount, deviceCount, prefixCount, rackCount, virtualmachineCount, vlanCount);
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
        sb.append("class WritableSite {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    physicalAddress: ").append(toIndentedString(physicalAddress)).append("\n");
        sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    asns: ").append(toIndentedString(asns)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    circuitCount: ").append(toIndentedString(circuitCount)).append("\n");
        sb.append("    deviceCount: ").append(toIndentedString(deviceCount)).append("\n");
        sb.append("    prefixCount: ").append(toIndentedString(prefixCount)).append("\n");
        sb.append("    rackCount: ").append(toIndentedString(rackCount)).append("\n");
        sb.append("    virtualmachineCount: ").append(toIndentedString(virtualmachineCount)).append("\n");
        sb.append("    vlanCount: ").append(toIndentedString(vlanCount)).append("\n");
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
        openapiFields.add("slug");
        openapiFields.add("status");
        openapiFields.add("region");
        openapiFields.add("group");
        openapiFields.add("tenant");
        openapiFields.add("facility");
        openapiFields.add("time_zone");
        openapiFields.add("description");
        openapiFields.add("physical_address");
        openapiFields.add("shipping_address");
        openapiFields.add("latitude");
        openapiFields.add("longitude");
        openapiFields.add("comments");
        openapiFields.add("asns");
        openapiFields.add("tags");
        openapiFields.add("custom_fields");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        openapiFields.add("circuit_count");
        openapiFields.add("device_count");
        openapiFields.add("prefix_count");
        openapiFields.add("rack_count");
        openapiFields.add("virtualmachine_count");
        openapiFields.add("vlan_count");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("slug");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to WritableSite
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (WritableSite.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in WritableSite is not found in the empty JSON string", WritableSite.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!WritableSite.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritableSite` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WritableSite.openapiRequiredFields) {
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
        if (jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug")
                    .toString()));
        }
        if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status")
                    .toString()));
        }
        if (jsonObj.get("facility") != null && !jsonObj.get("facility").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `facility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facility")
                    .toString()));
        }
        if (jsonObj.get("time_zone") != null && !jsonObj.get("time_zone").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `time_zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_zone")
                    .toString()));
        }
        if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description")
                    .toString()));
        }
        if (jsonObj.get("physical_address") != null && !jsonObj.get("physical_address").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `physical_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("physical_address")
                    .toString()));
        }
        if (jsonObj.get("shipping_address") != null && !jsonObj.get("shipping_address").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipping_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipping_address")
                    .toString()));
        }
        if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("asns") != null && !jsonObj.get("asns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `asns` to be an array in the JSON string but got `%s`", jsonObj.get("asns")
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
            if (!WritableSite.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WritableSite' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WritableSite> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(WritableSite.class));
            
            return (TypeAdapter<T>) new TypeAdapter<WritableSite>() {
                @Override
                public void write(JsonWriter out, WritableSite value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public WritableSite read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of WritableSite given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of WritableSite
     *
     * @throws IOException if the JSON string is invalid with respect to WritableSite
     */
    public static WritableSite fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WritableSite.class);
    }
    
    /**
     * Convert an instance of WritableSite to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


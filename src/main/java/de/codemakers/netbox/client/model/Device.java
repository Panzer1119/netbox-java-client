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
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Map.Entry;

/**
 * Device
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class Device {
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
    
    public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
    @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
    private NestedDeviceType deviceType;
    
    public static final String SERIALIZED_NAME_DEVICE_ROLE = "device_role";
    @SerializedName(SERIALIZED_NAME_DEVICE_ROLE)
    private NestedDeviceRole deviceRole;
    
    public static final String SERIALIZED_NAME_TENANT = "tenant";
    @SerializedName(SERIALIZED_NAME_TENANT)
    private NestedTenant tenant;
    
    public static final String SERIALIZED_NAME_PLATFORM = "platform";
    @SerializedName(SERIALIZED_NAME_PLATFORM)
    private NestedPlatform platform;
    
    public static final String SERIALIZED_NAME_SERIAL = "serial";
    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;
    
    public static final String SERIALIZED_NAME_ASSET_TAG = "asset_tag";
    @SerializedName(SERIALIZED_NAME_ASSET_TAG)
    private String assetTag;
    
    public static final String SERIALIZED_NAME_SITE = "site";
    @SerializedName(SERIALIZED_NAME_SITE)
    private NestedSite site;
    
    public static final String SERIALIZED_NAME_LOCATION = "location";
    @SerializedName(SERIALIZED_NAME_LOCATION)
    private NestedLocation location;
    
    public static final String SERIALIZED_NAME_RACK = "rack";
    @SerializedName(SERIALIZED_NAME_RACK)
    private NestedRack rack;
    
    public static final String SERIALIZED_NAME_POSITION = "position";
    @SerializedName(SERIALIZED_NAME_POSITION)
    private BigDecimal position;
    
    public static final String SERIALIZED_NAME_FACE = "face";
    @SerializedName(SERIALIZED_NAME_FACE)
    private Face face;
    
    public static final String SERIALIZED_NAME_PARENT_DEVICE = "parent_device";
    @SerializedName(SERIALIZED_NAME_PARENT_DEVICE)
    private NestedDevice parentDevice;
    
    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private Status2 status;
    
    public static final String SERIALIZED_NAME_AIRFLOW = "airflow";
    @SerializedName(SERIALIZED_NAME_AIRFLOW)
    private Airflow airflow;
    
    public static final String SERIALIZED_NAME_PRIMARY_IP = "primary_ip";
    @SerializedName(SERIALIZED_NAME_PRIMARY_IP)
    private NestedIPAddress primaryIp;
    
    public static final String SERIALIZED_NAME_PRIMARY_IP4 = "primary_ip4";
    @SerializedName(SERIALIZED_NAME_PRIMARY_IP4)
    private NestedIPAddress primaryIp4;
    
    public static final String SERIALIZED_NAME_PRIMARY_IP6 = "primary_ip6";
    @SerializedName(SERIALIZED_NAME_PRIMARY_IP6)
    private NestedIPAddress primaryIp6;
    
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";
    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;
    
    public static final String SERIALIZED_NAME_VIRTUAL_CHASSIS = "virtual_chassis";
    @SerializedName(SERIALIZED_NAME_VIRTUAL_CHASSIS)
    private NestedVirtualChassis virtualChassis;
    
    public static final String SERIALIZED_NAME_VC_POSITION = "vc_position";
    @SerializedName(SERIALIZED_NAME_VC_POSITION)
    private Integer vcPosition;
    
    public static final String SERIALIZED_NAME_VC_PRIORITY = "vc_priority";
    @SerializedName(SERIALIZED_NAME_VC_PRIORITY)
    private Integer vcPriority;
    
    public static final String SERIALIZED_NAME_COMMENTS = "comments";
    @SerializedName(SERIALIZED_NAME_COMMENTS)
    private String comments;
    
    public static final String SERIALIZED_NAME_LOCAL_CONTEXT_DATA = "local_context_data";
    @SerializedName(SERIALIZED_NAME_LOCAL_CONTEXT_DATA)
    private String localContextData;
    
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
    
    public Device() {
    }
    
    
    public Device(Integer id, URI url, String display, OffsetDateTime created, OffsetDateTime lastUpdated) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
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
    
    
    public Device name(String name) {
        
        this.name = name;
        return this;
    }
    
    /**
     * Get name
     *
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(required = true, value = "")
    
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public Device deviceType(NestedDeviceType deviceType) {
        
        this.deviceType = deviceType;
        return this;
    }
    
    /**
     * Get deviceType
     *
     * @return deviceType
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public NestedDeviceType getDeviceType() {
        return deviceType;
    }
    
    
    public void setDeviceType(NestedDeviceType deviceType) {
        this.deviceType = deviceType;
    }
    
    
    public Device deviceRole(NestedDeviceRole deviceRole) {
        
        this.deviceRole = deviceRole;
        return this;
    }
    
    /**
     * Get deviceRole
     *
     * @return deviceRole
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public NestedDeviceRole getDeviceRole() {
        return deviceRole;
    }
    
    
    public void setDeviceRole(NestedDeviceRole deviceRole) {
        this.deviceRole = deviceRole;
    }
    
    
    public Device tenant(NestedTenant tenant) {
        
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
    
    
    public Device platform(NestedPlatform platform) {
        
        this.platform = platform;
        return this;
    }
    
    /**
     * Get platform
     *
     * @return platform
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedPlatform getPlatform() {
        return platform;
    }
    
    
    public void setPlatform(NestedPlatform platform) {
        this.platform = platform;
    }
    
    
    public Device serial(String serial) {
        
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
    
    
    public Device assetTag(String assetTag) {
        
        this.assetTag = assetTag;
        return this;
    }
    
    /**
     * A unique tag used to identify this device
     *
     * @return assetTag
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A unique tag used to identify this device")
    
    public String getAssetTag() {
        return assetTag;
    }
    
    
    public void setAssetTag(String assetTag) {
        this.assetTag = assetTag;
    }
    
    
    public Device site(NestedSite site) {
        
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
    
    public NestedSite getSite() {
        return site;
    }
    
    
    public void setSite(NestedSite site) {
        this.site = site;
    }
    
    
    public Device location(NestedLocation location) {
        
        this.location = location;
        return this;
    }
    
    /**
     * Get location
     *
     * @return location
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedLocation getLocation() {
        return location;
    }
    
    
    public void setLocation(NestedLocation location) {
        this.location = location;
    }
    
    
    public Device rack(NestedRack rack) {
        
        this.rack = rack;
        return this;
    }
    
    /**
     * Get rack
     *
     * @return rack
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedRack getRack() {
        return rack;
    }
    
    
    public void setRack(NestedRack rack) {
        this.rack = rack;
    }
    
    
    public Device position(BigDecimal position) {
        
        this.position = position;
        return this;
    }
    
    /**
     * Get position
     * minimum: 0.5
     *
     * @return position
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public BigDecimal getPosition() {
        return position;
    }
    
    
    public void setPosition(BigDecimal position) {
        this.position = position;
    }
    
    
    public Device face(Face face) {
        
        this.face = face;
        return this;
    }
    
    /**
     * Get face
     *
     * @return face
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Face getFace() {
        return face;
    }
    
    
    public void setFace(Face face) {
        this.face = face;
    }
    
    
    public Device parentDevice(NestedDevice parentDevice) {
        
        this.parentDevice = parentDevice;
        return this;
    }
    
    /**
     * Get parentDevice
     *
     * @return parentDevice
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedDevice getParentDevice() {
        return parentDevice;
    }
    
    
    public void setParentDevice(NestedDevice parentDevice) {
        this.parentDevice = parentDevice;
    }
    
    
    public Device status(Status2 status) {
        
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
    
    public Status2 getStatus() {
        return status;
    }
    
    
    public void setStatus(Status2 status) {
        this.status = status;
    }
    
    
    public Device airflow(Airflow airflow) {
        
        this.airflow = airflow;
        return this;
    }
    
    /**
     * Get airflow
     *
     * @return airflow
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Airflow getAirflow() {
        return airflow;
    }
    
    
    public void setAirflow(Airflow airflow) {
        this.airflow = airflow;
    }
    
    
    public Device primaryIp(NestedIPAddress primaryIp) {
        
        this.primaryIp = primaryIp;
        return this;
    }
    
    /**
     * Get primaryIp
     *
     * @return primaryIp
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedIPAddress getPrimaryIp() {
        return primaryIp;
    }
    
    
    public void setPrimaryIp(NestedIPAddress primaryIp) {
        this.primaryIp = primaryIp;
    }
    
    
    public Device primaryIp4(NestedIPAddress primaryIp4) {
        
        this.primaryIp4 = primaryIp4;
        return this;
    }
    
    /**
     * Get primaryIp4
     *
     * @return primaryIp4
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedIPAddress getPrimaryIp4() {
        return primaryIp4;
    }
    
    
    public void setPrimaryIp4(NestedIPAddress primaryIp4) {
        this.primaryIp4 = primaryIp4;
    }
    
    
    public Device primaryIp6(NestedIPAddress primaryIp6) {
        
        this.primaryIp6 = primaryIp6;
        return this;
    }
    
    /**
     * Get primaryIp6
     *
     * @return primaryIp6
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedIPAddress getPrimaryIp6() {
        return primaryIp6;
    }
    
    
    public void setPrimaryIp6(NestedIPAddress primaryIp6) {
        this.primaryIp6 = primaryIp6;
    }
    
    
    public Device cluster(NestedCluster cluster) {
        
        this.cluster = cluster;
        return this;
    }
    
    /**
     * Get cluster
     *
     * @return cluster
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedCluster getCluster() {
        return cluster;
    }
    
    
    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }
    
    
    public Device virtualChassis(NestedVirtualChassis virtualChassis) {
        
        this.virtualChassis = virtualChassis;
        return this;
    }
    
    /**
     * Get virtualChassis
     *
     * @return virtualChassis
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedVirtualChassis getVirtualChassis() {
        return virtualChassis;
    }
    
    
    public void setVirtualChassis(NestedVirtualChassis virtualChassis) {
        this.virtualChassis = virtualChassis;
    }
    
    
    public Device vcPosition(Integer vcPosition) {
        
        this.vcPosition = vcPosition;
        return this;
    }
    
    /**
     * Get vcPosition
     * minimum: 0
     * maximum: 255
     *
     * @return vcPosition
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getVcPosition() {
        return vcPosition;
    }
    
    
    public void setVcPosition(Integer vcPosition) {
        this.vcPosition = vcPosition;
    }
    
    
    public Device vcPriority(Integer vcPriority) {
        
        this.vcPriority = vcPriority;
        return this;
    }
    
    /**
     * Get vcPriority
     * minimum: 0
     * maximum: 255
     *
     * @return vcPriority
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getVcPriority() {
        return vcPriority;
    }
    
    
    public void setVcPriority(Integer vcPriority) {
        this.vcPriority = vcPriority;
    }
    
    
    public Device comments(String comments) {
        
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
    
    
    public Device localContextData(String localContextData) {
        
        this.localContextData = localContextData;
        return this;
    }
    
    /**
     * Get localContextData
     *
     * @return localContextData
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getLocalContextData() {
        return localContextData;
    }
    
    
    public void setLocalContextData(String localContextData) {
        this.localContextData = localContextData;
    }
    
    
    public Device tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public Device addTagsItem(NestedTag tagsItem) {
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
    
    
    public Device customFields(Object customFields) {
        
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
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Device device = (Device) o;
        return Objects.equals(this.id, device.id) && Objects.equals(this.url, device.url) && Objects.equals(this.display, device.display) && Objects.equals(this.name, device.name) && Objects.equals(this.deviceType, device.deviceType) && Objects.equals(this.deviceRole, device.deviceRole) && Objects.equals(this.tenant, device.tenant) && Objects.equals(this.platform, device.platform) && Objects.equals(this.serial, device.serial) && Objects.equals(this.assetTag, device.assetTag) && Objects.equals(this.site, device.site) && Objects.equals(this.location, device.location) && Objects.equals(this.rack, device.rack) && Objects.equals(this.position, device.position) && Objects.equals(this.face, device.face) && Objects.equals(this.parentDevice, device.parentDevice) && Objects.equals(this.status, device.status) && Objects.equals(this.airflow, device.airflow) && Objects.equals(this.primaryIp, device.primaryIp) && Objects.equals(this.primaryIp4, device.primaryIp4) && Objects.equals(this.primaryIp6, device.primaryIp6) && Objects.equals(this.cluster, device.cluster) && Objects.equals(this.virtualChassis, device.virtualChassis) && Objects.equals(this.vcPosition, device.vcPosition) && Objects.equals(this.vcPriority, device.vcPriority) && Objects.equals(this.comments, device.comments) && Objects.equals(this.localContextData, device.localContextData) && Objects.equals(this.tags, device.tags) && Objects.equals(this.customFields, device.customFields) && Objects.equals(this.created, device.created) && Objects.equals(this.lastUpdated, device.lastUpdated);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, name, deviceType, deviceRole, tenant, platform, serial, assetTag, site, location, rack, position, face, parentDevice, status, airflow, primaryIp, primaryIp4, primaryIp6, cluster, virtualChassis, vcPosition, vcPriority, comments, localContextData, tags, customFields, created, lastUpdated);
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
        sb.append("class Device {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    deviceRole: ").append(toIndentedString(deviceRole)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    assetTag: ").append(toIndentedString(assetTag)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    rack: ").append(toIndentedString(rack)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    face: ").append(toIndentedString(face)).append("\n");
        sb.append("    parentDevice: ").append(toIndentedString(parentDevice)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    airflow: ").append(toIndentedString(airflow)).append("\n");
        sb.append("    primaryIp: ").append(toIndentedString(primaryIp)).append("\n");
        sb.append("    primaryIp4: ").append(toIndentedString(primaryIp4)).append("\n");
        sb.append("    primaryIp6: ").append(toIndentedString(primaryIp6)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    virtualChassis: ").append(toIndentedString(virtualChassis)).append("\n");
        sb.append("    vcPosition: ").append(toIndentedString(vcPosition)).append("\n");
        sb.append("    vcPriority: ").append(toIndentedString(vcPriority)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    localContextData: ").append(toIndentedString(localContextData)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("device_type");
        openapiFields.add("device_role");
        openapiFields.add("tenant");
        openapiFields.add("platform");
        openapiFields.add("serial");
        openapiFields.add("asset_tag");
        openapiFields.add("site");
        openapiFields.add("location");
        openapiFields.add("rack");
        openapiFields.add("position");
        openapiFields.add("face");
        openapiFields.add("parent_device");
        openapiFields.add("status");
        openapiFields.add("airflow");
        openapiFields.add("primary_ip");
        openapiFields.add("primary_ip4");
        openapiFields.add("primary_ip6");
        openapiFields.add("cluster");
        openapiFields.add("virtual_chassis");
        openapiFields.add("vc_position");
        openapiFields.add("vc_priority");
        openapiFields.add("comments");
        openapiFields.add("local_context_data");
        openapiFields.add("tags");
        openapiFields.add("custom_fields");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("device_type");
        openapiRequiredFields.add("device_role");
        openapiRequiredFields.add("site");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to Device
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (Device.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in Device is not found in the empty JSON string", Device.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Device.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Device` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Device.openapiRequiredFields) {
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
        // validate the optional field `device_type`
        if (jsonObj.getAsJsonObject("device_type") != null) {
            NestedDeviceType.validateJsonObject(jsonObj.getAsJsonObject("device_type"));
        }
        // validate the optional field `device_role`
        if (jsonObj.getAsJsonObject("device_role") != null) {
            NestedDeviceRole.validateJsonObject(jsonObj.getAsJsonObject("device_role"));
        }
        // validate the optional field `tenant`
        if (jsonObj.getAsJsonObject("tenant") != null) {
            NestedTenant.validateJsonObject(jsonObj.getAsJsonObject("tenant"));
        }
        // validate the optional field `platform`
        if (jsonObj.getAsJsonObject("platform") != null) {
            NestedPlatform.validateJsonObject(jsonObj.getAsJsonObject("platform"));
        }
        if (jsonObj.get("serial") != null && !jsonObj.get("serial").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `serial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial")
                    .toString()));
        }
        if (jsonObj.get("asset_tag") != null && !jsonObj.get("asset_tag").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `asset_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_tag")
                    .toString()));
        }
        // validate the optional field `site`
        if (jsonObj.getAsJsonObject("site") != null) {
            NestedSite.validateJsonObject(jsonObj.getAsJsonObject("site"));
        }
        // validate the optional field `location`
        if (jsonObj.getAsJsonObject("location") != null) {
            NestedLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
        }
        // validate the optional field `rack`
        if (jsonObj.getAsJsonObject("rack") != null) {
            NestedRack.validateJsonObject(jsonObj.getAsJsonObject("rack"));
        }
        // validate the optional field `face`
        if (jsonObj.getAsJsonObject("face") != null) {
            Face.validateJsonObject(jsonObj.getAsJsonObject("face"));
        }
        // validate the optional field `parent_device`
        if (jsonObj.getAsJsonObject("parent_device") != null) {
            NestedDevice.validateJsonObject(jsonObj.getAsJsonObject("parent_device"));
        }
        // validate the optional field `status`
        if (jsonObj.getAsJsonObject("status") != null) {
            Status2.validateJsonObject(jsonObj.getAsJsonObject("status"));
        }
        // validate the optional field `airflow`
        if (jsonObj.getAsJsonObject("airflow") != null) {
            Airflow.validateJsonObject(jsonObj.getAsJsonObject("airflow"));
        }
        // validate the optional field `primary_ip`
        if (jsonObj.getAsJsonObject("primary_ip") != null) {
            NestedIPAddress.validateJsonObject(jsonObj.getAsJsonObject("primary_ip"));
        }
        // validate the optional field `primary_ip4`
        if (jsonObj.getAsJsonObject("primary_ip4") != null) {
            NestedIPAddress.validateJsonObject(jsonObj.getAsJsonObject("primary_ip4"));
        }
        // validate the optional field `primary_ip6`
        if (jsonObj.getAsJsonObject("primary_ip6") != null) {
            NestedIPAddress.validateJsonObject(jsonObj.getAsJsonObject("primary_ip6"));
        }
        // validate the optional field `cluster`
        if (jsonObj.getAsJsonObject("cluster") != null) {
            NestedCluster.validateJsonObject(jsonObj.getAsJsonObject("cluster"));
        }
        // validate the optional field `virtual_chassis`
        if (jsonObj.getAsJsonObject("virtual_chassis") != null) {
            NestedVirtualChassis.validateJsonObject(jsonObj.getAsJsonObject("virtual_chassis"));
        }
        if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments")
                    .toString()));
        }
        if (jsonObj.get("local_context_data") != null && !jsonObj.get("local_context_data").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `local_context_data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("local_context_data")
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
            if (!Device.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Device' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Device> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(Device.class));
            
            return (TypeAdapter<T>) new TypeAdapter<Device>() {
                @Override
                public void write(JsonWriter out, Device value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public Device read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of Device given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of Device
     *
     * @throws IOException if the JSON string is invalid with respect to Device
     */
    public static Device fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Device.class);
    }
    
    /**
     * Convert an instance of Device to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


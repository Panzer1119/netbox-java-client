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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import de.codemakers.netbox.client.model.NestedDevice;
import de.codemakers.netbox.client.model.NestedTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WritableDeviceWithConfigContext
 */
@JsonPropertyOrder({
  WritableDeviceWithConfigContext.JSON_PROPERTY_ID,
  WritableDeviceWithConfigContext.JSON_PROPERTY_URL,
  WritableDeviceWithConfigContext.JSON_PROPERTY_DISPLAY,
  WritableDeviceWithConfigContext.JSON_PROPERTY_NAME,
  WritableDeviceWithConfigContext.JSON_PROPERTY_DEVICE_TYPE,
  WritableDeviceWithConfigContext.JSON_PROPERTY_DEVICE_ROLE,
  WritableDeviceWithConfigContext.JSON_PROPERTY_TENANT,
  WritableDeviceWithConfigContext.JSON_PROPERTY_PLATFORM,
  WritableDeviceWithConfigContext.JSON_PROPERTY_SERIAL,
  WritableDeviceWithConfigContext.JSON_PROPERTY_ASSET_TAG,
  WritableDeviceWithConfigContext.JSON_PROPERTY_SITE,
  WritableDeviceWithConfigContext.JSON_PROPERTY_LOCATION,
  WritableDeviceWithConfigContext.JSON_PROPERTY_RACK,
  WritableDeviceWithConfigContext.JSON_PROPERTY_POSITION,
  WritableDeviceWithConfigContext.JSON_PROPERTY_FACE,
  WritableDeviceWithConfigContext.JSON_PROPERTY_PARENT_DEVICE,
  WritableDeviceWithConfigContext.JSON_PROPERTY_STATUS,
  WritableDeviceWithConfigContext.JSON_PROPERTY_AIRFLOW,
  WritableDeviceWithConfigContext.JSON_PROPERTY_PRIMARY_IP,
  WritableDeviceWithConfigContext.JSON_PROPERTY_PRIMARY_IP4,
  WritableDeviceWithConfigContext.JSON_PROPERTY_PRIMARY_IP6,
  WritableDeviceWithConfigContext.JSON_PROPERTY_CLUSTER,
  WritableDeviceWithConfigContext.JSON_PROPERTY_VIRTUAL_CHASSIS,
  WritableDeviceWithConfigContext.JSON_PROPERTY_VC_POSITION,
  WritableDeviceWithConfigContext.JSON_PROPERTY_VC_PRIORITY,
  WritableDeviceWithConfigContext.JSON_PROPERTY_COMMENTS,
  WritableDeviceWithConfigContext.JSON_PROPERTY_LOCAL_CONTEXT_DATA,
  WritableDeviceWithConfigContext.JSON_PROPERTY_TAGS,
  WritableDeviceWithConfigContext.JSON_PROPERTY_CUSTOM_FIELDS,
  WritableDeviceWithConfigContext.JSON_PROPERTY_CONFIG_CONTEXT,
  WritableDeviceWithConfigContext.JSON_PROPERTY_CREATED,
  WritableDeviceWithConfigContext.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class WritableDeviceWithConfigContext {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "device_type";
  private Integer deviceType;

  public static final String JSON_PROPERTY_DEVICE_ROLE = "device_role";
  private Integer deviceRole;

  public static final String JSON_PROPERTY_TENANT = "tenant";
  private Integer tenant;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private JsonNullable<Integer> platform = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SERIAL = "serial";
  private String serial;

  public static final String JSON_PROPERTY_ASSET_TAG = "asset_tag";
  private JsonNullable<String> assetTag = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SITE = "site";
  private Integer site;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private JsonNullable<Integer> location = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_RACK = "rack";
  private Integer rack;

  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<BigDecimal> position = JsonNullable.<BigDecimal>undefined();

  /**
   * Gets or Sets face
   */
  public enum FaceEnum {
    FRONT("front"),
    
    REAR("rear"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    FaceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FaceEnum fromValue(String value) {
      for (FaceEnum b : FaceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_FACE = "face";
  private FaceEnum face;

  public static final String JSON_PROPERTY_PARENT_DEVICE = "parent_device";
  private NestedDevice parentDevice;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OFFLINE("offline"),
    
    ACTIVE("active"),
    
    PLANNED("planned"),
    
    STAGED("staged"),
    
    FAILED("failed"),
    
    INVENTORY("inventory"),
    
    DECOMMISSIONING("decommissioning"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  /**
   * Gets or Sets airflow
   */
  public enum AirflowEnum {
    FRONT_TO_REAR("front-to-rear"),
    
    REAR_TO_FRONT("rear-to-front"),
    
    LEFT_TO_RIGHT("left-to-right"),
    
    RIGHT_TO_LEFT("right-to-left"),
    
    SIDE_TO_REAR("side-to-rear"),
    
    PASSIVE("passive"),
    
    MIXED("mixed"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    AirflowEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AirflowEnum fromValue(String value) {
      for (AirflowEnum b : AirflowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_AIRFLOW = "airflow";
  private AirflowEnum airflow;

  public static final String JSON_PROPERTY_PRIMARY_IP = "primary_ip";
  private String primaryIp;

  public static final String JSON_PROPERTY_PRIMARY_IP4 = "primary_ip4";
  private JsonNullable<Integer> primaryIp4 = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_PRIMARY_IP6 = "primary_ip6";
  private JsonNullable<Integer> primaryIp6 = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CLUSTER = "cluster";
  private JsonNullable<Integer> cluster = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_VIRTUAL_CHASSIS = "virtual_chassis";
  private Integer virtualChassis;

  public static final String JSON_PROPERTY_VC_POSITION = "vc_position";
  private JsonNullable<Integer> vcPosition = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_VC_PRIORITY = "vc_priority";
  private JsonNullable<Integer> vcPriority = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private String comments;

  public static final String JSON_PROPERTY_LOCAL_CONTEXT_DATA = "local_context_data";
  private JsonNullable<String> localContextData = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<NestedTag> tags = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private Object customFields;

  public static final String JSON_PROPERTY_CONFIG_CONTEXT = "config_context";
  private Map<String, String> configContext = null;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public WritableDeviceWithConfigContext() { 
  }

  @JsonCreator
  public WritableDeviceWithConfigContext(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_PRIMARY_IP) String primaryIp, 
    @JsonProperty(JSON_PROPERTY_CONFIG_CONTEXT) Map<String, String> configContext, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED) OffsetDateTime lastUpdated
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.primaryIp = primaryIp;
    this.configContext = configContext;
    this.created = created;
    this.lastUpdated = lastUpdated;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }




   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getUrl() {
    return url;
  }




   /**
   * Get display
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplay() {
    return display;
  }




  public WritableDeviceWithConfigContext name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public WritableDeviceWithConfigContext deviceType(Integer deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDeviceType() {
    return deviceType;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }


  public WritableDeviceWithConfigContext deviceRole(Integer deviceRole) {
    this.deviceRole = deviceRole;
    return this;
  }

   /**
   * Get deviceRole
   * @return deviceRole
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDeviceRole() {
    return deviceRole;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeviceRole(Integer deviceRole) {
    this.deviceRole = deviceRole;
  }


  public WritableDeviceWithConfigContext tenant(Integer tenant) {
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTenant() {
    return tenant;
  }


  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenant(Integer tenant) {
    this.tenant = tenant;
  }


  public WritableDeviceWithConfigContext platform(Integer platform) {
    this.platform = JsonNullable.<Integer>of(platform);
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getPlatform() {
        return platform.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPlatform_JsonNullable() {
    return platform;
  }
  
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  public void setPlatform_JsonNullable(JsonNullable<Integer> platform) {
    this.platform = platform;
  }

  public void setPlatform(Integer platform) {
    this.platform = JsonNullable.<Integer>of(platform);
  }


  public WritableDeviceWithConfigContext serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSerial() {
    return serial;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerial(String serial) {
    this.serial = serial;
  }


  public WritableDeviceWithConfigContext assetTag(String assetTag) {
    this.assetTag = JsonNullable.<String>of(assetTag);
    return this;
  }

   /**
   * A unique tag used to identify this device
   * @return assetTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique tag used to identify this device")
  @JsonIgnore

  public String getAssetTag() {
        return assetTag.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSET_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAssetTag_JsonNullable() {
    return assetTag;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSET_TAG)
  public void setAssetTag_JsonNullable(JsonNullable<String> assetTag) {
    this.assetTag = assetTag;
  }

  public void setAssetTag(String assetTag) {
    this.assetTag = JsonNullable.<String>of(assetTag);
  }


  public WritableDeviceWithConfigContext site(Integer site) {
    this.site = site;
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSite() {
    return site;
  }


  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSite(Integer site) {
    this.site = site;
  }


  public WritableDeviceWithConfigContext location(Integer location) {
    this.location = JsonNullable.<Integer>of(location);
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getLocation() {
        return location.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getLocation_JsonNullable() {
    return location;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCATION)
  public void setLocation_JsonNullable(JsonNullable<Integer> location) {
    this.location = location;
  }

  public void setLocation(Integer location) {
    this.location = JsonNullable.<Integer>of(location);
  }


  public WritableDeviceWithConfigContext rack(Integer rack) {
    this.rack = rack;
    return this;
  }

   /**
   * Get rack
   * @return rack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRack() {
    return rack;
  }


  @JsonProperty(JSON_PROPERTY_RACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRack(Integer rack) {
    this.rack = rack;
  }


  public WritableDeviceWithConfigContext position(BigDecimal position) {
    this.position = JsonNullable.<BigDecimal>of(position);
    return this;
  }

   /**
   * Get position
   * minimum: 0.5
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public BigDecimal getPosition() {
        return position.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getPosition_JsonNullable() {
    return position;
  }
  
  @JsonProperty(JSON_PROPERTY_POSITION)
  public void setPosition_JsonNullable(JsonNullable<BigDecimal> position) {
    this.position = position;
  }

  public void setPosition(BigDecimal position) {
    this.position = JsonNullable.<BigDecimal>of(position);
  }


  public WritableDeviceWithConfigContext face(FaceEnum face) {
    this.face = face;
    return this;
  }

   /**
   * Get face
   * @return face
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FaceEnum getFace() {
    return face;
  }


  @JsonProperty(JSON_PROPERTY_FACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFace(FaceEnum face) {
    this.face = face;
  }


  public WritableDeviceWithConfigContext parentDevice(NestedDevice parentDevice) {
    this.parentDevice = parentDevice;
    return this;
  }

   /**
   * Get parentDevice
   * @return parentDevice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NestedDevice getParentDevice() {
    return parentDevice;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentDevice(NestedDevice parentDevice) {
    this.parentDevice = parentDevice;
  }


  public WritableDeviceWithConfigContext status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WritableDeviceWithConfigContext airflow(AirflowEnum airflow) {
    this.airflow = airflow;
    return this;
  }

   /**
   * Get airflow
   * @return airflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AIRFLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AirflowEnum getAirflow() {
    return airflow;
  }


  @JsonProperty(JSON_PROPERTY_AIRFLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAirflow(AirflowEnum airflow) {
    this.airflow = airflow;
  }


   /**
   * Get primaryIp
   * @return primaryIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIMARY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryIp() {
    return primaryIp;
  }




  public WritableDeviceWithConfigContext primaryIp4(Integer primaryIp4) {
    this.primaryIp4 = JsonNullable.<Integer>of(primaryIp4);
    return this;
  }

   /**
   * Get primaryIp4
   * @return primaryIp4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getPrimaryIp4() {
        return primaryIp4.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_IP4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPrimaryIp4_JsonNullable() {
    return primaryIp4;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_IP4)
  public void setPrimaryIp4_JsonNullable(JsonNullable<Integer> primaryIp4) {
    this.primaryIp4 = primaryIp4;
  }

  public void setPrimaryIp4(Integer primaryIp4) {
    this.primaryIp4 = JsonNullable.<Integer>of(primaryIp4);
  }


  public WritableDeviceWithConfigContext primaryIp6(Integer primaryIp6) {
    this.primaryIp6 = JsonNullable.<Integer>of(primaryIp6);
    return this;
  }

   /**
   * Get primaryIp6
   * @return primaryIp6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getPrimaryIp6() {
        return primaryIp6.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_IP6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPrimaryIp6_JsonNullable() {
    return primaryIp6;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIMARY_IP6)
  public void setPrimaryIp6_JsonNullable(JsonNullable<Integer> primaryIp6) {
    this.primaryIp6 = primaryIp6;
  }

  public void setPrimaryIp6(Integer primaryIp6) {
    this.primaryIp6 = JsonNullable.<Integer>of(primaryIp6);
  }


  public WritableDeviceWithConfigContext cluster(Integer cluster) {
    this.cluster = JsonNullable.<Integer>of(cluster);
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getCluster() {
        return cluster.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLUSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getCluster_JsonNullable() {
    return cluster;
  }
  
  @JsonProperty(JSON_PROPERTY_CLUSTER)
  public void setCluster_JsonNullable(JsonNullable<Integer> cluster) {
    this.cluster = cluster;
  }

  public void setCluster(Integer cluster) {
    this.cluster = JsonNullable.<Integer>of(cluster);
  }


  public WritableDeviceWithConfigContext virtualChassis(Integer virtualChassis) {
    this.virtualChassis = virtualChassis;
    return this;
  }

   /**
   * Get virtualChassis
   * @return virtualChassis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_CHASSIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVirtualChassis() {
    return virtualChassis;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_CHASSIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVirtualChassis(Integer virtualChassis) {
    this.virtualChassis = virtualChassis;
  }


  public WritableDeviceWithConfigContext vcPosition(Integer vcPosition) {
    this.vcPosition = JsonNullable.<Integer>of(vcPosition);
    return this;
  }

   /**
   * Get vcPosition
   * minimum: 0
   * maximum: 255
   * @return vcPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getVcPosition() {
        return vcPosition.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VC_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getVcPosition_JsonNullable() {
    return vcPosition;
  }
  
  @JsonProperty(JSON_PROPERTY_VC_POSITION)
  public void setVcPosition_JsonNullable(JsonNullable<Integer> vcPosition) {
    this.vcPosition = vcPosition;
  }

  public void setVcPosition(Integer vcPosition) {
    this.vcPosition = JsonNullable.<Integer>of(vcPosition);
  }


  public WritableDeviceWithConfigContext vcPriority(Integer vcPriority) {
    this.vcPriority = JsonNullable.<Integer>of(vcPriority);
    return this;
  }

   /**
   * Get vcPriority
   * minimum: 0
   * maximum: 255
   * @return vcPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getVcPriority() {
        return vcPriority.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VC_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getVcPriority_JsonNullable() {
    return vcPriority;
  }
  
  @JsonProperty(JSON_PROPERTY_VC_PRIORITY)
  public void setVcPriority_JsonNullable(JsonNullable<Integer> vcPriority) {
    this.vcPriority = vcPriority;
  }

  public void setVcPriority(Integer vcPriority) {
    this.vcPriority = JsonNullable.<Integer>of(vcPriority);
  }


  public WritableDeviceWithConfigContext comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComments() {
    return comments;
  }


  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComments(String comments) {
    this.comments = comments;
  }


  public WritableDeviceWithConfigContext localContextData(String localContextData) {
    this.localContextData = JsonNullable.<String>of(localContextData);
    return this;
  }

   /**
   * Get localContextData
   * @return localContextData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getLocalContextData() {
        return localContextData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCAL_CONTEXT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLocalContextData_JsonNullable() {
    return localContextData;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCAL_CONTEXT_DATA)
  public void setLocalContextData_JsonNullable(JsonNullable<String> localContextData) {
    this.localContextData = localContextData;
  }

  public void setLocalContextData(String localContextData) {
    this.localContextData = JsonNullable.<String>of(localContextData);
  }


  public WritableDeviceWithConfigContext tags(List<NestedTag> tags) {
    this.tags = tags;
    return this;
  }

  public WritableDeviceWithConfigContext addTagsItem(NestedTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NestedTag> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<NestedTag> tags) {
    this.tags = tags;
  }


  public WritableDeviceWithConfigContext customFields(Object customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }


   /**
   * Get configContext
   * @return configContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_CONTEXT)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getConfigContext() {
    return configContext;
  }




   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }




  /**
   * Return true if this WritableDeviceWithConfigContext object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableDeviceWithConfigContext writableDeviceWithConfigContext = (WritableDeviceWithConfigContext) o;
    return Objects.equals(this.id, writableDeviceWithConfigContext.id) &&
        Objects.equals(this.url, writableDeviceWithConfigContext.url) &&
        Objects.equals(this.display, writableDeviceWithConfigContext.display) &&
        Objects.equals(this.name, writableDeviceWithConfigContext.name) &&
        Objects.equals(this.deviceType, writableDeviceWithConfigContext.deviceType) &&
        Objects.equals(this.deviceRole, writableDeviceWithConfigContext.deviceRole) &&
        Objects.equals(this.tenant, writableDeviceWithConfigContext.tenant) &&
        equalsNullable(this.platform, writableDeviceWithConfigContext.platform) &&
        Objects.equals(this.serial, writableDeviceWithConfigContext.serial) &&
        equalsNullable(this.assetTag, writableDeviceWithConfigContext.assetTag) &&
        Objects.equals(this.site, writableDeviceWithConfigContext.site) &&
        equalsNullable(this.location, writableDeviceWithConfigContext.location) &&
        Objects.equals(this.rack, writableDeviceWithConfigContext.rack) &&
        equalsNullable(this.position, writableDeviceWithConfigContext.position) &&
        Objects.equals(this.face, writableDeviceWithConfigContext.face) &&
        Objects.equals(this.parentDevice, writableDeviceWithConfigContext.parentDevice) &&
        Objects.equals(this.status, writableDeviceWithConfigContext.status) &&
        Objects.equals(this.airflow, writableDeviceWithConfigContext.airflow) &&
        Objects.equals(this.primaryIp, writableDeviceWithConfigContext.primaryIp) &&
        equalsNullable(this.primaryIp4, writableDeviceWithConfigContext.primaryIp4) &&
        equalsNullable(this.primaryIp6, writableDeviceWithConfigContext.primaryIp6) &&
        equalsNullable(this.cluster, writableDeviceWithConfigContext.cluster) &&
        Objects.equals(this.virtualChassis, writableDeviceWithConfigContext.virtualChassis) &&
        equalsNullable(this.vcPosition, writableDeviceWithConfigContext.vcPosition) &&
        equalsNullable(this.vcPriority, writableDeviceWithConfigContext.vcPriority) &&
        Objects.equals(this.comments, writableDeviceWithConfigContext.comments) &&
        equalsNullable(this.localContextData, writableDeviceWithConfigContext.localContextData) &&
        Objects.equals(this.tags, writableDeviceWithConfigContext.tags) &&
        Objects.equals(this.customFields, writableDeviceWithConfigContext.customFields) &&
        Objects.equals(this.configContext, writableDeviceWithConfigContext.configContext) &&
        Objects.equals(this.created, writableDeviceWithConfigContext.created) &&
        Objects.equals(this.lastUpdated, writableDeviceWithConfigContext.lastUpdated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, name, deviceType, deviceRole, tenant, hashCodeNullable(platform), serial, hashCodeNullable(assetTag), site, hashCodeNullable(location), rack, hashCodeNullable(position), face, parentDevice, status, airflow, primaryIp, hashCodeNullable(primaryIp4), hashCodeNullable(primaryIp6), hashCodeNullable(cluster), virtualChassis, hashCodeNullable(vcPosition), hashCodeNullable(vcPriority), comments, hashCodeNullable(localContextData), tags, customFields, configContext, created, lastUpdated);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableDeviceWithConfigContext {\n");
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
    sb.append("    configContext: ").append(toIndentedString(configContext)).append("\n");
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

}


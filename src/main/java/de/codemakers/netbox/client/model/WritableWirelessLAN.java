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
import de.codemakers.netbox.client.model.NestedTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WritableWirelessLAN
 */
@JsonPropertyOrder({
  WritableWirelessLAN.JSON_PROPERTY_ID,
  WritableWirelessLAN.JSON_PROPERTY_URL,
  WritableWirelessLAN.JSON_PROPERTY_DISPLAY,
  WritableWirelessLAN.JSON_PROPERTY_SSID,
  WritableWirelessLAN.JSON_PROPERTY_DESCRIPTION,
  WritableWirelessLAN.JSON_PROPERTY_GROUP,
  WritableWirelessLAN.JSON_PROPERTY_VLAN,
  WritableWirelessLAN.JSON_PROPERTY_TENANT,
  WritableWirelessLAN.JSON_PROPERTY_AUTH_TYPE,
  WritableWirelessLAN.JSON_PROPERTY_AUTH_CIPHER,
  WritableWirelessLAN.JSON_PROPERTY_AUTH_PSK,
  WritableWirelessLAN.JSON_PROPERTY_TAGS,
  WritableWirelessLAN.JSON_PROPERTY_CUSTOM_FIELDS,
  WritableWirelessLAN.JSON_PROPERTY_CREATED,
  WritableWirelessLAN.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class WritableWirelessLAN {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_SSID = "ssid";
  private String ssid;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GROUP = "group";
  private JsonNullable<Integer> group = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_VLAN = "vlan";
  private JsonNullable<Integer> vlan = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TENANT = "tenant";
  private JsonNullable<Integer> tenant = JsonNullable.<Integer>undefined();

  /**
   * Gets or Sets authType
   */
  public enum AuthTypeEnum {
    OPEN("open"),
    
    WEP("wep"),
    
    WPA_PERSONAL("wpa-personal"),
    
    WPA_ENTERPRISE("wpa-enterprise"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    AuthTypeEnum(String value) {
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
    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private AuthTypeEnum authType;

  /**
   * Gets or Sets authCipher
   */
  public enum AuthCipherEnum {
    AUTO("auto"),
    
    TKIP("tkip"),
    
    AES("aes"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    AuthCipherEnum(String value) {
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
    public static AuthCipherEnum fromValue(String value) {
      for (AuthCipherEnum b : AuthCipherEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_AUTH_CIPHER = "auth_cipher";
  private AuthCipherEnum authCipher;

  public static final String JSON_PROPERTY_AUTH_PSK = "auth_psk";
  private String authPsk;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<NestedTag> tags = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private Object customFields;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public WritableWirelessLAN() { 
  }

  @JsonCreator
  public WritableWirelessLAN(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED) OffsetDateTime lastUpdated
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
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




  public WritableWirelessLAN ssid(String ssid) {
    this.ssid = ssid;
    return this;
  }

   /**
   * Get ssid
   * @return ssid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSsid() {
    return ssid;
  }


  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSsid(String ssid) {
    this.ssid = ssid;
  }


  public WritableWirelessLAN description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public WritableWirelessLAN group(Integer group) {
    this.group = JsonNullable.<Integer>of(group);
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getGroup() {
        return group.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getGroup_JsonNullable() {
    return group;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP)
  public void setGroup_JsonNullable(JsonNullable<Integer> group) {
    this.group = group;
  }

  public void setGroup(Integer group) {
    this.group = JsonNullable.<Integer>of(group);
  }


  public WritableWirelessLAN vlan(Integer vlan) {
    this.vlan = JsonNullable.<Integer>of(vlan);
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getVlan() {
        return vlan.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getVlan_JsonNullable() {
    return vlan;
  }
  
  @JsonProperty(JSON_PROPERTY_VLAN)
  public void setVlan_JsonNullable(JsonNullable<Integer> vlan) {
    this.vlan = vlan;
  }

  public void setVlan(Integer vlan) {
    this.vlan = JsonNullable.<Integer>of(vlan);
  }


  public WritableWirelessLAN tenant(Integer tenant) {
    this.tenant = JsonNullable.<Integer>of(tenant);
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getTenant() {
        return tenant.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTenant_JsonNullable() {
    return tenant;
  }
  
  @JsonProperty(JSON_PROPERTY_TENANT)
  public void setTenant_JsonNullable(JsonNullable<Integer> tenant) {
    this.tenant = tenant;
  }

  public void setTenant(Integer tenant) {
    this.tenant = JsonNullable.<Integer>of(tenant);
  }


  public WritableWirelessLAN authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthTypeEnum getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }


  public WritableWirelessLAN authCipher(AuthCipherEnum authCipher) {
    this.authCipher = authCipher;
    return this;
  }

   /**
   * Get authCipher
   * @return authCipher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_CIPHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthCipherEnum getAuthCipher() {
    return authCipher;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_CIPHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthCipher(AuthCipherEnum authCipher) {
    this.authCipher = authCipher;
  }


  public WritableWirelessLAN authPsk(String authPsk) {
    this.authPsk = authPsk;
    return this;
  }

   /**
   * Get authPsk
   * @return authPsk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_PSK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthPsk() {
    return authPsk;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_PSK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthPsk(String authPsk) {
    this.authPsk = authPsk;
  }


  public WritableWirelessLAN tags(List<NestedTag> tags) {
    this.tags = tags;
    return this;
  }

  public WritableWirelessLAN addTagsItem(NestedTag tagsItem) {
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


  public WritableWirelessLAN customFields(Object customFields) {
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
   * Return true if this WritableWirelessLAN object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableWirelessLAN writableWirelessLAN = (WritableWirelessLAN) o;
    return Objects.equals(this.id, writableWirelessLAN.id) &&
        Objects.equals(this.url, writableWirelessLAN.url) &&
        Objects.equals(this.display, writableWirelessLAN.display) &&
        Objects.equals(this.ssid, writableWirelessLAN.ssid) &&
        Objects.equals(this.description, writableWirelessLAN.description) &&
        equalsNullable(this.group, writableWirelessLAN.group) &&
        equalsNullable(this.vlan, writableWirelessLAN.vlan) &&
        equalsNullable(this.tenant, writableWirelessLAN.tenant) &&
        Objects.equals(this.authType, writableWirelessLAN.authType) &&
        Objects.equals(this.authCipher, writableWirelessLAN.authCipher) &&
        Objects.equals(this.authPsk, writableWirelessLAN.authPsk) &&
        Objects.equals(this.tags, writableWirelessLAN.tags) &&
        Objects.equals(this.customFields, writableWirelessLAN.customFields) &&
        Objects.equals(this.created, writableWirelessLAN.created) &&
        Objects.equals(this.lastUpdated, writableWirelessLAN.lastUpdated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, ssid, description, hashCodeNullable(group), hashCodeNullable(vlan), hashCodeNullable(tenant), authType, authCipher, authPsk, tags, customFields, created, lastUpdated);
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
    sb.append("class WritableWirelessLAN {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authCipher: ").append(toIndentedString(authCipher)).append("\n");
    sb.append("    authPsk: ").append(toIndentedString(authPsk)).append("\n");
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

}


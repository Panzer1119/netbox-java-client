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
 * WritableModule
 */
@JsonPropertyOrder({
  WritableModule.JSON_PROPERTY_ID,
  WritableModule.JSON_PROPERTY_URL,
  WritableModule.JSON_PROPERTY_DISPLAY,
  WritableModule.JSON_PROPERTY_DEVICE,
  WritableModule.JSON_PROPERTY_MODULE_BAY,
  WritableModule.JSON_PROPERTY_MODULE_TYPE,
  WritableModule.JSON_PROPERTY_SERIAL,
  WritableModule.JSON_PROPERTY_ASSET_TAG,
  WritableModule.JSON_PROPERTY_COMMENTS,
  WritableModule.JSON_PROPERTY_TAGS,
  WritableModule.JSON_PROPERTY_CUSTOM_FIELDS,
  WritableModule.JSON_PROPERTY_CREATED,
  WritableModule.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class WritableModule {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private Integer device;

  public static final String JSON_PROPERTY_MODULE_BAY = "module_bay";
  private Integer moduleBay;

  public static final String JSON_PROPERTY_MODULE_TYPE = "module_type";
  private Integer moduleType;

  public static final String JSON_PROPERTY_SERIAL = "serial";
  private String serial;

  public static final String JSON_PROPERTY_ASSET_TAG = "asset_tag";
  private JsonNullable<String> assetTag = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private String comments;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<NestedTag> tags = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private Object customFields;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public WritableModule() { 
  }

  @JsonCreator
  public WritableModule(
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




  public WritableModule device(Integer device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDevice(Integer device) {
    this.device = device;
  }


  public WritableModule moduleBay(Integer moduleBay) {
    this.moduleBay = moduleBay;
    return this;
  }

   /**
   * Get moduleBay
   * @return moduleBay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MODULE_BAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getModuleBay() {
    return moduleBay;
  }


  @JsonProperty(JSON_PROPERTY_MODULE_BAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModuleBay(Integer moduleBay) {
    this.moduleBay = moduleBay;
  }


  public WritableModule moduleType(Integer moduleType) {
    this.moduleType = moduleType;
    return this;
  }

   /**
   * Get moduleType
   * @return moduleType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MODULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getModuleType() {
    return moduleType;
  }


  @JsonProperty(JSON_PROPERTY_MODULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModuleType(Integer moduleType) {
    this.moduleType = moduleType;
  }


  public WritableModule serial(String serial) {
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


  public WritableModule assetTag(String assetTag) {
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


  public WritableModule comments(String comments) {
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


  public WritableModule tags(List<NestedTag> tags) {
    this.tags = tags;
    return this;
  }

  public WritableModule addTagsItem(NestedTag tagsItem) {
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


  public WritableModule customFields(Object customFields) {
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
   * Return true if this WritableModule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableModule writableModule = (WritableModule) o;
    return Objects.equals(this.id, writableModule.id) &&
        Objects.equals(this.url, writableModule.url) &&
        Objects.equals(this.display, writableModule.display) &&
        Objects.equals(this.device, writableModule.device) &&
        Objects.equals(this.moduleBay, writableModule.moduleBay) &&
        Objects.equals(this.moduleType, writableModule.moduleType) &&
        Objects.equals(this.serial, writableModule.serial) &&
        equalsNullable(this.assetTag, writableModule.assetTag) &&
        Objects.equals(this.comments, writableModule.comments) &&
        Objects.equals(this.tags, writableModule.tags) &&
        Objects.equals(this.customFields, writableModule.customFields) &&
        Objects.equals(this.created, writableModule.created) &&
        Objects.equals(this.lastUpdated, writableModule.lastUpdated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, device, moduleBay, moduleType, serial, hashCodeNullable(assetTag), comments, tags, customFields, created, lastUpdated);
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
    sb.append("class WritableModule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    moduleBay: ").append(toIndentedString(moduleBay)).append("\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    assetTag: ").append(toIndentedString(assetTag)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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


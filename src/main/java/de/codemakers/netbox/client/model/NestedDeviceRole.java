/*
 * NetBox API
 * API to access NetBox
 *
 * The version of the OpenAPI document: 3.2
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NestedDeviceRole
 */
@JsonPropertyOrder({
  NestedDeviceRole.JSON_PROPERTY_ID,
  NestedDeviceRole.JSON_PROPERTY_URL,
  NestedDeviceRole.JSON_PROPERTY_DISPLAY,
  NestedDeviceRole.JSON_PROPERTY_NAME,
  NestedDeviceRole.JSON_PROPERTY_SLUG,
  NestedDeviceRole.JSON_PROPERTY_DEVICE_COUNT,
  NestedDeviceRole.JSON_PROPERTY_VIRTUALMACHINE_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T18:36:37.665487300+02:00[Europe/Berlin]")
public class NestedDeviceRole {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_DEVICE_COUNT = "device_count";
  private Integer deviceCount;

  public static final String JSON_PROPERTY_VIRTUALMACHINE_COUNT = "virtualmachine_count";
  private Integer virtualmachineCount;

  public NestedDeviceRole() { 
  }

  @JsonCreator
  public NestedDeviceRole(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_DEVICE_COUNT) Integer deviceCount, 
    @JsonProperty(JSON_PROPERTY_VIRTUALMACHINE_COUNT) Integer virtualmachineCount
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.deviceCount = deviceCount;
    this.virtualmachineCount = virtualmachineCount;
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




  public NestedDeviceRole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
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


  public NestedDeviceRole slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlug(String slug) {
    this.slug = slug;
  }


   /**
   * Get deviceCount
   * @return deviceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeviceCount() {
    return deviceCount;
  }




   /**
   * Get virtualmachineCount
   * @return virtualmachineCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIRTUALMACHINE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVirtualmachineCount() {
    return virtualmachineCount;
  }




  /**
   * Return true if this NestedDeviceRole object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedDeviceRole nestedDeviceRole = (NestedDeviceRole) o;
    return Objects.equals(this.id, nestedDeviceRole.id) &&
        Objects.equals(this.url, nestedDeviceRole.url) &&
        Objects.equals(this.display, nestedDeviceRole.display) &&
        Objects.equals(this.name, nestedDeviceRole.name) &&
        Objects.equals(this.slug, nestedDeviceRole.slug) &&
        Objects.equals(this.deviceCount, nestedDeviceRole.deviceCount) &&
        Objects.equals(this.virtualmachineCount, nestedDeviceRole.virtualmachineCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, name, slug, deviceCount, virtualmachineCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedDeviceRole {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    deviceCount: ").append(toIndentedString(deviceCount)).append("\n");
    sb.append("    virtualmachineCount: ").append(toIndentedString(virtualmachineCount)).append("\n");
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


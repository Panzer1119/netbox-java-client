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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NestedUser
 */
@JsonPropertyOrder({
  NestedUser.JSON_PROPERTY_ID,
  NestedUser.JSON_PROPERTY_URL,
  NestedUser.JSON_PROPERTY_DISPLAY,
  NestedUser.JSON_PROPERTY_USERNAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class NestedUser {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public NestedUser() { 
  }

  @JsonCreator
  public NestedUser(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
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




  public NestedUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Return true if this NestedUser object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedUser nestedUser = (NestedUser) o;
    return Objects.equals(this.id, nestedUser.id) &&
        Objects.equals(this.url, nestedUser.url) &&
        Objects.equals(this.display, nestedUser.display) &&
        Objects.equals(this.username, nestedUser.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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


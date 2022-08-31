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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NestedVRF
 */
@JsonPropertyOrder({
  NestedVRF.JSON_PROPERTY_ID,
  NestedVRF.JSON_PROPERTY_URL,
  NestedVRF.JSON_PROPERTY_DISPLAY,
  NestedVRF.JSON_PROPERTY_NAME,
  NestedVRF.JSON_PROPERTY_RD,
  NestedVRF.JSON_PROPERTY_PREFIX_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class NestedVRF {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RD = "rd";
  private JsonNullable<String> rd = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREFIX_COUNT = "prefix_count";
  private Integer prefixCount;

  public NestedVRF() { 
  }

  @JsonCreator
  public NestedVRF(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_PREFIX_COUNT) Integer prefixCount
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.prefixCount = prefixCount;
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




  public NestedVRF name(String name) {
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


  public NestedVRF rd(String rd) {
    this.rd = JsonNullable.<String>of(rd);
    return this;
  }

   /**
   * Unique route distinguisher (as defined in RFC 4364)
   * @return rd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique route distinguisher (as defined in RFC 4364)")
  @JsonIgnore

  public String getRd() {
        return rd.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRd_JsonNullable() {
    return rd;
  }
  
  @JsonProperty(JSON_PROPERTY_RD)
  public void setRd_JsonNullable(JsonNullable<String> rd) {
    this.rd = rd;
  }

  public void setRd(String rd) {
    this.rd = JsonNullable.<String>of(rd);
  }


   /**
   * Get prefixCount
   * @return prefixCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREFIX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPrefixCount() {
    return prefixCount;
  }




  /**
   * Return true if this NestedVRF object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVRF nestedVRF = (NestedVRF) o;
    return Objects.equals(this.id, nestedVRF.id) &&
        Objects.equals(this.url, nestedVRF.url) &&
        Objects.equals(this.display, nestedVRF.display) &&
        Objects.equals(this.name, nestedVRF.name) &&
        equalsNullable(this.rd, nestedVRF.rd) &&
        Objects.equals(this.prefixCount, nestedVRF.prefixCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, name, hashCodeNullable(rd), prefixCount);
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
    sb.append("class NestedVRF {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rd: ").append(toIndentedString(rd)).append("\n");
    sb.append("    prefixCount: ").append(toIndentedString(prefixCount)).append("\n");
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


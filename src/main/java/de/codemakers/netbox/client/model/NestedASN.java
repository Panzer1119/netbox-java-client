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
 * NestedASN
 */
@JsonPropertyOrder({
  NestedASN.JSON_PROPERTY_ID,
  NestedASN.JSON_PROPERTY_URL,
  NestedASN.JSON_PROPERTY_DISPLAY,
  NestedASN.JSON_PROPERTY_ASN
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class NestedASN {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_ASN = "asn";
  private Integer asn;

  public NestedASN() { 
  }

  @JsonCreator
  public NestedASN(
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




  public NestedASN asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * 32-bit autonomous system number
   * minimum: 1
   * maximum: 4294967295
   * @return asn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "32-bit autonomous system number")
  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAsn() {
    return asn;
  }


  @JsonProperty(JSON_PROPERTY_ASN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAsn(Integer asn) {
    this.asn = asn;
  }


  /**
   * Return true if this NestedASN object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedASN nestedASN = (NestedASN) o;
    return Objects.equals(this.id, nestedASN.id) &&
        Objects.equals(this.url, nestedASN.url) &&
        Objects.equals(this.display, nestedASN.display) &&
        Objects.equals(this.asn, nestedASN.asn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, asn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedASN {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
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


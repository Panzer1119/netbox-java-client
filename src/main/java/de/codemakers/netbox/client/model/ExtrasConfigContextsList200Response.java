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
import de.codemakers.netbox.client.model.ConfigContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ExtrasConfigContextsList200Response
 */
@JsonPropertyOrder({
  ExtrasConfigContextsList200Response.JSON_PROPERTY_COUNT,
  ExtrasConfigContextsList200Response.JSON_PROPERTY_NEXT,
  ExtrasConfigContextsList200Response.JSON_PROPERTY_PREVIOUS,
  ExtrasConfigContextsList200Response.JSON_PROPERTY_RESULTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T18:36:37.665487300+02:00[Europe/Berlin]")
public class ExtrasConfigContextsList200Response {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_NEXT = "next";
  private JsonNullable<URI> next = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private JsonNullable<URI> previous = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<ConfigContext> results = new ArrayList<>();

  public ExtrasConfigContextsList200Response() { 
  }

  public ExtrasConfigContextsList200Response count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public ExtrasConfigContextsList200Response next(URI next) {
    this.next = JsonNullable.<URI>of(next);
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public URI getNext() {
        return next.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getNext_JsonNullable() {
    return next;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT)
  public void setNext_JsonNullable(JsonNullable<URI> next) {
    this.next = next;
  }

  public void setNext(URI next) {
    this.next = JsonNullable.<URI>of(next);
  }


  public ExtrasConfigContextsList200Response previous(URI previous) {
    this.previous = JsonNullable.<URI>of(previous);
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public URI getPrevious() {
        return previous.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getPrevious_JsonNullable() {
    return previous;
  }
  
  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  public void setPrevious_JsonNullable(JsonNullable<URI> previous) {
    this.previous = previous;
  }

  public void setPrevious(URI previous) {
    this.previous = JsonNullable.<URI>of(previous);
  }


  public ExtrasConfigContextsList200Response results(List<ConfigContext> results) {
    this.results = results;
    return this;
  }

  public ExtrasConfigContextsList200Response addResultsItem(ConfigContext resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ConfigContext> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResults(List<ConfigContext> results) {
    this.results = results;
  }


  /**
   * Return true if this extras_config_contexts_list_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtrasConfigContextsList200Response extrasConfigContextsList200Response = (ExtrasConfigContextsList200Response) o;
    return Objects.equals(this.count, extrasConfigContextsList200Response.count) &&
        equalsNullable(this.next, extrasConfigContextsList200Response.next) &&
        equalsNullable(this.previous, extrasConfigContextsList200Response.previous) &&
        Objects.equals(this.results, extrasConfigContextsList200Response.results);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, hashCodeNullable(next), hashCodeNullable(previous), results);
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
    sb.append("class ExtrasConfigContextsList200Response {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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


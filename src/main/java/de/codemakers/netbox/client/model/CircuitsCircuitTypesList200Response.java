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
import de.codemakers.netbox.client.model.CircuitType;
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
 * CircuitsCircuitTypesList200Response
 */
@JsonPropertyOrder({
  CircuitsCircuitTypesList200Response.JSON_PROPERTY_COUNT,
  CircuitsCircuitTypesList200Response.JSON_PROPERTY_NEXT,
  CircuitsCircuitTypesList200Response.JSON_PROPERTY_PREVIOUS,
  CircuitsCircuitTypesList200Response.JSON_PROPERTY_RESULTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class CircuitsCircuitTypesList200Response {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_NEXT = "next";
  private JsonNullable<URI> next = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private JsonNullable<URI> previous = JsonNullable.<URI>undefined();

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<CircuitType> results = new ArrayList<>();

  public CircuitsCircuitTypesList200Response() { 
  }

  public CircuitsCircuitTypesList200Response count(Integer count) {
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


  public CircuitsCircuitTypesList200Response next(URI next) {
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


  public CircuitsCircuitTypesList200Response previous(URI previous) {
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


  public CircuitsCircuitTypesList200Response results(List<CircuitType> results) {
    this.results = results;
    return this;
  }

  public CircuitsCircuitTypesList200Response addResultsItem(CircuitType resultsItem) {
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

  public List<CircuitType> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResults(List<CircuitType> results) {
    this.results = results;
  }


  /**
   * Return true if this circuits_circuit_types_list_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CircuitsCircuitTypesList200Response circuitsCircuitTypesList200Response = (CircuitsCircuitTypesList200Response) o;
    return Objects.equals(this.count, circuitsCircuitTypesList200Response.count) &&
        equalsNullable(this.next, circuitsCircuitTypesList200Response.next) &&
        equalsNullable(this.previous, circuitsCircuitTypesList200Response.previous) &&
        Objects.equals(this.results, circuitsCircuitTypesList200Response.results);
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
    sb.append("class CircuitsCircuitTypesList200Response {\n");
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


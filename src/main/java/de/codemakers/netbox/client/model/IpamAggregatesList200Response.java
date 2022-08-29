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
import java.net.URI;
import java.util.*;
import java.util.Map.Entry;

/**
 * IpamAggregatesList200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class IpamAggregatesList200Response {
    public static final String SERIALIZED_NAME_COUNT = "count";
    @SerializedName(SERIALIZED_NAME_COUNT)
    private Integer count;
    
    public static final String SERIALIZED_NAME_NEXT = "next";
    @SerializedName(SERIALIZED_NAME_NEXT)
    private URI next;
    
    public static final String SERIALIZED_NAME_PREVIOUS = "previous";
    @SerializedName(SERIALIZED_NAME_PREVIOUS)
    private URI previous;
    
    public static final String SERIALIZED_NAME_RESULTS = "results";
    @SerializedName(SERIALIZED_NAME_RESULTS)
    private List<Aggregate> results = new ArrayList<>();
    
    public IpamAggregatesList200Response() {
    }
    
    public IpamAggregatesList200Response count(Integer count) {
        
        this.count = count;
        return this;
    }
    
    /**
     * Get count
     *
     * @return count
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public Integer getCount() {
        return count;
    }
    
    
    public void setCount(Integer count) {
        this.count = count;
    }
    
    
    public IpamAggregatesList200Response next(URI next) {
        
        this.next = next;
        return this;
    }
    
    /**
     * Get next
     *
     * @return next
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public URI getNext() {
        return next;
    }
    
    
    public void setNext(URI next) {
        this.next = next;
    }
    
    
    public IpamAggregatesList200Response previous(URI previous) {
        
        this.previous = previous;
        return this;
    }
    
    /**
     * Get previous
     *
     * @return previous
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public URI getPrevious() {
        return previous;
    }
    
    
    public void setPrevious(URI previous) {
        this.previous = previous;
    }
    
    
    public IpamAggregatesList200Response results(List<Aggregate> results) {
        
        this.results = results;
        return this;
    }
    
    public IpamAggregatesList200Response addResultsItem(Aggregate resultsItem) {
        this.results.add(resultsItem);
        return this;
    }
    
    /**
     * Get results
     *
     * @return results
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public List<Aggregate> getResults() {
        return results;
    }
    
    
    public void setResults(List<Aggregate> results) {
        this.results = results;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IpamAggregatesList200Response ipamAggregatesList200Response = (IpamAggregatesList200Response) o;
        return Objects.equals(this.count, ipamAggregatesList200Response.count) && Objects.equals(this.next, ipamAggregatesList200Response.next) && Objects.equals(this.previous, ipamAggregatesList200Response.previous) && Objects.equals(this.results, ipamAggregatesList200Response.results);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(count, next, previous, results);
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
        sb.append("class IpamAggregatesList200Response {\n");
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
    
    
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;
    
    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("count");
        openapiFields.add("next");
        openapiFields.add("previous");
        openapiFields.add("results");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("count");
        openapiRequiredFields.add("results");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to IpamAggregatesList200Response
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (IpamAggregatesList200Response.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in IpamAggregatesList200Response is not found in the empty JSON string", IpamAggregatesList200Response.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!IpamAggregatesList200Response.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpamAggregatesList200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : IpamAggregatesList200Response.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
            }
        }
        if (jsonObj.get("next") != null && !jsonObj.get("next").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next")
                    .toString()));
        }
        if (jsonObj.get("previous") != null && !jsonObj.get("previous").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `previous` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous")
                    .toString()));
        }
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
            // ensure the json data is an array
            if (!jsonObj.get("results").isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results")
                        .toString()));
            }
            
            // validate the optional field `results` (array)
            for (int i = 0; i < jsonArrayresults.size(); i++) {
                Aggregate.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
            }
            ;
        }
    }
    
    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!IpamAggregatesList200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'IpamAggregatesList200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<IpamAggregatesList200Response> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(IpamAggregatesList200Response.class));
            
            return (TypeAdapter<T>) new TypeAdapter<IpamAggregatesList200Response>() {
                @Override
                public void write(JsonWriter out, IpamAggregatesList200Response value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public IpamAggregatesList200Response read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of IpamAggregatesList200Response given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of IpamAggregatesList200Response
     *
     * @throws IOException if the JSON string is invalid with respect to IpamAggregatesList200Response
     */
    public static IpamAggregatesList200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, IpamAggregatesList200Response.class);
    }
    
    /**
     * Convert an instance of IpamAggregatesList200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.codemakers.netbox.client.JSON;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * Family
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class Family {
    /**
     * Gets or Sets label
     */
    @JsonAdapter(LabelEnum.Adapter.class)
    public enum LabelEnum {
        IPV4("IPv4"),
        
        IPV6("IPv6"),
        
        UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");
        
        private String value;
        
        LabelEnum(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return String.valueOf(value);
        }
        
        public static LabelEnum fromValue(String value) {
            for (LabelEnum b : LabelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
        
        public static class Adapter extends TypeAdapter<LabelEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LabelEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }
            
            @Override
            public LabelEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LabelEnum.fromValue(value);
            }
        }
    }
    
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private LabelEnum label;
    
    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private Integer value;
    
    public Family() {
    }
    
    public Family label(LabelEnum label) {
        
        this.label = label;
        return this;
    }
    
    /**
     * Get label
     *
     * @return label
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public LabelEnum getLabel() {
        return label;
    }
    
    
    public void setLabel(LabelEnum label) {
        this.label = label;
    }
    
    
    public Family value(Integer value) {
        
        this.value = value;
        return this;
    }
    
    /**
     * Get value
     *
     * @return value
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public Integer getValue() {
        return value;
    }
    
    
    public void setValue(Integer value) {
        this.value = value;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Family family = (Family) o;
        return Objects.equals(this.label, family.label) && Objects.equals(this.value, family.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(label, value);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Family {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        openapiFields.add("label");
        openapiFields.add("value");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("label");
        openapiRequiredFields.add("value");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to Family
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (Family.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in Family is not found in the empty JSON string", Family.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Family.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Family` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Family.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
            }
        }
        if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label")
                    .toString()));
        }
    }
    
    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Family.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Family' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Family> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(Family.class));
            
            return (TypeAdapter<T>) new TypeAdapter<Family>() {
                @Override
                public void write(JsonWriter out, Family value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public Family read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of Family given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of Family
     *
     * @throws IOException if the JSON string is invalid with respect to Family
     */
    public static Family fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Family.class);
    }
    
    /**
     * Convert an instance of Family to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


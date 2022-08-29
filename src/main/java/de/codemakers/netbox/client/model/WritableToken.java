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
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Map.Entry;

/**
 * WritableToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritableToken {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_USER = "user";
    @SerializedName(SERIALIZED_NAME_USER)
    private Integer user;
    
    public static final String SERIALIZED_NAME_CREATED = "created";
    @SerializedName(SERIALIZED_NAME_CREATED)
    private OffsetDateTime created;
    
    public static final String SERIALIZED_NAME_EXPIRES = "expires";
    @SerializedName(SERIALIZED_NAME_EXPIRES)
    private OffsetDateTime expires;
    
    public static final String SERIALIZED_NAME_LAST_USED = "last_used";
    @SerializedName(SERIALIZED_NAME_LAST_USED)
    private OffsetDateTime lastUsed;
    
    public static final String SERIALIZED_NAME_KEY = "key";
    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;
    
    public static final String SERIALIZED_NAME_WRITE_ENABLED = "write_enabled";
    @SerializedName(SERIALIZED_NAME_WRITE_ENABLED)
    private Boolean writeEnabled;
    
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    
    public static final String SERIALIZED_NAME_ALLOWED_IPS = "allowed_ips";
    @SerializedName(SERIALIZED_NAME_ALLOWED_IPS)
    private List<Object> allowedIps = null;
    
    public WritableToken() {
    }
    
    
    public WritableToken(Integer id, URI url, String display, OffsetDateTime created) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.created = created;
    }
    
    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getId() {
        return id;
    }
    
    
    /**
     * Get url
     *
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public URI getUrl() {
        return url;
    }
    
    
    /**
     * Get display
     *
     * @return display
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getDisplay() {
        return display;
    }
    
    
    public WritableToken user(Integer user) {
        
        this.user = user;
        return this;
    }
    
    /**
     * Get user
     *
     * @return user
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public Integer getUser() {
        return user;
    }
    
    
    public void setUser(Integer user) {
        this.user = user;
    }
    
    
    /**
     * Get created
     *
     * @return created
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public OffsetDateTime getCreated() {
        return created;
    }
    
    
    public WritableToken expires(OffsetDateTime expires) {
        
        this.expires = expires;
        return this;
    }
    
    /**
     * Get expires
     *
     * @return expires
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public OffsetDateTime getExpires() {
        return expires;
    }
    
    
    public void setExpires(OffsetDateTime expires) {
        this.expires = expires;
    }
    
    
    public WritableToken lastUsed(OffsetDateTime lastUsed) {
        
        this.lastUsed = lastUsed;
        return this;
    }
    
    /**
     * Get lastUsed
     *
     * @return lastUsed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public OffsetDateTime getLastUsed() {
        return lastUsed;
    }
    
    
    public void setLastUsed(OffsetDateTime lastUsed) {
        this.lastUsed = lastUsed;
    }
    
    
    public WritableToken key(String key) {
        
        this.key = key;
        return this;
    }
    
    /**
     * Get key
     *
     * @return key
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getKey() {
        return key;
    }
    
    
    public void setKey(String key) {
        this.key = key;
    }
    
    
    public WritableToken writeEnabled(Boolean writeEnabled) {
        
        this.writeEnabled = writeEnabled;
        return this;
    }
    
    /**
     * Permit create/update/delete operations using this key
     *
     * @return writeEnabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Permit create/update/delete operations using this key")
    
    public Boolean getWriteEnabled() {
        return writeEnabled;
    }
    
    
    public void setWriteEnabled(Boolean writeEnabled) {
        this.writeEnabled = writeEnabled;
    }
    
    
    public WritableToken description(String description) {
        
        this.description = description;
        return this;
    }
    
    /**
     * Get description
     *
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getDescription() {
        return description;
    }
    
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public WritableToken allowedIps(List<Object> allowedIps) {
        
        this.allowedIps = allowedIps;
        return this;
    }
    
    public WritableToken addAllowedIpsItem(Object allowedIpsItem) {
        if (this.allowedIps == null) {
            this.allowedIps = new ArrayList<>();
        }
        this.allowedIps.add(allowedIpsItem);
        return this;
    }
    
    /**
     * Get allowedIps
     *
     * @return allowedIps
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public List<Object> getAllowedIps() {
        return allowedIps;
    }
    
    
    public void setAllowedIps(List<Object> allowedIps) {
        this.allowedIps = allowedIps;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WritableToken writableToken = (WritableToken) o;
        return Objects.equals(this.id, writableToken.id) && Objects.equals(this.url, writableToken.url) && Objects.equals(this.display, writableToken.display) && Objects.equals(this.user, writableToken.user) && Objects.equals(this.created, writableToken.created) && Objects.equals(this.expires, writableToken.expires) && Objects.equals(this.lastUsed, writableToken.lastUsed) && Objects.equals(this.key, writableToken.key) && Objects.equals(this.writeEnabled, writableToken.writeEnabled) && Objects.equals(this.description, writableToken.description) && Objects.equals(this.allowedIps, writableToken.allowedIps);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, user, created, expires, lastUsed, key, writeEnabled, description, allowedIps);
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
        sb.append("class WritableToken {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
        sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    writeEnabled: ").append(toIndentedString(writeEnabled)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    allowedIps: ").append(toIndentedString(allowedIps)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("url");
        openapiFields.add("display");
        openapiFields.add("user");
        openapiFields.add("created");
        openapiFields.add("expires");
        openapiFields.add("last_used");
        openapiFields.add("key");
        openapiFields.add("write_enabled");
        openapiFields.add("description");
        openapiFields.add("allowed_ips");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("user");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to WritableToken
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (WritableToken.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in WritableToken is not found in the empty JSON string", WritableToken.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!WritableToken.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritableToken` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WritableToken.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
            }
        }
        if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url")
                    .toString()));
        }
        if (jsonObj.get("display") != null && !jsonObj.get("display").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display")
                    .toString()));
        }
        if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key")
                    .toString()));
        }
        if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("allowed_ips") != null && !jsonObj.get("allowed_ips").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allowed_ips` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_ips")
                    .toString()));
        }
    }
    
    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WritableToken.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WritableToken' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WritableToken> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(WritableToken.class));
            
            return (TypeAdapter<T>) new TypeAdapter<WritableToken>() {
                @Override
                public void write(JsonWriter out, WritableToken value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public WritableToken read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of WritableToken given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of WritableToken
     *
     * @throws IOException if the JSON string is invalid with respect to WritableToken
     */
    public static WritableToken fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WritableToken.class);
    }
    
    /**
     * Convert an instance of WritableToken to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


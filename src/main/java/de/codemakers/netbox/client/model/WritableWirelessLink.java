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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.codemakers.netbox.client.model.NestedTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.codemakers.netbox.client.JSON;

/**
 * WritableWirelessLink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritableWirelessLink {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_INTERFACE_A = "interface_a";
  @SerializedName(SERIALIZED_NAME_INTERFACE_A)
  private Integer interfaceA;

  public static final String SERIALIZED_NAME_INTERFACE_B = "interface_b";
  @SerializedName(SERIALIZED_NAME_INTERFACE_B)
  private Integer interfaceB;

  public static final String SERIALIZED_NAME_SSID = "ssid";
  @SerializedName(SERIALIZED_NAME_SSID)
  private String ssid;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CONNECTED("connected"),
    
    PLANNED("planned"),
    
    DECOMMISSIONING("decommissioning"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private Integer tenant;

  /**
   * Gets or Sets authType
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    OPEN("open"),
    
    WEP("wep"),
    
    WPA_PERSONAL("wpa-personal"),
    
    WPA_ENTERPRISE("wpa-enterprise"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private AuthTypeEnum authType;

  /**
   * Gets or Sets authCipher
   */
  @JsonAdapter(AuthCipherEnum.Adapter.class)
  public enum AuthCipherEnum {
    AUTO("auto"),
    
    TKIP("tkip"),
    
    AES("aes"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    AuthCipherEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthCipherEnum fromValue(String value) {
      for (AuthCipherEnum b : AuthCipherEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AuthCipherEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthCipherEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthCipherEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthCipherEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTH_CIPHER = "auth_cipher";
  @SerializedName(SERIALIZED_NAME_AUTH_CIPHER)
  private AuthCipherEnum authCipher;

  public static final String SERIALIZED_NAME_AUTH_PSK = "auth_psk";
  @SerializedName(SERIALIZED_NAME_AUTH_PSK)
  private String authPsk;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<NestedTag> tags = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Object customFields;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public WritableWirelessLink() { 
  }

  
  public WritableWirelessLink(
     Integer id, 
     URI url, 
     String display, 
     OffsetDateTime created, 
     OffsetDateTime lastUpdated
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

  public Integer getId() {
    return id;
  }




   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getUrl() {
    return url;
  }




   /**
   * Get display
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplay() {
    return display;
  }




  public WritableWirelessLink interfaceA(Integer interfaceA) {
    
    this.interfaceA = interfaceA;
    return this;
  }

   /**
   * Get interfaceA
   * @return interfaceA
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getInterfaceA() {
    return interfaceA;
  }


  public void setInterfaceA(Integer interfaceA) {
    this.interfaceA = interfaceA;
  }


  public WritableWirelessLink interfaceB(Integer interfaceB) {
    
    this.interfaceB = interfaceB;
    return this;
  }

   /**
   * Get interfaceB
   * @return interfaceB
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getInterfaceB() {
    return interfaceB;
  }


  public void setInterfaceB(Integer interfaceB) {
    this.interfaceB = interfaceB;
  }


  public WritableWirelessLink ssid(String ssid) {
    
    this.ssid = ssid;
    return this;
  }

   /**
   * Get ssid
   * @return ssid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSsid() {
    return ssid;
  }


  public void setSsid(String ssid) {
    this.ssid = ssid;
  }


  public WritableWirelessLink status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WritableWirelessLink tenant(Integer tenant) {
    
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTenant() {
    return tenant;
  }


  public void setTenant(Integer tenant) {
    this.tenant = tenant;
  }


  public WritableWirelessLink authType(AuthTypeEnum authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthTypeEnum getAuthType() {
    return authType;
  }


  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }


  public WritableWirelessLink authCipher(AuthCipherEnum authCipher) {
    
    this.authCipher = authCipher;
    return this;
  }

   /**
   * Get authCipher
   * @return authCipher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthCipherEnum getAuthCipher() {
    return authCipher;
  }


  public void setAuthCipher(AuthCipherEnum authCipher) {
    this.authCipher = authCipher;
  }


  public WritableWirelessLink authPsk(String authPsk) {
    
    this.authPsk = authPsk;
    return this;
  }

   /**
   * Get authPsk
   * @return authPsk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthPsk() {
    return authPsk;
  }


  public void setAuthPsk(String authPsk) {
    this.authPsk = authPsk;
  }


  public WritableWirelessLink description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
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


  public WritableWirelessLink tags(List<NestedTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public WritableWirelessLink addTagsItem(NestedTag tagsItem) {
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

  public List<NestedTag> getTags() {
    return tags;
  }


  public void setTags(List<NestedTag> tags) {
    this.tags = tags;
  }


  public WritableWirelessLink customFields(Object customFields) {
    
    this.customFields = customFields;
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }


   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableWirelessLink writableWirelessLink = (WritableWirelessLink) o;
    return Objects.equals(this.id, writableWirelessLink.id) &&
        Objects.equals(this.url, writableWirelessLink.url) &&
        Objects.equals(this.display, writableWirelessLink.display) &&
        Objects.equals(this.interfaceA, writableWirelessLink.interfaceA) &&
        Objects.equals(this.interfaceB, writableWirelessLink.interfaceB) &&
        Objects.equals(this.ssid, writableWirelessLink.ssid) &&
        Objects.equals(this.status, writableWirelessLink.status) &&
        Objects.equals(this.tenant, writableWirelessLink.tenant) &&
        Objects.equals(this.authType, writableWirelessLink.authType) &&
        Objects.equals(this.authCipher, writableWirelessLink.authCipher) &&
        Objects.equals(this.authPsk, writableWirelessLink.authPsk) &&
        Objects.equals(this.description, writableWirelessLink.description) &&
        Objects.equals(this.tags, writableWirelessLink.tags) &&
        Objects.equals(this.customFields, writableWirelessLink.customFields) &&
        Objects.equals(this.created, writableWirelessLink.created) &&
        Objects.equals(this.lastUpdated, writableWirelessLink.lastUpdated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, interfaceA, interfaceB, ssid, status, tenant, authType, authCipher, authPsk, description, tags, customFields, created, lastUpdated);
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
    sb.append("class WritableWirelessLink {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    interfaceA: ").append(toIndentedString(interfaceA)).append("\n");
    sb.append("    interfaceB: ").append(toIndentedString(interfaceB)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authCipher: ").append(toIndentedString(authCipher)).append("\n");
    sb.append("    authPsk: ").append(toIndentedString(authPsk)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("url");
    openapiFields.add("display");
    openapiFields.add("interface_a");
    openapiFields.add("interface_b");
    openapiFields.add("ssid");
    openapiFields.add("status");
    openapiFields.add("tenant");
    openapiFields.add("auth_type");
    openapiFields.add("auth_cipher");
    openapiFields.add("auth_psk");
    openapiFields.add("description");
    openapiFields.add("tags");
    openapiFields.add("custom_fields");
    openapiFields.add("created");
    openapiFields.add("last_updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("interface_a");
    openapiRequiredFields.add("interface_b");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WritableWirelessLink
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WritableWirelessLink.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WritableWirelessLink is not found in the empty JSON string", WritableWirelessLink.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WritableWirelessLink.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritableWirelessLink` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WritableWirelessLink.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (jsonObj.get("display") != null && !jsonObj.get("display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display").toString()));
      }
      if (jsonObj.get("ssid") != null && !jsonObj.get("ssid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssid").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("auth_type") != null && !jsonObj.get("auth_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_type").toString()));
      }
      if (jsonObj.get("auth_cipher") != null && !jsonObj.get("auth_cipher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_cipher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_cipher").toString()));
      }
      if (jsonObj.get("auth_psk") != null && !jsonObj.get("auth_psk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_psk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_psk").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
      if (jsonArraytags != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tags").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
        }

        // validate the optional field `tags` (array)
        for (int i = 0; i < jsonArraytags.size(); i++) {
          NestedTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WritableWirelessLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WritableWirelessLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WritableWirelessLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WritableWirelessLink.class));

       return (TypeAdapter<T>) new TypeAdapter<WritableWirelessLink>() {
           @Override
           public void write(JsonWriter out, WritableWirelessLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WritableWirelessLink read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WritableWirelessLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WritableWirelessLink
  * @throws IOException if the JSON string is invalid with respect to WritableWirelessLink
  */
  public static WritableWirelessLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WritableWirelessLink.class);
  }

 /**
  * Convert an instance of WritableWirelessLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import de.codemakers.netbox.client.model.NestedDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

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
 * NestedVirtualChassis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class NestedVirtualChassis {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MASTER = "master";
  @SerializedName(SERIALIZED_NAME_MASTER)
  private NestedDevice master;

  public static final String SERIALIZED_NAME_MEMBER_COUNT = "member_count";
  @SerializedName(SERIALIZED_NAME_MEMBER_COUNT)
  private Integer memberCount;

  public NestedVirtualChassis() { 
  }

  
  public NestedVirtualChassis(
     Integer id, 
     URI url, 
     String display, 
     Integer memberCount
  ) {
    this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.memberCount = memberCount;
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




  public NestedVirtualChassis name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NestedVirtualChassis master(NestedDevice master) {
    
    this.master = master;
    return this;
  }

   /**
   * Get master
   * @return master
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedDevice getMaster() {
    return master;
  }


  public void setMaster(NestedDevice master) {
    this.master = master;
  }


   /**
   * Get memberCount
   * @return memberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemberCount() {
    return memberCount;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVirtualChassis nestedVirtualChassis = (NestedVirtualChassis) o;
    return Objects.equals(this.id, nestedVirtualChassis.id) &&
        Objects.equals(this.url, nestedVirtualChassis.url) &&
        Objects.equals(this.display, nestedVirtualChassis.display) &&
        Objects.equals(this.name, nestedVirtualChassis.name) &&
        Objects.equals(this.master, nestedVirtualChassis.master) &&
        Objects.equals(this.memberCount, nestedVirtualChassis.memberCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, name, master, memberCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedVirtualChassis {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    master: ").append(toIndentedString(master)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("master");
    openapiFields.add("member_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("master");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NestedVirtualChassis
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NestedVirtualChassis.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NestedVirtualChassis is not found in the empty JSON string", NestedVirtualChassis.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NestedVirtualChassis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NestedVirtualChassis` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NestedVirtualChassis.openapiRequiredFields) {
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
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `master`
      if (jsonObj.getAsJsonObject("master") != null) {
        NestedDevice.validateJsonObject(jsonObj.getAsJsonObject("master"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NestedVirtualChassis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NestedVirtualChassis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NestedVirtualChassis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NestedVirtualChassis.class));

       return (TypeAdapter<T>) new TypeAdapter<NestedVirtualChassis>() {
           @Override
           public void write(JsonWriter out, NestedVirtualChassis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NestedVirtualChassis read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NestedVirtualChassis given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NestedVirtualChassis
  * @throws IOException if the JSON string is invalid with respect to NestedVirtualChassis
  */
  public static NestedVirtualChassis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NestedVirtualChassis.class);
  }

 /**
  * Convert an instance of NestedVirtualChassis to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import de.codemakers.netbox.client.model.NestedDeviceType;
import de.codemakers.netbox.client.model.NestedModuleType;
import de.codemakers.netbox.client.model.Type5;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
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
 * PowerPortTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class PowerPortTemplate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private NestedDeviceType deviceType;

  public static final String SERIALIZED_NAME_MODULE_TYPE = "module_type";
  @SerializedName(SERIALIZED_NAME_MODULE_TYPE)
  private NestedModuleType moduleType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Type5 type;

  public static final String SERIALIZED_NAME_MAXIMUM_DRAW = "maximum_draw";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_DRAW)
  private Integer maximumDraw;

  public static final String SERIALIZED_NAME_ALLOCATED_DRAW = "allocated_draw";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_DRAW)
  private Integer allocatedDraw;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public PowerPortTemplate() { 
  }

  
  public PowerPortTemplate(
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




  public PowerPortTemplate deviceType(NestedDeviceType deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedDeviceType getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(NestedDeviceType deviceType) {
    this.deviceType = deviceType;
  }


  public PowerPortTemplate moduleType(NestedModuleType moduleType) {
    
    this.moduleType = moduleType;
    return this;
  }

   /**
   * Get moduleType
   * @return moduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedModuleType getModuleType() {
    return moduleType;
  }


  public void setModuleType(NestedModuleType moduleType) {
    this.moduleType = moduleType;
  }


  public PowerPortTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   *  {module} is accepted as a substitution for the module bay position when attached to a module type. 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " {module} is accepted as a substitution for the module bay position when attached to a module type. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PowerPortTemplate label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Physical label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Physical label")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public PowerPortTemplate type(Type5 type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Type5 getType() {
    return type;
  }


  public void setType(Type5 type) {
    this.type = type;
  }


  public PowerPortTemplate maximumDraw(Integer maximumDraw) {
    
    this.maximumDraw = maximumDraw;
    return this;
  }

   /**
   * Maximum power draw (watts)
   * minimum: 1
   * maximum: 32767
   * @return maximumDraw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum power draw (watts)")

  public Integer getMaximumDraw() {
    return maximumDraw;
  }


  public void setMaximumDraw(Integer maximumDraw) {
    this.maximumDraw = maximumDraw;
  }


  public PowerPortTemplate allocatedDraw(Integer allocatedDraw) {
    
    this.allocatedDraw = allocatedDraw;
    return this;
  }

   /**
   * Allocated power draw (watts)
   * minimum: 1
   * maximum: 32767
   * @return allocatedDraw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allocated power draw (watts)")

  public Integer getAllocatedDraw() {
    return allocatedDraw;
  }


  public void setAllocatedDraw(Integer allocatedDraw) {
    this.allocatedDraw = allocatedDraw;
  }


  public PowerPortTemplate description(String description) {
    
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
    PowerPortTemplate powerPortTemplate = (PowerPortTemplate) o;
    return Objects.equals(this.id, powerPortTemplate.id) &&
        Objects.equals(this.url, powerPortTemplate.url) &&
        Objects.equals(this.display, powerPortTemplate.display) &&
        Objects.equals(this.deviceType, powerPortTemplate.deviceType) &&
        Objects.equals(this.moduleType, powerPortTemplate.moduleType) &&
        Objects.equals(this.name, powerPortTemplate.name) &&
        Objects.equals(this.label, powerPortTemplate.label) &&
        Objects.equals(this.type, powerPortTemplate.type) &&
        Objects.equals(this.maximumDraw, powerPortTemplate.maximumDraw) &&
        Objects.equals(this.allocatedDraw, powerPortTemplate.allocatedDraw) &&
        Objects.equals(this.description, powerPortTemplate.description) &&
        Objects.equals(this.created, powerPortTemplate.created) &&
        Objects.equals(this.lastUpdated, powerPortTemplate.lastUpdated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, deviceType, moduleType, name, label, type, maximumDraw, allocatedDraw, description, created, lastUpdated);
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
    sb.append("class PowerPortTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    maximumDraw: ").append(toIndentedString(maximumDraw)).append("\n");
    sb.append("    allocatedDraw: ").append(toIndentedString(allocatedDraw)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("device_type");
    openapiFields.add("module_type");
    openapiFields.add("name");
    openapiFields.add("label");
    openapiFields.add("type");
    openapiFields.add("maximum_draw");
    openapiFields.add("allocated_draw");
    openapiFields.add("description");
    openapiFields.add("created");
    openapiFields.add("last_updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PowerPortTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PowerPortTemplate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PowerPortTemplate is not found in the empty JSON string", PowerPortTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PowerPortTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PowerPortTemplate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PowerPortTemplate.openapiRequiredFields) {
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
      // validate the optional field `device_type`
      if (jsonObj.getAsJsonObject("device_type") != null) {
        NestedDeviceType.validateJsonObject(jsonObj.getAsJsonObject("device_type"));
      }
      // validate the optional field `module_type`
      if (jsonObj.getAsJsonObject("module_type") != null) {
        NestedModuleType.validateJsonObject(jsonObj.getAsJsonObject("module_type"));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.getAsJsonObject("type") != null) {
        Type5.validateJsonObject(jsonObj.getAsJsonObject("type"));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PowerPortTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PowerPortTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PowerPortTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PowerPortTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<PowerPortTemplate>() {
           @Override
           public void write(JsonWriter out, PowerPortTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PowerPortTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PowerPortTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PowerPortTemplate
  * @throws IOException if the JSON string is invalid with respect to PowerPortTemplate
  */
  public static PowerPortTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PowerPortTemplate.class);
  }

 /**
  * Convert an instance of PowerPortTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


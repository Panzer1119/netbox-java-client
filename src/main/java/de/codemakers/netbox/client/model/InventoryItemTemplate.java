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
import de.codemakers.netbox.client.model.NestedInventoryItemRole;
import de.codemakers.netbox.client.model.NestedManufacturer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * InventoryItemTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class InventoryItemTemplate {
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

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private Integer parent;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private NestedInventoryItemRole role;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private NestedManufacturer manufacturer;

  public static final String SERIALIZED_NAME_PART_ID = "part_id";
  @SerializedName(SERIALIZED_NAME_PART_ID)
  private String partId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "component_type";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private String componentType;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Integer componentId;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private Map<String, String> component = null;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_DEPTH = "_depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public InventoryItemTemplate() { 
  }

  
  public InventoryItemTemplate(
     Integer id, 
     URI url, 
     String display, 
     Map<String, String> component, 
     OffsetDateTime created, 
     OffsetDateTime lastUpdated, 
     Integer depth
  ) {
    this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.component = component;
    this.created = created;
    this.lastUpdated = lastUpdated;
    this.depth = depth;
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




  public InventoryItemTemplate deviceType(NestedDeviceType deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedDeviceType getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(NestedDeviceType deviceType) {
    this.deviceType = deviceType;
  }


  public InventoryItemTemplate parent(Integer parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getParent() {
    return parent;
  }


  public void setParent(Integer parent) {
    this.parent = parent;
  }


  public InventoryItemTemplate name(String name) {
    
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


  public InventoryItemTemplate label(String label) {
    
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


  public InventoryItemTemplate role(NestedInventoryItemRole role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedInventoryItemRole getRole() {
    return role;
  }


  public void setRole(NestedInventoryItemRole role) {
    this.role = role;
  }


  public InventoryItemTemplate manufacturer(NestedManufacturer manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedManufacturer getManufacturer() {
    return manufacturer;
  }


  public void setManufacturer(NestedManufacturer manufacturer) {
    this.manufacturer = manufacturer;
  }


  public InventoryItemTemplate partId(String partId) {
    
    this.partId = partId;
    return this;
  }

   /**
   * Manufacturer-assigned part identifier
   * @return partId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manufacturer-assigned part identifier")

  public String getPartId() {
    return partId;
  }


  public void setPartId(String partId) {
    this.partId = partId;
  }


  public InventoryItemTemplate description(String description) {
    
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


  public InventoryItemTemplate componentType(String componentType) {
    
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComponentType() {
    return componentType;
  }


  public void setComponentType(String componentType) {
    this.componentType = componentType;
  }


  public InventoryItemTemplate componentId(Integer componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * Get componentId
   * minimum: 0
   * maximum: 9223372036854775807
   * @return componentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getComponentId() {
    return componentId;
  }


  public void setComponentId(Integer componentId) {
    this.componentId = componentId;
  }


   /**
   * Get component
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getComponent() {
    return component;
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




   /**
   * Get depth
   * @return depth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDepth() {
    return depth;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryItemTemplate inventoryItemTemplate = (InventoryItemTemplate) o;
    return Objects.equals(this.id, inventoryItemTemplate.id) &&
        Objects.equals(this.url, inventoryItemTemplate.url) &&
        Objects.equals(this.display, inventoryItemTemplate.display) &&
        Objects.equals(this.deviceType, inventoryItemTemplate.deviceType) &&
        Objects.equals(this.parent, inventoryItemTemplate.parent) &&
        Objects.equals(this.name, inventoryItemTemplate.name) &&
        Objects.equals(this.label, inventoryItemTemplate.label) &&
        Objects.equals(this.role, inventoryItemTemplate.role) &&
        Objects.equals(this.manufacturer, inventoryItemTemplate.manufacturer) &&
        Objects.equals(this.partId, inventoryItemTemplate.partId) &&
        Objects.equals(this.description, inventoryItemTemplate.description) &&
        Objects.equals(this.componentType, inventoryItemTemplate.componentType) &&
        Objects.equals(this.componentId, inventoryItemTemplate.componentId) &&
        Objects.equals(this.component, inventoryItemTemplate.component) &&
        Objects.equals(this.created, inventoryItemTemplate.created) &&
        Objects.equals(this.lastUpdated, inventoryItemTemplate.lastUpdated) &&
        Objects.equals(this.depth, inventoryItemTemplate.depth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, deviceType, parent, name, label, role, manufacturer, partId, description, componentType, componentId, component, created, lastUpdated, depth);
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
    sb.append("class InventoryItemTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    partId: ").append(toIndentedString(partId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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
    openapiFields.add("parent");
    openapiFields.add("name");
    openapiFields.add("label");
    openapiFields.add("role");
    openapiFields.add("manufacturer");
    openapiFields.add("part_id");
    openapiFields.add("description");
    openapiFields.add("component_type");
    openapiFields.add("component_id");
    openapiFields.add("component");
    openapiFields.add("created");
    openapiFields.add("last_updated");
    openapiFields.add("_depth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device_type");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InventoryItemTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InventoryItemTemplate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InventoryItemTemplate is not found in the empty JSON string", InventoryItemTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InventoryItemTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InventoryItemTemplate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InventoryItemTemplate.openapiRequiredFields) {
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
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // validate the optional field `role`
      if (jsonObj.getAsJsonObject("role") != null) {
        NestedInventoryItemRole.validateJsonObject(jsonObj.getAsJsonObject("role"));
      }
      // validate the optional field `manufacturer`
      if (jsonObj.getAsJsonObject("manufacturer") != null) {
        NestedManufacturer.validateJsonObject(jsonObj.getAsJsonObject("manufacturer"));
      }
      if (jsonObj.get("part_id") != null && !jsonObj.get("part_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part_id").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("component_type") != null && !jsonObj.get("component_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InventoryItemTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InventoryItemTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InventoryItemTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InventoryItemTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<InventoryItemTemplate>() {
           @Override
           public void write(JsonWriter out, InventoryItemTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InventoryItemTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InventoryItemTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InventoryItemTemplate
  * @throws IOException if the JSON string is invalid with respect to InventoryItemTemplate
  */
  public static InventoryItemTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InventoryItemTemplate.class);
  }

 /**
  * Convert an instance of InventoryItemTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


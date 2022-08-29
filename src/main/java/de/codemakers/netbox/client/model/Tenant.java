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
import de.codemakers.netbox.client.model.NestedTenantGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * Tenant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class Tenant {
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

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private NestedTenantGroup group;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

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

  public static final String SERIALIZED_NAME_CIRCUIT_COUNT = "circuit_count";
  @SerializedName(SERIALIZED_NAME_CIRCUIT_COUNT)
  private Integer circuitCount;

  public static final String SERIALIZED_NAME_DEVICE_COUNT = "device_count";
  @SerializedName(SERIALIZED_NAME_DEVICE_COUNT)
  private Integer deviceCount;

  public static final String SERIALIZED_NAME_IPADDRESS_COUNT = "ipaddress_count";
  @SerializedName(SERIALIZED_NAME_IPADDRESS_COUNT)
  private Integer ipaddressCount;

  public static final String SERIALIZED_NAME_PREFIX_COUNT = "prefix_count";
  @SerializedName(SERIALIZED_NAME_PREFIX_COUNT)
  private Integer prefixCount;

  public static final String SERIALIZED_NAME_RACK_COUNT = "rack_count";
  @SerializedName(SERIALIZED_NAME_RACK_COUNT)
  private Integer rackCount;

  public static final String SERIALIZED_NAME_SITE_COUNT = "site_count";
  @SerializedName(SERIALIZED_NAME_SITE_COUNT)
  private Integer siteCount;

  public static final String SERIALIZED_NAME_VIRTUALMACHINE_COUNT = "virtualmachine_count";
  @SerializedName(SERIALIZED_NAME_VIRTUALMACHINE_COUNT)
  private Integer virtualmachineCount;

  public static final String SERIALIZED_NAME_VLAN_COUNT = "vlan_count";
  @SerializedName(SERIALIZED_NAME_VLAN_COUNT)
  private Integer vlanCount;

  public static final String SERIALIZED_NAME_VRF_COUNT = "vrf_count";
  @SerializedName(SERIALIZED_NAME_VRF_COUNT)
  private Integer vrfCount;

  public static final String SERIALIZED_NAME_CLUSTER_COUNT = "cluster_count";
  @SerializedName(SERIALIZED_NAME_CLUSTER_COUNT)
  private Integer clusterCount;

  public Tenant() { 
  }

  
  public Tenant(
     Integer id, 
     URI url, 
     String display, 
     OffsetDateTime created, 
     OffsetDateTime lastUpdated, 
     Integer circuitCount, 
     Integer deviceCount, 
     Integer ipaddressCount, 
     Integer prefixCount, 
     Integer rackCount, 
     Integer siteCount, 
     Integer virtualmachineCount, 
     Integer vlanCount, 
     Integer vrfCount, 
     Integer clusterCount
  ) {
    this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.created = created;
    this.lastUpdated = lastUpdated;
    this.circuitCount = circuitCount;
    this.deviceCount = deviceCount;
    this.ipaddressCount = ipaddressCount;
    this.prefixCount = prefixCount;
    this.rackCount = rackCount;
    this.siteCount = siteCount;
    this.virtualmachineCount = virtualmachineCount;
    this.vlanCount = vlanCount;
    this.vrfCount = vrfCount;
    this.clusterCount = clusterCount;
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




  public Tenant name(String name) {
    
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


  public Tenant slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public Tenant group(NestedTenantGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedTenantGroup getGroup() {
    return group;
  }


  public void setGroup(NestedTenantGroup group) {
    this.group = group;
  }


  public Tenant description(String description) {
    
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


  public Tenant comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public Tenant tags(List<NestedTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Tenant addTagsItem(NestedTag tagsItem) {
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


  public Tenant customFields(Object customFields) {
    
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




   /**
   * Get circuitCount
   * @return circuitCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCircuitCount() {
    return circuitCount;
  }




   /**
   * Get deviceCount
   * @return deviceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDeviceCount() {
    return deviceCount;
  }




   /**
   * Get ipaddressCount
   * @return ipaddressCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIpaddressCount() {
    return ipaddressCount;
  }




   /**
   * Get prefixCount
   * @return prefixCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPrefixCount() {
    return prefixCount;
  }




   /**
   * Get rackCount
   * @return rackCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRackCount() {
    return rackCount;
  }




   /**
   * Get siteCount
   * @return siteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSiteCount() {
    return siteCount;
  }




   /**
   * Get virtualmachineCount
   * @return virtualmachineCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVirtualmachineCount() {
    return virtualmachineCount;
  }




   /**
   * Get vlanCount
   * @return vlanCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVlanCount() {
    return vlanCount;
  }




   /**
   * Get vrfCount
   * @return vrfCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVrfCount() {
    return vrfCount;
  }




   /**
   * Get clusterCount
   * @return clusterCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterCount() {
    return clusterCount;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tenant tenant = (Tenant) o;
    return Objects.equals(this.id, tenant.id) &&
        Objects.equals(this.url, tenant.url) &&
        Objects.equals(this.display, tenant.display) &&
        Objects.equals(this.name, tenant.name) &&
        Objects.equals(this.slug, tenant.slug) &&
        Objects.equals(this.group, tenant.group) &&
        Objects.equals(this.description, tenant.description) &&
        Objects.equals(this.comments, tenant.comments) &&
        Objects.equals(this.tags, tenant.tags) &&
        Objects.equals(this.customFields, tenant.customFields) &&
        Objects.equals(this.created, tenant.created) &&
        Objects.equals(this.lastUpdated, tenant.lastUpdated) &&
        Objects.equals(this.circuitCount, tenant.circuitCount) &&
        Objects.equals(this.deviceCount, tenant.deviceCount) &&
        Objects.equals(this.ipaddressCount, tenant.ipaddressCount) &&
        Objects.equals(this.prefixCount, tenant.prefixCount) &&
        Objects.equals(this.rackCount, tenant.rackCount) &&
        Objects.equals(this.siteCount, tenant.siteCount) &&
        Objects.equals(this.virtualmachineCount, tenant.virtualmachineCount) &&
        Objects.equals(this.vlanCount, tenant.vlanCount) &&
        Objects.equals(this.vrfCount, tenant.vrfCount) &&
        Objects.equals(this.clusterCount, tenant.clusterCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, name, slug, group, description, comments, tags, customFields, created, lastUpdated, circuitCount, deviceCount, ipaddressCount, prefixCount, rackCount, siteCount, virtualmachineCount, vlanCount, vrfCount, clusterCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tenant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    circuitCount: ").append(toIndentedString(circuitCount)).append("\n");
    sb.append("    deviceCount: ").append(toIndentedString(deviceCount)).append("\n");
    sb.append("    ipaddressCount: ").append(toIndentedString(ipaddressCount)).append("\n");
    sb.append("    prefixCount: ").append(toIndentedString(prefixCount)).append("\n");
    sb.append("    rackCount: ").append(toIndentedString(rackCount)).append("\n");
    sb.append("    siteCount: ").append(toIndentedString(siteCount)).append("\n");
    sb.append("    virtualmachineCount: ").append(toIndentedString(virtualmachineCount)).append("\n");
    sb.append("    vlanCount: ").append(toIndentedString(vlanCount)).append("\n");
    sb.append("    vrfCount: ").append(toIndentedString(vrfCount)).append("\n");
    sb.append("    clusterCount: ").append(toIndentedString(clusterCount)).append("\n");
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
    openapiFields.add("slug");
    openapiFields.add("group");
    openapiFields.add("description");
    openapiFields.add("comments");
    openapiFields.add("tags");
    openapiFields.add("custom_fields");
    openapiFields.add("created");
    openapiFields.add("last_updated");
    openapiFields.add("circuit_count");
    openapiFields.add("device_count");
    openapiFields.add("ipaddress_count");
    openapiFields.add("prefix_count");
    openapiFields.add("rack_count");
    openapiFields.add("site_count");
    openapiFields.add("virtualmachine_count");
    openapiFields.add("vlan_count");
    openapiFields.add("vrf_count");
    openapiFields.add("cluster_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("slug");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Tenant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Tenant.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tenant is not found in the empty JSON string", Tenant.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Tenant.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Tenant` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Tenant.openapiRequiredFields) {
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
      if (jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      // validate the optional field `group`
      if (jsonObj.getAsJsonObject("group") != null) {
        NestedTenantGroup.validateJsonObject(jsonObj.getAsJsonObject("group"));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
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
       if (!Tenant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tenant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tenant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tenant.class));

       return (TypeAdapter<T>) new TypeAdapter<Tenant>() {
           @Override
           public void write(JsonWriter out, Tenant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Tenant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Tenant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tenant
  * @throws IOException if the JSON string is invalid with respect to Tenant
  */
  public static Tenant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tenant.class);
  }

 /**
  * Convert an instance of Tenant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


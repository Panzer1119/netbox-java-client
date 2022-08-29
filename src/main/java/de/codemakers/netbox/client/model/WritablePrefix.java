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
 * WritablePrefix
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritablePrefix {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_FAMILY = "family";
  @SerializedName(SERIALIZED_NAME_FAMILY)
  private String family;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SITE = "site";
  @SerializedName(SERIALIZED_NAME_SITE)
  private Integer site;

  public static final String SERIALIZED_NAME_VRF = "vrf";
  @SerializedName(SERIALIZED_NAME_VRF)
  private Integer vrf;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private Integer tenant;

  public static final String SERIALIZED_NAME_VLAN = "vlan";
  @SerializedName(SERIALIZED_NAME_VLAN)
  private Integer vlan;

  /**
   * Operational status of this prefix
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CONTAINER("container"),
    
    ACTIVE("active"),
    
    RESERVED("reserved"),
    
    DEPRECATED("deprecated"),
    
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

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private Integer role;

  public static final String SERIALIZED_NAME_IS_POOL = "is_pool";
  @SerializedName(SERIALIZED_NAME_IS_POOL)
  private Boolean isPool;

  public static final String SERIALIZED_NAME_MARK_UTILIZED = "mark_utilized";
  @SerializedName(SERIALIZED_NAME_MARK_UTILIZED)
  private Boolean markUtilized;

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

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private Integer children;

  public static final String SERIALIZED_NAME_DEPTH = "_depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Integer depth;

  public WritablePrefix() { 
  }

  
  public WritablePrefix(
     Integer id, 
     URI url, 
     String display, 
     String family, 
     OffsetDateTime created, 
     OffsetDateTime lastUpdated, 
     Integer children, 
     Integer depth
  ) {
    this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.family = family;
    this.created = created;
    this.lastUpdated = lastUpdated;
    this.children = children;
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




   /**
   * Get family
   * @return family
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFamily() {
    return family;
  }




  public WritablePrefix prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * IPv4 or IPv6 network with mask
   * @return prefix
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IPv4 or IPv6 network with mask")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public WritablePrefix site(Integer site) {
    
    this.site = site;
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSite() {
    return site;
  }


  public void setSite(Integer site) {
    this.site = site;
  }


  public WritablePrefix vrf(Integer vrf) {
    
    this.vrf = vrf;
    return this;
  }

   /**
   * Get vrf
   * @return vrf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVrf() {
    return vrf;
  }


  public void setVrf(Integer vrf) {
    this.vrf = vrf;
  }


  public WritablePrefix tenant(Integer tenant) {
    
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


  public WritablePrefix vlan(Integer vlan) {
    
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVlan() {
    return vlan;
  }


  public void setVlan(Integer vlan) {
    this.vlan = vlan;
  }


  public WritablePrefix status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Operational status of this prefix
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operational status of this prefix")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WritablePrefix role(Integer role) {
    
    this.role = role;
    return this;
  }

   /**
   * The primary function of this prefix
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The primary function of this prefix")

  public Integer getRole() {
    return role;
  }


  public void setRole(Integer role) {
    this.role = role;
  }


  public WritablePrefix isPool(Boolean isPool) {
    
    this.isPool = isPool;
    return this;
  }

   /**
   * All IP addresses within this prefix are considered usable
   * @return isPool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All IP addresses within this prefix are considered usable")

  public Boolean getIsPool() {
    return isPool;
  }


  public void setIsPool(Boolean isPool) {
    this.isPool = isPool;
  }


  public WritablePrefix markUtilized(Boolean markUtilized) {
    
    this.markUtilized = markUtilized;
    return this;
  }

   /**
   * Treat as 100% utilized
   * @return markUtilized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Treat as 100% utilized")

  public Boolean getMarkUtilized() {
    return markUtilized;
  }


  public void setMarkUtilized(Boolean markUtilized) {
    this.markUtilized = markUtilized;
  }


  public WritablePrefix description(String description) {
    
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


  public WritablePrefix tags(List<NestedTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public WritablePrefix addTagsItem(NestedTag tagsItem) {
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


  public WritablePrefix customFields(Object customFields) {
    
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
   * Get children
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getChildren() {
    return children;
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
    WritablePrefix writablePrefix = (WritablePrefix) o;
    return Objects.equals(this.id, writablePrefix.id) &&
        Objects.equals(this.url, writablePrefix.url) &&
        Objects.equals(this.display, writablePrefix.display) &&
        Objects.equals(this.family, writablePrefix.family) &&
        Objects.equals(this.prefix, writablePrefix.prefix) &&
        Objects.equals(this.site, writablePrefix.site) &&
        Objects.equals(this.vrf, writablePrefix.vrf) &&
        Objects.equals(this.tenant, writablePrefix.tenant) &&
        Objects.equals(this.vlan, writablePrefix.vlan) &&
        Objects.equals(this.status, writablePrefix.status) &&
        Objects.equals(this.role, writablePrefix.role) &&
        Objects.equals(this.isPool, writablePrefix.isPool) &&
        Objects.equals(this.markUtilized, writablePrefix.markUtilized) &&
        Objects.equals(this.description, writablePrefix.description) &&
        Objects.equals(this.tags, writablePrefix.tags) &&
        Objects.equals(this.customFields, writablePrefix.customFields) &&
        Objects.equals(this.created, writablePrefix.created) &&
        Objects.equals(this.lastUpdated, writablePrefix.lastUpdated) &&
        Objects.equals(this.children, writablePrefix.children) &&
        Objects.equals(this.depth, writablePrefix.depth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, family, prefix, site, vrf, tenant, vlan, status, role, isPool, markUtilized, description, tags, customFields, created, lastUpdated, children, depth);
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
    sb.append("class WritablePrefix {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    vrf: ").append(toIndentedString(vrf)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    isPool: ").append(toIndentedString(isPool)).append("\n");
    sb.append("    markUtilized: ").append(toIndentedString(markUtilized)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
    openapiFields.add("family");
    openapiFields.add("prefix");
    openapiFields.add("site");
    openapiFields.add("vrf");
    openapiFields.add("tenant");
    openapiFields.add("vlan");
    openapiFields.add("status");
    openapiFields.add("role");
    openapiFields.add("is_pool");
    openapiFields.add("mark_utilized");
    openapiFields.add("description");
    openapiFields.add("tags");
    openapiFields.add("custom_fields");
    openapiFields.add("created");
    openapiFields.add("last_updated");
    openapiFields.add("children");
    openapiFields.add("_depth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("prefix");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WritablePrefix
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WritablePrefix.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WritablePrefix is not found in the empty JSON string", WritablePrefix.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WritablePrefix.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritablePrefix` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WritablePrefix.openapiRequiredFields) {
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
      if (jsonObj.get("family") != null && !jsonObj.get("family").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family").toString()));
      }
      if (jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
       if (!WritablePrefix.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WritablePrefix' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WritablePrefix> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WritablePrefix.class));

       return (TypeAdapter<T>) new TypeAdapter<WritablePrefix>() {
           @Override
           public void write(JsonWriter out, WritablePrefix value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WritablePrefix read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WritablePrefix given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WritablePrefix
  * @throws IOException if the JSON string is invalid with respect to WritablePrefix
  */
  public static WritablePrefix fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WritablePrefix.class);
  }

 /**
  * Convert an instance of WritablePrefix to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


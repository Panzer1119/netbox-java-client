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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
 * WritableL2VPN
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritableL2VPN {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private Integer identifier;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VPWS("vpws"),
    
    VPLS("vpls"),
    
    VXLAN("vxlan"),
    
    VXLAN_EVPN("vxlan-evpn"),
    
    MPLS_EVPN("mpls-evpn"),
    
    PBB_EVPN("pbb-evpn"),
    
    EPL("epl"),
    
    EVPL("evpl"),
    
    EP_LAN("ep-lan"),
    
    EVP_LAN("evp-lan"),
    
    EP_TREE("ep-tree"),
    
    EVP_TREE("evp-tree"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_IMPORT_TARGETS = "import_targets";
  @SerializedName(SERIALIZED_NAME_IMPORT_TARGETS)
  private Set<Integer> importTargets = null;

  public static final String SERIALIZED_NAME_EXPORT_TARGETS = "export_targets";
  @SerializedName(SERIALIZED_NAME_EXPORT_TARGETS)
  private Set<Integer> exportTargets = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private Integer tenant;

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

  public WritableL2VPN() { 
  }

  
  public WritableL2VPN(
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




  public WritableL2VPN identifier(Integer identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIdentifier() {
    return identifier;
  }


  public void setIdentifier(Integer identifier) {
    this.identifier = identifier;
  }


  public WritableL2VPN name(String name) {
    
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


  public WritableL2VPN slug(String slug) {
    
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


  public WritableL2VPN type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WritableL2VPN importTargets(Set<Integer> importTargets) {
    
    this.importTargets = importTargets;
    return this;
  }

  public WritableL2VPN addImportTargetsItem(Integer importTargetsItem) {
    if (this.importTargets == null) {
      this.importTargets = new LinkedHashSet<>();
    }
    this.importTargets.add(importTargetsItem);
    return this;
  }

   /**
   * Get importTargets
   * @return importTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Integer> getImportTargets() {
    return importTargets;
  }


  public void setImportTargets(Set<Integer> importTargets) {
    this.importTargets = importTargets;
  }


  public WritableL2VPN exportTargets(Set<Integer> exportTargets) {
    
    this.exportTargets = exportTargets;
    return this;
  }

  public WritableL2VPN addExportTargetsItem(Integer exportTargetsItem) {
    if (this.exportTargets == null) {
      this.exportTargets = new LinkedHashSet<>();
    }
    this.exportTargets.add(exportTargetsItem);
    return this;
  }

   /**
   * Get exportTargets
   * @return exportTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<Integer> getExportTargets() {
    return exportTargets;
  }


  public void setExportTargets(Set<Integer> exportTargets) {
    this.exportTargets = exportTargets;
  }


  public WritableL2VPN description(String description) {
    
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


  public WritableL2VPN tenant(Integer tenant) {
    
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


  public WritableL2VPN tags(List<NestedTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public WritableL2VPN addTagsItem(NestedTag tagsItem) {
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


  public WritableL2VPN customFields(Object customFields) {
    
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
    WritableL2VPN writableL2VPN = (WritableL2VPN) o;
    return Objects.equals(this.id, writableL2VPN.id) &&
        Objects.equals(this.url, writableL2VPN.url) &&
        Objects.equals(this.display, writableL2VPN.display) &&
        Objects.equals(this.identifier, writableL2VPN.identifier) &&
        Objects.equals(this.name, writableL2VPN.name) &&
        Objects.equals(this.slug, writableL2VPN.slug) &&
        Objects.equals(this.type, writableL2VPN.type) &&
        Objects.equals(this.importTargets, writableL2VPN.importTargets) &&
        Objects.equals(this.exportTargets, writableL2VPN.exportTargets) &&
        Objects.equals(this.description, writableL2VPN.description) &&
        Objects.equals(this.tenant, writableL2VPN.tenant) &&
        Objects.equals(this.tags, writableL2VPN.tags) &&
        Objects.equals(this.customFields, writableL2VPN.customFields) &&
        Objects.equals(this.created, writableL2VPN.created) &&
        Objects.equals(this.lastUpdated, writableL2VPN.lastUpdated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, identifier, name, slug, type, importTargets, exportTargets, description, tenant, tags, customFields, created, lastUpdated);
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
    sb.append("class WritableL2VPN {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    importTargets: ").append(toIndentedString(importTargets)).append("\n");
    sb.append("    exportTargets: ").append(toIndentedString(exportTargets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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
    openapiFields.add("identifier");
    openapiFields.add("name");
    openapiFields.add("slug");
    openapiFields.add("type");
    openapiFields.add("import_targets");
    openapiFields.add("export_targets");
    openapiFields.add("description");
    openapiFields.add("tenant");
    openapiFields.add("tags");
    openapiFields.add("custom_fields");
    openapiFields.add("created");
    openapiFields.add("last_updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WritableL2VPN
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WritableL2VPN.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WritableL2VPN is not found in the empty JSON string", WritableL2VPN.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WritableL2VPN.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritableL2VPN` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WritableL2VPN.openapiRequiredFields) {
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
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("import_targets") != null && !jsonObj.get("import_targets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_targets` to be an array in the JSON string but got `%s`", jsonObj.get("import_targets").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("export_targets") != null && !jsonObj.get("export_targets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `export_targets` to be an array in the JSON string but got `%s`", jsonObj.get("export_targets").toString()));
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
       if (!WritableL2VPN.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WritableL2VPN' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WritableL2VPN> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WritableL2VPN.class));

       return (TypeAdapter<T>) new TypeAdapter<WritableL2VPN>() {
           @Override
           public void write(JsonWriter out, WritableL2VPN value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WritableL2VPN read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WritableL2VPN given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WritableL2VPN
  * @throws IOException if the JSON string is invalid with respect to WritableL2VPN
  */
  public static WritableL2VPN fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WritableL2VPN.class);
  }

 /**
  * Convert an instance of WritableL2VPN to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


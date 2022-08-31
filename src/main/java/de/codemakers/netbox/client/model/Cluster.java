/*
 * NetBox API
 * API to access NetBox
 *
 * The version of the OpenAPI document: 3.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.codemakers.netbox.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import de.codemakers.netbox.client.model.NestedClusterGroup;
import de.codemakers.netbox.client.model.NestedClusterType;
import de.codemakers.netbox.client.model.NestedSite;
import de.codemakers.netbox.client.model.NestedTag;
import de.codemakers.netbox.client.model.NestedTenant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Cluster
 */
@JsonPropertyOrder({
  Cluster.JSON_PROPERTY_ID,
  Cluster.JSON_PROPERTY_URL,
  Cluster.JSON_PROPERTY_DISPLAY,
  Cluster.JSON_PROPERTY_NAME,
  Cluster.JSON_PROPERTY_TYPE,
  Cluster.JSON_PROPERTY_GROUP,
  Cluster.JSON_PROPERTY_TENANT,
  Cluster.JSON_PROPERTY_SITE,
  Cluster.JSON_PROPERTY_COMMENTS,
  Cluster.JSON_PROPERTY_TAGS,
  Cluster.JSON_PROPERTY_CUSTOM_FIELDS,
  Cluster.JSON_PROPERTY_CREATED,
  Cluster.JSON_PROPERTY_LAST_UPDATED,
  Cluster.JSON_PROPERTY_DEVICE_COUNT,
  Cluster.JSON_PROPERTY_VIRTUALMACHINE_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T18:36:37.665487300+02:00[Europe/Berlin]")
public class Cluster {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NestedClusterType type;

  public static final String JSON_PROPERTY_GROUP = "group";
  private NestedClusterGroup group;

  public static final String JSON_PROPERTY_TENANT = "tenant";
  private JsonNullable<NestedTenant> tenant = JsonNullable.<NestedTenant>undefined();

  public static final String JSON_PROPERTY_SITE = "site";
  private JsonNullable<NestedSite> site = JsonNullable.<NestedSite>undefined();

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private String comments;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<NestedTag> tags = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private Object customFields;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public static final String JSON_PROPERTY_DEVICE_COUNT = "device_count";
  private Integer deviceCount;

  public static final String JSON_PROPERTY_VIRTUALMACHINE_COUNT = "virtualmachine_count";
  private Integer virtualmachineCount;

  public Cluster() { 
  }

  @JsonCreator
  public Cluster(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED) OffsetDateTime lastUpdated, 
    @JsonProperty(JSON_PROPERTY_DEVICE_COUNT) Integer deviceCount, 
    @JsonProperty(JSON_PROPERTY_VIRTUALMACHINE_COUNT) Integer virtualmachineCount
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.created = created;
    this.lastUpdated = lastUpdated;
    this.deviceCount = deviceCount;
    this.virtualmachineCount = virtualmachineCount;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }




   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getUrl() {
    return url;
  }




   /**
   * Get display
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplay() {
    return display;
  }




  public Cluster name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public Cluster type(NestedClusterType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NestedClusterType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(NestedClusterType type) {
    this.type = type;
  }


  public Cluster group(NestedClusterGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NestedClusterGroup getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(NestedClusterGroup group) {
    this.group = group;
  }


  public Cluster tenant(NestedTenant tenant) {
    this.tenant = JsonNullable.<NestedTenant>of(tenant);
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public NestedTenant getTenant() {
        return tenant.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NestedTenant> getTenant_JsonNullable() {
    return tenant;
  }
  
  @JsonProperty(JSON_PROPERTY_TENANT)
  public void setTenant_JsonNullable(JsonNullable<NestedTenant> tenant) {
    this.tenant = tenant;
  }

  public void setTenant(NestedTenant tenant) {
    this.tenant = JsonNullable.<NestedTenant>of(tenant);
  }


  public Cluster site(NestedSite site) {
    this.site = JsonNullable.<NestedSite>of(site);
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public NestedSite getSite() {
        return site.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NestedSite> getSite_JsonNullable() {
    return site;
  }
  
  @JsonProperty(JSON_PROPERTY_SITE)
  public void setSite_JsonNullable(JsonNullable<NestedSite> site) {
    this.site = site;
  }

  public void setSite(NestedSite site) {
    this.site = JsonNullable.<NestedSite>of(site);
  }


  public Cluster comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComments() {
    return comments;
  }


  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComments(String comments) {
    this.comments = comments;
  }


  public Cluster tags(List<NestedTag> tags) {
    this.tags = tags;
    return this;
  }

  public Cluster addTagsItem(NestedTag tagsItem) {
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
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NestedTag> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<NestedTag> tags) {
    this.tags = tags;
  }


  public Cluster customFields(Object customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }


   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }




   /**
   * Get deviceCount
   * @return deviceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeviceCount() {
    return deviceCount;
  }




   /**
   * Get virtualmachineCount
   * @return virtualmachineCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIRTUALMACHINE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVirtualmachineCount() {
    return virtualmachineCount;
  }




  /**
   * Return true if this Cluster object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    return Objects.equals(this.id, cluster.id) &&
        Objects.equals(this.url, cluster.url) &&
        Objects.equals(this.display, cluster.display) &&
        Objects.equals(this.name, cluster.name) &&
        Objects.equals(this.type, cluster.type) &&
        Objects.equals(this.group, cluster.group) &&
        equalsNullable(this.tenant, cluster.tenant) &&
        equalsNullable(this.site, cluster.site) &&
        Objects.equals(this.comments, cluster.comments) &&
        Objects.equals(this.tags, cluster.tags) &&
        Objects.equals(this.customFields, cluster.customFields) &&
        Objects.equals(this.created, cluster.created) &&
        Objects.equals(this.lastUpdated, cluster.lastUpdated) &&
        Objects.equals(this.deviceCount, cluster.deviceCount) &&
        Objects.equals(this.virtualmachineCount, cluster.virtualmachineCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, name, type, group, hashCodeNullable(tenant), hashCodeNullable(site), comments, tags, customFields, created, lastUpdated, deviceCount, virtualmachineCount);
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
    sb.append("class Cluster {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    deviceCount: ").append(toIndentedString(deviceCount)).append("\n");
    sb.append("    virtualmachineCount: ").append(toIndentedString(virtualmachineCount)).append("\n");
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

}


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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import de.codemakers.netbox.client.model.Kind;
import de.codemakers.netbox.client.model.NestedTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JournalEntry
 */
@JsonPropertyOrder({
  JournalEntry.JSON_PROPERTY_ID,
  JournalEntry.JSON_PROPERTY_URL,
  JournalEntry.JSON_PROPERTY_DISPLAY,
  JournalEntry.JSON_PROPERTY_ASSIGNED_OBJECT_TYPE,
  JournalEntry.JSON_PROPERTY_ASSIGNED_OBJECT_ID,
  JournalEntry.JSON_PROPERTY_ASSIGNED_OBJECT,
  JournalEntry.JSON_PROPERTY_CREATED,
  JournalEntry.JSON_PROPERTY_CREATED_BY,
  JournalEntry.JSON_PROPERTY_KIND,
  JournalEntry.JSON_PROPERTY_COMMENTS,
  JournalEntry.JSON_PROPERTY_TAGS,
  JournalEntry.JSON_PROPERTY_CUSTOM_FIELDS,
  JournalEntry.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class JournalEntry {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_ASSIGNED_OBJECT_TYPE = "assigned_object_type";
  private String assignedObjectType;

  public static final String JSON_PROPERTY_ASSIGNED_OBJECT_ID = "assigned_object_id";
  private Integer assignedObjectId;

  public static final String JSON_PROPERTY_ASSIGNED_OBJECT = "assigned_object";
  private Map<String, String> assignedObject = null;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private JsonNullable<Integer> createdBy = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_KIND = "kind";
  private Kind kind;

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private String comments;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<NestedTag> tags = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private Object customFields;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public JournalEntry() { 
  }

  @JsonCreator
  public JournalEntry(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_ASSIGNED_OBJECT) Map<String, String> assignedObject, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED) OffsetDateTime lastUpdated
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.assignedObject = assignedObject;
    this.created = created;
    this.lastUpdated = lastUpdated;
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




  public JournalEntry assignedObjectType(String assignedObjectType) {
    this.assignedObjectType = assignedObjectType;
    return this;
  }

   /**
   * Get assignedObjectType
   * @return assignedObjectType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASSIGNED_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAssignedObjectType() {
    return assignedObjectType;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssignedObjectType(String assignedObjectType) {
    this.assignedObjectType = assignedObjectType;
  }


  public JournalEntry assignedObjectId(Integer assignedObjectId) {
    this.assignedObjectId = assignedObjectId;
    return this;
  }

   /**
   * Get assignedObjectId
   * minimum: 0
   * maximum: 9223372036854775807
   * @return assignedObjectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASSIGNED_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAssignedObjectId() {
    return assignedObjectId;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssignedObjectId(Integer assignedObjectId) {
    this.assignedObjectId = assignedObjectId;
  }


   /**
   * Get assignedObject
   * @return assignedObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSIGNED_OBJECT)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAssignedObject() {
    return assignedObject;
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




  public JournalEntry createdBy(Integer createdBy) {
    this.createdBy = JsonNullable.<Integer>of(createdBy);
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getCreatedBy() {
        return createdBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getCreatedBy_JsonNullable() {
    return createdBy;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  public void setCreatedBy_JsonNullable(JsonNullable<Integer> createdBy) {
    this.createdBy = createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = JsonNullable.<Integer>of(createdBy);
  }


  public JournalEntry kind(Kind kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Kind getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(Kind kind) {
    this.kind = kind;
  }


  public JournalEntry comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getComments() {
    return comments;
  }


  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComments(String comments) {
    this.comments = comments;
  }


  public JournalEntry tags(List<NestedTag> tags) {
    this.tags = tags;
    return this;
  }

  public JournalEntry addTagsItem(NestedTag tagsItem) {
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


  public JournalEntry customFields(Object customFields) {
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
   * Return true if this JournalEntry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalEntry journalEntry = (JournalEntry) o;
    return Objects.equals(this.id, journalEntry.id) &&
        Objects.equals(this.url, journalEntry.url) &&
        Objects.equals(this.display, journalEntry.display) &&
        Objects.equals(this.assignedObjectType, journalEntry.assignedObjectType) &&
        Objects.equals(this.assignedObjectId, journalEntry.assignedObjectId) &&
        Objects.equals(this.assignedObject, journalEntry.assignedObject) &&
        Objects.equals(this.created, journalEntry.created) &&
        equalsNullable(this.createdBy, journalEntry.createdBy) &&
        Objects.equals(this.kind, journalEntry.kind) &&
        Objects.equals(this.comments, journalEntry.comments) &&
        Objects.equals(this.tags, journalEntry.tags) &&
        Objects.equals(this.customFields, journalEntry.customFields) &&
        Objects.equals(this.lastUpdated, journalEntry.lastUpdated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, assignedObjectType, assignedObjectId, assignedObject, created, hashCodeNullable(createdBy), kind, comments, tags, customFields, lastUpdated);
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
    sb.append("class JournalEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    assignedObjectType: ").append(toIndentedString(assignedObjectType)).append("\n");
    sb.append("    assignedObjectId: ").append(toIndentedString(assignedObjectId)).append("\n");
    sb.append("    assignedObject: ").append(toIndentedString(assignedObject)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

}


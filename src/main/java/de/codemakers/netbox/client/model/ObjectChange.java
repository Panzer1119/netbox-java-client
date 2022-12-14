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
import de.codemakers.netbox.client.model.Action;
import de.codemakers.netbox.client.model.NestedUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ObjectChange
 */
@JsonPropertyOrder({
  ObjectChange.JSON_PROPERTY_ID,
  ObjectChange.JSON_PROPERTY_URL,
  ObjectChange.JSON_PROPERTY_DISPLAY,
  ObjectChange.JSON_PROPERTY_TIME,
  ObjectChange.JSON_PROPERTY_USER,
  ObjectChange.JSON_PROPERTY_USER_NAME,
  ObjectChange.JSON_PROPERTY_REQUEST_ID,
  ObjectChange.JSON_PROPERTY_ACTION,
  ObjectChange.JSON_PROPERTY_CHANGED_OBJECT_TYPE,
  ObjectChange.JSON_PROPERTY_CHANGED_OBJECT_ID,
  ObjectChange.JSON_PROPERTY_CHANGED_OBJECT,
  ObjectChange.JSON_PROPERTY_PRECHANGE_DATA,
  ObjectChange.JSON_PROPERTY_POSTCHANGE_DATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class ObjectChange {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_TIME = "time";
  private OffsetDateTime time;

  public static final String JSON_PROPERTY_USER = "user";
  private NestedUser user;

  public static final String JSON_PROPERTY_USER_NAME = "user_name";
  private String userName;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private UUID requestId;

  public static final String JSON_PROPERTY_ACTION = "action";
  private Action action;

  public static final String JSON_PROPERTY_CHANGED_OBJECT_TYPE = "changed_object_type";
  private String changedObjectType;

  public static final String JSON_PROPERTY_CHANGED_OBJECT_ID = "changed_object_id";
  private Integer changedObjectId;

  public static final String JSON_PROPERTY_CHANGED_OBJECT = "changed_object";
  private Map<String, String> changedObject = null;

  public static final String JSON_PROPERTY_PRECHANGE_DATA = "prechange_data";
  private String prechangeData;

  public static final String JSON_PROPERTY_POSTCHANGE_DATA = "postchange_data";
  private String postchangeData;

  public ObjectChange() { 
  }

  @JsonCreator
  public ObjectChange(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_TIME) OffsetDateTime time, 
    @JsonProperty(JSON_PROPERTY_USER_NAME) String userName, 
    @JsonProperty(JSON_PROPERTY_REQUEST_ID) UUID requestId, 
    @JsonProperty(JSON_PROPERTY_CHANGED_OBJECT_TYPE) String changedObjectType, 
    @JsonProperty(JSON_PROPERTY_CHANGED_OBJECT) Map<String, String> changedObject, 
    @JsonProperty(JSON_PROPERTY_PRECHANGE_DATA) String prechangeData, 
    @JsonProperty(JSON_PROPERTY_POSTCHANGE_DATA) String postchangeData
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.time = time;
    this.userName = userName;
    this.requestId = requestId;
    this.changedObjectType = changedObjectType;
    this.changedObject = changedObject;
    this.prechangeData = prechangeData;
    this.postchangeData = postchangeData;
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




   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTime() {
    return time;
  }




  public ObjectChange user(NestedUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NestedUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(NestedUser user) {
    this.user = user;
  }


   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }




   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getRequestId() {
    return requestId;
  }




  public ObjectChange action(Action action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Action getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(Action action) {
    this.action = action;
  }


   /**
   * Get changedObjectType
   * @return changedObjectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANGED_OBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChangedObjectType() {
    return changedObjectType;
  }




  public ObjectChange changedObjectId(Integer changedObjectId) {
    this.changedObjectId = changedObjectId;
    return this;
  }

   /**
   * Get changedObjectId
   * minimum: 0
   * maximum: 9223372036854775807
   * @return changedObjectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CHANGED_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getChangedObjectId() {
    return changedObjectId;
  }


  @JsonProperty(JSON_PROPERTY_CHANGED_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChangedObjectId(Integer changedObjectId) {
    this.changedObjectId = changedObjectId;
  }


   /**
   *  Serialize a nested representation of the changed object. 
   * @return changedObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Serialize a nested representation of the changed object. ")
  @JsonProperty(JSON_PROPERTY_CHANGED_OBJECT)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getChangedObject() {
    return changedObject;
  }




   /**
   * Get prechangeData
   * @return prechangeData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRECHANGE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrechangeData() {
    return prechangeData;
  }




   /**
   * Get postchangeData
   * @return postchangeData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTCHANGE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostchangeData() {
    return postchangeData;
  }




  /**
   * Return true if this ObjectChange object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectChange objectChange = (ObjectChange) o;
    return Objects.equals(this.id, objectChange.id) &&
        Objects.equals(this.url, objectChange.url) &&
        Objects.equals(this.display, objectChange.display) &&
        Objects.equals(this.time, objectChange.time) &&
        Objects.equals(this.user, objectChange.user) &&
        Objects.equals(this.userName, objectChange.userName) &&
        Objects.equals(this.requestId, objectChange.requestId) &&
        Objects.equals(this.action, objectChange.action) &&
        Objects.equals(this.changedObjectType, objectChange.changedObjectType) &&
        Objects.equals(this.changedObjectId, objectChange.changedObjectId) &&
        Objects.equals(this.changedObject, objectChange.changedObject) &&
        Objects.equals(this.prechangeData, objectChange.prechangeData) &&
        Objects.equals(this.postchangeData, objectChange.postchangeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, time, user, userName, requestId, action, changedObjectType, changedObjectId, changedObject, prechangeData, postchangeData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectChange {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    changedObjectType: ").append(toIndentedString(changedObjectType)).append("\n");
    sb.append("    changedObjectId: ").append(toIndentedString(changedObjectId)).append("\n");
    sb.append("    changedObject: ").append(toIndentedString(changedObject)).append("\n");
    sb.append("    prechangeData: ").append(toIndentedString(prechangeData)).append("\n");
    sb.append("    postchangeData: ").append(toIndentedString(postchangeData)).append("\n");
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


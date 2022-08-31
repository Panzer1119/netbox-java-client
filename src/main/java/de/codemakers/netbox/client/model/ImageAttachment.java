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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ImageAttachment
 */
@JsonPropertyOrder({
  ImageAttachment.JSON_PROPERTY_ID,
  ImageAttachment.JSON_PROPERTY_URL,
  ImageAttachment.JSON_PROPERTY_DISPLAY,
  ImageAttachment.JSON_PROPERTY_CONTENT_TYPE,
  ImageAttachment.JSON_PROPERTY_OBJECT_ID,
  ImageAttachment.JSON_PROPERTY_PARENT,
  ImageAttachment.JSON_PROPERTY_NAME,
  ImageAttachment.JSON_PROPERTY_IMAGE,
  ImageAttachment.JSON_PROPERTY_IMAGE_HEIGHT,
  ImageAttachment.JSON_PROPERTY_IMAGE_WIDTH,
  ImageAttachment.JSON_PROPERTY_CREATED,
  ImageAttachment.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T18:36:37.665487300+02:00[Europe/Berlin]")
public class ImageAttachment {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
  private String contentType;

  public static final String JSON_PROPERTY_OBJECT_ID = "object_id";
  private Integer objectId;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private Map<String, String> parent = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IMAGE = "image";
  private URI image;

  public static final String JSON_PROPERTY_IMAGE_HEIGHT = "image_height";
  private Integer imageHeight;

  public static final String JSON_PROPERTY_IMAGE_WIDTH = "image_width";
  private Integer imageWidth;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public ImageAttachment() { 
  }

  @JsonCreator
  public ImageAttachment(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_PARENT) Map<String, String> parent, 
    @JsonProperty(JSON_PROPERTY_IMAGE) URI image, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED) OffsetDateTime lastUpdated
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.parent = parent;
    this.image = image;
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




  public ImageAttachment contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public ImageAttachment objectId(Integer objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * minimum: 0
   * maximum: 9223372036854775807
   * @return objectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getObjectId() {
    return objectId;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObjectId(Integer objectId) {
    this.objectId = objectId;
  }


   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getParent() {
    return parent;
  }




  public ImageAttachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getImage() {
    return image;
  }




  public ImageAttachment imageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
    return this;
  }

   /**
   * Get imageHeight
   * minimum: 0
   * maximum: 32767
   * @return imageHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getImageHeight() {
    return imageHeight;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
  }


  public ImageAttachment imageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
    return this;
  }

   /**
   * Get imageWidth
   * minimum: 0
   * maximum: 32767
   * @return imageWidth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getImageWidth() {
    return imageWidth;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
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
   * Return true if this ImageAttachment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageAttachment imageAttachment = (ImageAttachment) o;
    return Objects.equals(this.id, imageAttachment.id) &&
        Objects.equals(this.url, imageAttachment.url) &&
        Objects.equals(this.display, imageAttachment.display) &&
        Objects.equals(this.contentType, imageAttachment.contentType) &&
        Objects.equals(this.objectId, imageAttachment.objectId) &&
        Objects.equals(this.parent, imageAttachment.parent) &&
        Objects.equals(this.name, imageAttachment.name) &&
        Objects.equals(this.image, imageAttachment.image) &&
        Objects.equals(this.imageHeight, imageAttachment.imageHeight) &&
        Objects.equals(this.imageWidth, imageAttachment.imageWidth) &&
        Objects.equals(this.created, imageAttachment.created) &&
        Objects.equals(this.lastUpdated, imageAttachment.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, contentType, objectId, parent, name, image, imageHeight, imageWidth, created, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageAttachment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
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

}


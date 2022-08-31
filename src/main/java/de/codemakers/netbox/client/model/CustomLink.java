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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomLink
 */
@JsonPropertyOrder({
  CustomLink.JSON_PROPERTY_ID,
  CustomLink.JSON_PROPERTY_URL,
  CustomLink.JSON_PROPERTY_DISPLAY,
  CustomLink.JSON_PROPERTY_CONTENT_TYPE,
  CustomLink.JSON_PROPERTY_NAME,
  CustomLink.JSON_PROPERTY_ENABLED,
  CustomLink.JSON_PROPERTY_LINK_TEXT,
  CustomLink.JSON_PROPERTY_LINK_URL,
  CustomLink.JSON_PROPERTY_WEIGHT,
  CustomLink.JSON_PROPERTY_GROUP_NAME,
  CustomLink.JSON_PROPERTY_BUTTON_CLASS,
  CustomLink.JSON_PROPERTY_NEW_WINDOW,
  CustomLink.JSON_PROPERTY_CREATED,
  CustomLink.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class CustomLink {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
  private String contentType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_LINK_TEXT = "link_text";
  private String linkText;

  public static final String JSON_PROPERTY_LINK_URL = "link_url";
  private String linkUrl;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private Integer weight;

  public static final String JSON_PROPERTY_GROUP_NAME = "group_name";
  private String groupName;

  /**
   * The class of the first link in a group will be used for the dropdown button
   */
  public enum ButtonClassEnum {
    OUTLINE_DARK("outline-dark"),
    
    BLUE("blue"),
    
    INDIGO("indigo"),
    
    PURPLE("purple"),
    
    PINK("pink"),
    
    RED("red"),
    
    ORANGE("orange"),
    
    YELLOW("yellow"),
    
    GREEN("green"),
    
    TEAL("teal"),
    
    CYAN("cyan"),
    
    GRAY("gray"),
    
    BLACK("black"),
    
    WHITE("white"),
    
    GHOST_DARK("ghost-dark"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    ButtonClassEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ButtonClassEnum fromValue(String value) {
      for (ButtonClassEnum b : ButtonClassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_BUTTON_CLASS = "button_class";
  private ButtonClassEnum buttonClass;

  public static final String JSON_PROPERTY_NEW_WINDOW = "new_window";
  private Boolean newWindow;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public CustomLink() { 
  }

  @JsonCreator
  public CustomLink(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED) OffsetDateTime lastUpdated
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




  public CustomLink contentType(String contentType) {
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


  public CustomLink name(String name) {
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


  public CustomLink enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CustomLink linkText(String linkText) {
    this.linkText = linkText;
    return this;
  }

   /**
   * Jinja2 template code for link text
   * @return linkText
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Jinja2 template code for link text")
  @JsonProperty(JSON_PROPERTY_LINK_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLinkText() {
    return linkText;
  }


  @JsonProperty(JSON_PROPERTY_LINK_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }


  public CustomLink linkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * Jinja2 template code for link URL
   * @return linkUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Jinja2 template code for link URL")
  @JsonProperty(JSON_PROPERTY_LINK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLinkUrl() {
    return linkUrl;
  }


  @JsonProperty(JSON_PROPERTY_LINK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }


  public CustomLink weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * minimum: 0
   * maximum: 32767
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  public CustomLink groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Links with the same group will appear as a dropdown menu
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Links with the same group will appear as a dropdown menu")
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public CustomLink buttonClass(ButtonClassEnum buttonClass) {
    this.buttonClass = buttonClass;
    return this;
  }

   /**
   * The class of the first link in a group will be used for the dropdown button
   * @return buttonClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The class of the first link in a group will be used for the dropdown button")
  @JsonProperty(JSON_PROPERTY_BUTTON_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ButtonClassEnum getButtonClass() {
    return buttonClass;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtonClass(ButtonClassEnum buttonClass) {
    this.buttonClass = buttonClass;
  }


  public CustomLink newWindow(Boolean newWindow) {
    this.newWindow = newWindow;
    return this;
  }

   /**
   * Force link to open in a new window
   * @return newWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Force link to open in a new window")
  @JsonProperty(JSON_PROPERTY_NEW_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNewWindow() {
    return newWindow;
  }


  @JsonProperty(JSON_PROPERTY_NEW_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewWindow(Boolean newWindow) {
    this.newWindow = newWindow;
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
   * Return true if this CustomLink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLink customLink = (CustomLink) o;
    return Objects.equals(this.id, customLink.id) &&
        Objects.equals(this.url, customLink.url) &&
        Objects.equals(this.display, customLink.display) &&
        Objects.equals(this.contentType, customLink.contentType) &&
        Objects.equals(this.name, customLink.name) &&
        Objects.equals(this.enabled, customLink.enabled) &&
        Objects.equals(this.linkText, customLink.linkText) &&
        Objects.equals(this.linkUrl, customLink.linkUrl) &&
        Objects.equals(this.weight, customLink.weight) &&
        Objects.equals(this.groupName, customLink.groupName) &&
        Objects.equals(this.buttonClass, customLink.buttonClass) &&
        Objects.equals(this.newWindow, customLink.newWindow) &&
        Objects.equals(this.created, customLink.created) &&
        Objects.equals(this.lastUpdated, customLink.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, contentType, name, enabled, linkText, linkUrl, weight, groupName, buttonClass, newWindow, created, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLink {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    buttonClass: ").append(toIndentedString(buttonClass)).append("\n");
    sb.append("    newWindow: ").append(toIndentedString(newWindow)).append("\n");
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


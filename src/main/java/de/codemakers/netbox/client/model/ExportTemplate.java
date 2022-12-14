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
 * ExportTemplate
 */
@JsonPropertyOrder({
  ExportTemplate.JSON_PROPERTY_ID,
  ExportTemplate.JSON_PROPERTY_URL,
  ExportTemplate.JSON_PROPERTY_DISPLAY,
  ExportTemplate.JSON_PROPERTY_CONTENT_TYPE,
  ExportTemplate.JSON_PROPERTY_NAME,
  ExportTemplate.JSON_PROPERTY_DESCRIPTION,
  ExportTemplate.JSON_PROPERTY_TEMPLATE_CODE,
  ExportTemplate.JSON_PROPERTY_MIME_TYPE,
  ExportTemplate.JSON_PROPERTY_FILE_EXTENSION,
  ExportTemplate.JSON_PROPERTY_AS_ATTACHMENT,
  ExportTemplate.JSON_PROPERTY_CREATED,
  ExportTemplate.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class ExportTemplate {
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

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TEMPLATE_CODE = "template_code";
  private String templateCode;

  public static final String JSON_PROPERTY_MIME_TYPE = "mime_type";
  private String mimeType;

  public static final String JSON_PROPERTY_FILE_EXTENSION = "file_extension";
  private String fileExtension;

  public static final String JSON_PROPERTY_AS_ATTACHMENT = "as_attachment";
  private Boolean asAttachment;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public ExportTemplate() { 
  }

  @JsonCreator
  public ExportTemplate(
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




  public ExportTemplate contentType(String contentType) {
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


  public ExportTemplate name(String name) {
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


  public ExportTemplate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ExportTemplate templateCode(String templateCode) {
    this.templateCode = templateCode;
    return this;
  }

   /**
   * Jinja2 template code. The list of objects being exported is passed as a context variable named &lt;code&gt;queryset&lt;/code&gt;.
   * @return templateCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Jinja2 template code. The list of objects being exported is passed as a context variable named <code>queryset</code>.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplateCode() {
    return templateCode;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }


  public ExportTemplate mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Defaults to &lt;code&gt;text/plain&lt;/code&gt;
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to <code>text/plain</code>")
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimeType() {
    return mimeType;
  }


  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public ExportTemplate fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

   /**
   * Extension to append to the rendered filename
   * @return fileExtension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extension to append to the rendered filename")
  @JsonProperty(JSON_PROPERTY_FILE_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileExtension() {
    return fileExtension;
  }


  @JsonProperty(JSON_PROPERTY_FILE_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }


  public ExportTemplate asAttachment(Boolean asAttachment) {
    this.asAttachment = asAttachment;
    return this;
  }

   /**
   * Download file as attachment
   * @return asAttachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Download file as attachment")
  @JsonProperty(JSON_PROPERTY_AS_ATTACHMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAsAttachment() {
    return asAttachment;
  }


  @JsonProperty(JSON_PROPERTY_AS_ATTACHMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsAttachment(Boolean asAttachment) {
    this.asAttachment = asAttachment;
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
   * Return true if this ExportTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportTemplate exportTemplate = (ExportTemplate) o;
    return Objects.equals(this.id, exportTemplate.id) &&
        Objects.equals(this.url, exportTemplate.url) &&
        Objects.equals(this.display, exportTemplate.display) &&
        Objects.equals(this.contentType, exportTemplate.contentType) &&
        Objects.equals(this.name, exportTemplate.name) &&
        Objects.equals(this.description, exportTemplate.description) &&
        Objects.equals(this.templateCode, exportTemplate.templateCode) &&
        Objects.equals(this.mimeType, exportTemplate.mimeType) &&
        Objects.equals(this.fileExtension, exportTemplate.fileExtension) &&
        Objects.equals(this.asAttachment, exportTemplate.asAttachment) &&
        Objects.equals(this.created, exportTemplate.created) &&
        Objects.equals(this.lastUpdated, exportTemplate.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, contentType, name, description, templateCode, mimeType, fileExtension, asAttachment, created, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templateCode: ").append(toIndentedString(templateCode)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    asAttachment: ").append(toIndentedString(asAttachment)).append("\n");
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


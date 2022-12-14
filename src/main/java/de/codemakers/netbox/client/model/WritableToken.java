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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WritableToken
 */
@JsonPropertyOrder({
  WritableToken.JSON_PROPERTY_ID,
  WritableToken.JSON_PROPERTY_URL,
  WritableToken.JSON_PROPERTY_DISPLAY,
  WritableToken.JSON_PROPERTY_USER,
  WritableToken.JSON_PROPERTY_CREATED,
  WritableToken.JSON_PROPERTY_EXPIRES,
  WritableToken.JSON_PROPERTY_LAST_USED,
  WritableToken.JSON_PROPERTY_KEY,
  WritableToken.JSON_PROPERTY_WRITE_ENABLED,
  WritableToken.JSON_PROPERTY_DESCRIPTION,
  WritableToken.JSON_PROPERTY_ALLOWED_IPS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class WritableToken {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_USER = "user";
  private Integer user;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_EXPIRES = "expires";
  private JsonNullable<OffsetDateTime> expires = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_LAST_USED = "last_used";
  private JsonNullable<OffsetDateTime> lastUsed = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_WRITE_ENABLED = "write_enabled";
  private Boolean writeEnabled;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ALLOWED_IPS = "allowed_ips";
  private List<Object> allowedIps = null;

  public WritableToken() { 
  }

  @JsonCreator
  public WritableToken(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.created = created;
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




  public WritableToken user(Integer user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUser(Integer user) {
    this.user = user;
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




  public WritableToken expires(OffsetDateTime expires) {
    this.expires = JsonNullable.<OffsetDateTime>of(expires);
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getExpires() {
        return expires.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getExpires_JsonNullable() {
    return expires;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRES)
  public void setExpires_JsonNullable(JsonNullable<OffsetDateTime> expires) {
    this.expires = expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = JsonNullable.<OffsetDateTime>of(expires);
  }


  public WritableToken lastUsed(OffsetDateTime lastUsed) {
    this.lastUsed = JsonNullable.<OffsetDateTime>of(lastUsed);
    return this;
  }

   /**
   * Get lastUsed
   * @return lastUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getLastUsed() {
        return lastUsed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getLastUsed_JsonNullable() {
    return lastUsed;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_USED)
  public void setLastUsed_JsonNullable(JsonNullable<OffsetDateTime> lastUsed) {
    this.lastUsed = lastUsed;
  }

  public void setLastUsed(OffsetDateTime lastUsed) {
    this.lastUsed = JsonNullable.<OffsetDateTime>of(lastUsed);
  }


  public WritableToken key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public WritableToken writeEnabled(Boolean writeEnabled) {
    this.writeEnabled = writeEnabled;
    return this;
  }

   /**
   * Permit create/update/delete operations using this key
   * @return writeEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Permit create/update/delete operations using this key")
  @JsonProperty(JSON_PROPERTY_WRITE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWriteEnabled() {
    return writeEnabled;
  }


  @JsonProperty(JSON_PROPERTY_WRITE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWriteEnabled(Boolean writeEnabled) {
    this.writeEnabled = writeEnabled;
  }


  public WritableToken description(String description) {
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


  public WritableToken allowedIps(List<Object> allowedIps) {
    this.allowedIps = allowedIps;
    return this;
  }

  public WritableToken addAllowedIpsItem(Object allowedIpsItem) {
    if (this.allowedIps == null) {
      this.allowedIps = new ArrayList<>();
    }
    this.allowedIps.add(allowedIpsItem);
    return this;
  }

   /**
   * Get allowedIps
   * @return allowedIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getAllowedIps() {
    return allowedIps;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedIps(List<Object> allowedIps) {
    this.allowedIps = allowedIps;
  }


  /**
   * Return true if this WritableToken object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableToken writableToken = (WritableToken) o;
    return Objects.equals(this.id, writableToken.id) &&
        Objects.equals(this.url, writableToken.url) &&
        Objects.equals(this.display, writableToken.display) &&
        Objects.equals(this.user, writableToken.user) &&
        Objects.equals(this.created, writableToken.created) &&
        equalsNullable(this.expires, writableToken.expires) &&
        equalsNullable(this.lastUsed, writableToken.lastUsed) &&
        Objects.equals(this.key, writableToken.key) &&
        Objects.equals(this.writeEnabled, writableToken.writeEnabled) &&
        Objects.equals(this.description, writableToken.description) &&
        Objects.equals(this.allowedIps, writableToken.allowedIps);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, user, created, hashCodeNullable(expires), hashCodeNullable(lastUsed), key, writeEnabled, description, allowedIps);
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
    sb.append("class WritableToken {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    writeEnabled: ").append(toIndentedString(writeEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    allowedIps: ").append(toIndentedString(allowedIps)).append("\n");
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


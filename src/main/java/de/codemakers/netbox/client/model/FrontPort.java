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
import de.codemakers.netbox.client.model.ComponentNestedModule;
import de.codemakers.netbox.client.model.FrontPortRearPort;
import de.codemakers.netbox.client.model.NestedCable;
import de.codemakers.netbox.client.model.NestedDevice;
import de.codemakers.netbox.client.model.NestedTag;
import de.codemakers.netbox.client.model.Type1;
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
 * FrontPort
 */
@JsonPropertyOrder({
  FrontPort.JSON_PROPERTY_ID,
  FrontPort.JSON_PROPERTY_URL,
  FrontPort.JSON_PROPERTY_DISPLAY,
  FrontPort.JSON_PROPERTY_DEVICE,
  FrontPort.JSON_PROPERTY_MODULE,
  FrontPort.JSON_PROPERTY_NAME,
  FrontPort.JSON_PROPERTY_LABEL,
  FrontPort.JSON_PROPERTY_TYPE,
  FrontPort.JSON_PROPERTY_COLOR,
  FrontPort.JSON_PROPERTY_REAR_PORT,
  FrontPort.JSON_PROPERTY_REAR_PORT_POSITION,
  FrontPort.JSON_PROPERTY_DESCRIPTION,
  FrontPort.JSON_PROPERTY_MARK_CONNECTED,
  FrontPort.JSON_PROPERTY_CABLE,
  FrontPort.JSON_PROPERTY_CABLE_END,
  FrontPort.JSON_PROPERTY_LINK_PEERS,
  FrontPort.JSON_PROPERTY_LINK_PEERS_TYPE,
  FrontPort.JSON_PROPERTY_TAGS,
  FrontPort.JSON_PROPERTY_CUSTOM_FIELDS,
  FrontPort.JSON_PROPERTY_CREATED,
  FrontPort.JSON_PROPERTY_LAST_UPDATED,
  FrontPort.JSON_PROPERTY_OCCUPIED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class FrontPort {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private NestedDevice device;

  public static final String JSON_PROPERTY_MODULE = "module";
  private JsonNullable<ComponentNestedModule> module = JsonNullable.<ComponentNestedModule>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Type1 type;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_REAR_PORT = "rear_port";
  private FrontPortRearPort rearPort;

  public static final String JSON_PROPERTY_REAR_PORT_POSITION = "rear_port_position";
  private Integer rearPortPosition;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MARK_CONNECTED = "mark_connected";
  private Boolean markConnected;

  public static final String JSON_PROPERTY_CABLE = "cable";
  private NestedCable cable;

  public static final String JSON_PROPERTY_CABLE_END = "cable_end";
  private String cableEnd;

  public static final String JSON_PROPERTY_LINK_PEERS = "link_peers";
  private List<String> linkPeers = null;

  public static final String JSON_PROPERTY_LINK_PEERS_TYPE = "link_peers_type";
  private String linkPeersType;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<NestedTag> tags = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private Object customFields;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public static final String JSON_PROPERTY_OCCUPIED = "_occupied";
  private Boolean occupied;

  public FrontPort() { 
  }

  @JsonCreator
  public FrontPort(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_CABLE_END) String cableEnd, 
    @JsonProperty(JSON_PROPERTY_LINK_PEERS) List<String> linkPeers, 
    @JsonProperty(JSON_PROPERTY_LINK_PEERS_TYPE) String linkPeersType, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED) OffsetDateTime lastUpdated, 
    @JsonProperty(JSON_PROPERTY_OCCUPIED) Boolean occupied
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.cableEnd = cableEnd;
    this.linkPeers = linkPeers;
    this.linkPeersType = linkPeersType;
    this.created = created;
    this.lastUpdated = lastUpdated;
    this.occupied = occupied;
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




  public FrontPort device(NestedDevice device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NestedDevice getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDevice(NestedDevice device) {
    this.device = device;
  }


  public FrontPort module(ComponentNestedModule module) {
    this.module = JsonNullable.<ComponentNestedModule>of(module);
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public ComponentNestedModule getModule() {
        return module.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ComponentNestedModule> getModule_JsonNullable() {
    return module;
  }
  
  @JsonProperty(JSON_PROPERTY_MODULE)
  public void setModule_JsonNullable(JsonNullable<ComponentNestedModule> module) {
    this.module = module;
  }

  public void setModule(ComponentNestedModule module) {
    this.module = JsonNullable.<ComponentNestedModule>of(module);
  }


  public FrontPort name(String name) {
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


  public FrontPort label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Physical label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Physical label")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public FrontPort type(Type1 type) {
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

  public Type1 getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(Type1 type) {
    this.type = type;
  }


  public FrontPort color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


  public FrontPort rearPort(FrontPortRearPort rearPort) {
    this.rearPort = rearPort;
    return this;
  }

   /**
   * Get rearPort
   * @return rearPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REAR_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FrontPortRearPort getRearPort() {
    return rearPort;
  }


  @JsonProperty(JSON_PROPERTY_REAR_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRearPort(FrontPortRearPort rearPort) {
    this.rearPort = rearPort;
  }


  public FrontPort rearPortPosition(Integer rearPortPosition) {
    this.rearPortPosition = rearPortPosition;
    return this;
  }

   /**
   * Get rearPortPosition
   * minimum: 1
   * maximum: 1024
   * @return rearPortPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REAR_PORT_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRearPortPosition() {
    return rearPortPosition;
  }


  @JsonProperty(JSON_PROPERTY_REAR_PORT_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRearPortPosition(Integer rearPortPosition) {
    this.rearPortPosition = rearPortPosition;
  }


  public FrontPort description(String description) {
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


  public FrontPort markConnected(Boolean markConnected) {
    this.markConnected = markConnected;
    return this;
  }

   /**
   * Treat as if a cable is connected
   * @return markConnected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Treat as if a cable is connected")
  @JsonProperty(JSON_PROPERTY_MARK_CONNECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarkConnected() {
    return markConnected;
  }


  @JsonProperty(JSON_PROPERTY_MARK_CONNECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkConnected(Boolean markConnected) {
    this.markConnected = markConnected;
  }


  public FrontPort cable(NestedCable cable) {
    this.cable = cable;
    return this;
  }

   /**
   * Get cable
   * @return cable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NestedCable getCable() {
    return cable;
  }


  @JsonProperty(JSON_PROPERTY_CABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCable(NestedCable cable) {
    this.cable = cable;
  }


   /**
   * Get cableEnd
   * @return cableEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CABLE_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCableEnd() {
    return cableEnd;
  }




   /**
   *  Return the appropriate serializer for the link termination model. 
   * @return linkPeers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Return the appropriate serializer for the link termination model. ")
  @JsonProperty(JSON_PROPERTY_LINK_PEERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLinkPeers() {
    return linkPeers;
  }




   /**
   * Get linkPeersType
   * @return linkPeersType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK_PEERS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkPeersType() {
    return linkPeersType;
  }




  public FrontPort tags(List<NestedTag> tags) {
    this.tags = tags;
    return this;
  }

  public FrontPort addTagsItem(NestedTag tagsItem) {
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


  public FrontPort customFields(Object customFields) {
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
   * Get occupied
   * @return occupied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OCCUPIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOccupied() {
    return occupied;
  }




  /**
   * Return true if this FrontPort object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrontPort frontPort = (FrontPort) o;
    return Objects.equals(this.id, frontPort.id) &&
        Objects.equals(this.url, frontPort.url) &&
        Objects.equals(this.display, frontPort.display) &&
        Objects.equals(this.device, frontPort.device) &&
        equalsNullable(this.module, frontPort.module) &&
        Objects.equals(this.name, frontPort.name) &&
        Objects.equals(this.label, frontPort.label) &&
        Objects.equals(this.type, frontPort.type) &&
        Objects.equals(this.color, frontPort.color) &&
        Objects.equals(this.rearPort, frontPort.rearPort) &&
        Objects.equals(this.rearPortPosition, frontPort.rearPortPosition) &&
        Objects.equals(this.description, frontPort.description) &&
        Objects.equals(this.markConnected, frontPort.markConnected) &&
        Objects.equals(this.cable, frontPort.cable) &&
        Objects.equals(this.cableEnd, frontPort.cableEnd) &&
        Objects.equals(this.linkPeers, frontPort.linkPeers) &&
        Objects.equals(this.linkPeersType, frontPort.linkPeersType) &&
        Objects.equals(this.tags, frontPort.tags) &&
        Objects.equals(this.customFields, frontPort.customFields) &&
        Objects.equals(this.created, frontPort.created) &&
        Objects.equals(this.lastUpdated, frontPort.lastUpdated) &&
        Objects.equals(this.occupied, frontPort.occupied);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, device, hashCodeNullable(module), name, label, type, color, rearPort, rearPortPosition, description, markConnected, cable, cableEnd, linkPeers, linkPeersType, tags, customFields, created, lastUpdated, occupied);
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
    sb.append("class FrontPort {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    rearPort: ").append(toIndentedString(rearPort)).append("\n");
    sb.append("    rearPortPosition: ").append(toIndentedString(rearPortPosition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    markConnected: ").append(toIndentedString(markConnected)).append("\n");
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    cableEnd: ").append(toIndentedString(cableEnd)).append("\n");
    sb.append("    linkPeers: ").append(toIndentedString(linkPeers)).append("\n");
    sb.append("    linkPeersType: ").append(toIndentedString(linkPeersType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    occupied: ").append(toIndentedString(occupied)).append("\n");
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


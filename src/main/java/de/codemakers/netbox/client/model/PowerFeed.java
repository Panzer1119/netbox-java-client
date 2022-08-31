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
import de.codemakers.netbox.client.model.NestedCable;
import de.codemakers.netbox.client.model.NestedPowerPanel;
import de.codemakers.netbox.client.model.NestedRack;
import de.codemakers.netbox.client.model.NestedTag;
import de.codemakers.netbox.client.model.Phase;
import de.codemakers.netbox.client.model.Status3;
import de.codemakers.netbox.client.model.Supply;
import de.codemakers.netbox.client.model.Type3;
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
 * PowerFeed
 */
@JsonPropertyOrder({
  PowerFeed.JSON_PROPERTY_ID,
  PowerFeed.JSON_PROPERTY_URL,
  PowerFeed.JSON_PROPERTY_DISPLAY,
  PowerFeed.JSON_PROPERTY_POWER_PANEL,
  PowerFeed.JSON_PROPERTY_RACK,
  PowerFeed.JSON_PROPERTY_NAME,
  PowerFeed.JSON_PROPERTY_STATUS,
  PowerFeed.JSON_PROPERTY_TYPE,
  PowerFeed.JSON_PROPERTY_SUPPLY,
  PowerFeed.JSON_PROPERTY_PHASE,
  PowerFeed.JSON_PROPERTY_VOLTAGE,
  PowerFeed.JSON_PROPERTY_AMPERAGE,
  PowerFeed.JSON_PROPERTY_MAX_UTILIZATION,
  PowerFeed.JSON_PROPERTY_COMMENTS,
  PowerFeed.JSON_PROPERTY_MARK_CONNECTED,
  PowerFeed.JSON_PROPERTY_CABLE,
  PowerFeed.JSON_PROPERTY_LINK_PEER,
  PowerFeed.JSON_PROPERTY_LINK_PEER_TYPE,
  PowerFeed.JSON_PROPERTY_CONNECTED_ENDPOINT,
  PowerFeed.JSON_PROPERTY_CONNECTED_ENDPOINT_TYPE,
  PowerFeed.JSON_PROPERTY_CONNECTED_ENDPOINT_REACHABLE,
  PowerFeed.JSON_PROPERTY_TAGS,
  PowerFeed.JSON_PROPERTY_CUSTOM_FIELDS,
  PowerFeed.JSON_PROPERTY_CREATED,
  PowerFeed.JSON_PROPERTY_LAST_UPDATED,
  PowerFeed.JSON_PROPERTY_OCCUPIED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T18:36:37.665487300+02:00[Europe/Berlin]")
public class PowerFeed {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_POWER_PANEL = "power_panel";
  private NestedPowerPanel powerPanel;

  public static final String JSON_PROPERTY_RACK = "rack";
  private JsonNullable<NestedRack> rack = JsonNullable.<NestedRack>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status3 status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Type3 type;

  public static final String JSON_PROPERTY_SUPPLY = "supply";
  private Supply supply;

  public static final String JSON_PROPERTY_PHASE = "phase";
  private Phase phase;

  public static final String JSON_PROPERTY_VOLTAGE = "voltage";
  private Integer voltage;

  public static final String JSON_PROPERTY_AMPERAGE = "amperage";
  private Integer amperage;

  public static final String JSON_PROPERTY_MAX_UTILIZATION = "max_utilization";
  private Integer maxUtilization;

  public static final String JSON_PROPERTY_COMMENTS = "comments";
  private String comments;

  public static final String JSON_PROPERTY_MARK_CONNECTED = "mark_connected";
  private Boolean markConnected;

  public static final String JSON_PROPERTY_CABLE = "cable";
  private NestedCable cable;

  public static final String JSON_PROPERTY_LINK_PEER = "link_peer";
  private Map<String, String> linkPeer = null;

  public static final String JSON_PROPERTY_LINK_PEER_TYPE = "link_peer_type";
  private String linkPeerType;

  public static final String JSON_PROPERTY_CONNECTED_ENDPOINT = "connected_endpoint";
  private Map<String, String> connectedEndpoint = null;

  public static final String JSON_PROPERTY_CONNECTED_ENDPOINT_TYPE = "connected_endpoint_type";
  private String connectedEndpointType;

  public static final String JSON_PROPERTY_CONNECTED_ENDPOINT_REACHABLE = "connected_endpoint_reachable";
  private Boolean connectedEndpointReachable;

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

  public PowerFeed() { 
  }

  @JsonCreator
  public PowerFeed(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_LINK_PEER) Map<String, String> linkPeer, 
    @JsonProperty(JSON_PROPERTY_LINK_PEER_TYPE) String linkPeerType, 
    @JsonProperty(JSON_PROPERTY_CONNECTED_ENDPOINT) Map<String, String> connectedEndpoint, 
    @JsonProperty(JSON_PROPERTY_CONNECTED_ENDPOINT_TYPE) String connectedEndpointType, 
    @JsonProperty(JSON_PROPERTY_CONNECTED_ENDPOINT_REACHABLE) Boolean connectedEndpointReachable, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED) OffsetDateTime lastUpdated, 
    @JsonProperty(JSON_PROPERTY_OCCUPIED) Boolean occupied
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.linkPeer = linkPeer;
    this.linkPeerType = linkPeerType;
    this.connectedEndpoint = connectedEndpoint;
    this.connectedEndpointType = connectedEndpointType;
    this.connectedEndpointReachable = connectedEndpointReachable;
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




  public PowerFeed powerPanel(NestedPowerPanel powerPanel) {
    this.powerPanel = powerPanel;
    return this;
  }

   /**
   * Get powerPanel
   * @return powerPanel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POWER_PANEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NestedPowerPanel getPowerPanel() {
    return powerPanel;
  }


  @JsonProperty(JSON_PROPERTY_POWER_PANEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPowerPanel(NestedPowerPanel powerPanel) {
    this.powerPanel = powerPanel;
  }


  public PowerFeed rack(NestedRack rack) {
    this.rack = JsonNullable.<NestedRack>of(rack);
    return this;
  }

   /**
   * Get rack
   * @return rack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public NestedRack getRack() {
        return rack.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NestedRack> getRack_JsonNullable() {
    return rack;
  }
  
  @JsonProperty(JSON_PROPERTY_RACK)
  public void setRack_JsonNullable(JsonNullable<NestedRack> rack) {
    this.rack = rack;
  }

  public void setRack(NestedRack rack) {
    this.rack = JsonNullable.<NestedRack>of(rack);
  }


  public PowerFeed name(String name) {
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


  public PowerFeed status(Status3 status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Status3 getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Status3 status) {
    this.status = status;
  }


  public PowerFeed type(Type3 type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Type3 getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Type3 type) {
    this.type = type;
  }


  public PowerFeed supply(Supply supply) {
    this.supply = supply;
    return this;
  }

   /**
   * Get supply
   * @return supply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Supply getSupply() {
    return supply;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupply(Supply supply) {
    this.supply = supply;
  }


  public PowerFeed phase(Phase phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Phase getPhase() {
    return phase;
  }


  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhase(Phase phase) {
    this.phase = phase;
  }


  public PowerFeed voltage(Integer voltage) {
    this.voltage = voltage;
    return this;
  }

   /**
   * Get voltage
   * minimum: -32768
   * maximum: 32767
   * @return voltage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVoltage() {
    return voltage;
  }


  @JsonProperty(JSON_PROPERTY_VOLTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoltage(Integer voltage) {
    this.voltage = voltage;
  }


  public PowerFeed amperage(Integer amperage) {
    this.amperage = amperage;
    return this;
  }

   /**
   * Get amperage
   * minimum: 1
   * maximum: 32767
   * @return amperage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMPERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmperage() {
    return amperage;
  }


  @JsonProperty(JSON_PROPERTY_AMPERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmperage(Integer amperage) {
    this.amperage = amperage;
  }


  public PowerFeed maxUtilization(Integer maxUtilization) {
    this.maxUtilization = maxUtilization;
    return this;
  }

   /**
   * Maximum permissible draw (percentage)
   * minimum: 1
   * maximum: 100
   * @return maxUtilization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum permissible draw (percentage)")
  @JsonProperty(JSON_PROPERTY_MAX_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxUtilization() {
    return maxUtilization;
  }


  @JsonProperty(JSON_PROPERTY_MAX_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxUtilization(Integer maxUtilization) {
    this.maxUtilization = maxUtilization;
  }


  public PowerFeed comments(String comments) {
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


  public PowerFeed markConnected(Boolean markConnected) {
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


  public PowerFeed cable(NestedCable cable) {
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
   *  Return the appropriate serializer for the link termination model. 
   * @return linkPeer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Return the appropriate serializer for the link termination model. ")
  @JsonProperty(JSON_PROPERTY_LINK_PEER)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getLinkPeer() {
    return linkPeer;
  }




   /**
   * Get linkPeerType
   * @return linkPeerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK_PEER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkPeerType() {
    return linkPeerType;
  }




   /**
   *  Return the appropriate serializer for the type of connected object. 
   * @return connectedEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Return the appropriate serializer for the type of connected object. ")
  @JsonProperty(JSON_PROPERTY_CONNECTED_ENDPOINT)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getConnectedEndpoint() {
    return connectedEndpoint;
  }




   /**
   * Get connectedEndpointType
   * @return connectedEndpointType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTED_ENDPOINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectedEndpointType() {
    return connectedEndpointType;
  }




   /**
   * Get connectedEndpointReachable
   * @return connectedEndpointReachable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTED_ENDPOINT_REACHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConnectedEndpointReachable() {
    return connectedEndpointReachable;
  }




  public PowerFeed tags(List<NestedTag> tags) {
    this.tags = tags;
    return this;
  }

  public PowerFeed addTagsItem(NestedTag tagsItem) {
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


  public PowerFeed customFields(Object customFields) {
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
   * Return true if this PowerFeed object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerFeed powerFeed = (PowerFeed) o;
    return Objects.equals(this.id, powerFeed.id) &&
        Objects.equals(this.url, powerFeed.url) &&
        Objects.equals(this.display, powerFeed.display) &&
        Objects.equals(this.powerPanel, powerFeed.powerPanel) &&
        equalsNullable(this.rack, powerFeed.rack) &&
        Objects.equals(this.name, powerFeed.name) &&
        Objects.equals(this.status, powerFeed.status) &&
        Objects.equals(this.type, powerFeed.type) &&
        Objects.equals(this.supply, powerFeed.supply) &&
        Objects.equals(this.phase, powerFeed.phase) &&
        Objects.equals(this.voltage, powerFeed.voltage) &&
        Objects.equals(this.amperage, powerFeed.amperage) &&
        Objects.equals(this.maxUtilization, powerFeed.maxUtilization) &&
        Objects.equals(this.comments, powerFeed.comments) &&
        Objects.equals(this.markConnected, powerFeed.markConnected) &&
        Objects.equals(this.cable, powerFeed.cable) &&
        Objects.equals(this.linkPeer, powerFeed.linkPeer) &&
        Objects.equals(this.linkPeerType, powerFeed.linkPeerType) &&
        Objects.equals(this.connectedEndpoint, powerFeed.connectedEndpoint) &&
        Objects.equals(this.connectedEndpointType, powerFeed.connectedEndpointType) &&
        Objects.equals(this.connectedEndpointReachable, powerFeed.connectedEndpointReachable) &&
        Objects.equals(this.tags, powerFeed.tags) &&
        Objects.equals(this.customFields, powerFeed.customFields) &&
        Objects.equals(this.created, powerFeed.created) &&
        Objects.equals(this.lastUpdated, powerFeed.lastUpdated) &&
        Objects.equals(this.occupied, powerFeed.occupied);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, powerPanel, hashCodeNullable(rack), name, status, type, supply, phase, voltage, amperage, maxUtilization, comments, markConnected, cable, linkPeer, linkPeerType, connectedEndpoint, connectedEndpointType, connectedEndpointReachable, tags, customFields, created, lastUpdated, occupied);
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
    sb.append("class PowerFeed {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    powerPanel: ").append(toIndentedString(powerPanel)).append("\n");
    sb.append("    rack: ").append(toIndentedString(rack)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supply: ").append(toIndentedString(supply)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    voltage: ").append(toIndentedString(voltage)).append("\n");
    sb.append("    amperage: ").append(toIndentedString(amperage)).append("\n");
    sb.append("    maxUtilization: ").append(toIndentedString(maxUtilization)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    markConnected: ").append(toIndentedString(markConnected)).append("\n");
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    linkPeer: ").append(toIndentedString(linkPeer)).append("\n");
    sb.append("    linkPeerType: ").append(toIndentedString(linkPeerType)).append("\n");
    sb.append("    connectedEndpoint: ").append(toIndentedString(connectedEndpoint)).append("\n");
    sb.append("    connectedEndpointType: ").append(toIndentedString(connectedEndpointType)).append("\n");
    sb.append("    connectedEndpointReachable: ").append(toIndentedString(connectedEndpointReachable)).append("\n");
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


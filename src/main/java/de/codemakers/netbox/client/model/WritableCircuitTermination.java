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
import de.codemakers.netbox.client.model.NestedCable;
import de.codemakers.netbox.client.model.NestedTag;
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
 * WritableCircuitTermination
 */
@JsonPropertyOrder({
  WritableCircuitTermination.JSON_PROPERTY_ID,
  WritableCircuitTermination.JSON_PROPERTY_URL,
  WritableCircuitTermination.JSON_PROPERTY_DISPLAY,
  WritableCircuitTermination.JSON_PROPERTY_CIRCUIT,
  WritableCircuitTermination.JSON_PROPERTY_TERM_SIDE,
  WritableCircuitTermination.JSON_PROPERTY_SITE,
  WritableCircuitTermination.JSON_PROPERTY_PROVIDER_NETWORK,
  WritableCircuitTermination.JSON_PROPERTY_PORT_SPEED,
  WritableCircuitTermination.JSON_PROPERTY_UPSTREAM_SPEED,
  WritableCircuitTermination.JSON_PROPERTY_XCONNECT_ID,
  WritableCircuitTermination.JSON_PROPERTY_PP_INFO,
  WritableCircuitTermination.JSON_PROPERTY_DESCRIPTION,
  WritableCircuitTermination.JSON_PROPERTY_MARK_CONNECTED,
  WritableCircuitTermination.JSON_PROPERTY_CABLE,
  WritableCircuitTermination.JSON_PROPERTY_CABLE_END,
  WritableCircuitTermination.JSON_PROPERTY_LINK_PEERS,
  WritableCircuitTermination.JSON_PROPERTY_LINK_PEERS_TYPE,
  WritableCircuitTermination.JSON_PROPERTY_TAGS,
  WritableCircuitTermination.JSON_PROPERTY_CUSTOM_FIELDS,
  WritableCircuitTermination.JSON_PROPERTY_CREATED,
  WritableCircuitTermination.JSON_PROPERTY_LAST_UPDATED,
  WritableCircuitTermination.JSON_PROPERTY_OCCUPIED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class WritableCircuitTermination {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_CIRCUIT = "circuit";
  private Integer circuit;

  /**
   * Gets or Sets termSide
   */
  public enum TermSideEnum {
    A("A"),
    
    Z("Z"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TermSideEnum(String value) {
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
    public static TermSideEnum fromValue(String value) {
      for (TermSideEnum b : TermSideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_TERM_SIDE = "term_side";
  private TermSideEnum termSide;

  public static final String JSON_PROPERTY_SITE = "site";
  private JsonNullable<Integer> site = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_PROVIDER_NETWORK = "provider_network";
  private JsonNullable<Integer> providerNetwork = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_PORT_SPEED = "port_speed";
  private JsonNullable<Integer> portSpeed = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_UPSTREAM_SPEED = "upstream_speed";
  private JsonNullable<Integer> upstreamSpeed = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_XCONNECT_ID = "xconnect_id";
  private String xconnectId;

  public static final String JSON_PROPERTY_PP_INFO = "pp_info";
  private String ppInfo;

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

  public WritableCircuitTermination() { 
  }

  @JsonCreator
  public WritableCircuitTermination(
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




  public WritableCircuitTermination circuit(Integer circuit) {
    this.circuit = circuit;
    return this;
  }

   /**
   * Get circuit
   * @return circuit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CIRCUIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCircuit() {
    return circuit;
  }


  @JsonProperty(JSON_PROPERTY_CIRCUIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCircuit(Integer circuit) {
    this.circuit = circuit;
  }


  public WritableCircuitTermination termSide(TermSideEnum termSide) {
    this.termSide = termSide;
    return this;
  }

   /**
   * Get termSide
   * @return termSide
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TERM_SIDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TermSideEnum getTermSide() {
    return termSide;
  }


  @JsonProperty(JSON_PROPERTY_TERM_SIDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTermSide(TermSideEnum termSide) {
    this.termSide = termSide;
  }


  public WritableCircuitTermination site(Integer site) {
    this.site = JsonNullable.<Integer>of(site);
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getSite() {
        return site.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getSite_JsonNullable() {
    return site;
  }
  
  @JsonProperty(JSON_PROPERTY_SITE)
  public void setSite_JsonNullable(JsonNullable<Integer> site) {
    this.site = site;
  }

  public void setSite(Integer site) {
    this.site = JsonNullable.<Integer>of(site);
  }


  public WritableCircuitTermination providerNetwork(Integer providerNetwork) {
    this.providerNetwork = JsonNullable.<Integer>of(providerNetwork);
    return this;
  }

   /**
   * Get providerNetwork
   * @return providerNetwork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getProviderNetwork() {
        return providerNetwork.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getProviderNetwork_JsonNullable() {
    return providerNetwork;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_NETWORK)
  public void setProviderNetwork_JsonNullable(JsonNullable<Integer> providerNetwork) {
    this.providerNetwork = providerNetwork;
  }

  public void setProviderNetwork(Integer providerNetwork) {
    this.providerNetwork = JsonNullable.<Integer>of(providerNetwork);
  }


  public WritableCircuitTermination portSpeed(Integer portSpeed) {
    this.portSpeed = JsonNullable.<Integer>of(portSpeed);
    return this;
  }

   /**
   * Get portSpeed
   * minimum: 0
   * maximum: 2147483647
   * @return portSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getPortSpeed() {
        return portSpeed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PORT_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPortSpeed_JsonNullable() {
    return portSpeed;
  }
  
  @JsonProperty(JSON_PROPERTY_PORT_SPEED)
  public void setPortSpeed_JsonNullable(JsonNullable<Integer> portSpeed) {
    this.portSpeed = portSpeed;
  }

  public void setPortSpeed(Integer portSpeed) {
    this.portSpeed = JsonNullable.<Integer>of(portSpeed);
  }


  public WritableCircuitTermination upstreamSpeed(Integer upstreamSpeed) {
    this.upstreamSpeed = JsonNullable.<Integer>of(upstreamSpeed);
    return this;
  }

   /**
   * Upstream speed, if different from port speed
   * minimum: 0
   * maximum: 2147483647
   * @return upstreamSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Upstream speed, if different from port speed")
  @JsonIgnore

  public Integer getUpstreamSpeed() {
        return upstreamSpeed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPSTREAM_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getUpstreamSpeed_JsonNullable() {
    return upstreamSpeed;
  }
  
  @JsonProperty(JSON_PROPERTY_UPSTREAM_SPEED)
  public void setUpstreamSpeed_JsonNullable(JsonNullable<Integer> upstreamSpeed) {
    this.upstreamSpeed = upstreamSpeed;
  }

  public void setUpstreamSpeed(Integer upstreamSpeed) {
    this.upstreamSpeed = JsonNullable.<Integer>of(upstreamSpeed);
  }


  public WritableCircuitTermination xconnectId(String xconnectId) {
    this.xconnectId = xconnectId;
    return this;
  }

   /**
   * Get xconnectId
   * @return xconnectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_XCONNECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getXconnectId() {
    return xconnectId;
  }


  @JsonProperty(JSON_PROPERTY_XCONNECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXconnectId(String xconnectId) {
    this.xconnectId = xconnectId;
  }


  public WritableCircuitTermination ppInfo(String ppInfo) {
    this.ppInfo = ppInfo;
    return this;
  }

   /**
   * Get ppInfo
   * @return ppInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPpInfo() {
    return ppInfo;
  }


  @JsonProperty(JSON_PROPERTY_PP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPpInfo(String ppInfo) {
    this.ppInfo = ppInfo;
  }


  public WritableCircuitTermination description(String description) {
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


  public WritableCircuitTermination markConnected(Boolean markConnected) {
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


  public WritableCircuitTermination cable(NestedCable cable) {
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




  public WritableCircuitTermination tags(List<NestedTag> tags) {
    this.tags = tags;
    return this;
  }

  public WritableCircuitTermination addTagsItem(NestedTag tagsItem) {
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


  public WritableCircuitTermination customFields(Object customFields) {
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
   * Return true if this WritableCircuitTermination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableCircuitTermination writableCircuitTermination = (WritableCircuitTermination) o;
    return Objects.equals(this.id, writableCircuitTermination.id) &&
        Objects.equals(this.url, writableCircuitTermination.url) &&
        Objects.equals(this.display, writableCircuitTermination.display) &&
        Objects.equals(this.circuit, writableCircuitTermination.circuit) &&
        Objects.equals(this.termSide, writableCircuitTermination.termSide) &&
        equalsNullable(this.site, writableCircuitTermination.site) &&
        equalsNullable(this.providerNetwork, writableCircuitTermination.providerNetwork) &&
        equalsNullable(this.portSpeed, writableCircuitTermination.portSpeed) &&
        equalsNullable(this.upstreamSpeed, writableCircuitTermination.upstreamSpeed) &&
        Objects.equals(this.xconnectId, writableCircuitTermination.xconnectId) &&
        Objects.equals(this.ppInfo, writableCircuitTermination.ppInfo) &&
        Objects.equals(this.description, writableCircuitTermination.description) &&
        Objects.equals(this.markConnected, writableCircuitTermination.markConnected) &&
        Objects.equals(this.cable, writableCircuitTermination.cable) &&
        Objects.equals(this.cableEnd, writableCircuitTermination.cableEnd) &&
        Objects.equals(this.linkPeers, writableCircuitTermination.linkPeers) &&
        Objects.equals(this.linkPeersType, writableCircuitTermination.linkPeersType) &&
        Objects.equals(this.tags, writableCircuitTermination.tags) &&
        Objects.equals(this.customFields, writableCircuitTermination.customFields) &&
        Objects.equals(this.created, writableCircuitTermination.created) &&
        Objects.equals(this.lastUpdated, writableCircuitTermination.lastUpdated) &&
        Objects.equals(this.occupied, writableCircuitTermination.occupied);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, circuit, termSide, hashCodeNullable(site), hashCodeNullable(providerNetwork), hashCodeNullable(portSpeed), hashCodeNullable(upstreamSpeed), xconnectId, ppInfo, description, markConnected, cable, cableEnd, linkPeers, linkPeersType, tags, customFields, created, lastUpdated, occupied);
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
    sb.append("class WritableCircuitTermination {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    circuit: ").append(toIndentedString(circuit)).append("\n");
    sb.append("    termSide: ").append(toIndentedString(termSide)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    providerNetwork: ").append(toIndentedString(providerNetwork)).append("\n");
    sb.append("    portSpeed: ").append(toIndentedString(portSpeed)).append("\n");
    sb.append("    upstreamSpeed: ").append(toIndentedString(upstreamSpeed)).append("\n");
    sb.append("    xconnectId: ").append(toIndentedString(xconnectId)).append("\n");
    sb.append("    ppInfo: ").append(toIndentedString(ppInfo)).append("\n");
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


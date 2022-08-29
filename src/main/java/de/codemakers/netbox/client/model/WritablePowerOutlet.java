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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.codemakers.netbox.client.model.NestedCable;
import de.codemakers.netbox.client.model.NestedTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.codemakers.netbox.client.JSON;

/**
 * WritablePowerOutlet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritablePowerOutlet {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private Integer device;

  public static final String SERIALIZED_NAME_MODULE = "module";
  @SerializedName(SERIALIZED_NAME_MODULE)
  private Integer module;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  /**
   * Physical port type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    IEC_60320_C5("iec-60320-c5"),
    
    IEC_60320_C7("iec-60320-c7"),
    
    IEC_60320_C13("iec-60320-c13"),
    
    IEC_60320_C15("iec-60320-c15"),
    
    IEC_60320_C19("iec-60320-c19"),
    
    IEC_60320_C21("iec-60320-c21"),
    
    IEC_60309_P_N_E_4H("iec-60309-p-n-e-4h"),
    
    IEC_60309_P_N_E_6H("iec-60309-p-n-e-6h"),
    
    IEC_60309_P_N_E_9H("iec-60309-p-n-e-9h"),
    
    IEC_60309_2P_E_4H("iec-60309-2p-e-4h"),
    
    IEC_60309_2P_E_6H("iec-60309-2p-e-6h"),
    
    IEC_60309_2P_E_9H("iec-60309-2p-e-9h"),
    
    IEC_60309_3P_E_4H("iec-60309-3p-e-4h"),
    
    IEC_60309_3P_E_6H("iec-60309-3p-e-6h"),
    
    IEC_60309_3P_E_9H("iec-60309-3p-e-9h"),
    
    IEC_60309_3P_N_E_4H("iec-60309-3p-n-e-4h"),
    
    IEC_60309_3P_N_E_6H("iec-60309-3p-n-e-6h"),
    
    IEC_60309_3P_N_E_9H("iec-60309-3p-n-e-9h"),
    
    NEMA_1_15R("nema-1-15r"),
    
    NEMA_5_15R("nema-5-15r"),
    
    NEMA_5_20R("nema-5-20r"),
    
    NEMA_5_30R("nema-5-30r"),
    
    NEMA_5_50R("nema-5-50r"),
    
    NEMA_6_15R("nema-6-15r"),
    
    NEMA_6_20R("nema-6-20r"),
    
    NEMA_6_30R("nema-6-30r"),
    
    NEMA_6_50R("nema-6-50r"),
    
    NEMA_10_30R("nema-10-30r"),
    
    NEMA_10_50R("nema-10-50r"),
    
    NEMA_14_20R("nema-14-20r"),
    
    NEMA_14_30R("nema-14-30r"),
    
    NEMA_14_50R("nema-14-50r"),
    
    NEMA_14_60R("nema-14-60r"),
    
    NEMA_15_15R("nema-15-15r"),
    
    NEMA_15_20R("nema-15-20r"),
    
    NEMA_15_30R("nema-15-30r"),
    
    NEMA_15_50R("nema-15-50r"),
    
    NEMA_15_60R("nema-15-60r"),
    
    NEMA_L1_15R("nema-l1-15r"),
    
    NEMA_L5_15R("nema-l5-15r"),
    
    NEMA_L5_20R("nema-l5-20r"),
    
    NEMA_L5_30R("nema-l5-30r"),
    
    NEMA_L5_50R("nema-l5-50r"),
    
    NEMA_L6_15R("nema-l6-15r"),
    
    NEMA_L6_20R("nema-l6-20r"),
    
    NEMA_L6_30R("nema-l6-30r"),
    
    NEMA_L6_50R("nema-l6-50r"),
    
    NEMA_L10_30R("nema-l10-30r"),
    
    NEMA_L14_20R("nema-l14-20r"),
    
    NEMA_L14_30R("nema-l14-30r"),
    
    NEMA_L14_50R("nema-l14-50r"),
    
    NEMA_L14_60R("nema-l14-60r"),
    
    NEMA_L15_20R("nema-l15-20r"),
    
    NEMA_L15_30R("nema-l15-30r"),
    
    NEMA_L15_50R("nema-l15-50r"),
    
    NEMA_L15_60R("nema-l15-60r"),
    
    NEMA_L21_20R("nema-l21-20r"),
    
    NEMA_L21_30R("nema-l21-30r"),
    
    NEMA_L22_30R("nema-l22-30r"),
    
    CS6360C("CS6360C"),
    
    CS6364C("CS6364C"),
    
    CS8164C("CS8164C"),
    
    CS8264C("CS8264C"),
    
    CS8364C("CS8364C"),
    
    CS8464C("CS8464C"),
    
    ITA_E("ita-e"),
    
    ITA_F("ita-f"),
    
    ITA_G("ita-g"),
    
    ITA_H("ita-h"),
    
    ITA_I("ita-i"),
    
    ITA_J("ita-j"),
    
    ITA_K("ita-k"),
    
    ITA_L("ita-l"),
    
    ITA_M("ita-m"),
    
    ITA_N("ita-n"),
    
    ITA_O("ita-o"),
    
    ITA_MULTISTANDARD("ita-multistandard"),
    
    USB_A("usb-a"),
    
    USB_MICRO_B("usb-micro-b"),
    
    USB_C("usb-c"),
    
    DC_TERMINAL("dc-terminal"),
    
    HDOT_CX("hdot-cx"),
    
    SAF_D_GRID("saf-d-grid"),
    
    NEUTRIK_POWERCON_20A("neutrik-powercon-20a"),
    
    NEUTRIK_POWERCON_32A("neutrik-powercon-32a"),
    
    NEUTRIK_POWERCON_TRUE1("neutrik-powercon-true1"),
    
    NEUTRIK_POWERCON_TRUE1_TOP("neutrik-powercon-true1-top"),
    
    UBIQUITI_SMARTPOWER("ubiquiti-smartpower"),
    
    HARDWIRED("hardwired"),
    
    OTHER("other"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_POWER_PORT = "power_port";
  @SerializedName(SERIALIZED_NAME_POWER_PORT)
  private Integer powerPort;

  /**
   * Phase (for three-phase feeds)
   */
  @JsonAdapter(FeedLegEnum.Adapter.class)
  public enum FeedLegEnum {
    A("A"),
    
    B("B"),
    
    C("C"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    FeedLegEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeedLegEnum fromValue(String value) {
      for (FeedLegEnum b : FeedLegEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeedLegEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeedLegEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeedLegEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeedLegEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEED_LEG = "feed_leg";
  @SerializedName(SERIALIZED_NAME_FEED_LEG)
  private FeedLegEnum feedLeg;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MARK_CONNECTED = "mark_connected";
  @SerializedName(SERIALIZED_NAME_MARK_CONNECTED)
  private Boolean markConnected;

  public static final String SERIALIZED_NAME_CABLE = "cable";
  @SerializedName(SERIALIZED_NAME_CABLE)
  private NestedCable cable;

  public static final String SERIALIZED_NAME_CABLE_END = "cable_end";
  @SerializedName(SERIALIZED_NAME_CABLE_END)
  private String cableEnd;

  public static final String SERIALIZED_NAME_LINK_PEERS = "link_peers";
  @SerializedName(SERIALIZED_NAME_LINK_PEERS)
  private List<String> linkPeers = null;

  public static final String SERIALIZED_NAME_LINK_PEERS_TYPE = "link_peers_type";
  @SerializedName(SERIALIZED_NAME_LINK_PEERS_TYPE)
  private String linkPeersType;

  public static final String SERIALIZED_NAME_CONNECTED_ENDPOINTS = "connected_endpoints";
  @SerializedName(SERIALIZED_NAME_CONNECTED_ENDPOINTS)
  private List<String> connectedEndpoints = null;

  public static final String SERIALIZED_NAME_CONNECTED_ENDPOINTS_TYPE = "connected_endpoints_type";
  @SerializedName(SERIALIZED_NAME_CONNECTED_ENDPOINTS_TYPE)
  private String connectedEndpointsType;

  public static final String SERIALIZED_NAME_CONNECTED_ENDPOINTS_REACHABLE = "connected_endpoints_reachable";
  @SerializedName(SERIALIZED_NAME_CONNECTED_ENDPOINTS_REACHABLE)
  private Boolean connectedEndpointsReachable;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<NestedTag> tags = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Object customFields;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_OCCUPIED = "_occupied";
  @SerializedName(SERIALIZED_NAME_OCCUPIED)
  private Boolean occupied;

  public WritablePowerOutlet() { 
  }

  
  public WritablePowerOutlet(
     Integer id, 
     URI url, 
     String display, 
     String cableEnd, 
     List<String> linkPeers, 
     String linkPeersType, 
     List<String> connectedEndpoints, 
     String connectedEndpointsType, 
     Boolean connectedEndpointsReachable, 
     OffsetDateTime created, 
     OffsetDateTime lastUpdated, 
     Boolean occupied
  ) {
    this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.cableEnd = cableEnd;
    this.linkPeers = linkPeers;
    this.linkPeersType = linkPeersType;
    this.connectedEndpoints = connectedEndpoints;
    this.connectedEndpointsType = connectedEndpointsType;
    this.connectedEndpointsReachable = connectedEndpointsReachable;
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

  public Integer getId() {
    return id;
  }




   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getUrl() {
    return url;
  }




   /**
   * Get display
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplay() {
    return display;
  }




  public WritablePowerOutlet device(Integer device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDevice() {
    return device;
  }


  public void setDevice(Integer device) {
    this.device = device;
  }


  public WritablePowerOutlet module(Integer module) {
    
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getModule() {
    return module;
  }


  public void setModule(Integer module) {
    this.module = module;
  }


  public WritablePowerOutlet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WritablePowerOutlet label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Physical label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Physical label")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public WritablePowerOutlet type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Physical port type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Physical port type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WritablePowerOutlet powerPort(Integer powerPort) {
    
    this.powerPort = powerPort;
    return this;
  }

   /**
   * Get powerPort
   * @return powerPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPowerPort() {
    return powerPort;
  }


  public void setPowerPort(Integer powerPort) {
    this.powerPort = powerPort;
  }


  public WritablePowerOutlet feedLeg(FeedLegEnum feedLeg) {
    
    this.feedLeg = feedLeg;
    return this;
  }

   /**
   * Phase (for three-phase feeds)
   * @return feedLeg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phase (for three-phase feeds)")

  public FeedLegEnum getFeedLeg() {
    return feedLeg;
  }


  public void setFeedLeg(FeedLegEnum feedLeg) {
    this.feedLeg = feedLeg;
  }


  public WritablePowerOutlet description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WritablePowerOutlet markConnected(Boolean markConnected) {
    
    this.markConnected = markConnected;
    return this;
  }

   /**
   * Treat as if a cable is connected
   * @return markConnected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Treat as if a cable is connected")

  public Boolean getMarkConnected() {
    return markConnected;
  }


  public void setMarkConnected(Boolean markConnected) {
    this.markConnected = markConnected;
  }


  public WritablePowerOutlet cable(NestedCable cable) {
    
    this.cable = cable;
    return this;
  }

   /**
   * Get cable
   * @return cable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedCable getCable() {
    return cable;
  }


  public void setCable(NestedCable cable) {
    this.cable = cable;
  }


   /**
   * Get cableEnd
   * @return cableEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCableEnd() {
    return cableEnd;
  }




   /**
   *  Return the appropriate serializer for the link termination model. 
   * @return linkPeers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Return the appropriate serializer for the link termination model. ")

  public List<String> getLinkPeers() {
    return linkPeers;
  }




   /**
   * Get linkPeersType
   * @return linkPeersType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLinkPeersType() {
    return linkPeersType;
  }




   /**
   *  Return the appropriate serializer for the type of connected object. 
   * @return connectedEndpoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Return the appropriate serializer for the type of connected object. ")

  public List<String> getConnectedEndpoints() {
    return connectedEndpoints;
  }




   /**
   * Get connectedEndpointsType
   * @return connectedEndpointsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectedEndpointsType() {
    return connectedEndpointsType;
  }




   /**
   * Get connectedEndpointsReachable
   * @return connectedEndpointsReachable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getConnectedEndpointsReachable() {
    return connectedEndpointsReachable;
  }




  public WritablePowerOutlet tags(List<NestedTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public WritablePowerOutlet addTagsItem(NestedTag tagsItem) {
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

  public List<NestedTag> getTags() {
    return tags;
  }


  public void setTags(List<NestedTag> tags) {
    this.tags = tags;
  }


  public WritablePowerOutlet customFields(Object customFields) {
    
    this.customFields = customFields;
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }


   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }




   /**
   * Get occupied
   * @return occupied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOccupied() {
    return occupied;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritablePowerOutlet writablePowerOutlet = (WritablePowerOutlet) o;
    return Objects.equals(this.id, writablePowerOutlet.id) &&
        Objects.equals(this.url, writablePowerOutlet.url) &&
        Objects.equals(this.display, writablePowerOutlet.display) &&
        Objects.equals(this.device, writablePowerOutlet.device) &&
        Objects.equals(this.module, writablePowerOutlet.module) &&
        Objects.equals(this.name, writablePowerOutlet.name) &&
        Objects.equals(this.label, writablePowerOutlet.label) &&
        Objects.equals(this.type, writablePowerOutlet.type) &&
        Objects.equals(this.powerPort, writablePowerOutlet.powerPort) &&
        Objects.equals(this.feedLeg, writablePowerOutlet.feedLeg) &&
        Objects.equals(this.description, writablePowerOutlet.description) &&
        Objects.equals(this.markConnected, writablePowerOutlet.markConnected) &&
        Objects.equals(this.cable, writablePowerOutlet.cable) &&
        Objects.equals(this.cableEnd, writablePowerOutlet.cableEnd) &&
        Objects.equals(this.linkPeers, writablePowerOutlet.linkPeers) &&
        Objects.equals(this.linkPeersType, writablePowerOutlet.linkPeersType) &&
        Objects.equals(this.connectedEndpoints, writablePowerOutlet.connectedEndpoints) &&
        Objects.equals(this.connectedEndpointsType, writablePowerOutlet.connectedEndpointsType) &&
        Objects.equals(this.connectedEndpointsReachable, writablePowerOutlet.connectedEndpointsReachable) &&
        Objects.equals(this.tags, writablePowerOutlet.tags) &&
        Objects.equals(this.customFields, writablePowerOutlet.customFields) &&
        Objects.equals(this.created, writablePowerOutlet.created) &&
        Objects.equals(this.lastUpdated, writablePowerOutlet.lastUpdated) &&
        Objects.equals(this.occupied, writablePowerOutlet.occupied);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, device, module, name, label, type, powerPort, feedLeg, description, markConnected, cable, cableEnd, linkPeers, linkPeersType, connectedEndpoints, connectedEndpointsType, connectedEndpointsReachable, tags, customFields, created, lastUpdated, occupied);
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
    sb.append("class WritablePowerOutlet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    powerPort: ").append(toIndentedString(powerPort)).append("\n");
    sb.append("    feedLeg: ").append(toIndentedString(feedLeg)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    markConnected: ").append(toIndentedString(markConnected)).append("\n");
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    cableEnd: ").append(toIndentedString(cableEnd)).append("\n");
    sb.append("    linkPeers: ").append(toIndentedString(linkPeers)).append("\n");
    sb.append("    linkPeersType: ").append(toIndentedString(linkPeersType)).append("\n");
    sb.append("    connectedEndpoints: ").append(toIndentedString(connectedEndpoints)).append("\n");
    sb.append("    connectedEndpointsType: ").append(toIndentedString(connectedEndpointsType)).append("\n");
    sb.append("    connectedEndpointsReachable: ").append(toIndentedString(connectedEndpointsReachable)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("url");
    openapiFields.add("display");
    openapiFields.add("device");
    openapiFields.add("module");
    openapiFields.add("name");
    openapiFields.add("label");
    openapiFields.add("type");
    openapiFields.add("power_port");
    openapiFields.add("feed_leg");
    openapiFields.add("description");
    openapiFields.add("mark_connected");
    openapiFields.add("cable");
    openapiFields.add("cable_end");
    openapiFields.add("link_peers");
    openapiFields.add("link_peers_type");
    openapiFields.add("connected_endpoints");
    openapiFields.add("connected_endpoints_type");
    openapiFields.add("connected_endpoints_reachable");
    openapiFields.add("tags");
    openapiFields.add("custom_fields");
    openapiFields.add("created");
    openapiFields.add("last_updated");
    openapiFields.add("_occupied");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WritablePowerOutlet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WritablePowerOutlet.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WritablePowerOutlet is not found in the empty JSON string", WritablePowerOutlet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WritablePowerOutlet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritablePowerOutlet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WritablePowerOutlet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (jsonObj.get("display") != null && !jsonObj.get("display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("feed_leg") != null && !jsonObj.get("feed_leg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feed_leg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feed_leg").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `cable`
      if (jsonObj.getAsJsonObject("cable") != null) {
        NestedCable.validateJsonObject(jsonObj.getAsJsonObject("cable"));
      }
      if (jsonObj.get("cable_end") != null && !jsonObj.get("cable_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cable_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cable_end").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("link_peers") != null && !jsonObj.get("link_peers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_peers` to be an array in the JSON string but got `%s`", jsonObj.get("link_peers").toString()));
      }
      if (jsonObj.get("link_peers_type") != null && !jsonObj.get("link_peers_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_peers_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_peers_type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("connected_endpoints") != null && !jsonObj.get("connected_endpoints").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `connected_endpoints` to be an array in the JSON string but got `%s`", jsonObj.get("connected_endpoints").toString()));
      }
      if (jsonObj.get("connected_endpoints_type") != null && !jsonObj.get("connected_endpoints_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connected_endpoints_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connected_endpoints_type").toString()));
      }
      JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
      if (jsonArraytags != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tags").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
        }

        // validate the optional field `tags` (array)
        for (int i = 0; i < jsonArraytags.size(); i++) {
          NestedTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WritablePowerOutlet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WritablePowerOutlet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WritablePowerOutlet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WritablePowerOutlet.class));

       return (TypeAdapter<T>) new TypeAdapter<WritablePowerOutlet>() {
           @Override
           public void write(JsonWriter out, WritablePowerOutlet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WritablePowerOutlet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WritablePowerOutlet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WritablePowerOutlet
  * @throws IOException if the JSON string is invalid with respect to WritablePowerOutlet
  */
  public static WritablePowerOutlet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WritablePowerOutlet.class);
  }

 /**
  * Convert an instance of WritablePowerOutlet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


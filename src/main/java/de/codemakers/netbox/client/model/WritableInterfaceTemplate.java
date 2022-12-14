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
 * WritableInterfaceTemplate
 */
@JsonPropertyOrder({
  WritableInterfaceTemplate.JSON_PROPERTY_ID,
  WritableInterfaceTemplate.JSON_PROPERTY_URL,
  WritableInterfaceTemplate.JSON_PROPERTY_DISPLAY,
  WritableInterfaceTemplate.JSON_PROPERTY_DEVICE_TYPE,
  WritableInterfaceTemplate.JSON_PROPERTY_MODULE_TYPE,
  WritableInterfaceTemplate.JSON_PROPERTY_NAME,
  WritableInterfaceTemplate.JSON_PROPERTY_LABEL,
  WritableInterfaceTemplate.JSON_PROPERTY_TYPE,
  WritableInterfaceTemplate.JSON_PROPERTY_MGMT_ONLY,
  WritableInterfaceTemplate.JSON_PROPERTY_DESCRIPTION,
  WritableInterfaceTemplate.JSON_PROPERTY_POE_MODE,
  WritableInterfaceTemplate.JSON_PROPERTY_POE_TYPE,
  WritableInterfaceTemplate.JSON_PROPERTY_CREATED,
  WritableInterfaceTemplate.JSON_PROPERTY_LAST_UPDATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class WritableInterfaceTemplate {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "device_type";
  private Integer deviceType;

  public static final String JSON_PROPERTY_MODULE_TYPE = "module_type";
  private Integer moduleType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    VIRTUAL("virtual"),
    
    BRIDGE("bridge"),
    
    LAG("lag"),
    
    _100BASE_TX("100base-tx"),
    
    _1000BASE_T("1000base-t"),
    
    _2_5GBASE_T("2.5gbase-t"),
    
    _5GBASE_T("5gbase-t"),
    
    _10GBASE_T("10gbase-t"),
    
    _10GBASE_CX4("10gbase-cx4"),
    
    _1000BASE_X_GBIC("1000base-x-gbic"),
    
    _1000BASE_X_SFP("1000base-x-sfp"),
    
    _10GBASE_X_SFPP("10gbase-x-sfpp"),
    
    _10GBASE_X_XFP("10gbase-x-xfp"),
    
    _10GBASE_X_XENPAK("10gbase-x-xenpak"),
    
    _10GBASE_X_X2("10gbase-x-x2"),
    
    _25GBASE_X_SFP28("25gbase-x-sfp28"),
    
    _50GBASE_X_SFP56("50gbase-x-sfp56"),
    
    _40GBASE_X_QSFPP("40gbase-x-qsfpp"),
    
    _50GBASE_X_SFP28("50gbase-x-sfp28"),
    
    _100GBASE_X_CFP("100gbase-x-cfp"),
    
    _100GBASE_X_CFP2("100gbase-x-cfp2"),
    
    _200GBASE_X_CFP2("200gbase-x-cfp2"),
    
    _100GBASE_X_CFP4("100gbase-x-cfp4"),
    
    _100GBASE_X_CPAK("100gbase-x-cpak"),
    
    _100GBASE_X_QSFP28("100gbase-x-qsfp28"),
    
    _200GBASE_X_QSFP56("200gbase-x-qsfp56"),
    
    _400GBASE_X_QSFPDD("400gbase-x-qsfpdd"),
    
    _400GBASE_X_OSFP("400gbase-x-osfp"),
    
    IEEE802_11A("ieee802.11a"),
    
    IEEE802_11G("ieee802.11g"),
    
    IEEE802_11N("ieee802.11n"),
    
    IEEE802_11AC("ieee802.11ac"),
    
    IEEE802_11AD("ieee802.11ad"),
    
    IEEE802_11AX("ieee802.11ax"),
    
    IEEE802_11AY("ieee802.11ay"),
    
    IEEE802_15_1("ieee802.15.1"),
    
    OTHER_WIRELESS("other-wireless"),
    
    GSM("gsm"),
    
    CDMA("cdma"),
    
    LTE("lte"),
    
    SONET_OC3("sonet-oc3"),
    
    SONET_OC12("sonet-oc12"),
    
    SONET_OC48("sonet-oc48"),
    
    SONET_OC192("sonet-oc192"),
    
    SONET_OC768("sonet-oc768"),
    
    SONET_OC1920("sonet-oc1920"),
    
    SONET_OC3840("sonet-oc3840"),
    
    _1GFC_SFP("1gfc-sfp"),
    
    _2GFC_SFP("2gfc-sfp"),
    
    _4GFC_SFP("4gfc-sfp"),
    
    _8GFC_SFPP("8gfc-sfpp"),
    
    _16GFC_SFPP("16gfc-sfpp"),
    
    _32GFC_SFP28("32gfc-sfp28"),
    
    _64GFC_QSFPP("64gfc-qsfpp"),
    
    _128GFC_QSFP28("128gfc-qsfp28"),
    
    INFINIBAND_SDR("infiniband-sdr"),
    
    INFINIBAND_DDR("infiniband-ddr"),
    
    INFINIBAND_QDR("infiniband-qdr"),
    
    INFINIBAND_FDR10("infiniband-fdr10"),
    
    INFINIBAND_FDR("infiniband-fdr"),
    
    INFINIBAND_EDR("infiniband-edr"),
    
    INFINIBAND_HDR("infiniband-hdr"),
    
    INFINIBAND_NDR("infiniband-ndr"),
    
    INFINIBAND_XDR("infiniband-xdr"),
    
    T1("t1"),
    
    E1("e1"),
    
    T3("t3"),
    
    E3("e3"),
    
    XDSL("xdsl"),
    
    DOCSIS("docsis"),
    
    GPON("gpon"),
    
    XG_PON("xg-pon"),
    
    XGS_PON("xgs-pon"),
    
    NG_PON2("ng-pon2"),
    
    EPON("epon"),
    
    _10G_EPON("10g-epon"),
    
    CISCO_STACKWISE("cisco-stackwise"),
    
    CISCO_STACKWISE_PLUS("cisco-stackwise-plus"),
    
    CISCO_FLEXSTACK("cisco-flexstack"),
    
    CISCO_FLEXSTACK_PLUS("cisco-flexstack-plus"),
    
    CISCO_STACKWISE_80("cisco-stackwise-80"),
    
    CISCO_STACKWISE_160("cisco-stackwise-160"),
    
    CISCO_STACKWISE_320("cisco-stackwise-320"),
    
    CISCO_STACKWISE_480("cisco-stackwise-480"),
    
    JUNIPER_VCP("juniper-vcp"),
    
    EXTREME_SUMMITSTACK("extreme-summitstack"),
    
    EXTREME_SUMMITSTACK_128("extreme-summitstack-128"),
    
    EXTREME_SUMMITSTACK_256("extreme-summitstack-256"),
    
    EXTREME_SUMMITSTACK_512("extreme-summitstack-512"),
    
    OTHER("other"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_MGMT_ONLY = "mgmt_only";
  private Boolean mgmtOnly;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Gets or Sets poeMode
   */
  public enum PoeModeEnum {
    PD("pd"),
    
    PSE("pse"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    PoeModeEnum(String value) {
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
    public static PoeModeEnum fromValue(String value) {
      for (PoeModeEnum b : PoeModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_POE_MODE = "poe_mode";
  private PoeModeEnum poeMode;

  /**
   * Gets or Sets poeType
   */
  public enum PoeTypeEnum {
    TYPE1_IEEE802_3AF("type1-ieee802.3af"),
    
    TYPE2_IEEE802_3AT("type2-ieee802.3at"),
    
    TYPE3_IEEE802_3BT("type3-ieee802.3bt"),
    
    TYPE4_IEEE802_3BT("type4-ieee802.3bt"),
    
    PASSIVE_24V_2PAIR("passive-24v-2pair"),
    
    PASSIVE_24V_4PAIR("passive-24v-4pair"),
    
    PASSIVE_48V_2PAIR("passive-48v-2pair"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    PoeTypeEnum(String value) {
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
    public static PoeTypeEnum fromValue(String value) {
      for (PoeTypeEnum b : PoeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_POE_TYPE = "poe_type";
  private PoeTypeEnum poeType;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public WritableInterfaceTemplate() { 
  }

  @JsonCreator
  public WritableInterfaceTemplate(
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




  public WritableInterfaceTemplate deviceType(Integer deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDeviceType() {
    return deviceType;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }


  public WritableInterfaceTemplate moduleType(Integer moduleType) {
    this.moduleType = moduleType;
    return this;
  }

   /**
   * Get moduleType
   * @return moduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MODULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getModuleType() {
    return moduleType;
  }


  @JsonProperty(JSON_PROPERTY_MODULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModuleType(Integer moduleType) {
    this.moduleType = moduleType;
  }


  public WritableInterfaceTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   *  {module} is accepted as a substitution for the module bay position when attached to a module type. 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " {module} is accepted as a substitution for the module bay position when attached to a module type. ")
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


  public WritableInterfaceTemplate label(String label) {
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


  public WritableInterfaceTemplate type(TypeEnum type) {
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

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public WritableInterfaceTemplate mgmtOnly(Boolean mgmtOnly) {
    this.mgmtOnly = mgmtOnly;
    return this;
  }

   /**
   * Get mgmtOnly
   * @return mgmtOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MGMT_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMgmtOnly() {
    return mgmtOnly;
  }


  @JsonProperty(JSON_PROPERTY_MGMT_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMgmtOnly(Boolean mgmtOnly) {
    this.mgmtOnly = mgmtOnly;
  }


  public WritableInterfaceTemplate description(String description) {
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


  public WritableInterfaceTemplate poeMode(PoeModeEnum poeMode) {
    this.poeMode = poeMode;
    return this;
  }

   /**
   * Get poeMode
   * @return poeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PoeModeEnum getPoeMode() {
    return poeMode;
  }


  @JsonProperty(JSON_PROPERTY_POE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoeMode(PoeModeEnum poeMode) {
    this.poeMode = poeMode;
  }


  public WritableInterfaceTemplate poeType(PoeTypeEnum poeType) {
    this.poeType = poeType;
    return this;
  }

   /**
   * Get poeType
   * @return poeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PoeTypeEnum getPoeType() {
    return poeType;
  }


  @JsonProperty(JSON_PROPERTY_POE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoeType(PoeTypeEnum poeType) {
    this.poeType = poeType;
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
   * Return true if this WritableInterfaceTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableInterfaceTemplate writableInterfaceTemplate = (WritableInterfaceTemplate) o;
    return Objects.equals(this.id, writableInterfaceTemplate.id) &&
        Objects.equals(this.url, writableInterfaceTemplate.url) &&
        Objects.equals(this.display, writableInterfaceTemplate.display) &&
        Objects.equals(this.deviceType, writableInterfaceTemplate.deviceType) &&
        Objects.equals(this.moduleType, writableInterfaceTemplate.moduleType) &&
        Objects.equals(this.name, writableInterfaceTemplate.name) &&
        Objects.equals(this.label, writableInterfaceTemplate.label) &&
        Objects.equals(this.type, writableInterfaceTemplate.type) &&
        Objects.equals(this.mgmtOnly, writableInterfaceTemplate.mgmtOnly) &&
        Objects.equals(this.description, writableInterfaceTemplate.description) &&
        Objects.equals(this.poeMode, writableInterfaceTemplate.poeMode) &&
        Objects.equals(this.poeType, writableInterfaceTemplate.poeType) &&
        Objects.equals(this.created, writableInterfaceTemplate.created) &&
        Objects.equals(this.lastUpdated, writableInterfaceTemplate.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, deviceType, moduleType, name, label, type, mgmtOnly, description, poeMode, poeType, created, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableInterfaceTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mgmtOnly: ").append(toIndentedString(mgmtOnly)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    poeMode: ").append(toIndentedString(poeMode)).append("\n");
    sb.append("    poeType: ").append(toIndentedString(poeType)).append("\n");
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


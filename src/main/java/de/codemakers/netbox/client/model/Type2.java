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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Type2
 */
@JsonPropertyOrder({
  Type2.JSON_PROPERTY_LABEL,
  Type2.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T18:36:37.665487300+02:00[Europe/Berlin]")
public class Type2 {
  /**
   * Gets or Sets label
   */
  public enum LabelEnum {
    VIRTUAL("Virtual"),
    
    BRIDGE("Bridge"),
    
    LINK_AGGREGATION_GROUP_LAG_("Link Aggregation Group (LAG)"),
    
    _100BASE_TX_10_100ME_("100BASE-TX (10/100ME)"),
    
    _1000BASE_T_1GE_("1000BASE-T (1GE)"),
    
    _2_5GBASE_T_2_5GE_("2.5GBASE-T (2.5GE)"),
    
    _5GBASE_T_5GE_("5GBASE-T (5GE)"),
    
    _10GBASE_T_10GE_("10GBASE-T (10GE)"),
    
    _10GBASE_CX4_10GE_("10GBASE-CX4 (10GE)"),
    
    GBIC_1GE_("GBIC (1GE)"),
    
    SFP_1GE_("SFP (1GE)"),
    
    SFP_10GE_("SFP+ (10GE)"),
    
    XFP_10GE_("XFP (10GE)"),
    
    XENPAK_10GE_("XENPAK (10GE)"),
    
    X2_10GE_("X2 (10GE)"),
    
    SFP28_25GE_("SFP28 (25GE)"),
    
    SFP56_50GE_("SFP56 (50GE)"),
    
    QSFP_40GE_("QSFP+ (40GE)"),
    
    QSFP28_50GE_("QSFP28 (50GE)"),
    
    CFP_100GE_("CFP (100GE)"),
    
    CFP2_100GE_("CFP2 (100GE)"),
    
    CFP2_200GE_("CFP2 (200GE)"),
    
    CFP4_100GE_("CFP4 (100GE)"),
    
    CISCO_CPAK_100GE_("Cisco CPAK (100GE)"),
    
    QSFP28_100GE_("QSFP28 (100GE)"),
    
    QSFP56_200GE_("QSFP56 (200GE)"),
    
    QSFP_DD_400GE_("QSFP-DD (400GE)"),
    
    OSFP_400GE_("OSFP (400GE)"),
    
    IEEE_802_11A("IEEE 802.11a"),
    
    IEEE_802_11B_G("IEEE 802.11b/g"),
    
    IEEE_802_11N("IEEE 802.11n"),
    
    IEEE_802_11AC("IEEE 802.11ac"),
    
    IEEE_802_11AD("IEEE 802.11ad"),
    
    IEEE_802_11AX("IEEE 802.11ax"),
    
    IEEE_802_15_1_BLUETOOTH_("IEEE 802.15.1 (Bluetooth)"),
    
    GSM("GSM"),
    
    CDMA("CDMA"),
    
    LTE("LTE"),
    
    OC_3_STM_1("OC-3/STM-1"),
    
    OC_12_STM_4("OC-12/STM-4"),
    
    OC_48_STM_16("OC-48/STM-16"),
    
    OC_192_STM_64("OC-192/STM-64"),
    
    OC_768_STM_256("OC-768/STM-256"),
    
    OC_1920_STM_640("OC-1920/STM-640"),
    
    OC_3840_STM_1234("OC-3840/STM-1234"),
    
    SFP_1GFC_("SFP (1GFC)"),
    
    SFP_2GFC_("SFP (2GFC)"),
    
    SFP_4GFC_("SFP (4GFC)"),
    
    SFP_8GFC_("SFP+ (8GFC)"),
    
    SFP_16GFC_("SFP+ (16GFC)"),
    
    SFP28_32GFC_("SFP28 (32GFC)"),
    
    QSFP_64GFC_("QSFP+ (64GFC)"),
    
    QSFP28_128GFC_("QSFP28 (128GFC)"),
    
    SDR_2_GBPS_("SDR (2 Gbps)"),
    
    DDR_4_GBPS_("DDR (4 Gbps)"),
    
    QDR_8_GBPS_("QDR (8 Gbps)"),
    
    FDR10_10_GBPS_("FDR10 (10 Gbps)"),
    
    FDR_13_5_GBPS_("FDR (13.5 Gbps)"),
    
    EDR_25_GBPS_("EDR (25 Gbps)"),
    
    HDR_50_GBPS_("HDR (50 Gbps)"),
    
    NDR_100_GBPS_("NDR (100 Gbps)"),
    
    XDR_250_GBPS_("XDR (250 Gbps)"),
    
    T1_1_544_MBPS_("T1 (1.544 Mbps)"),
    
    E1_2_048_MBPS_("E1 (2.048 Mbps)"),
    
    T3_45_MBPS_("T3 (45 Mbps)"),
    
    E3_34_MBPS_("E3 (34 Mbps)"),
    
    XDSL("xDSL"),
    
    DOCSIS("DOCSIS"),
    
    GPON_2_5_GBPS_1_25_GPS_("GPON (2.5 Gbps / 1.25 Gps)"),
    
    XG_PON_10_GBPS_2_5_GBPS_("XG-PON (10 Gbps / 2.5 Gbps)"),
    
    XGS_PON_10_GBPS_("XGS-PON (10 Gbps)"),
    
    NG_PON2_TWDM_PON_4X10_GBPS_("NG-PON2 (TWDM-PON) (4x10 Gbps)"),
    
    EPON_1_GBPS_("EPON (1 Gbps)"),
    
    _10G_EPON_10_GBPS_("10G-EPON (10 Gbps)"),
    
    CISCO_STACKWISE("Cisco StackWise"),
    
    CISCO_STACKWISE_PLUS("Cisco StackWise Plus"),
    
    CISCO_FLEXSTACK("Cisco FlexStack"),
    
    CISCO_FLEXSTACK_PLUS("Cisco FlexStack Plus"),
    
    CISCO_STACKWISE_80("Cisco StackWise-80"),
    
    CISCO_STACKWISE_160("Cisco StackWise-160"),
    
    CISCO_STACKWISE_320("Cisco StackWise-320"),
    
    CISCO_STACKWISE_480("Cisco StackWise-480"),
    
    JUNIPER_VCP("Juniper VCP"),
    
    EXTREME_SUMMITSTACK("Extreme SummitStack"),
    
    EXTREME_SUMMITSTACK_128("Extreme SummitStack-128"),
    
    EXTREME_SUMMITSTACK_256("Extreme SummitStack-256"),
    
    EXTREME_SUMMITSTACK_512("Extreme SummitStack-512"),
    
    OTHER("Other"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    LabelEnum(String value) {
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
    public static LabelEnum fromValue(String value) {
      for (LabelEnum b : LabelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_LABEL = "label";
  private LabelEnum label;

  /**
   * Gets or Sets value
   */
  public enum ValueEnum {
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
    
    IEEE802_15_1("ieee802.15.1"),
    
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

    ValueEnum(String value) {
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
    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_VALUE = "value";
  private ValueEnum value;

  public Type2() { 
  }

  public Type2 label(LabelEnum label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LabelEnum getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(LabelEnum label) {
    this.label = label;
  }


  public Type2 value(ValueEnum value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ValueEnum getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(ValueEnum value) {
    this.value = value;
  }


  /**
   * Return true if this Type_2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Type2 type2 = (Type2) o;
    return Objects.equals(this.label, type2.label) &&
        Objects.equals(this.value, type2.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Type2 {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


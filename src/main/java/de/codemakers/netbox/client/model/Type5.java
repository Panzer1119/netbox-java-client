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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Type5
 */
@JsonPropertyOrder({
  Type5.JSON_PROPERTY_LABEL,
  Type5.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class Type5 {
  /**
   * Gets or Sets label
   */
  public enum LabelEnum {
    C6("C6"),
    
    C8("C8"),
    
    C14("C14"),
    
    C16("C16"),
    
    C20("C20"),
    
    C22("C22"),
    
    P_N_E_4H("P+N+E 4H"),
    
    P_N_E_6H("P+N+E 6H"),
    
    P_N_E_9H("P+N+E 9H"),
    
    _2P_E_4H("2P+E 4H"),
    
    _2P_E_6H("2P+E 6H"),
    
    _2P_E_9H("2P+E 9H"),
    
    _3P_E_4H("3P+E 4H"),
    
    _3P_E_6H("3P+E 6H"),
    
    _3P_E_9H("3P+E 9H"),
    
    _3P_N_E_4H("3P+N+E 4H"),
    
    _3P_N_E_6H("3P+N+E 6H"),
    
    _3P_N_E_9H("3P+N+E 9H"),
    
    NEMA_1_15P("NEMA 1-15P"),
    
    NEMA_5_15P("NEMA 5-15P"),
    
    NEMA_5_20P("NEMA 5-20P"),
    
    NEMA_5_30P("NEMA 5-30P"),
    
    NEMA_5_50P("NEMA 5-50P"),
    
    NEMA_6_15P("NEMA 6-15P"),
    
    NEMA_6_20P("NEMA 6-20P"),
    
    NEMA_6_30P("NEMA 6-30P"),
    
    NEMA_6_50P("NEMA 6-50P"),
    
    NEMA_10_30P("NEMA 10-30P"),
    
    NEMA_10_50P("NEMA 10-50P"),
    
    NEMA_14_20P("NEMA 14-20P"),
    
    NEMA_14_30P("NEMA 14-30P"),
    
    NEMA_14_50P("NEMA 14-50P"),
    
    NEMA_14_60P("NEMA 14-60P"),
    
    NEMA_15_15P("NEMA 15-15P"),
    
    NEMA_15_20P("NEMA 15-20P"),
    
    NEMA_15_30P("NEMA 15-30P"),
    
    NEMA_15_50P("NEMA 15-50P"),
    
    NEMA_15_60P("NEMA 15-60P"),
    
    NEMA_L1_15P("NEMA L1-15P"),
    
    NEMA_L5_15P("NEMA L5-15P"),
    
    NEMA_L5_20P("NEMA L5-20P"),
    
    NEMA_L5_30P("NEMA L5-30P"),
    
    NEMA_L5_50P("NEMA L5-50P"),
    
    NEMA_L6_15P("NEMA L6-15P"),
    
    NEMA_L6_20P("NEMA L6-20P"),
    
    NEMA_L6_30P("NEMA L6-30P"),
    
    NEMA_L6_50P("NEMA L6-50P"),
    
    NEMA_L10_30P("NEMA L10-30P"),
    
    NEMA_L14_20P("NEMA L14-20P"),
    
    NEMA_L14_30P("NEMA L14-30P"),
    
    NEMA_L14_50P("NEMA L14-50P"),
    
    NEMA_L14_60P("NEMA L14-60P"),
    
    NEMA_L15_20P("NEMA L15-20P"),
    
    NEMA_L15_30P("NEMA L15-30P"),
    
    NEMA_L15_50P("NEMA L15-50P"),
    
    NEMA_L15_60P("NEMA L15-60P"),
    
    NEMA_L21_20P("NEMA L21-20P"),
    
    NEMA_L21_30P("NEMA L21-30P"),
    
    NEMA_L22_30P("NEMA L22-30P"),
    
    CS6361C("CS6361C"),
    
    CS6365C("CS6365C"),
    
    CS8165C("CS8165C"),
    
    CS8265C("CS8265C"),
    
    CS8365C("CS8365C"),
    
    CS8465C("CS8465C"),
    
    ITA_TYPE_C_CEE_7_16_("ITA Type C (CEE 7/16)"),
    
    ITA_TYPE_E_CEE_7_6_("ITA Type E (CEE 7/6)"),
    
    ITA_TYPE_F_CEE_7_4_("ITA Type F (CEE 7/4)"),
    
    ITA_TYPE_E_F_CEE_7_7_("ITA Type E/F (CEE 7/7)"),
    
    ITA_TYPE_G_BS_1363_("ITA Type G (BS 1363)"),
    
    ITA_TYPE_H("ITA Type H"),
    
    ITA_TYPE_I("ITA Type I"),
    
    ITA_TYPE_J("ITA Type J"),
    
    ITA_TYPE_K("ITA Type K"),
    
    ITA_TYPE_L_CEI_23_50_("ITA Type L (CEI 23-50)"),
    
    ITA_TYPE_M_BS_546_("ITA Type M (BS 546)"),
    
    ITA_TYPE_N("ITA Type N"),
    
    ITA_TYPE_O("ITA Type O"),
    
    USB_TYPE_A("USB Type A"),
    
    USB_TYPE_B("USB Type B"),
    
    USB_TYPE_C("USB Type C"),
    
    USB_MINI_A("USB Mini A"),
    
    USB_MINI_B("USB Mini B"),
    
    USB_MICRO_A("USB Micro A"),
    
    USB_MICRO_B("USB Micro B"),
    
    USB_MICRO_AB("USB Micro AB"),
    
    USB_3_0_TYPE_B("USB 3.0 Type B"),
    
    USB_3_0_MICRO_B("USB 3.0 Micro B"),
    
    DC_TERMINAL("DC Terminal"),
    
    SAF_D_GRID("Saf-D-Grid"),
    
    NEUTRIK_POWERCON_20A_("Neutrik powerCON (20A)"),
    
    NEUTRIK_POWERCON_32A_("Neutrik powerCON (32A)"),
    
    NEUTRIK_POWERCON_TRUE1("Neutrik powerCON TRUE1"),
    
    NEUTRIK_POWERCON_TRUE1_TOP("Neutrik powerCON TRUE1 TOP"),
    
    UBIQUITI_SMARTPOWER("Ubiquiti SmartPower"),
    
    HARDWIRED("Hardwired"),
    
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
    IEC_60320_C6("iec-60320-c6"),
    
    IEC_60320_C8("iec-60320-c8"),
    
    IEC_60320_C14("iec-60320-c14"),
    
    IEC_60320_C16("iec-60320-c16"),
    
    IEC_60320_C20("iec-60320-c20"),
    
    IEC_60320_C22("iec-60320-c22"),
    
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
    
    NEMA_1_15P("nema-1-15p"),
    
    NEMA_5_15P("nema-5-15p"),
    
    NEMA_5_20P("nema-5-20p"),
    
    NEMA_5_30P("nema-5-30p"),
    
    NEMA_5_50P("nema-5-50p"),
    
    NEMA_6_15P("nema-6-15p"),
    
    NEMA_6_20P("nema-6-20p"),
    
    NEMA_6_30P("nema-6-30p"),
    
    NEMA_6_50P("nema-6-50p"),
    
    NEMA_10_30P("nema-10-30p"),
    
    NEMA_10_50P("nema-10-50p"),
    
    NEMA_14_20P("nema-14-20p"),
    
    NEMA_14_30P("nema-14-30p"),
    
    NEMA_14_50P("nema-14-50p"),
    
    NEMA_14_60P("nema-14-60p"),
    
    NEMA_15_15P("nema-15-15p"),
    
    NEMA_15_20P("nema-15-20p"),
    
    NEMA_15_30P("nema-15-30p"),
    
    NEMA_15_50P("nema-15-50p"),
    
    NEMA_15_60P("nema-15-60p"),
    
    NEMA_L1_15P("nema-l1-15p"),
    
    NEMA_L5_15P("nema-l5-15p"),
    
    NEMA_L5_20P("nema-l5-20p"),
    
    NEMA_L5_30P("nema-l5-30p"),
    
    NEMA_L5_50P("nema-l5-50p"),
    
    NEMA_L6_15P("nema-l6-15p"),
    
    NEMA_L6_20P("nema-l6-20p"),
    
    NEMA_L6_30P("nema-l6-30p"),
    
    NEMA_L6_50P("nema-l6-50p"),
    
    NEMA_L10_30P("nema-l10-30p"),
    
    NEMA_L14_20P("nema-l14-20p"),
    
    NEMA_L14_30P("nema-l14-30p"),
    
    NEMA_L14_50P("nema-l14-50p"),
    
    NEMA_L14_60P("nema-l14-60p"),
    
    NEMA_L15_20P("nema-l15-20p"),
    
    NEMA_L15_30P("nema-l15-30p"),
    
    NEMA_L15_50P("nema-l15-50p"),
    
    NEMA_L15_60P("nema-l15-60p"),
    
    NEMA_L21_20P("nema-l21-20p"),
    
    NEMA_L21_30P("nema-l21-30p"),
    
    NEMA_L22_30P("nema-l22-30p"),
    
    CS6361C("cs6361c"),
    
    CS6365C("cs6365c"),
    
    CS8165C("cs8165c"),
    
    CS8265C("cs8265c"),
    
    CS8365C("cs8365c"),
    
    CS8465C("cs8465c"),
    
    ITA_C("ita-c"),
    
    ITA_E("ita-e"),
    
    ITA_F("ita-f"),
    
    ITA_EF("ita-ef"),
    
    ITA_G("ita-g"),
    
    ITA_H("ita-h"),
    
    ITA_I("ita-i"),
    
    ITA_J("ita-j"),
    
    ITA_K("ita-k"),
    
    ITA_L("ita-l"),
    
    ITA_M("ita-m"),
    
    ITA_N("ita-n"),
    
    ITA_O("ita-o"),
    
    USB_A("usb-a"),
    
    USB_B("usb-b"),
    
    USB_C("usb-c"),
    
    USB_MINI_A("usb-mini-a"),
    
    USB_MINI_B("usb-mini-b"),
    
    USB_MICRO_A("usb-micro-a"),
    
    USB_MICRO_B("usb-micro-b"),
    
    USB_MICRO_AB("usb-micro-ab"),
    
    USB_3_B("usb-3-b"),
    
    USB_3_MICRO_B("usb-3-micro-b"),
    
    DC_TERMINAL("dc-terminal"),
    
    SAF_D_GRID("saf-d-grid"),
    
    NEUTRIK_POWERCON_20("neutrik-powercon-20"),
    
    NEUTRIK_POWERCON_32("neutrik-powercon-32"),
    
    NEUTRIK_POWERCON_TRUE1("neutrik-powercon-true1"),
    
    NEUTRIK_POWERCON_TRUE1_TOP("neutrik-powercon-true1-top"),
    
    UBIQUITI_SMARTPOWER("ubiquiti-smartpower"),
    
    HARDWIRED("hardwired"),
    
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

  public Type5() { 
  }

  public Type5 label(LabelEnum label) {
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


  public Type5 value(ValueEnum value) {
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
   * Return true if this Type_5 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Type5 type5 = (Type5) o;
    return Objects.equals(this.label, type5.label) &&
        Objects.equals(this.value, type5.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Type5 {\n");
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


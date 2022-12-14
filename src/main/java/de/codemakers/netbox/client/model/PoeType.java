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
 * PoeType
 */
@JsonPropertyOrder({
  PoeType.JSON_PROPERTY_LABEL,
  PoeType.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class PoeType {
  /**
   * Gets or Sets label
   */
  public enum LabelEnum {
    _802_3AF_TYPE_1_("802.3af (Type 1)"),
    
    _802_3AT_TYPE_2_("802.3at (Type 2)"),
    
    _802_3BT_TYPE_3_("802.3bt (Type 3)"),
    
    _802_3BT_TYPE_4_("802.3bt (Type 4)"),
    
    PASSIVE_24V_2_PAIR_("Passive 24V (2-pair)"),
    
    PASSIVE_24V_4_PAIR_("Passive 24V (4-pair)"),
    
    PASSIVE_48V_4_PAIR_("Passive 48V (4-pair)"),
    
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
    TYPE1_IEEE802_3AF("type1-ieee802.3af"),
    
    TYPE2_IEEE802_3AT("type2-ieee802.3at"),
    
    TYPE3_IEEE802_3BT("type3-ieee802.3bt"),
    
    TYPE4_IEEE802_3BT("type4-ieee802.3bt"),
    
    PASSIVE_24V_2PAIR("passive-24v-2pair"),
    
    PASSIVE_24V_4PAIR("passive-24v-4pair"),
    
    PASSIVE_48V_2PAIR("passive-48v-2pair"),
    
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

  public PoeType() { 
  }

  public PoeType label(LabelEnum label) {
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


  public PoeType value(ValueEnum value) {
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
   * Return true if this Poe_type object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoeType poeType = (PoeType) o;
    return Objects.equals(this.label, poeType.label) &&
        Objects.equals(this.value, poeType.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoeType {\n");
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


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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.codemakers.netbox.client.model.NestedTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WritableVMInterface
 */
@JsonPropertyOrder({
  WritableVMInterface.JSON_PROPERTY_ID,
  WritableVMInterface.JSON_PROPERTY_URL,
  WritableVMInterface.JSON_PROPERTY_DISPLAY,
  WritableVMInterface.JSON_PROPERTY_VIRTUAL_MACHINE,
  WritableVMInterface.JSON_PROPERTY_NAME,
  WritableVMInterface.JSON_PROPERTY_ENABLED,
  WritableVMInterface.JSON_PROPERTY_PARENT,
  WritableVMInterface.JSON_PROPERTY_BRIDGE,
  WritableVMInterface.JSON_PROPERTY_MTU,
  WritableVMInterface.JSON_PROPERTY_MAC_ADDRESS,
  WritableVMInterface.JSON_PROPERTY_DESCRIPTION,
  WritableVMInterface.JSON_PROPERTY_MODE,
  WritableVMInterface.JSON_PROPERTY_UNTAGGED_VLAN,
  WritableVMInterface.JSON_PROPERTY_TAGGED_VLANS,
  WritableVMInterface.JSON_PROPERTY_VRF,
  WritableVMInterface.JSON_PROPERTY_L2VPN_TERMINATION,
  WritableVMInterface.JSON_PROPERTY_TAGS,
  WritableVMInterface.JSON_PROPERTY_CUSTOM_FIELDS,
  WritableVMInterface.JSON_PROPERTY_CREATED,
  WritableVMInterface.JSON_PROPERTY_LAST_UPDATED,
  WritableVMInterface.JSON_PROPERTY_COUNT_IPADDRESSES,
  WritableVMInterface.JSON_PROPERTY_COUNT_FHRP_GROUPS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T15:10:46.540964900+02:00[Europe/Berlin]")
public class WritableVMInterface {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_URL = "url";
  private URI url;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_VIRTUAL_MACHINE = "virtual_machine";
  private Integer virtualMachine;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private JsonNullable<Integer> parent = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_BRIDGE = "bridge";
  private JsonNullable<Integer> bridge = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_MTU = "mtu";
  private JsonNullable<Integer> mtu = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_MAC_ADDRESS = "mac_address";
  private JsonNullable<String> macAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    ACCESS("access"),
    
    TAGGED("tagged"),
    
    TAGGED_ALL("tagged-all"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_MODE = "mode";
  private ModeEnum mode;

  public static final String JSON_PROPERTY_UNTAGGED_VLAN = "untagged_vlan";
  private JsonNullable<Integer> untaggedVlan = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TAGGED_VLANS = "tagged_vlans";
  private Set<Integer> taggedVlans = null;

  public static final String JSON_PROPERTY_VRF = "vrf";
  private JsonNullable<Integer> vrf = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_L2VPN_TERMINATION = "l2vpn_termination";
  private String l2vpnTermination;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<NestedTag> tags = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private Object customFields;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private OffsetDateTime lastUpdated;

  public static final String JSON_PROPERTY_COUNT_IPADDRESSES = "count_ipaddresses";
  private Integer countIpaddresses;

  public static final String JSON_PROPERTY_COUNT_FHRP_GROUPS = "count_fhrp_groups";
  private Integer countFhrpGroups;

  public WritableVMInterface() { 
  }

  @JsonCreator
  public WritableVMInterface(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_URL) URI url, 
    @JsonProperty(JSON_PROPERTY_DISPLAY) String display, 
    @JsonProperty(JSON_PROPERTY_L2VPN_TERMINATION) String l2vpnTermination, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED) OffsetDateTime lastUpdated, 
    @JsonProperty(JSON_PROPERTY_COUNT_IPADDRESSES) Integer countIpaddresses, 
    @JsonProperty(JSON_PROPERTY_COUNT_FHRP_GROUPS) Integer countFhrpGroups
  ) {
  this();
    this.id = id;
    this.url = url;
    this.display = display;
    this.l2vpnTermination = l2vpnTermination;
    this.created = created;
    this.lastUpdated = lastUpdated;
    this.countIpaddresses = countIpaddresses;
    this.countFhrpGroups = countFhrpGroups;
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




  public WritableVMInterface virtualMachine(Integer virtualMachine) {
    this.virtualMachine = virtualMachine;
    return this;
  }

   /**
   * Get virtualMachine
   * @return virtualMachine
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_MACHINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVirtualMachine() {
    return virtualMachine;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_MACHINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVirtualMachine(Integer virtualMachine) {
    this.virtualMachine = virtualMachine;
  }


  public WritableVMInterface name(String name) {
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


  public WritableVMInterface enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public WritableVMInterface parent(Integer parent) {
    this.parent = JsonNullable.<Integer>of(parent);
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getParent() {
        return parent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getParent_JsonNullable() {
    return parent;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT)
  public void setParent_JsonNullable(JsonNullable<Integer> parent) {
    this.parent = parent;
  }

  public void setParent(Integer parent) {
    this.parent = JsonNullable.<Integer>of(parent);
  }


  public WritableVMInterface bridge(Integer bridge) {
    this.bridge = JsonNullable.<Integer>of(bridge);
    return this;
  }

   /**
   * Get bridge
   * @return bridge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getBridge() {
        return bridge.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BRIDGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getBridge_JsonNullable() {
    return bridge;
  }
  
  @JsonProperty(JSON_PROPERTY_BRIDGE)
  public void setBridge_JsonNullable(JsonNullable<Integer> bridge) {
    this.bridge = bridge;
  }

  public void setBridge(Integer bridge) {
    this.bridge = JsonNullable.<Integer>of(bridge);
  }


  public WritableVMInterface mtu(Integer mtu) {
    this.mtu = JsonNullable.<Integer>of(mtu);
    return this;
  }

   /**
   * Get mtu
   * minimum: 1
   * maximum: 65536
   * @return mtu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getMtu() {
        return mtu.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MTU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getMtu_JsonNullable() {
    return mtu;
  }
  
  @JsonProperty(JSON_PROPERTY_MTU)
  public void setMtu_JsonNullable(JsonNullable<Integer> mtu) {
    this.mtu = mtu;
  }

  public void setMtu(Integer mtu) {
    this.mtu = JsonNullable.<Integer>of(mtu);
  }


  public WritableVMInterface macAddress(String macAddress) {
    this.macAddress = JsonNullable.<String>of(macAddress);
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getMacAddress() {
        return macAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMacAddress_JsonNullable() {
    return macAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  public void setMacAddress_JsonNullable(JsonNullable<String> macAddress) {
    this.macAddress = macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = JsonNullable.<String>of(macAddress);
  }


  public WritableVMInterface description(String description) {
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


  public WritableVMInterface mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModeEnum getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public WritableVMInterface untaggedVlan(Integer untaggedVlan) {
    this.untaggedVlan = JsonNullable.<Integer>of(untaggedVlan);
    return this;
  }

   /**
   * Get untaggedVlan
   * @return untaggedVlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getUntaggedVlan() {
        return untaggedVlan.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNTAGGED_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getUntaggedVlan_JsonNullable() {
    return untaggedVlan;
  }
  
  @JsonProperty(JSON_PROPERTY_UNTAGGED_VLAN)
  public void setUntaggedVlan_JsonNullable(JsonNullable<Integer> untaggedVlan) {
    this.untaggedVlan = untaggedVlan;
  }

  public void setUntaggedVlan(Integer untaggedVlan) {
    this.untaggedVlan = JsonNullable.<Integer>of(untaggedVlan);
  }


  public WritableVMInterface taggedVlans(Set<Integer> taggedVlans) {
    this.taggedVlans = taggedVlans;
    return this;
  }

  public WritableVMInterface addTaggedVlansItem(Integer taggedVlansItem) {
    if (this.taggedVlans == null) {
      this.taggedVlans = new LinkedHashSet<>();
    }
    this.taggedVlans.add(taggedVlansItem);
    return this;
  }

   /**
   * Get taggedVlans
   * @return taggedVlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAGGED_VLANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Integer> getTaggedVlans() {
    return taggedVlans;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TAGGED_VLANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaggedVlans(Set<Integer> taggedVlans) {
    this.taggedVlans = taggedVlans;
  }


  public WritableVMInterface vrf(Integer vrf) {
    this.vrf = JsonNullable.<Integer>of(vrf);
    return this;
  }

   /**
   * Get vrf
   * @return vrf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getVrf() {
        return vrf.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VRF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getVrf_JsonNullable() {
    return vrf;
  }
  
  @JsonProperty(JSON_PROPERTY_VRF)
  public void setVrf_JsonNullable(JsonNullable<Integer> vrf) {
    this.vrf = vrf;
  }

  public void setVrf(Integer vrf) {
    this.vrf = JsonNullable.<Integer>of(vrf);
  }


   /**
   * Get l2vpnTermination
   * @return l2vpnTermination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_L2VPN_TERMINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getL2vpnTermination() {
    return l2vpnTermination;
  }




  public WritableVMInterface tags(List<NestedTag> tags) {
    this.tags = tags;
    return this;
  }

  public WritableVMInterface addTagsItem(NestedTag tagsItem) {
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


  public WritableVMInterface customFields(Object customFields) {
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
   * Get countIpaddresses
   * @return countIpaddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNT_IPADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCountIpaddresses() {
    return countIpaddresses;
  }




   /**
   * Get countFhrpGroups
   * @return countFhrpGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNT_FHRP_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCountFhrpGroups() {
    return countFhrpGroups;
  }




  /**
   * Return true if this WritableVMInterface object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableVMInterface writableVMInterface = (WritableVMInterface) o;
    return Objects.equals(this.id, writableVMInterface.id) &&
        Objects.equals(this.url, writableVMInterface.url) &&
        Objects.equals(this.display, writableVMInterface.display) &&
        Objects.equals(this.virtualMachine, writableVMInterface.virtualMachine) &&
        Objects.equals(this.name, writableVMInterface.name) &&
        Objects.equals(this.enabled, writableVMInterface.enabled) &&
        equalsNullable(this.parent, writableVMInterface.parent) &&
        equalsNullable(this.bridge, writableVMInterface.bridge) &&
        equalsNullable(this.mtu, writableVMInterface.mtu) &&
        equalsNullable(this.macAddress, writableVMInterface.macAddress) &&
        Objects.equals(this.description, writableVMInterface.description) &&
        Objects.equals(this.mode, writableVMInterface.mode) &&
        equalsNullable(this.untaggedVlan, writableVMInterface.untaggedVlan) &&
        Objects.equals(this.taggedVlans, writableVMInterface.taggedVlans) &&
        equalsNullable(this.vrf, writableVMInterface.vrf) &&
        Objects.equals(this.l2vpnTermination, writableVMInterface.l2vpnTermination) &&
        Objects.equals(this.tags, writableVMInterface.tags) &&
        Objects.equals(this.customFields, writableVMInterface.customFields) &&
        Objects.equals(this.created, writableVMInterface.created) &&
        Objects.equals(this.lastUpdated, writableVMInterface.lastUpdated) &&
        Objects.equals(this.countIpaddresses, writableVMInterface.countIpaddresses) &&
        Objects.equals(this.countFhrpGroups, writableVMInterface.countFhrpGroups);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, display, virtualMachine, name, enabled, hashCodeNullable(parent), hashCodeNullable(bridge), hashCodeNullable(mtu), hashCodeNullable(macAddress), description, mode, hashCodeNullable(untaggedVlan), taggedVlans, hashCodeNullable(vrf), l2vpnTermination, tags, customFields, created, lastUpdated, countIpaddresses, countFhrpGroups);
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
    sb.append("class WritableVMInterface {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    virtualMachine: ").append(toIndentedString(virtualMachine)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    bridge: ").append(toIndentedString(bridge)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    untaggedVlan: ").append(toIndentedString(untaggedVlan)).append("\n");
    sb.append("    taggedVlans: ").append(toIndentedString(taggedVlans)).append("\n");
    sb.append("    vrf: ").append(toIndentedString(vrf)).append("\n");
    sb.append("    l2vpnTermination: ").append(toIndentedString(l2vpnTermination)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    countIpaddresses: ").append(toIndentedString(countIpaddresses)).append("\n");
    sb.append("    countFhrpGroups: ").append(toIndentedString(countFhrpGroups)).append("\n");
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


package de.codemakers.netbox.client.model;

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.net.URI;
import java.util.Arrays;
import java.util.Objects;

/**
 * LinkTermination
 */
@JsonPropertyOrder({
        LinkTermination.JSON_PROPERTY_ID,
        LinkTermination.JSON_PROPERTY_URL,
        LinkTermination.JSON_PROPERTY_DISPLAY,
        LinkTermination.JSON_PROPERTY_DEVICE,
        LinkTermination.JSON_PROPERTY_NAME,
        LinkTermination.JSON_PROPERTY_CABLE,
        LinkTermination.JSON_PROPERTY__OCCUPIED
})
public class LinkTermination {
    public static final String JSON_PROPERTY_ID = "id";
    private Integer id;
    
    public static final String JSON_PROPERTY_URL = "url";
    private URI url;
    
    public static final String JSON_PROPERTY_DISPLAY = "display";
    private String display;
    
    public static final String JSON_PROPERTY_DEVICE = "device";
    private NestedDevice device;
    
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;
    
    public static final String JSON_PROPERTY_CABLE = "cable";
    
    private NestedCable cable;
    
    public static final String JSON_PROPERTY__OCCUPIED = "_occupied";
    
    private JsonNullable<Boolean> _occupied = JsonNullable.<Boolean>undefined();
    
    public LinkTermination() {
    }
    
    @JsonCreator
    public LinkTermination(
            @JsonProperty(JSON_PROPERTY_ID) Integer id,
            @JsonProperty(JSON_PROPERTY_URL) URI url,
            @JsonProperty(JSON_PROPERTY_DISPLAY) String display,
            @JsonProperty(JSON_PROPERTY_DEVICE) NestedDevice device,
            @JsonProperty(JSON_PROPERTY_NAME) String name,
            @JsonProperty(JSON_PROPERTY_CABLE) NestedCable cable
    ) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.device = device;
        this.name = name;
        this.cable = cable;
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
    
    
    
    
    /**
     * Get created
     * @return created
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DEVICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    
    public NestedDevice getDevice() {
        return device;
    }
    
    
    
    
    public LinkTermination name(String name) {
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
    
    
    /**
     * Get objType
     * @return objType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    
    public NestedCable getCable() {
        return cable;
    }
    
    
    
    public LinkTermination _occupied(Boolean _occupied) {
        this._occupied = JsonNullable.<Boolean>of(_occupied);
        return this;
    }
    
    /**
     * Get _occupied
     * @return _occupied
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonIgnore
    
    public Boolean getCompleted() {
        return _occupied.orElse(null);
    }
    
    @JsonProperty(JSON_PROPERTY__OCCUPIED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    
    public JsonNullable<Boolean> getCompleted_JsonNullable() {
        return _occupied;
    }
    
    @JsonProperty(JSON_PROPERTY__OCCUPIED)
    public void setCompleted_JsonNullable(JsonNullable<Boolean> _occupied) {
        this._occupied = _occupied;
    }
    
    public void setCompleted(Boolean _occupied) {
        this._occupied = JsonNullable.<Boolean>of(_occupied);
    }
    
    
    /**
     * Return true if this LinkTermination object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkTermination LinkTermination = (LinkTermination) o;
        return Objects.equals(this.id, LinkTermination.id) &&
                Objects.equals(this.url, LinkTermination.url) &&
                Objects.equals(this.display, LinkTermination.display) &&
                Objects.equals(this.device, LinkTermination.device) &&
                Objects.equals(this.name, LinkTermination.name) &&
                Objects.equals(this.cable, LinkTermination.cable) &&
                Objects.equals(this._occupied, LinkTermination._occupied);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, device, hashCodeNullable(_occupied), name, cable, hashCodeNullable(_occupied));
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
        sb.append("class LinkTermination {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    created: ").append(toIndentedString(device)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objType: ").append(toIndentedString(cable)).append("\n");
        sb.append("    _occupied: ").append(toIndentedString(_occupied)).append("\n");
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

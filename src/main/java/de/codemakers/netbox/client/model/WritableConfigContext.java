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

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.codemakers.netbox.client.JSON;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * WritableConfigContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class WritableConfigContext {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    
    public static final String SERIALIZED_NAME_WEIGHT = "weight";
    @SerializedName(SERIALIZED_NAME_WEIGHT)
    private Integer weight;
    
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    
    public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
    @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
    private Boolean isActive;
    
    public static final String SERIALIZED_NAME_REGIONS = "regions";
    @SerializedName(SERIALIZED_NAME_REGIONS)
    private Set<Integer> regions = null;
    
    public static final String SERIALIZED_NAME_SITE_GROUPS = "site_groups";
    @SerializedName(SERIALIZED_NAME_SITE_GROUPS)
    private Set<Integer> siteGroups = null;
    
    public static final String SERIALIZED_NAME_SITES = "sites";
    @SerializedName(SERIALIZED_NAME_SITES)
    private Set<Integer> sites = null;
    
    public static final String SERIALIZED_NAME_LOCATIONS = "locations";
    @SerializedName(SERIALIZED_NAME_LOCATIONS)
    private Set<Integer> locations = null;
    
    public static final String SERIALIZED_NAME_DEVICE_TYPES = "device_types";
    @SerializedName(SERIALIZED_NAME_DEVICE_TYPES)
    private Set<Integer> deviceTypes = null;
    
    public static final String SERIALIZED_NAME_ROLES = "roles";
    @SerializedName(SERIALIZED_NAME_ROLES)
    private Set<Integer> roles = null;
    
    public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
    @SerializedName(SERIALIZED_NAME_PLATFORMS)
    private Set<Integer> platforms = null;
    
    public static final String SERIALIZED_NAME_CLUSTER_TYPES = "cluster_types";
    @SerializedName(SERIALIZED_NAME_CLUSTER_TYPES)
    private Set<Integer> clusterTypes = null;
    
    public static final String SERIALIZED_NAME_CLUSTER_GROUPS = "cluster_groups";
    @SerializedName(SERIALIZED_NAME_CLUSTER_GROUPS)
    private Set<Integer> clusterGroups = null;
    
    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private Set<Integer> clusters = null;
    
    public static final String SERIALIZED_NAME_TENANT_GROUPS = "tenant_groups";
    @SerializedName(SERIALIZED_NAME_TENANT_GROUPS)
    private Set<Integer> tenantGroups = null;
    
    public static final String SERIALIZED_NAME_TENANTS = "tenants";
    @SerializedName(SERIALIZED_NAME_TENANTS)
    private Set<Integer> tenants = null;
    
    public static final String SERIALIZED_NAME_TAGS = "tags";
    @SerializedName(SERIALIZED_NAME_TAGS)
    private Set<String> tags = null;
    
    public static final String SERIALIZED_NAME_DATA = "data";
    @SerializedName(SERIALIZED_NAME_DATA)
    private String data;
    
    public static final String SERIALIZED_NAME_CREATED = "created";
    @SerializedName(SERIALIZED_NAME_CREATED)
    private OffsetDateTime created;
    
    public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
    @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
    private OffsetDateTime lastUpdated;
    
    public WritableConfigContext() {
    }
    
    
    public WritableConfigContext(Integer id, URI url, String display, OffsetDateTime created, OffsetDateTime lastUpdated) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
        this.created = created;
        this.lastUpdated = lastUpdated;
    }
    
    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getId() {
        return id;
    }
    
    
    /**
     * Get url
     *
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public URI getUrl() {
        return url;
    }
    
    
    /**
     * Get display
     *
     * @return display
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getDisplay() {
        return display;
    }
    
    
    public WritableConfigContext name(String name) {
        
        this.name = name;
        return this;
    }
    
    /**
     * Get name
     *
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
    
    
    public WritableConfigContext weight(Integer weight) {
        
        this.weight = weight;
        return this;
    }
    
    /**
     * Get weight
     * minimum: 0
     * maximum: 32767
     *
     * @return weight
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Integer getWeight() {
        return weight;
    }
    
    
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    
    public WritableConfigContext description(String description) {
        
        this.description = description;
        return this;
    }
    
    /**
     * Get description
     *
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
    
    
    public WritableConfigContext isActive(Boolean isActive) {
        
        this.isActive = isActive;
        return this;
    }
    
    /**
     * Get isActive
     *
     * @return isActive
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Boolean getIsActive() {
        return isActive;
    }
    
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    
    
    public WritableConfigContext regions(Set<Integer> regions) {
        
        this.regions = regions;
        return this;
    }
    
    public WritableConfigContext addRegionsItem(Integer regionsItem) {
        if (this.regions == null) {
            this.regions = new LinkedHashSet<>();
        }
        this.regions.add(regionsItem);
        return this;
    }
    
    /**
     * Get regions
     *
     * @return regions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getRegions() {
        return regions;
    }
    
    
    public void setRegions(Set<Integer> regions) {
        this.regions = regions;
    }
    
    
    public WritableConfigContext siteGroups(Set<Integer> siteGroups) {
        
        this.siteGroups = siteGroups;
        return this;
    }
    
    public WritableConfigContext addSiteGroupsItem(Integer siteGroupsItem) {
        if (this.siteGroups == null) {
            this.siteGroups = new LinkedHashSet<>();
        }
        this.siteGroups.add(siteGroupsItem);
        return this;
    }
    
    /**
     * Get siteGroups
     *
     * @return siteGroups
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getSiteGroups() {
        return siteGroups;
    }
    
    
    public void setSiteGroups(Set<Integer> siteGroups) {
        this.siteGroups = siteGroups;
    }
    
    
    public WritableConfigContext sites(Set<Integer> sites) {
        
        this.sites = sites;
        return this;
    }
    
    public WritableConfigContext addSitesItem(Integer sitesItem) {
        if (this.sites == null) {
            this.sites = new LinkedHashSet<>();
        }
        this.sites.add(sitesItem);
        return this;
    }
    
    /**
     * Get sites
     *
     * @return sites
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getSites() {
        return sites;
    }
    
    
    public void setSites(Set<Integer> sites) {
        this.sites = sites;
    }
    
    
    public WritableConfigContext locations(Set<Integer> locations) {
        
        this.locations = locations;
        return this;
    }
    
    public WritableConfigContext addLocationsItem(Integer locationsItem) {
        if (this.locations == null) {
            this.locations = new LinkedHashSet<>();
        }
        this.locations.add(locationsItem);
        return this;
    }
    
    /**
     * Get locations
     *
     * @return locations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getLocations() {
        return locations;
    }
    
    
    public void setLocations(Set<Integer> locations) {
        this.locations = locations;
    }
    
    
    public WritableConfigContext deviceTypes(Set<Integer> deviceTypes) {
        
        this.deviceTypes = deviceTypes;
        return this;
    }
    
    public WritableConfigContext addDeviceTypesItem(Integer deviceTypesItem) {
        if (this.deviceTypes == null) {
            this.deviceTypes = new LinkedHashSet<>();
        }
        this.deviceTypes.add(deviceTypesItem);
        return this;
    }
    
    /**
     * Get deviceTypes
     *
     * @return deviceTypes
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getDeviceTypes() {
        return deviceTypes;
    }
    
    
    public void setDeviceTypes(Set<Integer> deviceTypes) {
        this.deviceTypes = deviceTypes;
    }
    
    
    public WritableConfigContext roles(Set<Integer> roles) {
        
        this.roles = roles;
        return this;
    }
    
    public WritableConfigContext addRolesItem(Integer rolesItem) {
        if (this.roles == null) {
            this.roles = new LinkedHashSet<>();
        }
        this.roles.add(rolesItem);
        return this;
    }
    
    /**
     * Get roles
     *
     * @return roles
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getRoles() {
        return roles;
    }
    
    
    public void setRoles(Set<Integer> roles) {
        this.roles = roles;
    }
    
    
    public WritableConfigContext platforms(Set<Integer> platforms) {
        
        this.platforms = platforms;
        return this;
    }
    
    public WritableConfigContext addPlatformsItem(Integer platformsItem) {
        if (this.platforms == null) {
            this.platforms = new LinkedHashSet<>();
        }
        this.platforms.add(platformsItem);
        return this;
    }
    
    /**
     * Get platforms
     *
     * @return platforms
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getPlatforms() {
        return platforms;
    }
    
    
    public void setPlatforms(Set<Integer> platforms) {
        this.platforms = platforms;
    }
    
    
    public WritableConfigContext clusterTypes(Set<Integer> clusterTypes) {
        
        this.clusterTypes = clusterTypes;
        return this;
    }
    
    public WritableConfigContext addClusterTypesItem(Integer clusterTypesItem) {
        if (this.clusterTypes == null) {
            this.clusterTypes = new LinkedHashSet<>();
        }
        this.clusterTypes.add(clusterTypesItem);
        return this;
    }
    
    /**
     * Get clusterTypes
     *
     * @return clusterTypes
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getClusterTypes() {
        return clusterTypes;
    }
    
    
    public void setClusterTypes(Set<Integer> clusterTypes) {
        this.clusterTypes = clusterTypes;
    }
    
    
    public WritableConfigContext clusterGroups(Set<Integer> clusterGroups) {
        
        this.clusterGroups = clusterGroups;
        return this;
    }
    
    public WritableConfigContext addClusterGroupsItem(Integer clusterGroupsItem) {
        if (this.clusterGroups == null) {
            this.clusterGroups = new LinkedHashSet<>();
        }
        this.clusterGroups.add(clusterGroupsItem);
        return this;
    }
    
    /**
     * Get clusterGroups
     *
     * @return clusterGroups
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getClusterGroups() {
        return clusterGroups;
    }
    
    
    public void setClusterGroups(Set<Integer> clusterGroups) {
        this.clusterGroups = clusterGroups;
    }
    
    
    public WritableConfigContext clusters(Set<Integer> clusters) {
        
        this.clusters = clusters;
        return this;
    }
    
    public WritableConfigContext addClustersItem(Integer clustersItem) {
        if (this.clusters == null) {
            this.clusters = new LinkedHashSet<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }
    
    /**
     * Get clusters
     *
     * @return clusters
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getClusters() {
        return clusters;
    }
    
    
    public void setClusters(Set<Integer> clusters) {
        this.clusters = clusters;
    }
    
    
    public WritableConfigContext tenantGroups(Set<Integer> tenantGroups) {
        
        this.tenantGroups = tenantGroups;
        return this;
    }
    
    public WritableConfigContext addTenantGroupsItem(Integer tenantGroupsItem) {
        if (this.tenantGroups == null) {
            this.tenantGroups = new LinkedHashSet<>();
        }
        this.tenantGroups.add(tenantGroupsItem);
        return this;
    }
    
    /**
     * Get tenantGroups
     *
     * @return tenantGroups
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getTenantGroups() {
        return tenantGroups;
    }
    
    
    public void setTenantGroups(Set<Integer> tenantGroups) {
        this.tenantGroups = tenantGroups;
    }
    
    
    public WritableConfigContext tenants(Set<Integer> tenants) {
        
        this.tenants = tenants;
        return this;
    }
    
    public WritableConfigContext addTenantsItem(Integer tenantsItem) {
        if (this.tenants == null) {
            this.tenants = new LinkedHashSet<>();
        }
        this.tenants.add(tenantsItem);
        return this;
    }
    
    /**
     * Get tenants
     *
     * @return tenants
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<Integer> getTenants() {
        return tenants;
    }
    
    
    public void setTenants(Set<Integer> tenants) {
        this.tenants = tenants;
    }
    
    
    public WritableConfigContext tags(Set<String> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public WritableConfigContext addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new LinkedHashSet<>();
        }
        this.tags.add(tagsItem);
        return this;
    }
    
    /**
     * Get tags
     *
     * @return tags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<String> getTags() {
        return tags;
    }
    
    
    public void setTags(Set<String> tags) {
        this.tags = tags;
    }
    
    
    public WritableConfigContext data(String data) {
        
        this.data = data;
        return this;
    }
    
    /**
     * Get data
     *
     * @return data
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public String getData() {
        return data;
    }
    
    
    public void setData(String data) {
        this.data = data;
    }
    
    
    /**
     * Get created
     *
     * @return created
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public OffsetDateTime getCreated() {
        return created;
    }
    
    
    /**
     * Get lastUpdated
     *
     * @return lastUpdated
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WritableConfigContext writableConfigContext = (WritableConfigContext) o;
        return Objects.equals(this.id, writableConfigContext.id) && Objects.equals(this.url, writableConfigContext.url) && Objects.equals(this.display, writableConfigContext.display) && Objects.equals(this.name, writableConfigContext.name) && Objects.equals(this.weight, writableConfigContext.weight) && Objects.equals(this.description, writableConfigContext.description) && Objects.equals(this.isActive, writableConfigContext.isActive) && Objects.equals(this.regions, writableConfigContext.regions) && Objects.equals(this.siteGroups, writableConfigContext.siteGroups) && Objects.equals(this.sites, writableConfigContext.sites) && Objects.equals(this.locations, writableConfigContext.locations) && Objects.equals(this.deviceTypes, writableConfigContext.deviceTypes) && Objects.equals(this.roles, writableConfigContext.roles) && Objects.equals(this.platforms, writableConfigContext.platforms) && Objects.equals(this.clusterTypes, writableConfigContext.clusterTypes) && Objects.equals(this.clusterGroups, writableConfigContext.clusterGroups) && Objects.equals(this.clusters, writableConfigContext.clusters) && Objects.equals(this.tenantGroups, writableConfigContext.tenantGroups) && Objects.equals(this.tenants, writableConfigContext.tenants) && Objects.equals(this.tags, writableConfigContext.tags) && Objects.equals(this.data, writableConfigContext.data) && Objects.equals(this.created, writableConfigContext.created) && Objects.equals(this.lastUpdated, writableConfigContext.lastUpdated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, name, weight, description, isActive, regions, siteGroups, sites, locations, deviceTypes, roles, platforms, clusterTypes, clusterGroups, clusters, tenantGroups, tenants, tags, data, created, lastUpdated);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WritableConfigContext {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    siteGroups: ").append(toIndentedString(siteGroups)).append("\n");
        sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
        sb.append("    deviceTypes: ").append(toIndentedString(deviceTypes)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
        sb.append("    clusterTypes: ").append(toIndentedString(clusterTypes)).append("\n");
        sb.append("    clusterGroups: ").append(toIndentedString(clusterGroups)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    tenantGroups: ").append(toIndentedString(tenantGroups)).append("\n");
        sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    
    
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;
    
    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("id");
        openapiFields.add("url");
        openapiFields.add("display");
        openapiFields.add("name");
        openapiFields.add("weight");
        openapiFields.add("description");
        openapiFields.add("is_active");
        openapiFields.add("regions");
        openapiFields.add("site_groups");
        openapiFields.add("sites");
        openapiFields.add("locations");
        openapiFields.add("device_types");
        openapiFields.add("roles");
        openapiFields.add("platforms");
        openapiFields.add("cluster_types");
        openapiFields.add("cluster_groups");
        openapiFields.add("clusters");
        openapiFields.add("tenant_groups");
        openapiFields.add("tenants");
        openapiFields.add("tags");
        openapiFields.add("data");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("data");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to WritableConfigContext
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (WritableConfigContext.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in WritableConfigContext is not found in the empty JSON string", WritableConfigContext.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!WritableConfigContext.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WritableConfigContext` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : WritableConfigContext.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
            }
        }
        if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url")
                    .toString()));
        }
        if (jsonObj.get("display") != null && !jsonObj.get("display").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display")
                    .toString()));
        }
        if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name")
                    .toString()));
        }
        if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("regions") != null && !jsonObj.get("regions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regions` to be an array in the JSON string but got `%s`", jsonObj.get("regions")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("site_groups") != null && !jsonObj.get("site_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `site_groups` to be an array in the JSON string but got `%s`", jsonObj.get("site_groups")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("sites") != null && !jsonObj.get("sites").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sites` to be an array in the JSON string but got `%s`", jsonObj.get("sites")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("locations") != null && !jsonObj.get("locations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `locations` to be an array in the JSON string but got `%s`", jsonObj.get("locations")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("device_types") != null && !jsonObj.get("device_types").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `device_types` to be an array in the JSON string but got `%s`", jsonObj.get("device_types")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("platforms") != null && !jsonObj.get("platforms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `platforms` to be an array in the JSON string but got `%s`", jsonObj.get("platforms")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("cluster_types") != null && !jsonObj.get("cluster_types").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cluster_types` to be an array in the JSON string but got `%s`", jsonObj.get("cluster_types")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("cluster_groups") != null && !jsonObj.get("cluster_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cluster_groups` to be an array in the JSON string but got `%s`", jsonObj.get("cluster_groups")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("clusters") != null && !jsonObj.get("clusters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clusters` to be an array in the JSON string but got `%s`", jsonObj.get("clusters")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("tenant_groups") != null && !jsonObj.get("tenant_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tenant_groups` to be an array in the JSON string but got `%s`", jsonObj.get("tenant_groups")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("tenants") != null && !jsonObj.get("tenants").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tenants` to be an array in the JSON string but got `%s`", jsonObj.get("tenants")
                    .toString()));
        }
        // ensure the json data is an array
        if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags")
                    .toString()));
        }
        if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data")
                    .toString()));
        }
    }
    
    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WritableConfigContext.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WritableConfigContext' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WritableConfigContext> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(WritableConfigContext.class));
            
            return (TypeAdapter<T>) new TypeAdapter<WritableConfigContext>() {
                @Override
                public void write(JsonWriter out, WritableConfigContext value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public WritableConfigContext read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of WritableConfigContext given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of WritableConfigContext
     *
     * @throws IOException if the JSON string is invalid with respect to WritableConfigContext
     */
    public static WritableConfigContext fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WritableConfigContext.class);
    }
    
    /**
     * Convert an instance of WritableConfigContext to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


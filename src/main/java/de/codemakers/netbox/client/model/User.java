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
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class User {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_USERNAME = "username";
    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;
    
    public static final String SERIALIZED_NAME_PASSWORD = "password";
    @SerializedName(SERIALIZED_NAME_PASSWORD)
    private String password;
    
    public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
    @SerializedName(SERIALIZED_NAME_FIRST_NAME)
    private String firstName;
    
    public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
    @SerializedName(SERIALIZED_NAME_LAST_NAME)
    private String lastName;
    
    public static final String SERIALIZED_NAME_EMAIL = "email";
    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;
    
    public static final String SERIALIZED_NAME_IS_STAFF = "is_staff";
    @SerializedName(SERIALIZED_NAME_IS_STAFF)
    private Boolean isStaff;
    
    public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
    @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
    private Boolean isActive;
    
    public static final String SERIALIZED_NAME_DATE_JOINED = "date_joined";
    @SerializedName(SERIALIZED_NAME_DATE_JOINED)
    private OffsetDateTime dateJoined;
    
    public static final String SERIALIZED_NAME_GROUPS = "groups";
    @SerializedName(SERIALIZED_NAME_GROUPS)
    private Set<NestedGroup> groups = null;
    
    public User() {
    }
    
    
    public User(Integer id, URI url, String display) {
        this();
        this.id = id;
        this.url = url;
        this.display = display;
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
    
    
    public User username(String username) {
        
        this.username = username;
        return this;
    }
    
    /**
     * Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.
     *
     * @return username
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.")
    
    public String getUsername() {
        return username;
    }
    
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    
    public User password(String password) {
        
        this.password = password;
        return this;
    }
    
    /**
     * Get password
     *
     * @return password
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    
    public String getPassword() {
        return password;
    }
    
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public User firstName(String firstName) {
        
        this.firstName = firstName;
        return this;
    }
    
    /**
     * Get firstName
     *
     * @return firstName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getFirstName() {
        return firstName;
    }
    
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
    public User lastName(String lastName) {
        
        this.lastName = lastName;
        return this;
    }
    
    /**
     * Get lastName
     *
     * @return lastName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getLastName() {
        return lastName;
    }
    
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public User email(String email) {
        
        this.email = email;
        return this;
    }
    
    /**
     * Get email
     *
     * @return email
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getEmail() {
        return email;
    }
    
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public User isStaff(Boolean isStaff) {
        
        this.isStaff = isStaff;
        return this;
    }
    
    /**
     * Designates whether the user can log into this admin site.
     *
     * @return isStaff
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Designates whether the user can log into this admin site.")
    
    public Boolean getIsStaff() {
        return isStaff;
    }
    
    
    public void setIsStaff(Boolean isStaff) {
        this.isStaff = isStaff;
    }
    
    
    public User isActive(Boolean isActive) {
        
        this.isActive = isActive;
        return this;
    }
    
    /**
     * Designates whether this user should be treated as active. Unselect this instead of deleting accounts.
     *
     * @return isActive
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Designates whether this user should be treated as active. Unselect this instead of deleting accounts.")
    
    public Boolean getIsActive() {
        return isActive;
    }
    
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    
    
    public User dateJoined(OffsetDateTime dateJoined) {
        
        this.dateJoined = dateJoined;
        return this;
    }
    
    /**
     * Get dateJoined
     *
     * @return dateJoined
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public OffsetDateTime getDateJoined() {
        return dateJoined;
    }
    
    
    public void setDateJoined(OffsetDateTime dateJoined) {
        this.dateJoined = dateJoined;
    }
    
    
    public User groups(Set<NestedGroup> groups) {
        
        this.groups = groups;
        return this;
    }
    
    public User addGroupsItem(NestedGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new LinkedHashSet<>();
        }
        this.groups.add(groupsItem);
        return this;
    }
    
    /**
     * Get groups
     *
     * @return groups
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public Set<NestedGroup> getGroups() {
        return groups;
    }
    
    
    public void setGroups(Set<NestedGroup> groups) {
        this.groups = groups;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.id, user.id) && Objects.equals(this.url, user.url) && Objects.equals(this.display, user.display) && Objects.equals(this.username, user.username) && Objects.equals(this.password, user.password) && Objects.equals(this.firstName, user.firstName) && Objects.equals(this.lastName, user.lastName) && Objects.equals(this.email, user.email) && Objects.equals(this.isStaff, user.isStaff) && Objects.equals(this.isActive, user.isActive) && Objects.equals(this.dateJoined, user.dateJoined) && Objects.equals(this.groups, user.groups);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, username, password, firstName, lastName, email, isStaff, isActive, dateJoined, groups);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    isStaff: ").append(toIndentedString(isStaff)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
        openapiFields.add("username");
        openapiFields.add("password");
        openapiFields.add("first_name");
        openapiFields.add("last_name");
        openapiFields.add("email");
        openapiFields.add("is_staff");
        openapiFields.add("is_active");
        openapiFields.add("date_joined");
        openapiFields.add("groups");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("username");
        openapiRequiredFields.add("password");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to User
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (User.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!User.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : User.openapiRequiredFields) {
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
        if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username")
                    .toString()));
        }
        if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password")
                    .toString()));
        }
        if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name")
                    .toString()));
        }
        if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name")
                    .toString()));
        }
        if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email")
                    .toString()));
        }
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
            // ensure the json data is an array
            if (!jsonObj.get("groups").isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups")
                        .toString()));
            }
            
            // validate the optional field `groups` (array)
            for (int i = 0; i < jsonArraygroups.size(); i++) {
                NestedGroup.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
            }
            ;
        }
    }
    
    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!User.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'User' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<User> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(User.class));
            
            return (TypeAdapter<T>) new TypeAdapter<User>() {
                @Override
                public void write(JsonWriter out, User value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public User read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of User given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of User
     *
     * @throws IOException if the JSON string is invalid with respect to User
     */
    public static User fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, User.class);
    }
    
    /**
     * Convert an instance of User to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


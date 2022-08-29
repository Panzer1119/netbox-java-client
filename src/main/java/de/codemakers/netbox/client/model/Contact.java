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
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Map.Entry;

/**
 * Contact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T15:14:28.278845400+02:00[Europe/Berlin]")
public class Contact {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    
    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    
    public static final String SERIALIZED_NAME_DISPLAY = "display";
    @SerializedName(SERIALIZED_NAME_DISPLAY)
    private String display;
    
    public static final String SERIALIZED_NAME_GROUP = "group";
    @SerializedName(SERIALIZED_NAME_GROUP)
    private NestedContactGroup group;
    
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    
    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;
    
    public static final String SERIALIZED_NAME_PHONE = "phone";
    @SerializedName(SERIALIZED_NAME_PHONE)
    private String phone;
    
    public static final String SERIALIZED_NAME_EMAIL = "email";
    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;
    
    public static final String SERIALIZED_NAME_ADDRESS = "address";
    @SerializedName(SERIALIZED_NAME_ADDRESS)
    private String address;
    
    public static final String SERIALIZED_NAME_LINK = "link";
    @SerializedName(SERIALIZED_NAME_LINK)
    private URI link;
    
    public static final String SERIALIZED_NAME_COMMENTS = "comments";
    @SerializedName(SERIALIZED_NAME_COMMENTS)
    private String comments;
    
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
    
    public Contact() {
    }
    
    
    public Contact(Integer id, URI url, String display, OffsetDateTime created, OffsetDateTime lastUpdated) {
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
    
    
    public Contact group(NestedContactGroup group) {
        
        this.group = group;
        return this;
    }
    
    /**
     * Get group
     *
     * @return group
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public NestedContactGroup getGroup() {
        return group;
    }
    
    
    public void setGroup(NestedContactGroup group) {
        this.group = group;
    }
    
    
    public Contact name(String name) {
        
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
    
    
    public Contact title(String title) {
        
        this.title = title;
        return this;
    }
    
    /**
     * Get title
     *
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getTitle() {
        return title;
    }
    
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    public Contact phone(String phone) {
        
        this.phone = phone;
        return this;
    }
    
    /**
     * Get phone
     *
     * @return phone
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getPhone() {
        return phone;
    }
    
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    public Contact email(String email) {
        
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
    
    
    public Contact address(String address) {
        
        this.address = address;
        return this;
    }
    
    /**
     * Get address
     *
     * @return address
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getAddress() {
        return address;
    }
    
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public Contact link(URI link) {
        
        this.link = link;
        return this;
    }
    
    /**
     * Get link
     *
     * @return link
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public URI getLink() {
        return link;
    }
    
    
    public void setLink(URI link) {
        this.link = link;
    }
    
    
    public Contact comments(String comments) {
        
        this.comments = comments;
        return this;
    }
    
    /**
     * Get comments
     *
     * @return comments
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    
    public String getComments() {
        return comments;
    }
    
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    public Contact tags(List<NestedTag> tags) {
        
        this.tags = tags;
        return this;
    }
    
    public Contact addTagsItem(NestedTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
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
    
    public List<NestedTag> getTags() {
        return tags;
    }
    
    
    public void setTags(List<NestedTag> tags) {
        this.tags = tags;
    }
    
    
    public Contact customFields(Object customFields) {
        
        this.customFields = customFields;
        return this;
    }
    
    /**
     * Get customFields
     *
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
        Contact contact = (Contact) o;
        return Objects.equals(this.id, contact.id) && Objects.equals(this.url, contact.url) && Objects.equals(this.display, contact.display) && Objects.equals(this.group, contact.group) && Objects.equals(this.name, contact.name) && Objects.equals(this.title, contact.title) && Objects.equals(this.phone, contact.phone) && Objects.equals(this.email, contact.email) && Objects.equals(this.address, contact.address) && Objects.equals(this.link, contact.link) && Objects.equals(this.comments, contact.comments) && Objects.equals(this.tags, contact.tags) && Objects.equals(this.customFields, contact.customFields) && Objects.equals(this.created, contact.created) && Objects.equals(this.lastUpdated, contact.lastUpdated);
    }
    
    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, url, display, group, name, title, phone, email, address, link, comments, tags, customFields, created, lastUpdated);
    }
    
    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Contact {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
        openapiFields.add("group");
        openapiFields.add("name");
        openapiFields.add("title");
        openapiFields.add("phone");
        openapiFields.add("email");
        openapiFields.add("address");
        openapiFields.add("link");
        openapiFields.add("comments");
        openapiFields.add("tags");
        openapiFields.add("custom_fields");
        openapiFields.add("created");
        openapiFields.add("last_updated");
        
        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
    }
    
    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     *
     * @throws IOException if the JSON Object is invalid with respect to Contact
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (Contact.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in Contact is not found in the empty JSON string", Contact.openapiRequiredFields.toString()));
            }
        }
        
        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Contact.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Contact` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
            }
        }
        
        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Contact.openapiRequiredFields) {
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
        // validate the optional field `group`
        if (jsonObj.getAsJsonObject("group") != null) {
            NestedContactGroup.validateJsonObject(jsonObj.getAsJsonObject("group"));
        }
        if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name")
                    .toString()));
        }
        if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title")
                    .toString()));
        }
        if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone")
                    .toString()));
        }
        if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email")
                    .toString()));
        }
        if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address")
                    .toString()));
        }
        if (jsonObj.get("link") != null && !jsonObj.get("link").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link")
                    .toString()));
        }
        if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments")
                    .toString()));
        }
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
            // ensure the json data is an array
            if (!jsonObj.get("tags").isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags")
                        .toString()));
            }
            
            // validate the optional field `tags` (array)
            for (int i = 0; i < jsonArraytags.size(); i++) {
                NestedTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
            }
            ;
        }
    }
    
    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Contact.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Contact' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Contact> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(Contact.class));
            
            return (TypeAdapter<T>) new TypeAdapter<Contact>() {
                @Override
                public void write(JsonWriter out, Contact value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }
                
                @Override
                public Contact read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    validateJsonObject(jsonObj);
                    return thisAdapter.fromJsonTree(jsonObj);
                }
                
            }.nullSafe();
        }
    }
    
    /**
     * Create an instance of Contact given an JSON string
     *
     * @param jsonString JSON string
     *
     * @return An instance of Contact
     *
     * @throws IOException if the JSON string is invalid with respect to Contact
     */
    public static Contact fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Contact.class);
    }
    
    /**
     * Convert an instance of Contact to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}


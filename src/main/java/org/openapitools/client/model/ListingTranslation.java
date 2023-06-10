/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace Etsy's Open API v2, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/discussions\">please add an issue in Github</a>.</p></div>&copy; 2021-2023 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: developers@etsy.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Represents the translation data for a Listing.
 */
@ApiModel(description = "Represents the translation data for a Listing.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-08T08:37:51.285-04:00[America/Toronto]")
public class ListingTranslation {
  public static final String SERIALIZED_NAME_LISTING_ID = "listing_id";
  @SerializedName(SERIALIZED_NAME_LISTING_ID)
  private Long listingId;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public ListingTranslation() { 
  }

  public ListingTranslation listingId(Long listingId) {
    
    this.listingId = listingId;
    return this;
  }

   /**
   * The numeric ID for the Listing.
   * minimum: 1
   * @return listingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric ID for the Listing.")

  public Long getListingId() {
    return listingId;
  }


  public void setListingId(Long listingId) {
    this.listingId = listingId;
  }


  public ListingTranslation language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The IETF language tag (e.g. &#39;fr&#39;) for the language of this translation.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IETF language tag (e.g. 'fr') for the language of this translation.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public ListingTranslation title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the Listing of this Translation.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the Listing of this Translation.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ListingTranslation description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the Listing of this Translation.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the Listing of this Translation.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ListingTranslation tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ListingTranslation addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags of the Listing of this Translation.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tags of the Listing of this Translation.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingTranslation listingTranslation = (ListingTranslation) o;
    return Objects.equals(this.listingId, listingTranslation.listingId) &&
        Objects.equals(this.language, listingTranslation.language) &&
        Objects.equals(this.title, listingTranslation.title) &&
        Objects.equals(this.description, listingTranslation.description) &&
        Objects.equals(this.tags, listingTranslation.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, language, title, description, tags);
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
    sb.append("class ListingTranslation {\n");
    sb.append("    listingId: ").append(toIndentedString(listingId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


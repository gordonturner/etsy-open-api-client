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

/**
 * A scale defnining the assignable increments for the property values available to specific product properties.
 */
@ApiModel(description = "A scale defnining the assignable increments for the property values available to specific product properties.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-08T08:37:51.285-04:00[America/Toronto]")
public class BuyerTaxonomyPropertyScale {
  public static final String SERIALIZED_NAME_SCALE_ID = "scale_id";
  @SerializedName(SERIALIZED_NAME_SCALE_ID)
  private Long scaleId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BuyerTaxonomyPropertyScale() { 
  }

  public BuyerTaxonomyPropertyScale scaleId(Long scaleId) {
    
    this.scaleId = scaleId;
    return this;
  }

   /**
   * The unique numeric ID of a scale.
   * minimum: 1
   * @return scaleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique numeric ID of a scale.")

  public Long getScaleId() {
    return scaleId;
  }


  public void setScaleId(Long scaleId) {
    this.scaleId = scaleId;
  }


  public BuyerTaxonomyPropertyScale displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name string for a scale.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name string for a scale.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public BuyerTaxonomyPropertyScale description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description string for a scale.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description string for a scale.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerTaxonomyPropertyScale buyerTaxonomyPropertyScale = (BuyerTaxonomyPropertyScale) o;
    return Objects.equals(this.scaleId, buyerTaxonomyPropertyScale.scaleId) &&
        Objects.equals(this.displayName, buyerTaxonomyPropertyScale.displayName) &&
        Objects.equals(this.description, buyerTaxonomyPropertyScale.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleId, displayName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerTaxonomyPropertyScale {\n");
    sb.append("    scaleId: ").append(toIndentedString(scaleId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


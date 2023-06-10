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
import org.openapitools.client.model.Money;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A representation of an offering for a listing.
 */
@ApiModel(description = "A representation of an offering for a listing.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-08T08:37:51.285-04:00[America/Toronto]")
public class ListingInventoryProductOffering {
  public static final String SERIALIZED_NAME_OFFERING_ID = "offering_id";
  @SerializedName(SERIALIZED_NAME_OFFERING_ID)
  private Long offeringId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity;

  public static final String SERIALIZED_NAME_IS_ENABLED = "is_enabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_IS_DELETED = "is_deleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Money price;

  public ListingInventoryProductOffering() { 
  }

  public ListingInventoryProductOffering offeringId(Long offeringId) {
    
    this.offeringId = offeringId;
    return this;
  }

   /**
   * The ID for the ProductOffering
   * minimum: 1
   * @return offeringId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID for the ProductOffering")

  public Long getOfferingId() {
    return offeringId;
  }


  public void setOfferingId(Long offeringId) {
    this.offeringId = offeringId;
  }


  public ListingInventoryProductOffering quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity the ProductOffering
   * minimum: 0
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quantity the ProductOffering")

  public Long getQuantity() {
    return quantity;
  }


  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public ListingInventoryProductOffering isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether or not the offering can be shown to buyers.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the offering can be shown to buyers.")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public ListingInventoryProductOffering isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Whether or not the offering has been deleted.
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the offering has been deleted.")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ListingInventoryProductOffering price(Money price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price data for this ProductOffering
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price data for this ProductOffering")

  public Money getPrice() {
    return price;
  }


  public void setPrice(Money price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingInventoryProductOffering listingInventoryProductOffering = (ListingInventoryProductOffering) o;
    return Objects.equals(this.offeringId, listingInventoryProductOffering.offeringId) &&
        Objects.equals(this.quantity, listingInventoryProductOffering.quantity) &&
        Objects.equals(this.isEnabled, listingInventoryProductOffering.isEnabled) &&
        Objects.equals(this.isDeleted, listingInventoryProductOffering.isDeleted) &&
        Objects.equals(this.price, listingInventoryProductOffering.price);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offeringId, quantity, isEnabled, isDeleted, price);
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
    sb.append("class ListingInventoryProductOffering {\n");
    sb.append("    offeringId: ").append(toIndentedString(offeringId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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


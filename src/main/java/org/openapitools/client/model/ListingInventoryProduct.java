/*
 * Etsy Open API v3
 * <div class=\"wt-text-body-01\"><p class=\"wt-pt-xs-2 wt-pb-xs-2\">Etsy's Open API provides a simple RESTful interface for various Etsy.com features. The API endpoints are meant to replace <a class=\"wt-text-link wt-p-xs-0\" href=\"https://www.etsy.com/developers/documentation\">Etsy's Open API v2</a>, which is scheduled to end service in 2022.</p><p class=\"wt-pb-xs-2\">All of the endpoints are callable and the majority of the API endpoints are now in a beta phase. This means we do not expect to make any breaking changes before our general release. A handful of endpoints are currently interface stubs (labeled “Feedback Only”) and returns a \"501 Not Implemented\" response code when called.</p><p class=\"wt-pb-xs-2\">If you'd like to report an issue or provide feedback on the API design, <a target=\"_blank\" class=\"wt-text-link wt-p-xs-0\" href=\"https://github.com/etsy/open-api/issues/new/choose\">please add an issue in Github</a>.</p></div>&copy; 2021-2022 Etsy, Inc. All Rights Reserved. Use of this code is subject to Etsy's <a class='wt-text-link wt-p-xs-0' target='_blank' href='https://www.etsy.com/legal/api'>API Developer Terms of Use</a>.
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
import org.openapitools.client.model.ListingInventoryProductOffering;
import org.openapitools.client.model.ListingPropertyValue;

/**
 * A representation of a product for a listing.
 */
@ApiModel(description = "A representation of a product for a listing.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-08T15:52:16.342-04:00[America/Toronto]")
public class ListingInventoryProduct {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_IS_DELETED = "is_deleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_OFFERINGS = "offerings";
  @SerializedName(SERIALIZED_NAME_OFFERINGS)
  private List<ListingInventoryProductOffering> offerings = new ArrayList<ListingInventoryProductOffering>();

  public static final String SERIALIZED_NAME_PROPERTY_VALUES = "property_values";
  @SerializedName(SERIALIZED_NAME_PROPERTY_VALUES)
  private List<ListingPropertyValue> propertyValues = new ArrayList<ListingPropertyValue>();

  public ListingInventoryProduct() { 
  }

  public ListingInventoryProduct productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * The numeric ID for a specific [product](/documentation/reference#tag/ShopListing-Product) purchased from a listing.
   * minimum: 1
   * @return productId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The numeric ID for a specific [product](/documentation/reference#tag/ShopListing-Product) purchased from a listing.")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public ListingInventoryProduct sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * The SKU string for the product
   * @return sku
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The SKU string for the product")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public ListingInventoryProduct isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * When true, someone deleted this product.
   * @return isDeleted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When true, someone deleted this product.")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ListingInventoryProduct offerings(List<ListingInventoryProductOffering> offerings) {
    
    this.offerings = offerings;
    return this;
  }

  public ListingInventoryProduct addOfferingsItem(ListingInventoryProductOffering offeringsItem) {
    this.offerings.add(offeringsItem);
    return this;
  }

   /**
   * A list of product offering entries for this product.
   * @return offerings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of product offering entries for this product.")

  public List<ListingInventoryProductOffering> getOfferings() {
    return offerings;
  }


  public void setOfferings(List<ListingInventoryProductOffering> offerings) {
    this.offerings = offerings;
  }


  public ListingInventoryProduct propertyValues(List<ListingPropertyValue> propertyValues) {
    
    this.propertyValues = propertyValues;
    return this;
  }

  public ListingInventoryProduct addPropertyValuesItem(ListingPropertyValue propertyValuesItem) {
    this.propertyValues.add(propertyValuesItem);
    return this;
  }

   /**
   * A list of property value entries for this product.
   * @return propertyValues
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of property value entries for this product.")

  public List<ListingPropertyValue> getPropertyValues() {
    return propertyValues;
  }


  public void setPropertyValues(List<ListingPropertyValue> propertyValues) {
    this.propertyValues = propertyValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingInventoryProduct listingInventoryProduct = (ListingInventoryProduct) o;
    return Objects.equals(this.productId, listingInventoryProduct.productId) &&
        Objects.equals(this.sku, listingInventoryProduct.sku) &&
        Objects.equals(this.isDeleted, listingInventoryProduct.isDeleted) &&
        Objects.equals(this.offerings, listingInventoryProduct.offerings) &&
        Objects.equals(this.propertyValues, listingInventoryProduct.propertyValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, sku, isDeleted, offerings, propertyValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingInventoryProduct {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    offerings: ").append(toIndentedString(offerings)).append("\n");
    sb.append("    propertyValues: ").append(toIndentedString(propertyValues)).append("\n");
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

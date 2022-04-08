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
import org.openapitools.client.model.ListingInventoryProduct;
import org.openapitools.client.model.ShopListing;

/**
 * A representation of a single listing&#39;s inventory record with associations
 */
@ApiModel(description = "A representation of a single listing's inventory record with associations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-08T15:52:16.342-04:00[America/Toronto]")
public class ListingInventoryWithAssociations {
  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<ListingInventoryProduct> products = new ArrayList<ListingInventoryProduct>();

  public static final String SERIALIZED_NAME_PRICE_ON_PROPERTY = "price_on_property";
  @SerializedName(SERIALIZED_NAME_PRICE_ON_PROPERTY)
  private List<Integer> priceOnProperty = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_QUANTITY_ON_PROPERTY = "quantity_on_property";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ON_PROPERTY)
  private List<Integer> quantityOnProperty = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_SKU_ON_PROPERTY = "sku_on_property";
  @SerializedName(SERIALIZED_NAME_SKU_ON_PROPERTY)
  private List<Integer> skuOnProperty = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_LISTING = "listing";
  @SerializedName(SERIALIZED_NAME_LISTING)
  private ShopListing listing;

  public ListingInventoryWithAssociations() { 
  }

  public ListingInventoryWithAssociations products(List<ListingInventoryProduct> products) {
    
    this.products = products;
    return this;
  }

  public ListingInventoryWithAssociations addProductsItem(ListingInventoryProduct productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * A JSON array of products available in a listing, even if only one product. All field names in the JSON blobs are lowercase.
   * @return products
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A JSON array of products available in a listing, even if only one product. All field names in the JSON blobs are lowercase.")

  public List<ListingInventoryProduct> getProducts() {
    return products;
  }


  public void setProducts(List<ListingInventoryProduct> products) {
    this.products = products;
  }


  public ListingInventoryWithAssociations priceOnProperty(List<Integer> priceOnProperty) {
    
    this.priceOnProperty = priceOnProperty;
    return this;
  }

  public ListingInventoryWithAssociations addPriceOnPropertyItem(Integer priceOnPropertyItem) {
    this.priceOnProperty.add(priceOnPropertyItem);
    return this;
  }

   /**
   * An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change product prices, if any. For example, if you charge specific prices for different sized products in the same listing, then this array contains the property ID for size.
   * @return priceOnProperty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change product prices, if any. For example, if you charge specific prices for different sized products in the same listing, then this array contains the property ID for size.")

  public List<Integer> getPriceOnProperty() {
    return priceOnProperty;
  }


  public void setPriceOnProperty(List<Integer> priceOnProperty) {
    this.priceOnProperty = priceOnProperty;
  }


  public ListingInventoryWithAssociations quantityOnProperty(List<Integer> quantityOnProperty) {
    
    this.quantityOnProperty = quantityOnProperty;
    return this;
  }

  public ListingInventoryWithAssociations addQuantityOnPropertyItem(Integer quantityOnPropertyItem) {
    this.quantityOnProperty.add(quantityOnPropertyItem);
    return this;
  }

   /**
   * An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change the quantity of the products, if any. For example, if you stock specific quantities of different colored products in the same listing, then this array contains the property ID for color.
   * @return quantityOnProperty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change the quantity of the products, if any. For example, if you stock specific quantities of different colored products in the same listing, then this array contains the property ID for color.")

  public List<Integer> getQuantityOnProperty() {
    return quantityOnProperty;
  }


  public void setQuantityOnProperty(List<Integer> quantityOnProperty) {
    this.quantityOnProperty = quantityOnProperty;
  }


  public ListingInventoryWithAssociations skuOnProperty(List<Integer> skuOnProperty) {
    
    this.skuOnProperty = skuOnProperty;
    return this;
  }

  public ListingInventoryWithAssociations addSkuOnPropertyItem(Integer skuOnPropertyItem) {
    this.skuOnProperty.add(skuOnPropertyItem);
    return this;
  }

   /**
   * An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change the product SKU, if any. For example, if you use specific skus for different colored products in the same listing, then this array contains the property ID for color.
   * @return skuOnProperty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of unique [listing property](/documentation/reference#operation/getListingProperties) ID integers for the properties that change the product SKU, if any. For example, if you use specific skus for different colored products in the same listing, then this array contains the property ID for color.")

  public List<Integer> getSkuOnProperty() {
    return skuOnProperty;
  }


  public void setSkuOnProperty(List<Integer> skuOnProperty) {
    this.skuOnProperty = skuOnProperty;
  }


  public ListingInventoryWithAssociations listing(ShopListing listing) {
    
    this.listing = listing;
    return this;
  }

   /**
   * An enumerated string that attaches an valid association. Default value is null.
   * @return listing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An enumerated string that attaches an valid association. Default value is null.")

  public ShopListing getListing() {
    return listing;
  }


  public void setListing(ShopListing listing) {
    this.listing = listing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingInventoryWithAssociations listingInventoryWithAssociations = (ListingInventoryWithAssociations) o;
    return Objects.equals(this.products, listingInventoryWithAssociations.products) &&
        Objects.equals(this.priceOnProperty, listingInventoryWithAssociations.priceOnProperty) &&
        Objects.equals(this.quantityOnProperty, listingInventoryWithAssociations.quantityOnProperty) &&
        Objects.equals(this.skuOnProperty, listingInventoryWithAssociations.skuOnProperty) &&
        Objects.equals(this.listing, listingInventoryWithAssociations.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, priceOnProperty, quantityOnProperty, skuOnProperty, listing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingInventoryWithAssociations {\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    priceOnProperty: ").append(toIndentedString(priceOnProperty)).append("\n");
    sb.append("    quantityOnProperty: ").append(toIndentedString(quantityOnProperty)).append("\n");
    sb.append("    skuOnProperty: ").append(toIndentedString(skuOnProperty)).append("\n");
    sb.append("    listing: ").append(toIndentedString(listing)).append("\n");
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


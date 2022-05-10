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

/**
 * Represents a description of a shop production partner.
 */
@ApiModel(description = "Represents a description of a shop production partner.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-07T10:51:54.559-04:00[America/Toronto]")
public class ShopProductionPartner {
  public static final String SERIALIZED_NAME_PRODUCTION_PARTNER_ID = "production_partner_id";
  @SerializedName(SERIALIZED_NAME_PRODUCTION_PARTNER_ID)
  private Long productionPartnerId;

  public static final String SERIALIZED_NAME_PARTNER_NAME = "partner_name";
  @SerializedName(SERIALIZED_NAME_PARTNER_NAME)
  private String partnerName;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public ShopProductionPartner() { 
  }

  public ShopProductionPartner productionPartnerId(Long productionPartnerId) {
    
    this.productionPartnerId = productionPartnerId;
    return this;
  }

   /**
   * The numeric ID of a production partner.
   * minimum: 1
   * @return productionPartnerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The numeric ID of a production partner.")

  public Long getProductionPartnerId() {
    return productionPartnerId;
  }


  public void setProductionPartnerId(Long productionPartnerId) {
    this.productionPartnerId = productionPartnerId;
  }


  public ShopProductionPartner partnerName(String partnerName) {
    
    this.partnerName = partnerName;
    return this;
  }

   /**
   * The name or title of the production partner.
   * @return partnerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name or title of the production partner.")

  public String getPartnerName() {
    return partnerName;
  }


  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }


  public ShopProductionPartner location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * A string representing the production partner location.
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A string representing the production partner location.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopProductionPartner shopProductionPartner = (ShopProductionPartner) o;
    return Objects.equals(this.productionPartnerId, shopProductionPartner.productionPartnerId) &&
        Objects.equals(this.partnerName, shopProductionPartner.partnerName) &&
        Objects.equals(this.location, shopProductionPartner.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productionPartnerId, partnerName, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopProductionPartner {\n");
    sb.append("    productionPartnerId: ").append(toIndentedString(productionPartnerId)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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


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
import org.openapitools.client.model.ShippingCarrierMailClass;

/**
 * A supported shipping carrier, which is used to calculate an Estimated Delivery Date.
 */
@ApiModel(description = "A supported shipping carrier, which is used to calculate an Estimated Delivery Date.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-08T15:52:16.342-04:00[America/Toronto]")
public class ShippingCarrier {
  public static final String SERIALIZED_NAME_SHIPPING_CARRIER_ID = "shipping_carrier_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CARRIER_ID)
  private Integer shippingCarrierId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOMESTIC_CLASSES = "domestic_classes";
  @SerializedName(SERIALIZED_NAME_DOMESTIC_CLASSES)
  private List<ShippingCarrierMailClass> domesticClasses = new ArrayList<ShippingCarrierMailClass>();

  public static final String SERIALIZED_NAME_INTERNATIONAL_CLASSES = "international_classes";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_CLASSES)
  private List<ShippingCarrierMailClass> internationalClasses = new ArrayList<ShippingCarrierMailClass>();

  public ShippingCarrier() { 
  }

  public ShippingCarrier shippingCarrierId(Integer shippingCarrierId) {
    
    this.shippingCarrierId = shippingCarrierId;
    return this;
  }

   /**
   * The numeric ID of this shipping carrier.
   * minimum: 1
   * @return shippingCarrierId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The numeric ID of this shipping carrier.")

  public Integer getShippingCarrierId() {
    return shippingCarrierId;
  }


  public void setShippingCarrierId(Integer shippingCarrierId) {
    this.shippingCarrierId = shippingCarrierId;
  }


  public ShippingCarrier name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this shipping carrier.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of this shipping carrier.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ShippingCarrier domesticClasses(List<ShippingCarrierMailClass> domesticClasses) {
    
    this.domesticClasses = domesticClasses;
    return this;
  }

  public ShippingCarrier addDomesticClassesItem(ShippingCarrierMailClass domesticClassesItem) {
    this.domesticClasses.add(domesticClassesItem);
    return this;
  }

   /**
   * Set of domestic mail classes of this shipping carrier.
   * @return domesticClasses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Set of domestic mail classes of this shipping carrier.")

  public List<ShippingCarrierMailClass> getDomesticClasses() {
    return domesticClasses;
  }


  public void setDomesticClasses(List<ShippingCarrierMailClass> domesticClasses) {
    this.domesticClasses = domesticClasses;
  }


  public ShippingCarrier internationalClasses(List<ShippingCarrierMailClass> internationalClasses) {
    
    this.internationalClasses = internationalClasses;
    return this;
  }

  public ShippingCarrier addInternationalClassesItem(ShippingCarrierMailClass internationalClassesItem) {
    this.internationalClasses.add(internationalClassesItem);
    return this;
  }

   /**
   * Set of international mail classes of this shipping carrier.
   * @return internationalClasses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Set of international mail classes of this shipping carrier.")

  public List<ShippingCarrierMailClass> getInternationalClasses() {
    return internationalClasses;
  }


  public void setInternationalClasses(List<ShippingCarrierMailClass> internationalClasses) {
    this.internationalClasses = internationalClasses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingCarrier shippingCarrier = (ShippingCarrier) o;
    return Objects.equals(this.shippingCarrierId, shippingCarrier.shippingCarrierId) &&
        Objects.equals(this.name, shippingCarrier.name) &&
        Objects.equals(this.domesticClasses, shippingCarrier.domesticClasses) &&
        Objects.equals(this.internationalClasses, shippingCarrier.internationalClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingCarrierId, name, domesticClasses, internationalClasses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingCarrier {\n");
    sb.append("    shippingCarrierId: ").append(toIndentedString(shippingCarrierId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domesticClasses: ").append(toIndentedString(domesticClasses)).append("\n");
    sb.append("    internationalClasses: ").append(toIndentedString(internationalClasses)).append("\n");
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

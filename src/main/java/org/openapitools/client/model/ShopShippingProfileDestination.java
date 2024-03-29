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
 * Represents a shipping destination assigned to a shipping profile.
 */
@ApiModel(description = "Represents a shipping destination assigned to a shipping profile.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-08T08:37:51.285-04:00[America/Toronto]")
public class ShopShippingProfileDestination {
  public static final String SERIALIZED_NAME_SHIPPING_PROFILE_DESTINATION_ID = "shipping_profile_destination_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PROFILE_DESTINATION_ID)
  private Long shippingProfileDestinationId;

  public static final String SERIALIZED_NAME_SHIPPING_PROFILE_ID = "shipping_profile_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PROFILE_ID)
  private Long shippingProfileId;

  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY_ISO = "origin_country_iso";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY_ISO)
  private String originCountryIso;

  public static final String SERIALIZED_NAME_DESTINATION_COUNTRY_ISO = "destination_country_iso";
  @SerializedName(SERIALIZED_NAME_DESTINATION_COUNTRY_ISO)
  private String destinationCountryIso;

  /**
   * The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If \\&#x60;none\\&#x60;, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided.
   */
  @JsonAdapter(DestinationRegionEnum.Adapter.class)
  public enum DestinationRegionEnum {
    EU("eu"),
    
    NON_EU("non_eu"),
    
    NONE("none");

    private String value;

    DestinationRegionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationRegionEnum fromValue(String value) {
      for (DestinationRegionEnum b : DestinationRegionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationRegionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationRegionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationRegionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationRegionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_REGION = "destination_region";
  @SerializedName(SERIALIZED_NAME_DESTINATION_REGION)
  private DestinationRegionEnum destinationRegion;

  public static final String SERIALIZED_NAME_PRIMARY_COST = "primary_cost";
  @SerializedName(SERIALIZED_NAME_PRIMARY_COST)
  private Money primaryCost;

  public static final String SERIALIZED_NAME_SECONDARY_COST = "secondary_cost";
  @SerializedName(SERIALIZED_NAME_SECONDARY_COST)
  private Money secondaryCost;

  public static final String SERIALIZED_NAME_SHIPPING_CARRIER_ID = "shipping_carrier_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CARRIER_ID)
  private Long shippingCarrierId;

  public static final String SERIALIZED_NAME_MAIL_CLASS = "mail_class";
  @SerializedName(SERIALIZED_NAME_MAIL_CLASS)
  private String mailClass;

  public static final String SERIALIZED_NAME_MIN_DELIVERY_DAYS = "min_delivery_days";
  @SerializedName(SERIALIZED_NAME_MIN_DELIVERY_DAYS)
  private Long minDeliveryDays;

  public static final String SERIALIZED_NAME_MAX_DELIVERY_DAYS = "max_delivery_days";
  @SerializedName(SERIALIZED_NAME_MAX_DELIVERY_DAYS)
  private Long maxDeliveryDays;

  public ShopShippingProfileDestination() { 
  }

  public ShopShippingProfileDestination shippingProfileDestinationId(Long shippingProfileDestinationId) {
    
    this.shippingProfileDestinationId = shippingProfileDestinationId;
    return this;
  }

   /**
   * The numeric ID of the shipping profile destination in the [shipping profile](/documentation/reference#tag/Shop-ShippingProfile) associated with the listing.
   * minimum: 1
   * @return shippingProfileDestinationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric ID of the shipping profile destination in the [shipping profile](/documentation/reference#tag/Shop-ShippingProfile) associated with the listing.")

  public Long getShippingProfileDestinationId() {
    return shippingProfileDestinationId;
  }


  public void setShippingProfileDestinationId(Long shippingProfileDestinationId) {
    this.shippingProfileDestinationId = shippingProfileDestinationId;
  }


  public ShopShippingProfileDestination shippingProfileId(Long shippingProfileId) {
    
    this.shippingProfileId = shippingProfileId;
    return this;
  }

   /**
   * The numeric ID of the shipping profile.
   * minimum: 1
   * @return shippingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric ID of the shipping profile.")

  public Long getShippingProfileId() {
    return shippingProfileId;
  }


  public void setShippingProfileId(Long shippingProfileId) {
    this.shippingProfileId = shippingProfileId;
  }


  public ShopShippingProfileDestination originCountryIso(String originCountryIso) {
    
    this.originCountryIso = originCountryIso;
    return this;
  }

   /**
   * The ISO code of the country from which the listing ships.
   * @return originCountryIso
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO code of the country from which the listing ships.")

  public String getOriginCountryIso() {
    return originCountryIso;
  }


  public void setOriginCountryIso(String originCountryIso) {
    this.originCountryIso = originCountryIso;
  }


  public ShopShippingProfileDestination destinationCountryIso(String destinationCountryIso) {
    
    this.destinationCountryIso = destinationCountryIso;
    return this;
  }

   /**
   * The ISO code of the country to which the listing ships. If null, request sets destination to destination_region. Required if destination_region is null or not provided.
   * @return destinationCountryIso
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO code of the country to which the listing ships. If null, request sets destination to destination_region. Required if destination_region is null or not provided.")

  public String getDestinationCountryIso() {
    return destinationCountryIso;
  }


  public void setDestinationCountryIso(String destinationCountryIso) {
    this.destinationCountryIso = destinationCountryIso;
  }


  public ShopShippingProfileDestination destinationRegion(DestinationRegionEnum destinationRegion) {
    
    this.destinationRegion = destinationRegion;
    return this;
  }

   /**
   * The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If \\&#x60;none\\&#x60;, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided.
   * @return destinationRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The code of the region to which the listing ships. A region represents a set of countries. Supported regions are Europe Union and Non-Europe Union (countries in Europe not in EU). If \\`none\\`, request sets destination to destination_country_iso. Required if destination_country_iso is null or not provided.")

  public DestinationRegionEnum getDestinationRegion() {
    return destinationRegion;
  }


  public void setDestinationRegion(DestinationRegionEnum destinationRegion) {
    this.destinationRegion = destinationRegion;
  }


  public ShopShippingProfileDestination primaryCost(Money primaryCost) {
    
    this.primaryCost = primaryCost;
    return this;
  }

   /**
   * The cost of shipping to this country/region alone, measured in the store&#39;s default currency.
   * @return primaryCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cost of shipping to this country/region alone, measured in the store's default currency.")

  public Money getPrimaryCost() {
    return primaryCost;
  }


  public void setPrimaryCost(Money primaryCost) {
    this.primaryCost = primaryCost;
  }


  public ShopShippingProfileDestination secondaryCost(Money secondaryCost) {
    
    this.secondaryCost = secondaryCost;
    return this;
  }

   /**
   * The cost of shipping to this country/region with another item, measured in the store&#39;s default currency.
   * @return secondaryCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cost of shipping to this country/region with another item, measured in the store's default currency.")

  public Money getSecondaryCost() {
    return secondaryCost;
  }


  public void setSecondaryCost(Money secondaryCost) {
    this.secondaryCost = secondaryCost;
  }


  public ShopShippingProfileDestination shippingCarrierId(Long shippingCarrierId) {
    
    this.shippingCarrierId = shippingCarrierId;
    return this;
  }

   /**
   * The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with &#x60;mail_class&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null.
   * @return shippingCarrierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with `mail_class`** if `min_delivery_days` and `max_delivery_days` are null.")

  public Long getShippingCarrierId() {
    return shippingCarrierId;
  }


  public void setShippingCarrierId(Long shippingCarrierId) {
    this.shippingCarrierId = shippingCarrierId;
  }


  public ShopShippingProfileDestination mailClass(String mailClass) {
    
    this.mailClass = mailClass;
    return this;
  }

   /**
   * The unique ID string of a shipping carrier&#39;s mail class, which is used to calculate an estimated delivery date. **Required with &#x60;shipping_carrier_id&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null.
   * @return mailClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID string of a shipping carrier's mail class, which is used to calculate an estimated delivery date. **Required with `shipping_carrier_id`** if `min_delivery_days` and `max_delivery_days` are null.")

  public String getMailClass() {
    return mailClass;
  }


  public void setMailClass(String mailClass) {
    this.mailClass = mailClass;
  }


  public ShopShippingProfileDestination minDeliveryDays(Long minDeliveryDays) {
    
    this.minDeliveryDays = minDeliveryDays;
    return this;
  }

   /**
   * The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;max_delivery_days&#x60;** if &#x60;mail_class&#x60; is null.
   * minimum: 1
   * maximum: 45
   * @return minDeliveryDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `max_delivery_days`** if `mail_class` is null.")

  public Long getMinDeliveryDays() {
    return minDeliveryDays;
  }


  public void setMinDeliveryDays(Long minDeliveryDays) {
    this.minDeliveryDays = minDeliveryDays;
  }


  public ShopShippingProfileDestination maxDeliveryDays(Long maxDeliveryDays) {
    
    this.maxDeliveryDays = maxDeliveryDays;
    return this;
  }

   /**
   * The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;min_delivery_days&#x60;** if &#x60;mail_class&#x60; is null.
   * minimum: 1
   * maximum: 45
   * @return maxDeliveryDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with `min_delivery_days`** if `mail_class` is null.")

  public Long getMaxDeliveryDays() {
    return maxDeliveryDays;
  }


  public void setMaxDeliveryDays(Long maxDeliveryDays) {
    this.maxDeliveryDays = maxDeliveryDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopShippingProfileDestination shopShippingProfileDestination = (ShopShippingProfileDestination) o;
    return Objects.equals(this.shippingProfileDestinationId, shopShippingProfileDestination.shippingProfileDestinationId) &&
        Objects.equals(this.shippingProfileId, shopShippingProfileDestination.shippingProfileId) &&
        Objects.equals(this.originCountryIso, shopShippingProfileDestination.originCountryIso) &&
        Objects.equals(this.destinationCountryIso, shopShippingProfileDestination.destinationCountryIso) &&
        Objects.equals(this.destinationRegion, shopShippingProfileDestination.destinationRegion) &&
        Objects.equals(this.primaryCost, shopShippingProfileDestination.primaryCost) &&
        Objects.equals(this.secondaryCost, shopShippingProfileDestination.secondaryCost) &&
        Objects.equals(this.shippingCarrierId, shopShippingProfileDestination.shippingCarrierId) &&
        Objects.equals(this.mailClass, shopShippingProfileDestination.mailClass) &&
        Objects.equals(this.minDeliveryDays, shopShippingProfileDestination.minDeliveryDays) &&
        Objects.equals(this.maxDeliveryDays, shopShippingProfileDestination.maxDeliveryDays);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingProfileDestinationId, shippingProfileId, originCountryIso, destinationCountryIso, destinationRegion, primaryCost, secondaryCost, shippingCarrierId, mailClass, minDeliveryDays, maxDeliveryDays);
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
    sb.append("class ShopShippingProfileDestination {\n");
    sb.append("    shippingProfileDestinationId: ").append(toIndentedString(shippingProfileDestinationId)).append("\n");
    sb.append("    shippingProfileId: ").append(toIndentedString(shippingProfileId)).append("\n");
    sb.append("    originCountryIso: ").append(toIndentedString(originCountryIso)).append("\n");
    sb.append("    destinationCountryIso: ").append(toIndentedString(destinationCountryIso)).append("\n");
    sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
    sb.append("    primaryCost: ").append(toIndentedString(primaryCost)).append("\n");
    sb.append("    secondaryCost: ").append(toIndentedString(secondaryCost)).append("\n");
    sb.append("    shippingCarrierId: ").append(toIndentedString(shippingCarrierId)).append("\n");
    sb.append("    mailClass: ").append(toIndentedString(mailClass)).append("\n");
    sb.append("    minDeliveryDays: ").append(toIndentedString(minDeliveryDays)).append("\n");
    sb.append("    maxDeliveryDays: ").append(toIndentedString(maxDeliveryDays)).append("\n");
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


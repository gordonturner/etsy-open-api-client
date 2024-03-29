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
import org.openapitools.client.model.ShopShippingProfileDestination;
import org.openapitools.client.model.ShopShippingProfileUpgrade;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Represents a profile used to set a listing&#39;s shipping information. Please note that it&#39;s not possible to create calculated shipping templates via the API. However, you can associate calculated shipping profiles created from Shop Manager with listings using the API.
 */
@ApiModel(description = "Represents a profile used to set a listing's shipping information. Please note that it's not possible to create calculated shipping templates via the API. However, you can associate calculated shipping profiles created from Shop Manager with listings using the API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-08T08:37:51.285-04:00[America/Toronto]")
public class ShopShippingProfile {
  public static final String SERIALIZED_NAME_SHIPPING_PROFILE_ID = "shipping_profile_id";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PROFILE_ID)
  private Long shippingProfileId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public static final String SERIALIZED_NAME_MIN_PROCESSING_DAYS = "min_processing_days";
  @SerializedName(SERIALIZED_NAME_MIN_PROCESSING_DAYS)
  private Long minProcessingDays;

  public static final String SERIALIZED_NAME_MAX_PROCESSING_DAYS = "max_processing_days";
  @SerializedName(SERIALIZED_NAME_MAX_PROCESSING_DAYS)
  private Long maxProcessingDays;

  public static final String SERIALIZED_NAME_PROCESSING_DAYS_DISPLAY_LABEL = "processing_days_display_label";
  @SerializedName(SERIALIZED_NAME_PROCESSING_DAYS_DISPLAY_LABEL)
  private String processingDaysDisplayLabel;

  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY_ISO = "origin_country_iso";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY_ISO)
  private String originCountryIso;

  public static final String SERIALIZED_NAME_IS_DELETED = "is_deleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_SHIPPING_PROFILE_DESTINATIONS = "shipping_profile_destinations";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PROFILE_DESTINATIONS)
  private List<ShopShippingProfileDestination> shippingProfileDestinations = null;

  public static final String SERIALIZED_NAME_SHIPPING_PROFILE_UPGRADES = "shipping_profile_upgrades";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PROFILE_UPGRADES)
  private List<ShopShippingProfileUpgrade> shippingProfileUpgrades = null;

  public static final String SERIALIZED_NAME_ORIGIN_POSTAL_CODE = "origin_postal_code";
  @SerializedName(SERIALIZED_NAME_ORIGIN_POSTAL_CODE)
  private String originPostalCode;

  /**
   * Gets or Sets profileType
   */
  @JsonAdapter(ProfileTypeEnum.Adapter.class)
  public enum ProfileTypeEnum {
    MANUAL("manual"),
    
    CALCULATED("calculated");

    private String value;

    ProfileTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProfileTypeEnum fromValue(String value) {
      for (ProfileTypeEnum b : ProfileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProfileTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProfileTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProfileTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProfileTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROFILE_TYPE = "profile_type";
  @SerializedName(SERIALIZED_NAME_PROFILE_TYPE)
  private ProfileTypeEnum profileType;

  public static final String SERIALIZED_NAME_DOMESTIC_HANDLING_FEE = "domestic_handling_fee";
  @SerializedName(SERIALIZED_NAME_DOMESTIC_HANDLING_FEE)
  private Float domesticHandlingFee = 0f;

  public static final String SERIALIZED_NAME_INTERNATIONAL_HANDLING_FEE = "international_handling_fee";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_HANDLING_FEE)
  private Float internationalHandlingFee = 0f;

  public ShopShippingProfile() { 
  }

  public ShopShippingProfile shippingProfileId(Long shippingProfileId) {
    
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


  public ShopShippingProfile title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The name string of this shipping profile.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name string of this shipping profile.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ShopShippingProfile userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The numeric ID for the [user](/documentation/reference#tag/User) who owns the shipping profile.
   * minimum: 1
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric ID for the [user](/documentation/reference#tag/User) who owns the shipping profile.")

  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public ShopShippingProfile minProcessingDays(Long minProcessingDays) {
    
    this.minProcessingDays = minProcessingDays;
    return this;
  }

   /**
   * The minimum number of days for processing the listing.
   * minimum: 0
   * @return minProcessingDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum number of days for processing the listing.")

  public Long getMinProcessingDays() {
    return minProcessingDays;
  }


  public void setMinProcessingDays(Long minProcessingDays) {
    this.minProcessingDays = minProcessingDays;
  }


  public ShopShippingProfile maxProcessingDays(Long maxProcessingDays) {
    
    this.maxProcessingDays = maxProcessingDays;
    return this;
  }

   /**
   * The maximum number of days for processing the listing.
   * minimum: 0
   * @return maxProcessingDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of days for processing the listing.")

  public Long getMaxProcessingDays() {
    return maxProcessingDays;
  }


  public void setMaxProcessingDays(Long maxProcessingDays) {
    this.maxProcessingDays = maxProcessingDays;
  }


  public ShopShippingProfile processingDaysDisplayLabel(String processingDaysDisplayLabel) {
    
    this.processingDaysDisplayLabel = processingDaysDisplayLabel;
    return this;
  }

   /**
   * Translated display label string for processing days.
   * @return processingDaysDisplayLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Translated display label string for processing days.")

  public String getProcessingDaysDisplayLabel() {
    return processingDaysDisplayLabel;
  }


  public void setProcessingDaysDisplayLabel(String processingDaysDisplayLabel) {
    this.processingDaysDisplayLabel = processingDaysDisplayLabel;
  }


  public ShopShippingProfile originCountryIso(String originCountryIso) {
    
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


  public ShopShippingProfile isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * When true, someone deleted this shipping profile.
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true, someone deleted this shipping profile.")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public ShopShippingProfile shippingProfileDestinations(List<ShopShippingProfileDestination> shippingProfileDestinations) {
    
    this.shippingProfileDestinations = shippingProfileDestinations;
    return this;
  }

  public ShopShippingProfile addShippingProfileDestinationsItem(ShopShippingProfileDestination shippingProfileDestinationsItem) {
    if (this.shippingProfileDestinations == null) {
      this.shippingProfileDestinations = new ArrayList<ShopShippingProfileDestination>();
    }
    this.shippingProfileDestinations.add(shippingProfileDestinationsItem);
    return this;
  }

   /**
   * A list of [shipping profile destinations](/documentation/reference/#operation/createShopShippingProfileDestination) available for this shipping profile.
   * @return shippingProfileDestinations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of [shipping profile destinations](/documentation/reference/#operation/createShopShippingProfileDestination) available for this shipping profile.")

  public List<ShopShippingProfileDestination> getShippingProfileDestinations() {
    return shippingProfileDestinations;
  }


  public void setShippingProfileDestinations(List<ShopShippingProfileDestination> shippingProfileDestinations) {
    this.shippingProfileDestinations = shippingProfileDestinations;
  }


  public ShopShippingProfile shippingProfileUpgrades(List<ShopShippingProfileUpgrade> shippingProfileUpgrades) {
    
    this.shippingProfileUpgrades = shippingProfileUpgrades;
    return this;
  }

  public ShopShippingProfile addShippingProfileUpgradesItem(ShopShippingProfileUpgrade shippingProfileUpgradesItem) {
    if (this.shippingProfileUpgrades == null) {
      this.shippingProfileUpgrades = new ArrayList<ShopShippingProfileUpgrade>();
    }
    this.shippingProfileUpgrades.add(shippingProfileUpgradesItem);
    return this;
  }

   /**
   * A list of [shipping profile upgrades](/documentation/reference/#operation/createShopShippingProfileUpgrade) available for this shipping profile.
   * @return shippingProfileUpgrades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of [shipping profile upgrades](/documentation/reference/#operation/createShopShippingProfileUpgrade) available for this shipping profile.")

  public List<ShopShippingProfileUpgrade> getShippingProfileUpgrades() {
    return shippingProfileUpgrades;
  }


  public void setShippingProfileUpgrades(List<ShopShippingProfileUpgrade> shippingProfileUpgrades) {
    this.shippingProfileUpgrades = shippingProfileUpgrades;
  }


  public ShopShippingProfile originPostalCode(String originPostalCode) {
    
    this.originPostalCode = originPostalCode;
    return this;
  }

   /**
   * The postal code string (not necessarily a number) for the location from which the listing ships. Required if the &#x60;origin_country_iso&#x60; is &#x60;US&#x60; or &#x60;CA&#x60;.
   * @return originPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code string (not necessarily a number) for the location from which the listing ships. Required if the `origin_country_iso` is `US` or `CA`.")

  public String getOriginPostalCode() {
    return originPostalCode;
  }


  public void setOriginPostalCode(String originPostalCode) {
    this.originPostalCode = originPostalCode;
  }


  public ShopShippingProfile profileType(ProfileTypeEnum profileType) {
    
    this.profileType = profileType;
    return this;
  }

   /**
   * Get profileType
   * @return profileType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProfileTypeEnum getProfileType() {
    return profileType;
  }


  public void setProfileType(ProfileTypeEnum profileType) {
    this.profileType = profileType;
  }


  public ShopShippingProfile domesticHandlingFee(Float domesticHandlingFee) {
    
    this.domesticHandlingFee = domesticHandlingFee;
    return this;
  }

   /**
   * The domestic handling fee added to buyer&#39;s shipping total - only available for calculated shipping profiles.
   * minimum: 0
   * @return domesticHandlingFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The domestic handling fee added to buyer's shipping total - only available for calculated shipping profiles.")

  public Float getDomesticHandlingFee() {
    return domesticHandlingFee;
  }


  public void setDomesticHandlingFee(Float domesticHandlingFee) {
    this.domesticHandlingFee = domesticHandlingFee;
  }


  public ShopShippingProfile internationalHandlingFee(Float internationalHandlingFee) {
    
    this.internationalHandlingFee = internationalHandlingFee;
    return this;
  }

   /**
   * The international handling fee added to buyer&#39;s shipping total - only available for calculated shipping profiles.
   * minimum: 0
   * @return internationalHandlingFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The international handling fee added to buyer's shipping total - only available for calculated shipping profiles.")

  public Float getInternationalHandlingFee() {
    return internationalHandlingFee;
  }


  public void setInternationalHandlingFee(Float internationalHandlingFee) {
    this.internationalHandlingFee = internationalHandlingFee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopShippingProfile shopShippingProfile = (ShopShippingProfile) o;
    return Objects.equals(this.shippingProfileId, shopShippingProfile.shippingProfileId) &&
        Objects.equals(this.title, shopShippingProfile.title) &&
        Objects.equals(this.userId, shopShippingProfile.userId) &&
        Objects.equals(this.minProcessingDays, shopShippingProfile.minProcessingDays) &&
        Objects.equals(this.maxProcessingDays, shopShippingProfile.maxProcessingDays) &&
        Objects.equals(this.processingDaysDisplayLabel, shopShippingProfile.processingDaysDisplayLabel) &&
        Objects.equals(this.originCountryIso, shopShippingProfile.originCountryIso) &&
        Objects.equals(this.isDeleted, shopShippingProfile.isDeleted) &&
        Objects.equals(this.shippingProfileDestinations, shopShippingProfile.shippingProfileDestinations) &&
        Objects.equals(this.shippingProfileUpgrades, shopShippingProfile.shippingProfileUpgrades) &&
        Objects.equals(this.originPostalCode, shopShippingProfile.originPostalCode) &&
        Objects.equals(this.profileType, shopShippingProfile.profileType) &&
        Objects.equals(this.domesticHandlingFee, shopShippingProfile.domesticHandlingFee) &&
        Objects.equals(this.internationalHandlingFee, shopShippingProfile.internationalHandlingFee);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingProfileId, title, userId, minProcessingDays, maxProcessingDays, processingDaysDisplayLabel, originCountryIso, isDeleted, shippingProfileDestinations, shippingProfileUpgrades, originPostalCode, profileType, domesticHandlingFee, internationalHandlingFee);
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
    sb.append("class ShopShippingProfile {\n");
    sb.append("    shippingProfileId: ").append(toIndentedString(shippingProfileId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    minProcessingDays: ").append(toIndentedString(minProcessingDays)).append("\n");
    sb.append("    maxProcessingDays: ").append(toIndentedString(maxProcessingDays)).append("\n");
    sb.append("    processingDaysDisplayLabel: ").append(toIndentedString(processingDaysDisplayLabel)).append("\n");
    sb.append("    originCountryIso: ").append(toIndentedString(originCountryIso)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    shippingProfileDestinations: ").append(toIndentedString(shippingProfileDestinations)).append("\n");
    sb.append("    shippingProfileUpgrades: ").append(toIndentedString(shippingProfileUpgrades)).append("\n");
    sb.append("    originPostalCode: ").append(toIndentedString(originPostalCode)).append("\n");
    sb.append("    profileType: ").append(toIndentedString(profileType)).append("\n");
    sb.append("    domesticHandlingFee: ").append(toIndentedString(domesticHandlingFee)).append("\n");
    sb.append("    internationalHandlingFee: ").append(toIndentedString(internationalHandlingFee)).append("\n");
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


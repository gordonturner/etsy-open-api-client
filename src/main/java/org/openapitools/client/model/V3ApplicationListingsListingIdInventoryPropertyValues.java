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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * V3ApplicationListingsListingIdInventoryPropertyValues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-07T10:51:54.559-04:00[America/Toronto]")
public class V3ApplicationListingsListingIdInventoryPropertyValues {
  public static final String SERIALIZED_NAME_PROPERTY_ID = "property_id";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Long propertyId;

  public static final String SERIALIZED_NAME_VALUE_IDS = "value_ids";
  @SerializedName(SERIALIZED_NAME_VALUE_IDS)
  private List<Long> valueIds = new ArrayList<Long>();

  public static final String SERIALIZED_NAME_SCALE_ID = "scale_id";
  @SerializedName(SERIALIZED_NAME_SCALE_ID)
  private Long scaleId;

  public static final String SERIALIZED_NAME_PROPERTY_NAME = "property_name";
  @SerializedName(SERIALIZED_NAME_PROPERTY_NAME)
  private String propertyName;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<String>();

  public V3ApplicationListingsListingIdInventoryPropertyValues() { 
  }

  public V3ApplicationListingsListingIdInventoryPropertyValues propertyId(Long propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties).
   * minimum: 1
   * @return propertyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique ID of an Etsy [listing property](/documentation/reference#operation/getListingProperties).")

  public Long getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Long propertyId) {
    this.propertyId = propertyId;
  }


  public V3ApplicationListingsListingIdInventoryPropertyValues valueIds(List<Long> valueIds) {
    
    this.valueIds = valueIds;
    return this;
  }

  public V3ApplicationListingsListingIdInventoryPropertyValues addValueIdsItem(Long valueIdsItem) {
    this.valueIds.add(valueIdsItem);
    return this;
  }

   /**
   * An array of unique IDs of multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different sizes of a product, then the value ID list contains value IDs for each size.
   * @return valueIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of unique IDs of multiple Etsy [listing property](/documentation/reference#operation/getListingProperties) values. For example, if your listing offers different sizes of a product, then the value ID list contains value IDs for each size.")

  public List<Long> getValueIds() {
    return valueIds;
  }


  public void setValueIds(List<Long> valueIds) {
    this.valueIds = valueIds;
  }


  public V3ApplicationListingsListingIdInventoryPropertyValues scaleId(Long scaleId) {
    
    this.scaleId = scaleId;
    return this;
  }

   /**
   * The numeric ID of a single Etsy.com measurement scale. For example, for shoe size, there are three &#x60;scale_id&#x60;s available - *UK*, *US/Canada*, and *EU*, where *US/Canada* has &#x60;scale_id&#x60; 19.
   * minimum: 1
   * @return scaleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric ID of a single Etsy.com measurement scale. For example, for shoe size, there are three `scale_id`s available - *UK*, *US/Canada*, and *EU*, where *US/Canada* has `scale_id` 19.")

  public Long getScaleId() {
    return scaleId;
  }


  public void setScaleId(Long scaleId) {
    this.scaleId = scaleId;
  }


  public V3ApplicationListingsListingIdInventoryPropertyValues propertyName(String propertyName) {
    
    this.propertyName = propertyName;
    return this;
  }

   /**
   * The name of the property, in the requested locale language.
   * @return propertyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the property, in the requested locale language.")

  public String getPropertyName() {
    return propertyName;
  }


  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }


  public V3ApplicationListingsListingIdInventoryPropertyValues values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public V3ApplicationListingsListingIdInventoryPropertyValues addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * A list of property value entries for this product.
   * @return values
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of property value entries for this product.")

  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3ApplicationListingsListingIdInventoryPropertyValues v3ApplicationListingsListingIdInventoryPropertyValues = (V3ApplicationListingsListingIdInventoryPropertyValues) o;
    return Objects.equals(this.propertyId, v3ApplicationListingsListingIdInventoryPropertyValues.propertyId) &&
        Objects.equals(this.valueIds, v3ApplicationListingsListingIdInventoryPropertyValues.valueIds) &&
        Objects.equals(this.scaleId, v3ApplicationListingsListingIdInventoryPropertyValues.scaleId) &&
        Objects.equals(this.propertyName, v3ApplicationListingsListingIdInventoryPropertyValues.propertyName) &&
        Objects.equals(this.values, v3ApplicationListingsListingIdInventoryPropertyValues.values);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, valueIds, scaleId, propertyName, values);
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
    sb.append("class V3ApplicationListingsListingIdInventoryPropertyValues {\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    valueIds: ").append(toIndentedString(valueIds)).append("\n");
    sb.append("    scaleId: ").append(toIndentedString(scaleId)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


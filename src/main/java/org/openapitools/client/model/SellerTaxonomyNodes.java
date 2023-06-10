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
import org.openapitools.client.model.SellerTaxonomyNode;

/**
 * A list of taxonomy nodes from the seller taxonomy tree.
 */
@ApiModel(description = "A list of taxonomy nodes from the seller taxonomy tree.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-08T08:37:51.285-04:00[America/Toronto]")
public class SellerTaxonomyNodes {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<SellerTaxonomyNode> results = null;

  public SellerTaxonomyNodes() { 
  }

  public SellerTaxonomyNodes count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * The number of results.
   * minimum: 0
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results.")

  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public SellerTaxonomyNodes results(List<SellerTaxonomyNode> results) {
    
    this.results = results;
    return this;
  }

  public SellerTaxonomyNodes addResultsItem(SellerTaxonomyNode resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<SellerTaxonomyNode>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The list of requested resources.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of requested resources.")

  public List<SellerTaxonomyNode> getResults() {
    return results;
  }


  public void setResults(List<SellerTaxonomyNode> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerTaxonomyNodes sellerTaxonomyNodes = (SellerTaxonomyNodes) o;
    return Objects.equals(this.count, sellerTaxonomyNodes.count) &&
        Objects.equals(this.results, sellerTaxonomyNodes.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerTaxonomyNodes {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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


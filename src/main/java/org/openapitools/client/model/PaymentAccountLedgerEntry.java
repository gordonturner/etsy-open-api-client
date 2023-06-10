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
import org.openapitools.client.model.PaymentAdjustment;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Represents an entry in a shop&#39;s ledger.
 */
@ApiModel(description = "Represents an entry in a shop's ledger.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-08T08:37:51.285-04:00[America/Toronto]")
public class PaymentAccountLedgerEntry {
  public static final String SERIALIZED_NAME_ENTRY_ID = "entry_id";
  @SerializedName(SERIALIZED_NAME_ENTRY_ID)
  private Long entryId;

  public static final String SERIALIZED_NAME_LEDGER_ID = "ledger_id";
  @SerializedName(SERIALIZED_NAME_LEDGER_ID)
  private Long ledgerId;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "sequence_number";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private Long sequenceNumber;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Long balance;

  public static final String SERIALIZED_NAME_CREATE_DATE = "create_date";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private Long createDate;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public static final String SERIALIZED_NAME_LEDGER_TYPE = "ledger_type";
  @SerializedName(SERIALIZED_NAME_LEDGER_TYPE)
  private String ledgerType;

  public static final String SERIALIZED_NAME_REFERENCE_TYPE = "reference_type";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TYPE)
  private String referenceType;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_PAYMENT_ADJUSTMENTS = "payment_adjustments";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ADJUSTMENTS)
  private List<PaymentAdjustment> paymentAdjustments = null;

  public PaymentAccountLedgerEntry() { 
  }

  public PaymentAccountLedgerEntry entryId(Long entryId) {
    
    this.entryId = entryId;
    return this;
  }

   /**
   * The ledger entry&#39;s numeric ID.
   * minimum: 1
   * @return entryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ledger entry's numeric ID.")

  public Long getEntryId() {
    return entryId;
  }


  public void setEntryId(Long entryId) {
    this.entryId = entryId;
  }


  public PaymentAccountLedgerEntry ledgerId(Long ledgerId) {
    
    this.ledgerId = ledgerId;
    return this;
  }

   /**
   * The ledger&#39;s numeric ID.
   * minimum: 1
   * @return ledgerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ledger's numeric ID.")

  public Long getLedgerId() {
    return ledgerId;
  }


  public void setLedgerId(Long ledgerId) {
    this.ledgerId = ledgerId;
  }


  public PaymentAccountLedgerEntry sequenceNumber(Long sequenceNumber) {
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * The sequence allows ledger entries to be sorted chronologically. The higher the sequence, the more recent the entry.
   * minimum: 0
   * @return sequenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sequence allows ledger entries to be sorted chronologically. The higher the sequence, the more recent the entry.")

  public Long getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public PaymentAccountLedgerEntry amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of money credited to the ledger.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of money credited to the ledger.")

  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public PaymentAccountLedgerEntry currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the entry on the ledger.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency of the entry on the ledger.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PaymentAccountLedgerEntry description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Details what kind of ledger entry this is: a payment, refund, reversal of a failed refund, disbursement, returned disbursement, recoupment, miscellaneous credit, miscellaneous debit, or bill payment.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details what kind of ledger entry this is: a payment, refund, reversal of a failed refund, disbursement, returned disbursement, recoupment, miscellaneous credit, miscellaneous debit, or bill payment.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentAccountLedgerEntry balance(Long balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The amount of money in the shop&#39;s ledger the moment after this entry was applied.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of money in the shop's ledger the moment after this entry was applied.")

  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public PaymentAccountLedgerEntry createDate(Long createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * The date and time the ledger entry was created in Epoch seconds.
   * minimum: 0
   * @return createDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the ledger entry was created in Epoch seconds.")

  public Long getCreateDate() {
    return createDate;
  }


  public void setCreateDate(Long createDate) {
    this.createDate = createDate;
  }


  public PaymentAccountLedgerEntry createdTimestamp(Long createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The date and time the ledger entry was created in Epoch seconds.
   * minimum: 0
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the ledger entry was created in Epoch seconds.")

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public PaymentAccountLedgerEntry ledgerType(String ledgerType) {
    
    this.ledgerType = ledgerType;
    return this;
  }

   /**
   * The original reference type for the ledger entry.
   * @return ledgerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original reference type for the ledger entry.")

  public String getLedgerType() {
    return ledgerType;
  }


  public void setLedgerType(String ledgerType) {
    this.ledgerType = ledgerType;
  }


  public PaymentAccountLedgerEntry referenceType(String referenceType) {
    
    this.referenceType = referenceType;
    return this;
  }

   /**
   * The object type the ledger entry refers to.
   * @return referenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The object type the ledger entry refers to.")

  public String getReferenceType() {
    return referenceType;
  }


  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }


  public PaymentAccountLedgerEntry referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * The object id the ledger entry refers to.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The object id the ledger entry refers to.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public PaymentAccountLedgerEntry paymentAdjustments(List<PaymentAdjustment> paymentAdjustments) {
    
    this.paymentAdjustments = paymentAdjustments;
    return this;
  }

  public PaymentAccountLedgerEntry addPaymentAdjustmentsItem(PaymentAdjustment paymentAdjustmentsItem) {
    if (this.paymentAdjustments == null) {
      this.paymentAdjustments = new ArrayList<PaymentAdjustment>();
    }
    this.paymentAdjustments.add(paymentAdjustmentsItem);
    return this;
  }

   /**
   * List of refund objects on an Etsy Payments transaction. All monetary amounts are in USD pennies unless otherwise specified.
   * @return paymentAdjustments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of refund objects on an Etsy Payments transaction. All monetary amounts are in USD pennies unless otherwise specified.")

  public List<PaymentAdjustment> getPaymentAdjustments() {
    return paymentAdjustments;
  }


  public void setPaymentAdjustments(List<PaymentAdjustment> paymentAdjustments) {
    this.paymentAdjustments = paymentAdjustments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAccountLedgerEntry paymentAccountLedgerEntry = (PaymentAccountLedgerEntry) o;
    return Objects.equals(this.entryId, paymentAccountLedgerEntry.entryId) &&
        Objects.equals(this.ledgerId, paymentAccountLedgerEntry.ledgerId) &&
        Objects.equals(this.sequenceNumber, paymentAccountLedgerEntry.sequenceNumber) &&
        Objects.equals(this.amount, paymentAccountLedgerEntry.amount) &&
        Objects.equals(this.currency, paymentAccountLedgerEntry.currency) &&
        Objects.equals(this.description, paymentAccountLedgerEntry.description) &&
        Objects.equals(this.balance, paymentAccountLedgerEntry.balance) &&
        Objects.equals(this.createDate, paymentAccountLedgerEntry.createDate) &&
        Objects.equals(this.createdTimestamp, paymentAccountLedgerEntry.createdTimestamp) &&
        Objects.equals(this.ledgerType, paymentAccountLedgerEntry.ledgerType) &&
        Objects.equals(this.referenceType, paymentAccountLedgerEntry.referenceType) &&
        Objects.equals(this.referenceId, paymentAccountLedgerEntry.referenceId) &&
        Objects.equals(this.paymentAdjustments, paymentAccountLedgerEntry.paymentAdjustments);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryId, ledgerId, sequenceNumber, amount, currency, description, balance, createDate, createdTimestamp, ledgerType, referenceType, referenceId, paymentAdjustments);
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
    sb.append("class PaymentAccountLedgerEntry {\n");
    sb.append("    entryId: ").append(toIndentedString(entryId)).append("\n");
    sb.append("    ledgerId: ").append(toIndentedString(ledgerId)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    ledgerType: ").append(toIndentedString(ledgerType)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    paymentAdjustments: ").append(toIndentedString(paymentAdjustments)).append("\n");
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


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
import org.openapitools.client.model.Money;
import org.openapitools.client.model.ShopReceiptShipment;
import org.openapitools.client.model.ShopReceiptTransaction;

/**
 * The record of a purchase from a shop. Shop receipts display monetary values using the shop&#39;s currency.
 */
@ApiModel(description = "The record of a purchase from a shop. Shop receipts display monetary values using the shop's currency.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-07T10:51:54.559-04:00[America/Toronto]")
public class ShopReceipt {
  public static final String SERIALIZED_NAME_RECEIPT_ID = "receipt_id";
  @SerializedName(SERIALIZED_NAME_RECEIPT_ID)
  private Long receiptId;

  public static final String SERIALIZED_NAME_RECEIPT_TYPE = "receipt_type";
  @SerializedName(SERIALIZED_NAME_RECEIPT_TYPE)
  private Long receiptType;

  public static final String SERIALIZED_NAME_SELLER_USER_ID = "seller_user_id";
  @SerializedName(SERIALIZED_NAME_SELLER_USER_ID)
  private Long sellerUserId;

  public static final String SERIALIZED_NAME_SELLER_EMAIL = "seller_email";
  @SerializedName(SERIALIZED_NAME_SELLER_EMAIL)
  private String sellerEmail;

  public static final String SERIALIZED_NAME_BUYER_USER_ID = "buyer_user_id";
  @SerializedName(SERIALIZED_NAME_BUYER_USER_ID)
  private Long buyerUserId;

  public static final String SERIALIZED_NAME_BUYER_EMAIL = "buyer_email";
  @SerializedName(SERIALIZED_NAME_BUYER_EMAIL)
  private String buyerEmail;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FIRST_LINE = "first_line";
  @SerializedName(SERIALIZED_NAME_FIRST_LINE)
  private String firstLine;

  public static final String SERIALIZED_NAME_SECOND_LINE = "second_line";
  @SerializedName(SERIALIZED_NAME_SECOND_LINE)
  private String secondLine;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  /**
   * The current order status string. One of: &#x60;Open&#x60;, &#x60;Paid&#x60;, &#x60;Completed&#x60;, &#x60;Payment Processing&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PAID("Paid"),
    
    COMPLETED("Completed"),
    
    OPEN("Open"),
    
    PAYMENT_PROCESSING("Payment Processing"),
    
    CANCELED("Canceled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_FORMATTED_ADDRESS = "formatted_address";
  @SerializedName(SERIALIZED_NAME_FORMATTED_ADDRESS)
  private String formattedAddress;

  public static final String SERIALIZED_NAME_COUNTRY_ISO = "country_iso";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO)
  private String countryIso;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_EMAIL = "payment_email";
  @SerializedName(SERIALIZED_NAME_PAYMENT_EMAIL)
  private String paymentEmail;

  public static final String SERIALIZED_NAME_MESSAGE_FROM_SELLER = "message_from_seller";
  @SerializedName(SERIALIZED_NAME_MESSAGE_FROM_SELLER)
  private String messageFromSeller;

  public static final String SERIALIZED_NAME_MESSAGE_FROM_BUYER = "message_from_buyer";
  @SerializedName(SERIALIZED_NAME_MESSAGE_FROM_BUYER)
  private String messageFromBuyer;

  public static final String SERIALIZED_NAME_MESSAGE_FROM_PAYMENT = "message_from_payment";
  @SerializedName(SERIALIZED_NAME_MESSAGE_FROM_PAYMENT)
  private String messageFromPayment;

  public static final String SERIALIZED_NAME_IS_PAID = "is_paid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  private Boolean isPaid;

  public static final String SERIALIZED_NAME_IS_SHIPPED = "is_shipped";
  @SerializedName(SERIALIZED_NAME_IS_SHIPPED)
  private Boolean isShipped;

  public static final String SERIALIZED_NAME_CREATE_TIMESTAMP = "create_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATE_TIMESTAMP)
  private Long createTimestamp;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP = "update_timestamp";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP)
  private Long updateTimestamp;

  public static final String SERIALIZED_NAME_IS_GIFT = "is_gift";
  @SerializedName(SERIALIZED_NAME_IS_GIFT)
  private Boolean isGift;

  public static final String SERIALIZED_NAME_GIFT_MESSAGE = "gift_message";
  @SerializedName(SERIALIZED_NAME_GIFT_MESSAGE)
  private String giftMessage;

  public static final String SERIALIZED_NAME_GRANDTOTAL = "grandtotal";
  @SerializedName(SERIALIZED_NAME_GRANDTOTAL)
  private Money grandtotal;

  public static final String SERIALIZED_NAME_SUBTOTAL = "subtotal";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL)
  private Money subtotal;

  public static final String SERIALIZED_NAME_TOTAL_PRICE = "total_price";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE)
  private Money totalPrice;

  public static final String SERIALIZED_NAME_TOTAL_SHIPPING_COST = "total_shipping_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_SHIPPING_COST)
  private Money totalShippingCost;

  public static final String SERIALIZED_NAME_TOTAL_TAX_COST = "total_tax_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX_COST)
  private Money totalTaxCost;

  public static final String SERIALIZED_NAME_TOTAL_VAT_COST = "total_vat_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_VAT_COST)
  private Money totalVatCost;

  public static final String SERIALIZED_NAME_DISCOUNT_AMT = "discount_amt";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMT)
  private Money discountAmt;

  public static final String SERIALIZED_NAME_GIFT_WRAP_PRICE = "gift_wrap_price";
  @SerializedName(SERIALIZED_NAME_GIFT_WRAP_PRICE)
  private Money giftWrapPrice;

  public static final String SERIALIZED_NAME_SHIPMENTS = "shipments";
  @SerializedName(SERIALIZED_NAME_SHIPMENTS)
  private List<ShopReceiptShipment> shipments = new ArrayList<ShopReceiptShipment>();

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<ShopReceiptTransaction> transactions = new ArrayList<ShopReceiptTransaction>();

  public ShopReceipt() { 
  }

  public ShopReceipt receiptId(Long receiptId) {
    
    this.receiptId = receiptId;
    return this;
  }

   /**
   * The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.
   * minimum: 1
   * @return receiptId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.")

  public Long getReceiptId() {
    return receiptId;
  }


  public void setReceiptId(Long receiptId) {
    this.receiptId = receiptId;
  }


  public ShopReceipt receiptType(Long receiptType) {
    
    this.receiptType = receiptType;
    return this;
  }

   /**
   * The numeric value for the Etsy channel that serviced the purchase: 0 for Etsy.com, 1 for a Pattern shop.
   * minimum: 0
   * @return receiptType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The numeric value for the Etsy channel that serviced the purchase: 0 for Etsy.com, 1 for a Pattern shop.")

  public Long getReceiptType() {
    return receiptType;
  }


  public void setReceiptType(Long receiptType) {
    this.receiptType = receiptType;
  }


  public ShopReceipt sellerUserId(Long sellerUserId) {
    
    this.sellerUserId = sellerUserId;
    return this;
  }

   /**
   * The numeric ID for the [user](/documentation/reference#tag/User) (seller) fulfilling the purchase.
   * minimum: 1
   * @return sellerUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The numeric ID for the [user](/documentation/reference#tag/User) (seller) fulfilling the purchase.")

  public Long getSellerUserId() {
    return sellerUserId;
  }


  public void setSellerUserId(Long sellerUserId) {
    this.sellerUserId = sellerUserId;
  }


  public ShopReceipt sellerEmail(String sellerEmail) {
    
    this.sellerEmail = sellerEmail;
    return this;
  }

   /**
   * The email address string for the seller of the listing.
   * @return sellerEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The email address string for the seller of the listing.")

  public String getSellerEmail() {
    return sellerEmail;
  }


  public void setSellerEmail(String sellerEmail) {
    this.sellerEmail = sellerEmail;
  }


  public ShopReceipt buyerUserId(Long buyerUserId) {
    
    this.buyerUserId = buyerUserId;
    return this;
  }

   /**
   * The numeric ID for the [user](/documentation/reference#tag/User) making the purchase.
   * minimum: 1
   * @return buyerUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The numeric ID for the [user](/documentation/reference#tag/User) making the purchase.")

  public Long getBuyerUserId() {
    return buyerUserId;
  }


  public void setBuyerUserId(Long buyerUserId) {
    this.buyerUserId = buyerUserId;
  }


  public ShopReceipt buyerEmail(String buyerEmail) {
    
    this.buyerEmail = buyerEmail;
    return this;
  }

   /**
   * The email address string for the buyer of the listing.
   * @return buyerEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The email address string for the buyer of the listing.")

  public String getBuyerEmail() {
    return buyerEmail;
  }


  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }


  public ShopReceipt name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name string for the recipient in the shipping address.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name string for the recipient in the shipping address.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ShopReceipt firstLine(String firstLine) {
    
    this.firstLine = firstLine;
    return this;
  }

   /**
   * The first address line string for the recipient in the shipping address.
   * @return firstLine
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The first address line string for the recipient in the shipping address.")

  public String getFirstLine() {
    return firstLine;
  }


  public void setFirstLine(String firstLine) {
    this.firstLine = firstLine;
  }


  public ShopReceipt secondLine(String secondLine) {
    
    this.secondLine = secondLine;
    return this;
  }

   /**
   * The optional second address line string for the recipient in the shipping address.
   * @return secondLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The optional second address line string for the recipient in the shipping address.")

  public String getSecondLine() {
    return secondLine;
  }


  public void setSecondLine(String secondLine) {
    this.secondLine = secondLine;
  }


  public ShopReceipt city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city string for the recipient in the shipping address.
   * @return city
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The city string for the recipient in the shipping address.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ShopReceipt state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state string for the recipient in the shipping address.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The state string for the recipient in the shipping address.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public ShopReceipt zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * The zip code string (not necessarily a number) for the recipient in the shipping address.
   * @return zip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The zip code string (not necessarily a number) for the recipient in the shipping address.")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    this.zip = zip;
  }


  public ShopReceipt status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current order status string. One of: &#x60;Open&#x60;, &#x60;Paid&#x60;, &#x60;Completed&#x60;, &#x60;Payment Processing&#x60;.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current order status string. One of: `Open`, `Paid`, `Completed`, `Payment Processing`.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ShopReceipt formattedAddress(String formattedAddress) {
    
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * The formatted shipping address string for the recipient in the shipping address.
   * @return formattedAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The formatted shipping address string for the recipient in the shipping address.")

  public String getFormattedAddress() {
    return formattedAddress;
  }


  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }


  public ShopReceipt countryIso(String countryIso) {
    
    this.countryIso = countryIso;
    return this;
  }

   /**
   * The ISO-3166 alpha-2 country code string for the recipient in the shipping address.
   * @return countryIso
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ISO-3166 alpha-2 country code string for the recipient in the shipping address.")

  public String getCountryIso() {
    return countryIso;
  }


  public void setCountryIso(String countryIso) {
    this.countryIso = countryIso;
  }


  public ShopReceipt paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method string identifying purchaser&#39;s payment method, which must be one of: \\&#39;cc\\&#39; (credit card), \\&#39;paypal\\&#39;, \\&#39;check\\&#39;, \\&#39;mo\\&#39; (money order), \\&#39;bt\\&#39; (bank transfer), \\&#39;other\\&#39;, \\&#39;ideal\\&#39;, \\&#39;sofort\\&#39;, \\&#39;apple_pay\\&#39;, \\&#39;google\\&#39;, \\&#39;android_pay\\&#39;, \\&#39;google_pay\\&#39;, \\&#39;klarna\\&#39;, \\&#39;k_pay_in_4\\&#39; (klarna), \\&#39;k_pay_in_3\\&#39; (klarna), or \\&#39;k_financing\\&#39; (klarna).
   * @return paymentMethod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The payment method string identifying purchaser's payment method, which must be one of: \\'cc\\' (credit card), \\'paypal\\', \\'check\\', \\'mo\\' (money order), \\'bt\\' (bank transfer), \\'other\\', \\'ideal\\', \\'sofort\\', \\'apple_pay\\', \\'google\\', \\'android_pay\\', \\'google_pay\\', \\'klarna\\', \\'k_pay_in_4\\' (klarna), \\'k_pay_in_3\\' (klarna), or \\'k_financing\\' (klarna).")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public ShopReceipt paymentEmail(String paymentEmail) {
    
    this.paymentEmail = paymentEmail;
    return this;
  }

   /**
   * The email address string for the email address to which to send payment confirmation
   * @return paymentEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email address string for the email address to which to send payment confirmation")

  public String getPaymentEmail() {
    return paymentEmail;
  }


  public void setPaymentEmail(String paymentEmail) {
    this.paymentEmail = paymentEmail;
  }


  public ShopReceipt messageFromSeller(String messageFromSeller) {
    
    this.messageFromSeller = messageFromSeller;
    return this;
  }

   /**
   * An optional message string from the seller.
   * @return messageFromSeller
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An optional message string from the seller.")

  public String getMessageFromSeller() {
    return messageFromSeller;
  }


  public void setMessageFromSeller(String messageFromSeller) {
    this.messageFromSeller = messageFromSeller;
  }


  public ShopReceipt messageFromBuyer(String messageFromBuyer) {
    
    this.messageFromBuyer = messageFromBuyer;
    return this;
  }

   /**
   * An optional message string from the buyer.
   * @return messageFromBuyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An optional message string from the buyer.")

  public String getMessageFromBuyer() {
    return messageFromBuyer;
  }


  public void setMessageFromBuyer(String messageFromBuyer) {
    this.messageFromBuyer = messageFromBuyer;
  }


  public ShopReceipt messageFromPayment(String messageFromPayment) {
    
    this.messageFromPayment = messageFromPayment;
    return this;
  }

   /**
   * The machine-generated acknowledgement string from the payment system.
   * @return messageFromPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The machine-generated acknowledgement string from the payment system.")

  public String getMessageFromPayment() {
    return messageFromPayment;
  }


  public void setMessageFromPayment(String messageFromPayment) {
    this.messageFromPayment = messageFromPayment;
  }


  public ShopReceipt isPaid(Boolean isPaid) {
    
    this.isPaid = isPaid;
    return this;
  }

   /**
   * When true, buyer paid for this purchase.
   * @return isPaid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When true, buyer paid for this purchase.")

  public Boolean getIsPaid() {
    return isPaid;
  }


  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public ShopReceipt isShipped(Boolean isShipped) {
    
    this.isShipped = isShipped;
    return this;
  }

   /**
   * When true, seller shipped the products.
   * @return isShipped
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When true, seller shipped the products.")

  public Boolean getIsShipped() {
    return isShipped;
  }


  public void setIsShipped(Boolean isShipped) {
    this.isShipped = isShipped;
  }


  public ShopReceipt createTimestamp(Long createTimestamp) {
    
    this.createTimestamp = createTimestamp;
    return this;
  }

   /**
   * The receipt\\&#39;s creation time, in epoch seconds.
   * minimum: 946684800
   * @return createTimestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The receipt\\'s creation time, in epoch seconds.")

  public Long getCreateTimestamp() {
    return createTimestamp;
  }


  public void setCreateTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
  }


  public ShopReceipt updateTimestamp(Long updateTimestamp) {
    
    this.updateTimestamp = updateTimestamp;
    return this;
  }

   /**
   * The time of the last update to the receipt, in epoch seconds.
   * minimum: 946684800
   * @return updateTimestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The time of the last update to the receipt, in epoch seconds.")

  public Long getUpdateTimestamp() {
    return updateTimestamp;
  }


  public void setUpdateTimestamp(Long updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }


  public ShopReceipt isGift(Boolean isGift) {
    
    this.isGift = isGift;
    return this;
  }

   /**
   * When true, the buyer indicated this purchase is a gift.
   * @return isGift
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When true, the buyer indicated this purchase is a gift.")

  public Boolean getIsGift() {
    return isGift;
  }


  public void setIsGift(Boolean isGift) {
    this.isGift = isGift;
  }


  public ShopReceipt giftMessage(String giftMessage) {
    
    this.giftMessage = giftMessage;
    return this;
  }

   /**
   * A gift message string the buyer requests delivered with the product.
   * @return giftMessage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A gift message string the buyer requests delivered with the product.")

  public String getGiftMessage() {
    return giftMessage;
  }


  public void setGiftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
  }


  public ShopReceipt grandtotal(Money grandtotal) {
    
    this.grandtotal = grandtotal;
    return this;
  }

   /**
   * A number equal to the total_price minus the coupon discount plus tax and shipping costs.
   * @return grandtotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A number equal to the total_price minus the coupon discount plus tax and shipping costs.")

  public Money getGrandtotal() {
    return grandtotal;
  }


  public void setGrandtotal(Money grandtotal) {
    this.grandtotal = grandtotal;
  }


  public ShopReceipt subtotal(Money subtotal) {
    
    this.subtotal = subtotal;
    return this;
  }

   /**
   * A number equal to the total_price minus coupon discounts. Does not included tax or shipping costs.
   * @return subtotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A number equal to the total_price minus coupon discounts. Does not included tax or shipping costs.")

  public Money getSubtotal() {
    return subtotal;
  }


  public void setSubtotal(Money subtotal) {
    this.subtotal = subtotal;
  }


  public ShopReceipt totalPrice(Money totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * A number equal to the sum of the individual listings\\&#39; (price * quantity). Does not included tax or shipping costs.
   * @return totalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A number equal to the sum of the individual listings\\' (price * quantity). Does not included tax or shipping costs.")

  public Money getTotalPrice() {
    return totalPrice;
  }


  public void setTotalPrice(Money totalPrice) {
    this.totalPrice = totalPrice;
  }


  public ShopReceipt totalShippingCost(Money totalShippingCost) {
    
    this.totalShippingCost = totalShippingCost;
    return this;
  }

   /**
   * A number equal to the total shipping cost of the receipt.
   * @return totalShippingCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A number equal to the total shipping cost of the receipt.")

  public Money getTotalShippingCost() {
    return totalShippingCost;
  }


  public void setTotalShippingCost(Money totalShippingCost) {
    this.totalShippingCost = totalShippingCost;
  }


  public ShopReceipt totalTaxCost(Money totalTaxCost) {
    
    this.totalTaxCost = totalTaxCost;
    return this;
  }

   /**
   * The total sales tax of the receipt.
   * @return totalTaxCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The total sales tax of the receipt.")

  public Money getTotalTaxCost() {
    return totalTaxCost;
  }


  public void setTotalTaxCost(Money totalTaxCost) {
    this.totalTaxCost = totalTaxCost;
  }


  public ShopReceipt totalVatCost(Money totalVatCost) {
    
    this.totalVatCost = totalVatCost;
    return this;
  }

   /**
   * A number equal to the total value-added tax (VAT) of the receipt.
   * @return totalVatCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A number equal to the total value-added tax (VAT) of the receipt.")

  public Money getTotalVatCost() {
    return totalVatCost;
  }


  public void setTotalVatCost(Money totalVatCost) {
    this.totalVatCost = totalVatCost;
  }


  public ShopReceipt discountAmt(Money discountAmt) {
    
    this.discountAmt = discountAmt;
    return this;
  }

   /**
   * The numeric total discounted price for the receipt when using a discount (percent or fixed) coupon. Free shipping coupons are not included in this discount amount.
   * @return discountAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The numeric total discounted price for the receipt when using a discount (percent or fixed) coupon. Free shipping coupons are not included in this discount amount.")

  public Money getDiscountAmt() {
    return discountAmt;
  }


  public void setDiscountAmt(Money discountAmt) {
    this.discountAmt = discountAmt;
  }


  public ShopReceipt giftWrapPrice(Money giftWrapPrice) {
    
    this.giftWrapPrice = giftWrapPrice;
    return this;
  }

   /**
   * The numeric price of gift wrap for this receipt.
   * @return giftWrapPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The numeric price of gift wrap for this receipt.")

  public Money getGiftWrapPrice() {
    return giftWrapPrice;
  }


  public void setGiftWrapPrice(Money giftWrapPrice) {
    this.giftWrapPrice = giftWrapPrice;
  }


  public ShopReceipt shipments(List<ShopReceiptShipment> shipments) {
    
    this.shipments = shipments;
    return this;
  }

  public ShopReceipt addShipmentsItem(ShopReceiptShipment shipmentsItem) {
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * A list of shipment statements for this receipt.
   * @return shipments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of shipment statements for this receipt.")

  public List<ShopReceiptShipment> getShipments() {
    return shipments;
  }


  public void setShipments(List<ShopReceiptShipment> shipments) {
    this.shipments = shipments;
  }


  public ShopReceipt transactions(List<ShopReceiptTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public ShopReceipt addTransactionsItem(ShopReceiptTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Array of transactions for the receipt.
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of transactions for the receipt.")

  public List<ShopReceiptTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<ShopReceiptTransaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopReceipt shopReceipt = (ShopReceipt) o;
    return Objects.equals(this.receiptId, shopReceipt.receiptId) &&
        Objects.equals(this.receiptType, shopReceipt.receiptType) &&
        Objects.equals(this.sellerUserId, shopReceipt.sellerUserId) &&
        Objects.equals(this.sellerEmail, shopReceipt.sellerEmail) &&
        Objects.equals(this.buyerUserId, shopReceipt.buyerUserId) &&
        Objects.equals(this.buyerEmail, shopReceipt.buyerEmail) &&
        Objects.equals(this.name, shopReceipt.name) &&
        Objects.equals(this.firstLine, shopReceipt.firstLine) &&
        Objects.equals(this.secondLine, shopReceipt.secondLine) &&
        Objects.equals(this.city, shopReceipt.city) &&
        Objects.equals(this.state, shopReceipt.state) &&
        Objects.equals(this.zip, shopReceipt.zip) &&
        Objects.equals(this.status, shopReceipt.status) &&
        Objects.equals(this.formattedAddress, shopReceipt.formattedAddress) &&
        Objects.equals(this.countryIso, shopReceipt.countryIso) &&
        Objects.equals(this.paymentMethod, shopReceipt.paymentMethod) &&
        Objects.equals(this.paymentEmail, shopReceipt.paymentEmail) &&
        Objects.equals(this.messageFromSeller, shopReceipt.messageFromSeller) &&
        Objects.equals(this.messageFromBuyer, shopReceipt.messageFromBuyer) &&
        Objects.equals(this.messageFromPayment, shopReceipt.messageFromPayment) &&
        Objects.equals(this.isPaid, shopReceipt.isPaid) &&
        Objects.equals(this.isShipped, shopReceipt.isShipped) &&
        Objects.equals(this.createTimestamp, shopReceipt.createTimestamp) &&
        Objects.equals(this.updateTimestamp, shopReceipt.updateTimestamp) &&
        Objects.equals(this.isGift, shopReceipt.isGift) &&
        Objects.equals(this.giftMessage, shopReceipt.giftMessage) &&
        Objects.equals(this.grandtotal, shopReceipt.grandtotal) &&
        Objects.equals(this.subtotal, shopReceipt.subtotal) &&
        Objects.equals(this.totalPrice, shopReceipt.totalPrice) &&
        Objects.equals(this.totalShippingCost, shopReceipt.totalShippingCost) &&
        Objects.equals(this.totalTaxCost, shopReceipt.totalTaxCost) &&
        Objects.equals(this.totalVatCost, shopReceipt.totalVatCost) &&
        Objects.equals(this.discountAmt, shopReceipt.discountAmt) &&
        Objects.equals(this.giftWrapPrice, shopReceipt.giftWrapPrice) &&
        Objects.equals(this.shipments, shopReceipt.shipments) &&
        Objects.equals(this.transactions, shopReceipt.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiptId, receiptType, sellerUserId, sellerEmail, buyerUserId, buyerEmail, name, firstLine, secondLine, city, state, zip, status, formattedAddress, countryIso, paymentMethod, paymentEmail, messageFromSeller, messageFromBuyer, messageFromPayment, isPaid, isShipped, createTimestamp, updateTimestamp, isGift, giftMessage, grandtotal, subtotal, totalPrice, totalShippingCost, totalTaxCost, totalVatCost, discountAmt, giftWrapPrice, shipments, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopReceipt {\n");
    sb.append("    receiptId: ").append(toIndentedString(receiptId)).append("\n");
    sb.append("    receiptType: ").append(toIndentedString(receiptType)).append("\n");
    sb.append("    sellerUserId: ").append(toIndentedString(sellerUserId)).append("\n");
    sb.append("    sellerEmail: ").append(toIndentedString(sellerEmail)).append("\n");
    sb.append("    buyerUserId: ").append(toIndentedString(buyerUserId)).append("\n");
    sb.append("    buyerEmail: ").append(toIndentedString(buyerEmail)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstLine: ").append(toIndentedString(firstLine)).append("\n");
    sb.append("    secondLine: ").append(toIndentedString(secondLine)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    countryIso: ").append(toIndentedString(countryIso)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentEmail: ").append(toIndentedString(paymentEmail)).append("\n");
    sb.append("    messageFromSeller: ").append(toIndentedString(messageFromSeller)).append("\n");
    sb.append("    messageFromBuyer: ").append(toIndentedString(messageFromBuyer)).append("\n");
    sb.append("    messageFromPayment: ").append(toIndentedString(messageFromPayment)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    isShipped: ").append(toIndentedString(isShipped)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
    sb.append("    isGift: ").append(toIndentedString(isGift)).append("\n");
    sb.append("    giftMessage: ").append(toIndentedString(giftMessage)).append("\n");
    sb.append("    grandtotal: ").append(toIndentedString(grandtotal)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalShippingCost: ").append(toIndentedString(totalShippingCost)).append("\n");
    sb.append("    totalTaxCost: ").append(toIndentedString(totalTaxCost)).append("\n");
    sb.append("    totalVatCost: ").append(toIndentedString(totalVatCost)).append("\n");
    sb.append("    discountAmt: ").append(toIndentedString(discountAmt)).append("\n");
    sb.append("    giftWrapPrice: ").append(toIndentedString(giftWrapPrice)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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


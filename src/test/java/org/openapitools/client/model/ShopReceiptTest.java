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
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ShopReceipt
 */
public class ShopReceiptTest {
    private final ShopReceipt model = new ShopReceipt();

    /**
     * Model tests for ShopReceipt
     */
    @Test
    public void testShopReceipt() {
        // TODO: test ShopReceipt
    }

    /**
     * Test the property 'receiptId'
     */
    @Test
    public void receiptIdTest() {
        // TODO: test receiptId
    }

    /**
     * Test the property 'receiptType'
     */
    @Test
    public void receiptTypeTest() {
        // TODO: test receiptType
    }

    /**
     * Test the property 'sellerUserId'
     */
    @Test
    public void sellerUserIdTest() {
        // TODO: test sellerUserId
    }

    /**
     * Test the property 'sellerEmail'
     */
    @Test
    public void sellerEmailTest() {
        // TODO: test sellerEmail
    }

    /**
     * Test the property 'buyerUserId'
     */
    @Test
    public void buyerUserIdTest() {
        // TODO: test buyerUserId
    }

    /**
     * Test the property 'buyerEmail'
     */
    @Test
    public void buyerEmailTest() {
        // TODO: test buyerEmail
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'firstLine'
     */
    @Test
    public void firstLineTest() {
        // TODO: test firstLine
    }

    /**
     * Test the property 'secondLine'
     */
    @Test
    public void secondLineTest() {
        // TODO: test secondLine
    }

    /**
     * Test the property 'city'
     */
    @Test
    public void cityTest() {
        // TODO: test city
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'zip'
     */
    @Test
    public void zipTest() {
        // TODO: test zip
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'formattedAddress'
     */
    @Test
    public void formattedAddressTest() {
        // TODO: test formattedAddress
    }

    /**
     * Test the property 'countryIso'
     */
    @Test
    public void countryIsoTest() {
        // TODO: test countryIso
    }

    /**
     * Test the property 'paymentMethod'
     */
    @Test
    public void paymentMethodTest() {
        // TODO: test paymentMethod
    }

    /**
     * Test the property 'paymentEmail'
     */
    @Test
    public void paymentEmailTest() {
        // TODO: test paymentEmail
    }

    /**
     * Test the property 'messageFromSeller'
     */
    @Test
    public void messageFromSellerTest() {
        // TODO: test messageFromSeller
    }

    /**
     * Test the property 'messageFromBuyer'
     */
    @Test
    public void messageFromBuyerTest() {
        // TODO: test messageFromBuyer
    }

    /**
     * Test the property 'messageFromPayment'
     */
    @Test
    public void messageFromPaymentTest() {
        // TODO: test messageFromPayment
    }

    /**
     * Test the property 'isPaid'
     */
    @Test
    public void isPaidTest() {
        // TODO: test isPaid
    }

    /**
     * Test the property 'isShipped'
     */
    @Test
    public void isShippedTest() {
        // TODO: test isShipped
    }

    /**
     * Test the property 'createTimestamp'
     */
    @Test
    public void createTimestampTest() {
        // TODO: test createTimestamp
    }

    /**
     * Test the property 'updateTimestamp'
     */
    @Test
    public void updateTimestampTest() {
        // TODO: test updateTimestamp
    }

    /**
     * Test the property 'isGift'
     */
    @Test
    public void isGiftTest() {
        // TODO: test isGift
    }

    /**
     * Test the property 'giftMessage'
     */
    @Test
    public void giftMessageTest() {
        // TODO: test giftMessage
    }

    /**
     * Test the property 'grandtotal'
     */
    @Test
    public void grandtotalTest() {
        // TODO: test grandtotal
    }

    /**
     * Test the property 'subtotal'
     */
    @Test
    public void subtotalTest() {
        // TODO: test subtotal
    }

    /**
     * Test the property 'totalPrice'
     */
    @Test
    public void totalPriceTest() {
        // TODO: test totalPrice
    }

    /**
     * Test the property 'totalShippingCost'
     */
    @Test
    public void totalShippingCostTest() {
        // TODO: test totalShippingCost
    }

    /**
     * Test the property 'totalTaxCost'
     */
    @Test
    public void totalTaxCostTest() {
        // TODO: test totalTaxCost
    }

    /**
     * Test the property 'totalVatCost'
     */
    @Test
    public void totalVatCostTest() {
        // TODO: test totalVatCost
    }

    /**
     * Test the property 'discountAmt'
     */
    @Test
    public void discountAmtTest() {
        // TODO: test discountAmt
    }

    /**
     * Test the property 'giftWrapPrice'
     */
    @Test
    public void giftWrapPriceTest() {
        // TODO: test giftWrapPrice
    }

    /**
     * Test the property 'shipments'
     */
    @Test
    public void shipmentsTest() {
        // TODO: test shipments
    }

    /**
     * Test the property 'transactions'
     */
    @Test
    public void transactionsTest() {
        // TODO: test transactions
    }

}

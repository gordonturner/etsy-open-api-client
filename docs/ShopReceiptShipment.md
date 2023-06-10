

# ShopReceiptShipment

The record of one shipment event for a ShopReceipt. A receipt may have many ShopReceiptShipment records.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**receiptShippingId** | **Long** | The unique numeric ID of a Shop Receipt Shipment record. |  [optional]
**shipmentNotificationTimestamp** | **Long** | The time at which Etsy notified the buyer of the shipment event, in epoch seconds. |  [optional]
**carrierName** | **String** | The name string for the carrier/company responsible for delivering the shipment. |  [optional]
**trackingCode** | **String** | The tracking code string provided by the carrier/company for the shipment. |  [optional]






# PaymentAccountLedgerEntry

Represents an entry in a shop's ledger.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryId** | **Long** | The ledger entry&#39;s numeric ID. |  [optional]
**ledgerId** | **Long** | The ledger&#39;s numeric ID. |  [optional]
**sequenceNumber** | **Long** | The sequence allows ledger entries to be sorted chronologically. The higher the sequence, the more recent the entry. |  [optional]
**amount** | **Long** | The amount of money credited to the ledger. |  [optional]
**currency** | **String** | The currency of the entry on the ledger. |  [optional]
**description** | **String** | Details what kind of ledger entry this is: a payment, refund, reversal of a failed refund, disbursement, returned disbursement, recoupment, miscellaneous credit, miscellaneous debit, or bill payment. |  [optional]
**balance** | **Long** | The amount of money in the shop&#39;s ledger the moment after this entry was applied. |  [optional]
**createDate** | **Long** | The date and time the ledger entry was created in Epoch seconds. |  [optional]
**createdTimestamp** | **Long** | The date and time the ledger entry was created in Epoch seconds. |  [optional]
**ledgerType** | **String** | The original reference type for the ledger entry. |  [optional]
**referenceType** | **String** | The object type the ledger entry refers to. |  [optional]
**referenceId** | **String** | The object id the ledger entry refers to. |  [optional]
**paymentAdjustments** | [**List&lt;PaymentAdjustment&gt;**](PaymentAdjustment.md) | List of refund objects on an Etsy Payments transaction. All monetary amounts are in USD pennies unless otherwise specified. |  [optional]




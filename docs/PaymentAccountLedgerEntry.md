

# PaymentAccountLedgerEntry

Represents an entry in a shop's ledger.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryId** | **Integer** | The ledger entry&#39;s numeric ID. | 
**ledgerId** | **Integer** | The ledger&#39;s numeric ID. | 
**sequenceNumber** | **Integer** | The sequence allows ledger entries to be sorted chronologically. The higher the sequence, the more recent the entry. | 
**amount** | **Integer** | The amount of money credited to the ledger. | 
**currency** | **String** | The currency of the entry on the ledger. | 
**description** | **String** | Details what kind of ledger entry this is: a payment, refund, reversal of a failed refund, disbursement, returned disbursement, recoupment, miscellaneous credit, miscellaneous debit, or bill payment. | 
**balance** | **Integer** | The amount of money in the shop&#39;s ledger the moment after this entry was applied. | 
**createDate** | **Integer** | The date and time the ledger entry was created in Epoch seconds.. | 
**ledgerType** | **String** | The original reference type for the ledger entry. | 
**referenceType** | **String** | The object type the ledger entry refers to. | 
**referenceId** | **String** | The object id the ledger entry refers to. | 




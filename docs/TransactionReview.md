

# TransactionReview

A transaction review record left by a User.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shopId** | **Integer** | The shop&#39;s numeric ID. | 
**listingId** | **Integer** | The ID of the ShopListing that the TransactionReview belongs to. | 
**transactionId** | **Integer** | The ID of the ShopReceipt Transaction that the TransactionReview belongs to. | 
**buyerUserId** | **Integer** | The numeric ID of the user who was the buyer in this transaction. Note: This field may be absent, depending on the buyer&#39;s privacy settings. | 
**rating** | **Integer** | Rating value on scale from 1 to 5 | 
**review** | **String** | A message left by the author, explaining the feedback, if provided. | 
**language** | **String** | The language of the TransactionReview | 
**imageUrlFullxfull** | **String** | The url to a photo provided with the feedback, dimensions fullxfull. Note: This field may be absent, depending on the buyer&#39;s privacy settings. | 
**createTimestamp** | **Integer** | The date and time the TransactionReview was created in epoch seconds. | 
**updateTimestamp** | **Integer** | The date and time the TransactionReview was updated in epoch seconds. | 






# TransactionReview

A transaction review record left by a User.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shopId** | **Long** | The shop&#39;s numeric ID. |  [optional]
**listingId** | **Long** | The ID of the ShopListing that the TransactionReview belongs to. |  [optional]
**transactionId** | **Long** | The ID of the ShopReceipt Transaction that the TransactionReview belongs to. |  [optional]
**buyerUserId** | **Long** | The numeric ID of the user who was the buyer in this transaction. Note: This field may be absent, depending on the buyer&#39;s privacy settings. |  [optional]
**rating** | **Long** | Rating value on scale from 1 to 5 |  [optional]
**review** | **String** | A message left by the author, explaining the feedback, if provided. |  [optional]
**language** | **String** | The language of the TransactionReview |  [optional]
**imageUrlFullxfull** | **String** | The url to a photo provided with the feedback, dimensions fullxfull. Note: This field may be absent, depending on the buyer&#39;s privacy settings. |  [optional]
**createTimestamp** | **Long** | The date and time the TransactionReview was created in epoch seconds. |  [optional]
**createdTimestamp** | **Long** | The date and time the TransactionReview was created in epoch seconds. |  [optional]
**updateTimestamp** | **Long** | The date and time the TransactionReview was updated in epoch seconds. |  [optional]
**updatedTimestamp** | **Long** | The date and time the TransactionReview was updated in epoch seconds. |  [optional]




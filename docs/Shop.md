

# Shop

A shop created by an Etsy user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shopId** | **Long** | The unique positive non-zero numeric ID for an Etsy Shop. |  [optional]
**userId** | **Long** | The numeric user ID of the [user](/documentation/reference#tag/User) who owns this shop. |  [optional]
**shopName** | **String** | The shop&#39;s name string. |  [optional]
**createDate** | **Long** | The date and time this shop was created, in epoch seconds. |  [optional]
**createdTimestamp** | **Long** | The date and time this shop was created, in epoch seconds. |  [optional]
**title** | **String** | A brief heading string for the shop\\&#39;s main page. |  [optional]
**announcement** | **String** | An announcement string to buyers that displays on the shop&#39;s homepage. |  [optional]
**currencyCode** | **String** | The ISO (alphabetic) code for the shop&#39;s currency. The shop displays all prices in this currency by default. |  [optional]
**isVacation** | **Boolean** | When true, this shop is not accepting purchases. |  [optional]
**vacationMessage** | **String** | The shop&#39;s message string displayed when &#x60;is_vacation&#x60; is true. |  [optional]
**saleMessage** | **String** | A message string sent to users who complete a purchase from this shop. |  [optional]
**digitalSaleMessage** | **String** | A message string sent to users who purchase a digital item from this shop. |  [optional]
**updateDate** | **Long** | The date and time of the last update to the shop, in epoch seconds. |  [optional]
**updatedTimestamp** | **Long** | The date and time of the last update to the shop, in epoch seconds. |  [optional]
**listingActiveCount** | **Long** | The number of active listings in the shop. |  [optional]
**digitalListingCount** | **Long** | The number of digital listings in the shop. |  [optional]
**loginName** | **String** | The shop owner\\&#39;s login name string. |  [optional]
**acceptsCustomRequests** | **Boolean** | When true, the shop accepts customization requests. |  [optional]
**policyWelcome** | **String** | The shop&#39;s policy welcome string (may be blank). |  [optional]
**policyPayment** | **String** | The shop&#39;s payment policy string (may be blank). |  [optional]
**policyShipping** | **String** | The shop&#39;s shipping policy string (may be blank). |  [optional]
**policyRefunds** | **String** | The shop&#39;s refund policy string (may be blank). |  [optional]
**policyAdditional** | **String** | The shop&#39;s additional policies string (may be blank). |  [optional]
**policySellerInfo** | **String** | The shop&#39;s seller information string (may be blank). |  [optional]
**policyUpdateDate** | **Long** | The date and time of the last update to the shop&#39;s policies, in epoch seconds. |  [optional]
**policyHasPrivateReceiptInfo** | **Boolean** | When true, EU receipts display private info. |  [optional]
**hasUnstructuredPolicies** | **Boolean** | When true, the shop displays additional unstructured policy fields. |  [optional]
**policyPrivacy** | **String** | The shop&#39;s privacy policy string (may be blank). |  [optional]
**vacationAutoreply** | **String** | The shop&#39;s automatic reply string displayed in new conversations when &#x60;is_vacation&#x60; is true. |  [optional]
**url** | **String** | The URL string for this shop. |  [optional]
**imageUrl760x100** | **String** | The URL string for this shop&#39;s banner image. |  [optional]
**numFavorers** | **Long** | The number of users who marked this shop a favorite. |  [optional]
**languages** | **List&lt;String&gt;** | A list of language strings for the shop&#39;s enrolled languages where the default shop language is the first element in the array. |  [optional]
**iconUrlFullxfull** | **String** | The URL string for this shop&#39;s icon image. |  [optional]
**isUsingStructuredPolicies** | **Boolean** | When true, the shop accepted using structured policies. |  [optional]
**hasOnboardedStructuredPolicies** | **Boolean** | When true, the shop accepted OR declined after viewing structured policies onboarding. |  [optional]
**includeDisputeFormLink** | **Boolean** | When true, this shop\\&#39;s policies include a link to an EU online dispute form. |  [optional]
**isDirectCheckoutOnboarded** | **Boolean** | (**DEPRECATED: Replaced by _is_etsy_payments_onboarded_.) When true, the shop has onboarded onto Etsy Payments. |  [optional]
**isEtsyPaymentsOnboarded** | **Boolean** | When true, the shop has onboarded onto Etsy Payments. |  [optional]
**isCalculatedEligible** | **Boolean** | When true, the shop is eligible for calculated shipping profiles. (Only available in the US and Canada) |  [optional]
**isOptedInToBuyerPromise** | **Boolean** | When true, the shop opted in to buyer promise. |  [optional]
**isShopUsBased** | **Boolean** | When true, the shop is based in the US. |  [optional]
**transactionSoldCount** | **Long** | The total number of sales ([transactions](/documentation/reference#tag/Shop-Receipt-Transactions)) for this shop. |  [optional]
**shippingFromCountryIso** | **String** | The country iso the shop is shipping from. |  [optional]
**shopLocationCountryIso** | **String** | The country iso where the shop is located. |  [optional]
**reviewCount** | **Long** | Number of reviews of shop listings in the past year. |  [optional]
**reviewAverage** | **Float** | Average rating based on reviews of shop listings in the past year. |  [optional]




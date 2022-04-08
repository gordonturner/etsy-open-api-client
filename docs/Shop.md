

# Shop

A shop created by an Etsy user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shopId** | **Integer** | The unique positive non-zero numeric ID for an Etsy Shop. | 
**userId** | **Integer** | The numeric user ID of the [user](/documentation/reference#tag/User) who owns this shop. | 
**shopName** | **String** | The shop&#39;s name string. | 
**createDate** | **Integer** | The date and time this shop was created, in epoch seconds. | 
**title** | **String** | A brief heading string for the shop\\&#39;s main page. | 
**announcement** | **String** | An announcement string to buyers that displays on the shop&#39;s homepage. | 
**currencyCode** | **String** | The ISO (alphabetic) code for the shop&#39;s currency. The shop displays all prices in this currency by default. | 
**isVacation** | **Boolean** | When true, this shop is not accepting purchases. | 
**vacationMessage** | **String** | The shop&#39;s message string displayed when is_vacation is true. | 
**saleMessage** | **String** | A message string sent to users who complete a purchase from this shop. | 
**digitalSaleMessage** | **String** | A message string sent to users who purchase a digital item from this shop. | 
**updateDate** | **Integer** | The date and time of the last update to the shop, in epoch seconds. | 
**listingActiveCount** | **Integer** | The number of active listings in the shop. | 
**digitalListingCount** | **Integer** | The number of digital listings in the shop. | 
**loginName** | **String** | The shop owner\\&#39;s login name string. | 
**acceptsCustomRequests** | **Boolean** | When true, the shop accepts customization requests. | 
**policyWelcome** | **String** | The shop&#39;s policy welcome string (may be blank). | 
**policyPayment** | **String** | The shop&#39;s payment policy string (may be blank). | 
**policyShipping** | **String** | The shop&#39;s shipping policy string (may be blank). | 
**policyRefunds** | **String** | The shop&#39;s refund policy string (may be blank). | 
**policyAdditional** | **String** | The shop&#39;s additional policies string (may be blank). | 
**policySellerInfo** | **String** | The shop&#39;s seller infomation string (may be blank). | 
**policyUpdateDate** | **Integer** | The date and time of the last update to the shop&#39;s policies, in epoch seconds. | 
**policyHasPrivateReceiptInfo** | **Boolean** | When true, EU receipts display private info. | 
**hasUnstructuredPolicies** | **Boolean** | When true, the shop displays additional unstructured policy fields. | 
**policyPrivacy** | **String** | The shop&#39;s privacy policy string (may be blank). | 
**vacationAutoreply** | **String** | The shop&#39;s automatic reply string displayed in new conversations when is_vacation is true. | 
**url** | **String** | The URL string for this shop. | 
**imageUrl760x100** | **String** | The URL string for this shop&#39;s banner image. | 
**numFavorers** | **Integer** | The number of users who marked this shop a favorite. | 
**languages** | **List&lt;String&gt;** | A list of language strings for the shop&#39;s enrolled languages. | 
**iconUrlFullxfull** | **String** | The URL string for this shop&#39;s icon image. | 
**isUsingStructuredPolicies** | **Boolean** | When true, the shop accepted using structured policies. | 
**hasOnboardedStructuredPolicies** | **Boolean** | When true, the shop accepted OR declined after viewing structured policies onboarding. | 
**includeDisputeFormLink** | **Boolean** | When true, this shop\\&#39;s policies include a link to an EU online dispute form. | 
**isDirectCheckoutOnboarded** | **Boolean** | (**DEPRECATED: Replaced by _is_etsy_payments_onboarded._) When true, the shop has onboarded onto Etsy Payments. | 
**isEtsyPaymentsOnboarded** | **Boolean** | When true, the shop has onboarded onto Etsy Payments. | 
**isCalculatedEligible** | **Boolean** | When true, the shop is elegible for calculated shipping profiles. (Only available in the US and Canada) | 
**isOptedInToBuyerPromise** | **Boolean** | When true, the shop opted in to buyer promise. | 
**isShopUsBased** | **Boolean** | When true, the shop is based in the US. | 
**transactionSoldCount** | **Integer** | The total number of sales ([transactions](/documentation/reference#tag/Shop-Receipt-Transactions)) for this shop | 
**shippingFromCountryIso** | **String** | The country iso the shop is shipping from. | 
**shopLocationCountryIso** | **String** | The country iso where the shop is located. | 
**reviewCount** | **Integer** | Number of reviews of shop listings in the past year. | 
**reviewAverage** | **Float** | Average rating based on reviews of shop listings in the past year. | 




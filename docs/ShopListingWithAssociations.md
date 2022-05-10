

# ShopListingWithAssociations

A listing from a shop, which contains a product quantity, title, description, price, etc. and additional fields which represent associations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**listingId** | **Long** | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. | 
**userId** | **Long** | The numeric ID for the [user](/documentation/reference#tag/User) posting the listing. | 
**shopId** | **Long** | The unique positive non-zero numeric ID for an Etsy Shop. | 
**title** | **String** | The listing&#39;s title string. Valid title strings contain only letters, numbers, punctuation marks, mathematical symbols, whitespace characters, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{P}\\\\p{Sm}\\\\p{Zs}™©®]/u) You can only use the %, :, &amp; and + characters once each. | 
**description** | **String** | A description string of the product for sale in the listing. | 
**state** | [**StateEnum**](#StateEnum) | An enumerated string from any of: active or inactive. Note: Setting a draft listing to active will also publish the listing on etsy.com. Setting a sold out listing to active will update the quantity to 1 and renew the listing on etsy.com. | 
**creationTimestamp** | **Long** | The listing\\&#39;s creation time, in epoch seconds. | 
**endingTimestamp** | **Long** | The listing\\&#39;s expiration time, in epoch seconds. | 
**originalCreationTimestamp** | **Long** | The listing\\&#39;s creation time, in epoch seconds. | 
**lastModifiedTimestamp** | **Long** | The time of the last update to the listing, in epoch seconds. | 
**stateTimestamp** | **Long** | The date and time of the last state change of this listing. | 
**quantity** | **Long** | The positive non-zero number of products available for purchase in the listing. Note: The listing quantity is the sum of available offering quantities. You can request the quantities for individual offerings from the ListingInventory resource using the [getListingInventory](/documentation/reference#operation/getListingInventory) endpoint. | 
**shopSectionId** | **Long** | The numeric ID of a section in a specific Etsy shop. | 
**featuredRank** | **Long** | The positive non-zero numeric position in the featured listings of the shop, with rank 1 listings appearing in the left-most position in featured listing on a shop’s home page. | 
**url** | **String** | The full URL to the listing&#39;s page on Etsy. | 
**numFavorers** | **Long** | The number of users who marked this Listing a favorite. | 
**nonTaxable** | **Boolean** | When true, applicable [shop](/documentation/reference#tag/Shop) tax rates do not apply to this listing at checkout. | 
**isTaxable** | **Boolean** | When true, applicable [shop](/documentation/reference#tag/Shop) tax rates apply to this listing at checkout. | 
**isCustomizable** | **Boolean** | When true, a buyer may contact the seller for a customized order. The default value is true when a shop accepts custom orders. Does not apply to shops that do not accept custom orders. | 
**isPersonalizable** | **Boolean** | When true, this listing is personalizable. The default value is null. | 
**personalizationIsRequired** | **Boolean** | When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is &#39;true&#39;. | 
**personalizationCharCountMax** | **Long** | This an integer value representing the maximum length for the personalization message entered by the buyer. Will only change if is_personalizable is &#39;true&#39;. | 
**personalizationInstructions** | **String** | When true, this listing requires personalization. The default value is null. Will only change if is_personalizable is &#39;true&#39;. | 
**listingType** | [**ListingTypeEnum**](#ListingTypeEnum) | An enumerated type string that indicates whether the listing is physical or a digital download. | 
**tags** | **List&lt;String&gt;** | A comma-separated list of tag strings for the listing. Valid tag strings contain only letters, numbers, whitespace characters, -, &#39;, ™, ©, and ®. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}\\\\-&#39;™©®]/u) Default value is null. | 
**materials** | **List&lt;String&gt;** | A list of material strings for materials used in the product. Valid materials strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. | 
**shippingProfileId** | **Long** | The numeric ID of the [shipping profile](/documentation/reference#tag/ShopListing-ShippingProfile) associated with the listing. Required when listing type&#x3D;physical. | 
**processingMin** | **Long** | The minimum number of days required to process this listing. Default value is null. | 
**processingMax** | **Long** | The maximum number of days required to process this listing. Default value is null. | 
**whoMade** | [**WhoMadeEnum**](#WhoMadeEnum) | An enumerated string inidcated who made the product. Helps buyers locate the listing under the Handmade heading. Requires &#39;is_supply&#39; and &#39;when_made&#39;. | 
**whenMade** | [**WhenMadeEnum**](#WhenMadeEnum) | An enumerated string for the era in which the maker made the product in this listing. Helps buyers locate the listing under the Vintage heading. Requires &#39;is_supply&#39; and &#39;who_made&#39;. | 
**isSupply** | **Boolean** | When true, tags the listing as a supply product, else indicates that it&#39;s a finished product. Helps buyers locate the listing under the Supplies heading. Requires &#39;who_made&#39; and &#39;when_made&#39;. | 
**itemWeight** | **Float** | The numeric weight of the product measured in units set in \\&#39;item_weight_unit\\&#39;. Default value is null. If set, the value must be greater than 0. | 
**itemWeightUnit** | [**ItemWeightUnitEnum**](#ItemWeightUnitEnum) | A string defining the units used to measure the weight of the product. Default value is null. | 
**itemLength** | **Float** | The numeric length of the product measured in units set in \\&#39;item_dimensions_unit\\&#39;. Default value is null. If set, the value must be greater than 0. | 
**itemWidth** | **Float** | The numeric width of the product measured in units set in \\&#39;item_dimensions_unit\\&#39;. Default value is null. If set, the value must be greater than 0. | 
**itemHeight** | **Float** | The numeric length of the product measured in units set in \\&#39;item_dimensions_unit\\&#39;. Default value is null. If set, the value must be greater than 0. | 
**itemDimensionsUnit** | [**ItemDimensionsUnitEnum**](#ItemDimensionsUnitEnum) | A string defining the units used to measure the dimensions of the product. Default value is null. | 
**isPrivate** | **Boolean** | When true, this is a private listing intendend for a specific buyer and hidden from shop view. | 
**style** | **List&lt;String&gt;** | An array of style strings for this listing, each of which is free-form text string such as \\\&quot;Formal\\\&quot;, or \\\&quot;Steampunk\\\&quot;. A Listing may have up to two styles. Valid style strings contain only letters, numbers, and whitespace characters. (regex: /[^\\\\p{L}\\\\p{Nd}\\\\p{Zs}]/u) Default value is null. | 
**fileData** | **String** | A string describing the files attached to a digital listing. | 
**hasVariations** | **Boolean** | When true, the listing has variations. | 
**shouldAutoRenew** | **Boolean** | When true, renews a listing for four months upon expriation. If set to true when previously false, etsy.com renews the listing before it expires, but the renewal period starts immidiately rather than extending the listing&#39;s expiration date. Any unused time remaining on the listing is lost. Renewals result in charges to a user&#39;s bill. | 
**language** | **String** | The IETF language tag for the default language of the listing. Ex: &#x60;de&#x60;, &#x60;en&#x60;, &#x60;es&#x60;, &#x60;fr&#x60;, &#x60;it&#x60;, &#x60;ja&#x60;, &#x60;nl&#x60;, &#x60;pl&#x60;, &#x60;pt&#x60;, &#x60;ru&#x60;. | 
**price** | [**Money**](Money.md) | The positive non-zero price of the product. (Sold product listings are private) Note: The price is the minimum possible price. The [&#x60;getListingInventory&#x60;](/documentation/reference/#operation/getListingInventory) method requests exact prices for available offerings. | 
**taxonomyId** | **Long** | The numeric taxonomy ID of the listing. See [SellerTaxonomy](/documentation/reference#tag/SellerTaxonomy) and [BuyerTaxonomy](/documentation/reference#tag/BuyerTaxonomy) for more information. | 
**shippingProfile** | [**ShopShippingProfile**](ShopShippingProfile.md) | An array of data representing the shipping profile resource. | 
**user** | [**User**](User.md) | Represents a single user of the site | 
**shop** | [**Shop**](Shop.md) | A shop created by an Etsy user. | 
**images** | [**List&lt;ListingImage&gt;**](ListingImage.md) | Represents a list of listing image resources, each of which contains the reference URLs and metadata for an image | 
**inventory** | [**ListingInventory**](ListingInventory.md) | An enumerated string that attaches an valid association. Default value is null. | 
**productionPartners** | [**List&lt;ShopProductionPartner&gt;**](ShopProductionPartner.md) | Represents a list of production partners for a shop. | 
**skus** | **List&lt;String&gt;** | A list of SKU strings for the listing. SKUs will only appear if the requesting user owns the shop. | 
**translations** | [**List&lt;ListingTranslation&gt;**](ListingTranslation.md) | An array of translations for the listing. Default value is an empty array. | 



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
SOLD_OUT | &quot;sold_out&quot;
DRAFT | &quot;draft&quot;
EXPIRED | &quot;expired&quot;



## Enum: ListingTypeEnum

Name | Value
---- | -----
PHYSICAL | &quot;physical&quot;
DOWNLOAD | &quot;download&quot;
BOTH | &quot;both&quot;



## Enum: WhoMadeEnum

Name | Value
---- | -----
I_DID | &quot;i_did&quot;
SOMEONE_ELSE | &quot;someone_else&quot;
COLLECTIVE | &quot;collective&quot;



## Enum: WhenMadeEnum

Name | Value
---- | -----
MADE_TO_ORDER | &quot;made_to_order&quot;
_2020_2022 | &quot;2020_2022&quot;
_2010_2019 | &quot;2010_2019&quot;
_2003_2009 | &quot;2003_2009&quot;
BEFORE_2003 | &quot;before_2003&quot;
_2000_2002 | &quot;2000_2002&quot;
_1990S | &quot;1990s&quot;
_1980S | &quot;1980s&quot;
_1970S | &quot;1970s&quot;
_1960S | &quot;1960s&quot;
_1950S | &quot;1950s&quot;
_1940S | &quot;1940s&quot;
_1930S | &quot;1930s&quot;
_1920S | &quot;1920s&quot;
_1910S | &quot;1910s&quot;
_1900S | &quot;1900s&quot;
_1800S | &quot;1800s&quot;
_1700S | &quot;1700s&quot;
BEFORE_1700 | &quot;before_1700&quot;



## Enum: ItemWeightUnitEnum

Name | Value
---- | -----
OZ | &quot;oz&quot;
LB | &quot;lb&quot;
G | &quot;g&quot;
KG | &quot;kg&quot;



## Enum: ItemDimensionsUnitEnum

Name | Value
---- | -----
IN | &quot;in&quot;
FT | &quot;ft&quot;
MM | &quot;mm&quot;
CM | &quot;cm&quot;
M | &quot;m&quot;
YD | &quot;yd&quot;
INCHES | &quot;inches&quot;




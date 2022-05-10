

# ShopShippingProfileUpgrade

A representation of a shipping profile upgrade option.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shippingProfileId** | **Long** | The numeric ID of the base shipping profile. | 
**upgradeId** | **Long** | The numeric ID that is associated with a shipping upgrade | 
**upgradeName** | **String** | Name for the shipping upgrade shown to shoppers at checkout, e.g. USPS Priority. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the shipping upgrade. Domestic (0) or international (1). | 
**rank** | **Long** | The positive non-zero numeric position in the images displayed in a listing, with rank 1 images appearing in the left-most position in a listing. | 
**language** | **String** | The IETF language tag for the language of the shipping profile. Ex: de, en, es, fr, it, ja, nl, pl, pt, ru. | 
**price** | [**Money**](Money.md) | Additional cost of adding the shipping upgrade. | 
**secondaryPrice** | [**Money**](Money.md) | Additional cost of adding the shipping upgrade for each additional item. | 
**shippingCarrierId** | **Long** | The unique ID of a supported shipping carrier, which is used to calculate an Estimated Delivery Date. **Required with &#x60;mail_class&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | 
**mailClass** | **String** | The unique ID string of a shipping carrier&#39;s mail class, which is used to calculate an estimated delivery date. **Required with &#x60;shipping_carrier_id&#x60;** if &#x60;min_delivery_days&#x60; and &#x60;max_delivery_days&#x60; are null. | 
**minDeliveryDays** | **Long** | The minimum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;max_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | 
**maxDeliveryDays** | **Long** | The maximum number of business days a buyer can expect to wait to receive their purchased item once it has shipped. **Required with &#x60;min_delivery_days&#x60;** if &#x60;mail_class&#x60; is null. | 



## Enum: TypeEnum

Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;






# ShopReturnPolicy

Represents a listing-level return policy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnPolicyId** | **Long** | The numeric ID of the [Return Policy](/documentation/reference#operation/getShopReturnPolicies). |  [optional]
**shopId** | **Long** | The unique positive non-zero numeric ID for an Etsy Shop. |  [optional]
**acceptsReturns** | **Boolean** | return_policy_accepts_returns |  [optional]
**acceptsExchanges** | **Boolean** | return_policy_accepts_exchanges |  [optional]
**returnDeadline** | **Long** | The deadline for the Return Policy, measured in days. The value must be one of the following: [7, 14, 21, 30, 45, 60, 90]. |  [optional]




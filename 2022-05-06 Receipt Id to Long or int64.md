# 2022-05-06 Receipt Id to Long or int64

- The receipt id value returned from the API was too big for the default Integer datatype.

## Option 1

- Add the typemappings parameter to the call to map all Integers and ints to something larger

integer=Long,int=Long
integer=int64,int=int64

- Example:

```shell
--type-mappings=DateTime=java.time.LocalDateTime
```

- Run:

```shell
java -jar openapi-generator-cli.jar generate \
-i https://www.etsy.com/openapi/generated/oas/3.0.0.json \
-g java \
-o ./etsy-open-api-client \
--skip-validate-spec \
--group-id com.gordonturner.etsy \
--artifact-id etsy-open-api-client \
--artifact-version 1.0.0 \
--type-mappings=integer=Long,int=Long
```

- Reference:

https://stackoverflow.com/questions/66462100/openapi-generator-use-long-as-numeric-default


## Option 2

- Downloaded the spec and customized to add `format: int64` for receipt id

```
                "tags": ["Payment"],
                "parameters": [
                  ...
                    {
                        "name": "receipt_id",
                        "in": "path",
                        "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64",
                            "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                            "minimum": 1
                        }
                    }
                ],
```


```
                "tags": ["Shop Receipt"],
                "parameters": [
                    ...
                    {
                        "name": "receipt_id",
                        "in": "path",
                        "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64",
                            "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                            "minimum": 1
                        }
                    }
                ],
```


```
                "tags": ["ShopListing"],
                "parameters": [
                    {
                        "name": "receipt_id",
                        "in": "path",
                        "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64",
                            "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                            "minimum": 1
                        }
                    },
```


```
                "tags": ["Shop Receipt"],
                "parameters": [
                    ...
                    {
                        "name": "receipt_id",
                        "in": "path",
                        "description": "The receipt to submit tracking for.",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64",
                            "description": "The receipt to submit tracking for.",
                            "minimum": 1
                        }
                    }
                ],
```


```
                "tags": ["Shop Receipt Transactions"],
                "parameters": [
                    ...
                    {
                        "name": "receipt_id",
                        "in": "path",
                        "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64",
                            "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                            "minimum": 1
                        }
                    }
                ],
```


```
            "ShopReceiptTransaction": {
                "type": "object",
                "description": "A transaction object associated with a shop receipt. Etsy generates one transaction per listing purchased as recorded on the order receipt.",
                "required": [
                  ...
                ],
                ...
                    "receipt_id": {
                        "type": "integer",
                        "format": "int64",
                        "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                        "minimum": 1
                    },
```


```
            "Payment": {
                "type": "object",
                "description": "Represents a payment made with Etsy Payments. All monetary amounts are in USD pennies unless otherwise specified.",
                "required": [
                  ...
                ],
                "properties": {
                    ...
                    "receipt_id": {
                        "type": "integer",
                        "format": "int64",
                        "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                        "minimum": 1
                    },
```


```
            "ShopReceipt": {
                "type": "object",
                "description": "The record of a purchase from a shop. Shop receipts display monetary values using the shop's currency.",
                "required": [
                  ...
                ],
                "properties": {
                    "receipt_id": {
                        "type": "integer",
                        "format": "int64",
                        "description": "The numeric ID for the [receipt](/documentation/reference#tag/Shop-Receipt) associated to this transaction.",
                        "minimum": 1
                    },
```











# Invoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invId** | **String** | Invoice ID |  |
|**subId** | **Object** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**error** | **Object** |  |  |
|**currency** | **String** |  |  |
|**amountDue** | **Integer** |  |  |
|**amountPaid** | **Integer** |  |  |
|**total** | **Integer** |  |  |
|**totalDiscount** | **Integer** |  |  |
|**totalTax** | **Integer** |  |  |
|**billedAt** | **OffsetDateTime** |  |  |
|**stripeInvId** | **String** |  |  |
|**stripeSubId** | **Object** |  |  |
|**stripeCusId** | **Object** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| OPEN | &quot;open&quot; |
| VOID | &quot;void&quot; |
| PAID | &quot;paid&quot; |
| UNCOLLECTIBLE | &quot;uncollectible&quot; |




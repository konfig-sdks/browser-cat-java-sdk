

# Subscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subId** | **String** | Subscription ID |  |
|**tier** | [**TierEnum**](#TierEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**currency** | **String** |  |  |
|**periodUnit** | [**PeriodUnitEnum**](#PeriodUnitEnum) |  |  |
|**periodCount** | **Integer** |  |  |
|**periodStartsAt** | **OffsetDateTime** |  |  |
|**periodEndsAt** | **OffsetDateTime** |  |  |
|**anchoredAt** | **OffsetDateTime** |  |  |
|**canceledAt** | **Object** |  |  |
|**resumedAt** | **Object** |  |  |
|**pausedAt** | **Object** |  |  |
|**stripeSubId** | **String** |  |  |
|**stripeCusId** | **Object** |  |  |



## Enum: TierEnum

| Name | Value |
|---- | -----|
| HOBBY | &quot;hobby&quot; |
| BUSINESS | &quot;business&quot; |
| ENTERPRISE | &quot;enterprise&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INCOMPLETE | &quot;incomplete&quot; |
| INCOMPLETE_EXPIRED | &quot;incomplete_expired&quot; |
| ACTIVE | &quot;active&quot; |
| TRIALING | &quot;trialing&quot; |
| PAST_DUE | &quot;past_due&quot; |
| UNPAID | &quot;unpaid&quot; |
| CANCELED | &quot;canceled&quot; |
| PAUSED | &quot;paused&quot; |



## Enum: PeriodUnitEnum

| Name | Value |
|---- | -----|
| DAY | &quot;day&quot; |
| WEEK | &quot;week&quot; |
| MONTH | &quot;month&quot; |
| YEAR | &quot;year&quot; |






# UsageEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**usageEventId** | **String** |  |  |
|**usageSessionId** | **String** |  |  |
|**type** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**data** | **Object** |  |  [optional] |
|**sentAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**sessionId** | **String** | UsageSession ID |  |
|**eventId** | **String** | UsageEvent ID |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |






# BadRequestError


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**error** | [**ErrorEnum**](#ErrorEnum) |  |  |
|**message** | **String** | Suggestions for debugging the issue |  |
|**invalid** | [**InvalidEnum**](#InvalidEnum) | Where the validation error occurred |  [optional] |
|**fields** | [**List&lt;BadRequestErrorFieldsInner&gt;**](BadRequestErrorFieldsInner.md) | Validation errors, when available |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_400 | 400 |



## Enum: ErrorEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |



## Enum: InvalidEnum

| Name | Value |
|---- | -----|
| BODY | &quot;body&quot; |
| PATH | &quot;path&quot; |
| QUERY | &quot;query&quot; |




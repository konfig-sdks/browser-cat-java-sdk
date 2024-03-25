

# UsageSessionPublic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**usageSessionId** | **String** |  |  |
|**clerkOrgId** | **Object** |  |  |
|**clerkUserId** | **Object** |  |  |
|**keyId** | **Object** |  |  |
|**method** | [**MethodEnum**](#MethodEnum) |  |  |
|**endpoint** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**machineId** | **String** |  |  |
|**machineRegion** | **String** |  |  |
|**browserType** | [**BrowserTypeEnum**](#BrowserTypeEnum) |  |  |
|**browserVersion** | **String** |  |  |
|**agentType** | [**AgentTypeEnum**](#AgentTypeEnum) |  |  |
|**agentVersion** | **String** |  |  |
|**startedAt** | **OffsetDateTime** |  |  |
|**endedAt** | **Object** |  |  |
|**sessionId** | **String** | UsageSession ID |  |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| API | &quot;api&quot; |
| WS | &quot;ws&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |



## Enum: BrowserTypeEnum

| Name | Value |
|---- | -----|
| CHROMIUM | &quot;chromium&quot; |
| FIREFOX | &quot;firefox&quot; |
| WEBKIT | &quot;webkit&quot; |
| CHROME | &quot;chrome&quot; |
| CHROME_BETA | &quot;chrome-beta&quot; |
| MSEDGE | &quot;msedge&quot; |
| MSEDGE_BETA | &quot;msedge-beta&quot; |
| MSEDGE_DEV | &quot;msedge-dev&quot; |



## Enum: AgentTypeEnum

| Name | Value |
|---- | -----|
| PLAYWRIGHT | &quot;playwright&quot; |
| PUPPETEER | &quot;puppeteer&quot; |
| SELENIUM | &quot;selenium&quot; |




package com.konfigthis.client;

import com.konfigthis.client.api.ApiKeysApi;
import com.konfigthis.client.api.BillingApi;
import com.konfigthis.client.api.BrowsersApi;
import com.konfigthis.client.api.OpenApiApi;
import com.konfigthis.client.api.ServerApi;
import com.konfigthis.client.api.UsageApi;

public class BrowserCat {
    private ApiClient apiClient;
    public final ApiKeysApi apiKeys;
    public final BillingApi billing;
    public final BrowsersApi browsers;
    public final OpenApiApi openApi;
    public final ServerApi server;
    public final UsageApi usage;

    public BrowserCat() {
        this(null);
    }

    public BrowserCat(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.apiKeys = new ApiKeysApi(this.apiClient);
        this.billing = new BillingApi(this.apiClient);
        this.browsers = new BrowsersApi(this.apiClient);
        this.openApi = new OpenApiApi(this.apiClient);
        this.server = new ServerApi(this.apiClient);
        this.usage = new UsageApi(this.apiClient);
    }

}

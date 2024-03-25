package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.browsercat.com";
        
        configuration.jwtCookie  = "YOUR API KEY";
        
        // Configure HTTP bearer authorization: jwtHeader
        configuration.token = "BEARER TOKEN";
        
        configuration.keyHeader  = "YOUR API KEY";
        BrowserCat client = new BrowserCat(configuration);
        assertNotNull(client);
    }
}

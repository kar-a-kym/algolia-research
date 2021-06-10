package com.epam.algoliaresearch.algolia.config;

import com.algolia.search.DefaultSearchClient;
import com.algolia.search.SearchClient;
import com.algolia.search.SearchConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class SearchClientConfiguration {

    @Value("${algolia.applicationId}")
    private String applicationId;

    @Value("${algolia.adminApiKey}")
    private String apiKey;

    @Bean(destroyMethod = "close")
    public SearchClient getDefaultClient() {
        log.info("Configuring search client for application {}", applicationId);
        SearchConfig searchConfig = new SearchConfig.Builder(applicationId, apiKey)
                .setWriteTimeOut(1000)//Equals default value
                .setReadTimeOut(1000)//Equals default value
                .setConnectTimeOut(2000)//Equals default value
                .setBatchSize(500)//Default is 1000
                .addExtraHeaders("X-Algolia-User", "algolia-research-app")
                .build();
        return DefaultSearchClient.create(searchConfig);
    }

}
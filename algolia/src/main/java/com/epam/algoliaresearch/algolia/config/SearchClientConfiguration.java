package com.epam.algoliaresearch.algolia.config;

import com.algolia.search.SearchClient;
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
        //TODO Task 2 Configure search client
        log.info("Configuring search client for application {}", applicationId);
        return null;
    }
}

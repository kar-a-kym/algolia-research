package com.epam.algoliaresearch.algolia;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.security.Security;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class Application {
    public static void main(String[] args) {
        Security.setProperty("networkaddress.cache.ttl", "60");
        SpringApplication.run(Application.class);
    }
}

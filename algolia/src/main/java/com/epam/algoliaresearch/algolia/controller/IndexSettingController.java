package com.epam.algoliaresearch.algolia.controller;

import com.epam.algoliaresearch.algolia.model.IndexSettingModel;
import com.epam.algoliaresearch.algolia.service.IndexSettingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/indices/{indexName}/settings")
@RequiredArgsConstructor
public class IndexSettingController {

    private final IndexSettingService indexSettingService;

    @GetMapping
    public ResponseEntity<IndexSettingModel> getIndexSettings(
        @PathVariable("indexName") String indexName
    ) {
        //TODO Task 15 Retrieve index settings
        // Return 200 OK and IndexSetting model in case of success
        // Return 404 Not Found if there is no index with the specified name
        return null;
    }

    @PostMapping
    public ResponseEntity<IndexSettingModel> setIndexSettings(
        @PathVariable("indexName") String indexName,
        @RequestBody IndexSettingModel indexSettingModel
    ) {
        //TODO Task 16 Set index settings
        // Return 200 OK and IndexSetting model in case of success
        // Return 404 Not Found if there is no index with the specified name
        return null;
    }
}

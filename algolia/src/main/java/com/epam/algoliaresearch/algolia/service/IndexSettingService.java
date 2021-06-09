package com.epam.algoliaresearch.algolia.service;

import com.algolia.search.SearchIndex;
import com.epam.algoliaresearch.algolia.model.IndexSettingModel;
import com.epam.algoliaresearch.algolia.repository.IndexSettingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class IndexSettingService {

    private final List<SearchIndex<?>> indices;
    private final IndexSettingRepository indexSettingRepository;

    public IndexSettingModel getIndexSettings(String indexName) {
        //TODO Task 15 Retrieve index settings by its name
        return null;
    }

    public IndexSettingModel setIndexSettings(String indexName, IndexSettingModel indexSettingModel) {
        //TODO Task 16 Find index by its name.
        // If it exists set new settings to the index.
        // Return all current settings once they are updated
        return null;
    }
}

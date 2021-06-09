package com.epam.algoliaresearch.algolia.repository;

import com.algolia.search.SearchIndex;
import com.algolia.search.models.settings.IndexSettings;
import com.algolia.search.models.settings.SetSettingsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class IndexSettingRepository {

    public IndexSettings getIndexSettings(SearchIndex<?> searchIndex) {
        //TODO Task 15 Retrieve index settings
        return null;
    }

    public SetSettingsResponse setIndexSettings(SearchIndex<?> searchIndex, IndexSettings indexSettings) {
        //TODO Task 16 Set settings to specified index
        return null;
    }
}

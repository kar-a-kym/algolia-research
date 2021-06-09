package com.epam.algoliaresearch.algolia.mapper;

import com.algolia.search.models.settings.IndexSettings;
import com.epam.algoliaresearch.algolia.model.IndexSettingModel;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IndexSettingModelMapper {

    public static IndexSettingModel map(IndexSettings indexSettings) {
        //TODO Task 15 Map Index Settings to the model
        return null;
    }

    public static IndexSettings map(IndexSettingModel indexSettings) {
        //TODO Task 16 Map the model to Index Settings
        return null;
    }
}


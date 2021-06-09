package com.epam.algoliaresearch.algolia.config;

import com.algolia.search.SearchClient;
import com.algolia.search.SearchIndex;
import com.epam.algoliaresearch.algolia.model.ActorModel;
import com.epam.algoliaresearch.algolia.model.MovieModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class IndicesConfiguration {

    private static final String ACTORS_INDEX_NAME = "actors";
    private static final String MOVIES_INDEX_NAME = "movies";

    @Bean
    public SearchIndex<ActorModel> actorsIndex(/*SearchClient searchClient*/) {
        // TODO Task 3: Initialize an index for actors here
        return null;
    }

    @Bean
    public SearchIndex<MovieModel> moviesIndex(/*SearchClient searchClient*/) {
        // TODO Task 13 Initialize an index for movies here
        //TODO Task 19 Add actors as filter-only attribute for faceting to your index settings
        //TODO Task 20 Add list of facets to previously defined filter-only attribute
        //TODO Task 22 Add list of searchable facets to previously defined facets attribute
        return null;
    }
}

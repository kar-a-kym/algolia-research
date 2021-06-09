package com.epam.algoliaresearch.algolia.mapper;

import com.algolia.search.models.indexing.SearchForFacetResponse;
import com.algolia.search.models.indexing.SearchResult;
import com.epam.algoliaresearch.algolia.dto.request.MovieSearchRequest;
import com.epam.algoliaresearch.algolia.dto.response.MovieSearchResponse;
import com.epam.algoliaresearch.algolia.model.MovieModel;

import java.util.List;
import java.util.Map;

public class MovieSearchMapper {

    public static MovieSearchResponse mapSearchResponse(SearchResult<MovieModel> result) {
        //TODO Task 21
        //TODO Task 22
        return null;
    }

    public static String mapFilters(MovieSearchRequest request) {
        //TODO Task 21
        return null;
    }

    public static List<String> mapFacets(MovieSearchRequest request) {
        //TODO Task 22
        return null;
    }

    public static Map<String, Long> mapFacetSearchResponse(SearchForFacetResponse result) {
        //TODO Task 24
        return Map.of();
    }
}

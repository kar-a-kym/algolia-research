package com.epam.algoliaresearch.algolia.service;

import com.epam.algoliaresearch.algolia.dto.request.CreateMovieRequest;
import com.epam.algoliaresearch.algolia.dto.request.MovieSearchRequest;
import com.epam.algoliaresearch.algolia.dto.response.MovieSearchResponse;
import com.epam.algoliaresearch.algolia.repository.MoviesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class MoviesService {

    private final MoviesRepository moviesRepository;

    public List<String> createAll(List<CreateMovieRequest> createMovieRequests) {
        log.debug("Adding new objects to the index: total={}", createMovieRequests.size());
        //TODO Task 14: Create multiple objects in the index. Wait until all requests are finished
        return null;
    }

    public void deleteAll() {
        log.debug("Deleting all records from the index");
        //TODO Task 14 Delete all the records from the index
    }

    public MovieSearchResponse filteredSearch(String titleQuery, MovieSearchRequest request) {
        //TODO Task 21 Map filter parameter to string and pass into search
        //TODO Task 22 Map facets from request and extend response with facets value-number pairs
        return null;
    }

    public Map<String, Long> facetSearch(String titleQuery, MovieSearchRequest request, String facetName, String facetQuery) {
        //TODO Task 24 Make facet search with filter query
        return null;
    }
}

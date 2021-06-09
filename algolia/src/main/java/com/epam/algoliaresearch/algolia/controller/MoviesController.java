package com.epam.algoliaresearch.algolia.controller;

import com.epam.algoliaresearch.algolia.dto.request.MovieSearchRequest;
import com.epam.algoliaresearch.algolia.dto.response.MovieSearchResponse;
import com.epam.algoliaresearch.algolia.service.MoviesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping(value = "/movies", produces = "application/json")
@RequiredArgsConstructor
public class MoviesController {

    private final MoviesService moviesService;

    @DeleteMapping
    public <T> ResponseEntity<T> deleteAll() {
        //TODO Task 14 Delete all records from the index
        // Return 204 No Content response in case of success
        return null;
    }

    @PostMapping("/filteredSearch")
    public ResponseEntity<MovieSearchResponse> filteredSearch(@RequestParam String titleQuery, @RequestBody MovieSearchRequest searchRequest) {
        //TODO Task 21 Search movies by title and actor filter
        // Return 200 OK and list of movies
        return null;
    }

    @PostMapping("/facetSearch")
    public ResponseEntity facetSearch(@RequestParam String titleQuery, @RequestBody MovieSearchRequest searchRequest,
                                      @RequestParam String facetName, @RequestParam String facetValue) {
        //TODO Task 24 Search of facet values. Pass title query, so facet search result is relevant to user input
        // Return 200 OK and map of facet values and their count
        return null;
    }
}

package com.epam.algoliaresearch.algolia.controller;

import com.epam.algoliaresearch.algolia.dto.response.TotalResponse;
import com.epam.algoliaresearch.algolia.service.ActorsService;
import com.epam.algoliaresearch.algolia.service.DataLoadService;
import com.epam.algoliaresearch.algolia.service.MoviesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Slf4j
@Controller
@RequestMapping(produces = "application/json")
@RequiredArgsConstructor
public class DataLoadController {

    private final DataLoadService dataLoadService;
    private final ActorsService actorsService;
    private final MoviesService moviesService;

    @PostMapping("/actors/load")
    public ResponseEntity<TotalResponse> loadActorsFromFile() throws IOException {
        //TODO Task 12 Use dataLoad service to read all actors from the data file
        // Use actors service to create all records from the file in the `actors` index
        // Return 200 OK and the total number of records created in the index in case of success
        return null;
    }

    @PostMapping("/movies/load")
    public ResponseEntity<TotalResponse> loadMoviesFromFile() throws IOException {
        //TODO Task 14 Use dataLoad Service to read all movies from the data file
        // Use movies service to create all records from the file in the `movies` index
        // Return 200 OK and the total number of records created in the index in case of success
        return null;
    }

}

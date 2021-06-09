package com.epam.algoliaresearch.algolia.service;

import com.epam.algoliaresearch.algolia.dto.request.CreateActorRequest;
import com.epam.algoliaresearch.algolia.dto.request.CreateMovieRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class DataLoadService {

    public List<CreateActorRequest> loadActors() throws IOException {
        //TODO Task 12 Use org.springframework.util.ResourceUtils to get the "./algolia/dataset/actors.json" file.
        // Use the ObjectMapper from com.algolia.search.Defaults class to deserialize the file content into the list of CreateActorRequest beans.
        return null;
    }

    public List<CreateMovieRequest> loadMovies() throws IOException {
        //TODO Task 14 Use org.springframework.util.ResourceUtils to get "./algolia/dataset/movies.json" file.
        // Use the ObjectMapper from com.algolia.search.Defaults class to deserialize the file content into the list of CreateMovieRequest beans.
        return null;
    }
}

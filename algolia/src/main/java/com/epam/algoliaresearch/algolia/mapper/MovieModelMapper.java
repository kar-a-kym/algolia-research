package com.epam.algoliaresearch.algolia.mapper;

import com.epam.algoliaresearch.algolia.dto.request.CreateMovieRequest;
import com.epam.algoliaresearch.algolia.model.MovieModel;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MovieModelMapper {

    public static MovieModel map(CreateMovieRequest createMovieRequest) {
        //TODO Task 13 Transform CreateMovieRequest into MovieModel
        return null;
    }

    public static List<MovieModel> map(List<CreateMovieRequest> createMovieRequests) {
        return createMovieRequests.stream()
            .map(MovieModelMapper::map)
            .collect(Collectors.toList());
    }

}

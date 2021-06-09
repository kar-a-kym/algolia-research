package com.epam.algoliaresearch.algolia.repository;

import com.algolia.search.models.indexing.BatchIndexingResponse;
import com.algolia.search.models.indexing.DeleteResponse;
import com.algolia.search.models.indexing.SearchForFacetResponse;
import com.algolia.search.models.indexing.SearchResult;
import com.epam.algoliaresearch.algolia.model.MovieModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Repository
@RequiredArgsConstructor
public class MoviesRepository {

    //TODO Task 14: Inject SearchIndex<MovieModel> bean here

    public CompletableFuture<BatchIndexingResponse> saveAll(List<MovieModel> movieModels) {
        // TODO Task 14: Save all records in the index
        return null;
    }

    public CompletableFuture<DeleteResponse> deleteAll() {
        //TODO Task 14: Delete all the records from the index
        return null;
    }

    public CompletableFuture<SearchResult<MovieModel>> filteredSearch(String titleQuery, String filters) {
        //TODO Task 21 Create query with movie title query (including alternative titles) and filters
        return null;
    }

    public CompletableFuture<SearchResult<MovieModel>> filteredSearch(String titleQuery, String filters, List<String> facets) {
        //TODO Task 22 Extend query from previous task with facets
        return null;
    }

    public CompletableFuture<SearchForFacetResponse> facetSearch(String titleQuery,
                                                                 String filters,
                                                                 String facetName,
                                                                 String facetQuery) {
        //TODO Task 24 Use query from previous task and add it to facets search
        return null;
    }

}

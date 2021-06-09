package com.epam.algoliaresearch.algolia.repository;

import com.algolia.search.models.indexing.BatchIndexingResponse;
import com.algolia.search.models.indexing.DeleteResponse;
import com.algolia.search.models.indexing.MultiResponse;
import com.algolia.search.models.indexing.UpdateObjectResponse;
import com.epam.algoliaresearch.algolia.model.ActorModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Repository
@RequiredArgsConstructor
public class ActorsRepository {

    // TODO Task 3: Inject SearchIndex<ActorModel> bean here

    public CompletableFuture<BatchIndexingResponse> save(ActorModel actorModel) {
        // TODO Task 3: Save a record in the index
        return null;
    }

    public CompletableFuture<BatchIndexingResponse> saveAll(List<ActorModel> actorModels) {
        // TODO Task 8: Save all records in the index
        return null;
    }

    public CompletableFuture<UpdateObjectResponse> update(ActorModel actorModel) {
        // TODO Task 5: Update a record in the index
        return null;
    }

    public CompletableFuture<DeleteResponse> delete(String id) {
        // TODO Task 6: Delete a record from the index by ID
        return null;
    }

    public CompletableFuture<Boolean> exists() {
        // TODO Task 7: Make sure that index exists
        return null;
    }

    public CompletableFuture<MultiResponse> replaceAll(List<ActorModel> actorModels) {
        // TODO Task 7: Replace all records in the index
        return null;
    }

    public CompletableFuture<DeleteResponse> deleteAll() {
        //TODO Task 9 Delete all the records from the index
        return null;
    }

    public CompletableFuture<ActorModel> getById(String id) {
        //TODO Task 10 Retrieve a record by id from the index
        return null;
    }

    public CompletableFuture<ActorModel> getById(String id, List<String> attributesToRetrieve) {
        //TODO Task 10 Retrieve only specified attributes from the record.
        // Try to pass `attributesToRetrieve` as a second parameter to the `getObjectAsync()` method.
        // Debug the Algolia's client code and figure out why `attributesToRetrieve` attribute is not applied.
        // Use RequestOptions to add an extra parameter `attributesToRetrieve` to the request instead.
        return null;
    }

    public CompletionStage<List<ActorModel>> getAllByIds(List<String> ids) {
        //TODO Task 11 Retrieve all records by ids from the index
        return null;
    }

    public CompletableFuture<List<ActorModel>> getAllByIds(List<String> ids, List<String> attributesToRetrieve) {
        //TODO Task 11 Retrieve only specified attributes from the records.
        // Try to use RequestOptions to add an extra parameter `attributesToRetrieve` to the request.
        // Debug the Algolia's client code and figure out why `attributesToRetrieve` attribute is not applied.
        // Pass `attributesToRetrieve` as a second parameter to the `getObjectsAsync()` method instead.
        return null;
    }
}

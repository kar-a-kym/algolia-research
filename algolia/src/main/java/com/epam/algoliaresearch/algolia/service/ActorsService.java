package com.epam.algoliaresearch.algolia.service;

import com.epam.algoliaresearch.algolia.model.ActorModel;
import com.epam.algoliaresearch.algolia.model.PartialActorModel;
import com.epam.algoliaresearch.algolia.repository.ActorsRepository;
import com.epam.algoliaresearch.algolia.dto.request.CreateActorRequest;
import com.epam.algoliaresearch.algolia.dto.request.UpdateActorRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ActorsService {

    private final ActorsRepository actorsRepository;

    public String create(CreateActorRequest createActorRequest) {
        log.debug("Adding an object to the index: {}", createActorRequest);
        //TODO Task 3: Map DTO object to index model and save it in the index
        return null;
    }

    public List<String> createAll(List<CreateActorRequest> createActorRequests) {
        log.debug("Adding new objects to the index: {}", createActorRequests);
        //d
        return null;//TODO Task 8: Create multiple objects in the index. Wait until all requests are finishe
    }

    public String update(UpdateActorRequest updateActorRequest, String id) {
        log.debug("Updating an object in the index: {}", updateActorRequest);
        //TODO Task 4: Map DTO object and ID to index model and save it in the index
        return null;
    }

    public String updatePartially(UpdateActorRequest updateActorRequest, String id) {
        log.debug("Partially updating an object in the index: id={}, updateRequest={}", id, updateActorRequest);
        //TODO Task 5: Map DTO object and ID to index model and save it in the index
        // Try to use ActorModel here and verify that all the attributes that were not specified in the request
        // are overridden to null values.
        // Use PartialActorModel here (it should ignore `null` values during serialization/deserialization)
        return null;
    }

    public void deleteById(String id) {
        log.debug("Deleting an object from the index by id={}", id);
        //TODO Task 6: Delete an object from index by ID. Wait for the response to finish
    }

    public void replaceAll(List<CreateActorRequest> createActorRequests) {
        //TODO Task 7 Ensure that index exists
        Boolean indexExists = null;
        if (BooleanUtils.isTrue(indexExists)) {
            log.debug("Replacing all objects in the index with: {}", createActorRequests);
            //TODO Task 7 replace all objects in the index with new ones
            //TODO Task 7 Wait until all the operations are finished
        } else {
            log.warn("Index `actors` does not exist. Cannot replace objects");
        }
    }

    public void deleteAll() {
        log.debug("Deleting all records from the index");
        //TODO Task 9 Delete all the records in the index
    }

    public ActorModel getById(String id) {
        log.debug("Retrieving a record from the index by id={}", id);
        //TODO Task 10 Retrieve a full record from the index by id
        return null;
    }

    public PartialActorModel getById(String id, List<String> attributesToRetrieve) {
        log.debug("Retrieving a record from the index by id={} with attributes={}", id, attributesToRetrieve);
        //TODO Task 10 Retrieve only specified attributes of the record from the index by its id
        return null;
    }

    public List<ActorModel> getAllByIds(List<String> ids) {
        log.debug("Retrieving all records from the index by ids={}", ids);
        //TODO Task 11 Retrieve full records from the index by ids
        return null;
    }

    public List<PartialActorModel> getAllByIds(List<String> ids, List<String> attributesToRetrieve) {
        log.debug("Retrieving all records from the index by ids={} with attributes={}", ids, attributesToRetrieve);
        //TODO Task 11 Retrieve only specified attributes of the records from the index
        return null;
    }
}

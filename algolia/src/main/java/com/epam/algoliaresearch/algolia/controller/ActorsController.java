package com.epam.algoliaresearch.algolia.controller;

import com.epam.algoliaresearch.algolia.model.ActorModel;
import com.epam.algoliaresearch.algolia.service.ActorsService;
import com.epam.algoliaresearch.algolia.dto.request.CreateActorRequest;
import com.epam.algoliaresearch.algolia.dto.request.UpdateActorRequest;
import com.epam.algoliaresearch.algolia.dto.response.ObjectIdResponse;
import com.epam.algoliaresearch.algolia.dto.response.RecordsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequestMapping(value = "/actors", produces = "application/json")
@RequiredArgsConstructor
public class ActorsController {

    private final ActorsService actorsService;

    @PostMapping
    public <T> ResponseEntity<T> create(
        @RequestBody @Valid CreateActorRequest actorRequest
    ) {
        //TODO Task 3 Create a record in the index
        // Return 201 Created in case of success
        return null;
    }

    @PostMapping("/all")
    public ResponseEntity<?> createOrReplaceAll(
        @RequestParam(defaultValue = "false") boolean replace,
        @RequestBody List<CreateActorRequest> createActorRequests
    ) {
        if (replace) {
            //TODO Task 7 Replace all records in the index
            // Return 204 No Content in case of success
            return null;
        } else {
            //TODO Task 8 Create all records in the index
            // Return 200 OK and ObjectIdListResponse model in case of success
            return null;
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ObjectIdResponse> update(
        @RequestBody @Valid UpdateActorRequest updateActorRequest,
        @PathVariable String id
    ) {
        //TODO Task 4 Update a record in the index
        // Return 200 OK and ObjectIdResponse model in case of success
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ObjectIdResponse> updatePartially(
        @RequestBody @Valid UpdateActorRequest updateActorRequest,
        @PathVariable String id
    ) {
        //TODO Task 5 Update a part of the record in the index
        // Return 200 OK and ObjectIdResponse model in case of success
        return null;
    }

    @DeleteMapping("/{id}")
    public <T> ResponseEntity<T> deleteById(
        @PathVariable String id
    ) {
        //TODO Task 6 Delete a record from the index by id
        // Return 204 No Content in case of success
        return null;
    }

    @DeleteMapping("/all")
    public <T> ResponseEntity<T> deleteAll() {
        //TODO Task 9 Delete all records from the index
        // Return 204 No Content response in case of success
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActorModel> getById(
        @PathVariable String id,
        @RequestParam(required = false) List<String> attributesToRetrieve
    ) {
        //TODO Task 10
        // Retrieve a record from the index by id
        // If `attributesToRetrieve` parameter is not passed, return a full ActorModel
        // If `attributesToRetrieve` parameter is passed, return PartialActorModel with only specified attributes
        return null;
    }

    @GetMapping(value = "/all", params = "ids")
    public ResponseEntity<RecordsResponse<?>> getAllByIds(
        @RequestParam List<String> ids,
        @RequestParam(required = false) List<String> attributesToRetrieve
    ) {
        //TODO Task 11
        // Retrieve all records from the index by ids
        // If `attributesToRetrieve` parameter is not passed, return full ActorModels
        // If `attributesToRetrieve` parameter is passed, return PartialActorModels with only specified attributes
        return null;
    }

}

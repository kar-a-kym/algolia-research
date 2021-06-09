package com.epam.algoliaresearch.algolia.mapper;

import com.epam.algoliaresearch.algolia.model.ActorModel;
import com.epam.algoliaresearch.algolia.dto.request.CreateActorRequest;
import com.epam.algoliaresearch.algolia.dto.request.UpdateActorRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ActorModelMapper {

    public static ActorModel map(CreateActorRequest createActorRequest) {
        return new ActorModel(
            createActorRequest.getName(),
            createActorRequest.getAlternativeName(),
            createActorRequest.getRating(),
            createActorRequest.getImagePath(),
            createActorRequest.getObjectID()
        );
    }

    public static List<ActorModel> map(List<CreateActorRequest> createActorRequests) {
        return createActorRequests.stream()
            .map(ActorModelMapper::map)
            .collect(Collectors.toList());
    }

    public static ActorModel map(UpdateActorRequest updateActorRequest, String objectId) {
        return new ActorModel(
            updateActorRequest.getName(),
            updateActorRequest.getAlternativeName(),
            updateActorRequest.getRating(),
            updateActorRequest.getImagePath(),
            objectId
        );
    }

}

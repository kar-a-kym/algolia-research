package com.epam.algoliaresearch.algolia.mapper;

import com.epam.algoliaresearch.algolia.model.ActorModel;
import com.epam.algoliaresearch.algolia.model.PartialActorModel;
import com.epam.algoliaresearch.algolia.dto.request.UpdateActorRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PartialActorModelMapper {

    public static PartialActorModel map(UpdateActorRequest updateActorRequest, String objectId) {
        return new PartialActorModel(
            updateActorRequest.getName(),
            updateActorRequest.getAlternativeName(),
            updateActorRequest.getRating(),
            updateActorRequest.getImagePath(),
            objectId
        );
    }

    public static PartialActorModel map(ActorModel actorModel) {
        return new PartialActorModel(
            actorModel.getName(),
            actorModel.getAlternativeName(),
            actorModel.getRating(),
            actorModel.getImagePath(),
            actorModel.getObjectID()
        );
    }

    public static List<PartialActorModel> map(List<ActorModel> actorModels) {
        return actorModels.stream()
            .map(PartialActorModelMapper::map)
            .collect(Collectors.toList());
    }
}

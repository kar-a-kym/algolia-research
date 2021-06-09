package com.epam.algoliaresearch.algolia.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
//TODO Task 5 Implement this model so that it ignores `null` properties during serialization/deserialization
public class PartialActorModel extends ActorModel {

    public PartialActorModel(String name, String alternativeName, Long rating, String imagePath, String objectID) {
        super(name, alternativeName, rating, imagePath, objectID);
    }

}

package com.epam.algoliaresearch.algolia.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorModel {

    private String name;

    @JsonSetter("alternative_name")
    private String alternativeName;

    private Long rating;

    @JsonSetter("image_path")
    private String imagePath;

    private String objectID;

}

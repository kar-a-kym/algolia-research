package com.epam.algoliaresearch.algolia.dto.request;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateActorRequest {

    private String name;

    @JsonSetter("alternative_name")
    private String alternativeName;

    private long rating;

    @JsonSetter("image_path")
    private String imagePath;

}

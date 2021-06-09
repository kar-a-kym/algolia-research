package com.epam.algoliaresearch.algolia.dto.request;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateActorRequest {

    @NotBlank
    private String name;

    @JsonSetter("alternative_name")
    private String alternativeName;

    private Long rating;

    @JsonSetter("image_path")
    private String imagePath;

    @NotBlank
    private String objectID;

}

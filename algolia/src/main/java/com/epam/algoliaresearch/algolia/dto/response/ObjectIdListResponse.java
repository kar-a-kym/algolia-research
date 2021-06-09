package com.epam.algoliaresearch.algolia.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObjectIdListResponse {

    private List<ObjectIdResponse> records;

}

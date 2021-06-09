#### 1. Configuration

**Task 1**  
Create an Algolia application and add all required dependencies for Algolia's Java client 
- [ ] Create an account on https://www.algolia.com/  
- [ ] Create an Algolia application (use any name).
- [ ] Find the application ID and admin API key and configure `ALGOLIA_APPLICATION_ID` and `ALGOLIA_ADMIN_API_KEY` environment variables on your local environment.   
      Instead of creating environment variables you may override `algolia.applicationId` and `algolia.adminApiKey` application properties in `algolia-research/config/application.properties` file. 
- [ ] Find the Postman collection and environment in `/postman` folder and import them into your Postman client.
      Put appropriate values for `application-id`, `admin-api-key` and `search-api-key` parameters in `algolia-dev` Postman environment.
- [ ] Read the documentation: [install-java-client](https://www.algolia.com/doc/api-client/getting-started/install/java/?client=java)  
- [ ] Implement all TODOs with `Task 1` label.

**Task 2**  
Configure Algolia's search client.  
Read and write timeout should be 1 second.  
Connection timeout should be 2 seconds.  
Configure a batch size for the client to be 500 items.  
Configure a header `X-Algolia-User` to be added to each request to Algolia with `algolia-research-app` value.  
- [ ] Read the documentation: [instantiate-client-index](https://www.algolia.com/doc/api-client/getting-started/instantiate-client-index)  
- [ ] Implement all TODOs with `Task 2` label.


#### 2. Indexing
**Task 3**

Create an index with name `actors`.  
Create an endpoint to save the following object in the index:
```
  {
    "name": "Catherine Missal",
    "rating": 4875,
    "image_path": "/g3fsRgEoMxaqPayIMtGDWERqJ6A.jpg",
    "alternative_name": null,
    "objectID": "551486300"
  }
```
- [ ] Read the documentation: [add-objects](https://www.algolia.com/doc/api-reference/api-methods/add-objects/) 
- [ ] Implement all TODOs with `Task 3` label
- [ ] Use created endpoint and verify the index is successfully created in your Algolia app and contains the record

**Task 4**

Update the existing record in the index. 
- [ ] Read the documentation: [save-objects](https://www.algolia.com/doc/api-reference/api-methods/save-objects/)
- [ ] Implement all TODOs with `Task 4` label 
      to update the object with ID `551486300` in the index with the following data: 
```
  {
    "name": "Catherine Missal",
    "rating": 4900,
    "image_path": "/g3fsRgEoMxaqPayIMtGDWERqJ6A.jpg",
    "alternative_name": "Catherine"
  }
```
- [ ] Verify the record was updated in the index

**Task 5**

Create an endpoint to update only a part of the existing record in the index. 
- [ ] Read the documentation: [partial-update-objects](https://www.algolia.com/doc/api-reference/api-methods/partial-update-objects/)
- [ ] Implement all TODOs with `Task 5` label 
      to update the `alternative_name` attribute of the record with ID `551486300`: 
```
  {
    "alternative_name": "Catherine"
  }
```
- [ ] Verify the record was updated in the index

**Task 6**

Delete an existing record from the index by its objectID. 
- [ ] Read the documentation: [delete-objects](https://www.algolia.com/doc/api-reference/api-methods/delete-objects/)
- [ ] Implement all TODOs with `Task 6` label to delete the object from the index by its id
- [ ] Verify the record was deleted from the index

**Task 7**  
Replace all records with new ones in the `actors` index
- [ ] Read the documentation: [replace-all-objects](https://www.algolia.com/doc/api-reference/api-methods/replace-all-objects/)  
- [ ] Implement all TODOs with `Task 7` label
- [ ] Take a few records from `algolia-research\algolia\dataset\actors.json` dataset to test your implementation and 
      verify the result in your Algolia app
      
**Task 8**  
Create multiple records in the index
- [ ] Implement all TODOs with `Task 8` label to add multiple records to the index in one call
- [ ] Take a few records from `algolia-research\algolia\dataset\actors.json` dataset to test your implementation and 
      verify the result in your Algolia app
    
**Task 9**  
Clear `actors` index
- [ ] Read the documentation: [clear-objects](https://www.algolia.com/doc/api-reference/api-methods/clear-objects/)  
- [ ] Implement all TODOs with `Task 9` label
- [ ] Test your implementation and verify the result in your Algolia app

**Task 10**  
Retrieve one record from the index by its id.  
Use `attributesToRetrieve` parameter to specify the list of attributes to return in the response
- [ ] Read the documentation: [get-objects](https://www.algolia.com/doc/api-reference/api-methods/get-objects//)  
- [ ] Implement all TODOs with `Task 10` label
- [ ] Test your implementation. 
  Verify that depending on the value of `attributesToRetrieve` parameter your endpoint can return the record 
  * with all the attributes
  * with only one attribute
  * with a subset of attributes 


**Task 11**  
Retrieve multiple records from the index by their ids.  
Use `attributesToRetrieve` parameter to specify the list of attributes to return in the response
- [ ] Read the documentation: [get-objects](https://www.algolia.com/doc/api-reference/api-methods/get-objects//)  
- [ ] Implement all TODOs with `Task 11` label
- [ ] Test your implementation. 
  Verify that depending on the value of `attributesToRetrieve` parameter your endpoint can return the records 
  * with all the attributes
  * with only one attribute
  * with a subset of attributes 


#### 2. Data load

**Task 12**  
Create an endpoint to load all the data from the `algolia-research/algolia/dataset/actors.json` file into `actors` index.
- [ ] Implement all TODOs with `Task 12` label
- [ ] Test your implementation and verify the result in your Algolia app

**Task 13**  
Create a new index for storing movies records in Algolia.  
Find the `algolia-research/algolia/dataset/movies.json` file.   
Analyze the data in the file and create the appropriate model for `movie` record.  
Implement the mapper to transform the records from the file to the records stored in the index.
- [ ] Implement all TODOs with `Task 13` label

**Task 14**  
Create an endpoint to load all the data from the `algolia-research/algolia/dataset/movies.json` file into `movies` index.  
To make it easier to test your implementation implement an endpoint to delete all the records from `movies` index in one call.
- [ ] Implement all TODOs with `Task 14` label
- [ ] Test your implementation and verify the result in your Algolia app

#### 3. Index settings

**Task 15**  
Get familiar with various configuration options for Algolia indices.  
Create an endpoint to review index settings.
- [ ] Read the documentation: [settings](https://www.algolia.com/doc/api-client/methods/settings/)
- [ ] Read the documentation: [settings-api-parameters](https://www.algolia.com/doc/api-reference/settings-api-parameters/)
- [ ] Read the documentation: [get-settings](https://www.algolia.com/doc/api-reference/api-methods/get-settings/)  
- [ ] Implement all TODOs with `Task 15` label.
- [ ] Test your implementation.

**Task 16**  
Create an endpoint to configure indices settings.  
The endpoint should accept new settings in JSON format and return updated settings in response.
- [ ] Read the documentation: [set-settings](https://www.algolia.com/doc/api-reference/api-methods/set-settings/)  
- [ ] Implement all TODOs with `Task 16` label.
- [ ] Find `Algolia School/algolia/Search/Search Actors` endpoint in the Postman collection. You will need it to test index configuration changes. 

**Task 17**  
Configure the list of attributes to return for search queries.
- [ ] Read the documentation: [attributes-to-retrieve](https://www.algolia.com/doc/api-reference/api-parameters/attributesToRetrieve/)  
- [ ] Read the documentation: [unretrievable-attributes](https://www.algolia.com/doc/api-reference/api-parameters/unretrievableAttributes/)  
- [ ] Configure `actors` index:  
  * to return all the attributes except `alternative_name` for each search query
  * to never return `image_path` attribute
- [ ] Verify the index settings were updated in your Algolia's indices configuration dashboard
- [ ] Use `Search Actors` endpoint from the Postman collection to search for the actors with any query. 
      What attributes do you see in the result?
- [ ] Try to override index settings and specify `attributesToRetrieve=alternative_name,image_path` parameter in your search request. 
      What attributes do you see now?
- [ ] Read about [api-parameters-scope](https://www.algolia.com/doc/api-reference/api-parameters/#scope)
- [ ] Configure `actors` index back to retrieve all the attributes for each search query
  
**Task 18**
- [ ] Read about [ranking](https://www.algolia.com/doc/api-reference/api-parameters/ranking/) and 
      [custom-ranking](https://www.algolia.com/doc/api-reference/api-parameters/customRanking/) settings parameters 
- [ ] Configure `actors` index:  
  * to return actors sorted by `name` attribute in ascending order
  * to return actors sorted by `rating` attribute in descending order  
- [ ] Test different configuration options using `Search Actors` endpoint from the Postman collection
      

**Task 19**
- [ ] Read about [pagination](https://www.algolia.com/doc/guides/building-search-ui/ui-and-ux-patterns/pagination/js/)
- [ ] Configure `actors` index to return 5 hits per one page and limit the number of hits that can be retrieved via a query to 100.
- [ ] Test different configuration options using `Search Actors` endpoint from the Postman collection. 
      Try to specify the `offset` and `length` parameters in your search query to see the difference.


**Task 20**
- [ ] Read the documentation: [searchable-attributes](https://www.algolia.com/doc/api-reference/api-parameters/searchableAttributes/) 
- [ ] Configure `actors` index to use only `name` and `alternative_name` to find the relevant results for search queries.
- [ ] Test the configuration using `Search Actors` endpoint from the Postman collection


- [ ] Read the documentation: [query-type](https://www.algolia.com/doc/api-reference/api-parameters/queryType/) 
- [ ] Configure `actors` index to use different types of prefix.
- [ ] Test the configuration using `Search Actors` endpoint from the Postman collection
- [ ] Change this configuration back to default


- [ ] Read the documentation: [disable-prefix](https://www.algolia.com/doc/api-reference/api-parameters/disablePrefixOnAttributes/) 
- [ ] Disable the prefix for `name` attribute, try to search.
- [ ] Test the configuration using `Search Actors` endpoint from the Postman collection. What prefix was applied to this attribute?
- [ ] Change this configuration back to default

#### 4. Filtered search and facets

**Task 21**  
Filtered search.  
Create filtered search endpoint that can be used to search movies with a particular actor in them.  
This search can be used to display list of movies on an actor's page or implement a search on this page. 
- [ ] Read about restricting searchable attributes: [Search API Parameters](https://www.algolia.com/doc/api-reference/search-api-parameters/)
- [ ] Create search endpoint with a movie title query (should be used to search in the `title` and `alternative_titles` fields)
- [ ] Read about filtered search in Algolia: [filters-documentation](https://www.algolia.com/doc/api-reference/api-parameters/filters/)
- [ ] Add `actors` attribute to faceting attributes of `movies` index, so it can be used for filtering
- [ ] Extend search endpoint with option for filtering by the list of actors
- [ ] Search should include movies for each actor, not just movies with all actors on the list
- [ ] Check your search 
  * without list
  * with one actor 
  * with multiple actors on the list

**Task 22**  
Facets in search results.  
Use `Set Index Settings` endpoint from `Task 16` to configure faceting and filtering in `movies` index.  
We should be able to show user any and all attributes from pre-defined list.
- [ ] Read about facets in Algolia: [faceting-documentation](https://www.algolia.com/doc/guides/managing-results/refine-results/faceting/)
- [ ] Add `genre,rating,year,actor_facets` attributes to facet settings
- [ ] Modify search endpoint to accept attributes we want to use as facets. If none are specified all facets should be returned.
- [ ] Add facets output to the response: list of all facet values with a number of results for each
- [ ] Validate search by using incomplete movie title, such as "Guardians".

**Task 23**  
Facet filtering. 
- [ ] Perform items from `Task 19` for each of the facet attributes, so search customer and reduce resulting list by choosing one or multiple attributes.

**Task 24**  
Search for facet values.  
Add endpoint for searching of actors facet, so user can search within facet hits of search result.  
Endpoint has to accept title query and filters just like it does for filtered search, so facet search is relevant to user's search.
- [ ] Read the documentation: [search-for-facet-values](https://www.algolia.com/doc/api-reference/api-methods/search-for-facet-values/)
- [ ] Create new endpoint in Controller and implement `TODOs` relevant to this task
- [ ] Validate search with:
  * search phrase
  * filters 
  * without them 
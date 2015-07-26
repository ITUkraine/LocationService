
package com.itukraine.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.itukraine.model.Location;

@RepositoryRestResource(collectionResourceRel = "locations", path = "locations")
public interface LocationRepository extends MongoRepository<Location, String>, LocationRepositoryCustom {

}

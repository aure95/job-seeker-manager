package com.applicationapi.repositories;

import com.applicationapi.domains.Application;

import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.repository.PagingAndSortingRepository;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "application", path = "application")
public interface ApplicationRepository extends MongoRepository<Application, Long> {

}

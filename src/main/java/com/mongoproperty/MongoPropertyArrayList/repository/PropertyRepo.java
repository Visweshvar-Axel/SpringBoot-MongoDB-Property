package com.mongoproperty.MongoPropertyArrayList.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongoproperty.MongoPropertyArrayList.doc.Property;

@Repository
public interface PropertyRepo extends MongoRepository<Property, Long> {

}

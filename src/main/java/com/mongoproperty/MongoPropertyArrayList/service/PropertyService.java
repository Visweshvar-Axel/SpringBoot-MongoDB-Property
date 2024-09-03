package com.mongoproperty.MongoPropertyArrayList.service;

import java.util.List;

import com.mongoproperty.MongoPropertyArrayList.doc.Property;

public interface PropertyService {

    List<Property> getAll();

    Property addProperty(Property property);

}
package com.mongoproperty.MongoPropertyArrayList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongoproperty.MongoPropertyArrayList.doc.Property;
import com.mongoproperty.MongoPropertyArrayList.repository.PropertyRepo;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepo propertyRepo;

    @Override
    public List<Property> getAll() {
        return propertyRepo.findAll();
    }

    @Override
    public Property addProperty(Property property) {
        return propertyRepo.insert(property);
    }
}

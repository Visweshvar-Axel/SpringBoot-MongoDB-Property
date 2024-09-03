package com.mongoproperty.MongoPropertyArrayList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongoproperty.MongoPropertyArrayList.doc.Property;
import com.mongoproperty.MongoPropertyArrayList.service.PropertyService;

@RestController
@RequestMapping("/properties")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @PostMapping
    public Property addProperty(@RequestBody Property property) {
        return propertyService.addProperty(property);
    }

    @GetMapping("dummy")
    public ResponseEntity dmmy() {
        return new ResponseEntity<>("yeah dude...!", HttpStatus.OK);
    }

    @GetMapping
    public List<Property> getAll() {
        return propertyService.getAll();
    }
}

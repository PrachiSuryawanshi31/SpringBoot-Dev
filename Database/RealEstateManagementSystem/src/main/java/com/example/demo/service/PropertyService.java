package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Property;

public interface PropertyService {
	
	void addProperty(Property property);
	
	void updateProperty(Property property);
	
	List<Property> getAllProperty(Property property);
	
	Property getProperty(int propertyId);
	
	void deleteAllProperties();
	
	void deleteProperty(int propertyId);
}

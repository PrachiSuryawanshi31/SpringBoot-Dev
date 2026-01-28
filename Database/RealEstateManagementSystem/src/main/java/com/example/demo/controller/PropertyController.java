package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Property;
import com.example.demo.service.PropertyService;

@RestController
@RequestMapping("property")
public class PropertyController {
	
	@Autowired
	PropertyService propertyService;

	@PostMapping("add")
	public String addProperty(@RequestBody Property property)
	{
		propertyService.addProperty(property);
		return MessageConstant.PROPERTY_ADD;
	}
	
	@PutMapping("update")
	public Property updateProperty(@RequestBody Property property)
	{
		propertyService.updateProperty(property);
		return null;
	}
	
	@GetMapping("get")
	public List<Property> getAllProperties(@RequestBody Property property)
	{
		return propertyService.getAllProperty(property);
		
	}
	
	@GetMapping("get/{propertyId}")
	public Property getProperty(@PathVariable int propertyId)
	{
		return propertyService.getProperty(propertyId);
	}
	
	@DeleteMapping("delete")
	public String deleteAllProperties()
	{
		propertyService.deleteAllProperties();
		return MessageConstant.PROPERTY_ALL_DELETED;
		
	}
	
	@DeleteMapping("delete/{propertyId}")
	public String deleteProperties(@PathVariable int propertyId)
	{
		propertyService.deleteProperty(propertyId);
		return MessageConstant.PROPERTY_DELETED;
		
	}
	
}

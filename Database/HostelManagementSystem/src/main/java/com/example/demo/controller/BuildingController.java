package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Building;
import com.example.demo.service.BuildingService;

@RestController
@RequestMapping("building")
public class BuildingController {
	
	@Autowired
	BuildingService buildingService;
	
	
	@PostMapping("add")
	public String addBuilding(@RequestBody Building building)
	{
		buildingService.saveBuilding(building);
		return MessageConstants.ADD_BUILDING;
		
	}
	@GetMapping("get/{id}")
	public Building getBuilding(@PathVariable int id)
	{
		return buildingService.getBuilding(id);
		
	}
	
	@GetMapping("getAll")
	public List<Building> getAllBuilding(@RequestBody Building building)
	{
		return buildingService.getAllBuilding(building);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteBuilding(@PathVariable int id)
	{
		buildingService.deleteBuilding(id);
		return MessageConstants.DELETE_BUILDING ;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllBuilding(@RequestBody Building building)
	{
		buildingService.deleteAllBuilding(building);
		return MessageConstants.DELETE_ALL_BUILDING;
		
	}

}

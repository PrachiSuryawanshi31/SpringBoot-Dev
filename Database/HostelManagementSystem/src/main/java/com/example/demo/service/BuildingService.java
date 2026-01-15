package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Building;

public interface BuildingService {
	
	void  saveBuilding(Building building);
	
	Building getBuilding(int id);
	
	List<Building> getAllBuilding(Building building);
	
	 void deleteBuilding(int id);
	 
	 List<Building> deleteAllBuilding(Building building);
	
	
	
}

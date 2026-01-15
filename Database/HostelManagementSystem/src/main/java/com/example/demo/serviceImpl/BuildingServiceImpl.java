package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Building;
import com.example.demo.repository.BuildingRepostiory;
import com.example.demo.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {

	@Autowired
	BuildingRepostiory buildingRepostiory;
	
	@Override
	public void saveBuilding(Building building) {
		// TODO Auto-generated method stub
		buildingRepostiory.save(building);
		
	}

	@Override
	public Building getBuilding(int id) {
		// TODO Auto-generated method stub
		return buildingRepostiory.findById(id).get();
	}

	@Override
	public List<Building> getAllBuilding(Building building) {
		// TODO Auto-generated method stub
		return buildingRepostiory.findAll();
	}

	@Override
	public void deleteBuilding(int id) {
		// TODO Auto-generated method stub
		buildingRepostiory.deleteById(id);
		
	}

	@Override
	public List<Building> deleteAllBuilding(Building building) {
		return null;
		// TODO Auto-generated method stub
		//return buildingRepostiory.delete(building);
	}

}

package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Floor;

public interface FloorService {

	void saveFloor(Floor floor);
	
	Floor getFloor(int id);
	
	List<Floor> getAllFloor(Floor floor);
	
	void deleteFloor(int id);
	
	String deleteAllFloor(Floor floor);
}

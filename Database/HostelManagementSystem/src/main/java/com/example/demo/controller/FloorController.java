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
import com.example.demo.entity.Floor;
import com.example.demo.service.FloorService;

@RestController
@RequestMapping("floor")
public class FloorController {
	
	@Autowired
	FloorService floorService;
	
	@PostMapping("add")
	public String addFloor(@RequestBody Floor floor)
	{
		floorService.saveFloor(floor);
		return MessageConstants.ADD_FLOOR;
		
	}
	
	@GetMapping("get/{id}")
	public Floor getFloor(@PathVariable int id)
	{
		return floorService.getFloor(id);
	 	
	}
	
	@GetMapping("getAll")
	public List<Floor> getAllFloor(@RequestBody Floor floor)
	{
		return floorService.getAllFloor(floor);
		
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteFloor(@PathVariable int id)
	{
		floorService.deleteFloor(id);
		return MessageConstants.DELETE_FlOOR;
		 
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllFloor(@RequestBody Floor floor)
	{
		floorService.deleteAllFloor(floor);
		return MessageConstants.DELETE_ALL_FLOOR;
		
	}

}

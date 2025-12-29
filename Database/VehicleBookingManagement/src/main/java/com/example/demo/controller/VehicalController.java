package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;

@RestController
@RequestMapping("vehicle")
public class VehicalController {
	
	@Autowired
	VehicleService vehicleService;
	
	@PostMapping("add")
	public String addVehicle(Vehicle vehicle)
	{
		vehicleService.addBooking(vehicle);
		
		return "Vehical added in Database";
		
	}

	@DeleteMapping("{id}")
	public String deleteVehicle(@PathVariable int id)
	{ 
		vehicleService.deleteBooking(id);
		
		return "Vehical delete in from the database";
		
	}
	
	@GetMapping("{id}")
	public Vehicle getVehicle(@PathVariable int id)
	{
		return  vehicleService.getBooking(id);
		
		
	}
}

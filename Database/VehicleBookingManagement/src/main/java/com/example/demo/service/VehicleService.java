package com.example.demo.service;

import com.example.demo.entity.Vehicle;

public interface VehicleService {
	
	void addBooking(Vehicle vehicle);

	 Vehicle getBooking(int id);

	void deleteBooking(int id);

}

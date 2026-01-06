package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Staff;

public interface StaffService {
	
	void saveStaff(Staff staff);
	
	void deleteStaff(int id);
	
	Staff getStaff(int id);
	
    List<Staff> getAllStaff();
}

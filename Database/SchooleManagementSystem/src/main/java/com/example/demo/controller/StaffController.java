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
import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;

@RestController
@RequestMapping("staff")
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	@PostMapping
	public String addStaff(@RequestBody Staff staff)
	{
		staffService.saveStaff(staff);
		return MessageConstants.STAFF_ADDED_IN_DS ;
		
	}
	
	@DeleteMapping
	public String deleteStaff(@PathVariable int id)
	{
		staffService.deleteStaff(id);
		return MessageConstants.STAFF_DELETED_FROM_DB;
		
	}
	
	@GetMapping
	public Staff getStaff(@PathVariable int id)
	{
		return	staffService.getStaff(id);
		
		
	}
	
	public List<Staff> getAllStaff()
	{
		return  staffService.getAllStaff();
		
		
	}
}

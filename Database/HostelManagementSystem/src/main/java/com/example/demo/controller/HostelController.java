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

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Hostel;
import com.example.demo.service.HostelService;

@RestController
@RequestMapping("hostel")
public class HostelController {
	
	@Autowired
	HostelService hostelService;

	@PostMapping("add")
	public String addHostel(@RequestBody Hostel hostel)
	{
		hostelService.saveHostel(hostel);
		return MessageConstants.ADD_HOSTEL;
		
	}
	
	@GetMapping("get/{id}")
	public Hostel getHostel(@PathVariable int id)
	{
		
		return	hostelService.getHostel(id);
	}
	
	@PutMapping("update")
	public Hostel updateHostel(@RequestBody Hostel hostel)
	{
		return hostelService.updateHostel(hostel);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteHostel(@PathVariable int id)
	{
		hostelService.deleteHostel(id);
		return MessageConstants.DELETE_HOSTEL;
	}
	
	@GetMapping("getAll")
	public List<Hostel> getHostel(@RequestBody Hostel hostel)
	{
		
		return hostelService.getHostel(hostel);
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllHostel(@RequestBody Hostel hostel)
	{
		return hostelService.deleteAllHostel(hostel);
		 
	}
	
	
	
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hostel;
import com.example.demo.service.HostelService;

@RestController
@RequestMapping("hostel")
public class HostelController {
	
	@Autowired
	HostelService hostelService;
	
	@PostMapping("add")
	public String addHostel(Hostel hostel)
	{
		hostelService.addHostelStudent(hostel);
		return "Hostel is add in the database";
		
	}

	@DeleteMapping("{type}")
	public String deleteHostel(@PathVariable int id)
	{
		hostelService.deleteHostelStudent(id);
		return "Hostel is delete from the database";
		
	}
	
	@GetMapping("{type}")
	public Hostel getHostel(@PathVariable int id)
	{
		return hostelService.getHostelStudent(id);
		
	}
}

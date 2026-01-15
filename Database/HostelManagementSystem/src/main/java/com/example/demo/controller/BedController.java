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
import com.example.demo.entity.Bed;
import com.example.demo.service.BedService;

@RestController
@RequestMapping("bed")
public class BedController {

	
	@Autowired
	BedService bedService;
	
	
	@PostMapping("add")
	public String addBed(@RequestBody Bed bed)
	{
		bedService.saveBed(bed);
		return MessageConstants.ADD_BED;
	}
	
	
	@GetMapping("get/{id}")
	Bed getBed(@PathVariable int id)
	{
		return bedService.getBed(id);
	}
	
	
	@GetMapping("getAll")
	List<Bed> getAllBeds(@RequestBody Bed bed)
	{
		return bedService.getAll(bed);
	}
	
	
	@DeleteMapping("delete/{id}")
	String deleteBed(@PathVariable int id)
	{
		bedService.deleteBed(id);
		return MessageConstants.DELETE_BED;
	}
	
	
	@DeleteMapping("deleteAll")
	String deleteAllBeds(@RequestBody Bed bed)
	{
		bedService.deleteAll(bed);
		return MessageConstants.DELETE_ALL_BED;
	}
	
}
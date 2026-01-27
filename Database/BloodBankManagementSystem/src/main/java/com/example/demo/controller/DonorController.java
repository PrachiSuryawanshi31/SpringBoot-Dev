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

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Donor;
import com.example.demo.service.DonorService;

@RestController
@RequestMapping("donor")
public class DonorController {
	
	@Autowired
	DonorService donorService;
	
	@PostMapping("add")
	public String addDonor(@RequestBody Donor donor)
	{
		donorService.addDonor(donor);
		return MessageConstant.DONOR_ADDED;
		
	}
	
	@PutMapping("update")
	public Donor updateDonor(@RequestBody Donor donor)
	{
		return donorService.updateAllDonor(donor);
		
	}
	
	@GetMapping("getAll")
	public List<Donor> getAllDonor()
	{
		return donorService.getAllDonors(null);
		
	}
	
	@GetMapping("get/{donorId}")
	public Donor getDonor(@PathVariable int donorId)
	{
		return donorService.getDonor(donorId);
		
	}
	
	@DeleteMapping("delete")
	public String deleteAllDonor(@RequestBody Donor donor)
	{
		donorService.deleteAllDonors();
		return MessageConstant.ALL_DONOR_DELETE;
	}
	
	@DeleteMapping("delete/{donorId}")
	public String delteDonor(@PathVariable int donorId)
	{
		donorService.deleteDonor(donorId);
		return MessageConstant.DONOR_DELETE;
	}
	
	
}

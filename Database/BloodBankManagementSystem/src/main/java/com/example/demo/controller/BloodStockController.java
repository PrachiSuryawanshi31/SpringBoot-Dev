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
import com.example.demo.entity.BloodStock;
import com.example.demo.service.BloodStockService;

@RestController
@RequestMapping("blood")
public class BloodStockController {
	
	@Autowired
	BloodStockService bloodStockService;
	
	@PostMapping("/add")
	public String saveBloodStock(@RequestBody BloodStock bloodStock)
	{
		bloodStockService.addBloodStock(bloodStock);
		return MessageConstant.BLOOD_STOCK_ADDED;
		
	}
	
	@PutMapping("/update")
	public void updateBloodStock(@RequestBody BloodStock bloodStock)
	{
		bloodStockService.updateBloodStock(bloodStock);
	}
	
	@GetMapping("/get")
	public List<BloodStock> getAllBloodStocks()
	{
		return bloodStockService.getAllBloodStocks();
		
	}
	
	@GetMapping("/get/{bloodStockId}")
	public BloodStock getBloodStock(@PathVariable int bloodStockId)
	{
		return bloodStockService.getBloodStock(bloodStockId);	
	}
	
	@DeleteMapping("/delete")
	public String deleteAllBloodStock()
	{
		 bloodStockService.deleteAllBloodStock();
		 return MessageConstant.ALL_BLOOD_STOCK_DELETE;
	}
	
	@DeleteMapping("/delete/{bloodStockId}")
	public String deleteBloodStock(@PathVariable int bloodStockId)
	{
		 bloodStockService.deleteBloodStock(bloodStockId);
		 return MessageConstant.BLOOD_STOCK_DELETE;
		
	}
	
}

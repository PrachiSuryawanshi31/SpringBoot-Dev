package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.BloodStock;

public interface BloodStockService {
	
	String addBloodStock(BloodStock bloodStock);
	
	void updateBloodStock(BloodStock bloodStock);
	
	List<BloodStock> getAllBloodStocks();
	
	BloodStock getBloodStock(int bloodStockId);
	
	String deleteBloodStock(int bloodStock);
	
	String deleteAllBloodStock();
}

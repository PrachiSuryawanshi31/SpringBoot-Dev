package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.BloodStock;
import com.example.demo.repository.BloodStockRepository;
import com.example.demo.service.BloodStockService;

@Service
public class BloodStockServiceImpl implements BloodStockService {

	@Autowired
	BloodStockRepository bloodStockRepository;
	
	@Override
	public String addBloodStock(@RequestBody BloodStock bloodStock) {
		// TODO Auto-generated method stub
		bloodStockRepository.save(bloodStock);
		return null;
	}

	@Override
	public void updateBloodStock(@RequestBody BloodStock bloodStock) {
		// TODO Auto-generated method stub
		bloodStockRepository.save(bloodStock);
		
	}

	@Override
	public List<BloodStock> getAllBloodStocks() {
		// TODO Auto-generated method stub
		return bloodStockRepository.findAll();
	}

	@Override
	public BloodStock getBloodStock(int bloodStockId) {
		// TODO Auto-generated method stub
		return bloodStockRepository.findById(bloodStockId).get();
	}

	@Override
	public String deleteBloodStock(int bloodStockId) {
		// TODO Auto-generated method stub
		bloodStockRepository.deleteById(bloodStockId);
		return null;
	}

	@Override
	public String deleteAllBloodStock() {
		// TODO Auto-generated method stub
		bloodStockRepository.deleteAll();
		return null;
	}

}

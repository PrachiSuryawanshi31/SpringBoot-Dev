package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Floor;
import com.example.demo.repository.FloorRepository;
import com.example.demo.service.FloorService;

@Service
public class FloorServiceImpl implements FloorService {
	
	@Autowired
	FloorRepository floorRepository;

	@Override
	public void saveFloor(Floor floor) {
		// TODO Auto-generated method stub
		floorRepository.save(floor);
		
	}

	@Override
	public Floor getFloor(int id) {
		// TODO Auto-generated method stub
		return floorRepository.findById(id).get();
		  
	}

	@Override
	public List<Floor> getAllFloor(Floor floor) {
		// TODO Auto-generated method stub
		return floorRepository.findAll();
	}

	@Override
	public void deleteFloor(int id) {
		// TODO Auto-generated method stub
		
		 floorRepository.deleteById(id);
	}

	@Override
	public String deleteAllFloor(Floor floor) {
		// TODO Auto-generated method stub
		floorRepository.deleteAll();
		return null;
	}

}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hostel;
import com.example.demo.repository.HostelRepository;

@Service
public class HotelServiceImpl  implements HostelService{
	
	@Autowired
	HostelRepository hostelRepository;

	@Override
	public void addHostelStudent(Hostel hostel) {
		// TODO Auto-generated method stub
		hostelRepository.save(hostel);
		
	}

	@Override
	public void deleteHostelStudent(int id) {
		// TODO Auto-generated method stub
		hostelRepository.deleteById(id);
		
	}

	@Override
	public Hostel getHostelStudent(int id) {
		// TODO Auto-generated method stub
		return hostelRepository.findById(id).get();
	}

}

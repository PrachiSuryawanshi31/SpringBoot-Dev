package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Hostel;
import com.example.demo.repository.HostelRepostiory;
import com.example.demo.service.HostelService;

@Service
public class HostelserviceImpl implements HostelService{

	@Autowired
	HostelRepostiory hostelRepostiory;
	
	@Override
	public void saveHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		hostelRepostiory.save(hostel);
		
	}

	@Override
	public Hostel getHostel(int id) {
		// TODO Auto-generated method stub
		
		return 	hostelRepostiory.findById(id).get();
		
	}

	@Override
	public Hostel updateHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		
		return 	hostelRepostiory.save(hostel);
	}

	@Override
	public void deleteHostel(int id) {
		// TODO Auto-generated method stub
		
		hostelRepostiory.deleteById(id);
		
	}

	@Override
	public List<Hostel> getHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		return hostelRepostiory.findAll();
	}

	@Override
	public String deleteAllHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		hostelRepostiory.delete(hostel);
		return MessageConstants.DELETE_ALL_HOSTEL;
		 
	}

}

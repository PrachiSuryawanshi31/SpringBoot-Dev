package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Staff;
import com.example.demo.repository.StaffRepository;
import com.example.demo.service.StaffService;


@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	StaffRepository staffRepository;
	
	@Override
	public void saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffRepository.save(staff);
		
	}

	@Override
	public void deleteStaff(int id) {
		// TODO Auto-generated method stub
		staffRepository.deleteById(id);
		
	}

	@Override
	public Staff getStaff(int id) {
		// TODO Auto-generated method stub
		return staffRepository.findById(id).get();
	}

	@Override
	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		return staffRepository.findAll();
	}

}

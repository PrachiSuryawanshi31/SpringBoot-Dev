package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CollegeAdmission;
import com.example.demo.repository.CollegeAdmissionRepository;



@Service
public class CollegeAdmissionServiceImpl implements CollegeAdmissionService {

    @Autowired
    CollegeAdmissionRepository collegeAdmissionRepository;

    @Override
    public void addAdmission(CollegeAdmission admission) {
    	// TODO Auto-generated method stub
        collegeAdmissionRepository.save(admission);
    }


    @Override
    public void deleteAdmission(int id) {
    	// TODO Auto-generated method stub
        collegeAdmissionRepository.deleteById(id);
    }
    
    @Override
    public CollegeAdmission getAdmission(int id) {
    	// TODO Auto-generated method stub
    	return  collegeAdmissionRepository.findById(id).get();
        
    }
}

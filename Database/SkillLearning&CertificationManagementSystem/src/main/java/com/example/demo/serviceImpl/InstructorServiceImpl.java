package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Instructor;
import com.example.demo.repository.InstructorRepository;
import com.example.demo.service.InstructorService;

@Service
public class InstructorServiceImpl implements InstructorService {
	
	@Autowired
	InstructorRepository instructorRepository;

	@Override
	public void addInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		
		instructorRepository.save(instructor);
	}

	@Override
	public Instructor updateInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return instructorRepository.save(instructor);

	}

	@Override
	public List<Instructor> getAllInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return instructorRepository.findAll();
	}

	@Override
	public Instructor getInstructor(int instructorId) {
		// TODO Auto-generated method stub
		return instructorRepository.findById(instructorId).get();
	}

	@Override
	public void deleteAllInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		instructorRepository.deleteAll();
		
	}

	@Override
	public void deleteInstructor(int instructorId) {
		// TODO Auto-generated method stub
		instructorRepository.deleteById(instructorId);
		
	}

}

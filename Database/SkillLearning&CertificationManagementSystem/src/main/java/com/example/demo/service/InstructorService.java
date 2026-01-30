package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Instructor;

public interface InstructorService {

	void addInstructor(Instructor instructor);
	
	Instructor updateInstructor(Instructor instructor);
	
	List<Instructor> getAllInstructor(Instructor instructor);
	
	Instructor getInstructor(int instructorId);
	
	void deleteAllInstructor(Instructor instructor);
	
	void deleteInstructor(int instructor);
	
	
}

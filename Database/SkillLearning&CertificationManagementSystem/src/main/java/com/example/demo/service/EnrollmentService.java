package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Enrollment;

public interface EnrollmentService {
	
	void addEnrollment(Enrollment enrollment);
	
	Enrollment updateEnrollment(Enrollment enrollment);
	
	List<Enrollment> getAllEnrollments(Enrollment enrollment);
	
	Enrollment getEnrollment(int enrollmentId);
	
	void deleteAllEnrollment(Enrollment enrollment);
	
	void deleteEnrollment(int enrollmentId);
	
}

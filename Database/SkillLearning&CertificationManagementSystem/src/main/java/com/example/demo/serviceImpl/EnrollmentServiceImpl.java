package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Enrollment;
import com.example.demo.repository.EnrollmentRepository;
import com.example.demo.service.EnrollmentService;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{
	
	@Autowired
	EnrollmentRepository enrollmentRepository;

	@Override
	public void addEnrollment(Enrollment enrollment) {
		// TODO Auto-generated method stub
		enrollmentRepository.save(enrollment);
		
	}

	@Override
	public Enrollment updateEnrollment(Enrollment enrollment) {
		// TODO Auto-generated method stub
		return enrollmentRepository.save(enrollment);
	}

	@Override
	public List<Enrollment> getAllEnrollments(Enrollment enrollment) {
		// TODO Auto-generated method stub
		return enrollmentRepository.findAll();
	}

	@Override
	public Enrollment getEnrollment(int enrollmentId) {
		// TODO Auto-generated method stub
		return enrollmentRepository.findById(enrollmentId).get();
	}

	@Override
	public void deleteAllEnrollment(Enrollment enrollment) {
		// TODO Auto-generated method stub
		enrollmentRepository.deleteAll();
	}

	@Override
	public void deleteEnrollment(int enrollmentId) {
		// TODO Auto-generated method stub
		enrollmentRepository.deleteById(enrollmentId);
		
	}

}

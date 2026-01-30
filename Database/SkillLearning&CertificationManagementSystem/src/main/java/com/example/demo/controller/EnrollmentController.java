package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Enrollment;
import com.example.demo.service.EnrollmentService;

@RestController
@RequestMapping("enrollment")
public class EnrollmentController {

	@Autowired
	EnrollmentService enrollmentService;

	@PostMapping("add")
	public String addEnrollment(@RequestBody Enrollment enrollment)
	{
		enrollmentService.addEnrollment(enrollment);
		return MessageConstant.ENROLLMENT_ADDED;
		
	}
	
	@PutMapping("update")
	public Enrollment updateEnrollment(@RequestBody Enrollment enrollment)
	{
		return enrollmentService.updateEnrollment(enrollment);
		
	}
	
	@GetMapping("getAll")
	public List<Enrollment> getAllEnrollments(@RequestBody Enrollment enrollment)
	{
		return enrollmentService.getAllEnrollments(enrollment);
	}
	
	@GetMapping("get/{enrollmentID}")
	public Enrollment getEnrollment(@PathVariable int enrollmentId)
	{
		return enrollmentService.getEnrollment(enrollmentId);
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllEnrollments(@RequestBody Enrollment enrollment)
	{
		enrollmentService.deleteAllEnrollment(enrollment);
		return MessageConstant.ALL_ENROLLMENT_DELETED;
	}
	
	@DeleteMapping("delete/{enrollmentID}")
	public String deleteEnrollment(@PathVariable int enrollmentId)
	{
		enrollmentService.deleteEnrollment(enrollmentId);
		return MessageConstant.ENROLLMENT_DELETED;
	}
}

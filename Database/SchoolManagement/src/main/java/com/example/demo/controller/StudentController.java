package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstants;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	@PostMapping("add")
	public String addStudent(Student student)
	{
		studentService.addStudent(student);
		return MessageConstants.STUDENT_ADDED;
		
	}
	
	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
		return MessageConstants.STUDENT_DELETED;
		
	}
	
	@GetMapping("{id}")
	public Student getStudent(@PathVariable int id)
	{
	 Student student = studentService.getStudent(id);
	 
		return student;
		
	}

}

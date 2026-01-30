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
import com.example.demo.entity.Instructor;
import com.example.demo.service.InstructorService;

@RestController
@RequestMapping("instructor")
public class InstructorController {
	
	@Autowired
	InstructorService instructorService;
	
	@PostMapping("add")
	public String addInstructor(@RequestBody Instructor instructor)
	{
		instructorService.addInstructor(instructor);
		return MessageConstant.INSTRUCTOR_ADDED;
	}
	
	@PutMapping("update")
	public Instructor updateInstructor(@RequestBody Instructor instructor)
	{
		return instructorService.updateInstructor(instructor);
	}
	
	@GetMapping("getAll")
	public List<Instructor> getAllInstructor(@RequestBody Instructor instructor)
	{
		return instructorService.getAllInstructor(instructor);
	}
	
	@GetMapping("get/{InstructorId}")
	public Instructor getInstructor(@PathVariable int InstructorId)
	{
		return instructorService.getInstructor(InstructorId);
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllInstructor(@RequestBody Instructor instructor)
	{
		 instructorService.deleteAllInstructor(instructor);
		 return MessageConstant.ALL_INSTRUCTOR_DELETED;
	}
	
	@DeleteMapping("delete/{instructorId}")
	public String deleteInstructor(@PathVariable int instructorId)
	{
		instructorService.deleteInstructor(instructorId);
		return MessageConstant.INSTRUCTOR_ADDED;
	}
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("Student")
public class StudentController {

    private final StudentRepository studentRepository;

	@Autowired
	StudentService studentService;

    StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
	
	@PostMapping("add")
	public String addStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return MessageConstants.STUDENT_ADDED_IN_DB;
		
	}
	
	@GetMapping
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
	
	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentService.deletestudent(id);
		return null;
		
	}
	
	@GetMapping("{id}")
	 Student getStudentById(@PathVariable Integer id)
	{
		return studentService.getStudentById(id);
		 
	}
}

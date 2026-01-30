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
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	
	@Autowired
	StudentService studentService;
	
	@PostMapping("add")
	public String addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
		return MessageConstant.STUDENT_ADDED;	
	}
	
	@PutMapping("update")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
	}
	
	@GetMapping("getAll")
	public List<Student> getAllStudent(@RequestBody Student student)
	{
		return studentService.getAllStudent();
	}
	
	@GetMapping("get/{studentId}")
	public Student getStudent(@PathVariable int studentID)
	{
		return studentService.getStudent(studentID);
	}
	
	
	@DeleteMapping("deleteAll")
	public String deleteAllStudent(@RequestBody Student student)
	{
		studentService.deleteAllStudent();
		return MessageConstant.ALL_STUDENT_DELETED;
	}
	
	@DeleteMapping("delete/{studentId}")
	public String deleteStudent(@PathVariable int studentId)
	{
		studentService.deletestudent(studentId);
		return MessageConstant.STUDENT_DELETED;
	}
}

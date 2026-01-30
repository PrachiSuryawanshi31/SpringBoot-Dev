package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	void addStudent(Student student);
	
	Student updateStudent(Student student);
	
	List<Student> getAllStudent();
	
	Student getStudent(int studentId);
	
	void deleteAllStudent();
	
	void deletestudent(int studentId);
}

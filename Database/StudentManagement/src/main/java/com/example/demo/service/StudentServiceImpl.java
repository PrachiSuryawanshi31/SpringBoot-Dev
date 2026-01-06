package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

}

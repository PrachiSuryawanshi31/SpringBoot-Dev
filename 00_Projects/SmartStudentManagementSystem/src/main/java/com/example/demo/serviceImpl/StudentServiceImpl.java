package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

	
	
	public StudentServiceImpl(StudentRepository studentRepository)
	{
		this.studentRepository = studentRepository; 
	}
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		student.setName(student.getName().toUpperCase());  //String related
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(id);
		
	}

	@Override
	public List<Student> serachByName(String name) {
		// TODO Auto-generated method stub
		return studentRepository.findByNameContainingIgnoreCase(name));
	}

	@Override
	public String checkResult(int marks) {
		// TODO Auto-generated method stub
		
		if(marks >= 35)
		{
			return MessageConstant.PASS;
		}
		else
		{
			return MessageConstant.FAIL;
		}
	
	}

	@Override
	public double getAverageMarks() {
		// TODO Auto-generated method stub
		
		List<Student> students = studentRepository.findAll();
		
		if(students.isEmpty()) 
		{
			return 0;
		}
		
		int total = 0;
		
		for(int i = 0; i < students.size(); i++)
		{
			total = total + students.get(i).getMarks();
		}
		return  (double) total / students.size();
	}

	
}

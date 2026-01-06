package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Teacher;

public interface TeacherService {
	
	void saveTeacher(Teacher teacher);
	
	void deleteTeacher(Integer id);
	
	Teacher getTeacher(int id);
	
	List<Teacher> getAllTeacher();
}

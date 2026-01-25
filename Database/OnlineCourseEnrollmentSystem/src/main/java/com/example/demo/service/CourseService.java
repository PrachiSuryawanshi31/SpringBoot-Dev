package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;

public interface CourseService {
	
	String addCourse(Course course);
	
	Course updateCourse(Course course);
	
	List<Course> getAllCourse(Course course);
	
	Course getCourse(int courseId);
	
	String deleteAllCourse(Course course);
	
	String deleteCourse(int courseId);
	
}

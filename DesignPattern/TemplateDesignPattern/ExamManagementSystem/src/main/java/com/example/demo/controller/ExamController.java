package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExamService;
import com.example.demo.serviceImpl.MCQExamServiceImpl;
import com.example.demo.serviceImpl.codingExamServiceImpl;

@RestController
@RequestMapping("exam")
public class ExamController {
	
	@Autowired
	ExamService examService =null;
	
	@GetMapping("{type}")
	public String printResult(@PathVariable String type)
	{
		if(type.equals("mcq"))
		{
			examService = new MCQExamServiceImpl();
		}
		
		if(type.equals("coding"))
		{
			examService = new codingExamServiceImpl();
		}
		
		examService.verifyStudent();
		examService.calculateResult();
		examService.evaluateAnswer();
		return examService.publishResult();
		
	}
	
	
	
}

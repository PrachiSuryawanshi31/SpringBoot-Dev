package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

@Service
public class MCQExamServiceImpl extends ExamServiceAB {

	@Override
	public String evaluateAnswer() {
		// TODO Auto-generated method stub
		return " Evaluated The Answeres of MCQ Exam";
	}

	@Override
	public String calculateResult() {
		// TODO Auto-generated method stub
		return "Result Calculated of MCQ Exam!";
	}
	
	@Override
	public String publishResult() {
		// TODO Auto-generated method stub
		return " Student Result Published of MCQ Exam !";
		
	}

}
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
import com.example.demo.entity.Course;
import com.example.demo.entity.Feedback;
import com.example.demo.service.FeedbackService;

@RestController
@RequestMapping("feedback")
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@PostMapping("add")
	public void addFeedback(@RequestBody Feedback feedback) {
		// TODO Auto-generated method stub
		feedbackService.addFeedback(feedback);
		
	}

	@PutMapping("update")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbackService.updateFeedback(feedback);
	}

	@GetMapping("getAll")
	public List<Feedback> getAllFeedbacks(@RequestBody Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbackService.getAllFeedback(feedback);
	}

	@GetMapping("get/{feedbackId}")
	public Feedback getFeedback(@PathVariable int feedbackId) {
		// TODO Auto-generated method stub
		return feedbackService.getFeedback(feedbackId);
	}

	@DeleteMapping("deleteAll")
	public String deleteAllFeedback(@RequestBody Feedback feedback) {
		// TODO Auto-generated method stub
		feedbackService.deleteAllFeedback(feedback);
		return MessageConstant.ALL_FEEDBACK_DELETED;
		
	}

	@DeleteMapping("delete/{feedbackId}")
	public String deleteFeedback(@PathVariable int feedbackId) {
		// TODO Auto-generated method stub
		feedbackService.deleteFeedback(feedbackId);
		return MessageConstant.FEEDBACK_DELETED;
	}

	
}

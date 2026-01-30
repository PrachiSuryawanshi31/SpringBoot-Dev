package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.controller.FeedbackController;
import com.example.demo.entity.Feedback;
import com.example.demo.repository.FeedBackRepository;
import com.example.demo.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    
	@Autowired
	FeedBackRepository feedBackRepository;


	@Override
	public void addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		feedBackRepository.save(feedback);
		
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedBackRepository.save(feedback);
	}

	@Override
	public List<Feedback> getAllFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedBackRepository.findAll();
	}

	@Override
	public Feedback getFeedback(int feedbackId) {
		// TODO Auto-generated method stub
		return feedBackRepository.findById(feedbackId).get();
	}

	@Override
	public void deleteAllFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		feedBackRepository.deleteAll();
		
	}

	@Override
	public void deleteFeedback(int feedbackId) {
		// TODO Auto-generated method stub
		feedBackRepository.deleteById(feedbackId);
		
	}

}

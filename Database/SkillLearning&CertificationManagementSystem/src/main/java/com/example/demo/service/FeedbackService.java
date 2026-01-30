package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Feedback;

public interface FeedbackService {
	
void addFeedback( Feedback feedback);
	
	Feedback updateFeedback(Feedback feedback);
	
	List<Feedback> getAllFeedback(Feedback feedback);
	
	Feedback getFeedback(int feedbackId);
	
	void deleteAllFeedback(Feedback feedback);
	
	void deleteFeedback(int feedbackId);

}

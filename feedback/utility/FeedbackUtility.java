package com.feedback.utility;

import com.feedback.service.FeedbackServiceImpl;

public class FeedbackUtility {

	public static void main(String[] args) {
		FeedbackServiceImpl feedbackServiceImpl = new FeedbackServiceImpl();
		
		feedbackServiceImpl.getDetails();
		
	}
}

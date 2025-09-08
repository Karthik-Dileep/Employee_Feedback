package com.feedback.service;

import java.sql.Connection;
import java.util.List;

import com.feedback.dao.FeedbackDAO;
import com.feedback.dao.FeedbackDAOImpl;
import com.feedback.dbconnection.DBConnection;
import com.feedback.dto.FeedbackDTO;


public class FeedbackServiceImpl {

public void getDetails() {
		
		Connection connection = DBConnection.getConnection();
		FeedbackDAO feedbackDAO = new FeedbackDAOImpl();
		
		List<FeedbackDTO> details=feedbackDAO.getAllDetails(connection);
		int sid=0;
		for(FeedbackDTO feed : details) {
			
			if(sid!=feed.getSurveyid()) {
				sid=feed.getSurveyid();
				System.out.println("Survey_Id: "+sid);
				System.out.println("");
				for(FeedbackDTO feedback : details) {
					if(sid==feedback.getSurveyid()) {
						System.out.println("      Title: "+feedback.getTitle());
						System.out.println("      Description: "+feedback.getDescription());
						System.out.println("      Survey_Type: "+feedback.getSurveytype());
						System.out.println("      Response_Id: "+feedback.getResponseid());
						System.out.println("      Question: "+feedback.getQuestion());
						System.out.println("      Respondent: "+feedback.getRespondent());
						System.out.println("      Response: "+feedback.getResponse());
						System.out.println("-------------------------------------------\n");
						}
				}
				}
		}
					
		
	}
}

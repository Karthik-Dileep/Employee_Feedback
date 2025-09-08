package com.feedback.dao;

import java.sql.Connection;
import java.util.List;

import com.feedback.dto.FeedbackDTO;
import com.feedback.entity.Survey;



public interface FeedbackDAO {
	
	public List<FeedbackDTO> getAllDetails(Connection connection);
	
}

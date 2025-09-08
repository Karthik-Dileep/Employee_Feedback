package com.feedback.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.feedback.dto.FeedbackDTO;
import com.feedback.entity.Survey;



public class FeedbackDAOImpl implements FeedbackDAO {
	
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	public List<FeedbackDTO> getAllDetails(Connection connection) {
		
	    List<FeedbackDTO> feedbackList = new ArrayList<>();

	    try {
	        preparedStatement = connection.prepareStatement(
	            "SELECT s.id as survey_id, s.title, s.description, s.survey_type, " +
	            "r.id AS response_id, q.text AS question, " +
	            "e.first_name || ' ' || e.last_name AS respondent, " +
	            "COALESCE(ro.option_text, r.answer) AS response " +
	            "FROM response r " +
	            "JOIN question q ON r.question_id = q.id " +
	            "JOIN employee e ON r.employee_id = e.id " +
	            "JOIN survey s ON s.id = q.survey_id " +
	            "LEFT JOIN response_option ro ON r.option_id = ro.id;"
	        );

	        resultSet = preparedStatement.executeQuery();
	        while (resultSet.next()) {
	            FeedbackDTO dto = new FeedbackDTO();
	            
	            dto.setSurveyid(resultSet.getInt("survey_id"));
	            dto.setTitle(resultSet.getString("title"));
	            dto.setDescription(resultSet.getString("description"));
	            dto.setSurveytype(resultSet.getString("survey_type"));
	            dto.setResponseid(resultSet.getInt("response_id"));
	            dto.setQuestion(resultSet.getString("question"));
	            dto.setRespondent(resultSet.getString("respondent"));
	            dto.setResponse(resultSet.getString("response"));

	            feedbackList.add(dto);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return feedbackList;
	}


	
}

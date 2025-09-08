package com.feedback.entity;

public class Question {

	private int survey_id;
	private String text;
	private String question_type;
	
	
	public Question(int survey_id, String text, String question_type) {
		super();
		this.survey_id = survey_id;
		this.text = text;
		this.question_type = question_type;
	}


	public int getSurvey_id() {
		return survey_id;
	}


	public void setSurvey_id(int survey_id) {
		this.survey_id = survey_id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getQuestion_type() {
		return question_type;
	}


	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}

	
	
}

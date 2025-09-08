package com.feedback.dto;

public class FeedbackDTO {

	private int surveyid;
	private String title;
	private String description;
	private String surveytype;
	private int responseid;
	private String question;
	private String Respondent;
	private String fname;
	private String response;
	
	public FeedbackDTO() {
		super();
		this.surveyid = surveyid;
		this.title = title;
		this.description = description;
		this.surveytype = surveytype;
		this.responseid = responseid;
		this.fname = fname;
		this.response = response;
	}

	public int getSurveyid() {
		return surveyid;
	}

	public void setSurveyid(int surveyid) {
		this.surveyid = surveyid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSurveytype() {
		return surveytype;
	}

	public void setSurveytype(String surveytype) {
		this.surveytype = surveytype;
	}

	public int getResponseid() {
		return responseid;
	}

	public void setResponseid(int responseid) {
		this.responseid = responseid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getRespondent() {
		return Respondent;
	}

	public void setRespondent(String respondent) {
		Respondent = respondent;
	}
	
	
	
}

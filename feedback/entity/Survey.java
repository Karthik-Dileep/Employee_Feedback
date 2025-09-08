package com.feedback.entity;

public class Survey {
	private int id;
	private String title;
	private String description;
	private String survey_type;
	private int created_by;
	private int event_id;
	
	
	public Survey(String title, String description, String survey_type, int created_by, int event_id) {
		super();
		this.title = title;
		this.description = description;
		this.survey_type = survey_type;
		this.created_by = created_by;
		this.event_id = event_id;
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


	public String getSurvey_type() {
		return survey_type;
	}


	public void setSurvey_type(String survey_type) {
		this.survey_type = survey_type;
	}


	public int getCreated_by() {
		return created_by;
	}


	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}


	public int getEvent_id() {
		return event_id;
	}


	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
}

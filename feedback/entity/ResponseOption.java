package com.feedback.entity;

public class ResponseOption {
	
	private int question_id;
	private String option_text;
	private int option_value;
	
	
	public ResponseOption(int question_id, String option_text, int option_value) {
		super();
		this.question_id = question_id;
		this.option_text = option_text;
		this.option_value = option_value;
	}
	
	
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getOption_text() {
		return option_text;
	}
	public void setOption_text(String option_text) {
		this.option_text = option_text;
	}
	public int getOption_value() {
		return option_value;
	}
	public void setOption_value(int option_value) {
		this.option_value = option_value;
	}
	
	

}

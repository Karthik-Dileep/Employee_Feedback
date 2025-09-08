package com.feedback.entity;

public class Response {

	private int question_id;
	private int employee_id;
	private String answer; 
	private int option_id;
	
	
	public Response(int question_id, int employee_id, String answer, int option_id) {
		super();
		this.question_id = question_id;
		this.employee_id = employee_id;
		this.answer = answer;
		this.option_id = option_id;
	}


	public int getQuestion_id() {
		return question_id;
	}


	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}


	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public int getOption_id() {
		return option_id;
	}


	public void setOption_id(int option_id) {
		this.option_id = option_id;
	}
	
	
	
}

package com.learning.springrestjdbc.model;

public class Student {
	private int id;
	private String student_name;
	private int student_age;
	private int student_percentage;
	
	public Student() {}

	public Student(String student_name, int student_age, int student_percentage) {
		super();
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_percentage = student_percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}

	public int getStudent_percentage() {
		return student_percentage;
	}

	public void setStudent_percentage(int student_percentage) {
		this.student_percentage = student_percentage;
	}
	
	
}

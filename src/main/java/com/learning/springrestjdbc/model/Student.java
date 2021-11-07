package com.learning.springrestjdbc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
	private int id;
	private String student_name;
	private int student_age;
	private int student_percentage;
}

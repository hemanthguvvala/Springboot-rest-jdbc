package com.learning.springrestjdbc.repository;

import java.util.List;

import com.learning.springrestjdbc.model.Student;

public interface StudentDao {

	List<Student> getAllStudents();
	void deleteStudent(int id);
	void updateStuden(int id, Student student);
	void updateStudentName(int id, String name);
	void getStudent(int id);
	void updateStudentAge(int id,int age);
	void updatePercentage(int id,int percentage);
	void insertStudent(Student student);
//	void insertStudent(List<Student> students);
}

package com.learning.springrestjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springrestjdbc.model.Student;
import com.learning.springrestjdbc.repository.StudentRepo;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	public StudentRepo stdrepo;
	
	@GetMapping("/getstds")
	public List<Student> getStudents(){
		return stdrepo.getAllStudents();
	}
	
	@PostMapping("/poststd")
	public void insertStudent(@RequestBody Student stdData) {
		 stdrepo.insertStudent(stdData);
	}
	
//	@PostMapping("/poststds")
//	public void insertStudents(@RequestBody List<Student> student) {
//		stdrepo.insertStudent(student);
//	}
	
	@PutMapping("/updstd")
	public void updateStudent(@RequestParam int id,@RequestBody Student student) {
		stdrepo.updateStuden(id,student);
	}
	
	@DeleteMapping("/delstd")
	public void delStudent(@RequestParam int id) {
		stdrepo.deleteStudent(id);
	}
	
	@PatchMapping("/updname")
	public void updateName(@RequestParam int id,@RequestParam String name) {
		stdrepo.updateStudentName(id,name);
	}
	
	@PatchMapping("/updage")
	public void updateAge(@RequestParam int id,@RequestParam int age) {
		stdrepo.updateStudentAge(id,age);
	}
	@PatchMapping("/updperc")
	public void updatePercentage(@RequestParam int id,@RequestParam int percentage) {
		stdrepo.updatePercentage(id,percentage);
	}
	
	
}

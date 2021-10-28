package com.learning.springrestjdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learning.springrestjdbc.model.Student;

@Repository
@PropertySource("classpath:sqlcmds.properties")
public class StudentRepo implements StudentDao {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Student> getAllStudents() {
		String sqlQuery = env.getProperty("sql.get_all_students");
		List<Student> studentList = template.query(sqlQuery, new BeanPropertyRowMapper<>(Student.class));
		return studentList;
	}

	@Override
	public void deleteStudent(int id) {
		String sqlQuery = env.getProperty("sql.delete_student");
//		Object[] args = {id};
		template.update(sqlQuery,id);

	}

	@Override
	public void updateStuden(int id, Student student) {
		String sqlQuery = env.getProperty("sql.update_student");
		Object[] args = {
				student.getStudent_name(),
				student.getStudent_age(),student.getStudent_percentage(),id
		};
		template.update(sqlQuery,args);

	}

	@Override
	public void updateStudentName(int id, String name) {
		String sqlQuery = env.getProperty("sql.update_student_name");
		Object[] args = {name,id};
		template.update(sqlQuery,args);
	}

	@Override
	public void getStudent(int id) {
		String sqlQuery = env.getProperty("sql.get_student");
//		Object[] args = {id};
		template.update(sqlQuery,id);

	}

	@Override
	public void updateStudentAge(int id, int age) {
		String sqlQuery = env.getProperty("sql.update_student_age");
		Object[] args = {age,id};
		template.update(sqlQuery,args);

	}

	@Override
	public void updatePercentage(int id, int percentage) {
		String sqlQuery = env.getProperty("sql.updatae_student_percentage");
		Object[] args = {percentage,id};
		template.update(sqlQuery,args);


	}

	@Override
	public void insertStudent(Student student) {
		String sqlQuery = env.getProperty("sql.insert_student");
		Object[] args = {
				student.getId(),student.getStudent_name(),
				student.getStudent_age(),student.getStudent_percentage()
		};
		template.update(sqlQuery,args);

	}

//	@Override
//	public void insertStudent(List<Student> students) {
//		String sqlQuery = env.getProperty("sql.insert_student");
//		List<Object> stdList = new ArrayList<>();
//		for(Student student:students) {
//			Object[] args = {
//					student.getId(),student.getStudent_name(),
//					student.getStudent_age(),student.getStudent_percentage()
//			};
//			stdList.add(args);
//		}
//		
//		template.update(sqlQuery,stdList);
//	}

}

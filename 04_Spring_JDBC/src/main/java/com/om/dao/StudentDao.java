package com.om.dao;

import java.util.List;

import com.om.model.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int updateDetails(Student student);
	
	public int delete(int id);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudents();
	
}

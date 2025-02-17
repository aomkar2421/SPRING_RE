package com.om.dao;

import java.util.List;

import com.om.Student;

public interface StudentDao {
	
	public int saveStudent( Student student);
	
	public Student getStudent( int id);
	
	public List<Student> getAllStudent();
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int id);
	
}

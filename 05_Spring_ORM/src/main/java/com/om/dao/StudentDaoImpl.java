package com.om.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.om.Student;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	@Transactional
	public int saveStudent(Student student) {
		int i = (int) template.save(student);
		return i;
	}

	@Override
	public Student getStudent(int id) {
		Student student = template.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = template.loadAll(Student.class);
		return list;
	}

	@Override
	@Transactional
	public void updateStudent(Student student) {
		template.update(student);
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		Student student = template.get(Student.class, id);
		template.delete(student);
	}

}

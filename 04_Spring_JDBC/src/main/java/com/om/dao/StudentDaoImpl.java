package com.om.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.om.model.Student;

@Component("stdDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	@Override
	public int insert(Student student) {
		String sql = "insert into student(id, name, address) values(?,?,?)";
		int i = jdbcTemplate.update(sql, student.getId(), student.getName(), student.getAddress());
		return i;
	}

	@Override
	public int updateDetails(Student student) {
		String sql = "update student set name=?, address=? where id=?";
		int i = jdbcTemplate.update(sql, student.getName(), student.getAddress(), student.getId() );
		return i;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from student where id=?";
		int i = jdbcTemplate.update(sql, id);
		return i;
	}

	@Override
	public Student getStudentById(int id) {
		String sql = "select * from student where id=?";
		
		RowMapper rowMapper = new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student st = new Student();
				
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getNString(3));
				
				return st;
			}
		};
		
		Student st = (Student) jdbcTemplate.queryForObject(sql, rowMapper, id);
		
		return st;
	}

	@Override
	public List<Student> getAllStudents() {
		String sql = "select * from student";
		
		RowMapper rowMapper = new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student st = new Student();
				
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getNString(3));
				
				return st;
			}
		};
		
		List<Student> list = jdbcTemplate.query(sql, rowMapper);
		
		return list;
	}

}

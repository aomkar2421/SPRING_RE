package com.om.javaconfig;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.om.dao.StudentDao;
import com.om.dao.StudentDaoImpl;
import com.om.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws SQLException
	{
		//        System.out.println( "Hello World!" );
		//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		//        JdbcTemplate jd = context.getBean("getJdbcTemplate", JdbcTemplate.class);
		//        System.out.println(jd.getDataSource().getConnection());
		//        
		//        String sql = "insert into student(id, name, address) values(?,?,?)";
		//        
		//        int i = jd.update(sql, 2, "omkar", "pune");
		//        System.out.println("Inserted");


		System.out.println( "Hello World!" );
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		StudentDaoImpl dao = context.getBean("stdDao", StudentDaoImpl.class);

		//		//INSERT DATA
		//				Student student = new Student();
		//				student.setId(9);
		//				student.setName("DUMMY");
		//				student.setAddress("DUMMY");
		//		
		//				int i = dao.insert(student);
		//				System.out.println("Inserted Succesfully : "+i);


		//		//UPDATE DATA
		//				Student student = new Student();
		//				student.setId(9);
		//				student.setName("DUMMY UP");
		//				student.setAddress("DUMMY UP");
		//		
		//				int i = dao.updateDetails(student);
		//				System.out.println("Updated Succesfully : "+i);


		//		//DELETE DATA
		//				int id = 9;
		//				int i = dao.delete(id);
		//				System.out.println("Deleted Succesfully : "+i);


		//		//RETRIVE SINGLE DATA
		//				int id = 1;
		//				Student st = dao.getStudentById(id);
		//				System.out.println(st);


		//		//RETRIVE ALL STUDENTS
		//				List<Student> list = dao.getAllStudents();
		//				for (Student st : list) {
		//					System.out.println(st);        
		//				} 

	}
}
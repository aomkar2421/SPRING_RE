package com.om;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.om.dao.StudentDao;
import com.om.dao.StudentDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		ApplicationContext context = new ClassPathXmlApplicationContext("com/om/config.xml");

		//        HibernateTemplate template = context.getBean("template", HibernateTemplate.class);
		//        System.out.println(template);

		StudentDao dao = context.getBean("stdDao", StudentDao.class);


		//        //INSERT
		//        Student st = new Student();
		//        st.setId(10);
		//        st.setName("DUMMY");
		//        st.setAddress("DUMMY");
		//        
		//        int i = dao.saveStudent(st);
		//        System.out.println("Inserted Succesfully : "+i);


		//        //RETRIVE SINGLE
		//        Student st = dao.getStudent(10);
		//        System.out.println(st);


		//        //RETRIVE ALL
		//        List<Student> list = dao.getAllStudent();
		//        for (Student st : list) {
		//			System.out.println(st);
		//		}


		//      //UPDATE
		//      Student st = new Student();
		//      st.setId(10);
		//      st.setName("DUMMY UP");
		//      st.setAddress("DUMMY UP");    
		//      dao.updateStudent(st);
		//      System.out.println("UPDATED SUCCESFULLY");


		//        //DELETE
		//        dao.deleteStudent(10);
		//        System.out.println("DELETED SUCCESFULLY");
	}
}

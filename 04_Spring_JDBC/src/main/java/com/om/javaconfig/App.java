package com.om.javaconfig;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        JdbcTemplate jd = context.getBean("getJdbcTemplate", JdbcTemplate.class);
        System.out.println(jd.getDataSource().getConnection());
        
        String sql = "insert into student(id, name, address) values(?,?,?)";
        
        int i = jd.update(sql, 2, "omkar", "pune");
        System.out.println("Inserted");
        
    } 
}

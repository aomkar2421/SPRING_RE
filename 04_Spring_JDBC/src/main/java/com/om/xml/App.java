package com.om.xml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws SQLException
	{
		System.out.println( "Hello World!" );
		ApplicationContext context = new ClassPathXmlApplicationContext("com/om/xml/config.xml");
		JdbcTemplate jd = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());

		//      //INSERT DATA
		//        String sql = "insert into student(id, name, address) values(?,?,?)";
		//        int i = jd.update(sql, 4, "Vaibhav", "pune");
		//        System.out.println("Inserted Succesfully "+i);


		//      //UPDATE DATA
		//        String sql = "update student set name=? where id=?";
		//        int i = jd.update(sql, "Avishkar", 2);
		//        System.out.println("Updated Succesfully "+i);


		//      //DELETE DATA
		//        String sql = "delete from student where id=?";
		//        int i = jd.update(sql, 4);
		//        System.out.println("Deleted Succesfully "+i);


		//RETRIVE DATA
		//        String sql = "select * from student where id=?";
		//        
		//        RowMapper rowMapper = new RowMapper() {
		//
		//			@Override
		//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		//				String str = rs.getNString(2);
		//				return str;
		//			}
		//        	
		//		};
		//        
		//        String name = (String) jd.queryForObject(sql, rowMapper, 1);
		//        System.out.println(name);

		
		
		String sql = "select * from student";

		RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				String str = rs.getNString(2);
				return str;
			}

		};

		List<String> names = jd.query(sql, rowMapper);
		for (String str : names) {
			System.out.println(str);
		}

	} 
}

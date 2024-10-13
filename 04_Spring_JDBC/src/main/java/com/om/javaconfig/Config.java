package com.om.javaconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.om.dao.StudentDao;
import com.om.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.om.dao")
public class Config {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jd = new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}
	
//	@Bean("stdDao")
//	public StudentDao studentDao() {
//		StudentDaoImpl dao = new StudentDaoImpl();
//		dao.setJdbcTemplate(getJdbcTemplate());
//		return dao;
//	}
	
}

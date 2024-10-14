package com.om.javaconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

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

	// i have commented this as i have used autowiring here lets leran the flow of autowiring
	// in App.java file in getBean() we are trying to retrive bean named as stdDao which spring will look into config file (Config.jav)
	// but it is not decleared here but at top of class we have declared "@ComponentScan(basePackages = "com.om.dao")"
	// thats why spring will look for stdDao bean in all classes on com.om.dao
	// and it is StudentDaoImpl and as it is defined as @Component("stdDao") there autowiring will happen

	//	@Bean("stdDao")
	//	public StudentDao studentDao() {
	//		StudentDaoImpl dao = new StudentDaoImpl();
	//		dao.setJdbcTemplate(getJdbcTemplate());
	//		return dao;
	//	}

}

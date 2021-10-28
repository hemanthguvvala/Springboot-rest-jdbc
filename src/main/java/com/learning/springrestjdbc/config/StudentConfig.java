package com.learning.springrestjdbc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class StudentConfig {

	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@Value("${spring.datasource.driver-class-name}")
	private String driverName;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driSource  = new DriverManagerDataSource();
		driSource.setUsername(username);
		driSource.setUrl(url);
		driSource.setPassword(password);
		driSource.setDriverClassName(driverName);
		return driSource;
	}
	
	@Bean
	public JdbcTemplate template() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}
}

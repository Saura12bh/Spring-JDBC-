package org.springJDBC.ConfigratationWay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"org.springJDBC"})
public class TestConfig {
	
	@Bean("ds")   //dataSorce  ->getDataSorce
	public DriverManagerDataSource getDs()
	{
		DriverManagerDataSource dd=new DriverManagerDataSource();
		dd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dd.setUrl("jdbc:mysql://localhost:3306/spring");
		dd.setUsername("root");
		dd.setPassword("Saurabh2003");
		
		return dd;// DMDS cha object to yethun return kela
	}
	

}



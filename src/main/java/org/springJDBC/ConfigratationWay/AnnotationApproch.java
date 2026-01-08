package org.springJDBC.ConfigratationWay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AnnotationApproch {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(TestConfig.class);
		
		DriverManagerDataSource ds=(DriverManagerDataSource) cn.getBean("ds");
		if(ds!=null)
		{
			System.out.println("database is connted");
		}
		else {
			System.out.println("Database is not connted");
		}
		
	}

}

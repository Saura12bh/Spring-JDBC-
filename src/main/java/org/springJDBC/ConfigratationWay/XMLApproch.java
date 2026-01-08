package org.springJDBC.ConfigratationWay;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class XMLApproch {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cn=new ClassPathXmlApplicationContext("test.xml");
		DriverManagerDataSource ds=(DriverManagerDataSource)cn.getBean("d");
		if(ds!=null)
		{
			System.out.println("Database is connted");
		}
		else {
			System.out.println("Database is not Connted");

		}
		
	}

}

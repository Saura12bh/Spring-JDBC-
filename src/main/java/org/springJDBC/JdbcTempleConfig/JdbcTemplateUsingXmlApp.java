package org.springJDBC.JdbcTempleConfig;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateUsingXmlApp {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext cn=new ClassPathXmlApplicationContext("templetTest.xml");
	JdbcTemplate jt=(JdbcTemplate) cn.getBean("temp");
	Scanner sc=new Scanner(System.in);
	if(jt!=null)
	{
		System.out.println("Database is connted");
		//excute method without run time paramter
//		jt.execute("insert into emp values(1,'ram',122)");
		
		//with run time parameter with SQL injection
		System.out.println("ENter  name id sal");
		String name=sc.nextLine();
		int id=sc.nextInt();
		int sal=sc.nextInt();
		jt.execute("insert into emp values("+id+",'"+name+"',"+sal+")");
		System.out.println("data inserted");
	}
	else {
		System.out.println("data base is not connted");
	}
	}

}

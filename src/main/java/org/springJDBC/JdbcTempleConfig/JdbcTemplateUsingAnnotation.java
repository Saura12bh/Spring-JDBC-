package org.springJDBC.JdbcTempleConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class JdbcTemplateUsingAnnotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(JbctTestConfig.class);
		JdbcTemplate jt=(JdbcTemplate)cn.getBean("jdbcTemplate");
		if(jt!=null)
		{
			System.out.println("Database is connteted");
			jt.execute("insert into emp values(4,'ram',124)");
			System.out.println("Data Inserted");

		}
		else {
			System.out.println("DataBase is not connteted");

		}
	}

}

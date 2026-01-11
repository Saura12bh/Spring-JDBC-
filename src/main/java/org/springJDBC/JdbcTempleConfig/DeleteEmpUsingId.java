package org.springJDBC.JdbcTempleConfig;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeleteEmpUsingId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(JbctTestConfig.class);
		
		JdbcTemplate jt=(JdbcTemplate) cn.getBean("jdbcTemplate");
		System.out.println("Enter id to delete emp");
		int id=sc.nextInt();
		int v=jt.update("delete from emp where eid=?",new Object[]{id});
		if(v>0)
		{
			System.out.println("emp delete sucessfully");
		}
		else {
			System.out.println("emp not delete sucessfully");
		}
		
	}

}

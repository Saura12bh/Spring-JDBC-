package org.springJDBC.JdbcTempleConfig;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateEmpById {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(JbctTestConfig.class);
		
		JdbcTemplate jt=(JdbcTemplate) cn.getBean("jdbcTemplate");
		System.out.println("Enter id to update emp");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name and salary for update");
		String name=sc.nextLine();
		int sal=sc.nextInt();
		
		int v=jt.update("update emp set name=?,sal=? where eid=?",new Object[] {name,sal,id} );
		if(v>0)
		{
			System.out.println("Emp update successfully");
		}
		else {
			System.out.println("Emp not update successfully");
		}
	}

}

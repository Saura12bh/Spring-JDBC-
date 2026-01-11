package org.springJDBC.JdbcTempleConfig;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class UpdateWithPreparedStatement {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(JbctTestConfig.class);
	
	JdbcTemplate jt=(JdbcTemplate) cn.getBean("jdbcTemplate");
	System.out.println("Enter name id sal");
	String name=sc.nextLine();
	int id=sc.nextInt();
	int sal=sc.nextInt();
	
//	PreparedStatementSetter ps=new PreparedStatementSetter()
//			{
//				public void setValues(PreparedStatement ps) throws SQLException {
//				ps.setInt(1, id);
//				ps.setString(2, name);
//				ps.setInt(3, id);
//				}		
//			};
	
//	int v=jt.update("insert into emp values(?,?,?)",(PreparedStatement ps)->{
//		ps.setInt(1, id);
//		ps.setString(2, name);
//		ps.setInt(3, sal);
//	});
	//synatx ->1 para ->sql chi quuery  2->prepareStatementSetter cha ref
	
	int v=jt.update("insert into emp values(?,?,?)",new Object[] {id,name,sal});
	if(v>0)
	{
		System.out.println("data inseted successfully");
	}
	else {
		System.out.println("data not inseted");

	}
	}
}

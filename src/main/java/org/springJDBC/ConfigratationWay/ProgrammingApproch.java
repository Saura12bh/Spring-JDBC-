package org.springJDBC.ConfigratationWay;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
public class ProgrammingApproch {
	public static void main(String[] args) {		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring");
		ds.setUsername("root");
		ds.setPassword("Saurabh2003");
		
		if(ds!=null)
		{
			System.out.println("Database is connted");
		}
		else {
			System.out.println("Database is not conneted");
		}
			
	}

}


package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBoptn 
{
//	Statement is an interface provided by the java.sql package and is used to execute static SQL queries.
	public static Statement stmt=null;// The stmt object is static, meaning it's shared across all instances of the DBoptn class
	public static Statement createstmt()
	{
		try 
		{
			//loading the class
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/cms","root","root");	
			stmt=con.createStatement(); // Statement object is created using the createStatement() method of the Connection object (con).
				
		}
		catch (Exception e) 
		{
			System.out.println(e);
			
			
		}
		return stmt; // it is returned so that it can be used elsewhere in the program to execute SQL queries.
	}

}

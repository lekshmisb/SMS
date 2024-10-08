package sms;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBoperation 
{
	static void addteacher() // This method allows the user to input teacher details and stores them in the Staff object (represented by sf).
	{
		Staff sf=new Staff();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		sf.setTeacher_Name(sc.next());//sc.next() captures the input (a single word), and it is passed to the setTeacher_Name method of the Staff object.
		System.out.println("Enter your gender");
		sf.setTeacher_Gender(sc.next());
		System.out.println("Enter your role");
		sf.setRole(sc.next());
		System.out.println("Enter your email");
		sf.setTeacher_email(sc.next());
		System.out.println("Enter your password");
		sf.setTeacher_password(sc.next());
		System.out.println("Enter your DOB");
		sf.setTeacher_DOB(sc.next());
		System.out.println("Enter your course");
		sf.setTeacher_Course(sc.next());
		createA(sf);//Once all details are captured via Scanner, they are passed to the createA() method, which handles database insertion.
		
	}

	static void createA(Staff sf)
	{
		try 
		{
		Statement stmt=DBoptn.createstmt();
		String sql="Insert into teacher(teacher_Name,teacher_Gender,role,teacher_email,teacher_password,teacher_DOB,teacher_Course) values('"+sf.getTeacher_Name()+"','"+sf.getTeacher_Gender()+"','"+sf.getRole()+"','"+sf.getTeacher_email()+"','"+sf.getTeacher_password()+"','"+sf.getTeacher_DOB()+"','"+sf.getTeacher_Course()+"')";
		int i=stmt.executeUpdate(sql);
		int id=0;
		if(i==1)
		{
			System.out.println("Inserted Sucessfully");
			sql="select max(teacher_id)from teacher";// it retrieves the newly generated teacher_id by using an SQL SELECT max(teacher_id) query.
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				id=rs.getInt("max(teacher_id)");
			}
			
			if(id>0)
			{
				sql="insert into login(id,username,password,role)value("+id+",'"+sf.getTeacher_email()+"','"+sf.getTeacher_password()+"','"+sf.getRole()+"')";
				if(stmt.executeUpdate(sql)==1)
				{
					System.out.println("Login sucessfully");
				}
			}
		}
		
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}
	static void checklogin(String email,String password)
	{
		int id=0;
		String role="";
		
		try 
		{
			Statement stmt=DBoptn.createstmt();
			String sql="select id,role from login where password='"+password+"' and username='"+email+"'";
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				id=rs.getInt("id");
				role=rs.getString("role");
			}
			
			if(id>0)
			{
				switch(role)
				{
				case "teacher":
					Teacherpro tp=new Teacherpro(id);
					tp.display();
					break;
					
				case "student":
					Studentpro sp=new Studentpro(id);
					sp.displayS();
					break;
					
				case "Admin":
					Admin.displayAd();
					break;
				}
					
			}
			
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
			
		}
	}
		
		static Staff teacherdetails(int id)// it takes the teacherdetails from database using id. 
		{
			Staff sf=new Staff();
			try 
			{
				Statement stmt=DBoptn.createstmt();
				String sql="select * from teacher where teacher_id="+id;
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next())
				{
					sf.setTeacher_Name(rs.getString("teacher_Name"));
					sf.setTeacher_DOB(rs.getString("teacher_DOB"));
					sf.setTeacher_Gender(rs.getString("teacher_Gender"));
					sf.setTeacher_email(rs.getString("teacher_email"));
				}
			} 
			catch (Exception e) 
			{
				System.out.println(e);
				
			}
			return sf;
		
		
	}
	
}

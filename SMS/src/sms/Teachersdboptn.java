package sms;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Teachersdboptn 
{
	static void addstudent()
	{
		Student st=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the admission number");
		st.setAdm_no(sc.nextInt());
		System.out.println("Enter the name of student");
		st.setStudent_name(sc.next());
		System.out.println("Enter DOB");
		st.setStudent_DOB(sc.next());
		System.out.println("Enter the name of guardian");
		st.setGuardian_name(sc.next());
		System.out.println("Enter the role");
		st.setRole(sc.next());
		System.out.println("Enter the email");
		st.setEmail(sc.next());
		createA(st);
	}
	
	static void createA(Student st)
	{
		try 
		{
			Statement stmt=DBoptn.createstmt();
			String sql="insert into student(adm_no,student_name,student_DOB,guardian_name,role,email,teacher_id) values("+st.getAdm_no()+",'"+st.getStudent_name()+"','"+st.getStudent_DOB()+"','"+st.getGuardian_name()+"','"+st.getRole()+"','"+st.getEmail()+"',"+Teacherpro.id+")";
			int i=stmt.executeUpdate(sql);
			int id=0;
			
			if(i==1)
			{
				System.out.println("Inserted sucessfully");
				sql="select max(adm_no)from student";
				ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				id=rs.getInt("max(adm_no)");
			}
			
			if(id>0)
			{
				sql="insert into login(id,username,password,role)values("+id+",'"+st.getEmail()+"','"+st.getStudent_DOB()+"','"+st.getRole()+"')";
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
			ResultSet rs=stmt.executeQuery(sql);//resultset is an interface in which rs which can hold a table.
			
			while(rs.next())// next indicates shifting of pointers.rs.next can specify the columns and rows according to our need.
			{
				id=rs.getInt("id");
				role=rs.getString("role");
			}
			
		} 
		catch (Exception e) 
		{
		System.out.println(e);	
		}
	}
	static Student viewbyId(int id)
	{
		Student  st=new Student();
		
		try 
		{
		  Statement stmt=DBoptn.createstmt();
		  String sql="select * from student where adm_no="+id;
		  ResultSet rs=stmt.executeQuery(sql);
		  while(rs.next())
		  {
			  st.setAdm_no(rs.getInt("adm_no"));
			  st.setStudent_name(rs.getString("student_name"));
			  st.setStudent_DOB(rs.getString("student_DOB"));
			  st.setGuardian_name(rs.getString("guardian_name"));
			  st.setRole(rs.getString("role"));
			  st.setEmail(rs.getString("email"));
			  
		  }
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return st;
	}

}

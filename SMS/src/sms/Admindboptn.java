package sms;


import java.sql.ResultSet;
import java.sql.Statement;

public class Admindboptn 
{
	static void viewStudent()
	{
		Student st=new Student();
		try 
		{
			Statement stmt=DBoptn.createstmt();
			String sql="select student.student_name,student.student_DOB,student.guardian_name,marklist.English,marklist.Malayalam1,marklist.Malayalam2,marklist.Hindi,marklist.It,marklist.Maths,marklist.SS,marklist.Physics,marklist.Chemistry,marklist.Biology from student inner join marklist on student.adm_no=marklist.adm_no";
			
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("student_name")+" "+rs.getString("student_DOB")+" "+rs.getString("guardian_name")+" "+rs.getString("English")+" "+rs.getString("Malayalam1")+" "+rs.getString("Malayalam2")+" "+rs.getString("Hindi")+" "+rs.getString("It")+" "+rs.getString("Maths")+" "+rs.getString("SS")+" "+rs.getString("Physics")+" "+rs.getString("Chemistry")+" "+rs.getString("Biology"));
				
				
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	static void viewStaff()
	{
		Staff sf=new Staff();
		try 
		{
			Statement stmt=DBoptn.createstmt();
			
		String sql	="select teacher.teacher_Name,teacher.teacher_DOB,teacher.teacher_Course,student.student_name from teacher inner join student on teacher.teacher_id=student.teacher_id";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("teacher_Name")+" "+rs.getString("teacher_DOB")+" "+rs.getString("teacher_Course"));
				
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
	  

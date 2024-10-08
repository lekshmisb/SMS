package sms;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Mrklistdboptn 
{
	static void addmrklist()
	{
		Mrklist ml=new Mrklist(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Admission number");
		ml.setAdm_no(sc.nextInt());
		System.out.println("Enter the mark of English");
		ml.setEnglish(sc.next());
		System.out.println("Enter the mark of Malayalam1");
		ml.setMalayalam1(sc.next());
		System.out.println("Enter the mark of Malayalam2");
		ml.setMalayalam2(sc.next());
		System.out.println("Enter the mark of Hindi");
		ml.setHindi(sc.next());
		System.out.println("Enter the mark of It");
		ml.setIt(sc.next());
		System.out.println("Enter the mark of Maths");
		ml.setMaths(sc.next());
		System.out.println("Enter the mark of SS");
		ml.setSS(sc.next());
		System.out.println("Enter the mark of Physics");
		ml.setPhysics(sc.next());
		System.out.println("Enter the mark of Chemistry");
		ml.setChemistry(sc.next());
		System.out.println("Enter the mark of Biology");
		ml.setBiology(sc.next());
		mrketr(ml);
	}
	
	static void mrketr(Mrklist ml)
	{
		try 
		{
			Statement stmt=DBoptn.createstmt();
			String sql="insert into marklist values("+ml.getAdm_no()+",'"+ml.getEnglish()+"','"+ml.getMalayalam1()+"','"+ml.getMalayalam2()+"','"+ml.getHindi()+"','"+ml.getIt()+"','"+ml.getMaths()+"','"+ml.getSS()+"','"+ml.getPhysics()+"','"+ml.getChemistry()+"','"+ml.getBiology()+"')"; 
			int i=stmt.executeUpdate(sql);
			
			
			if(i==1)
			{
				System.out.println("Inserted sucessfully");
			}
				
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	static void viewAll()
	{
		Student st=new Student();
		try 
		{
			Statement stmt=DBoptn.createstmt();
			String sql="select adm_no from student where teacher_id="+Teacherpro.id;
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				Teacherpro.displayStudent(rs.getInt("adm_no"));
				
			}
		}
		catch (Exception e) 
		{
			
		}
	}
   
}

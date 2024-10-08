package sms;

import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdboptn 
{
	static Student studentdetails()
	{
         Student st=new Student(); 
		
		try
		{
		Statement stmt=DBoptn.createstmt();
		String sql="select * from student where adm_no="+Studentpro.adm_no;
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
	
	static Mrklist M()
	{
		Mrklist ml=new Mrklist();
		try 
		{
	       Statement stmt=DBoptn.createstmt();
	       String sql="select * from marklist where adm_no="+Studentpro.adm_no;
	       ResultSet rs=stmt.executeQuery(sql);
	       while(rs.next())
	       {
	    	   ml.setEnglish(rs.getString("English"));
	    	   ml.setMalayalam1(rs.getString("Malayalam1"));
	    	   ml.setMalayalam2(rs.getString("Malayalm2"));
	    	   ml.setHindi(rs.getString("Hindi"));
	    	   ml.setIt(rs.getString("It"));
	    	   ml.setMaths(rs.getString("Maths"));
	    	   ml.setSS(rs.getString("SS"));
	    	   ml.setPhysics(rs.getString("Physics"));
	    	   ml.setChemistry(rs.getString("Chemistry"));
	    	   ml.setBiology(rs.getString("Biology"));
	    	   
	       }
		}
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return ml;
		}
		
		
}

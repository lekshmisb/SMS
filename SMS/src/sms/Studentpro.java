package sms;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Studentpro 
{
	static int adm_no=0;

	public Studentpro(int adm_no)
	{
		super();
		this.adm_no = adm_no;
	}
	
	     static void displayS()
	     {
		Studentdboptn sd=new Studentdboptn();
		Student st=sd.studentdetails();
	    System.out.println("Welcome"+st.getStudent_name());
	    Scanner sc=new Scanner(System.in);
	    int n;
	     do
	     {
	    System.out.println("1:View profile\n2:View marklist\n3:Exit");
		n=sc.nextInt();
	
	
	switch(n)
	{
	case 1:
		viewProfile();
		break;
		
	case 2:
		viewMark();
		break;
     
		
		
	default:
		System.out.println("Exit");
		break;
	}
		
	}
	     
	     while(n!=3);
	     }
	     
	     static void viewProfile()
	     {
	    	Studentdboptn sd=new Studentdboptn();
	 		Student st=sd.studentdetails();
	 	    System.out.println("Welcome"+st.getStudent_name());
	 	    System.out.println("Admission number"+st.getAdm_no());
	 	    System.out.println("DOB"+st.getStudent_DOB());
	 	    System.out.println("Email"+st.getEmail());
	 	    System.out.println("Guardian name"+st.getGuardian_name());
	     }
	     
	     static void viewMark()
	     {
		  Studentdboptn sd=new Studentdboptn();
	      Mrklist ml=sd.M();
		  System.out.println("English:"+ml.getEnglish());
		  System.out.println("Malayalam1:"+ml.getMalayalam1());
		  System.out.println("Malayalam2:"+ml.getMalayalam2());
		  System.out.println("Hindi:"+ml.getHindi());
		  System.out.println("It:"+ml.getIt());
		  System.out.println("Maths:"+ml.getMaths());
		  System.out.println("SS:"+ml.getSS());
		  System.out.println("Physics:"+ml.getPhysics());
		  System.out.println("Chemistry:"+ml.getChemistry());
		  System.out.println("Biology:"+ml.getBiology());
	 
	     
	     }
		
}





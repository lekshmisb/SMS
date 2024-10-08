package sms;

import java.util.Scanner;

public class Teacherpro 
{
  static int id=0;

	public Teacherpro(int id) {
		super();
		this.id = id;
	}
	static void display()
	{
		DBoperation o=new DBoperation();
		Staff sf=o.teacherdetails(id);
		System.out.println("Welcome"+sf.getTeacher_Name());
		System.out.println("DOB:"+sf.getTeacher_DOB());
		System.out.println("email:"+sf.getTeacher_email());
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("1:add student\n2:view all student\n3:view student by id\n4:add marklist\n5:Exit");
			n=sc.nextInt();
			
			switch(n)
			{
			case 1:
		    Teachersdboptn.addstudent();
				break;
				
			case 2:
				
				Mrklistdboptn.viewAll();
				break;
				
			case 3:
				System.out.println("Enter the id");
				displayStudent(sc.nextInt());;
				break;
				
			case 4:
				displayMrklist();
				break;
				
				default:
					System.out.println("Exit");
				break;
				
			}
		}
		while(n!=5);
	}
	static void displayStudent(int n)
	{
		
		
		Teachersdboptn o=new Teachersdboptn();
		Student st=o.viewbyId(n);
		System.out.println("adm_no:"+st.getAdm_no());
		System.out.println("student_name:"+st.getStudent_name());
		System.out.println("student_DOB:"+st.getStudent_DOB());
		System.out.println("guardian_name:"+st.getGuardian_name());
		System.out.println("role:"+st.getRole());
		System.out.println("email:"+st.getEmail());
		
	}
	
	static void displayMrklist()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Admission number");
		int a=sc.nextInt();
		Mrklistdboptn.addmrklist();
		 
	}
	
}

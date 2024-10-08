package sms;

import java.util.Scanner;

public class Admin 
{
	
static void displayAd()
{
	System.out.println("Admin");
	Scanner sc=new Scanner(System.in);
	int n;
	do
	{
		System.out.println("1:view all students\n2:view all staffs\n3:Logout");
		n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			Admindboptn.viewStudent();
			break;
			
		case 2:
			Admindboptn.viewStaff();
			break;
			
		
		 default:
				System.out.println("Logout");
			break;
			
		}
	}
	while(n!=3);
}
		
}


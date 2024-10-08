package sms;

import java.util.Scanner;

public class Home
{
	
	static void mainmenu()
	{
		int n;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1:Create Account\n2:Login\n3:Exit\nPlease enter the option");
			n=sc.nextInt();
			
			switch(n)
			{
			case 1:
				DBoperation.addteacher();
				break;
				
			case 2:
				login();
				break;
				
			default:
				System.out.println("Invalid");
				break;
			}
		}
		while(n!=3);
		
		
	}
	  static void login()
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter your username");
		  String email=sc.next();
		  System.out.println("Enter your password");
		  String password=sc.next();
		  DBoperation.checklogin(email, password);
		  Teachersdboptn.checklogin(email, password);
	  }
      public static void main(String[] args)
      {
		mainmenu();
	}
}

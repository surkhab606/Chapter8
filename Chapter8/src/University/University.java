package University;

import java.util.Scanner;

/*
Program: University.java          Last Date of this Revision: March 30, 2022
Purpose: To test the UEmployee, UFaculty and UStaff class 
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/
public class University 
{
	
		
	   public static void main(String[] args)
	   {
		  
	   
		String userInput;
		
		
		do 
		{
		
		Scanner inp = new Scanner(System.in);
		System.out.println("\n Type 'F' for access to faculty \\ or 'S' for access to staff \\ Press 'Q' to Quit");
	    System.out.println("Enter choice: ");
	    userInput = inp.next();
	    	
		Scanner first = new Scanner(System.in);
		System.out.println("Type your first name: ");
		String f = first.nextLine();
		
		Scanner last = new Scanner(System.in);
		System.out.println("Type your last name: ");
		String l = last.nextLine();
		
		Scanner salary = new Scanner(System.in);
		System.out.println("What is your yearly salary?: ");
		double sal = salary.nextInt();
		
	
		

	    if	(userInput.equalsIgnoreCase("F") || (userInput.equalsIgnoreCase("Faculty")))
	    {
	    
		Scanner depart = new Scanner(System.in);
		System.out.println("What department are you currently working in?");
		String d = depart.nextLine();
		
		
		UFaculty fac1 = new UFaculty(f, l, d, sal);
			
		System.out.println(fac1.toString());

		} 
	
	    else if(userInput.equalsIgnoreCase("S") || (userInput.equalsIgnoreCase("Staff")))
	    {
	    	
	    
		Scanner title = new Scanner(System.in);
		System.out.println("What is your job title?");
		String j = title.nextLine();
		
		UStaff sta1 = new UStaff(f, l, sal, j);
		
		System.out.println(sta1.toString());
		
		
	    }
	    
	   
	    }  while (userInput.equalsIgnoreCase("Q") || (userInput.equalsIgnoreCase("Quit")));
		
		
		
	  }	
	   	
}
		

	


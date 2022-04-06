
/*
Program: University.java          Last Date of this Revision: March 30, 2022
Purpose: To test the UEmployee, UFaculty and UStaff class 
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

package University;

import java.util.Scanner;


public class University 
{
	
	   //Main method
	   public static void main(String[] args)
	   {
		  
		//Creates a string to store the userInput values
		String userInput;
		
		
		do 
		{
		
		//Basic text to have a more professional look
		System.out.println("Welcome to the University of Calgary Employee Portal");
		
		//Prompts user for and stores first name value 
		Scanner first = new Scanner(System.in);
		System.out.println("\nPlease type your first name: ");
		String f = first.nextLine();
		
		//Prompts user for and stores last name value 
		Scanner last = new Scanner(System.in);
		System.out.println("Please type your last name: ");
		String l = last.nextLine();
		
		//Prompts user for and stores salary value 
		Scanner salary = new Scanner(System.in);
		System.out.println("Please enter your yearly salary: ");
		double sal = salary.nextInt();
		
		//Prompts user for whether they are faculty or staff, or if they would like to quit 
		Scanner inp = new Scanner(System.in);
		System.out.println("\nType 'F' for access to faculty \\ or 'S' for access to staff \\ Press 'Q' to Quit");
		System.out.println("Enter choice: ");
		userInput = inp.next();
		
		
		//If the user selects Faculty, prompt them for the department 
	    if	(userInput.equalsIgnoreCase("F") || (userInput.equalsIgnoreCase("Faculty")))
	    {
	    
	    //Prompts user for what department they are in
		Scanner depart = new Scanner(System.in);
		System.out.println("What department are you currently working in?");
		String d = depart.nextLine();
		
		//Creates a new faculty class with first name, last name, department and salary
		UFaculty fac1 = new UFaculty(f, l, d, sal);
		
		//Outputs first name, last name, department, and salary
		System.out.println(fac1.toString());

		} 
	    
	    //If the user selects Staff, prompt them for the job title
	    else if(userInput.equalsIgnoreCase("S") || (userInput.equalsIgnoreCase("Staff")))
	    {
	    	
	    //Prompts user for their job title
		Scanner title = new Scanner(System.in);
		System.out.println("What is your job title?");
		String j = title.nextLine();
		
		//Creates a new staff class with first name, last name, salary and job title
		UStaff sta1 = new UStaff(f, l, sal, j);
		
		//Outputs first name, last name, salary and job title
		System.out.println(sta1.toString());
		
	    }
	    
	    }
	    
		//If the user selects Q, quit the program and do not prompt them further
	    while (userInput.equalsIgnoreCase("Q") || (userInput.equalsIgnoreCase("Quit")));
	    

	    	

		
	  }	
	   	
}

/* SCREEN DUMP

Welcome to the University of Calgary Employee Portal

Please type your first name: 
Surkhab
Please type your last name: 
Mundi
Please enter your yearly salary: 
69000

Type 'F' for access to faculty \ or 'S' for access to staff \ Press 'Q' to Quit
Enter choice: 
S
What is your job title?
Caretaker
Name: Surkhab Mundi
Salary: 69000.0
Staff Job: Caretaker




Welcome to the University of Calgary Employee Portal

Please type your first name: 
Ali
Please type your last name: 
Akbari
Please enter your yearly salary: 
45000

Type 'F' for access to faculty \ or 'S' for access to staff \ Press 'Q' to Quit
Enter choice: 
F
What department are you currently working in?
Biology 
Name: Ali Akbari
Salary: 45000.0
Current Department: Biology 

*/
		

	


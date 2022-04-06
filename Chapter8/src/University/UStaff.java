
/*
Program: UStaff.java          Last Date of this Revision: March 30, 2022
Purpose: To create a class that inherits the UEmployee class and that includes the member methods for storing and returning the job title.
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

package University;

//Staff class extends Employee class so that we can inherit the first name and last name and salary from Employee
public class UStaff extends UEmployee
{
	//Created a string for the job title of a staff member
	String jobTitle;
	
	//UStaff constructor method
	public UStaff(String f, String l, double sal, String j)
	{
		//Inherits first and last name, and salary
		super(f, l, sal);
		//Simplifies jobTitle variable to j 
		jobTitle = j;
	}
	
	//When returnJob is called upon, return jobTitle
	String returnJob()
	{
		return jobTitle;
	}
	
	//Returns job title
	public String toString()
	{
		return(super.toString() + "\nStaff Job: " + returnJob());
	}
	
}

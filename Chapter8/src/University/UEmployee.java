

/*
Program: UEmployee.java          Last Date of this Revision: March 29, 2022
Purpose: To create a class that contains variables for employee name and salary which can be inherited by other classes
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

package University;

//Created an abstract class because abstract classes act sort of like a template for other classes
public abstract class UEmployee 
{
	//Created a string for both first name and last name and yearly salary of the employees
	private String firstName;
	private String lastName;
	private double yearlySalary;
	
	//UEmployee constructor method
	public UEmployee(String f, String l, double sal) 
	{
		//Assigned firstname and lastname strings as f and l, and yearlySalary as sal, to simplify them
		firstName = f;
		lastName = l;
		yearlySalary = sal;
	}
	
	//Method returns first name and last name and salary
	public String toString()
	{
		return("Name: " + firstName + " " + lastName + "\nSalary: " + yearlySalary);
		
	}
		
	
}

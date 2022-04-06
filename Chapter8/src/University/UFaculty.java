package University;

/*
Program: UFaculty.java          Last Date of this Revision: March 29, 2022
Purpose: To create a class that inherits the UEmployee class and that includes the member methods for storing and returning the department name.
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Inherits UEmployee class
public class UFaculty extends UEmployee 
{
	
	//Created dept varable for Faculty
	String dept;
	
	public UFaculty(String f, String l, String d, double sal)
	{
		//Inherits first name and last name from UEmployee
		super(f, l, sal);
		
		//Simplifies yearlysalary to sal
		dept = d;
		
	}
	
	String toDept()
	{
		return(dept);
	}


	public String toString()
	{
		return(super.toString()+ "\n Current Department: " + toDept());
	}


	double pay(double period) {
		
		return 0;
	}
	
}
	
	
	

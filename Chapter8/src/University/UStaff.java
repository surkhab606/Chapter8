package University;

/*
Program: UStaff.java          Last Date of this Revision: March 30, 2022
Purpose: To create a class that inherits the UEmployee class and that includes the member methods for storing and returning the job title.
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

public class UStaff extends UEmployee
{
	String jobTitle;
	
	public UStaff(String f, String l, double sal, String j)
	{
		super(f, l, sal);
		jobTitle = j;
	}

	String returnJob()
	{
		return jobTitle;
	}
	
	public String toString()
	{
		return(super.toString() + "\n Staff Job: " + returnJob());
	}


	double pay(double period) {
		return 0;
	}
	
}

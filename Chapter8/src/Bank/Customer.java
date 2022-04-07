
/*
Program: Customer.java          Last Date of this Revision: April 4, 2022
Purpose: To create a class that will be inherited by the Account class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/
package Bank;

public class Customer 
{
	private String firstName, lastName, street, city, province, zip;
	
	public Customer(String fn, String ln, String str, String c, String prov, String z)
	{
		firstName = fn;
		lastName = ln;
		street = str; 
		city = c;
		province = prov; 
		zip = z;
		
	}
	
	public String toString()
	{
		String custString;
		
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + province + " " + zip + "\n";
		return(custString);
	}
}

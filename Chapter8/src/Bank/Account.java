
/*
Program: Account.java          Last Date of this Revision: April 4, 2022
Purpose: To create a class that will be inherited by the PersonalAcct and BusinessAcct classes
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

package Bank;

public class Account 
{
	private double accountBalance;
	private Customer cus;
	
	public Account(double bal, String fn, String ln, String str, String city, String prov, String zip)
	{
		accountBalance = bal;
		cus = new Customer(fn, ln, str, city, prov, zip);
	}

}

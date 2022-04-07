
/*
Program: BusinessAccount.java          Last Date of this Revision: April 5, 2022
Purpose: To create a business account class that will be inherited by the Account class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

package Bank;

public class BusinessAcct extends Account
{
	public BusinessAcct(double bal, String fn, String ln, String str, String zip, String city, String prov)
	{
		super(bal, fn, ln, str, zip, city, prov);
	}
	
		
}


/*
Program: BusinessAccount.java          Last Date of this Revision: April 5, 2022
Purpose: To create a business account class that will be inherited by the Account class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Put this class into the Bank package
package Bank;

//BusinessAcct inherits Account class
public class BusinessAcct extends Account
{
	//Constructor method
	public BusinessAcct(double bal, String fn, String ln, String str, String zip, String city, String prov)
	{
		super(bal, fn, ln, str, zip, city, prov);
	}
	
		
}

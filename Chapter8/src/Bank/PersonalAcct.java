
/*
Program: PersonalAcct.java          Last Date of this Revision: April 5, 2022
Purpose: To create a personal account class that will be inherited by the Account class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Put this class into the Bank package
package Bank;

//Personal account inherits Account class
public class PersonalAcct extends Account
{
	
	//Constructor method
	public PersonalAcct(double bal, String fn, String ln, String str, String city, String prov, String z) 
	{
		super(bal, fn, ln, str, city, prov, z);
	}
}

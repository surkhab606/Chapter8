
/*
Program: Account.java          Last Date of this Revision: April 4, 2022
Purpose: To create a class that will be inherited by the PersonalAcct and BusinessAcct classes
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Put this class into the Bank package
package Bank;

import java.text.NumberFormat;

public class Account 
{
	//account balance variable 
	private double accountBalance;
	private Customer cust;
	
	
	//Constructor method
	public Account(double bal, String fn, String ln, String str, String city, String prov, String z)
	{
		//Simplifies accountBalance to bal
		accountBalance = bal;
		cust = new Customer(fn, ln, str, city, prov, z);
	}
	
	//Returns account balance
	public double getAccountBalance() 
	{
		return(accountBalance);
	}
	
	//Returns a string that displays current account balance
	public String toString() 
	{
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		accountString = cust.toString();
		accountString += "Current balance of your account is: " + money.format(accountBalance);
		return(accountString);
	}
	

	
	
	
	}


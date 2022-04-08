
/*
Program: Account.java          Last Date of this Revision: April 4, 2022
Purpose: To create a class that will be inherited by the PersonalAcct and BusinessAcct classes
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

package Bank;

import java.text.NumberFormat;

public class Account 
{
	private double accountBalance;
	private Customer cust;
	
	public Account(double bal, String fn, String ln, String str, String city, String prov, String z)
	{
		accountBalance = bal;
		cust = new Customer(fn, ln, str, city, prov, z);
	}
	
	public double getAccountBalance() 
	{
		return(accountBalance);
	}

	public void deposit(double amt)
	{
		accountBalance += amt;
		
	}
	
	public void withdrawl(double amt)
	{
		if (amt <= accountBalance) 
		{
			accountBalance -= amt;
		} else 
		{
			System.out.println("Not enough money in your account.");
		}
	}
		
	public String toString() 
	{
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		accountString = cust.toString();
		accountString += "Current balance of your account is: " + money.format(accountBalance);
		return(accountString);
	}
	

	
	
	
	}


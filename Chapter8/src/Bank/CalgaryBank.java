
/*
Program: CalgaryBank.java          Last Date of this Revision: April 5, 2022
Purpose: To create a class that will test the Account, PersonalAccount and BusinessAccount class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Put this class into the Bank package
package Bank;

import java.util.Scanner;

//CalgaryBank class inherits Account class
public class CalgaryBank extends Account

{
	
	//Constructor method
	public CalgaryBank(double bal, String fn, String ln, String str, String city, String zip, String prov)
	{
		super(bal, fn, ln, str, zip, city, prov);
		
	}

	//Main method
	public static void main(String[] args)
	{
		//userInput variable
		String userInput;
		
		do 
		{
			//Basic text for a more professional look
			System.out.println("Welcome to the Bank of Calgary");
			System.out.println("\nPlease enter your details as you are prompted.");
			
			
			//Prompts user for their first name
			Scanner firstName = new Scanner(System.in);
			System.out.println("\nPlease enter your first name: ");
			String fname = firstName.nextLine();
			
			//Prompts user for their last name
			Scanner lastName = new Scanner(System.in);
			System.out.println("Please enter your last name: ");
			String lname = lastName.nextLine();
			
			//Prompts user for their city
			Scanner city = new Scanner(System.in);
			System.out.println("Please enter the city you currently reside in: ");
			String ci = city.nextLine();
			
			//Prompts user for their street
			Scanner street = new Scanner(System.in);
			System.out.println("Please enter the street you currently reside on: ");
			String st = street.nextLine();
			
			//Prompts user for their zip code
			Scanner zip = new Scanner(System.in);
			System.out.println("Please enter your zip code: ");
			String z = zip.nextLine();
			
			//Prompts user for their province
			Scanner province = new Scanner(System.in);
			System.out.println("Please enter the province you currently reside in: ");
			String p = province.nextLine();
			
			//Prompts user for whether they would like to access their personal account or business account or to quit
			Scanner accInput = new Scanner(System.in);
			System.out.println("Would you like to check your Personal or Business account? Press 'P' for personal and 'B' for business.");
			System.out.println("\nIf you would like to quit, please press 'Q' to quit.");
			userInput = accInput.next();
			
			//If the user inputs P, display personal account
			if (userInput.equalsIgnoreCase("P")) 
			{
			
			//Prompts user for their account balance
			Scanner pBal = new Scanner(System.in);
			System.out.println("Please enter the balance of your Personal Account: "); 
			double accountBalance = pBal.nextDouble();
			
			//Assigns variables to a new personal account class
			Account pact = new PersonalAcct(accountBalance, fname, lname, st, ci, p, z);
			
			
			//If the accountBalance is under $100, charge 2 dollars to the account
			if (accountBalance < 100) 
			{
				
				accountBalance = accountBalance - 2; 
				
				System.out.println("Your balance is under 100 dollars. 2 dollars must be charged to your account.");
				
			}
			
			//Print out account owner's name, balance and address
			System.out.println("Account owner: " + fname + " " +  lname + "\nThe current balance of your account is: " + accountBalance + "\nThe current address of the account owner is: \n" + ci + " " +  st + " " + z + " " + p); 
			
			}
			
			//If the user inputs B, display business account
			if (userInput.equalsIgnoreCase("B"))  
			{
			
			//Prompts user for their account balance
			Scanner bBal = new Scanner(System.in);
			System.out.println("Please enter the balance of your Business Account: "); 
			double businessBalance = bBal.nextDouble();
			
			//Assigns variables to a new business account class
			Account bact = new BusinessAcct(businessBalance, fname, lname, st, ci, p, z);
			
			//If the accountBalance is under $500, charge $10 to the account
			if (businessBalance < 500) 
			{
				
				businessBalance = businessBalance - 10; 
				
				System.out.println("Your balance is under 500 dollars. 10 dollars must be charged to your account.");
				
			}
			
			//Print out account owner's name, balance and address
			System.out.println("Account owner: " + fname + " " +  lname + "\nThe current balance of your account is: " + businessBalance + "\nThe current address of the account owner is: \n" + ci + " " +  st + " " + z); 
			
			
			
				}
			}
		
			//If the user inputs Q, quit the program
			while (userInput.equalsIgnoreCase("Q"));
		
		
			}
		}

/* SCREEN DUMP

Please enter your details as you are prompted.

Please enter your first name: 
Surkhab
Please enter your last name: 
Mundi
Please enter the city you currently reside in: 
Calgary
Please enter the street you currently reside on: 
46 Panorama Hills
Please enter your zip code: 
T3K4N3
Please enter the province you currently reside in: 
Alberta
Would you like to check your Personal or Business account? Press 'P' for personal and 'B' for business.

If you would like to quit, please press 'Q' to quit.
P
Please enter the balance of your Personal Account: 
65
Your balance is under 100 dollars. 2 dollars must be charged to your account.
Account owner: Surkhab Mundi
The current balance of your account is: 63.0
The current address of the account owner is: 
Calgary 46 Panorama Hills T3K4N3 Alberta


Welcome to the Bank of Calgary

Please enter your details as you are prompted.

Please enter your first name: 
Ali
Please enter your last name: 
Akbari
Please enter the city you currently reside in: 
Calgary
Please enter the street you currently reside on: 
244 Coventry Hills Circle
Please enter your zip code: 
T3JXN4
Please enter the province you currently reside in: 
Alberta
Would you like to check your Personal or Business account? Press 'P' for personal and 'B' for business.

If you would like to quit, please press 'Q' to quit.
B
Please enter the balance of your Business Account: 
499
Your balance is under 500 dollars. 10 dollars must be charged to your account.
Account owner: Ali Akbari
The current balance of your account is: 489.0
The current address of the account owner is: 
Calgary 244 Coventry Hills Circle T3JXN4 Alberta





*/
		

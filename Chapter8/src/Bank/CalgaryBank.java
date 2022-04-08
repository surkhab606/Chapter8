
/*
Program: CalgaryBank.java          Last Date of this Revision: April 5, 2022
Purpose: To create a class that will test the Account, PersonalAccount and BusinessAccount class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

package Bank;
import java.util.Scanner;

public class CalgaryBank extends Account

{
	public CalgaryBank(double bal, String fn, String ln, String str, String city, String zip, String prov)
	{
		super(bal, fn, ln, str, zip, city, prov);
		
	}

	public static void main(String[] args)
	{
		String userInput;
		
		do 
		{
			System.out.println("Welcome to the Bank of Calgary");
			System.out.println("\nPlease enter your details as you are prompted.");
			
			
			Scanner firstName = new Scanner(System.in);
			System.out.println("\nPlease enter your first name: ");
			String fname = firstName.nextLine();
			
			
			Scanner lastName = new Scanner(System.in);
			System.out.println("Please enter your last name: ");
			String lname = lastName.nextLine();
			
			
			Scanner city = new Scanner(System.in);
			System.out.println("Please enter the city you currently reside in: ");
			String ci = city.nextLine();
			
			
			Scanner street = new Scanner(System.in);
			System.out.println("Please enter the street you currently reside on: ");
			String st = street.nextLine();
			
			
			Scanner zip = new Scanner(System.in);
			System.out.println("Please enter your zip code: ");
			String z = zip.nextLine();
			
			Scanner province = new Scanner(System.in);
			System.out.println("Please enter the province you currently reside in: ");
			String p = province.nextLine();
			
			Scanner accInput = new Scanner(System.in);
			System.out.println("Would you like to check your Personal or Business account? Press 'P' for personal and 'B' for business.");
			System.out.println("\nIf you would like to quit, please press 'Q' to quit.");
			userInput = accInput.next();
			
			
			if (userInput.equalsIgnoreCase("P")) 
			{
			
			Scanner pBal = new Scanner(System.in);
			System.out.println("Please enter the balance of your Personal Account: "); 
			double accountBalance = pBal.nextDouble();
			

			Account pact = new PersonalAcct(accountBalance, fname, lname, st, ci, p, z);
			
			if (accountBalance < 100) 
			{
				
				accountBalance = accountBalance - 2; 
				
				System.out.println("Your balance is under 100 dollars. 2 dollars must be charged to your account.");
				
			}
		
			System.out.println("Account owner: " + fname + " " +  lname + "\nThe current balance of your account is: " + accountBalance + "\nThe current address of the account owner is: \n" + ci + " " +  st + " " + z); 
			
			}
			

			if (userInput.equalsIgnoreCase("B"))  
			{
			
			Scanner bBal = new Scanner(System.in);
			System.out.println("Please enter the balance of your Business Account: "); 
			double businessBalance = bBal.nextDouble();
			
			
			Account bact = new BusinessAcct(businessBalance, fname, lname, st, ci, p, z);
			

			if (businessBalance < 500) 
			{
				
				businessBalance = businessBalance - 10; 
				
				System.out.println("Your balance is under 500 dollars. 10 dollars must be charged to your account.");
				
			}
		
			System.out.println("Account owner: " + fname + " " +  lname + "\nThe current balance of your account is: " + businessBalance + "\nThe current address of the account owner is: \n" + ci + " " +  st + " " + z); 
			
			
			
				}
			}
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
Calgary 46 Panorama Hills T3K4N3




*/
		

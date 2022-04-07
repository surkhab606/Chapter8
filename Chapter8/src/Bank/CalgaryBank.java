
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
			System.out.println("Please enter your details as you are prompted.");
			
			
			Scanner firstName = new Scanner(System.in);
			System.out.println("Please enter your first name: ");
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
			System.out.println("Press 'Q' to quit.");
			userInput = accInput.next();
			
			
			if (userInput.equalsIgnoreCase("P")) 
			{
			
			Scanner pBal = new Scanner(System.in);
			System.out.println("Please enter the balance of your Personal Account?"); 
			double accountBalance = pBal.nextDouble();
			

			Account pct = new PersonalAcct(pBal, fname, lname, st, ci, p, z);
			
			if (pBal < 100) 
			{
				
				pBal = pBal - 2; 
				
				System.out.println("Your balance is under 100 dollars. 2 dollars must Be Charged to your account.");
				
			}
			

			
			System.out.println("Account Holder: " + fnam + " " +  lnam + "\nThe Balance of the Personal Account is: " + balance
					+ "\nThe Account Holder lives in: \n" + ct + " " +  street + " " + zp); 
			
			
			
			
			}
			
			
			
			
			//if the user wants to check their business account
			if (action.equalsIgnoreCase("B") || (action.equalsIgnoreCase("Business"))) {
			
				
				
			//ask the user for the balance of their account	
			Scanner input2 = new Scanner(System.in);
			System.out.println("What is the balance of your Business Account?"); 
			double balance1 = input2.nextDouble();
			
			
			
			
			//assign variable bct to a new BusinessAcct Class with variables from 
			//user input
			Account bct = new BusinessAcct(balance1, fnam, lnam, null, ct, street, zp);
			
			
			
			
			//check if the users balance is less than 500 dollars
			//if so charge 10 dollars to the account
			if (balance1 < 500) 
			{
				
				balance1 = balance1 - 10; 
				
				System.out.println("Balance is under 500 Dollars, 10 Dollars Must Be Charged to the Account");
				
				
			}
			
			
			
			//print out first name, last name, address, and their balance
			System.out.println("Account Holder: " + fnam + " " +  lnam + "\nThe Balance of the Business Account is: " + balance1 
					+ "\nThe Account Holder lives in: \n" + ct + " " +  street + " " + zp); 
			
			
			
		}
			}
			
			
			//if the user chooses to quit then exit the program
			while (action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
		}
	}
			
		}
	}


	
	
	
}

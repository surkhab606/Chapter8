/*
Program: Hockey.java          Last Date of this Revision: March 28, 2022
Purpose: Test the Puck1 class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/
import java.util.Scanner;

//Hockey class inherits Puck1 class
public class Hockey extends Puck1
{

	//Hockey constructor class which inherits wei from Puck1 class
	public Hockey(double wei) 
	{
		super(wei);
		
	}
	
	public static void main(String[] args) 
	{
		
		//Prompts user for first puck weight and gets user input
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the first puck's weight. It should be between 4 and 5.5 ounces."); 
		double userInput = inp.nextDouble();
		
		
		//Prompts user for second puck weight and gets user input 
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter the second puck's weight. It should also be between 4 and 5.5 ounces.");
		double userInput2 = inp2.nextDouble();
	
		
		//p1 and p2 assigned to corresponding userInput
		Puck1 p1 = new Puck1(userInput);
		Puck1 p2 = new Puck1(userInput2);
		
		//Print out puck weight and classification
		System.out.println("First puck: " + p1.toString());
		System.out.println("Second puck: " + p2.toString());
		
		//If the two pucks have equal weight, print out the puck weights are equal
		if (p1.equals(p2) == true) 
			 
		 {
			 System.out.println("The puck weights are equal."); 
		 }
		//If the two pucks do not have equal weight, print out the puck weights are not equal
		 else 
		 {
			 System.out.println("The puck weights are not equal."); 
		 }
		
		//Prompts user for first spot weight and gets user input
		Scanner inp3 = new Scanner(System.in);
		System.out.println("Enter the first spot's weight. It should be between 4 and 5.5 ounces."); 
		double userInput3 = inp3.nextDouble();
		
		
		//Prompts user for second spot weight and gets user input
		Scanner inp4 = new Scanner(System.in);
		System.out.println("Enter the second spot's weight. It should be between 4 and 5.5 ounces as well.");
		double userInput4 = inp4.nextDouble();
		
		
		//spot1 and spot2 assigned to corresponding userInput
		Puck1 spot1 = new Puck1(userInput3);
		Puck1 spot2 = new Puck1(userInput4);
		
		//Compare the two spots and output the corresponding statement based on if the spots are equal, bigger or smaller in relation to each other
		 if (spot1.compareTo(spot2) == 0) 
		 {
			  
			
			 System.out.println("Both spots are equal.");
			 
		 }
		 else if (spot1.compareTo(spot2) < 0)
		 {
			
			 System.out.println("The first spot is smaller than the second spot.");
		 }
		 else 
		 {
			
			 System.out.println("The second spot is smaller than the first spot.");
		 }
	}
	
	

}

/* SCREEN DUMP
Enter the first puck's weight. It should be between 4 and 5.5 ounces.
4
Enter the second puck's weight. It should also be between 4 and 5.5 ounces.
5
First puck: Puck weight is equal to 4.0 ounces and puck size is youth.
Second puck: Puck weight is equal to 5.0 ounces and puck size is standard.
The puck weights are not equal.
Enter the first spot's weight. It should be between 4 and 5.5 ounces.
4
Enter the second spot's weight. It should be between 4 and 5.5 ounces as well.
4
Both spots are equal.







Enter the first puck's weight. It should be between 4 and 5.5 ounces.
4.5
Enter the second puck's weight. It should also be between 4 and 5.5 ounces.
4.5
First puck: Puck weight is equal to 4.5 ounces and puck size is youth.
Second puck: Puck weight is equal to 4.5 ounces and puck size is youth.
The puck weights are equal.
Enter the first spot's weight. It should be between 4 and 5.5 ounces.
6
Enter the second spot's weight. It should be between 4 and 5.5 ounces as well.
5
The second spot is smaller than the first spot.

*/
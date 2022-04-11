/*
Program: Dealership.java          Last Date of this Revision: April 11, 2022
Purpose: To create a Dealership class that will test the Vehicle class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Class is in CarDealership package
package CarDealership;

import java.util.Scanner;

public class Dealership 
{
	//Main Method
	public static void main(String[] args)
	{
		//Get input from user
		String userInput;
		
		do 
		{
			Scanner inp = new Scanner(System.in);
			
			//Basic text for a more professional look
			System.out.println("Welcome to Mercedes-Benz");

			//Prompt user to see if they would like to check a car, truck, minivan or sports car, or to quit.
			System.out.println("\nWould you like to look at a car (C), truck (T), minivan (M), or sports car (S) or quit(Q).");
			System.out.println("Enter choice: ");
			userInput = inp.next();
			
		//If the user inputs C or Car, look at a car.
		if (userInput.equalsIgnoreCase("C") || (userInput.equalsIgnoreCase("Car"))) 
		{
				//Assign variable c to a new Car class with fuel economy, seating, storage capacity and top speed
				Car c = new Car (30, 42, 5, 137, 55);
				
				
				//Print out new car
				System.out.println(c.toString());
		}
				
		//If the user inputs T or Truck, look at a truck.
		if (userInput.equalsIgnoreCase("T") || (userInput.equalsIgnoreCase("Truck"))) 
		{
				//Assign variable t to a new Truck class with fuel economy, seating, storage capacity and top speed
				Truck t = new Truck (16, 20, 4, 145, 89);
						
				//Print out new truck
				System.out.println(t.toString());
		}
		
		//If the user inputs M or Minivan, look at a minivan.
		if (userInput.equalsIgnoreCase("M") || (userInput.equalsIgnoreCase("Minivan"))) 
		{
			//Assign variable m to new Minivan class with fuel economy, seating, storage capacity and top speed
			Minivan m = new Minivan (29, 36, 8, 112, 140);
			
			//Print out new minivan
			System.out.println(m.toString());
		}
		//If the user inputs S or Sports Car, look at a sports car.
		if (userInput.equalsIgnoreCase("S") || (userInput.equalsIgnoreCase("Sports Car"))) 
		{
			//Assign variable s to new SportsCar class with fuel economy, seating, storage capacity and top speed
			SportsCar s = new SportsCar (12, 19, 2, 175, 35);
				
			//Print out new SportsCar
			System.out.println(s.toString());
		}	
		
		}
		//If the userInputs Q or Quit, quit the program.
		while (userInput.equalsIgnoreCase("Q") || (userInput.equalsIgnoreCase("Quit")));
	}
}

/* SCREEN DUMP
Welcome to Mercedes-Benz

Would you like to look at a car (C), truck (T), minivan (M), or sports car (S) or quit(Q).
Enter choice: 
S

The city fuel economy for this sports car is 12 miles per gallon.
The highway fuel economy for this sports car is 19 miles per gallon.
This sports car can seat up to 2 people.
Cargo volume is: 35.0 cubic feet.
The top speed of this sports car is 175 miles per hour.
A sports car is the perfect choice for adrenaline junkies. They can only seat up to two people, with small storage space and bad fuel economies, but they have expert handling, gorgeous looks and a mind-bending top speed.


Welcome to Mercedes-Benz

Would you like to look at a car (C), truck (T), minivan (M), or sports car (S) or quit(Q).
Enter choice: 
T

The city fuel economy for this truck is 16 miles per gallon.
The highway fuel economy for this truck is 20 miles per gallon.
This truck can seat up to 4 people.
Cargo volume is: 89.0 cubic feet.
The top speed of this truck is 145 miles per hour.
A truck is a more expensive option for specific individuals. Trucks have a lot of storage space and power, but can still seat to four individuals. Their fuel economy is not the best.





*/
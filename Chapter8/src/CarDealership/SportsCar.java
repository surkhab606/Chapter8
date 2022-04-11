/*
Program: Minivan.java          Last Date of this Revision: April 11, 2022
Purpose: To create a SportsCar class that will inherit the vehicle class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Class is in CarDealership package
package CarDealership;

//SportsCar class inherits Vehicle class
public class SportsCar extends Vehicle
{
		//Constructor method
		public SportsCar(int fECity, int fEHwy, int seating, int speed, double cargo) 
		{
			super(fECity, fEHwy, seating, speed, cargo);
		}
		
		//Returns cargo size
		String cargoContainer() 
		{
			return ("\nCargo volume is: " + super.getCargoVolume() + " cubic feet.");
		}

		//Returns car description
		String description() 
		{
			return ("\nA sports car is the perfect choice for adrenaline junkies. They can only seat up to two people, with small storage space and bad fuel economies, but they have expert handling, gorgeous looks and a mind-bending top speed.");
		}
		
		//Returns seating capacity
		String SeatingCapacity()
		{
			return("\nThis sports car can seat up to " + super.getSeating() + " people.");
		}

		//Returns fuel economy in the city
		String FuelCity()
		{
			return("\nThe city fuel economy for this sports car is " + super.getFECity() + " miles per gallon.");
		}
		
		//Returns fuel economy on the highway
		String FuelHighway()
		{
			return("\nThe highway fuel economy for this sports car is " + super.getFEHwy() + " miles per gallon.");
		}
		
		//Returns top speed
		String TopSpeed()
		{
			return("\nThe top speed of this sports car is " + super.getTopSpeed() + " miles per hour.");
		}
		
		//Returns a string statement with fuel economies, seating capacity, cargo capacity and a description of the car.
		public String toString() 
		{
			return(FuelCity() + FuelHighway() + SeatingCapacity() + cargoContainer() + TopSpeed() + description());

		}
}

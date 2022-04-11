/*
Program: Truck.java          Last Date of this Revision: April 11, 2022
Purpose: To create a Truck class that will inherit the vehicle class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Class is in CarDealership package
package CarDealership;

//Truck class inherits vehicle class
public class Truck extends Vehicle
{
	//Constructor method
	public Truck(int fECity, int fEHwy, int seating, int speed, double cargo) 
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
			return ("\nA truck is a more expensive option for specific individuals. Trucks have a lot of storage space and power, but can still seat to four individuals. Their fuel economy is not the best.");
		}
		
		//Returns seating capacity
		String SeatingCapacity()
		{
			return("\nThis truck can seat up to " + super.getSeating() + " people.");
		}

		//Returns fuel economy in the city
		String FuelCity()
		{
			return("\nThe city fuel economy for this truck is " + super.getFECity() + " miles per gallon.");
		}
		
		//Returns fuel economy on the highway
		String FuelHighway()
		{
			return("\nThe highway fuel economy for this truck is " + super.getFEHwy() + " miles per gallon.");
		}
		
		//Returns top speed
		String TopSpeed()
		{
			return("\nThe top speed of this truck is " + super.getTopSpeed() + " miles per hour.");
		}
		
		//Returns a string statement with fuel economies, seating capacity, cargo capacity and a description of the car.
		public String toString() 
		{
			return(FuelCity() + FuelHighway() + SeatingCapacity() + cargoContainer() + description() + TopSpeed());

		}
	
	
	
}

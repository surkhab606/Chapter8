/*
Program: Minivan.java          Last Date of this Revision: April 11, 2022
Purpose: To create a Minivan class that will inherit the vehicle class
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/

//Class is in CarDealership package
package CarDealership;

//Minivan class inherits Vehicle class
public class Minivan extends Vehicle 
{
	//Constructor method
	public Minivan(int fECity, int fEHwy, int seating, int speed, double cargo) 
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
				return ("\nA minivan is the perfect choice for families. They can seat up to eight people, with great storage space and respectable fuel economy.");
			}
			
			//Returns seating capacity
			String SeatingCapacity()
			{
				return("\nThis minivan can seat up to " + super.getSeating() + " people.");
			}

			//Returns fuel economy in the city
			String FuelCity()
			{
				return("\nThe city fuel economy for this minivan is " + super.getFECity() + " miles per gallon.");
			}
			
			//Returns fuel economy on the highway
			String FuelHighway()
			{
				return("\nThe highway fuel economy for this minivan is " + super.getFEHwy() + " miles per gallon.");
			}
			
			//Returns top speed
			String TopSpeed()
			{
				return("\nThe top speed of this minivan is " + super.getTopSpeed() + " miles per hour.");
			}
			
			//Returns a string statement with fuel economies, seating capacity, cargo capacity and a description of the car.
			public String toString() 
			{
				return(FuelCity() + FuelHighway() + SeatingCapacity() + cargoContainer() + description() + TopSpeed());

			}
}

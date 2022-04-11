
/*
Program: Puck1.java          Last Date of this Revision: March 27, 2022
Purpose: To inherit methods from the Disk class and return the classification of a puck's size as entered by the user.
Author: Surkhab Mundi 
School: CHHS
Course: Computer Science 30
 
*/
package PuckPackage;

//Inherit disk class, implments Comparable so that spots can be compared
public class Puck1 extends Disk implements Comparable<Puck1>
{
	//A double variable is used for weight because we need a decimal input by the user
	private double weight;
	
	//Boolean variables are used as youth and standard need to be set to true or false based on user input
	private boolean youth;
	private boolean standard; 

	//Puck1 class with wei (weight) as the argument
	public Puck1 (double wei)
	{
		//Weight is equal to wei for simplicity purposes
		weight = wei;
		
		//If the weight inputted is between 4 and 4.5, assign the puck as youth
		if(wei >=4&&wei<=4.5) 
		{
			standard = false;
			youth = true;
		}
		//If the weight inputted is between 5 and 5.5, assign the puck as standard
		if(wei >= 5&& wei<= 5.5) 
		{
			standard = true;
			youth = false;
		}
		
		//If the weight inputted is smaller than 4 and bigger than 5.5, assign the puck as neither youth nor standard.
		if (wei > 5.5&&wei < 4) {
			standard = false;	
			youth = false;
		}
	}
	
	//Method to return weight
	public double getWeight() 
	{
		return weight;
	}
	
	//This method displays text based on the boolean values of standard and youth.
	public String getDivision() 
	{
		//puckSize string created
		String puckSize = null;
		
		//If standard was true above display standard.
		if (standard == true) 
		{
			puckSize = "standard.";
		} 
		//If youth was true above display youth.
		if (youth == true) 
		{
			puckSize = "youth.";
		}
		//If neither youth nor standard were true display neither youth nor standard.
		else if (youth == false&&standard == false)
		{
			puckSize = "neither youth nor standard.";	
		}
		return puckSize;
	}
		
	//String method outputs weight (getWeight) & puck classification (getDivison)
	public String toString()
	{
		String puckWeight;
		puckWeight = "Puck weight is equal to " + getWeight() + " ounces" + " and puck size is " + getDivision();
		return(puckWeight);
	}
	
	//Method to check if pucks inputted are equal to each other
	public boolean equals(Object obj) 
	{
		Puck1 Obj = (Puck1)obj;
		
		if(Obj.getDivision() == getDivision()) 
		{
			return(true);	
		} 
		else 
		{
			return(false);
			}
		}
	
	//Method compares two objects
	public int compareTo(Puck1 ob)
	{
		Puck1 test = (Puck1)ob;
		
		if (weight < test.getWeight())
		{
			return(-1);
		}
		else if (weight == test.getWeight())
		{
			return(0);
		}
		else
		{
			return(1);
		}
	}
}

	



public class Puck1 extends Disk
{
	private double weight;
	private boolean youth;
	private boolean standard; 
	private String puckSize;
	
	public Puck1 (double wei)
	{
		weight = wei;
		if(wei >=4&&wei<=4.5) {
			standard = false;
			youth = true;
		} else {
			standard = true;
			youth = true;
		}
	}
	
	public double getWeight() 
	{
		return weight;
	}
	
	public String getDivision() 
	{
		if (standard) {
			puckSize = "standard.";
		} else {
			puckSize = "youth.";
		}
		return(puckSize);
		}
	
	
	public boolean equals(Object obj) 
	{
		Puck1 Obj = (Puck1)obj;
		
		if(Obj.getDivision() == getDivision()) 
		{
			return(true);	
		} else {
			return(false);
			}
		}
	
	
	public String toString()
	{
		String puckWeight;
		puckWeight = "Puck weight is equal to " + getWeight() + " ounces" + " and puck size is " + getDivision();
		return(puckWeight);
	}
}


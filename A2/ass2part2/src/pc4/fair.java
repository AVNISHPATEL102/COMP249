// ----------------------------------------------------------  
// Assignment 2
// Part 2
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc4;

import pc1.Event;

public class fair extends Event 
{

	private int exibitors;
	public enum type{ career , science , trade , travel }
	private type t;
	
	
	public fair()
	{
		super();
		this.exibitors=0;
		t=null;
	}
	public fair(int year,int month,int noOfCities,int exibitors,type t)
	{
		super(year,month,noOfCities);
		this.exibitors=exibitors;
		this.t=t;
	}
	public fair(fair e)
	{
		super(e.getYear(),e.getMonth(),e.getNoOfCities());
		this.exibitors=e.exibitors;
		this.t=e.t;
	}
	public void setExibitors(int exibitors)
	{
		this.exibitors=exibitors;
	}
	public void setT(type t)
	{
		this.t=t;
	}
	public int getExibitors()
	{
		return this.exibitors;
	}
	public type getT()
	{
		return this.t;
	}
	
	public String toString()
	{
		return "This fair is going to be held in year " + super.getYear() + " and month " + super.getMonth() + 
				" and will be held in " + super.getNoOfCities() + " cities is of type " + this.t + " and has " 
				+ this.exibitors + " of exibitors";
	}
	
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		fair c = (fair) ob;
        if (exibitors == c.exibitors && t == c.t && super.getYear() == c.getYear() && super.getNoOfCities() == c.getNoOfCities() && super.getMonth() == c.getMonth()) 
        {
            return true;
        }
        else
        {
            return false;
        }
	}
	
	
}

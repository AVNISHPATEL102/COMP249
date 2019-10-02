// ----------------------------------------------------------  
// Assignment 2
// Part 1
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc4;

import pc1.Event;

public class fair extends Event 
{

	public int exibitors;
	public enum type{ career , science , trade , travel }
	type t;
	
	
	public fair()
	{
		this.year = 0;
		this.month = 0;
		this.noOfCities = 0;
		this.exibitors=0;
		t=null;
	}
	public fair(int year,int month,int noOfCities,int exibitors,type t)
	{
		this.year=year;
		this.month=month;
		this.noOfCities = noOfCities;
		this.exibitors=exibitors;
		this.t=t;
	}
	public fair(fair e)
	{
		this.year=e.year;
		this.month = e.month;
		this.noOfCities = e.noOfCities;
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
		return "This fair is going to be held in year " + this.year + " and month " + this.month + 
				" and will be held in " + this.noOfCities + " cities is of type " + this.t + " and has " 
				+ this.exibitors + " of exibitors";
	}
	
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		fair c = (fair) ob;
        if (exibitors == c.exibitors && t == c.t && year == c.year && noOfCities == c.noOfCities && month == c.month) 
        {
            return true;
        }
        else
        {
            return false;
        }
	}
	
	
}

// ----------------------------------------------------------  
// Assignment 2
// Part 1
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc2;

import pc1.Event;

public class Festival extends Event
{

	protected String name;
	protected double ticketPrice;
	protected int duration;
	
	public Festival()
	{
		this.name ="";
		this.ticketPrice = 0.0;
		this.duration = 0;
		this.year = 0;
		this.month = 0;
		this.noOfCities = 0;
	}
	
	public Festival(int year,int month,int noOfCities,String name,double ticketPrice,int duration)
	{
		this.name=name;
		this.ticketPrice = ticketPrice;
		this.duration=duration;
		this.year=year;
		this.month=month;
		this.noOfCities = noOfCities;
	}
	
	public Festival(Festival e)
	{
		this.name=e.name;
		this.ticketPrice=e.ticketPrice;
		this.duration=e.duration;
		this.year=e.year;
		this.month = e.month;
		this.noOfCities = e.noOfCities;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setTicketPrice(double ticketPrice)
	{
		this.ticketPrice=ticketPrice;
	}
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	public String getName()
	{
		return this.name;
	}
	public double getTicketPrice()
	{
		return this.ticketPrice;
	}
	public int duration()
	{
		return this.duration;
	}
	
	public String toString()
	{
		return "This " + this.name + " Festival will be held in " + this.year + ","+this.month + " in " + this.noOfCities +" cities, for "
				+ this.duration + " days, the ticket will cost " + this.ticketPrice ;
	}
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		Festival c = (Festival) ob;
        if (name.equals(c.name) && ticketPrice == c.ticketPrice && duration == c.duration && year == c.year && noOfCities == c.noOfCities && month == c.month) 
        {
            return true;
        }
        else
        {
            return false;
        }
	}
}

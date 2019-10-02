// ----------------------------------------------------------  
// Assignment 2
// Part 2
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc2;

import pc1.Event;

public class Festival extends Event
{

	private String name;
	private double ticketPrice;
	private int duration;
	
	public Festival()
	{
		super();
		this.name ="";
		this.ticketPrice = 0.0;
		this.duration = 0;
		
	}
	
	public Festival(int year,int month,int noOfCities,String name,double ticketPrice,int duration)
	{
		super(year,month,noOfCities);
		this.name=name;
		this.ticketPrice = ticketPrice;
		this.duration=duration;
		
	}
	
	public Festival(Festival e)
	{
		super(e.getYear(),e.getMonth(),e.getNoOfCities());
		this.name=e.name;
		this.ticketPrice=e.ticketPrice;
		this.duration=e.duration;
		
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
	public int getDuration()
	{
		return this.duration;
	}
	
	public String toString()
	{
		return "This " + this.name + " Festival will be held in " + super.getYear() + ","+ super.getMonth() + " in " + super.getNoOfCities() +" cities, for "
				+ this.duration + " days, the ticket will cost " + this.ticketPrice ;
	}
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		Festival c = (Festival) ob;
        if (name.equals(c.name) && ticketPrice == c.ticketPrice && duration == c.duration && super.getYear() == c.getYear() && super.getNoOfCities() == c.getNoOfCities() && super.getMonth() == c.getMonth()) 
        {
            return true;
        }
        else
        {
            return false;
        }
	}
}


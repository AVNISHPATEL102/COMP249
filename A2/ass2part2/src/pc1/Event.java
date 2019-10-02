// ----------------------------------------------------------  
// Assignment 2
// Part 2
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc1;

public class Event 
{

	private int year;
	private int month;
	private int noOfCities;
	
	public Event()
	{
		this.year = 0;
		this.month = 0;
		this.noOfCities = 0;
	}
	public Event(int year,int month,int noOfCities)
	{
		this.year=year;
		this.month=month;
		this.noOfCities = noOfCities;
	}
	public Event(Event e)
	{
		this.year=e.year;
		this.month = e.month;
		this.noOfCities = e.noOfCities;
	}
	
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public void setNoOfCities(int noOfCities)
	{
		this.noOfCities = noOfCities;
	}
	public int getYear()
	{
		return this.year;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getNoOfCities()
	{
		return this.noOfCities;	
	}
	
	
	public String toString()
	{
		return "This event is going to be held in year " + this.year + " and month " + this.month + 
				" and will be held in " + this.noOfCities + " cities.";
	}
	
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		Event c = (Event) ob;
        if (year == c.year && noOfCities == c.noOfCities && month == c.month) 
        {
            return true;
        }
        else
        {
            return false;
        }
	}
	
	public Event clone() {
        return new Event(this);
    }
	
}

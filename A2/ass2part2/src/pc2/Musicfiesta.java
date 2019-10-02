// ----------------------------------------------------------  
// Assignment 2
// Part 2
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc2;

public class Musicfiesta extends Festival
{

	private int noOfBands;
	
	public Musicfiesta()
	{
		super();
		this.noOfBands = 0;
	}
	
	public Musicfiesta(int year,int month,int noOfCities,String name,double ticketPrice,int duration,int noOfBands)
	{
		super(year,month,noOfCities,name,ticketPrice,duration);
		this.noOfBands = noOfBands;
	}
	
	public Musicfiesta(Musicfiesta e)
	{
		super(e.getYear(),e.getMonth(),e.getNoOfCities(),e.getName(),e.getTicketPrice(),e.getDuration());
		this.noOfBands=e.noOfBands;
	}
	public void setNoOfBands(int noOfBands)
	{
		this.noOfBands = noOfBands;
	}
	public int getNoOfBands()
	{
		return this.noOfBands;
	}
	public String toString()
	{
		return "This " + super.getName() + " Musicfiesta will be held in " + super.getYear() + ","+super.getMonth() + " in " + super.getNoOfCities() +" cities, for "
				+ super.getDuration() + " days, the ticket will cost " + super.getTicketPrice() + " and has " + this.noOfBands +" bands";
	}
	
	
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		Musicfiesta c = (Musicfiesta) ob;
        if (noOfBands == c.noOfBands && super.getName().equals(c.getName()) && super.getTicketPrice() == c.getTicketPrice() && super.getDuration() == c.getDuration() 
        		&& super.getYear() == c.getYear() && super.getNoOfCities() == c.getNoOfCities() && super.getMonth() == c.getMonth()) 
        {
            return true;
        }
        else
        {
            return false;
        }
	}
}

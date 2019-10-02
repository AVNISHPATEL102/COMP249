// ----------------------------------------------------------  
// Assignment 2
// Part 2
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc2;

public class Culturalfiesta extends Festival
{

	private int noOfLang;
	
	public Culturalfiesta()
	{
		super();
		this.noOfLang = 0;
	}
	public Culturalfiesta(int year,int month,int noOfCities,String name,double ticketPrice,int duration,int noOfLang)
	{
		super(year,month,noOfCities,name,ticketPrice,duration);
		this.noOfLang = noOfLang;
	}
	public Culturalfiesta(Culturalfiesta e)
	{
		super(e.getYear(),e.getMonth(),e.getNoOfCities(),e.getName(),e.getTicketPrice(),e.getDuration());
		this.noOfLang = e.noOfLang;
	}
	
	public void setNoOFLang(int noOfLang)
	{
		this.noOfLang = noOfLang;
	}
	public int getNoOfLang()
	{
		return this.noOfLang;
	}
	public String toString()
	{
		return "This " + super.getName() + " Culturalfiesta will be held in " + super.getYear() + ","+super.getMonth() + " in " + super.getNoOfCities() +" cities, for "
				+ super.getDuration() + " days, the ticket will cost " + super.getTicketPrice() + " and has " + this.noOfLang +" spoken language" ;
	}
	
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		Culturalfiesta c = (Culturalfiesta) ob;
        if (noOfLang == c.noOfLang && super.getName().equals(c.getName()) && super.getTicketPrice() == c.getTicketPrice() && super.getDuration() == c.getDuration() 
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


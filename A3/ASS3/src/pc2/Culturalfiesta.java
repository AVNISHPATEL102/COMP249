// ----------------------------------------------------------  
// Assignment 2
// Part 1
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc2;

public class Culturalfiesta extends Festival
{

	public int noOfLang;
	
	public Culturalfiesta()
	{
		this.name ="";
		this.ticketPrice = 0.0;
		this.duration = 0;
		this.year = 0;
		this.month = 0;
		this.noOfCities = 0;
		this.noOfLang = 0;
	}
	public Culturalfiesta(int year,int month,int noOfCities,String name,double ticketPrice,int duration,int noOfLang)
	{
		this.name=name;
		this.ticketPrice = ticketPrice;
		this.duration=duration;
		this.year=year;
		this.month=month;
		this.noOfCities = noOfCities;
		this.noOfLang = noOfLang;
	}
	public Culturalfiesta(Culturalfiesta e)
	{
		this.name=e.name;
		this.ticketPrice=e.ticketPrice;
		this.duration=e.duration;
		this.year=e.year;
		this.month = e.month;
		this.noOfCities = e.noOfCities;
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
		return "This " + this.name + " Culturalfiesta will be held in " + this.year + ","+this.month + " in " + this.noOfCities +" cities, for "
				+ this.duration + " days, the ticket will cost " + this.ticketPrice + " and has " + this.noOfLang +" spoken language" ;
	}
	
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		Culturalfiesta c = (Culturalfiesta) ob;
        if (noOfLang == c.noOfLang && name.equals(c.name) && ticketPrice == c.ticketPrice && duration == c.duration && year == c.year && noOfCities == c.noOfCities && month == c.month) 
        {
            return true;
        }
        else
        {
            return false;
        }
	}
	
	
}

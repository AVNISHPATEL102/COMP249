// ----------------------------------------------------------  
// Assignment 2
// Part 1
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc3;

import pc1.Event;

public class SportCompetition extends Event
{

	public int noOfAct;
	public enum seasons{ summer,fall,winter,spring};
	public seasons ss;
	
	public SportCompetition()
	{
		this.year = 0;
		this.month = 0;
		this.noOfCities = 0;
		this.noOfAct = 0;
		ss=null;
	}
	public SportCompetition(int year,int month,int noOfCities,int noOfAct , seasons ss)
	{
		this.year=year;
		this.month=month;
		this.noOfCities = noOfCities;
		this.noOfAct = noOfAct;
		this.ss=ss;
	}
	public SportCompetition(SportCompetition e)
	{
		this.year=e.year;
		this.month = e.month;
		this.noOfCities = e.noOfCities;
		this.noOfAct = e.noOfAct;
		this.ss=e.ss;
	}
	public void setNoOfAct(int noOfAct)
	{
		this.noOfAct = noOfAct;
	}
	public void seySs(seasons ss)
	{
		this.ss=ss;
	}
	public int getNoOfAct()
	{
		return this.noOfAct;
	}
	public seasons getSs()
	{
		return this.ss;
	}
	
	public String toString()
	{
		return "This Sport competition is going to be held in year " + this.year + " and month " + this.month + 
				" and will be held in " + this.noOfCities + " cities in season " + this.ss + " and has " 
				+ this.noOfAct + " of activities";
	}
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		SportCompetition c = (SportCompetition) ob;
        if (noOfAct == c.noOfAct && ss == c.ss && year == c.year && noOfCities == c.noOfCities && month == c.month) 
        {
            return true;
        }
        else
        {
            return false;
        }
	}
}

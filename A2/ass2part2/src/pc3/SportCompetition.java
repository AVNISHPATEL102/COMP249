// ----------------------------------------------------------  
// Assignment 2
// Part 2
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package pc3;

import pc1.Event;

public class SportCompetition extends Event
{

	private int noOfAct;
	public enum seasons{ summer,fall,winter,spring};
	private seasons ss;
	
	public SportCompetition()
	{
		super();
		this.noOfAct = 0;
		ss=null;
	}
	public SportCompetition(int year,int month,int noOfCities,int noOfAct , seasons ss)
	{
		super(year,month,noOfCities);
		this.noOfAct = noOfAct;
		this.ss=ss;
	}
	public SportCompetition(SportCompetition e)
	{
		super(e.getYear(),e.getMonth(),e.getNoOfCities());
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
		return "This Sport competition is going to be held in year " + super.getYear() + " and month " + super.getMonth() + 
				" and will be held in " + super.getNoOfCities() + " cities in season " + this.ss + " and has " 
				+ this.noOfAct + " of activities";
	}
	public boolean equals(Object ob)
	{
		if (this.getClass() != ob.getClass() || ob == null)
		{
            return false;
        }
		SportCompetition c = (SportCompetition) ob;
        if (noOfAct == c.noOfAct && ss == c.ss && super.getYear() == c.getYear() && super.getNoOfCities() == c.getNoOfCities() && super.getMonth() == c.getMonth()) 
        {
            return true;
        }
        else
        {
            return false;
        }
	}
}

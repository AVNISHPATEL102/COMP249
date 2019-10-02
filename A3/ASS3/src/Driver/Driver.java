// ----------------------------------------------------------  
// Assignment 2
// Part 1
// Written by: ( Name : Avnish Patel Id: 40024628 )
//Comp 249 Section U
//Due date 21,feb 2108
// ----------------------------------------------------------

package Driver;
import pc1.*;
import pc2.*;
import pc3.*;
import pc4.*;


public class Driver 
{

	public static void main(String[] args) 
	{

		Event ob1 = new Event(1987 , 12 ,23 );
		Festival ob2 = new Festival( 1988 , 12,32 ,"arts" , 43.0 , 8);
		Culturalfiesta ob3 = new Culturalfiesta( 1986,11,32 ,"arts" ,45.9 , 9 ,5);
		Musicfiesta ob4 = new Musicfiesta( 1985, 9 ,34,"beer" , 56.0,9,5);
		SportCompetition ob5 = new SportCompetition(1987,12,23,20, SportCompetition.seasons.summer);
		fair ob6 = new fair(1984 , 6 , 12,29, fair.type.career);
		Event ob7 = new Event(1987,12,23);
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println(ob4);
		System.out.println(ob5);
		System.out.println(ob6);
		System.out.println(ob7);
		
		System.out.println(ob1.equals(ob2));
        System.out.println(ob3.equals(ob4));
        System.out.println(ob4.equals(ob5));
        System.out.println(ob5.equals(ob1));
        System.out.println(ob1.equals(ob7));
        System.out.println(ob6.equals(ob2));
        
        
        Event[] array = new Event[10];
        array[0]= new Festival( 1988 , 12,32 ,"arts" , 43.0 , 8);
        	array[1]= new Culturalfiesta( 1984,11,32 ,"arts" ,45.9 , 9 ,5);
        	array[2]= new Musicfiesta( 1985, 9 ,34,"beer" , 56.0,9,5);
        	array[3]= new SportCompetition(1987,12,23,20, SportCompetition.seasons.summer);
        	array[4]= new fair(1991 , 6 , 12,29, fair.type.career);
        	array[5]= new Festival( 1993 , 12,32 ,"arts" , 43.0 , 8);
        	array[6]= new Culturalfiesta( 1986,11,32 ,"arts" ,45.9 , 9 ,5);
        	array[7]= new Musicfiesta( 1996, 9 ,34,"beer" , 56.0,9,5);
        	array[8]= new SportCompetition(1982,12,23,20, SportCompetition.seasons.summer);
        	array[9]= new fair(1982 , 6 , 67,29, fair.type.career);
        	
        	for(int i = 0; i < array.length-1; i++){
                System.out.println(array[i]);
            }
        	
        	Event mostCities = array[0];
        	int mindex=0,lindex=0;
        	Event leastCities = array[0];
            for(int i = 0; i < array.length-1; i++)
            {
                if(mostCities.getNoOfCities() < array[i+1].getNoOfCities()){
                    mostCities = array[i+1];
                    mindex=i+1;
                }
                if(leastCities.getNoOfCities() > array[i+1].getNoOfCities()){
                    leastCities = array[i+1];
                    lindex = i+1;
                }
            }
    
            
         System.out.println( "The most cities       :       " + mostCities + "\n The array index is" + mindex);   
         System.out.println( "The least cities      :       " + leastCities + "\n The array index is" + lindex);   
	
         Event fe = array[0];
         Event le = array[0];
         for(int i = 0; i < array.length-1; i++)
         {
        	 
        	 	for(int j= 9; j >=0; j--)
        	 	{
        		 if(array[i].getYear() == array[j].getYear() && i!= j)
        		 {
        			 fe=array[i];
        			 mindex=i;
        			 le=array[j];
        			 lindex=j;
        		 }
        	 	}
         }
         
         System.out.println("The first city with same year is     :    " + fe + "\n The array index is " +mindex);
         System.out.println("The second city with same year is     :    " + le + "\n The array index is " +lindex); 
	}

}

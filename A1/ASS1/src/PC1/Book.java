// ---------------------------------------------------------- 
// Assignment# (1)
// Written by: (AVNISH PATEL   ID: 40024628 )
// COMP 249 ASSIGNMENT 1 AND DUE DATE IS JANUARY 31,2018
// ----------------------------------------------------------





package PC1;

public class Book 
{

	public static String title;
	public static String author;
	public static long isbn;
	public static double price;
	public static int numOfBooks = 0;
	
	public Book()
	{
		this.title = "";
		this.author = ""	;
		this.isbn = 0;
		this.price = 0.0;
		numOfBooks++;
	}
	
	public Book(String title,String author,long isbn , double price)
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		numOfBooks++;
	}
	
	public static int numOfBooksCreated()
	{
		return numOfBooks;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setIsbn(long isbn)
	{
		this.isbn = isbn;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public long getIsbn()
	{
		return this.isbn;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	public String toString()
	{
		return this.title + " book is writte by " + this.author + ". ISBN :" + this.isbn + " and Price : " + this.price +".";  
	}
	
	public boolean equals( Book anotherBook)
	{
		if((this.isbn == anotherBook.isbn) && (this.price == anotherBook.price))
			{
				return true;
			}
		else 
				return false;
	}
	
	
	
	
}

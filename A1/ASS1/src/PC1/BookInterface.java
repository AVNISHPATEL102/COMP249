// ---------------------------------------------------------- 
// Assignment# (1)
// Written by: (AVNISH PATEL   ID: 40024628 )
// COMP 249 ASSIGNMENT 1 AND DUE DATE IS JANUARY 31,2018
// ----------------------------------------------------------


package PC1;
import java.util.Scanner;

public class BookInterface 
{

	private static final String password = "password";
	private static int maxBooks;
	private static Book[] inventory;
	public static Scanner key = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		String prompt = "Welcome to your bookstore manager\n"
					+ "Enter the maximum number of books you want your store to contain > ";
		System.out.print(prompt);
		
		maxBooks=key.nextInt();
		key.nextLine(); 
		inventory = new Book[maxBooks];
		
		
		while(true) 
		{
			prompt = "\nWhat do you want to do? \n"
					+ "	1. Enter new books (password required)\n"
					+ "	2. Change information of a book (password required)\n"
					+ "	3. Display all books by a specific author\n"
					+ "	4. Display all books under a certain a price.\n"
					+ "	5. Quit\n"
					+ "Please enter your choice > ";
			System.out.print(prompt);
			
			int choice = key.nextInt();
			key.nextLine();
	
			switch (choice) 
			{
				case 1:
					
					if(promptPassword()) 
					{
						System.out.print("\nHow many books do you want to enter? ");
						
						int nbBooks = key.nextInt();
						key.nextLine();
						
						
						int nbBooksLeft = maxBooks - Book.numOfBooksCreated();
						if (nbBooksLeft < nbBooks) 
						{
							System.out.println("You've reached the limit, you'll be only able to add " + nbBooksLeft + " book(s).");
							 
							nbBooks = nbBooksLeft;
						}
						
						for (int i=1; i <= nbBooks; i++) 
						{
							System.out.print("Title: ");
							String title = key.nextLine();
						
							System.out.print("Author: ");
							String author = key.nextLine();
							
							long ISBN = promptForISBN();
						
							double price = promptForPrice();	
						
							Book new_book = new Book(title, author, ISBN, price);
						
							inventory[Book.numOfBooksCreated() - 1] = new_book;
						
							System.out.println("\"" + title + "\" added.");
						}
					}
					break;
				case 2:
					if(promptPassword()) 
					{
						
						promptUpdateBook();
					}
					break;
				case 3:
					System.out.print("Author to search: ");
					String author = key.nextLine();
					
					for(int i = 0;i < inventory.length; i++)
					{
						if(inventory[i] != null) 
						{
							if(inventory[i].getAuthor().equals(author)) 
							{
								System.out.println("\nBook #" + (i + 1) + "\n" + inventory[i]);
							}
						}
					}
					break;
				case 4:
					System.out.print("Price to search: ");
					double price = key.nextDouble();
					key.nextLine();
					
					for(int i = 0;i < inventory.length; i++)
					{
						if(inventory[i] != null) 
						{
							if(inventory[i].getPrice() < price) 
							{
								System.out.println("\nBook #" + (i + 1) + "\n" + inventory[i]);
							}							
						}
					}
					break;
				case 5:
					System.out.println("Thankyou for using the software");
					System.exit(0);
					break;
				default:
					System.out.println("no choice like this, try again.");
					break;
			}
		}
	
	}
	private static long promptForISBN() 
	{
		
		long ISBN;
	
		do 
		{
			System.out.print("ISBN: ");
			ISBN = key.nextLong();
			
			if (ISBN < 1000000000000L
				|| ISBN > 9999999999999L) System.out.println("Invalid ISBN: ISBN must be a positive "
											+ "13 digit integer.");
		} while (ISBN < 1000000000000L
				|| ISBN > 9999999999999L); //ISBN numbers are 13 digits long.
				
		return ISBN;
	}
	
	private static double promptForPrice() 
	{
	
		double price;
	
		do 
		{
			System.out.print("Price: ");
			price = key.nextDouble();
			key.nextLine();
			
			if (price < 0) System.out.println("Invalid Price: Price must be a positive number.");
		} while (price < 0);
		
		return price;
	}
	
	private static boolean promptPassword() 
	{
		for(int i = 2; i >= 0; i--) 
		{
			System.out.print("Enter your password: ");
			String input = key.nextLine();
			if(password.equals(input))
			{
				return true;
			} 
			else 
			{
				if(i == 0) 
				{
					System.out.println("Wrong password, no attempts left. Returning to main menu.");
				} 
				else 
				{
					System.out.print("Wrong password, try again (" + i + " attempt(s) left). ");
				}
			}
		}
		return false;
	}
	
	private static void promptUpdateBook() 
	{
		System.out.print("\nWhat book number? ");
		
		int index = key.nextInt() - 1;  
		key.nextLine();
		
		if(index >= maxBooks || index <= -1 || inventory[index] == null) 
		{
			System.out.print("\nThat book number doesn't exist. Try again? ('y' or 'yes', anything else bring you back to the main menu): ");
			String response = key.nextLine();
			if(response.equals("yes") || response.equals("y")) 
			{
				promptUpdateBook();
			}
			return;
		} 
		else 
		{
			promptUpdateIndividualBook(index);
		}
	}
	
	private static void promptUpdateIndividualBook(int index) 
	{
		System.out.println("\nBook #" + (index + 1) + "\n" + inventory[index]);
		
		String prompt = "\nWhat information would you like to change? \n"
				+ "	1. author\n"
				+ "	2. title\n"
				+ "	3. ISBN\n"
				+ "	4. price\n"
				+ "	5. Quit\n"
				+ "Enter your choice > ";
		System.out.print(prompt);
		
		int update_choice = key.nextInt();
		key.nextLine();
		
		switch (update_choice) 
		{
			case 1:
				System.out.print("Enter a new author: ");
				String author = key.nextLine();
				inventory[index].setAuthor(author);

				promptUpdateIndividualBook(index);
				break;
			case 2:
				System.out.print("Enter a new title: ");
				String title = key.nextLine();
				inventory[index].setTitle(title);
				
				promptUpdateIndividualBook(index);
				break;
			case 3:
				System.out.print("Enter a new ISBN: ");
				long ISBN = promptForISBN();
				inventory[index].setIsbn(ISBN);
				
				promptUpdateIndividualBook(index);
				break;
			case 4:
				System.out.print("Enter a new Price: ");
				double price = promptForPrice();
				inventory[index].setPrice(price);
				
				promptUpdateIndividualBook(index);
				break;
			case 5:
				break;
			default:
				promptUpdateIndividualBook(index);
				break;
		}	
	}
}

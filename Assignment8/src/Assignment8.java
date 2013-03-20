/**
 * AUTHOR: Jeff Scaturro
 * FILENAME: Assignnment8.java
 * SPECIFICATION: Declare and instantiate a TicketManager object, and then dispaly a menu to the customer.
 * 	Keeps track of seats and follows user's orders.
 * YOUR Lab Letter: H
 * FOR: CSE 110 - MW 3:00m-4:15pm
 * TIME SPENT: 8 Hours
 */

import java.util.*;

public class Assignment8 
{
	public static void main(String[] args)
	{
		// declare variables to control menu
		int usersChoice = 0;
		Scanner scan = new Scanner(System.in);
		// declare and instantiate a TicketManager object:
		TicketManager objectDone = new TicketManager();
		
		// display menu
		printMenu();
		

		do
		{
	        // ask the user to choose a command
			System.out.println("\nPlease enter a command:");
	        usersChoice = scan.nextInt();
			switch (usersChoice)
		       {
		            case 1: 
		            	// just has to print the seats
		            	objectDone.displaySeats();
		                break;
		            case 2:
		            	// three variables, seatsDesired, rowDesired, startingSeat
		            	int seatsDesired = 0;
		            	int rowDesired = 0;
		            	int startingSeat = 0;
		            	// asks the three respective questions:
		            	System.out.print("Number of seats desired (1 - 30): ");
		            	seatsDesired = scan.nextInt();
		            	System.out.print("\nDesired row (1 - 15): ");
		            	rowDesired = scan.nextInt();
		            	System.out.print("\nDesired starting seat number in the row (1 - 30): ");
		            	startingSeat = scan.nextInt();
		            	
		            	// check if available
		            	if(objectDone.requestTickets(seatsDesired, rowDesired, startingSeat))
		            		System.out.println("The seats you have requested are available for purchase. ");
		            	else
		            	{
		            		System.out.println("Unfortunately, the seats you have requested are not available for purchase.");
		            		break;
		       			}
		            	
		            	// Ask if they would like to buy, store in variable answer
		            	char answer = ' ';
		            	System.out.print("Do you wish to purchase these tickets (Y/N)? ");
		            	answer = scan.next().charAt(0);
		            	// if yes, print out like the receipt = purchase tickets method, then print stuff, then prink tickets.
		            	if (answer == 'Y' || answer == 'y')
		            	{
		            		// variable for total ticket cost
		            		double totalTicketCost = (seatsDesired*objectDone.getPrice(rowDesired));
		            		// print out stuff before the ticket print
		            		objectDone.purchaseTickets(seatsDesired, rowDesired, startingSeat);
		            		System.out.println("Num Seats: " + seatsDesired);
		            		System.out.println("The price for the requested tickets is $" + totalTicketCost);
		            		System.out.println("Please input amount paid: ");
		            		// amount to use as payment store in double
		            		double amountPaid = scan.nextDouble();
		            		// well its supposed to be an input but u dont use it as one so just setting it to whatever then
		            		//double amountPaid = 200;
		            		
		            		// print the ticket
		            		objectDone.printTickets(seatsDesired, rowDesired, startingSeat);
		            		// summary of stuff after ticket
		            		System.out.println("Tickets purchased: " + seatsDesired);
		            		System.out.println("Payment\t\t\t: $ " + amountPaid);
		            		System.out.println("Total ticket price \t: $" + totalTicketCost);
		            		System.out.println("Change due\t\t: $" + (amountPaid - totalTicketCost));
		            	}
		            	else
		            		break;
		                break;

		            case 3:
		            	objectDone.displaySalesReport();
		                 break;
		            case 4:
		            	System.exit(0);
		            	break;
					 default:
						  System.out.println("Invalid choice!");
						  break;
		       }
		} while (usersChoice != 4);
		scan.close();
	} // end main method
	
	public static void printMenu()
	{
		System.out.println("ASU Gammage Theater\n1. View Available Seats\n2. Request Tickets\n3. Display Theater Sales Report\n4. Exit the Program");
	} // end printMenu method
} // end class

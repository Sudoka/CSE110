/**
 * AUTHOR: Jeff Scaturro
 * FILENAME: TicketManager.java
 * SPECIFICATION: Keeps track of the nunmber of seats available in a theater's auditorium.
 * 		Has a 2-D array, 15 rows, and 30 columns for all seats in auditorium. 
 * 		Each row has a different price, there's an array of double to keep track of the price of tickets
 * 		for each row. 
 * YOUR Lab Letter: H
 * FOR: CSE 110 - MW 3:00m-4:15pm
 * TIME SPENT: 6 Hours
 */

import java.io.*;
import java.util.*;

public class TicketManager 
{
	// instance Variables:
	// the size of 2D arrays determined by the following variables, rows and columns respectively
	public static final int NUMROWS = 15; // Do not use const, it is final in Java...
	public static final int NUMCOLUMNS = 30;
	//2-D array to keep track of seats.
	private char[][] seats = new char[NUMROWS][NUMCOLUMNS];
	// 1-d array to keep track of price.
	private double[] price = new double[NUMROWS];
	// int to keep track of seats sold
	private int seatsSold = 0;
	// double to keep track of total revenue
	private double totalRevenue = 0.0;
	
	// Constructor
	// TicketManager makes the array seats the from reading the file seatinability.txt
	public TicketManager()
	{
		try
		{
			//make a new scanner object that will read from the file
			Scanner avail = new Scanner(new File("seatAvailability.txt"));
            String line;
            int col = 0, row = 0;
            while(avail.hasNext()) 
            {
            	line = avail.next();
                for(col = 0; col < line.length() && col < NUMCOLUMNS; col++) 
                {
                   seats[row][col] = line.charAt(col);
                }
                row++;
            }

			// closes avail scanner.
			avail.close();
			
			// Repeat above for price array, only one for loop caz its 1-d
			Scanner priceTxt = new Scanner(new File("seatPrices.txt"));
			while(priceTxt.hasNext())
			{
				for (int i = 0; i < NUMROWS; i++)
				{
						double temp1 = priceTxt.nextDouble();
						price[i] = temp1;
				}
			}
			// close scanner
			priceTxt.close();
		}
		catch (FileNotFoundException e)
		{
			System.err.println("error: "+e.getMessage());
		}
	}
	
	// requestTickets method
	public boolean requestTickets(int numTickets, int desiredRow, int desiredSeatStart)
	{
		// for loop to control what columns it checks, i which equals their desired column start.
		// Then goes untilit checks the amounr of tickets they want by using j - numTickets.
		for (int i = desiredSeatStart; i < NUMROWS - numTickets; i++)
		{
			// if the seat is taken (*) then say u cant use it, false.
			if (seats[desiredRow][i] == '*')
				return false;
		}
		return true;
	}
	
	// method purchaseTickets changes the seats array and updates seatsSold and totalRevenue
	// i dont get why it is a boolean, it just updates stuff doesn't return a true/false,
	// returning that can be done in main (i.e. if Y, then CLASS.purchaseTickets(....) not this way).
	public void purchaseTickets(int numTickets, int desiredRow, int desiredSeatStart)
	{
		// need to change the seats in the 2-d array from # to *. 
		// use same loop, as requestTickets, but instead of if statement, change the char.
		for (int i = desiredSeatStart; i < NUMROWS - numTickets; i++)
		{
			// change seat from available, #, to taken, *.
			seats[desiredRow][i] = '*';				
		}
		//update seats sold:
		seatsSold += numTickets;
		
		// update revenue (desired row also equals the price from the array times the num of seats sold.
		totalRevenue += (price[desiredRow]*numTickets);
	}
	
	// method getTotalRevenue() will return total revenue
	public double getTotalRevenue()
	{
		return totalRevenue;
	}
	
	// method to return the number of seats sold
	public int getSeatsSold()
	{
		return seatsSold;
	}
	
	// method to get price of current row
	public double getPrice(int row)
	{
		// from entered row, access double row's price associated with that row
		double priceOfRow = price[row];		
		// return it.
		return priceOfRow;
	}
	
	// method not very clear, assuming it is returning a # or *.
	public char getSeat(int row, int column)
	{
		char seatOfSelected = seats[row][column];
		return seatOfSelected;
	}
	
	// method to print the tickets purchased.
	public void printTickets(int numSeats, int row, int column)
	{
		// go through seat by seat and print out each ticket using for loop
		for (int i = column; i < NUMROWS - numSeats; i++)
		{
			System.out.println("***********************************************");
			System.out.println("* Gammage Theater*");
			System.out.println("* Row " + row + " Seat " + i + " *");
			System.out.println("* Price: $ " + price[row] + " *");
			System.out.println("***********************************************");
		}
	}
	
	// method displaySeats displays the content of the 2-d array 
	public void displaySeats()
	{
		// print header, that requires no changing
		System.out.println("\t\t\tSeats");
		System.out.println("\t123456789012345678901234567890");
		// use for loop to print out row by row and then its rows contents
		for (int i = 0; i < NUMROWS; i++)
		{
			// print out what row you're in, dont go to next line.
			System.out.print("Row " + (i+1) + "\t");
			for (int j = 0; j < NUMCOLUMNS; j++)
			{
				// print out each content of that row
				System.out.print(seats[i][j]);
			}
			// go to new line
			System.out.print("\n");
		}
		// print out the legend
		System.out.println("\tLegend: * = Sold/Occupied");
		System.out.println("\t# = Available");
	}
	
	// method to display sales report
	public void displaySalesReport()
	{
		// print heading up to the first requirement of variable
		System.out.println("Gammage Sales Report \n _______________________________\n Seats Sold: " + seatsSold +
				"\nSeats available: " + (450-seatsSold) + "\nTotal revenue to date: $" + totalRevenue);
		
	}
}
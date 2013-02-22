/*
 *  Name: Jeffrey Scaturro
 *  Title: Assignment2.java
 *  Author: Jeffrey Scaturro
 *  Description: This program prints out a menu, and prompts the user to input an amount for different types of tickets,
 *  	and then gives various details about their transaction.
 *  Time Spent: ???
 *  Date: 9/11/2012
 */

/*
 * Part 1: Exercises:
 * Question 1) Statement to print the number of characters in the string:
 * 		int myStringLength = myString.length();
 *		System.out.println("Number of characters in the string: " + myStringLength);
 * 
 * Question 2) Statement that outputs the character at index 16 (assuming your saying position 16):
 * 		char sixteen = myString.charAt(16);
 *		System.out.println("The character at index 16 is: " + sixteen);
 *  
 * Question 3) Statement that outputs the position of the word "for" in the sentence: 
 * 		int position = myString.lastIndexOf("for");
 *		System.out.println("The position of the word 'for' in the sentence is: " + position);
 *		
 * Question 4) Statement that outputs the sentence in uppercase letters:
 * 		System.out.println(myString.toUpperCase());
 * 
 * Question 5) Extract the new string "birthday party" and print it to screen:
 * 		String extraction = myString.substring(24);
 *		System.out.println("The new string is: " + extraction);
 */

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		/*
		// Declaring variable to use for exercises.
		String myString = "Now is the time for the birthday party";
		
		// Statement to print the number of characters in the string.
		// Use .length and declare an int to store the number in.
		int myStringLength = myString.length();
		System.out.println("Number of characters in the string: " + myStringLength);
		
		// Statement that outputs the character at index 16.
		// Declaring char to hold character in and getting value.
		char sixteen = myString.charAt(16);
		System.out.println("The character at index 16 is: " + sixteen);
		
		// Statement that outputs the position of the word "for" in the sentence.
		int position = myString.lastIndexOf("for");
		System.out.println("The position of the word 'for' in the sentence is: " + position);
		
		// Statement that outputs the sentence in uppercase letters.
		System.out.println(myString.toUpperCase());
		
		// Extract the new string "birthday party" and print it to screen.
		String extraction = myString.substring(24);
		System.out.println("The new string is: " + extraction);
		*/
		
		// Declaring new scanner to read input.
		Scanner scan = new Scanner(System.in);
		
		// Printing out the menu:
		System.out.println("Welcome to the Movie Theatre!");
		System.out.println("-----------------------------");
		System.out.println("The cost of movie tickets:");
		System.out.println("Matinee:\t$5.00");
		System.out.println("Normal:\t\t$7.50");
		System.out.println("Rush Hour:\t$3.50");
		
		// Declaring the three ints for storage from input:
		int matinee, normal, rushHour;
		
		// Prompting how many Matinee tickets user wants to buy:
		System.out.print("\nHow many Matinee tickets would you like to buy? ");
		matinee = scan.nextInt();
		
		// Prompting for Normal tickets:
		System.out.print("\nHow many Normal tickets would you like to buy? ");
		normal = scan.nextInt();
		
		// Prompting for Rush Hour:
		System.out.print("\nHow many Rush Hour tickets would you like to buy? ");
		rushHour = scan.nextInt();
		
		// Calculations:
		// Initializing doubles for totalCostMatinee, etc.
		double totalCostMatinee, totalCostNormal, totalCostRushHour, totalCostAll, averageCost;
		// Declaring int for total number of tickets.
		int totalTickets;
		
		// set up numberformat:
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		// Total costs:
		totalCostMatinee = matinee * 5.0;
		System.out.println("\n\nThe total cost for the Matinee tickets: " + nf.format(totalCostMatinee));
		
		totalCostNormal = normal * 7.5;
		System.out.println("The total cost for the Normal tickets: " + nf.format(totalCostNormal));
		
		totalCostRushHour = rushHour * 3.5;
		System.out.println("The total cost for the Rush Hour tickets: " + nf.format(totalCostRushHour));
		
		totalCostAll = totalCostMatinee + totalCostNormal + totalCostRushHour;
		System.out.println("The total cost for all tickets: " + nf.format(totalCostAll));
		
		totalTickets = matinee + normal + rushHour;
		System.out.println("The total number of tickets: " + totalTickets);
		
		averageCost = totalCostAll / totalTickets;
		System.out.println("The average cost per ticket for this purchase: " + nf.format(averageCost));
		
	}

}

/**
 * AUTHOR: Jeff Scaturro
 * FILENAME: Assignment6.java
 * SPECIFICATION: Contains a main method to create a new Geek 
 * object and to test the methods in the class Geek.
 * YOUR LAB LETTER: H
 * FOR: CSE 110- HW6 - MW 3:00pm-4:15pm
 * TIME SPENT: how long it took you to complete this part of assignment.
 */

import java.util.Scanner;

public class Assignment6 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		printMenu();
		
		String input; // initialize input.
		char command; // initialize command.
		
		// Initiates the geek1 variable.
		Geek geek1 = new Geek("Jeff Scaturro", 0);
		
		do
		{
			System.out.println("\nPlease enter a command or type ?");
			input = scan.next();
			command = input.charAt(0);
			
			switch (command)
			{
				case 'a': // Assumed it was for get name, not set name, so i just got the name of it!
					System.out.println("The Geek's name is: " + geek1.getName());
					break;
					
				case 'b': // Num Questions asked.. So use getNumquestions method.
					System.out.println("Number of questions asked so far: " + geek1.getNumberOfQuestions()); // prints number of questions
					break;
					
				case 'c': // All numbers are the same, uses  allTheSame method and if true says yes, etc.
					System.out.println("Enter a number: ");
					int number1, number2, number3;
					number1 = scan.nextInt();
					System.out.println("Enter a second number: ");
					number2 = scan.nextInt();
					System.out.println("Enter a third number: ");
					number3 = scan.nextInt();
					// Call the method and use if to return true, and say they are the same!
					if (geek1.allTheSame(number1, number2, number3))
						System.out.println("All the numbers you entered ARE the same! ");
					else
						System.out.println("All the numbers you entered are NOT the same! ");
					break;
				
				case 'd': 
					System.out.println("Enter a number: ");
					int numberPrime = scan.nextInt();
					if (geek1.isPrime(numberPrime))
						System.out.println(numberPrime + " is prime!");
					else
						System.out.println(numberPrime + " is not prime!");
					break;
					
				case 'e':
					int numberSum1, numberSum2;
					System.out.println("Enter a number: ");
					numberSum1 = scan.nextInt();
					System.out.println("Enter a second number: ");
					numberSum2 = scan.nextInt();
					System.out.println("The sum of the"
							+ "numbers between " + numberSum1 
							+ " and " + numberSum2 + " is: "
							+ geek1.sum(numberSum1, numberSum2));
					break;
					
				case 'f':
					System.out.println("Enter a string: ");
					String str1 = scan.next();
					System.out.println("Enter an integer: ");
					int strInteger = scan.nextInt();
					System.out.println(geek1.repeat(str1, strInteger));
					break;
					
				case 'g':
					System.out.println("Enter a string: ");
					String str2 = scan.next();
					if (geek1.isPalindrome(str2))
						System.out.println("The string " + str2 + " is a palindrome. ");
					else 
						System.out.println("The string " + str2 + " is not a palindrome. ");
					break;

				case '?':
					//Display the menu again
					printMenu();
				
				default:
					System.out.println("Invalid choice!");
					break;

			}
		} while ( command != 'q');
	} // End of main.
	// Method to print out the menu.
	public static void printMenu()
    {
	    System.out.print("\nCommand Options\n"
	                   + "-----------------------------------\n"
	                   + "a: Geek's Name\n"
	                   + "b: Num Questions Asked\n"
	                   + "c: All numbers the same\n"
	                   + "d: Is prime\n"
	                   + "e: Sum between two integers\n"
	                   + "f: Repeat the string\n"
	                   + "g: It is palindrome\n"
	                   + "?: Display\n"
	                   + "q: Quit\n");
    }
} // End of class.


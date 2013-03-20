/*---------------------------------------------------------------------------
// AUTHOR:        Jeff Scaturro
// FILENAME:      Lab7.java
// SPECIFICATION:   This program is to understand classes and helper methods
// INSTRUCTIONS:    Read the following comments and write the code from the scratch.
//                  Ask your TA or your classmates for help and/or clarification. When you see
//                  //--> or ??? that is where you need to add code.
//		    (note that you will have to change code in the main methods as well as
//		      other methods)
// LAB LETTER:	H
//-------------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab7
{

	
	public static void main(String[] args)
	{
		Course java;
		Course math;
		Course english;	
		
		Scanner scan = new Scanner(System.in);
		
		final int ENROLL = 1, ADD_SEATS = 2, QUIT = 3;
		int choice;
		int courseChoice;
		
		//Instantiate 3 objects of type course; one for Java with 100 seats, one for math with 50 seats, and 
		//  one for english with 30 seats (make the course title whatever you like).
		java = new Course("Introduction to Java", 100);
		math = new Course("Introduction to Math", 50);
	    english = new Course("Introduction to English", 30);
		
		//Add 100 students to the java course, 45 students to the math course, and 10 students to the english course.
		for(int i  = 0; i < 100; i++)
			if(!java.enrollStudent())
				System.out.println("Sorry, this course is full. Please choose another course or add seats to the course.");
		for(int i  = 0; i < 45; i++)
			if(!math.enrollStudent())
				System.out.println("Sorry, this course is full. Please choose another course or add seats to the course.");
		for(int i  = 0; i < 10; i++)
			if(!english.enrollStudent())
				System.out.println("Sorry, this course is full. Please choose another course or add seats to the course.");
		do 
		{
			//Print the main menu and get the user's choice by calling the appropriate method
			choice = mainMenu(scan);
			
			switch(choice)
			{
			case ENROLL:
				//Print the enroll student menu and get the user's choice by calling the appropriate method
				do
				{
					courseChoice = enrollMenu(scan,java,math,english);
				}while (courseChoice > 3 || courseChoice < 1);
				switch(courseChoice)
				{
				//For each case, call the appropriate method for enrolling a student for the appropriate class
				case 1:
					if(!java.enrollStudent())
						System.out.println("Sorry, this course is full. Please choose another course or add seats to the course.");
					break;
				case 2:
					if(!math.enrollStudent())
						System.out.println("Sorry, this course is full. Please choose another course or add seats to the course.");
					break;
				case 3:
					if(!english.enrollStudent())
						System.out.println("Sorry, this course is full. Please choose another course or add seats to the course.");
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			case ADD_SEATS:
				//Print the add seats menu and get the user's choice by calling the appropriate method
				do
				{
					courseChoice = addSeatsMenu(scan,java,math,english);
				}while (courseChoice > 3 || courseChoice < 1);
				switch(courseChoice)
				{
				//For each case, call the appropriate method for adding 10 seats for the appropriate class
				case 1:
					java.addSeats(10);
					break;
				case 2:
					math.addSeats(10);
					break;
				case 3:
					english.addSeats(10);
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			case QUIT:
				System.out.println("Have a good day.");
				break;
			default:
				System.out.println("Invalid choice");
			}
			
		}while(choice != QUIT);
	}

	/*
	 * This method prints the main menu, prompts the user for his choice,
         *   and returns the int choice.
	 * Params: scan - a Scanner object used to receive input from the user
	 * Return: int value of the user's choice
	 */
	public static int mainMenu(Scanner scan)
	{
		System.out.println("Please choose from the following options:");
		System.out.println("1. Enroll in a course");
		System.out.println("2. Increase a course's capacity");
		System.out.println("3. Quit");
		return scan.nextInt();
	}

	/*
	 * This method prints the menu for enrolling a student, prompts the user 
         *   for his choice, and returns the int choice.
	 * Params: scan - a Scanner object used to receive input from the user
	 * Return: int value of the user's choice
	 */
	public static int enrollMenu(Scanner scan, Course java, Course math, Course english)
	{
		//Use the appropriate methods to display the course details
		System.out.println("What course would you like to enroll in?");
		System.out.println("1. " + java.toString());
		System.out.println("2. " + math.toString());
		System.out.println("3. " + english.toString());
		return scan.nextInt();
	}

	/*
	 * This method prints the menu for adding seats, prompts the user for 
         *   his choice, and returns the int choice.
	 * Params: scan - a Scanner object used to receive input from the user
	 * Return: int value of the user's choice
	 */
	public static int addSeatsMenu(Scanner scan, Course java, Course math, Course english)
	{
		//Use the appropriate methods to display the course details
		System.out.println("For which course would you like to increase the capacity?");
		System.out.println("1. " + java.toString());
		System.out.println("2. " + math.toString());
		System.out.println("3. " + english.toString());
		return scan.nextInt();
	}
}
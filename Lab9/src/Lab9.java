/**
 * AUTHOR: Jeff Scaturro
 * FILENAME: Lab9.java
 * SPECIFICATION: It's Lab 9 of the labs...
 * YOUR LAB LETTER: H
 * FOR: CSE 110- HW6 - MW 3:00pm-4:15pm
 * TIME SPENT: how long it took you to complete the assignment
 */

import java.util.Scanner;
public class Lab9
{
	public static void main(String[] args)
	{

		System.out.println("Welcome to the apple picking event! Creating your basket......");
		// Create a basket object named basket1 with your name, with size "Small"

		Basket basket1 = new Basket("Jeff Scaturro", "small");
		
		// Ask the user to enter the name of his friend
		System.out.println("\nWhat is your friend's name?");
		// Creating Scanner object
		Scanner scan = new Scanner(System.in);
		// Take the name as input and assign it to a String variable basketName
		String basketName = scan.nextLine();

		System.out.println("How big is his basket?");
		// Choose from "Medium" or "large" and assign it to a String variable basketSize
		String basketSize=scan.next();
		System.out.println("Creating your friends' basket.......");
		// Create a basket2 object of the class Basket with the basketName and basketSize as inputs
		Basket basket2 = new Basket(basketName, basketSize);


		System.out.println("\nYour friend has just picked 30 apples!");
		// Call the applePicked method with 30 as input
		basket2.applePicked(30);

		System.out.println("\nYou have picked 40 apples!");
		// Call the applePicked method with 40 as input
		basket1.applePicked(40);

		System.out.println("\nYour friend just grab 3 apples from your basket!");
		// Call the method that will let your friend grab 3 apples from you
		basket2.grabFromOthers(3);

		// Call the method that deduct the number of apples in your basket
		basket1.grabbedByOthers(3);

		System.out.println("\nLet's see how many apples you guys picked today:\n*************************************\n");
        // Print total number of baskets created today: access the static method getNumOfBasket directly by the class name
        System.out.println("You have total "+Basket.getNumOfBasket()+" baskets of apples");
        //Check if these baskets belong to the same person using equals method

        if (basket1.equals(basket2))
            System.out.println("These baskets belong to the same person.");
            else
            System.out.println("These baskets do not belong to the same person.");
		// Print out the record of your basket
		System.out.println(basket1.toString());

		// Print the record of your friend
		System.out.println(basket2.toString());

	}
}
/**
 * AUTHOR: Jeff Scaturro
 * FILENAME: Basket.java
 * SPECIFICATION: Basket class to perform various tasks for Lab9.
 * YOUR LAB LETTER: H
 * FOR: CSE 110- HW6 - MW 3:00pm-4:15pm
 * TIME SPENT: how long it took you to complete the assignment
 */

// Define a public class Basket
public class Basket
{
	private String basketName;
	private String basketSize;
	private int numberOfApplePicked;
	private int basketLimit;
	//Define a private static variable numOfBasket
	private static int numOfBasket;

	public Basket(String bName, String bSize)
	{

		// assign the input bName to variable basketName
		basketName = bName;

		// assign the input bSize to variable basketSize
		basketSize = bSize;

		//Increment the numOfBasket by 1
		numOfBasket++;

		// Write a switch statement to assign a value to basketLimit: if the basketSize is "Small", basketLimit = 20; if the basketSize is "Medium", basketLimit = 40;
		//if the basketSize is "Large", basketLimit = 60
		int basketSizeInt = 0;
		if(basketSize.equals("Small"))
			basketSizeInt = 1;
		else
		{
			if(basketSize.equals("Medium"))
		        basketSizeInt = 2;
		    else
		        basketSizeInt = 3;
		}
		switch(basketSizeInt)
		{	
		    case 1:
		        basketLimit = 20;
		    case 2:
		    	basketLimit = 40;
		    case 3:
		        basketLimit = 60;
		}

	}

	public void applePicked()
	{
		numberOfApplePicked++;
	}

	// Define a overloaded method applePicked with integer num as input. Inside the method increment numberOfApplePicked by num
	public void applePicked(int num)
	{   for(int i = num;i <= num;i++)
	      numberOfApplePicked += num;

	      //Check if numberOfApplePicked exceeds basket limit, if so assign basketLimit to numberOfApplePicked
	      if(numberOfApplePicked > basketLimit)
	      {
	    	  System.out.println("\nYour basket is not big enough! You can only have "+ basketLimit +" apples.");
	          numberOfApplePicked = basketLimit;
	      }
	 }

  // Get the numberOf ApplePicked
    public int getNum()
    {   return numberOfApplePicked; }

    // Grab num apples from others
	public void grabFromOthers(int num)
	{
		// Increment the numberOfApplePicked by num
		numberOfApplePicked += num;

		//Check if numberOfApplePicked exceeds basket limit, if so assign basketLimit to numberOfApplePicked
		if(numberOfApplePicked > basketLimit)
		{
			 System.out.println("\nYour basket is not big enough! You can only have "+ basketLimit +" apples.");
			 numberOfApplePicked = basketLimit;
		}
	}

	//Grabbed num apples by others
	public void grabbedByOthers(int num)
	{     
		//Decrement the number Of ApplePicked by num
	    numberOfApplePicked -= num;
	}

	// define a public method with the name toString and return type String which generates the basket record
	public String toString()
	{
		return "\nOwnner's name:\t"+ basketName +"\nApple picked:\t" + numberOfApplePicked;
	}
	//Check if two baskets belong to the same person,using this reference
	public boolean equals(Basket other)
	{
		if ( basketName == other.basketName)
		     return true;
		else
		  return false;
	}
	// Create a static method that returns the static variable numOfBasket
	public static int getNumOfBasket()
	{    
		return numOfBasket;
	}
}
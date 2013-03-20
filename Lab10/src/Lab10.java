/*---------------------------------------------------------------------------
// AUTHOR:      	Jeff Scaturro
// FILENAME:    	Lab10.java
// SPECIFICATION: 	This program introduces arrays.
// INSTRUCTIONS:  	Read the following code skeleton and add your own code
//          		according to the comments.  Ask your TA or your class-
//          		mates for help and/or clarification.  When you see
//          		//--> that is where you need to add code.
// LAB LETTER:		H
//-------------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab10 
{

	//This function converts the contents of the array of Strings into a single String with
	//appropriate spaces and returns it.
	//For example if String[] s = {"I", "am", "doing", "good."}; is an input to the function
	//The result is a String, I am doing good.

	public static String concatenateStrings(String[] strArray)
	{

		//Create a String variable <concatenatedStr> and initialize it to "";
		String concatenatedStr = "";

		//Implement a for loop where the loop variable <i> goes from the 0 to the length of <strArray> (not included)
		for(int i=0; i < strArray.length;i++)
		{
			//Concatenate the string at index <i> of <strArray> to <concatenatedStr>
			concatenatedStr += " " + strArray[i];
		}

		//return <concatenatedStr>
		return concatenatedStr;
	}
	
	// This function switch the values of n1th element and n2th element in a array,please pay attension to the index: for example, index 0 corresponding to the 1st element.
	public static int[] switchElementOfArray(int[] intArray, int n1,int n2)
	{
       int temp;
	      // Use temp to store the original value at intArray[n2-1]
	      temp = intArray[n2-1];
	      // Pass the value of intArray[n1-1] to intArray[n2-1]
	      intArray[n2-1] = intArray[n1-1];
	      // Pass the original value of intArray[n2-1] to intArray[n1-1]
	      intArray[n1-1] = temp;

       return intArray;
   }

	//This function calculates the sum of the array of integers and returns it.
	//For example if int[] s = {1, 2, 3}; is an input to the function
	//The result is an Integer, 6
	public static double findSumOfArray(int[] intArray)
	{
		//Create an integer variable <sum> and initialize it to 0;
		int sum = 0;
		
		//Implement a for loop where the loop variable <i> goes from the 0 to the length of <intArray> (not included)
		for (int i = 0; i < intArray.length; i++)
		{
			//Add the integer at index <i> of <intArray> to <sum>
			sum += intArray[i];
		}

		//return <sum>
		return sum;
	}


	//The main method begins here. The methods defined above will be used inside the main method.
	public static void main(String[] args) 
	{

		//Create an array of Strings
		String[] brokenString = {"I", " was", "broken", "and", "you", "fixed", "me."};

		//Create an array of first ten Natural numbers.
		int[] tenNaturalNos = new int[10];

		//Write a loop to initialize the array
		//Implement a for loop where the loop variable i goes from 0 to tenNaturalNos.length-1
		for(int i = 0;i<=tenNaturalNos.length-1;i++)
		{
			//Set the value of tenNaturalNos at index i to i+1, tenNaturalNos[i] = i+1;
			tenNaturalNos[i] = i + 1;
		}

		//Print the <brokenString> array
		System.out.println("The array of Strings : ");
		for(int i=0; i<brokenString.length; i++)
		{
			// print the string at i index of brokenString
			System.out.print(brokenString[i]);
		}

		System.out.print("\nThe array of Integers : ");
		//Print the array <tenNaturalNos> in the same manner using a for loop
		for(int i=0; i<tenNaturalNos.length; i++)
		{
			// print the string at i index of brokenString
			System.out.print(tenNaturalNos[i]);
		}

		//Invoke the concatenateStrings method using the array <brokenString> as input
		System.out.println("\nThe array of Strings now becomes : "+ concatenateStrings(brokenString));

		//Similarly invoke the findSumOfArray method using the <tenNaturalNos> as input
		System.out.println("The sum of the integers in the array is : " + findSumOfArray(tenNaturalNos));

		//Ask the user to switch the 3rd element and the 8th element in the above array
				System.out.println("Please switch the 3rd element and the 8th element in the above array. ");
				int[] newArray=switchElementOfArray(tenNaturalNos,3,8);
				// Print out the newArray
					for(int i=0; i<newArray.length; i++)
					{

								System.out.println(newArray[i]);
					}
	}
}
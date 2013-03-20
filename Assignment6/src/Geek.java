/**
 * AUTHOR: Jeff Scaturro
 * FILENAME: Geek.java
 * SPECIFICATION: Models a person who is a geek. This answers various questions
 * as well as having a name and also keeps track of how many questions s/he has answered.
 * YOUR LAB LETTER: H
 * FOR: CSE 110- HW6 - MW 3:00pm-4:15pm
 * TIME SPENT: 1 Hour
 */

public class Geek
{
	// Two variables to store Name and Questions asked.
	private String geekName;
	private int numberOfQuestions;
	// Constructor to set geekName and numberOfQuestions
	public Geek(String name, int numQuestions)
	{
		geekName = name;
		numberOfQuestions = numQuestions;
	}
	// Methods
	// getName, returns name in a string
	public String getName()
	{
		return geekName;
	}
	// getNumberOfQuestions, returns how many of questions asked
	public int getNumberOfQuestions()
	{
		return numberOfQuestions;
	}
	// boolean to set true if all three ints from entered are the same
	public boolean allTheSame(int num1, int num2, int num3)
	{
		numberOfQuestions++; // Counts as a question, so tallys that.
		if (num1 == num2 && num2 == num3 && num1 == num3)
				return true;
		else
				return false;
	}
	// boolean to test if a number is prime
	public boolean isPrime(int number)
	{
		numberOfQuestions++; // Tally's the number of questions.
		for (int i = 2; i < number; i++)
		{
			if(number % i == 0)
				return false;
		}
		return true;
	}
	// two ints to find sum of all numbers between the two given, even if the same or second one is greater.
	public int sum(int num1, int num2)
	{
		numberOfQuestions++; //Tally's the question
		// Set up two variables, largerNumber and smallerNumber for future adding.
		int largerNumber = 0;
		int smallerNumber = 0;
		int sum = 0; // Sum of the numbers inbetween.
		// Find out which number is the greater one.
		if (num1 > num2)
		{
			largerNumber = num1;
			smallerNumber = num2;
		}
		else
		{
			largerNumber = num2;
			smallerNumber = num1;
		}
		sum = smallerNumber; // Sets sum to smaller number because of how i set up the for loop
		// use a for loop to add all the numbers in between the smaller and larger Number.
		for (int i = smallerNumber + 1; i <= largerNumber; i++) // less than or equal to because adding one to it to test if same.
		{
			sum += i;
		}
		return sum;
	}
	// repeats the user entered string n times.
	public String repeat(String str, int n)
	{
		numberOfQuestions++; // Tally's questions asked.
		String combinedStrings = ""; // Sets string to add the str to it.
		for (int i = 0; i < n; i++)
		{
			combinedStrings += str;
		}
		return combinedStrings;
	}
	// Tests if str is the same when listed backwards (Palindrome). 
	public boolean isPalindrome(String str)
	{
		numberOfQuestions++; // tally's questions asked.
		String reversed = new StringBuffer(str).reverse().toString(); // Use methods already created to reverse it ;)
		// test if str equals reversed
		if (str.equals(reversed))
		{
			return true;
		}
		else
			return false;
	}
}
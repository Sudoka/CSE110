/**
 * AUTHOR: Jeff Scaturro
 * FILENAME: CharCollection.java
 * SPECIFICATION: Assists Assignment7.java and contains the constructors
 * 		and methods used therein.
 * YOUR Lab Letter: H
 * FOR: CSE 110 - MW 3:00m-4:15pm
 * TIME SPENT: 2
 */

// Use for Random Character generator..
import java.util.Random;


public class CharCollection
{ // Start class
	// Initialize instance variable, array charArray.
	private char[] charArray;
	private char[] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l',
			'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	// Constructor. Instantiates an array of chars specified by the integer parameter.
	public CharCollection(int arraySize)
	{
		charArray = new char[arraySize];
	}

	// Method generates random characters between the two given chars...
	public void add(char fromChar, char toChar)
	{
		// Set up r as a random generator.
		Random r = new Random();
		// Set up an array.

		int startIndex = 0;
		int endIndex = 0;

		// Find start and end index.
		for(int i = 0; i < alphabetArray.length; i++)
		{
			if(alphabetArray[i] == fromChar)
			{
				startIndex = i;
			}
			if(alphabetArray[i] == toChar)
			{
				endIndex = i;
			}
		}
		// Assign random characters between.
		for(int i = 0; i < charArray.length; i++)
		{
			charArray[i] = alphabetArray[r.nextInt(endIndex-startIndex+1)+startIndex];
		}
	}

	// Method returns an array of 26 int values,
	public int[] countLetters()
	{
		// New array
		int countLettersArray[] = new int[26];
		for(int i = 0; i < countLettersArray.length; i++)
		{
			for(int j = 0; j < charArray.length; j++)
			{
				if(charArray[j] == alphabetArray[i])
				{
					countLettersArray[i]++;
				}
			}
		}
		return countLettersArray;
	}

	// find the mean of countLerrers Array
	public double mean(int[] x)
	{
		double sum = 0.0;
		int[] temp = countLetters();
		for(int i = 0; i < temp.length; i++)
		{
			sum += temp[i];
		}
		return sum;
	}

	// Displays the array of characters, 20 chars per line:
	public String toString()
	{
		String result = "";
		int count = 0;
		while(count < charArray.length)
		{
			for(int i = 0; i < charArray.length; i++)
				{
					result += charArray[i];
					if(i % 19 == 0)
						result += "\n";
					count++;
				}
		}
		return result;
	}
}
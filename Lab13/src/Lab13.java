import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*---------------------------------------------------------------------------
// AUTHOR:          Jeff Scaturro
// FILENAME:        Lab13.java
// SPECIFICATION:   This program is about file i/o
// INSTRUCTIONS:    Read the following code skeleton and add your own code
//                  according to the comments.  Ask your TA or your class-
//                  mates for help and/or clarification.  When you see
//                  //--> that is where you need to add code.
// Lab Letter: 		H
//-------------------------------------------------------------------------*/
public class Lab13
{
	/*
	 * The object of this lab is to read address records from a file that 
	 * contains 5 address records and extracts just the names and print 
	 * these to the screen. The file is formatted like
	 * 
	 * Name: <name>
	 * Phone Number: <number>
	 * Address: <address>
	 * ------------
	 * Name: <name>
	 * Phone Number: <number>
	 * Address: <address>
	 * ------------
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String inputFile;
		
		//instantiate an object of type Lab13
		Lab13 object = new Lab13();
		
		//declare an array of strings called names
		String[] names;
		
		//User input will be like address.txt
		//Ask the user for the input file
		System.out.println("What is the input files name? (Include the file extension).");
		inputFile = scan.nextLine();
		
		//get the list of names from the file
		names = object.readNames(inputFile);
		
		// Say what the heck its listing:
		System.out.println("The list of names from " + inputFile + " is:");
		//print the names
		object.printNames(names);
	}
	
	public String[] readNames(String filename)
	{
		String[] names = new String[5];
		String currentLine = "";
		int index = 0;
		try
		{
			//make a new scanner object that will read from the file
			Scanner in = new Scanner(new File(filename));
			
			//loop as long as the scanner still has contents (use the hasNext method)
			while(in.hasNext())
			{
				//if the current line has "Name" in it, add the name (starts at the 
				//7th character) to the array and increase the index
				if(currentLine.contains("Name"))
				{
					names[index] = currentLine.substring(6);
					index++;
				}
				//read the next line from the file
				currentLine = in.nextLine();
			}
			
			//print a message saying the address book file is done being read
			System.out.println("The address book file is done being read.");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		//return the array of names
		return names;
	}
	
	public void printNames(String[] names)
	{
		//print out every element in the array
		for(int i = 0; i < 5; i++)
		{
			System.out.println(names[i]);
		}
	}
}
/*---------------------------------------------------------------------------
// AUTHOR:      	Jeff Scaturro
// FILENAME:    	Lab5.java
// SPECIFICATION: 	This program is for practicing nested loops. 
//                    The first task is to print a multiplication table 
//                      whose size is specified by the user.
//                    The second (optional, no extra credit, just for fun) 
//                      task is to encode a string entered by the user. 
//                      The encryption you will use is as follows: in the ith 
//                      word, shift every letter up by i (so if the sentence
//                      is "abc abc abc", it becomes "bcd cde def").
// INSTRUCTIONS:  	Read the following code skeleton and add your own code
//          		according to the comments.  Ask your TA or your class-
//          		mates for help and/or clarification.  When you see
//          		//--> or ??? that is where you need to add code.
// LAB LETTER:		H
//-------------------------------------------------------------------------*/

//	Import required package (Scanner)
import java.util.Scanner;

//Declare class (Lab5)
public class Lab5
{
	//Declare the main method
	public static void main(String[] args)
	{
		//Declare some variables: a Scanner (and initialize) and an integer that holds
		//the user's choice of how big the multiplication table is.
		Scanner scan = new Scanner(System.in);
		int tableSize = 0;

        //For the second task (optional) declare the following:
		//an integer variable to keep track of what word we're currently operating on, 
		//a String array that holds each word int the user's sentence separately
		//a String that holds the encrypted text, 
		//Give the strings initial values of "" (empty string but not null), 
		//and give the first integer variable an initial value of 0
		int currentWord = 0;
		//-->
		//-->
		
		//make a do while loop that will repeat until the user enters a valid
		//input (an integer from 1 to 20).

        do
        {
	    		//Ask the user how large to make the multiplication table
	    		System.out.print("How large would you like the multiplication table? ");
	    		//Read in the user's input
	    		tableSize = scan.nextInt();
    		
	        //output the multiplication table if the user's input is within the 
	        //appropriate range (1-20)
	        if (tableSize >= 1 && tableSize <= 20)
	        {
				//Print out the following string used for formatting the table "\nX\t"
				//use print, not println
				System.out.print("\nX\t");
				
				//make a for loop that prints each of the numbers from 1 to the user-specified number
				//putting a tab '\t' character in between each number (all on the same line)
				for(int count = 1; count <= tableSize; count++)
					System.out.print(count + "\t");
				
				//Print out the following string used for formatting the table "\n\t"
				//use print, not println
					System.out.print("\n\t");
				
				//make a for loop that prints out the string "--------"  (on the same line)
				//a number of times equal to the user specified size of the multiplication 
				//table (more formatting)
				for(int count1 = 0; count1 < tableSize; count1++)
						System.out.print("--------");
				
				//Print a blank line
				System.out.print("\n");
				
				
				//make a for loop that will range a variable i from 1 to the user-specified 
				//size of the multiplication table. At the start of each row (the outer loop),
				//you should print the current row number and the string "|\t" for formatting
				//Inside of that for loop, do the same for 
				//a variable j. Each table entry will be i*j and you should print this as well 
				//as tab character '\t' after each entry. Also, after each row is done, you 
				//should print a blank line.
				for(int i = 1; i <= tableSize; i++)
				{
					System.out.print(i + "|\t");
					for(int j = 1; j <= tableSize; j++)
					{
						System.out.print(i * j + "\t");
					}
					//Print a blank line
					System.out.print("\n");
				}
	        }
	        //otherwise print out an error telling the user the input is out of range
	        else
	        {
	        	System.out.print("Input is out of range.\n");
	        }
        } while (tableSize <1 || tableSize >20);
	    
        
       // ???(???);
		/*
		//Prompt the user to enter a sentence without punctuation
		//there is still a newline leftover from the user's input before, 
		//so let's do a scan.nextLine to get rid of that first.
		//-->
		//-->
		//To test, try with the string "bnmfqzstkzshnmr wms dlq ep mdbco"
		
		//Store the user's input sentence into the appropriate String array variable declared above
		//by first convert the string to lower case and then splitting the string on the space
		//characters.
		??? = ???.???().toLowerCase().???(" ");
		
		//Write a while loop with the given condition. This condition is true if there are
		//still broken up pieces of the original String still in the String array.
		???(??? < ???.length)
		{			
			//make a for loop that has i range from zero to the length of the current
			//word.
			???(???; ??? < ???[index].length(); ???)
			{
				//Take the ith character of the word we're currently looking at and 
				//"shift" it a number of letters equal to which number word we're looking 
				//at (1 if it's the first word, 2 if it's the second, etc).
				//This is ugly but to understand it, realize that 97 is the ASCII code for
				//'a'. In other words ('a' == 97) is a true statement.
				??? += (char)(((???.charAt(???) - 97 + index + 1) % 26) + 97);
			}
			//now that we're done processing one of the words
			//keep track that we are now going to look at the next word
			???++;
			//add a space to the encoded string
			??? += ???;
		}
		
		//print back out the encoded string.
		//-->
		*/
	        
	//close the main method
	} 
//close the class
}
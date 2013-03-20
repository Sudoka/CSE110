/**
 * AUTHOR: Jeff Scaturro
 * FILENAME: Assignnment7.java
 * SPECIFICATION: This program provides a menu to the user with options to dispaly
 * 		all the caharcters stored in an array of characters, counting teh number of occurence of each character,
 * 		finds the mean of letters from letter a to z.
 * YOUR Lab Letter: H
 * FOR: CSE 110 - MW 3:00m-4:15pm
 * TIME SPENT: 2
 */

/* 
 * 1) a. 
 * 		The syntax is as follows:
 * 		Type[] variableName = new Type[capacity];
 * 		Type[] variableName = {comma-delimited values};
 *		Type variableName[] = new Type[capacity];
 * 2) 0 1 2 3 4
 * 3) As it is written, it won't compile, due to the System.out.println(x[i]); being outside
 * 	the for loop, so it can't access the variable i. However, if you put it in brackets
 * 	for the for loop, then you get 0 1 2 3 4 (on seperate lines). 
 * 4) First error, initializing double list array. should be:
 * 		double[] list = {3, 4, 5, 6.3};   // Take out the 4 in brackets.	
 * 	Second error, the parameter of xMethod should be (double[] list) not int.
 * 	Third error, in the for loop, it should be < list.length not <=.
 * 	Fourth error, we want it to print out the sum, add the print ln command.
 * 	Finished code:
 *		public class Hw7
 *		{
 *			public static void main(String[] args)
 *			{
 *				double[] list = {3, 4, 5, 6.3};
 *				System.out.println(xMethod(list));
 *			}
 *			
 *			public static double xMethod(double[] list)
 *			{
 *				double sum = 0;
 *				for (int i = 0; i < list.length; i++)
 *				{
 *					sum += list[i];
 *				}
 *				return sum;
 *			}
 *		}
 */

import java.util.*;

public class Assignment7
{
  //     public static void main (String[] args)

  public static void main( String[] args )
  {
		System.out.print("------\tMenu:\t------\n" +
                        "a\tDisplay\n" +
                        "b\tDisplay the number of each letter occurrences\n" +
						"c\tDisplay the mean\n" +
                        "q\tQuit\n" +
                        "?\tDisplay Help\n\n");
		Scanner scan = new Scanner(System.in);

		// ask a user for an array size
	    System.out.print("Please enter a size for the array: ");
        int size = scan.nextInt();
		CharCollection charObject = new CharCollection(size);


	    System.out.print("Enter from character to be generated: ");
	    String line = scan.next();
	    char from = line.charAt(0);
	    System.out.print("Enter to character to be generated: ");
	    line = scan.next();
		char to = line.charAt(0);
		// call method add to generate random characters from 'a' through 'z'
		charObject.add(from, to);

		System.out.println("Random characters between \'" + from + "\' to \' " + to +"\' is generated");
	    System.out.println("Please enter a command or type ? ");
	    String command = scan.next();

	    // call the appropriate method
		while (command.charAt(0) != 'q')
		{
			switch (command.charAt(0))
			{
				case 'a' : // display
					// call the toString method and display the array of characters
				      System.out.println(charObject.toString());
					  break;
			    case 'b':
					 // call the method countLetters and print the number of
					 // occurences of each letter( a through z)
					  int[] temp = charObject.countLetters();
					  for (int index=0; index<temp.length;index++)
					  { if((index+1) % 10 == 0)
							System.out.println((char)(index + 'a')+":"+ temp[index]);
						else
							System.out.print((char)(index + 'a')+ ":"+temp[index] +" ");
					  }
					  System.out.println();
					  break;
			    case 'c': // find the mean of letters from letter a to z
					     // and print it using Decimal format
					  temp = charObject.countLetters();
					  System.out.println(charObject.mean(temp));
					  break;

				case '?' : // help menu
					  System.out.print("------\tMenu:\t------\n" +
                        "a\tDisplay\n" +
                        "b\tDisplay the number of each letter occurrences\n" +
						"c\tDisplay the mean\n" +
                        "q\tQuit\n" +
                        "?\tDisplay Help\n\n");
					  break;

				case 'q': // stop the program
					 break;

				default:
					 System.out.println("Illegal cammand!");
			} // end of switch
			System.out.println("Please enter a command or type ? ");
			command = scan.next();
		} // end of while loop
	} // end of main
}// end of class TestDriver
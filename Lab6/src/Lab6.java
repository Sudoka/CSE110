/*---------------------------------------------------------------------------
// AUTHOR:        Jeff Scaturro
// FILENAME:      Lab6.java
// SPECIFICATION:   This program is for practicing nested loops.
//                  It  prints out a right triangle of stars and
                    finds all even and odd numbers less than a user entered
                    number
// INSTRUCTIONS:    Read the following code skeleton and add your own code
//              according to the comments.  Ask your TA or your class-
//              mates for help and/or clarification.  When you see
//              //--> that is where you need to add code.
// LAB LETTER:	H
//-------------------------------------------------------------------------*/


//import anything you need
import java.util.Scanner;


//declare the class Lab6
public class Lab6
{
    //declare the main method
    public static void main(String[] args)
    {

		// Define scan object of the type Scanner class
		Scanner scan = new Scanner(System.in);

        //Use a println statement to output 'A right triangle of stars with a base and height of 10'
        System.out.println("A right triangle of stars with a base and height of 10");

        /*The first nested loop.
          Print out a right triangle of stars left flush against the screen with a height and
          base of 10.  The end result should be:
          *
          **
          ***
          ****
          *****
          ******
          *******
          ********
          *********
          **********
        */

		// First for loop
		// 1st ??? --> define an int variable <i> and initialize it to 1
		// 2nd ??? --> check if <i> is less than equal to 10
		// 3rd ??? --> increment variable <i> by 1
        for (int i = 1; i <= 10; i++)
        {
			// Second for loop
			// Let the inner loop run from j=1 up to and including i, the counter for the outer loop
            for (int j = 1; j <= i; j++)
            {
				// The inner loop prints the single star
                System.out.print("*");
            }
			// You may need another print statement after exiting the inner loop to get a newline.
            System.out.print("\n");
        }


        //Finding even and odd numbers around a user entered number.
        //Print out 'Now we will find some even and odd numbers.'
        System.out.print("Now we will find some even and odd numbers. ");

		//You will have to declare <num> before you enter the do-while loop.
        int num;

		// do-while statement
        do
        {
			// Prompt the user: "Please enter an integer greater than 2: "
            System.out.print("\nPlease enter an integer greater than 2: ");
			// Take the user's input into <num>
            num = scan.nextInt();
			// If the number entered by user is less than or equal 2, print out <num> is not greater than 2
            if (num <= 2)
            {
            	System.out.print(num + " is not greater than 2.");
            }
        }
		// check in the while, if the <num> is less than or equal to 2
		while (num <= 2);

        /* Now we will print out all the even and odd numbers that are less than the number entered.
           For example if the user entered 6 the program would output:
              All the even numbers from 2 to 6 are: 2 4
			  All the odd numbers from 2 to 6 are: 3 5
        */

		// Print out (use just print not println) : "All the even numbers from 2 to <num> are" 
		System.out.print("\nAll the even numbers from 2 to " + num + " are: ");

        // for loop to search for even numbers
		// Define an int variable <i> and initilize it to 2, check if <i> is less than or equal to <num>, increment <i>
		for(int i = 2; i <= num; i++)
		{
			// check if <i> is even and if it is even print out the <i> (use print not println)
			if (i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}

		System.out.println();

		// Print out (use just print not println) : "All the odd numbers from 2 to <num> are" 
		System.out.print("All the odd numbers from 2 to " + num + " are: ");

		// Use the for loop as you sued to print even numbers, but to find odd numbers, just change the if loop condition
		for(int i = 3; i <= num; i++)
		{
			// check if <i> is even and if it is even print out the <i> (use print not println)
			if (i % 2 != 0)
			{
				System.out.print(i + " ");
			}
		}

    //Remember to close the braces for the main method and class.
    }
}


/*Questions for thought:

    1. The three types of loops (for, while, and do-while) are all equivalent.  That is
         each can be turned into the other two.  How would you do each of these transformation.
         i.e. How would you turn a for into a while, or a while into a do-while, etc.
    2. If the three types are equivalent, why does Java provide the three differnt types of loops?
         When is it more convenient to use a for loop? a while loop? a do-while loop?
    3. Modify the stars program to print out a square of stars using nested loops (shown for a square of side 5):
         *****
         *****
         *****
         *****
         *****
    4. Modify the the first part of the assignment to print out a right triangle of stars that is
         right flushed (shown for a height and base of 5):
              *
             **
            ***
           ****
          *****
    5. Why in finding if a number is prime do we only need to see if it has a divisor that is less
         than the square root of the number?
    6. How can you change the outer loop of the prime part to figure out the next 5 prime numbers
         after the number entered? The next m numbers, where m is a user entered value?
*/
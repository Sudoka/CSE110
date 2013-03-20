/*---------------------------------------------------------------------------
// AUTHOR:      Jeffrey Scaturro
// FILENAME:    Lab3.java
// SPECIFICATION:   This program is for practicing the use of if-else conditional
//          expressions and boolean operators.  It also reviews some previous topics.
//          It asks the user to: 1. Compare two numbers
//                               2. Simulate a two-player game
// LAB LETTER: H
//-------------------------------------------------------------------------*/

/*
* Read through the following program. It is partially filled. Read
* the comments and fill up the code wherever you find the sign //-> or ???
*/

//Import the Scanner classes from the java.util package
import java.util.Scanner;

//Declare the class (Lab3)
public class Lab3
{
     //Declare the main method
	public static void main(String[] args)
	{
        //Instantiate an object of type Scanner to read input from the keyboard

		Scanner scan = new Scanner(System.in);

        // Part 1: you need to compare two integers, and output the smaller one

        //Prompt the user to enter two integer numbers, store them in two int variables: x and y
		int x,y;
		System.out.println("Enter a value for x:");
		x = scan.nextInt();
		System.out.println("Enter a value for y:");
		y = scan.nextInt();
		// Compare the value of x and y, if x is smaller or equal to y, display x; otherwise, display y
		if (x < y)
		{
			System.out.println("The smallest value was " + x);
		}
		else
		{
         System.out.println("The smallest value was " + y);
		}



        /* Part 2: Simulate a two-player game in which each person simultaneously chooses either rock, paper, or scissors.

		Rock beats scissors but loses to paper, paper beats rock but loses to scissors, and scissors beats paper but loses to rock.

		The following code prompts player 1 and player 2 to each enter a string: rock, paper, or scissors. Finish the code by

		adding nested if statements to appropriately report ??Player 1 wins??, ??Player 2 wins??, or ??It is a tie."
         */
		
		/*
		// Why declare the strings if I'm declaring them while collecting the response??
		// Declare 3 string variables to store 2 players' choices
		//String playerChoice1;
		//String playerChoice2;
		 */

        System.out.println("Player 1: Choose rock, scissors, or paper:");
        //Load player1's choice in to the variable, convert it to lower case
        String  playerChoice1 = scan.next().toLowerCase();

        System.out.println("Player 2: Choose rock, scissors, or paper:");
        //Load player2's choice in to the variable, convert it to lower case.
        String playerChoice2 = scan.next().toLowerCase();


        /* There are 9 cases in total lead to 3 results: Tie, player1 wins and play2 wins. Please use "if" statement and
		boolean operators to describe these 9 cases. */

        // case 1-3: Ties
        if (playerChoice1.equals("rock") && playerChoice2.equals("rock"))
        {
           System.out.println("It is a tie.");
        }
        if (playerChoice1.equals("paper") && playerChoice2.equals("paper"))
        {
           System.out.println("It is a tie.");
        }
        if (playerChoice1.equals("scissors") && playerChoice2.equals("scissors"))
        {
           System.out.println("It is a tie.");
        }
        
        // case 4-6: Player 1 wins:
        if (playerChoice1.equals("rock") && playerChoice2.equals("scissors"))
        {
           System.out.println("Player 1 wins.");
        }
        if (playerChoice1.equals("paper") && playerChoice2.equals("rock"))
        {
           System.out.println("Player 1 wins.");
        }
        if (playerChoice1.equals("scissors") && playerChoice2.equals("paper"))
        {
           System.out.println("Player 1 wins.");
        }
        
        // case 7-9: Player 2 wins:
        if (playerChoice2.equals("rock") && playerChoice1.equals("scissors"))
        {
           System.out.println("Player 2 wins.");
        }
        if (playerChoice2.equals("paper") && playerChoice1.equals("rock"))
        {
           System.out.println("Player 2 wins.");
        }
        if (playerChoice2.equals("scissors") && playerChoice1.equals("paper"))
        {
           System.out.println("Player 2 wins.");
        }
    }
}
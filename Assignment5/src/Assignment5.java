/*-------------------------------------------------------------------------
// AUTHOR: Jeff Scaturro
// FILENAME: Assignment5.java
// SPECIFICATION: Designing a class that represents a Bank Account and banking
// activities. Each Bank Account has an id and balance. This Bank account class
// represents a regular account. 
// Lab Letter: H
// FOR: CSE 110- MW 3:00-4:15
// TIME SPENT: ...
//----------------------------------------------------------------------*/

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Send messages to a bank account to practice
 constructing objects and sending messages. This also helps one
 become familiar with the messages each BankAccount object understands
 *
 */

public class Assignment5
{
	// interest rates for each type of account
    static final double BASIC_IR = .025;
	static final double PREMIUM_IR = .035;
	static final double PLATINUM_IR = .045;

	// minimum amounts for account types
	static final double BASIC_MINIMUM = 0;
	static final double PREMIUM_MINIMUM = 1000;
    static final double PLATINUM_MINIMUM = 5000;
    
    public static void main(String[] args)
	{
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

		//Make a Scanner object to get the input
		Scanner scan = new Scanner(System.in);
		double enteredAmount;
		char command;
		boolean flag;
		String input;
		
		// print intro message
        System.out.println("Welcome to CS110 BANK!");

        // Ask for id
        System.out.print("What is your bank id? ");
		String enteredID = scan.nextLine();

       // Ask user for initial deposit
        do
        {
            System.out.print("Initial deposit into Checking: ");
            enteredAmount = scan.nextDouble();

            // make sure they enter a positive number
            if ( enteredAmount <= 0 )
            {
                System.out.println("Invalid choice (number must be positive).");
            }

        } while ( enteredAmount <= 0 );


		BankAccount account1 = new BankAccount(enteredID, enteredAmount);


		// print the menu
        printMenu();
		do
		 {
           // ask the user to choose a command
		   System.out.println("\nPlease enter a command or type ?");
		   input = scan.next();
           command = input.charAt(0);

           switch (command)
            {
                 case 'a': // Ask user for initial deposit
       						 do
       						 {
       						     System.out.print("Initial deposit: ");
       						     enteredAmount = scan.nextDouble();
       						     // make sure they enter a positive number
       					     if ( enteredAmount <= 0 )
       					     {
       						         System.out.println("Invalid choice (number must be positive).");
       					     }

       						 } while ( enteredAmount <= 0 );

                            account1.deposit(enteredAmount);
                            System.out.println("You deposited " + fmt.format(enteredAmount) + " to Checking.");

			               //print a prompt after the deposit

                      break;

                 case 'b':

					        do
					        {
					          System.out.print("Amount to withdraw: ");
					          enteredAmount = scan.nextDouble();

					          // make sure amount is positive and less than current checking balance
					          if (enteredAmount <= 0)
					          		System.out.println("Invalid choice (number must be positive).");
					        } while (enteredAmount <= 0);

					       // update balance and display message
					       flag = account1.withdraw(enteredAmount);
					       if (flag)
					       			System.out.println("You withdrew " + fmt.format(enteredAmount));
					       	else
					       			System.out.println("Invalid choice (not sufficient fund)");


                      break;

                 case 'c': // print the info on each account
                	 		System.out.print("\nCurrent bank's ID: " + account1.getID());
                	 		System.out.print("\nCurrent bank's balance: " + account1.getBalance());
                	 		

                      break;
                 case 'd': // ask for id and instantiate a new account using the entered id
					       // but same balance from account1
					       // then use the method equals to check to see if the ids are the same or not!

					       // Ask for id
						   System.out.print("What is your bank id? ");
						   enteredID = scan.next();

						    // Ask user for initial deposit
						   BankAccount account2= new BankAccount(enteredID, enteredAmount);
						   flag = account1.equals(account2);
						   if (flag)
						   		System.out.println("Same account");
						   	else
						   		System.out.println("Not the same account!");



                      break;
                 case '?': // display the menu again
                             printMenu();

                      break;
                 case 'q':// add the interest based on type of account and quit the program
                 			System.out.println(account1.toString()); // took out add interest method here to use in toString() method.


                      break;
				 default:
					  System.out.println("Invalid choice!");
					  break;


            }

        } while (command != 'q');
	} // end of main
    
	 // this method prints out the menu to a user
   public static void printMenu()
   {
    System.out.print("\nCommand Options\n"
                   + "-----------------------------------\n"
                   + "a: deposit\n"
                   + "b: withdraw\n"
                   + "c: display the balance \n"
                   + "d: Check the account\n"
                   + "?: display the menu again\n"
                   + "q: quit this program\n\n");
    }

}  // end class
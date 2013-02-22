/*
 * AUTHOR: Jeff Scaturro
 * FILENAME: Assignment3.java
 * SPECIFICATION: This assignment is to cover the topics in chapter
 *  3: Control flow, if-else statements, and switch statements. We will
 * 	do this through creating a bank with 3 accounts and offering different
 * 	options such as depositing, withdrawing, etc. 
 * Lab: H
 * FOR: CSE 110- Assignment 3 - MW 3:00pm-4:15pm
 * TIME SPENT: 1.5 hours.
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class Assignment3 
{
	public static void main(String[] args) 
	{
		// Implement the scan method from scanner.
		Scanner scan = new Scanner(System.in);
		
		// set up numberformat:
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		// Display the main bank/first prompt and get their name.
		System.out.println("Welcome to CSE110 Bank");
		System.out.print("What is your name? ");
		
		// Declare string variable "name"
		String firstName = scan.next();
		String lastName = scan.next();
		
		/*
		 * Used to make sure the variables were stored right.
		 * System.out.print(firstName + " ");
		 * System.out.print(lastName);
		 */
		
		// Declare variable for initial deposit to savings and checkings.
		double initialDepositSavings, initialDepositChecking = 0.0;
		
		// Prompt user for a deposit into each, store it into appropriate value.
		System.out.print("\nInitial deposit into Savings: ");
		initialDepositSavings = scan.nextDouble();
		System.out.print("\nInitial deposit into Checking: ");
		initialDepositChecking = scan.nextDouble();
		
		// use initial total to decide what type of account
		double initialTotal = initialDepositChecking + initialDepositSavings;
		
		// use if statement to decide which account type and interest rate.
		double interestRate;
		String accountType = null;
		
		if ( initialTotal < 1000)
		{
			interestRate = 0.025;
			accountType = "Basic Account";
		}
		if ( initialTotal >= 1000 && initialTotal <= 5000 )
		{
			interestRate = 0.035;
			accountType = "Premium Account";
		}
		if ( initialTotal > 5000)
		{
			interestRate = 0.045;
			accountType = "Platinum Account";
		}
		
		// Print name, account type, and balance. 
		System.out.println("\n" + firstName + " " + lastName + "'s "+ accountType + " balance is: " + nf.format(initialTotal)
				+ " (S: " + nf.format(initialDepositSavings) + ", C: " + nf.format(initialDepositChecking) + ")");
		
		// Print bank Menu
		System.out.print("\nBank Options: \n1. Deposit Money \n2. Withdraw Money \n3. Transfer Money \n4. Quit");
		System.out.print("\nYour choice: ");
		
		// use userMainChoice as variable
		int userMainChoice = scan.nextInt();
		
		// check to see if valid input, if not re-prompt
		if ( userMainChoice < 1 || userMainChoice > 4 )
		{
			System.out.print("\nInvalid input, please enter a valid choice: ");
			userMainChoice = scan.nextInt();
		}
		
		// declare checkingTotal and savingsTotal to use from switch
		double checkingTotal = initialDepositChecking;
		double savingsTotal = initialDepositSavings;
		double totalBalance = checkingTotal + savingsTotal; 
		
		// take input and prompt to next actions
		switch (userMainChoice)
		{
			case 1: userMainChoice = 1;
					// Give deposit money options menu and store input in userCaseChoice
					System.out.print("\nDeposit Money Options: \n1. Deposit to Checking \n2. Deposit to Savings \n3. Cancel \nYour choice: ");
					int userDepositChoice = scan.nextInt();
					switch (userDepositChoice)
					{
						// Deposit to Checking, update checking total, update total balance, print.
						case 1: userDepositChoice = 1;
								System.out.print("\nAmount to deposit to Checking: ");
								double additionalDepositChecking = scan.nextDouble();
								checkingTotal += additionalDepositChecking;
								System.out.print("\nYou deposited " + nf.format(additionalDepositChecking) + " to Checking.");
								totalBalance = checkingTotal + savingsTotal; 
								System.out.print("\nAfter this transaction your balance is: " + nf.format(totalBalance)
										+ " (S: " + nf.format(savingsTotal) + ", C: " + nf.format(checkingTotal) + ")");
								break;
						
						// deposit to Savings. update savings total, update total balance, print.
						case 2: userDepositChoice = 2;
								System.out.print("\nAmount to deposit to Savings: ");
								double additionalDepositSavings = scan.nextDouble();
								savingsTotal += additionalDepositSavings;
								System.out.print("\nYou deposited " + nf.format(additionalDepositSavings) + " to Savings.");
								totalBalance = checkingTotal + savingsTotal; 
								System.out.print("\nAfter this transaction your balance is: " + nf.format(totalBalance)
										+ " (S: " + nf.format(savingsTotal) + ", C: " + nf.format(checkingTotal) + ")");
								break;
								
						// cancel here means that menu goes back to Main menu?		
						case 3: userDepositChoice = 3;
								System.exit(0);
								break;
					}
					break;
					
			case 2: userMainChoice = 2;
					System.out.print("\nWithdraw Money Options: \n1. Withdraw from Checking \n2. Withdraw from Savings \n3. Cancel \nYour choice: ");
					int userWithdrawChoice = scan.nextInt();
					switch (userWithdrawChoice)
					{
						// withdraw from checking, update checking total, update balance total, print.
						case 1: userWithdrawChoice = 1;
								System.out.print("\nAmount to withdraw from Checking: ");
								double withdrawChecking = scan.nextDouble();
								checkingTotal -= withdrawChecking;
								System.out.print("\nYou withdrew " + nf.format(withdrawChecking) + " from Checking.");
								totalBalance = checkingTotal + savingsTotal; 
								System.out.print("\nAfter this transaction your balance is: " + nf.format(totalBalance)
										+ " (S: " + nf.format(savingsTotal) + ", C: " + nf.format(checkingTotal) + ")");
								break;
						
						// withdraw from savings, update savings total, update balance total, print
						case 2: userWithdrawChoice = 2;
								System.out.print("\nAmount to withdraw from Savings: ");
								double withdrawSavings = scan.nextDouble();
								savingsTotal -= withdrawSavings;
								System.out.print("\nYou withdrew " + nf.format(withdrawSavings) + " from Savings.");
								totalBalance = checkingTotal + savingsTotal; 
								System.out.print("\nAfter this transaction your balance is: " + nf.format(totalBalance)
										+ " (S: " + nf.format(savingsTotal) + ", C: " + nf.format(checkingTotal) + ")");
								break;
								
						// quitter.		
						case 3: userWithdrawChoice = 3;
								System.exit(0);
								break;
					}
					break;
					
			case 3: userMainChoice = 3;
					System.out.print("\nTransfer Money Options: \n1. Transfer from Checking to Savings \n2. Transfer from Savings to Checking" +
							"\n3. Cancel \nYour choice: ");
					int userTransferChoice = scan.nextInt();
					switch (userTransferChoice)
					{
						// Transfer from Checking to Savings, read input, subtract that from Checking, add to Savings, update total balance, print.
						case 1: userTransferChoice = 1;
								System.out.print("\nAmount to transfer from Checking to Savings: ");
								double transferFromCheckingToSavings = scan.nextDouble();
								checkingTotal -= transferFromCheckingToSavings;
								savingsTotal += transferFromCheckingToSavings;
								System.out.print("\nYou transferred " + nf.format(transferFromCheckingToSavings) + " from Checking to Savings.");
								totalBalance = checkingTotal + savingsTotal;
								System.out.print("\nAfter this transaction your balance is: " + nf.format(totalBalance)
										+ " (S: " + nf.format(savingsTotal) + ", C: " + nf.format(checkingTotal) + ")");
								break;
						
						// Transfer from Savings to Checking, read input, subtract that from savings, add to checking, update total balance, print.
						case 2: userTransferChoice = 2;
								System.out.print("\nAmount to transfer from Savings to Checking: ");
								double transferFromSavingsToChecking = scan.nextDouble();
								savingsTotal -= transferFromSavingsToChecking;
								checkingTotal += transferFromSavingsToChecking;
								System.out.print("\nYou transferred " + nf.format(transferFromSavingsToChecking) + " from Savings to Checking.");
								totalBalance = checkingTotal + savingsTotal;
								System.out.print("\nAfter this transaction your balance is: " + nf.format(totalBalance)
										+ " (S: " + nf.format(savingsTotal) + ", C: " + nf.format(checkingTotal) + ")");
								break;
								
						// Quittttttter.
						case 3: userTransferChoice = 3;
								System.out.print("\nTransfer cancelled.");
								System.exit(0);
								break;
					}
					break;
					
			case 4: userMainChoice = 4;
					System.out.print("\nThanks for banking with us, have a nice day!");
					System.exit(0);
					break;
		}
	}

}

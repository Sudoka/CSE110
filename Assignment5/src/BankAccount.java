/*-------------------------------------------------------------------------
// AUTHOR: Jeff Scaturro
// FILENAME: Assignment5.java
// SPECIFICATION: Contains many constructors and methods that participates in
// 	activities of the main Assignment5.java file. 
// Lab Letter: H
// FOR: CSE 110- MW 3:00-4:15
// TIME SPENT: ...
//----------------------------------------------------------------------*/

import java.text.NumberFormat;

public class BankAccount 
{
	private String id;
	private double balance;
	
	
	// Constructors (3)
	public BankAccount() // Default constructor, sets ID to ?? and balance to 0. Makes the account.
	{
		id = "???";
		balance = 0;
	}
	
	public BankAccount(String initID, double initBalance) // Makes account with id of initID and balance of initBalance
	{
		id = initID;
		balance = initBalance;
	}
	
	public BankAccount(String initID) // Makes account just given the string initID
	{
		id = initID;
	}
	
	
	//Methods
	public String getID() // Gets the id of current account and returns it.
	{
		return id;
	}
	
	public double getBalance() // Gets the balance of current account and returns it. 
	{
		return balance;
	}
	
	public void setID(String name) // Sets the id to what they enter.
	{
		id = name;
	}
	
	public void deposit(double depositAmount) // Checks if entered amount is positive then credits account. 
	{
		if(depositAmount >= 0)
			{
				balance += depositAmount;
			}
	}
	
	public boolean withdraw(double withdrawAmount) // If entered amount is greater than 0 and less than current balance, 
	// credits it and returns true, else returns false
	{
		
		if (withdrawAmount > 0 && withdrawAmount <= balance)
		{
			balance -= withdrawAmount;
			return true;
		}
		else
			return false;
	}
	
	public void addInterest() // Adds interest depending on account type. 
	{
		if (balance <= Assignment5.PREMIUM_MINIMUM)
			balance += balance * Assignment5.BASIC_IR;
		if (balance > Assignment5.PREMIUM_MINIMUM && balance < Assignment5.PLATINUM_MINIMUM)
			balance += balance * Assignment5.PREMIUM_IR;
		if (balance >= Assignment5.PLATINUM_MINIMUM)
			balance += balance * Assignment5.PLATINUM_IR;		
	}
	
	public boolean equals (BankAccount otherAccount) // Checks if this account equals another account.
	{
		if (otherAccount.getID().toUpperCase().equals(this.id.toUpperCase())) 
		{
			return true;
		}
		else 
			return false;
	}
	
	
	public String toString() // Prints out the id, balance, and then balance with interest.
	{	
		double balWithoutInterest = balance; // New variable to hold the balance prior to adding interest.
		addInterest(); // calls method to add interest to balance. (called here not in Assignment5). 
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // Forms nf. 
		return ("\nID: " + id + "\nBalance: " + nf.format(balWithoutInterest) + "\nInterest: " + nf.format(balance));
	}
}
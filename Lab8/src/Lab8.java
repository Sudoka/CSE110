/*---------------------------------------------------------------------------
// AUTHOR:		Jeff Scaturro
// FILENAME:	Lab8.java
// SPECIFICATION:   This program is for practicing the use classes, constructors,
//          helper methods, the this operator.
// INSTRUCTIONS:  Read the following code skeleton and add your own code
//          according to the comments.  Ask your TA or your class-
//          mates for help and/or clarification.  When you see
//          //--> that is where you need to add code.
// LAB LETTER:H
//-------------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab8
{
	public static void main(String[] args)
	{
		// Let's make two students using all two constructors
		// Write code to create a new student alice using constructor #1
		Student alice = new Student();
		

		// Write code to create a new student bob with name "Bob Brown",
		// age 23 and GPA 3.8 using constructor #2
		Student bob = new Student("Bob Brown", 23, 3.8);

		// Let's get user input to change the missing or default values
		Scanner scan = new Scanner(System.in);

		// Get user input and set Alice's full name
		System.out.print("\nEnter full name for Alice:  ");
		alice.setName(scan.nextLine());

		// Get user input and set Alice's age
		System.out.print("\nEnter age for Alice: ");
		alice.setAge(scan.nextInt());

		// Write code to get user input and set Alice's GPA
		System.out.print("\nEnter GPA for Alice: ");
		alice.setGPA(scan.nextDouble());

		// Lets print out the students details
		alice.print();
		bob.print();

		System.out.println("\r\nChanging Bob's GPA");

		// Get user input and change bob's gpa
		System.out.print("Enter new GPA for Bob: ");
		bob.setGPA(scan.nextDouble());

		// Write code to print out bob's new details
		bob.print();

		System.out.println("\r\nComparing Alice and Bob:\n");

		Student better = alice.betterGPA(bob);
		System.out.println(better.getName() + " has a better GPA.");

		// Use the olderStudent method to figure out which student is
		// older between Alice and Bob.  Then print out the result.  Follow
		// the betterGPA example above.
		Student older = alice.olderStudent(bob);
		System.out.println(older.getName() + " is older.\n");

		// Finally, print out each student's details 3 times, using the print(int n) method
		System.out.println("Alice's details: ");
		alice.print(3);
		
		//Print out Bob's. 
		System.out.println("Bob's details: ");
		bob.print(3);
	}
}

/* Questions for thought:
//  1. What is the "this" keyword used for in Java?
//  2. What is special about the header for constructors (At least two things)?
//  3. How are objects passed as parameters?"
//  4. When is a return statement required inside a method?
//  5. When is it useful to have a private method inside a class and what does
        this have to do with the concept of encapsulation?
 */
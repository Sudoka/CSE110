/*
 *  Name: Jeffrey Scaturro
 *  Title: Lab2.java
 *  Author: Jeffrey Scaturro
 *  Description: This program fulfills the requirements of Lab 2. 
 *  Time Spent: ~35 Minutes
 *  Date: 9/10/2012
 */

import java.util.Scanner;
import java.lang.Math;
/*
 * Read through the following program. It is partially filled. Read
 * the comments and fill up the code wherever you find the sign //-> or ???
 */
public class Lab2
{
  public static void main(String[] args)
  {
       /* Part 1: Take the user's name, age, 3 subject marks (out of 100)
          and calculate the average marks.
        */

       /* This helps you to scan user's input */
       Scanner scan = new Scanner(System.in);

       /* Declare a String variable to store user's name */
       String name;
       
       /* Declare an int variable to store age */
       int age;
       
       /* Declare 3 int variables to store 3 subject marks */
       int subject1;
       int subject2;
       int subject3;
       
       /* Declare a double variable to store average marks */
       double averageMarks;
       
       /* Ask user's name */
       System.out.println("Enter your name: ");
       
       /* Load user's name into the variable */
       name = scan.nextLine();
       
       /*Ask user's age*/
       System.out.println("Enter your age: ");
       
       /*Load user's age into variable*/
       age = scan.nextInt();
       
       /*Ask user's 1st subject marks*/
	   System.out.println("\nEnter your first subject mark: ");
	   
	   /*Load into variable*/
       subject1 = scan.nextInt();
       
       /* Do the same as above for other 2 subjects */
	   System.out.println("Enter your second subject mark: ");
       subject2 = scan.nextInt();
	   System.out.println("Enter your third subject mark: ");
       subject3 = scan.nextInt();

       /* Calculate the average of the 3 subject marks. Use the + and / operations */
       averageMarks = ( subject1 + subject2 + subject3) / 3;

       /* Print out the following:
          Name: xxxxxx
	      Age: xxxxxx
          Average Marks: xxxxxx
       */
       System.out.println("\nName: " + name );
       System.out.println("Age: " + age);
       System.out.println("Average Marks: " + averageMarks);

       /* Part 2: Use constants to convert miles to kilo metres */
       System.out.println("\nPart 2: Use constants to convert miles to kilometers:");
       /* Define a constant variable KM_PER_MILE and store the value in it */
       final double KM_PER_MILE = 1.60934; // 1.60934 km is 1 mile. 

       double miles = 40;
       
       /* Convert miles to kms */
       double kms = miles * KM_PER_MILE;

       /* Print out the number of kms */
       System.out.println("Number of kilometers: " + kms);

       /* Part 3: Use mathematical functions sqrt and pow to find the distance between
          points (x1,y1) and (x2,y2) using the formula sqrt((x1-x2)^2+(y1-y2)^2) */
       System.out.println("\nPart 3: Using mathematical functions sart and pow to do cool things!");
       int x1= 2;
       int y1= 5;
       int x2= 4;
       int y2= 3;
       
       double distance = Math.sqrt( Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2 ) );

       /* Print out the distance */
       System.out.println("The distance between the two points is: " + distance + ".");
  }
}
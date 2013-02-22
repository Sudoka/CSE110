//***************************************************************************************************************************************
// Name: Jeffrey Scaturro
// Title: Assignment1.java
// Author: Jeffrey Scaturro
// Description: This program contains the answers to questions a-e, and contains code to demonstrate knowledge of the print and println 
// methods, several string literals, escape sequences, the string concatenation operator for two strings, and comments. It will do this by 
// printing my first name, last name, my status, my major, and one or two sentences about myself to the screen.
// Time Spent: ~30 minutes.
// Date: 9/5/2012
//***************************************************************************************************************************************

//***************************************************************************************************************************************
// Answers to the 5 questions (a through e):
// (Compiler error is shown in quotations)
// a: "Exception in thread "main" java.lang.NoClassDefFoundError: TempConverter (wrong name: tempConverter)" This error is produced 
// because the file name is TempConverter but we named the public class tempConverter. The two must match. 
// 
// b: "String literal is not properly closed by a double-quote" This error is produced because we are not following the syntax of Java
// when we take out one of the quotation marks. We ended the string but never started it. 
//
// c: "Syntax error, insert ";" to complete Statement" Similar to letter (b), we have another syntax error in which we forgot to complete 
// the statement, or our instruction. The compiler reads the instructions one line at a time, and we never ended this line. It's just a 
// syntax error.
// 
// d: "Syntax error, insert "}" to complete ClassBody" Here we have another syntax error. Taking out one of the brackets left the class 
// uncompleted. Brackets are like parenthesis, every-time you open one, you need to close it. 
// 
// e: "fahrenheit cannot be resolved to a variable" I changed the variable in the last println method, and received that error because
// I haven't declared the new variable 'fahrenheit' previously in the code. Declaring the variable would solve this problem. 
//***************************************************************************************************************************************


public class Assignment1 
{
	public static void main(String[] args) 
	{
		
		// Printing the format I will say my name in, using the print method.
		System.out.print("This is my name, in first name, last name format: ");
		
		// Printing my first name followed by last name and using the string concatenation, as well as the println method.
		System.out.println("Jeffrey" + ", Scaturro");
		
		// Printing my status as well as my major, and will be demonstrating the use of an escape sequence.
		System.out.print("I am currently a Freshmen, and will be majoring in Computer Science. \n");
		
		// These are the one to two sentences about myself printed to the screen, which is now on a new line due to the excape sequence.
		System.out.print("I am originally from the Bay Area in Northern California. The weather up there was not like typical ");
		System.out.println("California weather because we have the cool bay breeze. I also love programming and can't wait to learn more.");
		
		// I could have broken the two sentences to display in different lines, etc, however I wasn't sure as to what screen size you'd 
		// be running the console in anyways, so I just left it to continue without changing lines. 
		
	}

}

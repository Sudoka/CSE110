/**
 * Name: Jeffrey Scaturro
 * Title: Lab1.java
 * Author: Jeffrey Scaturro
 * Description: Completing lab 1, introducing various errors and analyzing them.
 * Time Spent: ~10 minutes.
 * Date: 9/7/2012
 */
public class Lab1
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
	}
}

/*
Answers:
(a) If I delete the only semicolon, I receive a syntax error and am prompted to fix it. 
(b) If I delete the bracket, I receive another syntax error that tells me there's a bracket expected after this token.
(c) Same as letter b, however the compiler seems to not know what the error is. It says exception in thread "main" and it's
and unresolved compilation problem. 
(d) Capitalizing Main causes the program to not run, nor compile, because the main method is not found in class Lab1. Every class 
needs the main method, or we get this error. 
*/
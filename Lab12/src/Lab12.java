/*---------------------------------------------------------------------------
// AUTHOR:          Jeff Scaturro
// FILENAME:        Lab12.java
// SPECIFICATION:   This program is about using 2 dimensional arrays
// INSTRUCTIONS:    Read the following code skeleton and add your own code
//                  according to the comments.  Ask your TA or your class-
//                  mates for help and/or clarification.  When you see
//                  //--> that is where you need to add code.
// LAB LETTER: 		H
//-------------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab12 {

    /**
     * Returns an array which is the sum of the inputs A and B
     * Example sum of        1 1 1			1 2 3			2 3 4
     * 				     A = 1 1 1	+  B =  4 5 6  is  C =  5 6 7
     * 					     1 1 1			7 8 9			8 9 10
     */
    public int[][] add(int[][] a, int[][] b, int numRow, int numCol) 
    {
    	//Create a 2 dimensional array c with its numRow and numCol
    	int [][] c = new int[numRow][numCol];
        //Write for loop where index i goes from 0 to numRow
        for (int i = 0; i < numRow; i++)
        	//Write for loop where index j goes from 0 to numCol
            for (int j = 0; j < numCol; j++)
            	//Set the c[i][j] to sum of a[i][j] and b[i][j]
                c[i][j] = a[i][j] + b[i][j];
        //return c
        return c;
    }

    /**
     * Returns an array which is the difference between the inputs A and B
     * Example sum of        1 1 1			1 2 3			0 -1 -2
     * 				     A = 1 1 1	-  B =  4 5 6  is  C = -3 -4 -5
     * 					     1 1 1			7 8 9		   -6 -7 -8
     * @return 
     */
     // Fill in the name of the method <subtract> and other paramters as above
    public int[][] subtract(int[][] a, int[][] b, int numRow, int numCol) 
    {
    	//Create a 2 dimensional array c with its numRow and numCol
    	int [][] c = new int[numRow][numCol];
        //Write for loop where index i goes from 0 to numRow
        for (int i = 0; i < numRow; i++)
        	//Write for loop where index j goes from 0 to numCol
            for (int j = 0; j < numCol; j++)
            	//Set the c[i][j] to difference of a[i][j] and b[i][j]
                c[i][j] = a[i][j] - b[i][j];
        //return required variable
        return c;
    }


    /**
     * Prints the array
     */
    public String printArray(int[][] data,int numRow, int numCol) {
    	String mString = "\n\n";
    	//Write for loop where index i goes from 0 to ROWS
        for(int i = 0; i < numRow; i++)
        {
        	//Write for loop where index j goes from 0 to COLS
            for(int j = 0; j < numCol; j++)
            {	//Print the value at data[i][j] followed by a space
                mString += data[i][j]+" ";
            }
            //Print a newline after every row
            mString += "\n";
        }
        return mString+"\n";
    }

    public static void main(String[] args){

	 // Declare the scan object
	 Scanner scan= new Scanner(System.in);

	 // Declare a new Lab12 object
	 Lab12 myObject= new Lab12();

	 // Ask the user to enter the number of rows in the matrix
	 System.out.println("Enter the number of rows in your matrix: ");
	 // define a variable rows and take it as input from the user
	 int rows = scan.nextInt();
	 // Ask the user to enter the number of columns in the matrix
	 System.out.println("Enter the number of columns in your matrix: ");
	 // define a variable cols and take it as input from the user
	 int cols = scan.nextInt();

	 // create a 2 dimensional integer array called <matrix1> with the size rows and cols
	 int[][] matrix1 = new int[rows][cols];
	// create a 2 dimensional integer array called <matrix2> with the size rows and cols
	 int[][] matrix2 = new int[rows][cols];

    System.out.println("Please enter elements of first matrix ");
	// Ask the user to enter the elements of the matrix 1
	for(int nRow=0; nRow<rows; nRow++){
		System.out.println("Enter the elements of row "+ (nRow+1));
		for(int nCol=0; nCol<cols; nCol++){
			// take the input for the element at <nRow> th row and <nCol> th col of the array matrix
			matrix1[nRow][nCol]= scan.nextInt();
		}
	}
	System.out.println("Please enter elements of second matrix ");
	// Ask the user to enter the elements of the matrix 2
	// Use for loops similar to above one
	for(int nRow=0; nRow<rows; nRow++){
		System.out.println("Enter the elements of row "+ (nRow+1));
		for(int nCol=0; nCol<cols; nCol++){
			// take the input for the element at <nRow> th row and <nCol> th col of the array matrix
			matrix2[nRow][nCol]= scan.nextInt();
		}
	}
	
	// Print out first matric by calling the required method
	System.out.println(myObject.printArray(matrix1,rows,cols));

	// Print the second matrix
	System.out.println(myObject.printArray(matrix2, rows, cols));

	// Declare a new 2 dimensional integer array <sum> and assign the sum of matrix1 and matrix2 to it
	int[][] sum= myObject.add(matrix1,matrix2,rows,cols);
	// Print the sum matrix
	System.out.println(myObject.printArray(sum, rows, cols));

	// Declare a new 2 dimensional integer array <difference> and assign the difference of matrix1 and matrix2 to it
	int[][] difference= myObject.subtract(matrix1, matrix2, rows, cols);
	// Print the sum matrix
	System.out.println(myObject.printArray(difference, rows, cols));
	}

}

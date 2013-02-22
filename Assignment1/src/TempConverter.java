
public class TempConverter 
{
	// Computes the Fahrenheit equivalent of a specific Celsius
	// value using the formula F = (9/5)C + 32.
	public static void main(String[] args) 
	{
		//constant variables
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		
		//declare variables
		int celsiusTemp = 24; // value to convert (there's no input in this program)
		double fahrenheitTemp;
		
		// actual computation
		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		
		System.out.println ("Celsius Temperature: " + celsiusTemp);
		System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
	}

}

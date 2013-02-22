/*
 * This class for school courses
 */

public class Course
{

	private int currentCapacity;
	private int maxCapacity;
	private String name;
	
	//The constructor for a school course that takes a string for the
	//  course title and an int for the max capacity
	public Course(String _name, int _maxCapacity)
	{
		name = new String(_name);
		maxCapacity = _maxCapacity;
		currentCapacity = 0;
	}
	
	//Method that returns a string detailing the status of the course
	public String toString()
	{
		return (name + ": " + currentCapacity + " out of " + maxCapacity + " seats filled.");
	}
	
	//Method for adding a student to a course which returns
	// true if the student was successfully added
        // false if the course was full
	public boolean enrollStudent()
	{
		if (currentCapacity < maxCapacity)
		{
			currentCapacity++;
			return true;
		}
		else
			return false;
	}
	
	//Method for adding additional seats to a course
	public void addSeats(int seats)
	{
		if(seats > 0)
			maxCapacity += seats; 
	}
}